package com.zero.haris.simplecrudonline;

/**
 * Created by Haris on 12/24/2016.
 */

public class Mahasiswa {
    private String id_mhs;
    private String nama_mhs;
    private String nim_mhs;

    public void setMhsId (String id_mhs)
    {
        this.id_mhs = id_mhs;
    }

    public String getMhsId()
    {
        return id_mhs;
    }

    public void setMhsName (String nama_mhs)
    {
        this.nama_mhs = nama_mhs;
    }

    public String getMhsName()
    {
        return nama_mhs;
    }

    public void setMhsNIM (String nim_mhs)
    {
        this.nim_mhs = nim_mhs;
    }

    public String getMhsNIM() { return nim_mhs; }
}
