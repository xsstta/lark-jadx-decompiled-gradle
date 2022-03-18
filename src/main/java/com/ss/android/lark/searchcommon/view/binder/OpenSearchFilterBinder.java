package com.ss.android.lark.searchcommon.view.binder;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.view.SearchOpenSearchFilterViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/OpenSearchFilterBinder;", "", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/SearchOpenSearchFilterViewHolder;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.y */
public final class OpenSearchFilterBinder {

    /* renamed from: a */
    public final SearchResultViewAdapter.IOnItemClickHandler f133691a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.y$a */
    static final class View$OnClickListenerC54002a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OpenSearchFilterBinder f133692a;

        /* renamed from: b */
        final /* synthetic */ SearchOpenSearchInfo f133693b;

        /* renamed from: c */
        final /* synthetic */ int f133694c;

        View$OnClickListenerC54002a(OpenSearchFilterBinder yVar, SearchOpenSearchInfo searchOpenSearchInfo, int i) {
            this.f133692a = yVar;
            this.f133693b = searchOpenSearchInfo;
            this.f133694c = i;
        }

        public final void onClick(View view) {
            this.f133692a.f133691a.mo182499a(this.f133693b, true, this.f133694c);
        }
    }

    public OpenSearchFilterBinder(SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133691a = bVar;
    }

    /* renamed from: a */
    public final void mo184879a(int i, SearchOpenSearchInfo searchOpenSearchInfo, SearchOpenSearchFilterViewHolder gVar) {
        Intrinsics.checkParameterIsNotNull(searchOpenSearchInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(gVar, "holder");
        gVar.mo184941a().setText(searchOpenSearchInfo.getTitle());
        gVar.mo184942b().setOnClickListener(new View$OnClickListenerC54002a(this, searchOpenSearchInfo, i));
    }
}
