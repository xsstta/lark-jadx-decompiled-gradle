package com.ss.lark.android.passport.biz.widget.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.ImeObserver;
import com.ss.android.lark.passport.infra.util.p2441c.C49173f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u000bJ\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\u001f\u001a\u00020\bR\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/layout/BaseContainerLayout;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/LifecycleOwner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "observeImeLazy", "", "getObserveImeLazy", "()Lkotlin/Unit;", "observeImeLazy$delegate", "Lkotlin/Lazy;", "viewLifecycle", "Landroidx/lifecycle/Lifecycle;", "getViewLifecycle", "()Landroidx/lifecycle/Lifecycle;", "viewLifecycle$delegate", "enableAdjustResize", "getLifecycle", "inflateCommonLayout", "Lcom/ss/lark/android/passport/biz/widget/layout/CommonContainerLayout;", "partialLayoutRes", "inflateFullLayout", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "layoutId", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BaseContainerLayout extends FrameLayout implements LifecycleOwner {

    /* renamed from: a */
    private final Lazy f164427a;

    /* renamed from: b */
    private final Lazy f164428b;

    public BaseContainerLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public BaseContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Unit getObserveImeLazy() {
        return (Unit) this.f164428b.getValue();
    }

    private final Lifecycle getViewLifecycle() {
        return (Lifecycle) this.f164427a.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getViewLifecycle();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/Lifecycle;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.BaseContainerLayout$b */
    static final class C65303b extends Lambda implements Function0<Lifecycle> {
        final /* synthetic */ BaseContainerLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65303b(BaseContainerLayout baseContainerLayout) {
            super(0);
            this.this$0 = baseContainerLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Lifecycle invoke() {
            BaseContainerLayout baseContainerLayout = this.this$0;
            return C49173f.m193887a(baseContainerLayout, baseContainerLayout);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.layout.BaseContainerLayout$a */
    public static final class C65301a extends Lambda implements Function0<Unit> {
        final /* synthetic */ BaseContainerLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65301a(BaseContainerLayout baseContainerLayout) {
            super(0);
            this.this$0 = baseContainerLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ImeObserver.f123492d.mo171702a(this.this$0).f123495c.mo5923a(this.this$0, new AbstractC1178x<ImeObserver.ImeInfo>(this) {
                /* class com.ss.lark.android.passport.biz.widget.layout.BaseContainerLayout.C65301a.C653021 */

                /* renamed from: a */
                final /* synthetic */ C65301a f164429a;

                {
                    this.f164429a = r1;
                }

                /* renamed from: a */
                public final void onChanged(ImeObserver.ImeInfo bVar) {
                    C49173f.m193889a(this.f164429a.this$0, 0, 0, 0, bVar.f123500b, 7, null);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo224655a(int i) {
        View findViewById = findViewById(R.id.vs_full_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.vs_full_layout)");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(i);
        viewStub.inflate();
    }

    /* renamed from: b */
    public final CommonContainerLayout mo224656b(int i) {
        mo224655a(R.layout.signin_sdk_common_layout);
        CommonContainerLayout commonContainerLayout = (CommonContainerLayout) findViewById(R.id.layout_root);
        commonContainerLayout.mo224660a(i);
        Intrinsics.checkExpressionValueIsNotNull(commonContainerLayout, "commonContainer");
        return commonContainerLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f164427a = LazyKt.lazy(new C65303b(this));
        this.f164428b = LazyKt.lazy(new C65301a(this));
        View.inflate(context, R.layout.signin_sdk_common_base_container, this);
        if (getId() == -1) {
            setId(R.id.signin_sdk_widget_root_container);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseContainerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
