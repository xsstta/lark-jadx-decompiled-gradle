package com.ss.android.lark.calendar.impl.features.meetingroom.signin.helper;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.DailySecondTime;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.DailyUsableTimeHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32067e;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32068f;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceInfo;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J.\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/helper/SignInStateHelper;", "", "()V", "getEventType", "", "state", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "getInactiveContact", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "chatters", "", "getNextEventType", "instanceInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "getRequisitionReasonTipString", "getRequisitionTimeTipString", "getStrategyTipString", "getUnusableRequisitionTimeTipString", "getUserType", "processInstanceInfo", "nextInstanceInfo", "isInstanceSupportSignIn", "", "isVirtualInstance", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "setStateAvatar", "", "context", "Landroid/content/Context;", "eventCreator", "avatarIv", "Landroid/widget/ImageView;", "nameTv", "Landroid/widget/TextView;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.b.a */
public final class SignInStateHelper {

    /* renamed from: a */
    public static final SignInStateHelper f82200a = new SignInStateHelper();

    private SignInStateHelper() {
    }

    /* renamed from: a */
    public final String mo117407a(MeetingRoomSignInState meetingRoomSignInState) {
        if (meetingRoomSignInState == null) {
            return "";
        }
        int i = C32154b.f82201a[meetingRoomSignInState.ordinal()];
        return "";
    }

    /* renamed from: b */
    public final String mo117415b(InstanceInfo mVar) {
        if (mo117413a(mVar)) {
            return "checkin";
        }
        return "no_checkin";
    }

    /* renamed from: b */
    public final String mo117414b(CalendarResource calendarResource) {
        SchemaExtraData.ResourceRequisition a;
        if (calendarResource == null || (a = C32067e.m121957a(calendarResource)) == null) {
            return "";
        }
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        MeetingRoomStrategyHelper fVar = MeetingRoomStrategyHelper.f79934a;
        Intrinsics.checkExpressionValueIsNotNull(id, "timeZoneId");
        String a2 = fVar.mo114624a(a, id, R.string.Calendar_MeetingView_MeetingRoomInactiveForever, R.string.Calendar_MeetingView_MeetingRoomInactive);
        if (a2 != null) {
            return a2;
        }
        return "";
    }

    /* renamed from: c */
    public final String mo117416c(CalendarResource calendarResource) {
        SchemaExtraData.ResourceRequisition a;
        if (calendarResource == null || (a = C32067e.m121957a(calendarResource)) == null) {
            return "";
        }
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        MeetingRoomStrategyHelper fVar = MeetingRoomStrategyHelper.f79934a;
        Intrinsics.checkExpressionValueIsNotNull(id, "timeZoneId");
        String a2 = fVar.mo114624a(a, id, R.string.Calendar_MeetingView_MeetingRoomInactiveForeverCantReserve, R.string.Calendar_MeetingView_MeetingRoomInactiveCantReserve);
        if (a2 != null) {
            return a2;
        }
        return "";
    }

    /* renamed from: d */
    public final String mo117417d(CalendarResource calendarResource) {
        String str;
        boolean z;
        SchemaExtraData.ResourceRequisition a;
        if (calendarResource == null || (a = C32067e.m121957a(calendarResource)) == null) {
            str = null;
        } else {
            str = a.reason;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String a2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingRoom_InactiveReason, "InactiveReason", str);
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…       mtRoomRequisition)");
        return a2;
    }

    /* renamed from: a */
    public final String mo117408a(CalendarResource calendarResource) {
        SchemaExtraData.ResourceStrategy a;
        if (calendarResource == null || (a = C32068f.m121959a(calendarResource)) == null) {
            return "";
        }
        DailyUsableTimeHelper bVar = DailyUsableTimeHelper.f79927a;
        long currentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String str = a.timezone;
        Integer num = a.daily_start_time;
        Intrinsics.checkExpressionValueIsNotNull(num, "mtRoomStrategy.daily_start_time");
        int intValue = num.intValue();
        Integer num2 = a.daily_end_time;
        Intrinsics.checkExpressionValueIsNotNull(num2, "mtRoomStrategy.daily_end_time");
        String a2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingRoom_MeetingRoomReservationPeriod, "AvailableTimePeriod", bVar.mo114598a(currentTimeMillis, timeZone, str, new DailySecondTime(intValue, num2.intValue())));
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…eriod\", usableTimeString)");
        return a2;
    }

    /* renamed from: a */
    public final boolean mo117412a(CalendarEventInstance calendarEventInstance) {
        CalendarEvent.Category category;
        CalendarEvent.Category category2 = null;
        if (calendarEventInstance != null) {
            category = calendarEventInstance.getCategory();
        } else {
            category = null;
        }
        if (category != CalendarEvent.Category.RESOURCE_STRATEGY) {
            if (calendarEventInstance != null) {
                category2 = calendarEventInstance.getCategory();
            }
            if (category2 == CalendarEvent.Category.RESOURCE_REQUISITION) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo117413a(InstanceInfo mVar) {
        InstanceCheckInInfo.CheckInType checkInType;
        if (mVar == null || mo117412a(mVar.mo120126a())) {
            return false;
        }
        InstanceCheckInInfo b = mVar.mo120127b();
        InstanceCheckInInfo.CheckInType checkInType2 = null;
        if (b != null) {
            checkInType = b.check_in_status;
        } else {
            checkInType = null;
        }
        if (checkInType == InstanceCheckInInfo.CheckInType.NOT_CHECK_IN) {
            return true;
        }
        InstanceCheckInInfo b2 = mVar.mo120127b();
        if (b2 != null) {
            checkInType2 = b2.check_in_status;
        }
        if (checkInType2 == InstanceCheckInInfo.CheckInType.ALREADY_CHECK_IN) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo117409a(InstanceInfo mVar, InstanceInfo mVar2) {
        if (mo117413a(mVar)) {
            return "current_event";
        }
        if (mo117413a(mVar2)) {
            return "next_event";
        }
        return "other";
    }

    /* renamed from: a */
    public final List<CalendarEventCreator> mo117410a(CalendarResource calendarResource, Map<String, CalendarEventCreator> map) {
        SchemaExtraData.ResourceRequisition a;
        List<String> list;
        ArrayList arrayList = null;
        if (!(map == null || calendarResource == null || (a = C32067e.m121957a(calendarResource)) == null || (list = a.contact_ids) == null)) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CalendarEventCreator calendarEventCreator = map.get(it.next());
                if (calendarEventCreator != null) {
                    arrayList.add(calendarEventCreator);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo117411a(Context context, CalendarEventCreator calendarEventCreator, ImageView imageView, TextView textView) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(imageView, "avatarIv");
        Intrinsics.checkParameterIsNotNull(textView, "nameTv");
        if (calendarEventCreator != null) {
            CalendarLoadAvatarUtil.m125306a(context, imageView, 32, 32, calendarEventCreator.getAvatarKey(), calendarEventCreator.getChatterId(), null);
            textView.setText(calendarEventCreator.getName());
            return;
        }
        imageView.setImageDrawable(C32634ae.m125184d(R.drawable.calendar_svg_icon_unknow_avatar));
        textView.setText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_UnknownUser));
    }
}
