package reach.reach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.Arrays;

public class eventActivity extends AppCompatActivity {

    private ListView eventListView;
    private ArrayAdapter<String> eventListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        //Creating ListView
        eventListView = (ListView) findViewById(R.id.eventListView);

        //Test array to populate list
        String[] testEventsArray = new String[] {"Event1" , "Event2" , "Event3" , "Event4" , };

        //Creating arrayList to store all events
        ArrayList<String> eventList = new ArrayList<String>();
        eventList.addAll(Arrays.asList(testEventsArray));

        //Creating adapter using the eventList
        eventListAdapter = new ArrayAdapter<String>(this,R.layout.event_text_view,eventList);

        eventListView.setAdapter(eventListAdapter);

        Button addEventButton = (Button) findViewById(R.id.addEventButton);
        addEventButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                addEvent(eventListAdapter,)
            }
        });
    }


    //To be expanded with event objects, this method is used to add events to the list
    private void addEvent(ArrayAdapter inputAdapter){
        inputAdapter.add(event);
     }
}
