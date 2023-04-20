package br.com.evernote;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.POST;

public interface EvernoteAPI {
    @GET("/")
    Call<List<Note>> listNotes();

    @GET("/")
    Call<Note> getNote();

    @POST("/create")
    Call<Note> createNote(@Body Note note);
}