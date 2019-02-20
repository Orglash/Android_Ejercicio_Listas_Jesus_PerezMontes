package es.escuelaestech.chopo.ejercicio_listas_jesus_perezmontes;

import java.util.UUID;

public class Lugares {

    private String mLugar;
    private String mProvincia;
    private String mId;

    public Lugares(String lugar, String provincia) {
        mId= UUID.randomUUID().toString();
        mLugar = lugar;
        mProvincia = provincia;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getLugar() {
        return mLugar;
    }

    public void setLugar(String mLugar) {
        this.mLugar = mLugar;
    }

    public String getProvincia() {
        return mProvincia;
    }

    public void setProvincia(String mProvincia) {
        this.mProvincia = mProvincia;
    }


    @Override
    public String toString() {
        return  "ID='" + mId + '\'' +
                ", Lugar='" + mLugar + '\'' +
                ", Provincia='" + mProvincia + '\'';
    }


}
