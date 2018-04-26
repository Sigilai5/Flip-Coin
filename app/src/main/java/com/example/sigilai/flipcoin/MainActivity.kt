package com.example.sigilai.flipcoin

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast
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

        sider.text = "Num: $a"

        if ( a == 1) {

            number1 += a

            play1.text = "Score: $number1"
           


            val alert = AlertDialog.Builder(this)
            alert.setTitle("NEXT")
            alert.setMessage("Next Player")
            alert.setPositiveButton("Okay"){ dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext,"Flip", Toast.LENGTH_LONG).show() }
            alert.show()



        }

        else if (a == 0){

            number2 += 1

            play2.text = "Score:$number2"



            val alert = AlertDialog.Builder(this)
            alert.setTitle("NEXT")
            alert.setMessage("Next Player")
            alert.setPositiveButton("Okay"){ dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext,"Flip", Toast.LENGTH_LONG).show() }
            alert.show()



        }





    }

    fun tails(view: View){

        val random = Random()
        val index = random.nextInt(2 - 0)

        var a = numberArray[index]

        sider.text = "Num: $a"

        if ( a == 1) {

            number1 += a

            play1.text = "Score: $number1"



            val alert = AlertDialog.Builder(this)
            alert.setTitle("NEXT")
            alert.setMessage("Next Player")
            alert.setPositiveButton("Okay"){ dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext,"Flip", Toast.LENGTH_LONG).show() }
            alert.show()



        }

        else if (a == 0){

            number2 += 1

            play2.text = "Score:$number2"



            val alert = AlertDialog.Builder(this)
            alert.setTitle("NEXT")
            alert.setMessage("Next Player")
            alert.setPositiveButton("Okay"){ dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext,"Flip", Toast.LENGTH_LONG).show() }
            alert.show()



        }




    }

    fun startBtn(view: View){

        number1*=0
        number2*=0

        play1.text = "Score: $number1"
        play2.text = "Score: $number2"
    }



}
