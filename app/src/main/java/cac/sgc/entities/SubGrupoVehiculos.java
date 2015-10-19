package cac.sgc.entities;

import com.delacrmi.controller.Entity;

/**
 * Created by miguel on 10/10/15.
 */
public class SubGrupoVehiculos extends Entity {
    //"CREATE TABLE MQ_SUBGRUPO_VEHICULO(ID_EMPRESA INTEGER,CODIGO_GRUPO TEXT,CODIGO_SUBGRUPO INTEGER,DESCRIPCION TEXT)";

    public static String ID_EMPRESA = "id_empresa";
    public static String CODIGO_GRUPO = "codigo_grupo";
    public static String CODIGO_SUBGRUPO = "codigo_subgrupo";
    public static String DESCRIPCION  = "descripcion";

    @Override
    public SubGrupoVehiculos entityConfig() {
        setName("mq_subgrupo_vehiculo");
        addColumn("id_empresa", "integer");
        addColumn("codigo_grupo", "text");
        addColumn("codigo_subgrupo","integer");
        addColumn("descripcion","text");

        return this;
    }
}
