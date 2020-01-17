package com.example.mycartrecyclker.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycartrecyclker.Model.MycartDataclass
import com.example.mycartrecyclker.R

class MycartViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    var name = itemview.findViewById<TextView>(R.id.txt_name)
    var price = itemview.findViewById<TextView>(R.id.txt_price)
    var imgae = itemview.findViewById<ImageView>(R.id.image_item)
    var count = itemview.findViewById<TextView>(R.id.txt_count)
    var btnsub = itemview.findViewById<Button>(R.id.btn_sub)
    var btnsum = itemview.findViewById<Button>(R.id.btn_sum)
}

class MycartAdapter(var mycartlist: ArrayList<MycartDataclass>) :
    RecyclerView.Adapter<MycartViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MycartViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.mycardrecyclerview, parent, false)
        return MycartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mycartlist.size
    }

    override fun onBindViewHolder(holder: MycartViewHolder, position: Int) {

        holder.name.text = mycartlist[position].name
        holder.price.text = mycartlist[position].price.toString()
        holder.count.text = mycartlist[position].count.toString()
        holder.imgae.setImageResource(mycartlist[position].image)

        holder.btnsub.setOnClickListener()
        {
            var count: Int = holder.count.text.toString().toInt()
            count--
            holder.count.text = count.toString()
        }

        holder.btnsum.setOnClickListener()
        {
            var count: Int = holder.count.text.toString().toInt()
            count++
            holder.count.text = count.toString()
        }
    }

}