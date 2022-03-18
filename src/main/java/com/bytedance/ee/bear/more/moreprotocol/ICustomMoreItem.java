package com.bytedance.ee.bear.more.moreprotocol;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/ICustomMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "getItemView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface ICustomMoreItem extends IBaseMoreItem {
    View getItemView(ViewGroup viewGroup);

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i);
}
