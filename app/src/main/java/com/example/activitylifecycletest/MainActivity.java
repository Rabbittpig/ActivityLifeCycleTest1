package com.example.activitylifecycletest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Button startNormalActivity = findViewById(R.id.start_normal_activity);
        Button startDialogActivity = findViewById(R.id.start_dialog_activity);
        editText = findViewById(R.id.edit_text);
        Button button = findViewById(R.id.button1);
        imageView = findViewById(R.id.img1);
        progressBar = findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    /***
// 生命周期
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
      /*           //获取文本中输入的内容
               String inputText =editText.getText().toString();*/

//               Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();

/*               //切换图片
                 imageView.setImageResource(R.drawable.rabbit);
                 */

/*               //点击按钮控制进度条的可见与不可见
                if(progressBar.getVisibility()==View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else {
                    progressBar.setVisibility(View.GONE);
                }*/

     /*           // 点击一次按钮进度条加10
            int progress = progressBar.getProgress();
            progress = progress + 10;
            progressBar.setProgress(progress);*/

 /*    //Dialog显示对话框
                //创建实例
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                //设置标题
                dialog.setTitle("This is a Dialog");
                //设置内容
                dialog.setMessage("Something important");
                //不可用Back键关闭对话框
                dialog.setCancelable(false);
                //确定事件
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                //取消事件
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();*/

                // 创建ProgressDialog对象
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                // 标题
                progressDialog.setTitle("This is ProgressDialog");
                // 内容
                progressDialog.setMessage("Loading");
                // 按下Back键可返回
                progressDialog.setCancelable(true);
                //显示
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}