package com.pallefire.b_34customadapterlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    Button b;
    ListView lv;
    ArrayList<Employee> al;
    MyAdapter m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        et3= (EditText) findViewById(R.id.et3);
        b = (Button) findViewById(R.id.bt1);
        lv = (ListView) findViewById(R.id.lv1);
        al = new ArrayList<Employee>();
        m = new MyAdapter();
        lv.setAdapter((ListAdapter) m);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eno= et1.getText().toString();
                String ename = et2.getText().toString();
                String esalary = et3.getText().toString();
                Employee e = new Employee();
                e.setEno(eno);
                e.setEname(ename);
                e.setEsalary(esalary);
                al.add(e);
                m.notifyDataSetChanged();
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et1.requestFocus();
                et2.requestFocus();
                et3.requestFocus();
            }
        });
    }

    private class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int position) {
            return al.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Employee e =al.get(position);
            View v = getLayoutInflater().inflate(R.layout.row,null);
            TextView tv1 = (TextView) v.findViewById(R.id.tv1);
            TextView tv2 = (TextView) v.findViewById(R.id.tv2);
            TextView tv3 = (TextView) v.findViewById(R.id.tv3);
            tv1.setText(e.getEno());
            tv2.setText(e.getEname());
            tv3.setText(e.getEsalary());
            return v;
        }
    }
}
