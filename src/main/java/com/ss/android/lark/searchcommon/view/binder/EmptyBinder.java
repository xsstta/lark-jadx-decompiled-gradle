package com.ss.android.lark.searchcommon.view.binder;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/EmptyBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/IViewBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "holder", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.k */
public final class EmptyBinder extends IViewBinder<SearchBaseInfo, RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final Companion f133644a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/EmptyBinder$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo184838a(int i, SearchBaseInfo searchBaseInfo, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Log.m165383e("LarkSearch.Common.EmptyBuilder", "wft??? impossible!!!");
    }
}
