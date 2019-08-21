/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

import poo.Persona;
import Figuras.Circulo;
import Figuras.Cuadrados;
import Figuras.Triangulos;
import Animales.Felinos;
import Electronicoss.Celular;
import Electronicoss.PC;
import Electronicoss.Laptop;
import Animales.Perros;
import Animales.Pajaro;
import Figuras.cubo;
import Figuras.Piramide;
import Web.Gmail;
import Web.Googe;
import Web.Yahoo;
import Web.Youtube;
import Ropa.Calcetas;
import Ropa.Camisa;
import Ropa.Pantalon;
import Ropa.Suadera;
import Ropa.zapatos;

/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Persona beto = new Persona();
        beto.Persona("Omar", 19, 1.60, 56.7, "+culino");
        System.out.println();
        Circulo chico= new Circulo();
        chico.area(9, 18);
        System.out.println();
        
        Circulo mediano= new Circulo();
        mediano.area(12, 24);
        System.out.println();
        
        Circulo grande= new Circulo();
        grande.area(15, 30);
        System.out.println();
        
        Circulo macro= new Circulo();
        macro.area(50, 100);
        System.out.println();
        
        Cuadrados rectangulo= new Cuadrados();
        rectangulo.area(2, 4);
        rectangulo.perimetro(2, 4);
        System.out.println();
        
        Cuadrados rectangulo2= new Cuadrados();
        rectangulo2.area(4, 7);
        rectangulo2.perimetro(4, 7);
        System.out.println();
        
        Cuadrados cuadro= new Cuadrados();
        cuadro.area(2, 2);
        cuadro.perimetro(2, 2);
        System.out.println();
        
        Cuadrados cuadro2= new Cuadrados();
        cuadro2.area(2, 4);
        cuadro2.perimetro(3, 4);
        System.out.println();
        
        Triangulos tri= new Triangulos();
        tri.areat(3, 4);
        tri.perit(3, 2, 1);
        System.out.println();
        
        Triangulos tria= new Triangulos();
        tria.areat(5, 7);
        tria.perit(5, 4, 6);
        System.out.println();
        
        Triangulos trian= new Triangulos();
        trian.areat(8, 9);
        trian.perit(8, 7, 6);
        System.out.println();
        
        Triangulos triang= new Triangulos();
        triang.areat(4, 5);
        triang.perit(4, 2, 3); 
        System.out.println();
        
        Felinos gato= new Felinos();
        gato.bonito("negro", 30, 30,"siames");
        System.out.println();
        
        Felinos gatochafa= new Felinos();
        gatochafa.bonito("gris", 10, 10,"de la calle");
        System.out.println();
        
        Felinos gatito= new Felinos();
        gatito.bonito("blanco", 20, 20,"blanco");
        System.out.println();
        
        Felinos gatote= new Felinos();
        gatote.bonito("pinto", 30, 15,"sabe");
        System.out.println();
        
        Celular cel= new Celular();
        cel.Celular("motorola", "g7", 64, 5890, "telcel");
        System.out.println();
        
        Celular celu= new Celular();
        celu.Celular("One Plus", "7pro", 128, 13890, "global");
        System.out.println();
        
        PC asus= new PC();
        asus.PC("acer", "helios 300", "i78990h", 30678, 16);
        System.out.println();
        
        PC corsair= new PC();
        corsair.PC("dell", "alienware 17", "i78890h", 377798, 8);
        System.out.println();
        
        Laptop predator= new Laptop();
        predator.Laptop("acer", "helios 300", "i78990h", 30678, 16);
        System.out.println();
        
        Laptop alienware= new Laptop();
        alienware.Laptop("dell", "alienware 17", "i78890h", 377798, 8);
        System.out.println();
        
        Perros wilson = new Perros();
        wilson.bonito("blanco", 20, 20,"blanco");
        System.out.println();
        
        Perros dogi= new Perros();
        dogi.bonito("pinto", 30, 15,"sabe");
        System.out.println();
        
        Pajaro pa= new Pajaro();
        pa.bonito("blanco", 20, 20,"blanco");
        System.out.println();
        
        Pajaro patote= new Pajaro();
        patote.bonito("pinto", 30, 15,"sabe");
        System.out.println();
        
        Piramide pi= new Piramide();
        pi.Piramide(12, 10, 9);
        System.out.println();
        
        Piramide pir= new Piramide();
        pir.Piramide(155, 122, 100);
        System.out.println();
        
        cubo cubito= new cubo();
        cubito.cubo(2, 2, 3);
        System.out.println();
        
        cubo cubitom= new cubo();
        cubitom.cubo(3, 3, 3);
        System.out.println();
        
        Gmail gmail= new Gmail();
        gmail.Web("mensajeria", "google", "2000");
        System.out.println();
        
        Youtube auronplay= new Youtube();
        auronplay.Web("entretenimiento videos", "google", "2005");
        System.out.println();
        
        Yahoo yaju= new Yahoo();
        yaju.Web("busqueda", "yahoo", "2001");
        System.out.println();
        
        Googe auron= new Googe();
        auron.Web("busqueda", "google", "2000");
        System.out.println();
        
        Calcetas niki= new Calcetas();
        niki.Cal(20, "nike", "air");
        System.out.println();
        
        Camisa adidas= new Camisa();
        adidas.cami(34, "Adidas", "origin");
        System.out.println();
        
        Pantalon wran= new Pantalon();
        wran.Pant(18, "wrangler", "classic");
        System.out.println();
        
        Suadera niky= new Suadera();
        niky.Sud(15, "nautica", "nau");
        System.out.println();
        
        zapatos nuki= new zapatos();
        nuki.Tenis(25, "nike", "retro");
        System.out.println();*/
       
        Circulo mediano= new Circulo();
        mediano.getPi();
        System.out.println(mediano.getPi());
        
        Cuadrados med= new Cuadrados();
        med.setAltura(9);
        System.out.println(med.getAltura());
        
        Piramide medi= new Piramide();
        medi.setAltura(7);
        System.out.println(medi.getAltura());
        
        Triangulos medio= new Triangulos();
        medio.getBase();
        System.out.println(medio.getBase());
        
        cubo medioa= new cubo();
        medioa.setAltura(6);
        System.out.println(medioa.getAltura());
        
        Felinos gato= new Felinos();
        gato.setAltura(6);
        System.out.println(gato.getAltura());
        
        Pajaro piolin= new Pajaro();
        piolin.setAltura(9);
        piolin.getAltura();
        System.out.println(piolin.getAltura());
        
        Perros doki= new Perros();
        doki.setPeso(20);
        System.out.println(doki.getPeso());
        
        Calcetas niki= new Calcetas();
        niki.setMarca("nike");
        System.out.println(niki.getMarca());
        
        Camisa nau= new Camisa();
        nau.setTalla(12);
        System.out.println(nau.getTalla());
       
        Pantalon wran= new Pantalon();
        wran.setModelo("classic");
        System.out.println(wran.getModelo());
        
        Suadera ad= new Suadera();
        ad.setMarca("Adidas");
        System.out.println(ad.getMarca());
        
        zapatos dc= new zapatos();
        dc.setTalla(34);
        System.out.println(dc.getTalla());
        
        Gmail gm= new Gmail();
        gm.setProposito("maicra");
        System.out.println(gm.getProposito());
        
        Googe goo= new Googe();
        goo.setInicio("ayer");
        System.out.print(goo.getInicio());
        
        Yahoo ta= new Yahoo();
        ta.setDueno("yahooo");
        System.out.print(ta.getDueno());
        
        Youtube yo= new Youtube();
        yo.setProposito("entretenimient");
        System.out.println(yo.getProposito());
        
    }
    
}
