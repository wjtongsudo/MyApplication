package cn.edu.sdwu.android.home.sn170507180215.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.ListView;
public class HomeworkActivity4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner spinner=null;
    private ArrayList list;//数组
    private SimpleAdapter simpleAdapter;//适配器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework4);

        spinner=(Spinner)findViewById(R.id.spin_one);
        spinner.setOnItemSelectedListener(this);
        EditText editText=(EditText)findViewById(R.id.tv);
//准备数据


    }




    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String[] strArr=getResources().getStringArray(R.array.catArr);
        String content=strArr[i];
        Toast.makeText(HomeworkActivity4.this,content,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
