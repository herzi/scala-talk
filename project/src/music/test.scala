trait Aaaah {
  def m = println("Hello World!")
}

trait Beeeh {
  def m = println("Hallo Welt!")
}
/*
object Zeh extends Aaaah with Beeeh {
  override def m = ((Beeeh)this).m
}

object Sliff extends App {
	Zeh.Aaaah.m
}
// */