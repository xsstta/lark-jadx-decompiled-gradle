package com.larksuite.component.ignition.widget.setting_group;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\n\u0010!\u001a\u0004\u0018\u00010\u001fH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0002J(\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0014J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002R&\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0013@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006*"}, d2 = {"Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "dividerBackgroundColor", "getDividerBackgroundColor", "()I", "setDividerBackgroundColor", "(I)V", "", "hasDivider", "getHasDivider", "()Z", "setHasDivider", "(Z)V", "itemBackgroundColor", "getItemBackgroundColor", "setItemBackgroundColor", "adjustBackground", "", "child", "Landroid/view/View;", "applyAttrs", "getFirstVisibleChild", "getLastVisibleChild", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "setItemBackground", "setupDivider", "ignition-widget-settinggroup_release"}, mo238835k = 1, mv = {1, 1, 15})
public class SettingGroupLayout extends LinearLayout {

    /* renamed from: a */
    private int f60001a;

    /* renamed from: b */
    private boolean f60002b;

    /* renamed from: c */
    private int f60003c;

    public final int getDividerBackgroundColor() {
        return this.f60003c;
    }

    public final boolean getHasDivider() {
        return this.f60002b;
    }

    public final int getItemBackgroundColor() {
        return this.f60001a;
    }

    /* renamed from: a */
    private final void mo169845a() {
        if (getChildCount() > 0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
                m88797a(childAt);
            }
        }
    }

    /* renamed from: b */
    private final void m88798b() {
        if (this.f60002b) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            SettingGroupDividerDrawable bVar = new SettingGroupDividerDrawable(context);
            bVar.mo87052b(UIUtils.getColor(getContext(), this.f60003c));
            setDividerDrawable(bVar);
            setShowDividers(2);
            return;
        }
        setDividerDrawable(null);
        setShowDividers(0);
    }

    private final View getFirstVisibleChild() {
        Object obj;
        boolean z;
        Iterator it = RangesKt.until(0, getChildCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            View childAt = getChildAt(((Number) obj).intValue());
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
            if (childAt.getVisibility() == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return getChildAt(num.intValue());
        }
        return null;
    }

    private final View getLastVisibleChild() {
        Object obj;
        boolean z;
        Iterator it = RangesKt.downTo(getChildCount() - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            View childAt = getChildAt(((Number) obj).intValue());
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
            if (childAt.getVisibility() == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return getChildAt(num.intValue());
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingGroupLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setDividerBackgroundColor(int i) {
        if (this.f60003c != i) {
            this.f60003c = i;
            m88798b();
        }
    }

    public final void setHasDivider(boolean z) {
        if (this.f60002b != z) {
            this.f60002b = z;
            m88798b();
        }
    }

    public final void setItemBackgroundColor(int i) {
        if (this.f60001a != i) {
            this.f60001a = i;
            mo169845a();
        }
    }

    /* renamed from: a */
    private final void m88797a(View view) {
        View firstVisibleChild = getFirstVisibleChild();
        View lastVisibleChild = getLastVisibleChild();
        Drawable background = view.getBackground();
        if (!(background instanceof GradientDrawable)) {
            background = null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(UIUtils.getColorStateList(getContext(), this.f60001a));
        }
        SettingGroupUtils eVar = SettingGroupUtils.f60020a;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        eVar.mo87062a(gradientDrawable, context, Intrinsics.areEqual(firstVisibleChild, view), Intrinsics.areEqual(lastVisibleChild, view));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingGroupLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingGroupLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.IgnitionSettingGroupLayout);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m88796a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.dividerBackgroundColor, R.attr.hasDivider, R.attr.itemBackgroundColor}, i, i2);
        setHasDivider(obtainStyledAttributes.getBoolean(1, this.f60002b));
        setItemBackgroundColor(obtainStyledAttributes.getResourceId(2, R.color.bg_setting_group_item));
        setDividerBackgroundColor(obtainStyledAttributes.getResourceId(0, R.color.bg_body));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo169845a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingGroupLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f60001a = R.color.bg_setting_group_item;
        this.f60003c = R.color.bg_body;
        setOrientation(1);
        m88796a(attributeSet, i, i2);
    }
}
