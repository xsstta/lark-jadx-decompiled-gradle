package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.dto.info.SearchActionRecommend;
import com.ss.android.lark.searchcommon.dto.info.SearchActionRecommendInfo;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "bind", "", "position", "", "historyData", "Lcom/ss/android/lark/searchcommon/dto/info/SearchActionRecommendInfo;", "holder", "Lcom/ss/android/lark/searchcommon/view/SearchHistoryViewHolder;", "listener", "Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$OnActionTagClickListener;", "OnActionTagClickListener", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.a */
public final class ActionRecommendBinder {

    /* renamed from: a */
    private final Context f133570a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$OnActionTagClickListener;", "", "onTagClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchActionRecommend;", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.a$a */
    public interface OnActionTagClickListener {
        /* renamed from: a */
        void mo183181a(View view, SearchActionRecommend searchActionRecommend, int i);
    }

    /* renamed from: a */
    public final Context mo184762a() {
        return this.f133570a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$bind$adapter$1", "Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagAdapter;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchActionRecommend;", "getFoldView", "Lcom/ss/android/lark/searchcommon/view/foldtag/IFoldView;", "getView", "Landroid/view/View;", "parent", "Lcom/larksuite/framework/ui/flowlayout/FlowLayout;", "position", "", "t", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.a$b */
    public static final class C53977b extends FoldTagAdapter<SearchActionRecommend> {

        /* renamed from: a */
        final /* synthetic */ ActionRecommendBinder f133571a;

        /* renamed from: b */
        final /* synthetic */ OnActionTagClickListener f133572b;

        /* renamed from: c */
        final /* synthetic */ SearchActionRecommendInfo f133573c;

        @Override // com.ss.android.lark.searchcommon.view.foldtag.FoldTagAdapter
        /* renamed from: d */
        public IFoldView mo184649d() {
            DefaultFoldView aVar = new DefaultFoldView(this.f133571a.mo184762a());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C57582a.m223600a(30), C57582a.m223600a(28));
            int a = C57582a.m223601a(aVar.getContext(), 6.0f);
            marginLayoutParams.setMargins(a, a, a, a);
            aVar.setLayoutParams(marginLayoutParams);
            return aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$bind$adapter$1$getView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.view.binder.a$b$a */
        public static final class View$OnClickListenerC53978a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C53977b f133574a;

            /* renamed from: b */
            final /* synthetic */ SearchActionRecommend f133575b;

            /* renamed from: c */
            final /* synthetic */ int f133576c;

            View$OnClickListenerC53978a(C53977b bVar, SearchActionRecommend searchActionRecommend, int i) {
                this.f133574a = bVar;
                this.f133575b = searchActionRecommend;
                this.f133576c = i;
            }

            public final void onClick(View view) {
                OnActionTagClickListener aVar = this.f133574a.f133572b;
                if (aVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view, "it");
                    aVar.mo183181a(view, this.f133575b, this.f133576c);
                }
            }
        }

        /* renamed from: a */
        public View mo93290a(FlowLayout flowLayout, int i, SearchActionRecommend searchActionRecommend) {
            Intrinsics.checkParameterIsNotNull(searchActionRecommend, "t");
            View inflate = LayoutInflater.from(this.f133571a.mo184762a()).inflate(R.layout.search_history_item, (ViewGroup) null);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int a = C57582a.m223601a(textView.getContext(), 6.0f);
                marginLayoutParams.setMargins(a, a, a, a);
                textView.setLayoutParams(marginLayoutParams);
                textView.setText(searchActionRecommend.getText());
                textView.setOnClickListener(new View$OnClickListenerC53978a(this, searchActionRecommend, i));
                return textView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53977b(ActionRecommendBinder aVar, OnActionTagClickListener aVar2, SearchActionRecommendInfo searchActionRecommendInfo, List list) {
            super(list);
            this.f133571a = aVar;
            this.f133572b = aVar2;
            this.f133573c = searchActionRecommendInfo;
        }
    }

    public ActionRecommendBinder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f133570a = context;
    }

    /* renamed from: a */
    public final void mo184763a(int i, SearchActionRecommendInfo searchActionRecommendInfo, SearchHistoryViewHolder dVar, OnActionTagClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(searchActionRecommendInfo, "historyData");
        Intrinsics.checkParameterIsNotNull(dVar, "holder");
        C53977b bVar = new C53977b(this, aVar, searchActionRecommendInfo, searchActionRecommendInfo.getActionRecommends());
        FoldTagFlowLayout a = dVar.mo184887a();
        a.setMIsNeedFold(false);
        a.setMMaxLineCount(searchActionRecommendInfo.getMaxRows());
        int a2 = C57582a.m223600a(2);
        a.setPadding(a2, 0, a2, 0);
        a.setAdapter((FoldTagAdapter<?>) bVar);
    }
}
