package br.edu.satc.todolistcompose.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//Estrutura do ROOM
@Entity(tableName = "tasks")
data class TaskData(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val complete: Boolean
)