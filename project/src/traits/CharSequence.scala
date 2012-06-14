package traits

/* http://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html
 * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */

/* equivalent to Java 1.4's java.lang.CharSequence */
trait CharSequence {
	def charAt(index: Int): Char
	def length: Int
	def subSequence(start: Int, end: Int): CharSequence
	def toString: String
}