package com.metrolist.innertubex.extraction

public enum class AudioQuality {
    AUTO,
    LOW,
    HIGH,

    /**
     * Opt-in lossless preference: selects FLAC/ALAC streams when the client
     * response contains them (premium accounts / capable clients) and degrades
     * to the best available lossy stream otherwise. Selection never hard-fails
     * when lossless is absent.
     */
    LOSSLESS,
}
