package com.example.todo_aleee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_aleee.adapter.TarefaAdapter
import com.example.todo_aleee.module.Tarefa

class listFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val listTarefas = mutableListOf(
            Tarefa(
                "Limpar a Casa",
                "Iniciar na parte da manhã",
                "Ale",
                "2022-19-02",
                true,
                "Dia a Dia"
            ),
            Tarefa(
                "Cuidar dos gatos",
                "Tarde",
                "Ale",
                "2022-05-10",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Estudar",
                "Noite",
                "Ale",
                "2022-24-05",
                false,
                "Estudo"
            )
        )


        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        val adapter = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        recyclerTarefa.adapter = adapter

        recyclerTarefa.setHasFixedSize(true)

        adapter.setLista(listTarefas)


        return view
    }

}