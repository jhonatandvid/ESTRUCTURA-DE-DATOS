package Defensa_Pilas_H3;

public class PilaDeEstudiantes {

        private int max;
        private int top;
        private Estudiante[] Estudiante;
        public PilaDeEstudiantes(){
            this.max = 10;
            this.top = 0;
            this.Estudiante = new Estudiante[this.max+1];
        }
        public boolean EsVacio(){
            if(this.top == 0 ){
                return true;
            }else{
                return false;
            }
        }

        public boolean EsLleno(){
            if(this.top == this.max ){
                return true;
            }else{
                return false;
            }
        }
        public int NroElementos(){
            return top;
        }
        public void Adicionar(Estudiante nuevoEstudiante) {
            if (EsLleno()==true) {
                System.out.println("PILA LLENA");
            }else{
                top = top + 1;
                this.Estudiante[top] = nuevoEstudiante;
            }
        }
        public Estudiante eliminar(){
            Estudiante itemEliminado = null;
            if(EsVacio() == true){
                System.out.println("PILA VACIA");
            }
            else {
                itemEliminado = Estudiante[top];
                top = top -1;
            }
            return itemEliminado;
        }

        public void Vaciar(PilaDeEstudiantes pila){
            while(pila.EsVacio() ==  false){
                Adicionar(pila.eliminar());
            }
        }
        public void Mostrar(){
            Estudiante item;
            if(EsVacio() == true ){
                System.out.println("No hay items que mostrar");
            }else{
                System.out.println("Mostrando la PILA DE ESTUDIANTES");
                PilaDeEstudiantes aux = new PilaDeEstudiantes();
                while(EsVacio()==false){
                    item = eliminar();
                    if (item != null) {
                        item.muestraEstudiante();
                        aux.Adicionar(item);
                    }
                }
                Vaciar(aux);
            }
        }

}