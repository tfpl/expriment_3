package club.yzren.UI;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button listview;
    private Button Alert_dialog;
    private Button xmlmenu;
    private  Button list_context_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        listview=(Button)findViewById(R.id.listView);
        Alert_dialog=(Button)findViewById(R.id.Alertdialog) ;
        xmlmenu=(Button)findViewById(R.id.xmlMenu) ;
        list_context_menu=(Button)findViewById(R.id.context_menu);
        //对控件进行监
        listview.setOnClickListener(this);
        Alert_dialog.setOnClickListener(this);
        xmlmenu.setOnClickListener(this);
        list_context_menu.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.listView:
                Intent intent=new Intent(this, ListView.class);
                startActivity(intent);
                break;
            case R.id.Alertdialog:
                Intent intent2=new Intent(this, AlertDialogShow.class);
                startActivity(intent2);
                break;
            case R.id.xmlMenu:
                Intent intent3=new Intent(this, xmlMenu.class);
                startActivity(intent3);
                break;
            case R.id.list_contex_menu:
                Intent intent4=new Intent(this, ActionModeMenu.class);
                startActivity(intent4);
                break;
        }
    }
}
