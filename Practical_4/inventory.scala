object inventory{
    var item_name: Array[String] = Array("80pg Books", "160pg Books", "200pg Books", "Blue Pens", "Black pens", "Pencils")
    var no_of_items: Array[Int] = Array(20, 14, 9, 37, 29, 11)

    def displayInventory():Unit= {
        println("No.of Items \t|     Item name")
        for(i <- item_name.indices){
            println(s"${no_of_items(i)} \t\t|     ${item_name(i)}")
        }
    }

    def restock(restock_item: String, restock_ammount: Int):Unit={
        var index = item_name.indexOf(restock_item)

        if(index > -1){
            no_of_items(index) += restock_ammount
            println(s"$restock_item has been restocked!")
        }
        else
            println(s"Item $restock_item NOT FOUND!!")
    }

    def sell(sell_item: String, sell_ammount: Int):Unit={
        var index = item_name.indexOf(sell_item)

        if(index > -1){
            if(sell_ammount <= no_of_items(index)){
                no_of_items(index) -= sell_ammount
                println(s"$sell_ammount of $sell_item has sold!")
            }
            else
                println(s"$sell_item don't have enough stock!!")
        }
        else
            println(s"Item $sell_item NOT FOUND!!")
    }
    
    def main(args: Array[String]):Unit = {
        displayInventory()
        restock("Black pens",100)
        restock("Red pens",100)
        displayInventory()
        sell("80pg Books", 7)
        displayInventory()
        sell("200pg Books", 10)
        displayInventory()
    }
}
