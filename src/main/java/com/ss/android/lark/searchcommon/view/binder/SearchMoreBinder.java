package com.ss.android.lark.searchcommon.view.binder;

import android.view.View;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.searchcommon.dto.info.SearchMoreInfo;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.SearchShowMoreViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/SearchMoreBinder;", "", "onItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchMoreInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/SearchShowMoreViewHolder;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.ac */
public final class SearchMoreBinder {

    /* renamed from: a */
    public final SearchResultViewAdapter.IOnItemClickHandler f133579a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.ac$a */
    public static final class View$OnClickListenerC53981a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchMoreBinder f133580a;

        /* renamed from: b */
        final /* synthetic */ SearchMoreInfo f133581b;

        /* renamed from: c */
        final /* synthetic */ int f133582c;

        View$OnClickListenerC53981a(SearchMoreBinder acVar, SearchMoreInfo searchMoreInfo, int i) {
            this.f133580a = acVar;
            this.f133581b = searchMoreInfo;
            this.f133582c = i;
        }

        public final void onClick(View view) {
            this.f133580a.f133579a.mo182499a(this.f133581b, true, this.f133582c);
        }
    }

    public SearchMoreBinder(SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickHandler");
        this.f133579a = bVar;
    }

    /* renamed from: a */
    public final void mo184767a(int i, SearchMoreInfo searchMoreInfo, SearchShowMoreViewHolder lVar) {
        Intrinsics.checkParameterIsNotNull(searchMoreInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(lVar, "holder");
        lVar.mo184988a().setText(searchMoreInfo.getTitle());
        if (searchMoreInfo.isHasMore()) {
            lVar.mo184989b().setVisibility(0);
        } else {
            lVar.mo184989b().setVisibility(8);
        }
        lVar.itemView.setOnClickListener(new View$OnClickListenerC53981a(this, searchMoreInfo, i));
    }
}
