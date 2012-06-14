package music

import java.lang.Integer
import implementation.Durable

class Song(artist: String, name: String, val duration: Int)
	extends AnyRef with Durable
{
  override def toString = "Song: " + artist + " -- " + name + super.toString()
}