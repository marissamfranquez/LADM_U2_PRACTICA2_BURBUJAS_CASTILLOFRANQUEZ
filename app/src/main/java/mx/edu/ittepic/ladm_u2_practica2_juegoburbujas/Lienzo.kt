package mx.edu.ittepic.ladm_u2_practica2_juegoburbujas

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity): View(p){
    var puntero=p
    var circulo = FiguraGeometrica(10,1200,120)
    var circulo2 = FiguraGeometrica(1,200,120)
    var circulo3 = FiguraGeometrica(500,500,50)
    var circulo4 = FiguraGeometrica(120,900,50)
    var circulo5 = FiguraGeometrica(1000,1000,200)
    var circulo6 = FiguraGeometrica(900,83,200)
    var punteroFiguraGeometrica : FiguraGeometrica?=null


    override fun onDraw(c: Canvas){

        super.onDraw(c)
        var paint = Paint()


        c.drawColor(Color.BLACK)

        paint.color = Color.CYAN
        circulo.pintar(c,paint)

        paint.color = Color.BLUE
        circulo2.pintar(c,paint)

        paint.color = Color.GREEN
        circulo3.pintar(c,paint)

        paint.color = Color.MAGENTA
        circulo4.pintar(c,paint)

        paint.color = Color.WHITE
        circulo5.pintar(c,paint)

        paint.color = Color.YELLOW
        circulo6.pintar(c,paint)





    }

    fun animarCirculo(){
        circulo2.rebote(width,height)
        circulo.rebote(width,height)
        circulo3.rebote(width,height)
        circulo4.rebote(width,height)
        circulo5.rebote(width,height)
        circulo6.rebote(width,height)
        invalidate()
    }
}