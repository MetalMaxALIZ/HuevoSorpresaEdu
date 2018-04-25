package huevoSorpresa;

/**
 * Clase huevo sorpresa del examen
 * @author Eduardo
 */
public class HuevoSorpresaEduardo {

    /**
     * @return las unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades establece las unidades
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio establece el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return la sorpresa
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa establece la sorpresa
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return el precio maximo
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * @param precio_max establece el precio maximo
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
    
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    
/**
 * Constructor por defecto
 */
public HuevoSorpresaEduardo(){}


/**
 * Constructor por parámetros
 * @param unidades cantidad de unidades
 * @param precio precio de las unidades
 * @param sorpresa sorpresa del huevo
 * @param precio_max precio maximo 
 */
public HuevoSorpresaEduardo(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}


/**
 * 
 * @return Método que devuelve el número de huevos sorpresa que tiene la tienda
 */
public int obtenerUnidades(){return this.getUnidades();}

/**
 * 
 * @return Método que devuelve el precio que tiene cada huevo sorpresa
 */
public double obtenerPrecio(){return this.getPrecio();}



/**
 * Método que permite modificar el número de huevos sorpresa que tiene la tienda
 * @param unidades cantidad de huevos
 */
public void modificarUnidades(int unidades){this.setUnidades(unidades);}


/**
 * Método que permite sacar huevos sopresa si se tiene suficiente dinero y hay 
 * suficientes huevos sorpresas, este método se probará con JUnit
 * @param unidades cantidad de huevos
 * @param dinero cantidad de dinero
 * @throws Exception excepcion en caso de no tener dinero, unidades, o cantidad negativa.
 */
public void sacarHuevosSorpresas(int unidades, double dinero) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}


/**
 * Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual el aumento 
 * que se indica siempre que no se sobrepase el precio máximo de venta, este método se probará con JUnit
 * @param aumento aumenta el precio
 * @throws Exception excepcion en caso de numero negativo o superior a precio maximo
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}
}