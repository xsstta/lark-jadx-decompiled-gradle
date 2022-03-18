package com.ss.android.lark.searchcommon.view.binder;

import android.view.View;
import com.bytedance.lark.pb.search.feedback.v1.SearchResult;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.Scene;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.searchcommon.dto.info.SearchFeedbackInfo;
import com.ss.android.lark.searchcommon.view.feedback.DialogC54011a;
import com.ss.android.lark.searchcommon.view.feedback.FeedBackView;
import com.ss.android.lark.searchcommon.view.feedback.SearchFeedbackViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/SearchFeedbackBinder;", "", "()V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchFeedbackInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/feedback/SearchFeedbackViewHolder;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.ab */
public final class SearchFeedbackBinder {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/SearchFeedbackBinder$bind$2$1", "Lcom/ss/android/lark/searchcommon/view/feedback/SearchFeedbackDialog$IFeedbackArgs;", "getIntegrationSearchRequest", "Lcom/bytedance/lark/pb/search/v1/IntegrationSearchRequest;", "getResults", "", "Lcom/bytedance/lark/pb/search/feedback/v1/SearchResult;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.ab$a */
    public static final class C53980a implements DialogC54011a.AbstractC54024b {

        /* renamed from: a */
        final /* synthetic */ SearchFeedbackInfo f133578a;

        @Override // com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.AbstractC54024b
        /* renamed from: b */
        public List<SearchResult> mo183185b() {
            return this.f133578a.getResults();
        }

        @Override // com.ss.android.lark.searchcommon.view.feedback.DialogC54011a.AbstractC54024b
        /* renamed from: a */
        public IntegrationSearchRequest mo183184a() {
            IntegrationSearchRequest a = new IntegrationSearchRequest.C18831a().mo64662a(this.f133578a.getQuery()).mo64664b(Integer.valueOf(this.f133578a.getEnd())).mo64660a(Scene.Type.SMART_SEARCH).mo64665b(this.f133578a.getSession()).mo64667d(this.f133578a.getImprId()).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "IntegrationSearchRequest…                 .build()");
            return a;
        }

        C53980a(SearchFeedbackInfo searchFeedbackInfo) {
            this.f133578a = searchFeedbackInfo;
        }
    }

    /* renamed from: a */
    public final void mo184766a(int i, SearchFeedbackInfo searchFeedbackInfo, SearchFeedbackViewHolder cVar) {
        Intrinsics.checkParameterIsNotNull(searchFeedbackInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        View a = cVar.mo184938a();
        cVar.mo184938a().setPadding(a.getPaddingLeft(), 0, a.getPaddingRight(), 0);
        cVar.mo184940c().setVisibility(0);
        cVar.mo184939b().setVisibility(0);
        if (cVar.itemView instanceof FeedBackView) {
            View view = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            FeedBackView feedBackView = (FeedBackView) view;
            feedBackView.setEntrance("below");
            feedBackView.setFeedbackArgs(new C53980a(searchFeedbackInfo));
        }
        if (searchFeedbackInfo.getShow()) {
            View view2 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            view2.setVisibility(0);
            return;
        }
        View view3 = cVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        view3.setVisibility(8);
    }
}
