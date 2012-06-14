package traits

import scala.math.Ordered

class Rational(n:Int, d:Int) extends Ordered[Rational] {
	private[Rational] val denominator = d
	val numerator = n
	
	require(denominator > 0)
	
	/**
	 * result < 0 iff this < that
	 * result = 0 iff this == that
	 * result > 0 iff this > that
	 */
	def compare(that: Rational):Int = {
	  
			this.numerator * that.denominator -
				that.numerator * this.denominator
			
	}
	
	def ==(that: Rational) = !(this < that) && !(that < this)
	
	override def toString = numerator + "/" + denominator
}