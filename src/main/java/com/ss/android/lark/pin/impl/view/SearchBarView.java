package com.ss.android.lark.pin.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010\u0011\u001a\u00020\u000fH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/pin/impl/view/SearchBarView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "interpolator", "Landroid/view/animation/Interpolator;", "mOriginSearchLayoutHeight", "changeAlpha", "", "offset", "init", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchBarView extends LinearLayout {

    /* renamed from: a */
    public static final Companion f128516a = new Companion(null);

    /* renamed from: b */
    private int f128517b;

    /* renamed from: c */
    private final Interpolator f128518c = animationInterpolatorC51648b.f128520a;

    /* renamed from: d */
    private HashMap f128519d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "getInterpolation"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.view.SearchBarView$b  reason: invalid class name */
    static final class animationInterpolatorC51648b implements Interpolator {

        /* renamed from: a */
        public static final animationInterpolatorC51648b f128520a = new animationInterpolatorC51648b();

        animationInterpolatorC51648b() {
        }

        public final float getInterpolation(float f) {
            return ((double) f) > 0.75d ? (f * 2.8f) - 1.8f : f * 0.4f;
        }
    }

    /* renamed from: b */
    public View mo177688b(int i) {
        if (this.f128519d == null) {
            this.f128519d = new HashMap();
        }
        View view = (View) this.f128519d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f128519d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/pin/impl/view/SearchBarView$Companion;", "", "()V", "SEARCH_BAR_HEIGHT", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.view.SearchBarView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m200368a() {
        LayoutInflater.from(getContext()).inflate(R.layout.chatpin_view_search_bar, (ViewGroup) this, true);
        this.f128517b = (int) C25653b.m91892a(getContext(), (float) 68);
    }

    public SearchBarView(Context context) {
        super(context);
        m200368a();
    }

    /* renamed from: a */
    public final void mo177687a(int i) {
        LinearLayout linearLayout = (LinearLayout) mo177688b(R.id.pin_search_bar);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "pin_search_bar");
        Interpolator interpolator = this.f128518c;
        int i2 = this.f128517b;
        linearLayout.setAlpha(interpolator.getInterpolation(((float) (i + i2)) / ((float) i2)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        m200368a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        m200368a();
    }
}
