package cac.sgc.entities;

import com.delacrmi.controller.Entity;

/**
 * Created by miguel on 10/10/15.
 */
public class Empresas extends Entity {
    //private String sqlCreateEmpresa = "CREATE TABLE PG_EMPRESA( ID_EMPRESA INTEGER,DIRECCION_COMERCIAL TEXT)

    public static String ID_EMPRESA = "id_empresa";
    public static String DIRECCION_COMERCIAL = "direccion_comercial";

    private boolean selected = false;

    public Empresas(){

    }

    @Override
    public Empresas entityConfig() {
        setName("rh_empresa");
        setPrimaryKey("id_empresa");
        addColumn("direccion_comercial","text");
        return this;
    }

    public void setSelected(boolean selected){
        this.selected = selected;
    }
    public boolean isselected(){
        return selected;
    }
}
