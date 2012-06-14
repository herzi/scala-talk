package music

import music.implementation.Texted

class KaraokeSong(artist: String, title: String, duration:Int, lyrics:String)
	extends Song(artist, title, duration) with Texted
{
  protected val text = lyrics
  
  override def toString = "Karaoke" + super.toString()
}