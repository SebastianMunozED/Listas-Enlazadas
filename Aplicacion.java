package epn.com;
public class Aplicacion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Nodo a = new Nodo("Andres",null);
		Nodo b = new Nodo("Jose",null);
		Nodo c = new Nodo("Bryan",null);
		Nodo d = new Nodo("Esteban",null);
        
		SlinkedList lista = new SlinkedList();
		lista.InsertarInicio(a);
		lista.InsertarFinal(b);
		lista.InsertarInicio(c);
		lista.InsertarFinal(d);
		System.out.println(lista.toString());
		
		System.out.print("La lista esta vacia:\n");
        System.out.println(lista.esVacia());
        
		System.out.print("\nTamaño: ");
        System.out.println(lista.getSize());
		
		System.out.println("\nExiste: Maria");
        System.out.println(lista.buscar("Maria"));
        
        System.out.println("\nExiste: Andres");
        System.out.println(lista.buscar("Andres"));
        
        System.out.println("\nConsulta la posicion de: Jose");
        System.out.println(lista.getPosicion("Jose"));
	}

}
