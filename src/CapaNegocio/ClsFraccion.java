/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author HP
 */
public class ClsFraccion {

    private int _num;
    private int _den;

    //constructores
    public ClsFraccion(int num, int den) {
        _num = num;
        _den = den;
    }

    public ClsFraccion() {
        _num = 0;
        _den = 1;
    }
    //getters y setters

    public ClsFraccion(ClsFraccion Dos) {
        _num=Dos._num;
        _den=Dos._den;
    }

    public int num() {
        return _num;
    }

    public void num(int num) {
        _num = num;
    }

    public int den() {
        return _den;
    }

    public void den(int den) {
        _den = den;
    }

    //metodos
    public ClsFraccion suma(ClsFraccion Dos) {
        ClsFraccion respuesta;
        respuesta = new ClsFraccion();
        respuesta.den(_den * Dos._den);
        respuesta.num((respuesta._den / _den * _num) + (respuesta._den / Dos._den * Dos._num));
        return respuesta;
    }
    public ClsFraccion resta(ClsFraccion Dos) {
        ClsFraccion respuesta;
        respuesta = new ClsFraccion();
        respuesta.den(_den * Dos._den);
        respuesta.num((respuesta._den / _den * _num) - (respuesta._den / Dos._den * Dos._num));
        return respuesta;
    }
    public ClsFraccion multiplicacion(ClsFraccion Dos) {
        ClsFraccion respuesta;
        respuesta = new ClsFraccion();
        respuesta.num(_num * Dos._num);
        respuesta.den(_den * Dos._den);
        return respuesta;
    }
    public ClsFraccion division(ClsFraccion Dos) {
        ClsFraccion respuesta;
        respuesta = new ClsFraccion();
        respuesta.num(_num * Dos._den);
        respuesta.den(_den * Dos._num);
        return respuesta;
    }
    public ClsFraccion inversa(){
        ClsFraccion respuesta;
        respuesta = new ClsFraccion();
        respuesta.num(_den);
        respuesta.den(_num);
        return respuesta;
    }
    public int mcd(){
        int u=Math.abs(_num);
        int v=Math.abs(_den);
        if(v==0){
             return u;
        }
        int r;
        while(v!=0){
             r=u%v;
             u=v;
             v=r;
        }
        return u;
  }
    public String ver() {
        String resp;
        //simplificacion
        int dividir=mcd();
        _num=_num/dividir;
        _den=_den/dividir;
        //fraccion mixta
        if (_den==0) {
            resp="indeterminacion";
        }else{
            if(_num>_den){
                resp = _num / _den + "  " + _num % _den + "/" + _den;
            }else{
                if(_num ==_den){
                    resp= "1";
                }else{
                    resp=_num + "/" + _den;
                }
            }
        }
        return resp;
    }
}
