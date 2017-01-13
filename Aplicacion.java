package epn.com;
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo s = new Nodo("Andres",null);
		Nodo t = new Nodo("Jose",null);
		Nodo u = new Nodo("Bryan",null);
		Nodo w = new Nodo("Esteban",null);
		
		SlinkedList lista = new SlinkedList();
		lista.InsertarAlFinal(s);
		lista.InsertarAlFinal(t);
		lista.InsertarAlInicio(u);
		lista.InsertarAlInicio(w);
		System.out.println(lista.toString());
		
		System.out.print("Tamaño: ");
        System.out.println(lista.getSize());
		
		System.out.println("\nExiste: Maria");
        System.out.println(lista.buscar("Maria"));
        
        System.out.println("\nExiste: Andres");
        System.out.println(lista.buscar("Andres"));
        
        
		
	}

}
