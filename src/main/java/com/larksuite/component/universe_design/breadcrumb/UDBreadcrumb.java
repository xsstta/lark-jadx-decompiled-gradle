package com.larksuite.component.universe_design.breadcrumb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\"\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\tH\u0002J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\tJ\u0006\u0010(\u001a\u00020\u001cJ\u0006\u0010)\u001a\u00020\u001cJ\u0010\u0010*\u001a\u00020\u001c2\b\b\u0001\u0010+\u001a\u00020\tJ\u0014\u0010,\u001a\u00020\u001c2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0.J\u0010\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u0014J\u0016\u00101\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumb;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mAdapter", "Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumbAdapter;", "getMAdapter", "()Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumbAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mInnerItemClickListener", "Lcom/larksuite/component/universe_design/breadcrumb/OnBreadcrumbItemClickListener;", "getMInnerItemClickListener", "()Lcom/larksuite/component/universe_design/breadcrumb/OnBreadcrumbItemClickListener;", "mInnerItemClickListener$delegate", "mItemClickListener", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "addItem", "", "item", "", "getItemCount", "getItemMaxWidth", "initAttributes", "set", "onItemClick", "index", "removeItems", "count", "removeLast", "removeLastOne", "scrollToEnd", "setItemMaxWidth", "maxWidth", "setItems", "items", "", "setOnItemClickListener", "listener", "updateItem", "universe-ui-breadcrumb_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDBreadcrumb extends FrameLayout {

    /* renamed from: a */
    private final Lazy f63082a;

    /* renamed from: b */
    private final RecyclerView f63083b;

    /* renamed from: c */
    private final Lazy f63084c;

    /* renamed from: d */
    private OnBreadcrumbItemClickListener f63085d;

    private final UDBreadcrumbAdapter getMAdapter() {
        return (UDBreadcrumbAdapter) this.f63084c.getValue();
    }

    public final OnBreadcrumbItemClickListener getMInnerItemClickListener() {
        return (OnBreadcrumbItemClickListener) this.f63082a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/larksuite/component/universe_design/breadcrumb/UDBreadcrumb$mInnerItemClickListener$2$1", "invoke", "()Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumb$mInnerItemClickListener$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb$b */
    static final class C25714b extends Lambda implements Function0<C257151> {
        final /* synthetic */ UDBreadcrumb this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25714b(UDBreadcrumb uDBreadcrumb) {
            super(0);
            this.this$0 = uDBreadcrumb;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C257151 invoke() {
            return new OnBreadcrumbItemClickListener(this) {
                /* class com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb.C25714b.C257151 */

                /* renamed from: a */
                final /* synthetic */ C25714b f63086a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f63086a = r1;
                }

                @Override // com.larksuite.component.universe_design.breadcrumb.OnBreadcrumbItemClickListener
                public void onItemClick(int i) {
                    this.f63086a.this$0.mo90285b(i);
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo90282a() {
        this.f63083b.scrollToPosition(getMAdapter().getItemCount() - 1);
    }

    public final int getItemCount() {
        return getMAdapter().getItemCount();
    }

    public final int getItemMaxWidth() {
        return getMAdapter().mo90293a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/breadcrumb/UDBreadcrumbAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.breadcrumb.UDBreadcrumb$a */
    static final class C25713a extends Lambda implements Function0<UDBreadcrumbAdapter> {
        final /* synthetic */ UDBreadcrumb this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25713a(UDBreadcrumb uDBreadcrumb) {
            super(0);
            this.this$0 = uDBreadcrumb;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDBreadcrumbAdapter invoke() {
            Context context = this.this$0.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            return new UDBreadcrumbAdapter(context, this.this$0.getMInnerItemClickListener());
        }
    }

    public final void setOnItemClickListener(OnBreadcrumbItemClickListener aVar) {
        this.f63085d = aVar;
    }

    /* renamed from: b */
    public final void mo90285b(int i) {
        OnBreadcrumbItemClickListener aVar = this.f63085d;
        if (aVar != null) {
            aVar.onItemClick(i);
        }
    }

    public final void setItemMaxWidth(int i) {
        getMAdapter().mo90295a(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDBreadcrumb(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setItems(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        getMAdapter().mo90299a(list);
    }

    /* renamed from: a */
    public final void mo90283a(int i) {
        if (i >= 0 && i < getMAdapter().getItemCount()) {
            getMAdapter().mo90296a(i, getMAdapter().getItemCount() - i);
        }
    }

    /* renamed from: a */
    public final void mo90284a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "item");
        getMAdapter().mo90298a(str);
        mo90282a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDBreadcrumb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDBreadcrumb(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.UDBreadcrumb);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m92442a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_breadcrumb_itemMaxWidth}, i, i2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        if (dimensionPixelSize >= 0) {
            getMAdapter().mo90295a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDBreadcrumb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63082a = LazyKt.lazy(new C25714b(this));
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f63083b = recyclerView;
        this.f63084c = LazyKt.lazy(new C25713a(this));
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        recyclerView.setAdapter(getMAdapter());
        Context context2 = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        int d = UDDimenUtils.m93313d(context2, R.dimen.ud_breadcrumb_recyclerview_padding);
        recyclerView.setPaddingRelative(d, 0, d, 0);
        Context context3 = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        recyclerView.addItemDecoration(new UDBreadcrumbItemDecoration(context3, R.drawable.ud_icon_right_bold_outlined));
        addView(recyclerView);
        m92442a(attributeSet, i, i2);
    }
}
