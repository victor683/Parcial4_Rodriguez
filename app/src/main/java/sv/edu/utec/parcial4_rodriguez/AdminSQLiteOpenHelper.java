package sv.edu.utec.parcial4_rodriguez;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase BD) {
        BD.execSQL("create table MD_Asignatura(" +
                "ID_Asignatura int primary key," +
                "Nombre text," +
                "Acronimo text," +
                "Descripcion text," +
                "Edificio text, " +
                "Clase text," +
                "GrupoHorario text)");

        BD.execSQL("create table MD_Evento(" +
                "ID_Evento int primary key," +
                "Nombre text," +
                "Descripcion text," +
                "Ubicacion," +
                "GrupoHorario text," +
                "Asignatura_ID_Asignatura int)");

        BD.execSQL("create table MD_Horario(" +
                "ID_Horario int primary key," +
                "Grupo text," +
                "Fecha text," +
                "Hora_Inicio text," +
                "Hora_Fin text)");

        BD.execSQL("create table MD_Deber(" +
                "ID_Deber int primary key," +
                "Nombre text," +
                "Descripcion text," +
                "Fecha_Entrega Date," +
                "Hora_Entrega Time," +
                "Ubicacion text," +
                "Asignatura_ID int," +
                "Ponderacion decimal," +
                "Grupo_Horario text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase BD, int i, int i1) {

    }
}
