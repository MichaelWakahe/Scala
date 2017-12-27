// Objects representing rational numbers

/** First class example */
class Rational(n: Int, d: Int)


/**
  * Second class example that demonstrates:
  * - reimplementing the toString method
  */
class Rational2(n: Int, d: Int) {
  override def toString = n + "/" + d
}

val x = new Rational2(1, 3)


/**
  * Third class example that demonstrates:
  * - checking preconditions
  * - self references
  * - auxiliary constructors
  */
class Rational3(n: Int, d: Int) {
  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  // In Scala, every auxiliary constructor must invoke another constructor
  // of the same class as its first action.
  // In other words, the first statement in every auxiliary constructor in every
  // Scala class will have the form "this(...)".
  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = numer + "/" + denom

  def add(that: Rational3): Rational3 =
    new Rational3(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )


  def lessThan(that: Rational3) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational3) =
    if (this.lessThan(that)) that else this
}

val oneHalf = new Rational3(1, 2)
val twoThirds = new Rational3(2, 3)
oneHalf add twoThirds

val y = new Rational3(3)


/**
  * Fourth class example that demonstrates:
  * - private fields and methods
  */
class Rational4(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def add(that: Rational4): Rational4 =
    new Rational4(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
