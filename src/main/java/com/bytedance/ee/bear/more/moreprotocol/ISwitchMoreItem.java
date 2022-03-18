package com.bytedance.ee.bear.more.moreprotocol;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J*\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/ISwitchMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IIconFontMoreItem;", "isCheck", "", "onCheckStateChange", "", "adapter", "Ljava/lang/ref/WeakReference;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "newState", "position", "", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface ISwitchMoreItem extends IIconFontMoreItem {
    boolean isCheck();

    void onCheckStateChange(WeakReference<RecyclerView.Adapter<?>> weakReference, boolean z, int i);
}
