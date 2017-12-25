/*****  List Examples *****/

val strList = List("My", "name", "is", "Michael")
val strList2 = List("My", "name", "is", "Esther")
val strList3 = strList ::: strList2
val strList4 = "Test" :: strList

// Executes the print statement on each of the strings in the strList
strList.foreach(str => print(str))

//Returns the element at index 2 (zero based) of the strList
println(strList(2))

// Indicates whether the strList list is empty
strList.isEmpty

// Returns the number of elements in the strList
strList.length

// Counts the number of string elements in strList that have length 4
strList.count(s => s.length == 4)

// Returns the strList without its first 2 elements
strList.drop(2)

// Returns the thrill list without its rightmost 2 elements
strList.dropRight(2)

// Determines whether a string element exists in strList that has the value "name"
strList.exists(s => s == "name" )

// Returns a list of all elements, in order, of the strList that have length 4
strList.filter(s => s.length == 4)

// Returns a list of all elements, in order, of the strList except those that have length 4
strList.filterNot(s => s.length == 4)

// Indicates whether all elements in the strList end with the letter "l"
strList.forall(s => s.endsWith("l"))

// Returns the first element in the strList
strList.head

// Returns the strList minus its first element
strList.tail

// Returns the last element in the strList
strList.last

// Returns a list of all but the last element in the strList
strList.init

// Returns a list resulting from adding a "y" to each string element in the strList
strList.map(s => s + "y")

// Makes a string with the elements of the list
strList.mkString(", ")

// Returns a list containing all elements of the strList in reverse order
strList.reverse

// Returns a list containing all elements of the strList in alphabetical order of
// the first character lowercased
//strList.sort((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)


// Compare lists
List(1, 2, 3) == List(1, 2, 3)
List(1, 2, 3) == "hello"
List(1, 2, 3) == null
null == List(1, 2)

/***** End List Examples *****/