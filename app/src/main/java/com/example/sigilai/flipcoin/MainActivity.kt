package com.example.sigilai.flipcoin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var number1: Int = 0
    var number2: Int = 0
    var numberArray = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = 0
        number2 = 0

        numberArray = arrayListOf(0,1,2,3)

    }


    fun heads(view: View){

        val random = Random()
        val index = random.nextInt(2 - 0)

        var a = numberArray[index]

        if ( a == 0) {

            number1 += a

            play1.text = "Score: $number1"
            sideView.text = "HEAD"

        }

        else if (a == 1){

            number2 += a

            play2.text = "Score:$number2"
            sideView.text = "TAILS"

        }





    }

    fun tails(view: View){

        val random = Random()
        val index = random.nextInt(2 - 0)

        var b = numberArray[index]

        if ( b == 0) {

            number2 += b

            play2.text = "Score: $number2"
            sideView.text = "HEAD"

        }

        else if (b == 1){

            number1 += b

            play1.text = "Score:$number1"
            sideView.text = "TAILS"

        }





    }



}
