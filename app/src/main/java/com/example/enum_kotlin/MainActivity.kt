package com.example.enum_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nv = NhanVien.AGE
        Log.d("bbb",nv.name)
        Log.d("bbb",nv.Transfrom())
        for (i in NhanVien.values()){
            Log.d("bbb",i.toString())
        }
    }
}
enum class NhanVien(var value:Int=0){
    AGE(10) {
        override fun Transfrom(): String {
            return "55512321312321312"
        }

        override fun toString(): String {
            return "123"
        }
    },
    NAME {
        override fun Transfrom(): String {
            TODO("Not yet implemented")
        }
    },
    JOB {
        override fun Transfrom(): String {
            TODO("Not yet implemented")
        }
    };
    abstract fun Transfrom(): String
}
