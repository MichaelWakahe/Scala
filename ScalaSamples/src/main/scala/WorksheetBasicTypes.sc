// decimal (base 10)
val dec1 = 31

// Long integer literal
val prog = 0XCAFEBABEL

// Short and Byte examples
val little: Short = 367
val littler: Byte = 38

// hexadecimal (base 16)
val hex = 0x5
val hex2 = 0x00FF
val magic = 0xcafebabe

// Floating point examples
// If a floating-point literal ends in an F or f, it is a Float;
// otherwise it is a Double.
// Optionally, a Double floating-point literal can end in D or d.
val big = 1.2345
val bigger = 1.2345e1
val biggerStill = 123E4
val littleF = 1.2345F
val littleBiggerF = 3e5f


// Character literals are composed of any Unicode character
// between single quotes
val a = 'A'

// In addition to providing an explicit character between the
// single quotes, you can identify a character using its Unicode
// code point. To do so, write \u followed by four hex digits
// with the code point, like this:
val d = '\u0041'
val f = '\u0044'

// In fact, such Unicode characters can appear anywhere in a
// Scala program. For instance you could also write an
// identifier like this:
//val B\u0041\u0044 = 1


// Special character literal escape sequences
// \n line feed (\u000A)
// \b backspace (\u0008)
// \t tab (\u0009)
// \f form feed (\u000C)
// \r carriage return (\u000D)
// \" double quote (\u0022)
// \' single quote (\u0027)
// \\ backslash (\u005C)
val backslash = '\\'


// String literals
val hello = "hello"

// Raw strings
println("""Welcome to Ultamix 3000.
Type "HELP" for help.""")

println("""|Welcome to Ultamix 3000.
           |Type "HELP" for help.""".stripMargin)


// The Boolean type has two literals, true and false:
val bool = true
val fool = false


// Scala includes a flexible mechanism for string interpolation,
// which allows you to embed expressions within string literals.
val name = "reader"
println(s"Hello, $name!")

s"The answer is ${6 * 7}."

// The raw string interpolator behaves like s, except it does
// not recognize character literal escape sequences
println(raw"No\\\\escape!")


// The f string interpolator allows you to attach printf-style
// formatting instructions to embedded expressions. You place
// the instructions after the expression, starting with a percent
// sign (%), using the syntax specified by java.util.Formatter.
f"$pi is approximately ${math.Pi}%.5f."


// Operators are methods
val sum = 1 + 2
val sumMore = 1.+(2)


// In contrast to the infix operator notation—in which operators
// take two operands, one to the left and the other to the
// right—prefix and postfix operators are unary: they take just
// one operand.
-2.0 // prefix notation
7L // postfix notation

// The only identifiers that can be used as prefix operators are
// +, -, !, and ~.


// The && and || operations short-circuit as in Java:
// expressions built from these operators are only evaluated as
// far as needed to determine the result.
// If you want to evaluate the right hand side no matter what,
// use & and | instead.