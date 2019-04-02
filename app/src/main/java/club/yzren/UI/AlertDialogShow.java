package club.yzren.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;

public class AlertDialogShow extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        // 创建构建器
      AlertDialog.Builder builder = new   AlertDialog.Builder(this);
       // View alertdialog=View.inflate(this,R.layout.alerter_lyout,null);

        builder.setView(R.layout.alerter_lyout);
    builder.create().show();


    }
}
