package com.ss.android.lark.calendar.impl.features.calendars.share.picker;

import android.content.Context;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarMemberPickerData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarShareExtraParam;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerEntrance;", "", "()V", "startCalendarMemberPickerActivity", "", "context", "Landroid/content/Context;", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "calendarTenantId", "", "disableSelectIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "pickerTitle", "showLeftSkipIcon", "", "requestCode", "", "startCalendarMemberPickerActivityFromCreate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.b */
public final class CalendarMemberPickerEntrance {

    /* renamed from: a */
    public static final CalendarMemberPickerEntrance f76372a = new CalendarMemberPickerEntrance();

    private CalendarMemberPickerEntrance() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.b$a */
    public static final class C30533a extends Lambda implements Function1<CalendarMemberPickerData.Builder, Unit> {
        final /* synthetic */ CalendarShareExtraParam $calendarShareParam;
        final /* synthetic */ ArrayList $disableSelectIds;
        final /* synthetic */ String $pickerTitle;
        final /* synthetic */ boolean $showLeftSkipIcon;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30533a(CalendarShareExtraParam calendarShareExtraParam, String str, boolean z, ArrayList arrayList) {
            super(1);
            this.$calendarShareParam = calendarShareExtraParam;
            this.$pickerTitle = str;
            this.$showLeftSkipIcon = z;
            this.$disableSelectIds = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CalendarMemberPickerData.Builder builder) {
            invoke(builder);
            return Unit.INSTANCE;
        }

        public final void invoke(CalendarMemberPickerData.Builder builder) {
            Intrinsics.checkParameterIsNotNull(builder, "$receiver");
            builder.setCalendarShareExtraParam(this.$calendarShareParam);
            builder.setPickerTitle(this.$pickerTitle);
            builder.setShowLeftSkipIcon(this.$showLeftSkipIcon);
            builder.setDisableSelectIds(this.$disableSelectIds);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.b$b */
    public static final class C30534b extends Lambda implements Function1<CalendarMemberPickerData.Builder, Unit> {
        final /* synthetic */ Calendar $calendar;
        final /* synthetic */ CalendarShareExtraParam $calendarShareParam;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30534b(CalendarShareExtraParam calendarShareExtraParam, Calendar calendar) {
            super(1);
            this.$calendarShareParam = calendarShareExtraParam;
            this.$calendar = calendar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CalendarMemberPickerData.Builder builder) {
            invoke(builder);
            return Unit.INSTANCE;
        }

        public final void invoke(CalendarMemberPickerData.Builder builder) {
            Intrinsics.checkParameterIsNotNull(builder, "$receiver");
            builder.setCalendarShareExtraParam(this.$calendarShareParam);
            String b = C32634ae.m125182b(R.string.Calendar_Manage_InviteFollowers);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…r_Manage_InviteFollowers)");
            builder.setPickerTitle(b);
            String str = this.$calendar.summary;
            if (str == null) {
                str = "";
            }
            builder.setPickerSubTitle(str);
            builder.setShowLeftSkipIcon(true);
            String str2 = this.$calendar.calendar_owner_id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "calendar.calendar_owner_id");
            builder.setDisableSelectIds(CollectionsKt.arrayListOf(str2));
            builder.setShowNextAtTop(true);
            builder.setFromCalendarCreate(true);
        }
    }

    /* renamed from: a */
    public final void mo110104a(Context context, Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        String str = calendar.server_id;
        Intrinsics.checkExpressionValueIsNotNull(str, "calendar.server_id");
        C30022a.f74882a.appRouter().mo108210a(CalendarMemberPickerActivity.class).mo108152a("param_calendar_share_info", CalendarMemberPickerData.Companion.mo110154a(new C30534b(new CalendarShareExtraParam(str, calendar.share_options, calendar.self_access_role, calendar.calendar_owner_id, calendar.calendar_tenant_id), calendar))).mo108155a(context, -1);
    }

    /* renamed from: a */
    public final void mo110105a(Context context, Calendar calendar, String str, ArrayList<String> arrayList, String str2, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(str2, "pickerTitle");
        String str3 = calendar.server_id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "calendar.server_id");
        C30022a.f74882a.appRouter().mo108210a(CalendarMemberPickerActivity.class).mo108152a("param_calendar_share_info", CalendarMemberPickerData.Companion.mo110154a(new C30533a(new CalendarShareExtraParam(str3, calendar.share_options, calendar.self_access_role, calendar.calendar_owner_id, str), str2, z, arrayList))).mo108155a(context, i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m113431a(CalendarMemberPickerEntrance bVar, Context context, Calendar calendar, String str, ArrayList arrayList, String str2, boolean z, int i, int i2, Object obj) {
        ArrayList arrayList2;
        String str3;
        boolean z2;
        int i3;
        if ((i2 & 8) != 0) {
            arrayList2 = null;
        } else {
            arrayList2 = arrayList;
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 64) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        bVar.mo110105a(context, calendar, str, arrayList2, str3, z2, i3);
    }
}
