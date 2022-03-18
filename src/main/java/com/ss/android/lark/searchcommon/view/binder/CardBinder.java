package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.view.SearchCardViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.recommend.IOnMoreClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CardBinder;", "", "onItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bind", "", "position", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchCardInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/SearchCardViewHolder;", "onItemOnScreenListener", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.f */
public final class CardBinder {

    /* renamed from: a */
    public static final Companion f133625a = new Companion(null);

    /* renamed from: b */
    private final SearchResultViewAdapter.IOnItemClickHandler f133626b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/CardBinder$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CardBinder(SearchResultViewAdapter.IOnItemClickHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onItemClickHandler");
        this.f133626b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/CardBinder$bind$1$3", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "onMoreClick", "", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.f$b */
    public static final class C53986b implements IOnMoreClickListener {

        /* renamed from: a */
        final /* synthetic */ CardBinder f133627a;

        /* renamed from: b */
        final /* synthetic */ SearchCardInfo f133628b;

        /* renamed from: c */
        final /* synthetic */ SearchResultViewAdapter.IOnItemOnScreenListener f133629c;

        @Override // com.ss.android.lark.searchcommon.view.recommend.IOnMoreClickListener
        /* renamed from: a */
        public void mo183188a(int i) {
            SearchClickReporter eVar = SearchClickReporter.f133152a;
            SearchCardInfo searchCardInfo = this.f133628b;
            eVar.mo183816a(searchCardInfo, "main", searchCardInfo.getLocation(), Integer.valueOf(i + 1));
        }

        C53986b(CardBinder fVar, SearchCardInfo searchCardInfo, SearchResultViewAdapter.IOnItemOnScreenListener cVar) {
            this.f133627a = fVar;
            this.f133628b = searchCardInfo;
            this.f133629c = cVar;
        }
    }

    /* renamed from: a */
    public final void mo184819a(int i, SearchCardInfo searchCardInfo, SearchCardViewHolder cVar, SearchResultViewAdapter.IOnItemOnScreenListener cVar2) {
        Intrinsics.checkParameterIsNotNull(searchCardInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        RecyclerView a = cVar.mo184886a();
        a.setLayoutManager(new CardBinder$bind$$inlined$run$lambda$1(a, a.getContext(), searchCardInfo.getColumnLimit(), this, searchCardInfo, cVar2));
        Context context = a.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        CardAdapter eVar = new CardAdapter(context, searchCardInfo, this.f133626b);
        eVar.mo184814a(cVar2);
        a.setAdapter(eVar);
        CardAdapter eVar2 = null;
        if (searchCardInfo.getExpand()) {
            RecyclerView.Adapter adapter = a.getAdapter();
            if (adapter instanceof CardAdapter) {
                eVar2 = adapter;
            }
            CardAdapter eVar3 = (CardAdapter) eVar2;
            if (eVar3 != null) {
                eVar3.diff(searchCardInfo.getInfoList());
            }
        } else {
            RecyclerView.Adapter adapter2 = a.getAdapter();
            if (adapter2 instanceof CardAdapter) {
                eVar2 = adapter2;
            }
            CardAdapter eVar4 = eVar2;
            if (eVar4 != null) {
                eVar4.diff(searchCardInfo.getTopRowList());
            }
        }
        searchCardInfo.setOnMoreClickListener(new C53986b(this, searchCardInfo, cVar2));
    }
}
