package cac.sgc.fragments;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import cac.sgc.MainActivity;
import cac.sgc.R;

/**
 * Created by Legal on 04/10/2015.
 */
public class Listado extends Fragment {

    private View view;
    private MainActivity context;
    private EditText editFiltroPorFecha;
    private ImageButton generarReporte;
    private static Listado ourInstance = null;
    private int vYear, vMonthOfYear,  vDayOfMonth;

    public Listado() {}

    /**
     * Constructor que recive la actidad principal
     * para siempre tener el contexto principal.
     *
     * @param context MainActivity que es el contexto principal de la aplicacion.
     * */
    public static Listado init(MainActivity context) {
        if ( ourInstance == null ) {
            ourInstance = new Listado();
            ourInstance.context = context;
        }
        return ourInstance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.listado,container,false);
        initComponents();
        return view;
    }

    /**
     * Metodo utilizado para iniciar los componentes, enlazando las variables
     * con el xml y agregar los metodos que le dan funcionalidad a los
     * componentes.
     * */
    private void initComponents(){
        editFiltroPorFecha = (EditText) view.findViewById(R.id.editFiltroPorFecha);
        generarReporte = (ImageButton) view.findViewById(R.id.generarReporte);

        generarReporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarReportePDF();
            }
        });

        vYear = Calendar.getInstance().get(Calendar.YEAR);
        vMonthOfYear = Calendar.getInstance().get(Calendar.MONTH);
        vDayOfMonth = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        editFiltroPorFecha.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    showDialogDatePicker();
                }
            }
        });

    }

    private void mostrarReportePDF() {

        Document documento = new Document();

        try {

            File archivo = crearFichero("prueba.pdf");

            FileOutputStream ficheroPdf = new FileOutputStream(archivo.getAbsolutePath());

            PdfWriter.getInstance(documento, ficheroPdf);

            documento.open();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static File crearFichero(String s) throws IOException {
        File ruta = getRuta();

        File fichero = null;
        if (ruta != null)
            fichero = new File(ruta, s);

        return fichero;

    }

    private static File getRuta() {
        return null;
    }

    /**
     * Metodo utilizado para mostrar un dialog con el calendario.
     * */
    private void showDialogDatePicker() {

        DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                vYear = year;
                vMonthOfYear = monthOfYear;
                vDayOfMonth = dayOfMonth;
                editFiltroPorFecha.setText(vDayOfMonth + "/" + vMonthOfYear + "/" + vYear);
            }
        };

        DatePickerDialog datePicker = new DatePickerDialog(getActivity(), R.style.AppTheme,dateListener,vYear,vMonthOfYear,vDayOfMonth);
        datePicker.show();
   }

}