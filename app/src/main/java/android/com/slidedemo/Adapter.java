package android.com.slidedemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHodler>{

    private Context context;
    private List<String> mDatas;

    public Adapter(Context context,List<String> mDatas){
        this.context=context;
        this.mDatas=mDatas;
    }

    @NonNull
    @Override
    public MyViewHodler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        MyViewHodler myViewHodler=new MyViewHodler(LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false));
        return myViewHodler;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHodler myViewHodler, int i) {
        myViewHodler.num.setText(mDatas.get(i));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyViewHodler extends RecyclerView.ViewHolder{

        TextView num;
        public MyViewHodler(@NonNull View itemView) {
            super(itemView);
            num=itemView.findViewById(R.id.textNum);
        }
    }
}
