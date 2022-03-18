package com.ss.android.lark.searchcommon.view.binder;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ICustomBinder;", "", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.n */
public interface ICustomBinder {
    /* renamed from: a */
    int mo184845a(int i);

    /* renamed from: a */
    RecyclerView.ViewHolder mo184846a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    void mo184847a(RecyclerView.ViewHolder viewHolder, SearchBaseInfo searchBaseInfo, int i);
}
