public class Hotel {
    private String nombre;
    private int documento;
    private long numeroContacto;
    private String fechaReserva;
    private String horaReserva;

    public Hotel(String nombre, int documento, long numeroContacto, String fechaReserva, String horaReserva) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroContacto = numeroContacto;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public long getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(long numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public void reserva(){
        System.out.println("Nombre: "+this.nombre+", Documento: "+this.documento+", Numero de Contacto: "+
                numeroContacto+", Fecha: "+this.fechaReserva+" y Hora: "+this.horaReserva);
    }
}
