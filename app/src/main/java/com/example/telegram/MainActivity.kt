package com.example.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telegram.R.drawable.*
import com.example.telegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var profile = arrayOf(pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9,pro10,pro11,pro12,pro13,pro14,pro15)

    var name = arrayOf("Krishna","Myank","Kuldip","Kimmy","Dikshita","Prince","Nilu","Umang","Hiren","Priyanshi","Milan","Hiren","Bhargav","Dhruv","Rashmika","Yash")

    var msg = arrayOf("Good Morning Sir","Hello Bro","Call You Back","Nice ","OK No Problen","Welcome","I Have Meet You","Answer plese","Hello ","Good Night","Hello Sir","Nice photo","Sorry Bro","Call Acsept","Good night Sir")

    var time = arrayOf("7:01 AM","8:52 PM","1:03 AM","5:36 PM","4:59 AM","3:25 PM","11:39 PM","9:36 PM","12:58 AM","11:59 PM","5:47 AM","2:20 PM","12:10 AM","5:33 AM","9:58 PM")

    var arrayList  = ArrayList<Chatdata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        for (i in 0..profile.size-1){
            var data = Chatdata(profile.get(i),name.get(i),msg.get(i),time.get(i))
            arrayList.add(data)
        }

        binding.lists.layoutManager = LinearLayoutManager(applicationContext)
        binding.lists.adapter = Chatadapter(arrayList)
    }
}