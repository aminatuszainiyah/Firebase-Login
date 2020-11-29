package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val  listMahasiswa : ArrayList<data_mahasiswa>, context: Context):
RecyclerViewAdapter.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val context: Context

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val NIM : TextView
        val Nama : TextView
        val Jurusan : TextView
        val ListItem: LinearLayout

        init {
            NIM = itemView.findViewById(R.id.nim)
            Nama = itemView.findViewById(R.id.nama)
            Jurusan = itemView.findViewById(R.id.jurusan)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val V: View = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design,
        parent, false)
        return ViewHolder(V)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val NIM: String? = listMahasiswa.get(position).nim
        val Nama: String? = listMahasiswa.get(position).nama
        val Jurusan: String? = listMahasiswa.get(position).jurusan

        holder.NIM.text = "NIM: $NIM"
        holder.Nama.text = "Nama: $Nama"
        holder.Jurusan.text = "Jurusan: $Jurusan"
        holder.ListItem.setOnLongClickListener(object : View.OnLongClickListener {
            override fun View.OnLongClickListener(v: View?): Boolean {
                return true
            }

            override fun onLongClick(p0: View?): Boolean {
                TODO("Not yet implemented")
            }
        })
    }
      override fun getItemCount(): Int{
          return listMahasiswa.size
      }

    fun notifyDataSetChanged() {
        TODO("Not yet implemented")
    }

    init {
        this.context = context
    }
}