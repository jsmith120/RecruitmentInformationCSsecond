package com.example.recruitmentinformationcs;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CalendarView;
import android.widget.ExpandableListView;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1 extends Fragment {

    public tab1() {
        // Required empty public constructor
    }

    private CalendarView mCalendarView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tab1, container, false);

        final View v = inflater.inflate(R.layout.fragment_tab1, null);

        /*ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.list);
        elv.setAdapter(new tab1.SavedTabsListAdapter());*/


        mCalendarView = (CalendarView) v.findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                TextView events = v.findViewById(R.id.event);
                TextView dates = v.findViewById(R.id.date);
                TextView times = v.findViewById(R.id.time);
                TextView locations = v.findViewById(R.id.location);
                TextView descriptions = v.findViewById(R.id.description);



                if ((i1 + 1) == 3 && i2 == 25 && i == 2020)
                {
                    events.setText("Faculty Candidate Presentation");
                    dates.setText("Date: 3/25/2020");
                    times.setText("Time: 12:45-1:30pm");
                    locations.setText("Location: Online @ https://semo.zoom.us/j/169596589");
                    descriptions.setText("Description: Online presentation by faculty Candidate Dr. Ji Li");
                }
                else
                {
                    events.setText("");
                    dates.setText("");
                    times.setText("");
                    locations.setText("");
                    descriptions.setText("");
                }


            }
        });





        return v;
    }

    /*public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {"Faculty Candidate Presentation",
                "Faculty Candidate Presentation",
                "Faculty Candidate Presentation",
                "Commencement Ceremony"};

        private String[][] children = {
                {"Date: 3/25/2020", "Time: 12:45-1:30pm", "Location: Online @ https://semo.zoom.us/j/169596589", "Description: Online presentation by faculty Candidate Dr. Ji Li"},
                {"Date: 3/26/2020", "Time: 8:45-9:30am", "Location: Online @ https://semo.zoom.us/j/888925852", "Description: Online presentation by faculty Candidate Dr. Robert Lowe"},
                {"Date: 3/27/2020", "Time: 8:45-9:30pm", "Location: Online @ https://semo.zoom.us/j/194693200", "Description: Online presentation by faculty Candidate Dr. Wee Wee Sim"},
                {"Date: 5/16/2020", "Time: 10:00am", "Location: Show Me Center", "Description: Commencement ceremony for senior computer science students."}
        };

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(tab1.this.getActivity());
            textView.setText(getGroup(i).toString());
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(tab1.this.getActivity());
            textView.setText(getChild(i, i1).toString());
            textView.setTextSize(16);
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }
    }*/

}
