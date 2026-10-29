package ListaDoblementeEnlazada;
public class PincipalNodoDB {
    public static void main(String[] args) {
        ListaEnlazada listaE = new ListaEnlazada();

        listaE.InsertarInicio(4);
        listaE.InsertarInicio(3);
        listaE.InsertarInicio(2);
        listaE.InsertarInicio(1);
        //listaE.InsertarFinal(5);

        //listaE.InsertarPosision(6,2);
        listaE.MostrarDeFinAInicio();
        //listaE.mostrar();
    }
}
