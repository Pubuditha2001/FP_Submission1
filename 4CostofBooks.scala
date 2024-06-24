/*4. Suppose the cover price of a book is Rs. 24.95, but bookstores get
a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75
cents for each additional copy. What is the total wholesale cost for 60
copies?*/

object Cost{
    def main(args:Array[String]): Unit = {
        val coverprice = 24.95
        val no_of_copies = 60
        
        def discountedPrice(): Double ={
            val d_Price = coverprice*0.6*no_of_copies
            println(f"Discounted Price = $d_Price%.2f")
            d_Price
        }

        def shippingCost(): Double ={

            val shipping_cost: Double = 
                if(no_of_copies <= 50) no_of_copies*3
                else (50*3) +((no_of_copies - 50)*0.75)

            println(f"Shipping cost = $shipping_cost%.2f")
            shipping_cost
        }

        def wholesaleCost(): Unit ={
            val result = discountedPrice() + shippingCost()
            println(f"Total wholesale cost for $no_of_copies%d copies = $result%.2f")
        } 

        wholesaleCost()
    
    }
}