interface FormatoAudio{
    fun play()
    fun stop()
    fun pause()
}

class MP3Player: FormatoAudio {
    override fun play() {
        println("Reproduzindo MP3...")
    }

    override fun stop() {
        println("Reprodução MP3 parada.")
    }

    override fun pause() {
        println("Reprodução MP3 pausada.")
    }
}

class WAVPlayer: FormatoAudio {
    override fun play() {
        println("Reproduzindo WAV...")
    }

    override fun stop() {
        println("Reprodução WAV parada.")
    }

    override fun pause() {
        println("Reprodução WAV pausada.")
    }
}

fun main() {
    val mp3 = MP3Player()
    val wav = WAVPlayer()

    mp3.play()
    mp3.pause()
    wav.play()
    wav.pause()
    wav.stop()
    mp3.play()
    mp3.stop()
}