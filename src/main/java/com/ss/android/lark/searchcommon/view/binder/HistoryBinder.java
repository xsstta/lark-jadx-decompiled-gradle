package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchHistoryListInfo;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.view.SearchHistoryViewHolder;
import com.ss.android.lark.searchcommon.view.foldtag.DefaultFoldView;
import com.ss.android.lark.searchcommon.view.foldtag.FoldTagAdapter;
import com.ss.android.lark.searchcommon.view.foldtag.FoldTagFlowLayout;
import com.ss.android.lark.searchcommon.view.foldtag.IFoldView;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/HistoryBinder;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "bind", "", "position", "", "historyData", "Lcom/ss/android/lark/searchcommon/dto/info/SearchHistoryListInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/SearchHistoryViewHolder;", "listener", "Lcom/ss/android/lark/searchcommon/view/binder/OnHistoryTagClickListener;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.m */
public final class HistoryBinder {

    /* renamed from: a */
    private final Context f133647a;

    /* renamed from: a */
    public final Context mo184841a() {
        return this.f133647a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/HistoryBinder$bind$adapter$1", "Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagAdapter;", "Lcom/ss/android/lark/searchcommon/service/entity/history/SearchInfoHistory;", "getFoldView", "Lcom/ss/android/lark/searchcommon/view/foldtag/IFoldView;", "getView", "Landroid/view/View;", "parent", "Lcom/larksuite/framework/ui/flowlayout/FlowLayout;", "position", "", "t", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.m$a */
    public static final class C53992a extends FoldTagAdapter<SearchInfoHistory> {

        /* renamed from: a */
        final /* synthetic */ HistoryBinder f133648a;

        /* renamed from: b */
        final /* synthetic */ OnHistoryTagClickListener f133649b;

        /* renamed from: c */
        final /* synthetic */ SearchHistoryListInfo f133650c;

        @Override // com.ss.android.lark.searchcommon.view.foldtag.FoldTagAdapter
        /* renamed from: d */
        public IFoldView mo184649d() {
            DefaultFoldView aVar = new DefaultFoldView(this.f133648a.mo184841a());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C57582a.m223600a(30), C57582a.m223600a(28));
            int a = C57582a.m223601a(aVar.getContext(), 6.0f);
            marginLayoutParams.setMargins(a, a, a, a);
            aVar.setLayoutParams(marginLayoutParams);
            return aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/searchcommon/view/binder/HistoryBinder$bind$adapter$1$getView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.view.binder.m$a$a */
        public static final class View$OnClickListenerC53993a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53992a f133651a;

            /* renamed from: b */
            final /* synthetic */ SearchInfoHistory f133652b;

            /* renamed from: c */
            final /* synthetic */ int f133653c;

            View$OnClickListenerC53993a(C53992a aVar, SearchInfoHistory searchInfoHistory, int i) {
                this.f133651a = aVar;
                this.f133652b = searchInfoHistory;
                this.f133653c = i;
            }

            public final void onClick(View view) {
                OnHistoryTagClickListener uVar = this.f133651a.f133649b;
                if (uVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view, "it");
                    uVar.mo183180a(view, this.f133652b, this.f133653c);
                }
            }
        }

        /* renamed from: a */
        public View mo93290a(FlowLayout flowLayout, int i, SearchInfoHistory searchInfoHistory) {
            Intrinsics.checkParameterIsNotNull(searchInfoHistory, "t");
            View inflate = LayoutInflater.from(this.f133648a.mo184841a()).inflate(R.layout.search_history_item, (ViewGroup) null);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int a = C57582a.m223601a(textView.getContext(), 6.0f);
                marginLayoutParams.setMargins(a, a, a, a);
                textView.setLayoutParams(marginLayoutParams);
                textView.setText(searchInfoHistory.getQuery());
                textView.setOnClickListener(new View$OnClickListenerC53993a(this, searchInfoHistory, i));
                return textView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53992a(HistoryBinder mVar, OnHistoryTagClickListener uVar, SearchHistoryListInfo searchHistoryListInfo, List list) {
            super(list);
            this.f133648a = mVar;
            this.f133649b = uVar;
            this.f133650c = searchHistoryListInfo;
        }
    }

    public HistoryBinder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f133647a = context;
    }

    /* renamed from: a */
    public final void mo184842a(int i, SearchHistoryListInfo searchHistoryListInfo, SearchHistoryViewHolder dVar, OnHistoryTagClickListener uVar) {
        Intrinsics.checkParameterIsNotNull(searchHistoryListInfo, "historyData");
        Intrinsics.checkParameterIsNotNull(dVar, "holder");
        C53992a aVar = new C53992a(this, uVar, searchHistoryListInfo, searchHistoryListInfo.getHistoryList());
        FoldTagFlowLayout a = dVar.mo184887a();
        a.setMIsNeedFold(true);
        a.setMMaxLineCount(searchHistoryListInfo.getMaxRows());
        int a2 = C57582a.m223600a(2);
        a.setPadding(a2, 0, a2, 0);
        a.setAdapter((FoldTagAdapter<?>) aVar);
    }
}
