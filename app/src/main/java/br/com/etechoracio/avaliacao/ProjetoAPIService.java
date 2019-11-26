package br.com.etechoracio.avaliacao;


import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ProjetoAPIService {

    @POST(".")
    Call<String> executar(@Query("num1") String num1, @Query("num2") String num2);
}
