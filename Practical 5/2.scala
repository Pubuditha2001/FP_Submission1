import scala.io.StdIn.readLine

object question {
    case class Book(title: String, author: String, isbn: String)

    def addBook(list: List[Book], title: String, author: String, isbn: String): List[Book] = {
        val newBook = Book(title, author, isbn)
        list :+ newBook
    }

    def removeBook(list: List[Book], isbn: String): List[Book] = {
        var tempList: List[Book] = List()
        (list.isEmpty) match {
            case true => {
                println("Book '" + isbn + "' not Found")
            }
            case false => {
                (list.head.isbn == isbn) match {
                    case true => {
                        println("Book '" + isbn + "' has been removed")
                        tempList = tempList ++ list.tail
                    }
                    case false => {
                        tempList = tempList :+ list.head
                        tempList = tempList ++ removeBook(list.tail, isbn)
                    }
                }
            }
        }

        tempList
    }

    def findBook(list: List[Book], isbn: String): Unit = {
        (list.isEmpty) match {
            case true => {
                println("Book '" + isbn + "' is not Found")
            }
            case false => {
                (list.head.isbn == isbn) match {
                    case true => println("Book '" + isbn + "' is in Library")
                    case false => findBook(list.tail, isbn)
                }
            }
        }
    }

    def listBook(list: List[Book], author: String): Unit = {
        (list.isEmpty) match {
            case true => {
                println("End of List")
            }
            case false => {
                (list.head.author == author) match {
                    case true => println("ISBN : " + list.head.isbn + " | Title : " + list.head.title)
                    case false => 
                }
                listBook(list.tail, author)
            }
        }
    }


    def printList(list: List[Book]): Unit = {
        (list.isEmpty) match {
            case true => 
            case false => {
                println("ISBN : " + list.head.isbn + " | Title : " + list.head.title + " | Author : " + list.head.author)
                printList(list.tail)
            }
        }
    }

    def main(args: Array[String]): Unit = {
        var libraryList: List[Book] = List();
        libraryList = addBook(libraryList, "Book 1", "Author 1", "978-001");
        libraryList = addBook(libraryList, "Book 2", "Author 2", "978-002");
        libraryList = addBook(libraryList, "Book 3", "Author 3", "978-003");


        println("---LIBRARY LIST---");
        printList(libraryList);
        println("");

        findBook(libraryList, "978-002");
        libraryList = removeBook(libraryList, "978-002");

        println("---LIBRARY LIST---");
        printList(libraryList);
        println("");

        findBook(libraryList, "978-002");
        println("---LIBRARY LIST---");
        printList(libraryList);
        println("");

        var author: String = "Author 3";
        println("---Listing Books By '" + author + "'---");
        listBook(libraryList, author);
        println("");
    }
}
