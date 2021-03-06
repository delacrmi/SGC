package cac.sgc.entities;

import com.delacrmi.controller.Entity;

/**
 * Created by miguel on 10/10/15.
 */
public class Caniales extends Entity {
    //"CREATE TABLE CP_CANIAL(ID_EMPRESA INTEGER, ID_FINCA INTEGER,ID_CANIAL INTEGER, DESCIPCION TEXT)";

    public static String ID_FINCA = "id_finca";
    public static String CANIAL = "id_canial";
    public static String DESCRIPCION = "descripcion";

    @Override
    public Caniales entityConfig() {
        setName("cp_canial");
        setPrimaryKey("id_canial");
        addColumn("id_empresa", "integer");
        addColumn("id_finca", "integer");
        addColumn("descripcion","text");

        return this;
    }
}