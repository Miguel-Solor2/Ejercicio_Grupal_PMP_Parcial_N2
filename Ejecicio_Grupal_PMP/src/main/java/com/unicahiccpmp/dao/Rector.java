/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicahiccpmp.dao;

/**
 *
 * @author josem
 */
public class Rector {
    /**
     * @return the _GENERO
     */
    public String getGENERO() {
        return _GENERO;
    }

    /**
     * @param _GENERO the _GENERO to set
     */
    public void setGENERO(String _GENERO) {
        this._GENERO = _GENERO;
    }

    /**
     * @return the _TELEFONO
     */
    public String getTELEFONO() {
        return _TELEFONO;
    }

    /**
     * @param _TELEFONO the _TELEFONO to set
     */
    public void setTELEFONO(String _TELEFONO) {
        this._TELEFONO = _TELEFONO;
    }

    /**
     * @return the _FCHNAC
     */
    public String getFCHNAC() {
        return _FCHNAC;
    }

    /**
     * @param _FCHNAC the _FCHNAC to set
     */
    public void setFCHNAC(String _FCHNAC) {
        this._FCHNAC = _FCHNAC;
    }

    /**
     * @return the _FFCHNAC
     */
    public String getFFCHNAC() {
        return _FFCHNAC;
    }

    /**
     * @param _FFCHNAC the _FFCHNAC to set
     */
    public void setFFCHNAC(String _FFCHNAC) {
        this._FFCHNAC = _FFCHNAC;
    }

    /**
     * @return the _IDENTIDAD
     */
    public String getIDENTIDAD() {
        return _IDENTIDAD;
    }

    /**
     * @param _IDENTIDAD the _IDENTIDAD to set
     */
    public void setIDENTIDAD(String _IDENTIDAD) {
        this._IDENTIDAD = _IDENTIDAD;
    }
     /**
     * @return the _ID
     */
    public double getID() {
        return _ID;
    }

    /**
     * @param _ID the _ID to set
     */
    public void setID(double _ID) {
        this._ID = _ID;
    }

    /**
     * @return the _NOMBRES
     */
    public String getNOMBRES() {
        return _NOMBRES;
    }

    /**
     * @param _NOMBRES the _NOMBRES to set
     */
    public void setNOMBRES(String _NOMBRES) {
        this._NOMBRES = _NOMBRES;
    }

    /**
     * @return the _APELLIDOS
     */
    public String getAPELLIDOS() {
        return _APELLIDOS;
    }

    /**
     * @param _APELLIDOS the _APELLIDOS to set
     */
    public void setAPELLIDOS(String _APELLIDOS) {
        this._APELLIDOS = _APELLIDOS;
    }

    /**
     * @return the _UNIVERSIDAD
     */
    public String getUNIVERSIDAD() {
        return _UNIVERSIDAD;
    }

    /**
     * @param _UNIVERSIDAD the _UNIVERSIDAD to set
     */
    public void setUNIVERSIDAD(String _UNIVERSIDAD) {
        this._UNIVERSIDAD = _UNIVERSIDAD;
    }
    /**
     * @return the _CORREO
     */
    public String getCORREO() {
        return _CORREO;
    }

    /**
     * @param _CORREO the _CORREO to set
     */
    public void setCORREO(String _CORREO) {
        this._CORREO = _CORREO;
    }
    
    public String getNOMBRECOMPLETO(){
        return String.format("%s %s", this._NOMBRES, this._APELLIDOS);
    }

     private double _ID;
    private String _NOMBRES;
    private String _APELLIDOS;
    private String _IDENTIDAD;
    private String _GENERO;
    private String _FFCHNAC;
    private String _UNIVERSIDAD;
    private String _TELEFONO;
    private String _FCHNAC;
    private String _CORREO;
}
