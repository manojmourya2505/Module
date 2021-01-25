package first.module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
    }

    public void ClickMe(View view) {

        Intent intent = new Intent(ModuleActivity.this,SecondModuleActivity.class);
        startActivity(intent);
    }
}