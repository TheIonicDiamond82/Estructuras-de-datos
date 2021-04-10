
package estructuras.de.datos;

import java.util.Scanner;

public class implementaciones {

      public static void main(String[] args) throws Exception {
        String Respuesta="";
        Scanner Leer = new Scanner(System.in);
        System.out.println("ESTRUCTURAS DE DATOS");
        System.out.println("");
        String opcion="";
        do
        {
            System.out.println("\tSeleccione el tipo de estructura de dato que desea trabajar:");
            System.out.println("\t\t- Pila:");
            System.out.println("\t\t- Cola:");
            System.out.print("\t");
            opcion = Leer.next();
            switch(opcion)
            {
                case "Pila":
                ClasePila<String> Pila = new ClasePila<>();
            {
                String Repeticion="";
                do
                {
                    System.out.println("¿Que operación desea realizar?");
                    System.out.println("1.Añadir Datos");
                    System.out.println("2.Borrar Datos");
                    System.out.println("3.Imprimir los datos almacenados en la pila");
                    System.out.println("4.Saber el tamaño de la pila");
                    int operacion =0;
                    operacion = Leer.nextInt();
                    System.out.println("");
                    String dato;
                    if(operacion == 1)
                    {
                        do
                        {
                        System.out.println("Ingrese el nuevo dato a agregar:");
                        dato = Leer.next();
                        Pila.añadirDatos(dato);
                            System.out.println("\nDesea ingresar otro dato?(Si/No)");
                            Repeticion=Leer.next();
                        }while("Si".equals(Repeticion));
                        Repeticion=null;
                    }
                    if(operacion == 2)
                    {
                        System.out.println("Borrado de dato en pila");
                        do
                        {
                         Pila.borrarDatos();
                            System.out.println("Dato borrado de la pila");
                            System.out.println("");
                         System.out.println("Desea borrar otro dato?(Si/No)");
                          Repeticion=Leer.next();
                        }while("Si".equals(Repeticion));
                        Repeticion=null;
                    }
                    if(operacion == 3)
                    {
                        for(int i=0;i<Pila.DatosEnLaPila();i++)
                        {
                        System.out.println(Pila.pila[Pila.DatosEnLaPila()]);
                        }
                    }
                    if(operacion == 4)
                    {
                        System.out.println(Pila.Max());
                    }
                    System.out.println("\n¿Desea realizar otra operacion?(Si/No)");
                    Repeticion = Leer.next();
                }while("Si".equals(Repeticion));
            }
                break;
                case "Cola":
                {
                     ClaseCola<Integer> Cola = new ClaseCola<Integer>(5);
                     ClaseColaCircular<Integer> ColaCircular = new ClaseColaCircular<Integer>(5);
                     int opcionN = 0;
        do
        {
        System.out.println("\nMenu de opciones\n");
        System.out.println("1.- Agrega dato\n");
        System.out.println("2.- Retira dato\n");
        System.out.println("3.- Muestra siguiente\n");
        System.out.println("4.- Muestra contenido\n");
        System.out.println("5.- Acomodar cola\n");
        System.out.println("0.- Salir\n");
        System.out.print("\nOpcion: ");
        
        opcionN = Leer.nextInt();

            switch(opcionN)
            {
                case 1: //Agregar
                System.out.println("Agregar dato");

                if(Cola.full() || ColaCircular.full()){
                System.out.print("Escriba el dato a agregar: ");
                int cant1 = Leer.nextInt();
                
                if(Cola.full())
                {
                    System.out.println("Ya no se puede agregar datos, cola llena");
                }

                else
                {
                    Cola.add(cant1); 
                }

                if(ColaCircular.full())
                System.out.println("No se puede agregar");

                else
                ColaCircular.add(cant1);
            }
               
                
                break;

                case 2: //Retirar
                if(Cola.empty())
                {
                    System.out.println("Cola vacia, nada que retirar");
                }

                else
                {
                    System.out.println(Cola.remove());
                }

                if(Cola.empty())
                {
                    System.out.println("Cola vacia, nada que retirar");
                }

                else
                {
                    System.out.println(Cola.remove());
                }

                break;

                case 3: //Mostrar siguiente
                System.out.println("Mostrar siguiente dato");
                if(Cola.empty())
                {
                    System.out.println("Nada que mostar");
                }

                else
                {
                    System.out.println(Cola.peekNext());
                }

                break;

                case 4: //Mostrar cola
                System.out.println("Contenido de la cola");
                Cola.peekQueue();
                System.out.println();
                break;

                case 5: //Acomodar cola
                Cola.fitQueue();
                break;

                case 0: //Terminar programa
                System.out.println("Terminar programa");

                default:
                System.out.println("Opcion no valida");

            }

        }while(opcionN != 0);
        Leer.close();
                }
                   break;
                default:
                    System.out.println("Opcion invalida o escrita incorrectamente");
                    System.out.println("");
                    
            }
            
                System.out.println("¿Desea realizar o repetir otra operacion?(Si/No)");
                Respuesta = Leer.next();
        }while("Si".equals(Respuesta));
        if("No".equals(Respuesta))
        {
            System.out.println("Selecciono la opcion No y salio del sistema");
        }
        else
        {
            System.out.println("Opcion invalida, sistema cerrado");
        }
	}
      
    
}
    

