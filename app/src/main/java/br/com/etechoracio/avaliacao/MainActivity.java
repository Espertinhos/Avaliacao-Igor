package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public EditText editNum1;
    public EditText editNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);
        double num1 = Double.parseDouble(editNum1.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());

        double resultado = num1 * num2;
    }

    public void onProcessar(View view){
        this.service = new Retrofit.Builder().baseUrl("http://quiteriaetec.somee.com/api/Projetos/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(ProjetoAPIService.class);

        Call<String> call = this.service.executar();

        call.enqueue(
                new     Callback<String>() {


                    @Override
                    public void onResponse(Call<String> call, Response<String> response)
                }
        );

    }

    private ProjetoAPIService service;
}
