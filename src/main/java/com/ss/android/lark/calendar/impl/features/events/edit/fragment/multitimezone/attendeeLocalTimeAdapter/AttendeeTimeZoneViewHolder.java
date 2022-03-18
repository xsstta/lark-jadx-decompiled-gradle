package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter.AttendeeTimeZoneAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.AvatarView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\"\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J0\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeTimeZoneViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindCrossDayData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeLocalTimeData;", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeTimeZoneAdapter$GuestsItemClickListener;", "bindData", "bindNormalDayData", "getAvatarKeyMap", "", "", "attendeeList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "initAvatarView", "localTimeString", "loadBitmapList", "avatarKeyMap", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b.c */
public final class AttendeeTimeZoneViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f80536a = new Companion(null);

    /* renamed from: b */
    private final View f80537b;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b.c$b */
    public static final class View$OnClickListenerC31676b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC31676b f80538a = new View$OnClickListenerC31676b();

        View$OnClickListenerC31676b() {
        }

        public final void onClick(View view) {
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeTimeZoneViewHolder$Companion;", "", "()V", "AVATAR_LIMIT", "", "FILTER_CHAT_AVATAR_SIZE", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo115459a() {
        return this.f80537b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b.c$c */
    public static final class View$OnClickListenerC31677c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttendeeTimeZoneAdapter.GuestsItemClickListener f80539a;

        /* renamed from: b */
        final /* synthetic */ AttendeeLocalTimeData f80540b;

        /* renamed from: c */
        final /* synthetic */ String f80541c;

        View$OnClickListenerC31677c(AttendeeTimeZoneAdapter.GuestsItemClickListener aVar, AttendeeLocalTimeData aVar2, String str) {
            this.f80539a = aVar;
            this.f80540b = aVar2;
            this.f80541c = str;
        }

        public final void onClick(View view) {
            AttendeeTimeZoneAdapter.GuestsItemClickListener aVar = this.f80539a;
            if (aVar != null) {
                aVar.mo115458a(this.f80540b.mo115450d(), this.f80541c);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeTimeZoneViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f80537b = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeTimeZoneViewHolder$initAvatarView$3", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmapList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.b.c$d */
    public static final class C31678d implements IGetDataCallback<List<? extends Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ AttendeeTimeZoneViewHolder f80542a;

        /* renamed from: b */
        final /* synthetic */ AttendeeLocalTimeData f80543b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Companion aVar = AttendeeTimeZoneViewHolder.f80536a;
            Log.m165383e("NormalAttendeeViewHolder", "downloadImage failed: " + errorResult);
        }

        /* renamed from: a */
        public void onSuccess(List<Bitmap> list) {
            Intrinsics.checkParameterIsNotNull(list, "bitmapList");
            ((AvatarView) this.f80542a.mo115459a().findViewById(R.id.avatarIcons)).mo115911a(this.f80543b.mo115450d().size(), list);
        }

        C31678d(AttendeeTimeZoneViewHolder cVar, AttendeeLocalTimeData aVar) {
            this.f80542a = cVar;
            this.f80543b = aVar;
        }
    }

    /* renamed from: a */
    private final Map<String, String> m119918a(List<UserAttendeeBaseInfo> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (CollectionUtils.isEmpty(list)) {
            return linkedHashMap;
        }
        int i = 0;
        for (UserAttendeeBaseInfo userAttendeeBaseInfo : list) {
            String baseAvatarKey = userAttendeeBaseInfo.getBaseAvatarKey();
            String str = "";
            if (baseAvatarKey == null) {
                baseAvatarKey = str;
            }
            String avatarEntityId = userAttendeeBaseInfo.getAvatarEntityId();
            if (avatarEntityId != null) {
                str = avatarEntityId;
            }
            linkedHashMap.put(baseAvatarKey, str);
            i++;
            if (i >= 3) {
                break;
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo115460a(AttendeeLocalTimeData aVar, AttendeeTimeZoneAdapter.GuestsItemClickListener aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (aVar.mo115453f()) {
            m119922c(aVar, aVar2);
        } else {
            m119921b(aVar, aVar2);
        }
    }

    /* renamed from: a */
    private final void m119920a(Map<String, String> map, IGetDataCallback<List<Bitmap>> iGetDataCallback) {
        if (this.f80537b.getContext() != null) {
            int a = (int) C25653b.m91892a(this.f80537b.getContext(), (float) 32);
            C30022a.f74882a.imageDependency().mo108247a(this.f80537b.getContext(), map, a, a, iGetDataCallback);
        }
    }

    /* renamed from: b */
    private final void m119921b(AttendeeLocalTimeData aVar, AttendeeTimeZoneAdapter.GuestsItemClickListener aVar2) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f80537b.findViewById(R.id.normalTimeContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.normalTimeContainer");
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f80537b.findViewById(R.id.crossDayTimeContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.crossDayTimeContainer");
        relativeLayout2.setVisibility(8);
        Date date = new Date(aVar.mo115445a());
        Date date2 = new Date(aVar.mo115448b());
        TimeZone timeZone = TimeZone.getTimeZone(aVar.mo115451e());
        AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
        Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
        boolean z = !timeFormatDependency.mo108189a();
        Context context = this.f80537b.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        String a = TimeFormatUtils.m219281a(context, date, date2, new Options(aVar.mo115451e(), null, null, null, TimePreciseness.MINUTE, false, z, false, false, 302, null));
        Context context2 = this.f80537b.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
        String e = TimeFormatUtils.m219289e(context2, date, new Options(aVar.mo115451e(), DisplayPattern.ABSOLUTE, LengthType.SHORT, DatePreciseness.DAY, null, false, false, false, false, 496, null));
        String a2 = C32646c.m125253a(aVar.mo115445a(), timeZone);
        TextView textView = (TextView) this.f80537b.findViewById(R.id.localTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.localTimeTv");
        textView.setText(a);
        TextView textView2 = (TextView) this.f80537b.findViewById(R.id.localDataTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.localDataTv");
        textView2.setText(e);
        TextView textView3 = (TextView) this.f80537b.findViewById(R.id.localWeekTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.localWeekTv");
        textView3.setText(a2);
        if (aVar.mo115449c()) {
            ImageView imageView = (ImageView) this.f80537b.findViewById(R.id.localTimeZoneIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.localTimeZoneIv");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) this.f80537b.findViewById(R.id.localTimeZoneIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.localTimeZoneIv");
            imageView2.setVisibility(8);
        }
        Context context3 = this.f80537b.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
        m119919a(aVar, aVar2, TimeFormatUtils.m219288d(context3, date, date2, new Options(aVar.mo115451e(), DisplayPattern.ABSOLUTE, LengthType.SHORT, null, TimePreciseness.MINUTE, false, z, false, false, 264, null)));
    }

    /* renamed from: c */
    private final void m119922c(AttendeeLocalTimeData aVar, AttendeeTimeZoneAdapter.GuestsItemClickListener aVar2) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f80537b.findViewById(R.id.normalTimeContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.normalTimeContainer");
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f80537b.findViewById(R.id.crossDayTimeContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "view.crossDayTimeContainer");
        relativeLayout2.setVisibility(0);
        TimeZone timeZone = TimeZone.getTimeZone(aVar.mo115451e());
        String a = C32646c.m125255a(aVar.mo115445a(), timeZone, false);
        String a2 = C32646c.m125254a(aVar.mo115445a(), timeZone, C32634ae.m125182b(R.string.Calendar_StandardTime_MonthDayCombineFormat));
        String a3 = C32646c.m125253a(aVar.mo115445a(), timeZone);
        TextView textView = (TextView) this.f80537b.findViewById(R.id.startTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.startTimeTv");
        textView.setText(a);
        TextView textView2 = (TextView) this.f80537b.findViewById(R.id.startDataTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.startDataTv");
        textView2.setText(a2);
        TextView textView3 = (TextView) this.f80537b.findViewById(R.id.startWeekTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "view.startWeekTv");
        textView3.setText(a3);
        String a4 = C32646c.m125255a(aVar.mo115448b(), timeZone, false);
        String a5 = C32646c.m125254a(aVar.mo115448b(), timeZone, C32634ae.m125182b(R.string.Calendar_StandardTime_MonthDayCombineFormat));
        String a6 = C32646c.m125253a(aVar.mo115448b(), timeZone);
        TextView textView4 = (TextView) this.f80537b.findViewById(R.id.endTimeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "view.endTimeTv");
        textView4.setText(a4);
        TextView textView5 = (TextView) this.f80537b.findViewById(R.id.endDataTv);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "view.endDataTv");
        textView5.setText(a5);
        TextView textView6 = (TextView) this.f80537b.findViewById(R.id.endWeekTv);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "view.endWeekTv");
        textView6.setText(a6);
        if (aVar.mo115449c()) {
            ImageView imageView = (ImageView) this.f80537b.findViewById(R.id.crossDayLocalTimeZoneIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.crossDayLocalTimeZoneIv");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) this.f80537b.findViewById(R.id.crossDayLocalTimeZoneIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.crossDayLocalTimeZoneIv");
            imageView2.setVisibility(8);
        }
        Context context = this.f80537b.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        Date date = new Date(aVar.mo115445a());
        Date date2 = new Date(aVar.mo115448b());
        String e = aVar.mo115451e();
        TimePreciseness timePreciseness = TimePreciseness.MINUTE;
        LengthType lengthType = LengthType.SHORT;
        DisplayPattern displayPattern = DisplayPattern.ABSOLUTE;
        AbstractC30037ag timeFormatDependency = C30022a.f74882a.timeFormatDependency();
        Intrinsics.checkExpressionValueIsNotNull(timeFormatDependency, "CalendarDependencyHolder…cy.timeFormatDependency()");
        m119919a(aVar, aVar2, TimeFormatUtils.m219288d(context, date, date2, new Options(e, displayPattern, lengthType, null, timePreciseness, false, !timeFormatDependency.mo108189a(), false, false, 264, null)));
    }

    /* renamed from: a */
    private final void m119919a(AttendeeLocalTimeData aVar, AttendeeTimeZoneAdapter.GuestsItemClickListener aVar2, String str) {
        if (CollectionUtils.isEmpty(aVar.mo115450d())) {
            AvatarView avatarView = (AvatarView) this.f80537b.findViewById(R.id.avatarIcons);
            Intrinsics.checkExpressionValueIsNotNull(avatarView, "view.avatarIcons");
            avatarView.setVisibility(8);
            ImageView imageView = (ImageView) this.f80537b.findViewById(R.id.endArrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.endArrow");
            imageView.setVisibility(8);
            this.f80537b.setOnClickListener(View$OnClickListenerC31676b.f80538a);
            return;
        }
        AvatarView avatarView2 = (AvatarView) this.f80537b.findViewById(R.id.avatarIcons);
        Intrinsics.checkExpressionValueIsNotNull(avatarView2, "view.avatarIcons");
        avatarView2.setVisibility(0);
        ImageView imageView2 = (ImageView) this.f80537b.findViewById(R.id.endArrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.endArrow");
        imageView2.setVisibility(0);
        this.f80537b.setOnClickListener(new View$OnClickListenerC31677c(aVar2, aVar, str));
        Map<String, String> a = m119918a(aVar.mo115450d());
        if (CollectionUtils.isNotEmpty(a)) {
            m119920a(a, new C31678d(this, aVar));
        }
    }
}
