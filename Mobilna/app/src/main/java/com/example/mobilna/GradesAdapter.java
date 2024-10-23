package com.example.mobilna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.mobilna.api.Grade;

import java.util.List;

import lombok.NonNull;

public class GradesAdapter extends ArrayAdapter<Grade> {
    public GradesAdapter(@NonNull Context context, int resource, @NonNull List<Grade>){
        super(context, resource);
    }
    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        Grade grade = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.item_list_layout, parent,
                            false);

        }
        TextView subjectView = convertView.findViewById(R.id.textViewSubject);
        TextView gradeView = convertView.findViewById(R.id.textViewGrade);
        subjectView.setText(grade.getSubject());
        gradeView.setText(grade.getGrade());
        return  convertView;
    }
}
