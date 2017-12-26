package thinkblue.pj.service_with_rv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Priyanshu on 22-09-2017.
 */

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyViewHolder> {
    int arr[];
    String a[];
    public MyAdaptor(int ar[],String a[]) {
        arr = ar;
        this.a=a;
    }



    @Override
    public int getItemCount() {
        return arr.length;
    }

    @Override
    public MyAdaptor.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_row,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(arr[position]+"");
        holder.textView1.setText(a[position]+"");
    }




    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView,textView1;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.rv_tv);
            textView1 = (TextView)itemView.findViewById(R.id.textView2);

        }

    }



}
