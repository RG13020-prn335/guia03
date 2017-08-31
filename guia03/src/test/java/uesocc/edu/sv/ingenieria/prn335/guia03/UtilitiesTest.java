/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import junit.framework.Assert;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author usuario
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
    @Deployment
    public static WebArchive Desplegar(){
    WebArchive salida=ShrinkWrap.create(WebArchive.class)
        .addClass(Utilities.class)
        .addAsWebInfResource(EmptyAsset.INSTANCE,"beans.xml");
    
    System.out.println(salida.toString(true));
    return salida;
    }    
    @Inject
    private Utilities utilidad;
    
    @Test 
    public void probarUtilidad(){
    String texto="Bienvenidos a la materia de Programacion 3 ciclo II 2017";
    String resultadoEsperado="Bienvenidos​a la​mat";
    String resultado;
    resultado = utilidad.getResume(texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
    public void probarUtilidad2(){
    String texto="Hola Mundo!";
    String resultadoEsperado="Hola Mundo";
    String resultado;
    resultado = utilidad.getResume(texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
    
    public void probarUtilidad3(){
    String texto=null;
    String resultadoEsperado=null;
    String resultado;
    resultado = utilidad.getResume(texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
    
    public void probarUtilidad4(){
    String texto="prueBas de UNIDAD con JUnit​& arQuillian";
    String resultadoEsperado="Pruebas De Unidad con Junit​& Arquillian";
    String resultado;
    resultado = utilidad.capitalizar(texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
    
    public void probarUtilidad5(){
    String texto="";
    String resultadoEsperado="";
    String resultado;
    resultado = utilidad.capitalizar(texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
    
    public void probarUtilidad6(){
    String texto=null;
    String resultadoEsperado=null;
    String resultado;
    resultado = utilidad.capitalizar(texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
    
    public void probarUtilidad7(){
    String texto="Bienvenidos a la materia de Programacion 3 ciclo II 2017";
    String resultadoEsperado="1";
    int resultado;
    resultado = utilidad.contarCoincidencias("2017",texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
    
     public void probarUtilidad8(){
    String texto="Bienvenidos a la materia de Programacion 3 ciclo II 2017";
    String resultadoEsperado="2";
    int resultado;
    resultado = utilidad.contarCoincidencias("MA",texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    }
     
     public void probarUtilidad9(){
    String texto=null;
    String resultadoEsperado="0";
    int resultado;
    resultado = utilidad.contarCoincidencias("bienvenido",texto);
    Assert.assertEquals(resultado, resultadoEsperado);
    } 
    
}
