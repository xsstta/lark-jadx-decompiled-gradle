package com.ss.android.lark.calendar.impl.features.calendars.detail.view;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.ProgressParams;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailInfo;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarMemberInfo;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.features.common.widget.ExpandableTextView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarDetailHitPoint;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.StatusData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.RoundRectDrawable;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import io.supercharge.shimmerlayout.ShimmerLayout;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010*\u001a\u00020+2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010,\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010&J\u0016\u0010-\u001a\u00020+2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/J\u0012\u00101\u001a\u00020+2\b\u00102\u001a\u0004\u0018\u00010!H\u0016J\u000e\u00103\u001a\u00020+2\u0006\u00104\u001a\u000205R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarDetailHeaderView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionDispatcher", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "getActionDispatcher", "()Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "setActionDispatcher", "(Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;)V", "calCover", "Landroid/widget/ImageView;", "calDesc", "Lcom/ss/android/lark/calendar/impl/features/common/widget/ExpandableTextView;", "calShare", "Lcom/larksuite/component/universe_design/button/UDButton;", "calSubscribe", "calSubscribeCount", "Landroid/widget/TextView;", "calSummary", "coverPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "coverSize", "descMaxLines", "detail", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "headerContent", "Landroid/view/View;", "headerLoading", "headerShimmer", "Lio/supercharge/shimmerlayout/ShimmerLayout;", "owner", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "ownerIcon", "ownerLabel", "ownerName", "bindCalendar", "", "bindOwner", "bindSubscribeStatus", "subscribeStatus", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "onClick", "v", "updateScrollProgress", "progress", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarDetailHeaderView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private ActionDispatcher f75691a;

    /* renamed from: b */
    private final View f75692b;

    /* renamed from: c */
    private final ShimmerLayout f75693c;

    /* renamed from: d */
    private final View f75694d;

    /* renamed from: e */
    private final ImageView f75695e;

    /* renamed from: f */
    private final int f75696f;

    /* renamed from: g */
    private final TextView f75697g;

    /* renamed from: h */
    private final TextView f75698h;

    /* renamed from: i */
    private final UDButton f75699i;

    /* renamed from: j */
    private final UDButton f75700j;

    /* renamed from: k */
    private final TextView f75701k;

    /* renamed from: l */
    private final View f75702l;

    /* renamed from: m */
    private final TextView f75703m;

    /* renamed from: n */
    private final ExpandableTextView f75704n;

    /* renamed from: o */
    private final int f75705o;

    /* renamed from: p */
    private CalendarDetailInfo f75706p;

    /* renamed from: q */
    private CalendarMemberInfo f75707q;

    /* renamed from: r */
    private PhotoItem f75708r;

    public CalendarDetailHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CalendarDetailHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final ActionDispatcher getActionDispatcher() {
        return this.f75691a;
    }

    public final void setActionDispatcher(ActionDispatcher aVar) {
        this.f75691a = aVar;
    }

    /* renamed from: a */
    public final void mo109270a(float f) {
        if (f == 1.0f) {
            this.f75704n.setMaxLines(this.f75705o);
        }
    }

    /* renamed from: a */
    public final void mo109272a(CalendarMemberInfo eVar) {
        boolean z;
        boolean z2;
        int i;
        String str;
        boolean z3;
        this.f75707q = eVar;
        if (eVar != null) {
            String b = eVar.mo109206b();
            if (b == null || b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f75701k.setText(eVar.mo109206b());
                String a = eVar.mo109205a();
                if (a == null || a.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i = R.color.text_title;
                } else {
                    i = R.color.ud_B700;
                }
                TextView textView = this.f75701k;
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                textView.setTextColor(UDColorUtils.getColor(context, i));
                if (eVar.mo109209e()) {
                    str = C32634ae.m125182b(R.string.Calendar_Share_Owner);
                } else {
                    Calendar.AccessRole d = eVar.mo109208d();
                    if (d != null) {
                        str = C30237a.m112289a(d);
                    } else {
                        str = null;
                    }
                }
                TextView textView2 = this.f75703m;
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (an.m125213a(textView2, true ^ z3)) {
                    this.f75703m.setText(str2);
                }
                this.f75701k.setVisibility(0);
                this.f75702l.setVisibility(0);
                return;
            }
        }
        this.f75701k.setVisibility(8);
        this.f75702l.setVisibility(8);
        this.f75703m.setVisibility(8);
    }

    public void onClick(View view) {
        String str;
        Activity activityFromView;
        PhotoItem photoItem;
        boolean z = false;
        if (Intrinsics.areEqual(view, this.f75695e)) {
            if (this.f75706p != null && (activityFromView = UIUtils.getActivityFromView(view)) != null && (photoItem = this.f75708r) != null) {
                C58630d.m227376b(activityFromView, CollectionsKt.arrayListOf(photoItem), 0, this.f75695e, true);
            }
        } else if (Intrinsics.areEqual(view, this.f75701k) || Intrinsics.areEqual(view, this.f75702l) || Intrinsics.areEqual(view, this.f75703m)) {
            Activity activityFromView2 = UIUtils.getActivityFromView(view);
            if (activityFromView2 != null) {
                CalendarMemberInfo eVar = this.f75707q;
                if (eVar != null) {
                    str = eVar.mo109205a();
                } else {
                    str = null;
                }
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        C30022a.f74882a.oldModuleDependency().mo108285a(activityFromView2, str, (String) null, (String) null);
                    }
                }
            }
        } else if (Intrinsics.areEqual(view, this.f75700j)) {
            CalendarDetailInfo cVar = this.f75706p;
            if (cVar == null) {
                return;
            }
            if (!cVar.mo109185i()) {
                CalendarDetailHitPoint.f83361a.mo118746a(cVar.mo109177a(), "subscribe");
                ActionDispatcher aVar = this.f75691a;
                if (aVar != null) {
                    ActionDispatcher.C32507a.m124446a(aVar, "ACTION_SUBSCRIBE", null, 2, null);
                }
            } else if (cVar.mo109186j()) {
                CalendarDetailHitPoint.f83361a.mo118746a(cVar.mo109177a(), "unsubscribe");
                ActionDispatcher aVar2 = this.f75691a;
                if (aVar2 != null) {
                    ActionDispatcher.C32507a.m124446a(aVar2, "ACTION_UNSUBSCRIBE", null, 2, null);
                }
            } else {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                UDToast.show(context, (int) R.string.Calendar_SubscribeCalendar_NoUnsubscribe);
            }
        } else if (Intrinsics.areEqual(view, this.f75699i)) {
            CalendarDetailInfo cVar2 = this.f75706p;
            if (cVar2 != null) {
                ActionDispatcher aVar3 = this.f75691a;
                if (aVar3 != null) {
                    ActionDispatcher.C32507a.m124446a(aVar3, "ACTION_SHARE", null, 2, null);
                }
                CalendarDetailHitPoint.f83361a.mo118746a(cVar2.mo109177a(), "share");
            }
        } else if (Intrinsics.areEqual(view, this.f75704n)) {
            this.f75704n.setMaxLines(Integer.MAX_VALUE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109271a(com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailInfo r8) {
        /*
        // Method dump skipped, instructions count: 344
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarDetailHeaderView.mo109271a(com.ss.android.lark.calendar.impl.features.calendars.detail.b.c):void");
    }

    /* renamed from: a */
    public final void mo109273a(StatusData<String> gVar) {
        String e;
        CalendarDetailInfo cVar = this.f75706p;
        UDButton uDButton = this.f75700j;
        int i = 8;
        if (cVar != null) {
            if (gVar != null && gVar.mo118789b()) {
                UDButton uDButton2 = this.f75700j;
                ProgressParams dVar = new ProgressParams();
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                dVar.mo90337c(Integer.valueOf(UDColorUtils.getColor(context, R.color.static_white)));
                C25717e.m92489a(uDButton2, dVar);
            } else if (cVar.mo109185i()) {
                if (cVar.mo109186j()) {
                    C25717e.m92484a(this.f75700j, (int) R.string.Calendar_SubscribeCalendar_Subscribed);
                    UDButton uDButton3 = this.f75700j;
                    Context context2 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    uDButton3.setTextColor(UDColorUtils.getColor(context2, R.color.primary_pri_500));
                    UDButton uDButton4 = this.f75700j;
                    Context context3 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                    uDButton4.setBackgroundColor(UDColorUtils.getColor(context3, R.color.primary_pri_500_20));
                    UDButton uDButton5 = this.f75700j;
                    Context context4 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                    uDButton5.setStrokeColor(UDColorUtils.getColor(context4, R.color.primary_pri_500));
                } else {
                    C25717e.m92484a(this.f75700j, (int) R.string.Calendar_SubscribeCalendar_Subscribed);
                    UDButton uDButton6 = this.f75700j;
                    Context context5 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context5, "context");
                    uDButton6.setTextColor(UDColorUtils.getColor(context5, R.color.udtoken_btn_pri_text_disabled));
                    UDButton uDButton7 = this.f75700j;
                    Context context6 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context6, "context");
                    uDButton7.setBackgroundColor(UDColorUtils.getColor(context6, R.color.fill_disable));
                    this.f75700j.setStrokeColor(0);
                }
            } else if (!cVar.mo109185i()) {
                C25717e.m92484a(this.f75700j, (int) R.string.Calendar_SubscribeCalendar_Subscribe);
                UDButton uDButton8 = this.f75700j;
                Context context7 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context7, "context");
                uDButton8.setTextColor(UDColorUtils.getColor(context7, R.color.static_white));
                UDButton uDButton9 = this.f75700j;
                Context context8 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context8, "context");
                uDButton9.setBackgroundColor(UDColorUtils.getColor(context8, R.color.primary_pri_500));
                UDButton uDButton10 = this.f75700j;
                Context context9 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context9, "context");
                uDButton10.setStrokeColor(UDColorUtils.getColor(context9, R.color.primary_pri_500));
            }
            i = 0;
        }
        uDButton.setVisibility(i);
        if (gVar != null && !gVar.mo118788a()) {
            gVar.mo118787a(true);
            if (gVar.mo118790c()) {
                String e2 = gVar.mo118792e();
                if (e2 != null) {
                    int hashCode = e2.hashCode();
                    if (hashCode != -2041647576) {
                        if (hashCode == 337808993 && e2.equals("ACTION_SUBSCRIBE")) {
                            Context context10 = getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context10, "context");
                            UDToast.show(context10, (int) R.string.Calendar_Onboarding_Subscribed);
                        }
                    } else if (e2.equals("ACTION_UNSUBSCRIBE")) {
                        Context context11 = getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context11, "context");
                        UDToast.show(context11, (int) R.string.Calendar_Toast_Removed);
                    }
                }
            } else if (gVar.mo118791d() && (e = gVar.mo118792e()) != null) {
                int hashCode2 = e.hashCode();
                if (hashCode2 != -2041647576) {
                    if (hashCode2 == 337808993 && e.equals("ACTION_SUBSCRIBE")) {
                        Context context12 = getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context12, "context");
                        UDToast.show(context12, (int) R.string.Calendar_Toast_SubscriptionFailedMessage);
                    }
                } else if (e.equals("ACTION_UNSUBSCRIBE")) {
                    Context context13 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context13, "context");
                    UDToast.show(context13, (int) R.string.Calendar_Toast_FailedToRemoveCalendar);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarDetailHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75696f = C32659l.m125335a((Number) 72);
        this.f75705o = 2;
        CalendarDetailHeaderView calendarDetailHeaderView = this;
        View.inflate(context, R.layout.calendar_view_calendar_detail_header_skeleton, calendarDetailHeaderView);
        View findViewById = findViewById(R.id.header_loading);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.header_loading)");
        this.f75692b = findViewById;
        View findViewById2 = findViewById(R.id.header_shimmer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.header_shimmer)");
        this.f75693c = (ShimmerLayout) findViewById2;
        View findViewById3 = findViewById(R.id.skeleton_bg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById<View>(R.id.skeleton_bg)");
        findViewById3.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.bg_float), C32659l.m125335a((Number) 8), C32659l.m125335a((Number) 8), 0, 0, false, 32, null));
        View findViewById4 = findViewById(R.id.skeleton_cover_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById<View>(R.id.skeleton_cover_container)");
        findViewById4.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.bg_float), C32659l.m125335a((Number) 10), 0, 0, 0, false, 60, null));
        View findViewById5 = findViewById(R.id.skeleton_cover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById<View>(R.id.skeleton_cover)");
        findViewById5.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.light_transparent), C32659l.m125335a((Number) 8), 0, 0, 0, false, 60, null));
        View findViewById6 = findViewById(R.id.round_rect_1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById<View>(R.id.round_rect_1)");
        findViewById6.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.light_transparent), C32659l.m125335a((Number) 4), 0, 0, 0, false, 60, null));
        View findViewById7 = findViewById(R.id.round_rect_2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById<View>(R.id.round_rect_2)");
        findViewById7.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.light_transparent), C32659l.m125335a((Number) 4), 0, 0, 0, false, 60, null));
        View.inflate(context, R.layout.calendar_view_calendar_detail_header, calendarDetailHeaderView);
        View findViewById8 = findViewById(R.id.header_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.header_content)");
        this.f75694d = findViewById8;
        View findViewById9 = findViewById(R.id.cal_cover);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "findViewById(R.id.cal_cover)");
        ImageView imageView = (ImageView) findViewById9;
        this.f75695e = imageView;
        View findViewById10 = findViewById(R.id.cal_summary);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "findViewById(R.id.cal_summary)");
        this.f75697g = (TextView) findViewById10;
        View findViewById11 = findViewById(R.id.cal_subscribe_count);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "findViewById(R.id.cal_subscribe_count)");
        this.f75698h = (TextView) findViewById11;
        View findViewById12 = findViewById(R.id.cal_share);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "findViewById(R.id.cal_share)");
        UDButton uDButton = (UDButton) findViewById12;
        this.f75699i = uDButton;
        View findViewById13 = findViewById(R.id.cal_subscribe);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "findViewById(R.id.cal_subscribe)");
        UDButton uDButton2 = (UDButton) findViewById13;
        this.f75700j = uDButton2;
        View findViewById14 = findViewById(R.id.owner_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "findViewById(R.id.owner_name)");
        TextView textView = (TextView) findViewById14;
        this.f75701k = textView;
        View findViewById15 = findViewById(R.id.owner_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "findViewById(R.id.owner_icon)");
        this.f75702l = findViewById15;
        View findViewById16 = findViewById(R.id.owner_label);
        Intrinsics.checkExpressionValueIsNotNull(findViewById16, "findViewById(R.id.owner_label)");
        TextView textView2 = (TextView) findViewById16;
        this.f75703m = textView2;
        View findViewById17 = findViewById(R.id.cal_desc);
        Intrinsics.checkExpressionValueIsNotNull(findViewById17, "findViewById(R.id.cal_desc)");
        ExpandableTextView expandableTextView = (ExpandableTextView) findViewById17;
        this.f75704n = expandableTextView;
        View findViewById18 = findViewById(R.id.cal_cover_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById18, "findViewById<View>(R.id.cal_cover_container)");
        findViewById18.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.bg_float), C32659l.m125335a((Number) 10), 0, 0, 0, false, 60, null));
        an.m125210a(imageView, Integer.valueOf(C32659l.m125335a((Number) 8)));
        textView2.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.ud_B100), C32659l.m125335a((Number) 2), 0, 0, 0, false, 60, null));
        expandableTextView.setExpandText(new SpannableStringBuilder("  ").append(context.getString(R.string.Calendar_Onboarding_Show), new ForegroundColorSpan(UDColorUtils.getColor(context, R.color.text_caption)), 33));
        expandableTextView.setMaxLines(2);
        CalendarDetailHeaderView calendarDetailHeaderView2 = this;
        imageView.setOnClickListener(calendarDetailHeaderView2);
        textView.setOnClickListener(calendarDetailHeaderView2);
        findViewById15.setOnClickListener(calendarDetailHeaderView2);
        textView2.setOnClickListener(calendarDetailHeaderView2);
        uDButton.setOnClickListener(calendarDetailHeaderView2);
        uDButton2.setOnClickListener(calendarDetailHeaderView2);
        expandableTextView.setOnClickListener(calendarDetailHeaderView2);
        mo109271a((CalendarDetailInfo) null);
        mo109272a((CalendarMemberInfo) null);
        mo109273a((StatusData<String>) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarDetailHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
