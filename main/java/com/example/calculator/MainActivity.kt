package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

/*Colores
 Botones simples"#4F4761"
 Botones Especiales "#B13333"
 Fondo "#283A45"
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operations()


    }

    fun operations(){
        //UI Text
        val textBig = findViewById<TextView>(R.id.textBig)
        val textSmall = findViewById<TextView>(R.id.textSmall)
        //UI Buttons
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button0)
        val buttonC = findViewById<Button>(R.id.buttonC)
        val buttonModule = findViewById<Button>(R.id.buttonModule)
        val buttonDivision = findViewById<Button>(R.id.buttonDivision)
        val buttonMult = findViewById<Button>(R.id.buttonMult)
        val buttonSubs = findViewById<Button>(R.id.buttonSubs)
        val buttonAddi = findViewById<Button>(R.id.butonAddi)
        val buttonDelete = findViewById<ImageButton>(R.id.buttonDelete)
        val buttonEquals = findViewById<Button>(R.id.buttonEquaal)
        val buttonHistor = findViewById<ImageButton>(R.id.buttonHistory)
        val buttonPointt = findViewById<Button>(R.id.ButtonPointt)

        var numbersStock:String = ""

        var numbersTwo:String = ""
        // Cambio string a float
        //var textBigTexts: Float = numbersStock.toFloat()
        //var textSmallTexts: Float = numbersTwo.toFloat()
        //button fuctions
        button1.setOnClickListener(){numbersStock = numbersStock + "1" }
        button2.setOnClickListener(){numbersStock = numbersStock + "2" }
        button3.setOnClickListener(){numbersStock = numbersStock + "3" }
        button4.setOnClickListener(){numbersStock = numbersStock + "4" }
        button5.setOnClickListener(){numbersStock = numbersStock + "5" }
        button6.setOnClickListener(){numbersStock = numbersStock + "6" }
        button7.setOnClickListener(){numbersStock = numbersStock + "7"}
        button8.setOnClickListener(){numbersStock = numbersStock + "8" }
        button9.setOnClickListener(){numbersStock = numbersStock + "9" }
        button0.setOnClickListener(){numbersStock = numbersStock + "0"
        println(numbersStock)}


        //Fun to buttonDelete
        buttonDelete.setOnClickListener(){numbersStock.replaceFirst(".$".toRegex(),  "") }


        //Operators
        buttonAddi.setOnClickListener(){}


        textBig.text = "numbersStock"
    }
}