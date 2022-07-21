package dev.faith.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.faith.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
    var contact=Contact("faith","mutuafaith@gmail.com","07026354574","123 Machakos","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact1=Contact("faith","mutuafaith@gmail.com","07021234574","12345 Machakos","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact2=Contact("Amina","aminam@gmail.com","07098634574","12300 Machakos","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact3=Contact("zulu","zzulu@gmail.com","07021224574","1221 Machakos","https://media.istockphoto.com/photos/cropped-shot-of-an-attractive-young-mother-to-be-looking-while-on-picture-id1368414559?b=1&k=20&m=1368414559&s=170667a&w=0&h=k3_dj_lAabnUxp8FtVK9HxmQbTiLIB7cj7VygfhmI_Q=")
        var contact4=Contact("sulei","suleis@gmail.com","07653634574","321 Machakos","https://media.istockphoto.com/photos/profile-of-a-black-man-breathing-fresh-air-in-nature-picture-id1344781289?b=1&k=20&m=1344781289&s=170667a&w=0&h=nMpdFtCFnHiQ3HL9iY8F4RfBVBdrlyUzcPGy0cYIp_A=")
        var contact5=Contact("zulu","zzulu@gmail.com","07021224574","1221 Machakos","https://media.istockphoto.com/photos/smiling-friends-at-the-picnic-picture-id1335419818?b=1&k=20&m=1335419818&s=170667a&w=0&h=iRy_HY4rVb2kuzveNe4p8PB0L5Csr8_Og9cdgyZm2CI=")

        var contactlist= listOf(contact,contact1,contact2,contact3,contact4,contact5)

        var contactAdapter=ContactsRvAdapter(contactlist)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter



    }
}