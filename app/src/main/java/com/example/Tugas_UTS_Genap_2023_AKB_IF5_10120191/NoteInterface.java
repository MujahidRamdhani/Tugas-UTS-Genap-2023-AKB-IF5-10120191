package com.example.Tugas_UTS_Genap_2023_AKB_IF5_10120191;

import android.database.Cursor;

import com.example.Tugas_UTS_Genap_2023_AKB_IF5_10120191.model.Note;
//Ahmad Mujahid Ramdhani
//10120191
//IF-5


public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
