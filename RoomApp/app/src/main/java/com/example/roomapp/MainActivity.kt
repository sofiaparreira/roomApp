package com.example.roomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomapp.model.UsuarioModel
import com.example.roomapp.repository.UsuarioDataBase
import android.util.Log
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuarioDatabase = UsuarioDataBase.getDataBase(this).usuarioDAO()

        val retornoInsert = usuarioDatabase.insertUser(UsuarioModel().apply {
            //this.id_usuario = 1
            this.nome = "Sofia Passos"
            this.idade = 17
        })
        val retornoInsert2 = usuarioDatabase.insertUser(UsuarioModel().apply {
            //this.id_usuario = 2
            this.nome = "Pedro"
            this.idade = 17
        })
        val retornoInsert3 = usuarioDatabase.insertUser(UsuarioModel().apply {
            //this.id_usuario = 3
            this.nome = "João"
            this.idade = 17
        })

        val retornoUpdate = usuarioDatabase.updateUser(UsuarioModel().apply {
            //this.id_usuario = 1
            this.nome = "João "
            this.idade = 20
        })
        usuarioDatabase.deleteUser(UsuarioModel().apply {
            this.id_usuario = 2
        })



        val retornoSelectMultiplo = usuarioDatabase.getAll()
        for(item in retornoSelectMultiplo){
            Log.d("Retorno Múltiplo", "id_usuario: ${item.id_usuario}, nome: ${item.nome}, idade: ${item.idade}")
        }
    }
}