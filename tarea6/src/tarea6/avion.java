package tarea6;
public abstract class avion {
    int capacCombus;
    String nombre, fabricante, estado;

    public avion() {
    }

    public avion(int capacCombus, String nombre, String fabricante) {
        this.capacCombus = capacCombus;
        this.nombre = nombre;
        this.fabricante = fabricante;
        estado = "Estacionados";
    }

    public int getCapacCombus() {
        return capacCombus;
    }

    public void setCapacCombus(int capacCombus) {
        this.capacCombus = capacCombus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void alistar(){
        if( estado.equals("Estacionado") ){
            estado = "Preparado";
        }else{
            try{
                validar(this.estado);
            }catch(miExcepcion e){
                e.getMessage();
            }
        }
    }
    @Override
    public String toString() {
        return "avion{" + "capacCombus=" + capacCombus + ", nombre=" + nombre + ", fabricante=" + fabricante + ", estado=" + estado + '}';
    }
    public abstract void despegar();
 
    public void validar (String estado) throws miExcepcion{
        if (!this.getEstado().equals("Estacionado")|| !this.getEstado().equals("Preparado")){
            System.out.println("El avion tiene que estar estacionado");
        }
    }
}

