package com.example.mycartrecyclker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mycartrecyclker.Adapter.MycartAdapter
import com.example.mycartrecyclker.Model.MycartDataclass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclershow()

    }

    fun recyclershow()
    {
        var mycartRecyclerView: RecyclerView =findViewById(R.id.recyclerview)

        var mycartlist=ArrayList<MycartDataclass>()
        mycartlist.add(MycartDataclass(R.drawable.whey,"Whey Protain",80.00,2))
        mycartlist.add(MycartDataclass(R.drawable.peanuts,"Peanuts ",100.00,5))
        mycartlist.add(MycartDataclass(R.drawable.finegrainsugar,"Fine Grain Suger",60.24,6))
        mycartlist.add(MycartDataclass(R.drawable.whey,"Whey Protain",80.00,2))
        mycartlist.add(MycartDataclass(R.drawable.peanuts,"Peanuts ",100.00,5))
        mycartlist.add(MycartDataclass(R.drawable.finegrainsugar,"Fine Grain Suger",60.24,6))
        mycartlist.add(MycartDataclass(R.drawable.whey,"Whey Protain",80.00,2))
        mycartlist.add(MycartDataclass(R.drawable.peanuts,"Peanuts ",100.00,5))
        mycartlist.add(MycartDataclass(R.drawable.finegrainsugar,"Fine Grain Suger",60.24,6))

        var mycartadapter=MycartAdapter(mycartlist)

        mycartRecyclerView.layoutManager= LinearLayoutManager(this)

        mycartRecyclerView.adapter=mycartadapter
    }
}
