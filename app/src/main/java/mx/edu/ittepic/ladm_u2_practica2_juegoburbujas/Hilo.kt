package mx.edu.ittepic.ladm_u2_practica2_juegoburbujas

class Hilo(p: MainActivity): Thread(){
    var puntero = p
    override fun run(){
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCirculo()
            }
        }
    }
}