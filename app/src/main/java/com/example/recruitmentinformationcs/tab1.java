package com.example.recruitmentinformationcs;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1 extends Fragment {

    public tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tab1, container, false);

        View v = inflater.inflate(R.layout.fragment_tab1, null);

        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.list);
        elv.setAdapter(new tab1.SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

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
    }

}
