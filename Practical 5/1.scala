import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object inventory{
    var n: Int = 0
    var item_list: ListBuffer[String] = ListBuffer[String]()

    def getProductList(): Unit ={
        var new_item: String= ""
        while(new_item != "done"){
            printf("Enter the item (to finish adding type 'done'):")
            new_item= readLine()
            if(new_item != "done"){
                item_list += new_item
                n+=1
            }
        }
        println(s"$n items added!!")
    }

    def printProductList():Unit ={
        println("Items in the list:")
        for (i <- 0 to n-1) {
            println(s"${i+1} : ${item_list(i)}")
        }
    }

    def getTotalProducts(): Unit={
        /*for(i <- 0 to n-1){
            var item = item_list(i)
            for(j <- 0 to i) {
                if(item != item_list(j)){
                    var m = 0
                }

            }         
        }*/
        var m = item_list.length
        println(s"Total No.of items entered = $m")
    }



    def main(args: Array[String]): Unit ={
        getProductList()
        printProductList()
        getTotalProducts()


    }
}