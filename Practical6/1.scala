import scala.io.StdIn.readLine

object InventorySystem {

  // Function to get user input for an inventory
  def getInventoryFromUser(prompt: String): Map[Int, (String, Int, Double)] = {
    val numberOfProducts = readLine(s"Enter the number of products in $prompt: ").toInt
    var inventory = Map[Int, (String, Int, Double)]()

    for (itemNumber <- 1 to numberOfProducts) {
      println(s"\nEnter details of item number $itemNumber:")
      val productId = readLine("Enter product ID: ").toInt
      val productName = readLine("Enter product name: ")
      val productQuantity = readLine("Enter product quantity: ").toInt
      val productPrice = readLine("Enter product price: ").toDouble


      inventory += (productId -> (productName, productQuantity, productPrice))
    }

    inventory
  }

  def main(args: Array[String]): Unit = {
    // Get inventories from user
    val inventory1 = getInventoryFromUser("inventory1")
    val inventory2 = getInventoryFromUser("inventory2")

    // I. Retrieve all product names from inventory1.
    val productNames = inventory1.values.map(_._1)
    println(s"Product names in inventory1: ${productNames.mkString(", ")}")

    // II. Calculate the total value of all products in inventory1.
    val totalValue = inventory1.foldLeft(0.0) { case (acc, (_, (name, qty, price))) =>
      acc + (qty * price)
    }
    println(s"Total value of all products in inventory1: $$${totalValue}")

    // III. Check if inventory1 is empty.
    val isEmpty = inventory1.isEmpty
    println(s"Is inventory1 empty? $isEmpty")

    // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price.
    val mergedInventory = (inventory1.toSeq ++ inventory2.toSeq)
      .groupBy(_._1) // Group by product ID
      .map { case (productId, products) =>
        // Reduce to a single entry by combining quantities and taking the highest price
        val combined = products.map(_._2).reduce { (p1, p2) =>
          val (name, qty1, price1) = p1
          val (_, qty2, price2) = p2
          (name, qty1 + qty2, math.max(price1, price2))
        }
        productId -> combined
      }

    println(s"Merged inventory: $mergedInventory")

    // V. Check if a product with a specific ID (e.g., 102) exists and print its details.
    val productIdToCheck = 102
    inventory1.get(productIdToCheck) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID $productIdToCheck exists: Name = $name, Quantity = $quantity, Price = $$price")
      case None =>
        println(s"Product ID $productIdToCheck does not exist in inventory1.")
    }
  }
}
