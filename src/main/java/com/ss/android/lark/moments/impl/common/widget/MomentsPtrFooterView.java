package com.ss.android.lark.moments.impl.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.common.utils.SpinDrawableUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.AbstractC58934a;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u001c\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010 \u001a\u00020\u0011H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/MomentsPtrFooterView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/widget/ptr/LKUIPtrUIHandler;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getLoadingDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "loadingDrawable$delegate", "Lkotlin/Lazy;", "hideLoading", "", "onUIPositionChange", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "isUnderTouch", "", UpdateKey.STATUS, "", "ptrIndicator", "Lcom/ss/android/lark/widget/ptr/indicator/LKUIPtrIndicator;", "onUIRefreshBegin", "onUIRefreshComplete", "isHeader", "onUIRefreshPrepare", "onUIReset", "showLoading", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsPtrFooterView extends FrameLayout implements AbstractC58934a {

    /* renamed from: a */
    public final Context f119267a;

    /* renamed from: b */
    private final Lazy f119268b;

    /* renamed from: c */
    private HashMap f119269c;

    public MomentsPtrFooterView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MomentsPtrFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final CircularProgressDrawable getLoadingDrawable() {
        return (CircularProgressDrawable) this.f119268b.getValue();
    }

    /* renamed from: a */
    public View mo166236a(int i) {
        if (this.f119269c == null) {
            this.f119269c = new HashMap();
        }
        View view = (View) this.f119269c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119269c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
        Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        Intrinsics.checkParameterIsNotNull(aVar, "ptrIndicator");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.MomentsPtrFooterView$a */
    static final class C47287a extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ MomentsPtrFooterView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47287a(MomentsPtrFooterView momentsPtrFooterView) {
            super(0);
            this.this$0 = momentsPtrFooterView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            return SpinDrawableUtils.f119255a.mo166216a(this.this$0.f119267a, UIHelper.getColor(R.color.ud_N600), UIHelper.dp2px(6.0f), UIHelper.dp2px(2.0f));
        }
    }

    /* renamed from: a */
    private final void m187267a() {
        LinearLayout linearLayout = (LinearLayout) mo166236a(R.id.loadingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loadingContainer");
        linearLayout.setVisibility(0);
        getLoadingDrawable().start();
    }

    /* renamed from: b */
    private final void m187268b() {
        LinearLayout linearLayout = (LinearLayout) mo166236a(R.id.loadingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loadingContainer");
        linearLayout.setVisibility(4);
        if (getLoadingDrawable().isRunning()) {
            getLoadingDrawable().stop();
        }
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m187268b();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m187267a();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        m187267a();
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        m187268b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPtrFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f119267a = context;
        this.f119268b = LazyKt.lazy(new C47287a(this));
        LayoutInflater.from(context).inflate(R.layout.moments_ptr_footer, (ViewGroup) this, true);
        ((ImageView) mo166236a(R.id.ivLoading)).setImageDrawable(getLoadingDrawable());
        m187268b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MomentsPtrFooterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
