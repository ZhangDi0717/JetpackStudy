package com.zhangdi.jetpackstudy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


import com.zhangdi.jetpackstudy.R;
import com.zhangdi.jetpackstudy.databinding.RecyclerStringBinding;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> implements View.OnClickListener,View.OnLongClickListener{
    private List<String> mList;

    private Context mContext;;
    private OnItemClickListener mOnItemClickListener;

    public ItemAdapter(Context mContext,List<String>mList){
        this.mContext=mContext;
        this.mList=mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_string, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String item = mList.get(position);
        holder.itemView.setTag(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
        void onItemLongClick(View view,int position);

    }

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(v,(int)v.getTag());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemLongClick(v,(int)v.getTag());
        }
        return true;
    }



    public void removeData(int position) {
        mList.remove(position);
        notifyItemRemoved(position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private RecyclerStringBinding mBinding;
        TextView tv;
        public MyViewHolder(View view) {
            super(view);
            mBinding = DataBindingUtil.bind(view);
        }

        public void bind(@NonNull String item){
            mBinding.setItem(item);
        }
    }

}
