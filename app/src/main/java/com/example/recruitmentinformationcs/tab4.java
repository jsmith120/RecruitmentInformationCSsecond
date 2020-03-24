package com.example.recruitmentinformationcs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab4 extends Fragment {

    public tab4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab3, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.list);
        elv.setAdapter(new tab4.SavedTabsListAdapter());
        return v;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tab4, container, false);
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {"Intro to Computer Programming",
        "Computer Science I",
        "Discrete Structures I",
        "Computer Science II",
        "Computer System & Assembly Language",
        "Discrete Structures II",
        "Analysis of Algorithms",
        "C & the Posix Environment",
        "Computer Operating Systems",
        "Programming Languages",
        "Database",
        "Software Engineer I",
        "Machine Learning",
        "Data Communications",
        "Internship in Computer Science",
        "Fundamentals of Programming",
        "Fundamentals of Computing",
        "Distributed cloud Computing",
        "Research Methods",
        "Advanced Programming Languages",
        "Advanced Software Engineering",
        "Machine Learning",
        "Advanced Database Systems",
        "Graduate Project"};

        private String[][] children = {
                {"Number: CS 101", "Credits: 3", "Prerequisites: None", "Availability: Fall 2020", "Description: Introduction to design and development of simple programs using Python."},
                {"Number: CS 155", "Credits: 4", "Prerequisites: CS 101 with minimum grade of C", "Availability: Fall 2020", "Description: Introduction to object oriented programming in Java, with selection and repetition structures, pre-defined and programmer-defined functions and arrays."},
                {"Number: CS 245", "Credits: 3", "Prerequisites: CS 101 with minimum grade of C", "Availability: Fall 2020", "Description: Introduction to discrete structures as used in computer science. Topics include proof techniques, fundamental structures, and basic algorithm analysis."},
                {"Number: CS 265", "Credits: 4", "Prerequisites: CS 155 with a minimum grade of C", "Availability: Fall 2020", "Description: Covers object oriented programming, generics, and applications of data structures such as lists, stacks, queues and priority queues."},
                {"Number: CS 288", "Credits: 4", "Prerequisites: CS 245 with minimum grade of C", "Availability: Fall 2020", "Description: Computer system organization including logic circuits and assembly language."},
                {"Number: CS 345", "Credits: 3", "Prerequisites: CS 245 with minimum grade of C.", "Availability: Fall 2020", "Description: A continuation of the study of discrete structures in computer science. Topics may include graph theory, computational models, proof of correctness and algorithm analysis."},
                {"Number: CS 350", "Credits: 3", "Prerequisites: CS 300 and CS 345 with minimum grade of C.", "Availability: Fall 2020", "Description: A continuation of the study of data abstractions and the algorithms for their manipulation. Emphasis on the analysis of non-numeric algorithms."},
                {"Number: CS 351", "Credits: 4", "Prerequisites: CS 155 with minimum grade of C", "Availability: Fall 2020", "Description: C language and Linux Environment."},
                {"Number: CS 380", "Credits: 3", "Prerequisites: CS 288 and CS 351 with minimum grades of C", "Availability: Fall 2020", "Description: Explores the concepts and implementation of operating systems."},
                {"Number: CS 390", "Credits: 3", "Prerequisites: CS 300 with minimum grade of C", "Availability: Fall 2020", "Description: Properties of algorithmic languages including scopes of declarations, storage allocation, grouping of statements, runtime behavior; introduction to Language and BNF Grammars."},
                {"Number: CS 440", "Credits: 3", "Prerequisites: CS 265 or CS 500 with minimum grade of C", "Availability: Fall 2020", "Description: Basic concepts of database and database architecture. Discussion of entity-relationship and relational database models. Study of the SQL query language. Study of database design methodology."},
                {"Number: CS 445", "Credits: 3", "Prerequisites: Senior standing.", "Availability: Fall 2020", "Description: Provides an in depth understanding of the principles and techniques used in the analysis and design aspects of developing applications systems. Apply techniques and tools to produce the system artifacts pertaining to analysis and design."},
                {"Number: CS 453", "Credits: 3", "Prerequisites: CS 265 or CS 500 with minimum grades of C", "Availability: Fall 2020", "Description: Overview of many concepts, techniques, and algorithms related to machine learning."},
                {"Number: CS 480", "Credits: 3", "Prerequisites: CS 351 with a minimum grade of C", "Availability: Fall 2020", "Description: Principles of data communication and computer networks."},
                {"Number: CS 485", "Credits: 3", "Prerequisites: CS 300; 75 hours completed; 2.75 cumulative GPA; 15 hours CS or IS courses with 3.0 GPA", "Availability: Fall 2020", "Description: A supervised learning and work experience in professional computer science which augments computer science and information systems courses taken on campus. May be repeated once. On demand. No credit on Computer Science or Computer Information Systems major or minor. Credit/no credit only."},
                {"Number: CS 500", "Credits: 3", "Prerequisites: consent of department chairperson", "Availability: Fall 2020", "Description: Data structures, algorithms, object orientation and standard libraries with emphasis on practical programming."},
                {"Number: CS 503", "Credits: 3", "Prerequisites: consent of department chairperson", "Availability: Fall 2020", "Description: Covers basic understanding of fundamental concepts in computer organizations, networks, algorithms and operating systems."},
                {"Number: CS 506", "Credits: 3", "Prerequisites: CS 265 and CS 380 and CS 480; or CS 265 and CS 503; or CS 500 and CS 503; all with minimum grades of C", "Availability: Fall 2020", "Description: Principles and technologies for distributed cloud computing development."},
                {"Number: CS 605", "Credits: 3", "Prerequisites: CS300 and CS380 and CS480 or CS500 and CS503; or consent of Department Chairperson", "Availability: Fall 2020", "Description: Analysis of the types, sources, methods, and philosophy of computer science and completion of a research project"},
                {"Number: CS 609", "Credits: 3", "Prerequisites: CS300 and CS380 and CS480 or CS500 and CS503; or consent of Department Chairperson", "Availability: Fall 2020", "Description: Covers objects, testing, deployment, maintenance of a component base solution and design patterns using object oriented concepts."},
                {"Number: CS 631", "Credits: 3", "Prerequisites: CS300 and CS380 and CS480 or CS500 and CS503; or consent of Department Chairperson", "Availability: Fall 2020", "Description: Software engineering processes, project planning, scheduling, metrics, estimation, testing/quality, and management."},
                {"Number: CS 634", "Credits: 3", "Prerequisites: CS300 and CS380 and CS480 or CS500 and CS503; or consent of Department Chairperson", "Availability: Fall 2020", "Description: Overview of many concepts, techniques, and algorithms related to machine learning."},
                {"Number: CS 640", "Credits: 3", "Prerequisites: CS300 and CS380 and CS480 or CS500 and CS503; or consent of Department Chairperson", "Availability: Fall 2020", "Description: Covers the major topics on designing, using, and implementing database systems and database applications."},
                {"Number: CS 690", "Credits: 0", "Prerequisites: consent of department chairperson or graduate coordinator; enrollment in final semester of degree program", "Availability: Fall 2020", "Description: Evaluate and defend selected activities such as projects, papers, etc.,completed during the students period of study."}
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
            TextView textView = new TextView(tab4.this.getActivity());
            textView.setText(getGroup(i).toString());
            textView.setTextSize(24);
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(tab4.this.getActivity());
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
