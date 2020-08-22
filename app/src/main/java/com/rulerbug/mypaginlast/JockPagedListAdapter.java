package com.rulerbug.mypaginlast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.rulerbug.mypaginlast.databinding.ItemJockBinding;

public class JockPagedListAdapter extends PagedListAdapter<JockBean.ResultBean, JockPagedListAdapter.ViewHolder> {
    private Context mc;
    private static DiffUtil.ItemCallback<JockBean.ResultBean> DIFF_CALLBACK = new DiffUtil.ItemCallback<JockBean.ResultBean>() {
        @Override
        public boolean areItemsTheSame(@NonNull JockBean.ResultBean oldItem, @NonNull JockBean.ResultBean newItem) {
            return oldItem.getSid().equals(newItem.getSid());
        }

        @Override
        public boolean areContentsTheSame(@NonNull JockBean.ResultBean oldItem, @NonNull JockBean.ResultBean newItem) {
            return oldItem.getSid().equals(newItem.getSid());
        }
    };

    public JockPagedListAdapter(Context mc) {
        super(DIFF_CALLBACK);
        this.mc = mc;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemJockBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(mc), R.layout.item_jock, parent, false);

        return new ViewHolder(inflate.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        JockBean.ResultBean item = getItem(position);
        if (item != null) {
            ItemJockBinding bind = DataBindingUtil.bind(holder.itemView);
            bind.setJockBean(item);
            bind.executePendingBindings();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
