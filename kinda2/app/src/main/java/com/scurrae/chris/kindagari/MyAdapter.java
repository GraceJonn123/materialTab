//package com.scurrae.chris.kindagari;
//
//import android.support.v7.widget.CardView;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
///**
// * Created by chris on 3/6/16.
// */
//public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
//    private String[] mDataset;
//
//    // provide references for views for
//    // each data item
//    // all view for a single data item can be put in a view holder
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        // each data item as a string
//        public TextView mTextView;
//
//        public ViewHolder(TextView v) {
//            super(v);
//            mTextView = v;
//        }
//    }
//    public MyAdapter(String[] myDataset){
//      mDataset = myDataset;
//    }
//    // create new views
//    @Override
//    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
//        //create a new view
//        View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.card, parent, false);
//        // set view size margins and layout
//        ViewHolder vh = new ViewHolder(v);
//        return vh;
//    }
//    // Replace contents of view
//
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        // get element from dataset
//        // Replace contents of view with element
//        holder.mTextView.setText(mDataset[position]);
//    }
//    // return size of dataset
//
//    @Override
//    public int getItemCount() {
//        return mDataset.length;
//    }
//}
