package org.evolvedigital.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.evolvedigital.affirmations.adapter.ItemAdapter
import org.evolvedigital.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Initialize data.
        val myDataSet = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

//      Use this setting to improve performance if you know that changes in
//      content do not change the layout size of RecyclerView
        recyclerView.setHasFixedSize(true)

//      Setting the layout manager
        val layoutManger = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManger
    }
}