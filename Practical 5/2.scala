object libraryManagement{
    case class Book(title: String, author: String, isbn: String)
    var Book_list = Set(
        Book("Book 1", "Author 1", "1345")
        Book("Book 2", "Author 2", "1334") 
        Book("Book 3", "Author 3", "1325"))

    def main(args: Array[String]): Unit ={
        addBook(Book("Book 4", "Author 4", "1395"))
    }
    
    def addBook(new_book: Book): Unit={
        Book_list += new_book

    }

    def removeBook(isbn: String): Unit={
        if(isbn == Book_list.isbn){
            Book_list -= Book
        }
    }



    /*def addBookDetails(title: String, author: String, isbn: String): Unit={
        val 
    }*/


}