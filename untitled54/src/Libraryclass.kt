import java.util.*


class LibraryClass : Library {


        data class LibraryClass(var name: String, var price: Int, var year: Int, var category:BookCategory) {
            fun show() {

                println("Name $name")
                println("Price $price")
                println("Year $year")
                println("Category $category")
                println("=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=")
            }
        }


        private var scanner = Scanner(System.`in`)
        private var list = arrayOfNulls<LibraryClass>(100)

        var count = 0


        override fun add() {

            print("Name:")
            val name = scanner.next()
            print("Price:")
            val price = scanner.nextInt()
            print("Year:")
            val year = scanner.nextInt()
            println("     Choose Category")
            println("1]-> ${BookCategory.Detektiv}")
            println("2]-> ${BookCategory.Komediya}")
            println("3]-> ${BookCategory.Fantastik}")
            val category=scanner.nextInt()
            when(category){
                1->{
                    val libraryClass = LibraryClass(name, price, year,BookCategory.Detektiv)
                    list[count] = libraryClass
                    count++
                    println("Success :)")
                }
                2->{
                    val libraryClass = LibraryClass(name, price, year,BookCategory.Komediya)
                    list[count] = libraryClass
                    count++
                    println("Success :)")
                }
                3->{
                    val libraryClass = LibraryClass(name, price, year,BookCategory.Fantastik)
                    list[count] = libraryClass
                    count++
                    println("Success :)")
                }
            }



        }

        override fun list() {
            try {


                for (i in 0..count) {
                    println(list[i]!!.show())
                }
            }catch (e:Exception){
                println()
            }

        }

        override fun search() {
            try {


                print("Enter name ")
                val name = scanner.next()
                val book: LibraryClass? = list.find { it!!.name == name }
                println(book)
            }catch (e:Exception){
                println("Not found :(")
            }
        }


        override fun remove() {
            print("Name:")
            val name = scanner.next()
            print("Price:")
            val price = scanner.nextInt()
            print("Year:")
            val year = scanner.nextInt()
            println("     Choose Category")
            println("1]-> ${BookCategory.Detektiv}")
            println("2]-> ${BookCategory.Komediya}")
            println("3]-> ${BookCategory.Fantastik}")
            val  category=scanner.nextInt()
            when(category){
                1->{
                    val libraryClass = LibraryClass(name, price, year,BookCategory.Detektiv )
                    list[count] = libraryClass
                    count--
                    list[count--]
                }
                2->{
                    val libraryClass = LibraryClass(name, price, year,BookCategory.Komediya )
                    list[count] = libraryClass
                    count--
                    list[count--]
                }
                3->{
                    val libraryClass = LibraryClass(name, price, year,BookCategory.Fantastik )
                    list[count] = libraryClass
                    count--
                    list[count--]
                }
            }



        }
    }
