package com.example.roomapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Usuario")
class UsuarioModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_usuario")
    var id_usuario: Int = 0

    @ColumnInfo(name = "nome")
    var nome: String = ""

    @ColumnInfo(name = "idade")
    var idade: Int = 0


}