package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;

    ArrayList<EmployeeList> employeeLists;

    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.listView);

        employeeLists = new ArrayList<>();

        EmployeeList list1 = new EmployeeList("John", "Software Technical Leader", 3400.0f);
        EmployeeList list2 = new EmployeeList("May", "Programer", 2200.0f);

        employeeLists.add(list1);
        employeeLists.add(list2);

        caInfo = new CustomAdapter(this, R.layout.employeelist, employeeLists);

        lvInfo.setAdapter(caInfo);
    }
}