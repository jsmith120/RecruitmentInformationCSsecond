package com.example.recruitmentinformationcs;

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
public class tab2 extends Fragment {

    public tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tab3, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.list);
        elv.setAdapter(new tab2.SavedTabsListAdapter());
        return v;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tab2, container, false);
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {"All classes moved to an online format.",
        "Southeast Cyber Defense Team Wins Eighth Straight State Championship"};

        private String[][] children = {
                {"Description: Due to the COVID-19 outbreak, all in-person classes" +
                        "have been moved to online delivery methods. Instructors will" +
                        "contact students with more details.",
                "After winning their eighth straight state championship, they will be" +
                        "moving on to the Erich J. Spenger Midwest Regional Collegiate" +
                        "Cyber Defense Competition."}
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
            TextView textView = new TextView(tab2.this.getActivity());
            textView.setText(getGroup(i).toString());
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(tab2.this.getActivity());
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
