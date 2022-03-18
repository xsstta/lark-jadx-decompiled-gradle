package com.ss.android.lark.calendar.impl.features.calendarview.days.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001bB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/ExpandArrowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAllDayTV", "Landroid/widget/TextView;", "mArrowClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/ExpandArrowView$OnArrowClickListener;", "mExpandArrowIV", "Landroid/widget/ImageView;", "mExpandStatus", "", "initListener", "", "initView", "isExpandStatus", "setArrowClick", "listener", "setArrowVisible", "isShow", "setExpandStatus", UpdateKey.STATUS, "OnArrowClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ExpandArrowView extends FrameLayout {

    /* renamed from: a */
    public boolean f77401a;

    /* renamed from: b */
    public OnArrowClickListener f77402b;

    /* renamed from: c */
    public final ImageView f77403c;

    /* renamed from: d */
    private final TextView f77404d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/ExpandArrowView$OnArrowClickListener;", "", "onClick", "", "isExpand", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.ExpandArrowView$a */
    public interface OnArrowClickListener {
        /* renamed from: a */
        void mo111072a(boolean z);
    }

    public ExpandArrowView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ExpandArrowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final boolean mo111375b() {
        return this.f77401a;
    }

    /* renamed from: a */
    public final void mo111374a() {
        this.f77403c.setVisibility(4);
        setOnClickListener(new View$OnClickListenerC30789b(this));
    }

    /* renamed from: c */
    private final void m114852c() {
        this.f77404d.setTextSize(11.0f);
        this.f77404d.setTextColor(C32634ae.m125178a(R.color.lkui_N500));
        this.f77404d.setText(R.string.Calendar_Edit_Allday);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = UIUtils.dp2px(getContext(), 5.0f);
        addView(this.f77404d, layoutParams);
        int a = C57582a.m223600a(12);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a, a);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = UIUtils.dp2px(getContext(), 2.0f);
        addView(this.f77403c, layoutParams2);
        ao.m125223a((View) this.f77403c, 4, 4);
        this.f77403c.setImageResource(R.drawable.ud_icon_expand_down_filled);
        this.f77403c.setColorFilter(C57582a.m223616d(getContext(), R.color.icon_n3));
        setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
    }

    public final void setExpandStatus(boolean z) {
        this.f77401a = z;
    }

    public final void setArrowClick(OnArrowClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f77402b = aVar;
    }

    public final void setArrowVisible(boolean z) {
        if (z) {
            this.f77403c.setVisibility(0);
            boolean z2 = this.f77401a;
            if (z2) {
                this.f77403c.setImageResource(R.drawable.ud_icon_expand_up_filled);
            } else if (!z2) {
                this.f77403c.setImageResource(R.drawable.ud_icon_expand_down_filled);
            }
            this.f77403c.setColorFilter(C57582a.m223616d(getContext(), R.color.icon_n3));
            return;
        }
        this.f77403c.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.widget.ExpandArrowView$b */
    public static final class View$OnClickListenerC30789b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExpandArrowView f77405a;

        View$OnClickListenerC30789b(ExpandArrowView expandArrowView) {
            this.f77405a = expandArrowView;
        }

        public final void onClick(View view) {
            ExpandArrowView expandArrowView = this.f77405a;
            expandArrowView.f77401a = !expandArrowView.f77401a;
            if (this.f77405a.f77401a) {
                this.f77405a.f77403c.setImageResource(R.drawable.ud_icon_expand_up_filled);
            } else {
                this.f77405a.f77403c.setImageResource(R.drawable.ud_icon_expand_down_filled);
            }
            this.f77405a.f77403c.setColorFilter(C57582a.m223616d(this.f77405a.getContext(), R.color.icon_n3));
            OnArrowClickListener aVar = this.f77405a.f77402b;
            if (aVar != null) {
                aVar.mo111072a(this.f77405a.f77401a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77404d = new TextView(context);
        this.f77403c = new ImageView(context);
        m114852c();
        mo111374a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpandArrowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
