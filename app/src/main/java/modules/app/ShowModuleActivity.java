package modules.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShowModuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_module);

        try {

            Intent intent = new Intent(ShowModuleActivity.this,Class.forName("first.module.ModuleActivity"));
            startActivity(intent);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }
}