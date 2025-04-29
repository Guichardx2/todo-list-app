package br.edu.satc.todolistcompose.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow


//Métodos de acesso ao banco de dados
@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks")
    fun getAll(): Flow<List<TaskData>>

    @Insert
    suspend fun insert(task: TaskData)

    @Update
    suspend fun update(task: TaskData)

    @Delete
    suspend fun delete(task: TaskData)
}