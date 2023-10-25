package Modelo;
public class cls_recetas {
    private String str_codigo;
    private String str_nombre;
    private String str_ingredientes;
    private int int_stock;
    private float flt_precio;
    private String str_chef;

    public cls_recetas(String str_codigo, String str_nombre, String str_ingredientes, int int_stock, float flt_precio, String str_chef) {
        this.str_codigo = str_codigo;
        this.str_nombre = str_nombre;
        this.str_ingredientes = str_ingredientes;
        this.int_stock = int_stock;
        this.flt_precio = flt_precio;
        this.str_chef = str_chef;
    }

    public String getStr_codigo() {
        return str_codigo;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_ingredientes() {
        return str_ingredientes;
    }

    public void setStr_ingredientes(String str_ingredientes) {
        this.str_ingredientes = str_ingredientes;
    }

    public int getInt_stock() {
        return int_stock;
    }

    public void setInt_stock(int int_stock) {
        this.int_stock = int_stock;
    }

    public float getFlt_precio() {
        return flt_precio;
    }

    public void setFlt_precio(float flt_precio) {
        this.flt_precio = flt_precio;
    }

    public String getStr_chef() {
        return str_chef;
    }

    public void setStr_chef(String str_chef) {
        this.str_chef = str_chef;
    }
}