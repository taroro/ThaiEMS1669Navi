package com.thaiems1669.android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder>  {
    private List<AccidentCase> mAccidentCases;
    private Context mContext;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public TextView mLocation;
        public TextView mDetail;

        public ViewHolder(View view) {
            super(view);

            mTitle = (TextView) view.findViewById(R.id.case_title);
            mLocation = (TextView) view.findViewById(R.id.case_location);
            mDetail = (TextView) view.findViewById(R.id.case_detail);
        }
    }

    public CustomRecyclerAdapter(Context context, List<AccidentCase> dataset) {
        mAccidentCases = dataset;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.recycler_case_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        AccidentCase accidentCase = mAccidentCases.get(position);

        viewHolder.mTitle.setText(accidentCase.getTitle());
        viewHolder.mLocation.setText(accidentCase.getLocation());
        viewHolder.mDetail.setText(accidentCase.getDetail());
    }

    @Override
    public int getItemCount() {
        return mAccidentCases.size();
    }
}
