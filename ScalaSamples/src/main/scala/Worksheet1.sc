"Hello World"

val x = 1

def increase(i: Int) = i + 1

increase(x)

val y = 2 + 3

import java.math.BigInteger
def factorial(x: BigInteger): BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factorial(x.subtract(BigInteger.ONE)))

val aBigInt = BigInteger.valueOf(20)
val fact = factorial(aBigInt)



//val xs = 1 to 3
//val it = xs.iterator
//eventually { it.next() shouldBe 3 }

val name = "Michael"
val nameHasUpperCase = name.exists(_.isUpper)


import java.util.HashMap
val hash: HashMap[Int, String] = new HashMap[Int, String]()
// can be alternatively written as:
val hash2 = new HashMap[Int, String]()


/*
Tuple example
These _N numbers are one-based, instead of zero-based, because starting with 1 is
a tradition set by other languages with statically typed tuples, such as Haskell
and ML.
*/
val pair = (99, "Luftballons")
println(pair._1)
println(pair._2)



val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
for (i <- 0 to 2)
  print(greetStrings(i))


/* Set
* Here the immutable version of Set is used by default
*
* If you want to use the mutable version, use the following:
* import scala.collection.mutable
* */
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"  // or jetSet = jetSet + "Lear"
println(jetSet.contains("Cessna"))


// if you need an immutable HashSet, you could do this:
import scala.collection.immutable.HashSet
val hashSet = HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")


// As with sets, Scala provides mutable and immutable versions of Map,
// using a class hierarchy.
import scala.collection.mutable
val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))


// If you prefer an immutable map, no import is necessary, as immutable is the
// default map. An example is shown in Listing 3.8:
val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral(4))