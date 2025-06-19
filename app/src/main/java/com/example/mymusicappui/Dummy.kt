package com.example.mymusicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)
val libraries = listOf<Lib>(
    Lib(R.drawable.mic_svgrepo_com,"Artist"),
    Lib(R.drawable.baseline_music_note_24,"Songs"),
    Lib(R.drawable.playlist_music_svgrepo_com,"Playlist"),
    Lib(R.drawable.vinyl_record_svgrepo_com,"Album"),
    Lib(R.drawable.fighting_game_svgrepo_com,"Genre")
)
