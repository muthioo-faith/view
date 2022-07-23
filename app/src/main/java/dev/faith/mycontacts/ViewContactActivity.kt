package dev.faith.mycontacts

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.faith.mycontacts.databinding.ActivityMainBinding
import dev.faith.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name= intent.extras?.getString("NAME")
        var address=intent.extras?.getString("ADDRESS")
        var Number=intent.extras?.getString("PHONE NUMBER")
        var Email=intent.extras?.getString("EMAIL")
        var Image= binding.imgPerson
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,Number,Toast.LENGTH_LONG).show()
        Toast.makeText(this,Email,Toast.LENGTH_LONG).show()
        Toast.makeText(this,address,Toast.LENGTH_LONG).show()

        binding.tvIdentity.text=name
        binding.tvEmails.text = Email
        binding.tvNumber.text=Number
        binding.tvAdress.text = address
        Picasso.get().load(intent.getStringExtra("IMAGE")).resize(200,200).centerCrop().into(Image)



    }
}