package com.example.petshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Transaction(
    val header: String,
    val orderCode: String,
    val customerName: String,
    val product: String,
    val notes: String
)

class TransactionAdapter(private val transactionList: List<Transaction>) :
    RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvHeader: TextView = itemView.findViewById(R.id.tvTransactionHeader)
        val tvOrderCode: TextView = itemView.findViewById(R.id.tvOrderCode)
        val tvCustomerName: TextView = itemView.findViewById(R.id.tvCustomerName)
        val tvProduct: TextView = itemView.findViewById(R.id.tvProduct)
        val tvNotes: TextView = itemView.findViewById(R.id.tvNotes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_item, parent, false)
        return TransactionViewHolder(view)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.tvHeader.text = transaction.header
        holder.tvOrderCode.text = transaction.orderCode
        holder.tvCustomerName.text = transaction.customerName
        holder.tvProduct.text = transaction.product
        holder.tvNotes.text = transaction.notes
    }

    override fun getItemCount(): Int = transactionList.size
}
