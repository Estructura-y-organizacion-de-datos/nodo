package puntos;
public class prueba {
  /*
  private Nodo apuntador;
    public prueba(){
      apuntador=null;
    }
    */
  
    public static void main(String[] args) {

       Nodo nodo1= new Nodo("Rosas");
       Nodo nodo2= new Nodo("Chaidez");
       Nodo nodo3= new Nodo("Rafael");

        nodo3.enlace=nodo2;
        nodo2.enlace=nodo1;

        Nodo aux=nodo3;
           while (aux != null)
           {
             System.out.print(aux.dato + "  "+aux.enlace+" ");
             aux = aux.enlace;
            }
            /*
            prueba apuntador=new prueba();
            System.out.println(apuntador.apuntador);
            apuntador.apuntador=nodo3;
            System.out.println(apuntador.apuntador);
            System.out.println(apuntador.apuntador.enlace);
            System.out.println(apuntador.apuntador.dato);
            */
    }
}
