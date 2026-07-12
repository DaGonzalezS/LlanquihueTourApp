package model;

public class ColaboradorExterno extends Persona implements Registrable {

    private String empresa;

    public ColaboradorExterno(String nombre, String cargo, String empresa){
        super(nombre, cargo);
        this.empresa = empresa;
    }

    public String getEmpresa(){
        return empresa;
    }

    public void setEmpresa(){
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() + " | Empresa: " + empresa;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador Externo: " + toString());
    }
}
