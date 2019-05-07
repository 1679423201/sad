package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;




import java.util.List;


/**
 *
 * 从网站获取数据
 * 需要设置无法联网的情况
 */
public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private Context context;
    private List<myClass> myClassList;
    public myAdapter(List<myClass> myclass){
        myClassList = myclass;
    }
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        View myView;
        public ViewHolder(View itemView) {
            super(itemView);
            myView = itemView;
            textView = (TextView) itemView.findViewById(R.id.tv_boke);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.dsf, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                int op = holder.getAdapterPosition();
                Toast.makeText(context,"dsa  "+op,Toast.LENGTH_SHORT).show();

            }
        });
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        myClass myClass = myClassList.get(position);
        holder.textView.setText(myClass.getTitle());
    }

    @Override
    public int getItemCount() {
        return myClassList.size();
    }
}


//    private int resourceId;
//
//
//    public myAdapter(Context context , int textViewResourceId, List<myClass> objects) {
//        super(context, textViewResourceId, objects);
//        resourceId = textViewResourceId;
//    }
//    @Override
//    public View getView(int position , View convertView , ViewGroup parent){
//        myClass myClass = getItem(position);
//        View view = LayoutInflater.from(getContext()).inflate(resourceId , parent , false);//未使用流畅优化
//        TextView title = (TextView) view.findViewById(R.id.txt_title);
//        TextView text = (TextView) view.findViewById(R.id.txt_text);
//        title.setText(myClass.getTitle());
//        return view;
//    }
//}
