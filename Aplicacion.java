package epn.com;
public class Aplicacion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Nodo a = new Nodo("Andres",null);
		Nodo b = new Nodo("Jose",null);
		Nodo c = new Nodo("Bryan",null);
		Nodo d = new Nodo("Esteban",null);
		
		Nodo e = new Nodo("Muñoz",null);
		Nodo f = new Nodo("Alvarez",null);
        
		SlinkedList lista = new SlinkedList();
		lista.InsertarInicio(a);
		lista.InsertarFinal(b);
		lista.InsertarInicio(c);
		lista.InsertarFinal(d);
		
		lista.InsertarInicio(e);
		lista.InsertarFinal(f);
		System.out.println(lista.toString());
		
	System.out.print("La lista esta vacia:\n");
        System.out.println(lista.esVacia());
        
	System.out.print("\nTamaño: ");
        System.out.println(lista.getSize());
		
	System.out.println("\nExiste: Josefina");
        System.out.println(lista.buscar("Josefina"));
        
        System.out.println("\nExiste: Andres");
        System.out.println(lista.buscar("Andres"));
        
        System.out.println("\nExiste: Muñoz");
        System.out.println(lista.buscar("Muñoz"));
        
        System.out.println("\nConsulta la posicion de: Jose");
        System.out.println(lista.getPosicion("Jose"));
        
        
        System.out.println("\nConsulta la posicion de: Alvarez");
        System.out.println(lista.getPosicion("Alvarez"));
	}

}
