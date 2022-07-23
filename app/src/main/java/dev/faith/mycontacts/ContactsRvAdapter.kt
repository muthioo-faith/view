package dev.faith.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.faith.mycontacts.databinding.ContactListItemBinding

class ContactsRvAdapter(var contactsList: List<Contact>) :RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
          return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactsList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvPhone.text=currentContact.phoneNumber
        holder.binding.tvEmail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.ivContact)
        val context =holder.itemView.context
        holder.binding.ivContact.setOnClickListener{
            Toast
                .makeText(context,"You have clicked te image",Toast.LENGTH_SHORT)
                .show()
        }
        holder.binding.cvContacts.setOnClickListener{
            val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("PHONE NUMBER",currentContact.phoneNumber)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
            holder.binding.ivContact.setOnClickListener {
                Toast.makeText(context,"you have clicked on my face",Toast.LENGTH_LONG)
                    .show()
            }

        }



    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactViewHolder(val binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root){



}