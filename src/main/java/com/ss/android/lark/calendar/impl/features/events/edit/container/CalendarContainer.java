package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventCalendarData;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.RoundRectDrawable;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002J \u0010\u000f\u001a\u00020\n2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\bJ\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002JV\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eJ\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/CalendarContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDetailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "adjustEnable", "", "isEnableList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "adjustVisible", "isShowList", "initListener", "initView", "refreshExternalLabel", "isCrossTenant", "setDetailItemListener", "itemListener", "showExchangeAccountName", "calendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "showExternalSign", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "updateData", "eventColor", "", "isFreeStr", "", "visibilityStr", "updateEventCalendar", "updateEventColor", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarContainer extends LinearLayout {

    /* renamed from: a */
    public IDetailItemListener f80091a;

    /* renamed from: b */
    private HashMap f80092b;

    public CalendarContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114746a(int i) {
        if (this.f80092b == null) {
            this.f80092b = new HashMap();
        }
        View view = (View) this.f80092b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80092b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m119096a() {
        ((RelativeLayout) mo114746a(R.id.rl_event_calendar)).setOnClickListener(new View$OnClickListenerC31587a(this));
        ((TextView) mo114746a(R.id.tv_more_option)).setOnClickListener(new View$OnClickListenerC31588b(this));
        ((LinearLayout) mo114746a(R.id.ll_event_color)).setOnClickListener(new View$OnClickListenerC31589c(this));
        ((LinearLayout) mo114746a(R.id.ll_event_status)).setOnClickListener(new View$OnClickListenerC31590d(this));
        ((LinearLayout) mo114746a(R.id.ll_event_scope)).setOnClickListener(new View$OnClickListenerC31591e(this));
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "itemListener");
        this.f80091a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.CalendarContainer$a */
    public static final class View$OnClickListenerC31587a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarContainer f80093a;

        View$OnClickListenerC31587a(CalendarContainer calendarContainer) {
            this.f80093a = calendarContainer;
        }

        public final void onClick(View view) {
            CalendarContainer.m119095a(this.f80093a).mo114360a(6);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.CalendarContainer$c */
    public static final class View$OnClickListenerC31589c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarContainer f80095a;

        View$OnClickListenerC31589c(CalendarContainer calendarContainer) {
            this.f80095a = calendarContainer;
        }

        public final void onClick(View view) {
            CalendarContainer.m119095a(this.f80095a).mo114360a(7);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.CalendarContainer$d */
    public static final class View$OnClickListenerC31590d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarContainer f80096a;

        View$OnClickListenerC31590d(CalendarContainer calendarContainer) {
            this.f80096a = calendarContainer;
        }

        public final void onClick(View view) {
            CalendarContainer.m119095a(this.f80096a).mo114360a(9);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.CalendarContainer$e */
    public static final class View$OnClickListenerC31591e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarContainer f80097a;

        View$OnClickListenerC31591e(CalendarContainer calendarContainer) {
            this.f80097a = calendarContainer;
        }

        public final void onClick(View view) {
            CalendarContainer.m119095a(this.f80097a).mo114360a(8);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m119095a(CalendarContainer calendarContainer) {
        IDetailItemListener bVar = calendarContainer.f80091a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailItemListener");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo114747a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.view_event_calendar_container, this);
        setOrientation(1);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.CalendarContainer$b */
    public static final class View$OnClickListenerC31588b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarContainer f80094a;

        View$OnClickListenerC31588b(CalendarContainer calendarContainer) {
            this.f80094a = calendarContainer;
        }

        public final void onClick(View view) {
            CalendarEventHitPoint.m124339a("more_options", (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 30, (Object) null);
            TextView textView = (TextView) this.f80094a.mo114746a(R.id.tv_more_option);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_more_option");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) this.f80094a.mo114746a(R.id.ll_event_more_option);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_event_more_option");
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: b */
    private final void m119101b(int i) {
        ImageView imageView = (ImageView) mo114746a(R.id.iv_event_color);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_event_color");
        imageView.setBackground(new RoundRectDrawable(i, C32659l.m125335a((Number) 2), 0, 0, 0, false, 60, null));
    }

    /* renamed from: b */
    private final void m119102b(EventCalendarData eventCalendarData) {
        int i;
        TextView textView = (TextView) mo114746a(R.id.tv_account_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_account_name");
        if (eventCalendarData.getCalendarType() == Calendar.Type.EXCHANGE) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = (TextView) mo114746a(R.id.tv_account_name);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_account_name");
        textView2.setText(eventCalendarData.getAccountName());
    }

    /* renamed from: a */
    private final void m119097a(EventCalendarData eventCalendarData) {
        int i;
        TextView textView = (TextView) mo114746a(R.id.tv_calendar_owner);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_calendar_owner");
        textView.setText(eventCalendarData.getCalendarName());
        TextView textView2 = (TextView) mo114746a(R.id.resigned_label);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "resigned_label");
        if (eventCalendarData.isResigned()) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        ((TextView) mo114746a(R.id.tv_calendar_owner)).requestLayout();
        ((ImageView) mo114746a(R.id.iv_calendar_icon)).setColorFilter(eventCalendarData.getColor());
        m119098a(eventCalendarData.getCalendarType());
        m119102b(eventCalendarData);
        m119100a(eventCalendarData.isCrossTenant());
    }

    /* renamed from: a */
    private final void m119098a(Calendar.Type type) {
        int i;
        int i2 = 8;
        if (type == Calendar.Type.GOOGLE || type == Calendar.Type.EXCHANGE) {
            ImageView imageView = (ImageView) mo114746a(R.id.google_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "google_icon");
            if (type == Calendar.Type.GOOGLE) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            ImageView imageView2 = (ImageView) mo114746a(R.id.exchange_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "exchange_icon");
            if (type == Calendar.Type.EXCHANGE) {
                i2 = 0;
            }
            imageView2.setVisibility(i2);
            return;
        }
        ImageView imageView3 = (ImageView) mo114746a(R.id.google_icon);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "google_icon");
        imageView3.setVisibility(8);
        ImageView imageView4 = (ImageView) mo114746a(R.id.exchange_icon);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "exchange_icon");
        imageView4.setVisibility(8);
    }

    /* renamed from: b */
    private final void m119103b(ArrayList<Boolean> arrayList) {
        boolean z;
        boolean z2;
        boolean z3;
        int a = C32634ae.m125178a(R.color.text_placeholder);
        RelativeLayout relativeLayout = (RelativeLayout) mo114746a(R.id.rl_event_calendar);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rl_event_calendar");
        boolean z4 = false;
        Boolean bool = arrayList.get(0);
        Intrinsics.checkExpressionValueIsNotNull(bool, "isEnableList[0]");
        if (bool.booleanValue()) {
            z = true;
        } else {
            ((TextView) mo114746a(R.id.tv_calendar_owner)).setTextColor(a);
            ImageView imageView = (ImageView) mo114746a(R.id.calendar_item_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "calendar_item_arrow");
            imageView.setVisibility(8);
            RelativeLayout relativeLayout2 = (RelativeLayout) mo114746a(R.id.rl_event_calendar);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rl_event_calendar");
            relativeLayout2.setClickable(false);
            z = false;
        }
        relativeLayout.setClickable(z);
        LinearLayout linearLayout = (LinearLayout) mo114746a(R.id.ll_event_color);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_event_color");
        Boolean bool2 = arrayList.get(1);
        Intrinsics.checkExpressionValueIsNotNull(bool2, "isEnableList[1]");
        if (bool2.booleanValue()) {
            ((TextView) mo114746a(R.id.tv_event_color)).setTextColor(C32634ae.m125178a(R.color.text_title));
            ImageView imageView2 = (ImageView) mo114746a(R.id.iv_event_color_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_event_color_arrow");
            imageView2.setVisibility(0);
            z2 = true;
        } else {
            ((TextView) mo114746a(R.id.tv_event_color)).setTextColor(a);
            ImageView imageView3 = (ImageView) mo114746a(R.id.iv_event_color_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "iv_event_color_arrow");
            imageView3.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) mo114746a(R.id.ll_event_color);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_event_color");
            linearLayout2.setClickable(false);
            z2 = false;
        }
        linearLayout.setClickable(z2);
        LinearLayout linearLayout3 = (LinearLayout) mo114746a(R.id.ll_event_scope);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "ll_event_scope");
        Boolean bool3 = arrayList.get(2);
        Intrinsics.checkExpressionValueIsNotNull(bool3, "isEnableList[2]");
        if (bool3.booleanValue()) {
            z3 = true;
        } else {
            ((TextView) mo114746a(R.id.tv_event_scope)).setTextColor(a);
            ImageView imageView4 = (ImageView) mo114746a(R.id.iv_event_scope_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "iv_event_scope_arrow");
            imageView4.setVisibility(8);
            LinearLayout linearLayout4 = (LinearLayout) mo114746a(R.id.ll_event_scope);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "ll_event_scope");
            linearLayout4.setClickable(false);
            z3 = false;
        }
        linearLayout3.setClickable(z3);
        LinearLayout linearLayout5 = (LinearLayout) mo114746a(R.id.ll_event_status);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "ll_event_status");
        Boolean bool4 = arrayList.get(3);
        Intrinsics.checkExpressionValueIsNotNull(bool4, "isEnableList[3]");
        if (bool4.booleanValue()) {
            z4 = true;
        } else {
            ((TextView) mo114746a(R.id.tv_event_status)).setTextColor(a);
            ImageView imageView5 = (ImageView) mo114746a(R.id.iv_event_status_arrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView5, "iv_event_status_arrow");
            imageView5.setVisibility(8);
            LinearLayout linearLayout6 = (LinearLayout) mo114746a(R.id.ll_event_status);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "ll_event_status");
            linearLayout6.setClickable(false);
        }
        linearLayout5.setClickable(z4);
    }

    /* renamed from: a */
    private final void m119099a(ArrayList<Boolean> arrayList) {
        int i;
        int i2;
        LinearLayout linearLayout = (LinearLayout) mo114746a(R.id.ll_event_color);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_event_color");
        Boolean bool = arrayList.get(1);
        Intrinsics.checkExpressionValueIsNotNull(bool, "isShowList[1]");
        int i3 = 0;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        LinearLayout linearLayout2 = (LinearLayout) mo114746a(R.id.ll_event_scope);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_event_scope");
        Boolean bool2 = arrayList.get(2);
        Intrinsics.checkExpressionValueIsNotNull(bool2, "isShowList[2]");
        if (bool2.booleanValue()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        LinearLayout linearLayout3 = (LinearLayout) mo114746a(R.id.ll_event_status);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "ll_event_status");
        Boolean bool3 = arrayList.get(3);
        Intrinsics.checkExpressionValueIsNotNull(bool3, "isShowList[3]");
        if (!bool3.booleanValue()) {
            i3 = 8;
        }
        linearLayout3.setVisibility(i3);
    }

    /* renamed from: a */
    private final void m119100a(boolean z) {
        if (z) {
            TextView textView = (TextView) mo114746a(R.id.calendarExternalLabelTv);
            LarkNameTag.Companion fVar = LarkNameTag.f62897a;
            Context context = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            LarkNameTag e = fVar.mo90057f(context).mo90029a(true).mo90027e();
            Intrinsics.checkExpressionValueIsNotNull(textView, "this");
            e.mo90004a(textView);
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) mo114746a(R.id.calendarExternalLabelTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "calendarExternalLabelTv");
        textView2.setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo114747a(context);
        m119096a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public final void mo114748a(EventCalendarData eventCalendarData, int i, String str, String str2, ArrayList<Boolean> arrayList, ArrayList<Boolean> arrayList2) {
        Intrinsics.checkParameterIsNotNull(eventCalendarData, "calendarData");
        Intrinsics.checkParameterIsNotNull(str, "isFreeStr");
        Intrinsics.checkParameterIsNotNull(str2, "visibilityStr");
        Intrinsics.checkParameterIsNotNull(arrayList, "isShowList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "isEnableList");
        m119097a(eventCalendarData);
        m119101b(i);
        TextView textView = (TextView) mo114746a(R.id.tv_event_status);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_event_status");
        textView.setText(str);
        TextView textView2 = (TextView) mo114746a(R.id.tv_event_scope);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_event_scope");
        textView2.setText(str2);
        m119099a(arrayList);
        m119103b(arrayList2);
    }
}
