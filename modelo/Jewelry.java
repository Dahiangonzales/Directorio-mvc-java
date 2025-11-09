package model;

public class Jewelry {
    private String sku;
    private String nombre;
    private String tipo; 
    private String material; 
    private double peso; 
    private int cantidad;
    private double precio;
    private String descripcion;

    public Jewelry(String sku, String nombre, String tipo, String material, 
                  double peso, int cantidad, double precio, String descripcion) {
        this.sku = sku;
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
        this.peso = peso;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }


    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return String.format(
            "SKU: %s | Nombre: %s | Tipo: %s | Material: %s | Peso: %.2fg | " +
            "Cantidad: %d | Precio: $%.2f | Descripción: %s",
            sku, nombre, tipo, material, peso, cantidad, precio, descripcion
        );
    }

    public String toShortString() {
        return String.format("SKU: %s | %s (%s %s) - $%.2f", 
                           sku, nombre, material, tipo, precio);
    }
}