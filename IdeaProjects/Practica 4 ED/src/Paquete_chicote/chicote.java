package Paquete_chicote;

/**
 * @author Antxón Moço / IES Son Ferrer
 * @version 1.2.0
 */
public class chicote {


    //ATRIBUTOS


    private String Matricula;
    private String Modelo;
    private Integer Caballos;


    //GETTERS




    /**
     * Creamos las funciones de GETTERS para poder obtener la
     * información de ese atributo luego en el main
     */
    public Integer getCaballos() {
        return this.Caballos;
    }


    public String getMatricula() {
        return this.Matricula;
    }


    public String getModelo() {
        return this.Modelo;
    }


    //SETTERS


    /**
     * Creamos las funciones de SETTERS para poder insertar valores a los atributos
     * que hemos creado en la clase Coche.
     * @param caballos El numero de caballos que tiene el coche
     */


    public void setCaballos(Integer caballos) {
        this.Caballos = caballos;
    }


    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }


    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
}