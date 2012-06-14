package music.implementation

trait Texted {
  protected val text:String
  
  override def toString = super.toString() + " [" + text + "]"
}