package mx.edu.ittepic.ladm_u2_practica2_juegoburbujas

import android.graphics.Canvas
import android.graphics.Paint

class FiguraGeometrica() {
    var x = 0f
    var y = 0f
    var tipo = 1
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX =0
    var incY = 0


    constructor(x:Int,y:Int,radio:Int):this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio=radio.toFloat()
        this.tipo = 2

        ancho = this.radio*2
        alto= ancho

        if(radio == 200){
            incX = 2
            incY = 2
        }
        if(radio == 120){
            incX = 10
            incY = 10
        }
        if(radio == 50){
            incX = 25
            incY = 25
        }

    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
            2->{
                c.drawCircle(x+radio,y+radio,radio,p)
            }
        }
    }


    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<= -100||x>=ancho){
            incX*=-1
        }
        y+=incY
        if(y<=-100||y>=alto){
            incY*=-1
        }
    }



}