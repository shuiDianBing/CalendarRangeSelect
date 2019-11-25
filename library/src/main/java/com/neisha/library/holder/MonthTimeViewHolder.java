package com.neisha.library.holder;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.neisha.library.R;


/**
 *  Created by 木子 on 2017/08/08.
 */
public class MonthTimeViewHolder extends RecyclerView.ViewHolder{
    public RecyclerView plan_time_recycler_content ;            //月份里面详细日期的列表
    public Context context;                                        //上下文

    public MonthTimeViewHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        plan_time_recycler_content = (RecyclerView) itemView.findViewById(R.id.plan_time_recycler_content);

        RecyclerView.LayoutManager layoutManager =
                new GridLayoutManager(context,
                        7,  // 每行显示item项数目
                        GridLayoutManager.VERTICAL, //水平排列
                        false
                );

        plan_time_recycler_content.setLayoutManager(layoutManager);
    }
}
