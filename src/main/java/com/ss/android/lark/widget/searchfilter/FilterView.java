package com.ss.android.lark.widget.searchfilter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0014\u0010\u001a\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001f\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0017R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/widget/searchfilter/FilterView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "mFilterAdapter", "Lcom/ss/android/lark/widget/searchfilter/FilterAdapter;", "mFilterRv", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "mOnFilterItemClick", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "mOnResetClick", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnResetClick;", "mResetTv", "Landroid/widget/TextView;", "addAll", "", "collection", "", "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "hide", "initFilterView", "resetAll", "setOnFilterItemClick", "onFilterItemClick", "setOnResetClick", "onResetClick", "show", "update", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "IOnFilterItemClick", "IOnResetClick", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class FilterView extends FrameLayout {

    /* renamed from: c */
    public static final Companion f146573c = new Companion(null);

    /* renamed from: a */
    public IOnResetClick f146574a;

    /* renamed from: b */
    public IOnFilterItemClick f146575b;

    /* renamed from: d */
    private final Context f146576d;

    /* renamed from: e */
    private TextView f146577e;

    /* renamed from: f */
    private CommonRecyclerView f146578f;

    /* renamed from: g */
    private FilterAdapter f146579g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "", "onFilterItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.searchfilter.FilterView$b */
    public interface IOnFilterItemClick {
        /* renamed from: a */
        void mo41007a(FilterData bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnResetClick;", "", "onResetClick", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.searchfilter.FilterView$c */
    public interface IOnResetClick {
        /* renamed from: a */
        void mo41008a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/searchfilter/FilterView$Companion;", "", "()V", "TAG", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.searchfilter.FilterView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo200819a() {
        TextView textView = this.f146577e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResetTv");
        }
        textView.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo200822b() {
        TextView textView = this.f146577e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResetTv");
        }
        textView.setVisibility(0);
    }

    /* renamed from: c */
    private final void m229600c() {
        View findViewById = findViewById(R.id.filter_reset_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.filter_reset_tv)");
        this.f146577e = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.filter_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.filter_rv)");
        this.f146578f = (CommonRecyclerView) findViewById2;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f146579g = new FilterAdapter(context);
        TextView textView = this.f146577e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResetTv");
        }
        textView.setOnClickListener(new View$OnClickListenerC59114d(this));
        CommonRecyclerView commonRecyclerView = this.f146578f;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterRv");
        }
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(commonRecyclerView.getContext(), 0, false));
        FilterAdapter aVar = this.f146579g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterAdapter");
        }
        aVar.mo200835a(new C59115e(this));
        commonRecyclerView.setAdapter(aVar);
    }

    public final void setOnFilterItemClick(IOnFilterItemClick bVar) {
        this.f146575b = bVar;
    }

    public final void setOnResetClick(IOnResetClick cVar) {
        this.f146574a = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/widget/searchfilter/FilterView$initFilterView$2$1$1", "Lcom/ss/android/lark/widget/searchfilter/FilterView$IOnFilterItemClick;", "onFilterItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/searchfilter/FilterData;", "com.ss.android.lark.widget", "com/ss/android/lark/widget/searchfilter/FilterView$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.searchfilter.FilterView$e */
    public static final class C59115e implements IOnFilterItemClick {

        /* renamed from: a */
        final /* synthetic */ FilterView f146581a;

        C59115e(FilterView filterView) {
            this.f146581a = filterView;
        }

        @Override // com.ss.android.lark.widget.searchfilter.FilterView.IOnFilterItemClick
        /* renamed from: a */
        public void mo41007a(FilterData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IOnFilterItemClick bVar2 = this.f146581a.f146575b;
            if (bVar2 != null) {
                bVar2.mo41007a(bVar);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FilterView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/widget/searchfilter/FilterView$initFilterView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.searchfilter.FilterView$d */
    public static final class View$OnClickListenerC59114d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterView f146580a;

        View$OnClickListenerC59114d(FilterView filterView) {
            this.f146580a = filterView;
        }

        public final void onClick(View view) {
            Log.m165379d("LarkWidget.FilterView", "mResetTv onClick.");
            IOnResetClick cVar = this.f146580a.f146574a;
            if (cVar != null) {
                cVar.mo41008a();
            }
        }
    }

    /* renamed from: a */
    public final void mo200821a(Collection<? extends FilterData> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        if (!collection.isEmpty()) {
            FilterAdapter aVar = this.f146579g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterAdapter");
            }
            aVar.mo200838a(collection);
        }
    }

    /* renamed from: b */
    public final void mo200823b(Collection<? extends FilterData> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        if (!collection.isEmpty()) {
            FilterAdapter aVar = this.f146579g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterAdapter");
            }
            aVar.mo200840b(collection);
        }
    }

    /* renamed from: a */
    public final void mo200820a(FilterData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        FilterAdapter aVar = this.f146579g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterAdapter");
        }
        aVar.mo200837a(bVar);
        FilterAdapter aVar2 = this.f146579g;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterAdapter");
        }
        int b = aVar2.mo200839b(bVar);
        if (b >= 0) {
            FilterAdapter aVar3 = this.f146579g;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterAdapter");
            }
            if (b < aVar3.getItemCount()) {
                CommonRecyclerView commonRecyclerView = this.f146578f;
                if (commonRecyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFilterRv");
                }
                commonRecyclerView.scrollToPosition(b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        this.f146576d = context2;
        LayoutInflater.from(context2).inflate(R.layout.filter_view_layout, (ViewGroup) this, true);
        m229600c();
    }
}
