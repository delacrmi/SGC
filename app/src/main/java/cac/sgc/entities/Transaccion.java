package cac.sgc.entities;

import com.delacrmi.controller.Entity;

/**
 * Created by Legal on 15/10/2015.
 */
public class Transaccion extends Entity {

    public static String NO_ENVIO = "no_envio";
    public static String FRENTE_CORTE = "frente_corte";
    public static String FRENTE_ALCE  = "frente_alce";
    public static String ORDEN_QUEMA  = "orden_quema";
    public static String ID_FINCA     = "id_finca";
    public static String ID_CANIAL    = "id_canial";
    public static String ID_LOTE      = "id_lote";
    public static String FECHA_CORTE  = "fecha_corte";
    public static String CLAVE_CORTE  = "clave_corte";
    public static String CODIGO_CABEZAL = "codigo_cabezal";
    public static String CONDUCTOR_CABEZAL = "coductor_cabezal";
    public static String CODIGO_CARRETA = "codigo_carreta";
    public static String CODIGO_COSECHADORA = "codigo_cosechadora";
    public static String OPERADOR_COSECHADORA = "operador_cosechadora";
    public static String CODIGO_TRACTOR = "codigo_tractor";
    public static String OPERADOR_TRACTOR = "operador_tractor";
    public static String CODIGO_APUNTADOR = "codigo_apuntador";
    public static String CODIGO_VAGON     = "codigo_vagon";

    @Override
    public Transaccion entityConfig() {
        setName("ba_mtransaccion");
        setPrimaryKey("correlativo");
        addColumn("no_envio", "integer");
        addColumn("frente_corte", "integer");
        addColumn("frente_alce", "integer");
        addColumn("orden_quema", "integer");
        addColumn("id_finca", "integer");
        addColumn("id_canial", "integer");
        addColumn("id_lote", "integer");
        addColumn("fecha_corte","date");
        addColumn("clave_corte", "text");
        addColumn("codigo_cabezal","text");
        addColumn("coductor_cabezal", "integer");
        addColumn("codigo_carreta","text");
        addColumn("codigo_cosechadora","text");
        addColumn("operador_cosechadora", "integer");
        addColumn("codigo_tractor","text");
        addColumn("operador_tractor", "integer");
        addColumn("codigo_apuntador", "integer");
        addColumn("codigo_vagon","text");
        return this;
    }
}