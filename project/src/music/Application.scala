package music

object Application extends App {
	//*
	println(new Song("Alex Boundry",                   "Quicksilver (Club Mix)",     257))
	println(new Song("Cosmic Gate and Emma Hewitt",    "Be Your Sound (Radio Edit)", 255))
	println(new Song("David Guetta ft. Usher",         "Without You",                210))
	println(new Song("Digital Bitches feat. Headline", "Heaven (Dan J's Booty Mix)", 215))
	// */
	
	//*
	println(new KaraokeSong("Udo Jürgens",             "Vielen Dank für die Blumen", 80,
	    "Vielen Dank für die Blumen! Vielen Dank, wie lieb von Dir! Manchmal spielt das Leben mir dir gern Katz und Maus…"))
	println(new KaraokeSong("Frank Sinatra",           "My Way",                     225,
	    "And now, the End is near, and so I face the final curtain. My friend I'll say it clear, I'll state my case…"))
	// */
}
