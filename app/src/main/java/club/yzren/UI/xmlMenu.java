package club.yzren.UI;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class xmlMenu extends AppCompatActivity {
    private EditText etHelloWorld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xmlmenu);
        etHelloWorld = (EditText) findViewById(R.id.et_hello_world);
        registerForContextMenu(etHelloWorld);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.optional, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            // 普通箱单被点击处所进行的操作。
            case R.id.normal_menu:
                Toast.makeText(this, "你单击了普通菜单", Toast.LENGTH_LONG).show();
                break;
            // 为子菜单的子项定义被点击时所进行的操作。
            case R.id.font_10:
                etHelloWorld.setTextSize(10);
                break;
            case R.id.font_16:
                etHelloWorld.setTextSize(16);
                break;
            case R.id.font_20:
                etHelloWorld.setTextSize(20);
                break;
            case R.id.red:
                etHelloWorld.setTextColor(Color.RED);
                break;
            case R.id.black:
                etHelloWorld.setTextColor(Color.BLACK);
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}

