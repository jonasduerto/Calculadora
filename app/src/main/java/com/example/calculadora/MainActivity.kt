package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    private var txtResult: TextView? = null
    private var txtSolution: TextView? = null
    internal var hist: String? = null
    internal var operator  = '+'
    internal var mostrar: String? = null
    internal var reserva: String? = null
    internal var isnumber: Boolean? = false
    internal var resultOnClick: Boolean? = false
    internal var isdecimal: Boolean? = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Define Vars
        txtResult = findViewById(R.id.visorPrincipal)
        txtSolution = findViewById(R.id.visor)
    }
    fun handleButtonUno(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('1')
            resultOnClick = false
        } else setCaracter('1')
    }
    fun handleButtonDos(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('2')
            resultOnClick = false
        } else setCaracter('2')
    }
    fun handleButtonTres(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('3')
            resultOnClick = false
        } else setCaracter('3')
    }
    fun handleButtonCuatro(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('4')
            resultOnClick = false
        } else setCaracter('4')
    }
    fun handleButtonCinco(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('5')
            resultOnClick = false
        } else setCaracter('5')
    }
    fun handleButtonSeis(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('6')
            resultOnClick = false
        } else setCaracter('6')
    }
    fun handleButtonSiete(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('7')
            resultOnClick = false
        } else setCaracter('7')
    }
    fun handleButtonOcho(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('8')
            resultOnClick = false
        } else setCaracter('8')
    }
    fun handleButtonNueve(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('9')
            resultOnClick = false
        } else setCaracter('9')
    }
    fun handleButtonZero(view: View) {
        if (this!!.resultOnClick!!) {
            txtResult!!.text = ""
            setCaracter('0')
            resultOnClick = false
        } else setCaracter('0')
    }
    fun handleButtonDecimal(view: View) {
        if (this!!.isdecimal == false!!) {
            setCaracter('.')
        }
        isdecimal = true
    }
    fun handleButtonSuma(view: View) {
        reserva = txtResult!!.text.toString()
        operator = '+'
        hist = reserva + operator
        txtResult!!.text = ""
    }
    fun handleButtonResta(view: View) {
        reserva = txtResult!!.text.toString()
        operator = '-'
        hist = reserva + operator
        txtResult!!.text = ""
    }
    fun handleButtonMultiplica(view: View) {
        reserva = txtResult!!.text.toString()
        operator = '*'
        hist = reserva + operator
        txtResult!!.text = ""
    }
    fun handleButtonDivide(view: View) {
        reserva = txtResult!!.text.toString()
        operator = '/'
        hist = reserva + operator
        txtResult!!.text = ""
    }
    fun handleButtonLimpar(view: View) {
        mostrar = ""
        reserva = ""
        txtResult!!.text = mostrar
        txtSolution!!.text = mostrar
        isdecimal = false
        resultOnClick = false
    }
    fun handleButtonPorcentaje(view: View) {
        reserva = txtResult!!.text.toString()
        operator = '%'
        hist = reserva + operator
        txtResult!!.text = ""
    }
    fun setCaracter(caracter: Char) {
        mostrar = txtResult!!.text.toString()
        mostrar = mostrar + caracter
        txtResult!!.text = mostrar
    }

    fun handleButtonResultado(view: View) {
        if (this!!.isdecimal!!) {
            val ValOne = reserva!!.toString().toFloat()
            val ValTwo = txtResult!!.text.toString().toFloat()
            if (operator =='+' ) txtResult!!.text = (ValOne + ValTwo).toString()
            if (operator =='-' ) txtResult!!.text = (ValOne - ValTwo).toString()
            if (operator =='*' ) txtResult!!.text = (ValOne * ValTwo).toString()
            if (operator =='/' ) txtResult!!.text = (ValOne / ValTwo).toString()
            hist += ValOne.toString()
            txtSolution!!.text = hist
            resultOnClick = true
        }else{
            val ValOne = reserva!!.toString().toInt()
            val ValTwo = txtResult!!.text.toString().toInt()
            if (operator =='+' ) txtResult!!.text = (ValOne + ValTwo).toString()
            if (operator =='-' ) txtResult!!.text = (ValOne - ValTwo).toString()
            if (operator =='*' ) txtResult!!.text = (ValOne * ValTwo).toString()
            if (operator =='/' ) txtResult!!.text = (ValOne / ValTwo).toString()
            hist += ValOne.toString()
            txtSolution!!.text = hist
            resultOnClick = true
        }
    }
}
