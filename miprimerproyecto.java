package unal.poo.practica;

import becker.robots.*;
import static unal.poo.practica.miprimerproyecto.estudiante;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class miprimerproyecto
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.EAST,10);
            
	  
            //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
            
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               estudiante.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            estudiante.putThing();
                       
            //Si el frente esta libre de Wall
            estudiante.frontIsClear();
            
            movimientog(3);
            
            //Toman un Thing
            estudiante.pickThing();
        }
        public static void movimientog (int rot){
                rot=3;
               for (int i=0;i< rot;i++)
                   estudiante.turnLeft();
                   estudiante.move();
                   estudiante.move();
                   estudiante.move();
                   estudiante.move();
                   estudiante.move();
                    for (int j=0;j<rot;j++)
                        estudiante.turnLeft();
                        estudiante.move();
                        estudiante.move();
                        estudiante.move();
                        estudiante.move();
                        for(int k=0;k<rot;k++)
                            estudiante.turnLeft();
                            estudiante.move();
                            estudiante.move();
                            estudiante.move ();
                            estudiante.move ();
                            for(int l=0;l<rot;l++)
                                estudiante.turnLeft();
                                estudiante.move ();
                                estudiante.move ();
                                estudiante.move ();
                                estudiante.move ();
                                for(int m=0; m<rot;m++)
                                    estudiante.turnLeft();
                                    estudiante.move ();
                                    estudiante.move ();
                                    estudiante.move ();
                                    for(int n=0; n<rot;n++)
                                        estudiante.turnLeft();
                                        estudiante.move ();
                                        estudiante.move ();
                                        estudiante.move ();
                                         for(int o=0; o<rot;o++)
                                            estudiante.turnLeft();
                                            estudiante.move ();
                                            estudiante.move ();
                                            for(int p=0; p<rot;p++)
                                            estudiante.turnLeft();
                                            estudiante.move ();
                                            estudiante.move ();
           }
}

