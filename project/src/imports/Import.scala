package imports

import java.lang._
import scala._
import Predef._

//*
import fruit._
import nintendo.{Peach=>PrincessPeach,_}
import companies.{Apple=>AppleInc,Facebook,_}
// */
object Main extends App {
	println("Running")
	println(Apple.toString())
	println(AppleInc.toString())
	println(Facebook.toString())
	//println(Peach.toString())
	println("done.")
}






























/*
import java.awt.List;
import java.util.List;

object sliff {
  var e = new List()
  // => reference to List is ambiguous; it is imported twice in the same scope by import java.util.List and import java.awt.List
}
// */