package com.ss.android.lark.calendar.impl.features.calendars.selector.vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.C0768a;
import androidx.p042i.p043a.p044a.C1106i;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nJ\u0016\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\bJ\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0006\u0010'\u001a\u00020\u001cJ\u0006\u0010(\u001a\u00020\u001cJ\b\u0010)\u001a\u00020\u001cH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "mListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;)V", "fromSidebar", "", "mItemData", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "getMItemData", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "setMItemData", "(Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;)V", "getMListener$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;", "setMListener$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;)V", "getMView$calendar_impl_release", "()Landroid/view/View;", "setMView$calendar_impl_release", "(Landroid/view/View;)V", "smallSizePx", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "bindItem", "", "item", "bindPlainItem", "isVisible", "blinkAnimation", "getCalendarId", "", "hideLoading", "initManageIcon", "initManageListener", "initVisibleListener", "setSidebarStyle", "setSyncedFinished", "showLoading", "OnCellClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.c */
public final class CalendarCellVH extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private DataListItem f76178a;

    /* renamed from: b */
    private ValueAnimator f76179b;

    /* renamed from: c */
    private final int f76180c;

    /* renamed from: d */
    private boolean f76181d;

    /* renamed from: e */
    private View f76182e;

    /* renamed from: f */
    private OnCellClickListener f76183f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$OnCellClickListener;", "", "onGotoAccountManagePage", "", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onItemClick", "calendarId", "", "isVisible", "", "isLocalCal", "onManageIconClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.c$a */
    public interface OnCellClickListener {
        /* renamed from: a */
        void mo109740a(AccountDataListItem aVar);

        /* renamed from: a */
        void mo109741a(String str);

        /* renamed from: a */
        void mo109742a(String str, boolean z, boolean z2);
    }

    /* renamed from: a */
    public final DataListItem mo109848a() {
        return this.f76178a;
    }

    /* renamed from: g */
    public final View mo109855g() {
        return this.f76182e;
    }

    /* renamed from: h */
    public final OnCellClickListener mo109856h() {
        return this.f76183f;
    }

    /* renamed from: d */
    public final String mo109852d() {
        DataListItem dataListItem = this.f76178a;
        if (dataListItem != null) {
            return dataListItem.mo109806a();
        }
        return null;
    }

    /* renamed from: i */
    private final void m113146i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f76179b = ofFloat;
        if (ofFloat != null) {
            ofFloat.addUpdateListener(new C30433b(this));
        }
        ValueAnimator valueAnimator = this.f76179b;
        if (valueAnimator != null) {
            valueAnimator.setDuration(1000L);
            valueAnimator.setInterpolator(new LinearInterpolator());
            valueAnimator.setRepeatCount(2);
            valueAnimator.setRepeatMode(2);
            valueAnimator.start();
        }
    }

    /* renamed from: j */
    private final void m113147j() {
        Resources resources = this.f76182e.getResources();
        Context context = this.f76182e.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "mView.context");
        C1106i a = C1106i.m5238a(resources, (int) R.drawable.ud_icon_setting_outlined, context.getTheme());
        if (a != null) {
            a.setTint(C32634ae.m125178a(R.color.lkui_N500));
            ((ImageView) this.f76182e.findViewById(R.id.managerIcon)).setImageDrawable(a);
        }
    }

    /* renamed from: b */
    public final void mo109850b() {
        ImageView imageView = (ImageView) this.f76182e.findViewById(R.id.loadingCalendarIV);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mView.loadingCalendarIV");
        imageView.setVisibility(0);
        UDCheckBox uDCheckBox = (UDCheckBox) this.f76182e.findViewById(R.id.checkBox);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "mView.checkBox");
        uDCheckBox.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo109851c() {
        UDCheckBox uDCheckBox = (UDCheckBox) this.f76182e.findViewById(R.id.checkBox);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "mView.checkBox");
        uDCheckBox.setVisibility(0);
        ImageView imageView = (ImageView) this.f76182e.findViewById(R.id.loadingCalendarIV);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mView.loadingCalendarIV");
        imageView.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo109853e() {
        boolean z;
        UDCheckBox uDCheckBox = (UDCheckBox) this.f76182e.findViewById(R.id.checkBox);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "mView.checkBox");
        DataListItem dataListItem = this.f76178a;
        if (dataListItem != null) {
            z = dataListItem.mo109816c();
        } else {
            z = false;
        }
        uDCheckBox.setChecked(z);
        DataListItem dataListItem2 = this.f76178a;
        if (dataListItem2 != null) {
            dataListItem2.mo109815c(false);
        }
        mo109851c();
    }

    /* renamed from: f */
    public final void mo109854f() {
        ViewGroup.LayoutParams layoutParams = this.f76182e.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = C32659l.m125335a((Number) 44);
            marginLayoutParams.topMargin = C32659l.m125335a((Number) 5);
            this.f76182e.setLayoutParams(marginLayoutParams);
        }
        UDCheckBox uDCheckBox = (UDCheckBox) this.f76182e.findViewById(R.id.checkBox);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "mView.checkBox");
        ViewGroup.LayoutParams layoutParams2 = uDCheckBox.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = C32659l.m125335a((Number) 20);
            layoutParams2.height = C32659l.m125335a((Number) 20);
            UDCheckBox uDCheckBox2 = (UDCheckBox) this.f76182e.findViewById(R.id.checkBox);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "mView.checkBox");
            uDCheckBox2.setLayoutParams(layoutParams2);
        }
        ((UDCheckBox) this.f76182e.findViewById(R.id.checkBox)).setSize(UDCheckBox.CheckBoxSize.NORMAL_SIZE);
        this.f76181d = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/vh/CalendarCellVH$initManageListener$listener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.c$c */
    public static final class C30434c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ CalendarCellVH f76185a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30434c(CalendarCellVH cVar) {
            this.f76185a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            DataListItem a = this.f76185a.mo109848a();
            if (a != null) {
                OnCellClickListener h = this.f76185a.mo109856h();
                String a2 = a.mo109806a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "it.calServerId");
                h.mo109741a(a2);
                CalendarHitPoint.m124104F();
            }
        }
    }

    /* renamed from: b */
    private final void m113144b(DataListItem dataListItem) {
        this.f76182e.setOnClickListener(new View$OnClickListenerC30435d(this, dataListItem));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.c$b */
    public static final class C30433b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCellVH f76184a;

        C30433b(CalendarCellVH cVar) {
            this.f76184a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f76184a.mo109855g().setBackgroundColor(C0768a.m3716c(UIHelper.getColor(R.color.ud_Y100), (int) (((Float) animatedValue).floatValue() * ((float) 255))));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.c$d */
    public static final class View$OnClickListenerC30435d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCellVH f76186a;

        /* renamed from: b */
        final /* synthetic */ DataListItem f76187b;

        View$OnClickListenerC30435d(CalendarCellVH cVar, DataListItem dataListItem) {
            this.f76186a = cVar;
            this.f76187b = dataListItem;
        }

        public final void onClick(View view) {
            boolean z;
            if (!TextUtils.isEmpty(this.f76187b.mo109806a())) {
                UDCheckBox uDCheckBox = (UDCheckBox) this.f76186a.mo109855g().findViewById(R.id.checkBox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "mView.checkBox");
                UDCheckBox uDCheckBox2 = (UDCheckBox) this.f76186a.mo109855g().findViewById(R.id.checkBox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "mView.checkBox");
                uDCheckBox.setChecked(!uDCheckBox2.isChecked());
                UDCheckBox uDCheckBox3 = (UDCheckBox) this.f76186a.mo109855g().findViewById(R.id.checkBox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "mView.checkBox");
                if (!uDCheckBox3.isChecked() || this.f76187b.mo109824i()) {
                    this.f76186a.mo109851c();
                } else {
                    DataListItem a = this.f76186a.mo109848a();
                    if (a != null) {
                        a.mo109815c(true);
                    }
                    this.f76186a.mo109850b();
                }
                UDCheckBox uDCheckBox4 = (UDCheckBox) this.f76186a.mo109855g().findViewById(R.id.checkBox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "mView.checkBox");
                boolean isChecked = uDCheckBox4.isChecked();
                Calendar.Type h = this.f76187b.mo109823h();
                Intrinsics.checkExpressionValueIsNotNull(h, "item.calType");
                GeneralHitPoint.m124221a(isChecked, h);
                OnCellClickListener h2 = this.f76186a.mo109856h();
                String a2 = this.f76187b.mo109806a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "item.calServerId");
                boolean z2 = !this.f76187b.mo109816c();
                DataListItem a3 = this.f76186a.mo109848a();
                if (a3 != null) {
                    z = a3.mo109836u();
                } else {
                    z = false;
                }
                h2.mo109742a(a2, z2, z);
            }
        }
    }

    /* renamed from: c */
    private final void m113145c(DataListItem dataListItem) {
        DataListItem dataListItem2 = this.f76178a;
        if ((dataListItem2 == null || !dataListItem2.mo109836u()) && dataListItem.mo109822g()) {
            C30434c cVar = new C30434c(this);
            ((ImageView) this.f76182e.findViewById(R.id.managerIcon)).setOnClickListener(cVar);
            ((FrameLayout) this.f76182e.findViewById(R.id.managerLayout)).setOnClickListener(cVar);
            ao.m125223a((View) ((ImageView) this.f76182e.findViewById(R.id.managerIcon)), 16, 14);
            if (this.f76181d) {
                ImageView imageView = (ImageView) this.f76182e.findViewById(R.id.managerIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "mView.managerIcon");
                imageView.setVisibility(8);
                FrameLayout frameLayout = (FrameLayout) this.f76182e.findViewById(R.id.managerLayout);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mView.managerLayout");
                frameLayout.setVisibility(0);
                return;
            }
            ImageView imageView2 = (ImageView) this.f76182e.findViewById(R.id.managerIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "mView.managerIcon");
            imageView2.setVisibility(0);
            FrameLayout frameLayout2 = (FrameLayout) this.f76182e.findViewById(R.id.managerLayout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mView.managerLayout");
            frameLayout2.setVisibility(8);
            return;
        }
        ao.m125222a((ImageView) this.f76182e.findViewById(R.id.managerIcon));
        ImageView imageView3 = (ImageView) this.f76182e.findViewById(R.id.managerIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "mView.managerIcon");
        imageView3.setVisibility(8);
        FrameLayout frameLayout3 = (FrameLayout) this.f76182e.findViewById(R.id.managerLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mView.managerLayout");
        frameLayout3.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0166  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109849a(com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem r8) {
        /*
        // Method dump skipped, instructions count: 388
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH.mo109849a(com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarCellVH(View view, OnCellClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "mView");
        Intrinsics.checkParameterIsNotNull(aVar, "mListener");
        this.f76182e = view;
        this.f76183f = aVar;
        this.f76180c = C57582a.m223601a(view.getContext(), 14.0f);
    }
}
