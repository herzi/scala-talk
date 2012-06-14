package music.implementation

trait Durable {
  val duration: Int
  
  override def toString = "(%d)" format duration
}