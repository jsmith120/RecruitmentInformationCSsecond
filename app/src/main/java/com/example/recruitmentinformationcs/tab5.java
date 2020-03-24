package com.example.recruitmentinformationcs;

import android.app.DownloadManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab5 extends Fragment {

    public tab5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tab3, null);

        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.list);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;

    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {"Dr. Charles D. McAllister",
                "Ms. Dayna Northington",
                "Dr. Suhair Amer",
                "Mr. Wei Dai",
                "Dr. Mario Garcia",
                "Dr. Zhouzhou Li",
                "Dr. Xiaoming Liu",
                "Dr. Ziping Liu",
                "Dr. Reshmi Mitra",
                "Mrs. Carole Pfeiffer",
                "Dr. Xuesong Zhang"};

        private String[][] children = {
                {"Phone: 573-651-2244", "Email: cdmcallister@semo.edu", "Office: Dempster 021A"},
                {"Phone: 573-651-2244", "Email: dnorthington@semo.edu", "Office: Dempster 021A"},
                {"Phone: 573-651-2525", "Email: samer@semo.edu", "Office: Dempster 021J"},
                {"Phone: 573-651-2826", "Email: wdai@semo.edu", "Office: Dempster 021G"},
                {"Phone: 573-651-2903", "Email: mgarcia@semo.edu", "Office: Dempster 246C"},
                {"Phone: 573-651-2653", "Email: zli2@semo.edu", "Office: Dempster 021E"},
                {"Phone: 573-651-2208", "Email: xliu@semo.edu", "Office: Dempster 021F"},
                {"Phone: 573-968-7392", "Email: zliu@semo.edu", "Office: Dempster 021G"},
                {"Phone: 573-651-2920", "Email: rmitra@semo.edu", "Office: Dempster 246E"},
                {"Phone: 573-651-2784", "Email: cpfeiffer@semo.edu", "Office: Dempster 021D"},
                {"Phone: 573-651-2788", "Email: xzhang@semo.edu", "Office: Dempster 021C"}
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
            TextView textView = new TextView(tab5.this.getActivity());
            textView.setText(getGroup(i).toString());
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(tab5.this.getActivity());
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

