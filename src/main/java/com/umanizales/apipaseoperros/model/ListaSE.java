/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umanizales.apipaseoperros.model;

import java.io.Serializable;

/**
 *
 * @author AndresO
 */
public class ListaSE implements Serializable 
{
    private Nodo cabeza;
    private int cont;

    public ListaSE() 
    {
        this.cont = 0;
    }

    public Nodo getCabeza() 
    {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) 
    {
        this.cabeza = cabeza;
    }

    public void adicionarNodo(Object dato) throws listase.modelo.excepcion.ListaSEExcepcion 
    {
        if (cabeza == null) 
        {
            cabeza = new Nodo(dato);
        } 
        else 
        {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp.setSiguiente(temp.getSiguiente());
            }//Estoy parado en el ultimo nodo
            temp.setSiguiente(new Nodo(dato));
            cont++;
        }
    }

    public String ListadoNodos() 
    {
        String listado = "";
        Nodo temp = cabeza;
        while (temp != null) 
        {
            listado = listado + temp.getDato();
        }

        return listado;
    }

    public void InvertirLista() 
    { 
      if(cabeza!=null)
      {
        ListaSE listaTemp=new ListaSE();
        Nodo temp=cabeza;
        while(temp.getSiguiente()!=null)
        {
          Nodo nodoNuevo=new Nodo(temp.getDato());
          listaTemp.AdicionarAlInicio(nodoNuevo);
          temp=temp.getSiguiente();
        }
        cabeza=listaTemp.getCabeza();
      }      
    }

    public boolean AdicionarAlInicio(Nodo nodo) 
    {
        if(cabeza == null)
        {
          cabeza=nodo;
        }
        else
        {
          nodo.setSiguiente(cabeza);
          cabeza=nodo;
        }        
        return true;
    }

}
