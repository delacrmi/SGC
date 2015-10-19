package cac.sgc.entities;

import com.delacrmi.controller.Entity;

/**
 * Created by Legal on 19/10/2015.
 */
public class Rangos extends Entity {

    public static String EMPRESA      = "id_empresa";
    public static String PERIODO      = "id_periodo";
    public static String DISPOSITIVO  = "dispositivo";
    public static String ENVIO_DESDE  = "envio_desde";
    public static String ENVIO_HASTA  = "envio_hasta";
    public static String ENVIO_ACTUAL = "envio_actual";
    public static String TICKET_DESDE = "ticket_desde";
    public static String TICKET_HASTA = "ticket_hasta";
    public static String TICKET_ACTUAL = "ticket_actual";
    public static String STATUS       = "status";
    public static String CORRELATIVO  = "correlativo";

    @Override
    public Rangos entityConfig() {
        setName("ba_rango");
        setPrimaryKey("correlativo");
        addColumn("id_empresa", "integer");
        addColumn("id_periodo","integer");
        addColumn("dispositivo", "text");
        addColumn("envio_desde", "integer");
        addColumn("envio_hasta", "integer");
        addColumn("envio_actual","integer");
        addColumn("ticket_desde","integer");
        addColumn("ticket_hasta","integer");
        addColumn("ticket_actual","integer");
        addColumn("status","text");
        return this;
    }
}
