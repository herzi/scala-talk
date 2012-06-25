package traits

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Suite

/* Run on the command line like this:
 * scala -cp ../lib/scalatest_2.9.2-1.8.jar org.scalatest.tools.Runner -s traits.RationalSuite
 */

class RationalSuite extends Suite {
	val half = new Rational(1,2);
	val third = new Rational(1,3);
	
	def testToString {
		assert(half.toString() == "1/2")
		// => org.scalatest.exceptions.TestFailedException was thrown.
		
		assert(half.toString() == "1/2", "One half did not equal '1/2': " + half.toString())
		// => One half did not equal '1/2': traits.Rational@31bca1c3
		
		assert(half.toString === "1/2")
		// => "[traits.Rational@11396ef7]" did not equal "[1/2]"
		
		expect("1/2") {half.toString()}
		// => Expected "[1/2]", but got "[traits.Rational@763f1179]"
	}
	
	def testCatch {
		intercept[IllegalArgumentException] {
			val f = new Rational(0, 0)
		}
	}
	
	def testCompare {
		assert(half > third, half + " is not larger than " + third);
		
		expect(true) {
			half > third
		}
	}
}

/* Run on the command line like this:
 * scala -cp ../lib/scalatest_2.9.2-1.8.jar org.scalatest.tools.Runner -s traits.RationalSpec
 */

/*class RationalSpec extends FlatSpec with ShouldMatchers {
  "A rational number"
}*/
