package com.example.filmesjson

data class Filme(val id:Int, var nome:String, var categoria:String) {
    override fun toString(): String {
        return "Filme(id=$id, nome='$nome', categoria='$categoria')"
    }
}