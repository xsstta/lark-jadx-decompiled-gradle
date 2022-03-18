package com.ss.android.lark.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0007H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J0\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u001dH\u0004R\u0014\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\f¨\u0006("}, d2 = {"Lcom/ss/android/lark/keyboard/widget/KBPluginContainerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "horizontalPadding", "getHorizontalPadding", "()I", "lastLayoutChildrenHash", "pluginLayoutManager", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "getPluginLayoutManager", "()Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "setPluginLayoutManager", "(Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;)V", "resetChildrenMargin", "", "verticalPadding", "getVerticalPadding", "computeCurrentLayoutChildrenHash", "getVisibleChildren", "", "Landroid/view/View;", "onLayout", "", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "resetChildrenMarginAndPaddingIfNeed", "setupChildrenMargin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public class KBPluginContainerView extends LinearLayout {

    /* renamed from: a */
    private IPluginLayoutManager f104777a;

    /* renamed from: b */
    private final int f104778b;

    /* renamed from: c */
    private final int f104779c;

    /* renamed from: d */
    private int f104780d;

    /* renamed from: e */
    private boolean f104781e;

    public KBPluginContainerView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public KBPluginContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public KBPluginContainerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    /* access modifiers changed from: protected */
    public int getHorizontalPadding() {
        return this.f104779c;
    }

    public IPluginLayoutManager getPluginLayoutManager() {
        return this.f104777a;
    }

    /* access modifiers changed from: protected */
    public int getVerticalPadding() {
        return this.f104778b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo148214a() {
        List<View> visibleChildren = getVisibleChildren();
        if (!visibleChildren.isEmpty()) {
            this.f104780d = m162977c();
            getPluginLayoutManager().mo147347a(this, visibleChildren);
        }
    }

    /* renamed from: c */
    private final int m162977c() {
        int i = 0;
        for (T t : getVisibleChildren()) {
            ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i = (((((i * 31) + t.hashCode()) * 31) + marginLayoutParams.leftMargin) * 31) + marginLayoutParams.rightMargin;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return i;
    }

    private final List<View> getVisibleChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "childView");
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final boolean m162976b() {
        if (m162977c() == this.f104780d) {
            return false;
        }
        List<View> visibleChildren = getVisibleChildren();
        if (visibleChildren.isEmpty()) {
            return false;
        }
        int size = visibleChildren.size();
        for (int i = 0; i < size; i++) {
            View view = visibleChildren.get(i);
            if (i == 0) {
                view.setPadding(0, getVerticalPadding(), getHorizontalPadding(), getVerticalPadding());
            } else {
                view.setPadding(getVerticalPadding(), getVerticalPadding(), getHorizontalPadding(), getVerticalPadding());
            }
            C41112g.m163057a(view, 0, 0);
        }
        return true;
    }

    public void setPluginLayoutManager(IPluginLayoutManager eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "<set-?>");
        this.f104777a = eVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f104781e |= m162976b();
        super.onMeasure(i, i2);
    }

    public KBPluginContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f104777a = new DefaultPluginLayoutManager();
        this.f104778b = UIUtils.getDimens(context, R.dimen.keyboard_icon_vertical_padding);
        this.f104779c = UIUtils.getDimens(context, R.dimen.keyboard_icon_horizontal_padding);
        setOrientation(0);
        setGravity(16);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f104781e) {
            this.f104781e = false;
            mo148214a();
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KBPluginContainerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
