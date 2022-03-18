package com.ss.android.lark.mine.impl.custom_status.statistics;

import com.bytedance.lark.pb.contact.v1.UserCustomStatusDuration;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p000.UserCustomStatusExtraParams;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0013J\u001e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013J\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0013J\u0006\u0010*\u001a\u00020\tJ\u001e\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&J\u0018\u0010/\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u00100\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u0006\u00101\u001a\u00020\tJ\u000e\u00102\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u000e\u00103\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u000e\u00104\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u0010\u00105\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u00106\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u00107\u001a\u00020\tJ\u0016\u00108\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00132\u0006\u00109\u001a\u00020&J\u0006\u0010:\u001a\u00020\tJ\u000e\u0010;\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004J\u0016\u0010<\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0013J\u0006\u0010=\u001a\u00020\tJ\u000e\u0010>\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u0018\u0010?\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010@\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010A\u001a\u00020\u0004J\u000e\u0010B\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u0006\u0010C\u001a\u00020\tJ\u000e\u0010D\u001a\u00020\t2\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/statistics/UserCustomStatusHitPoint;", "", "()V", "STATUS_CARD", "", "STATUS_ID", "STATUS_NUMBER", "TIME", "sendAddCancelClick", "", "sendAddChangeClick", "param", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendAddChangeView", "sendAddClick", "sendAddEmojiClick", "sendAddPageView", "sendAddSaveClick", "isMute", "", "sendAddStatusClick", "sendAllStatusClick", "isWide", "sendBackClick", "isHolidayAutomatic", "isMeetingAutomatic", "isCalendarAutomatic", "sendChangeAutomaticSaveClick", "eventName", "isAutomatic", "sendChangeCancelClick", "sendChangeClick", "sendChangeEmojiClick", "sendChangeNoAutomaticSaveClick", "sendChangePageView", "sendChangeStatusTitle", "sendCustomizedTimeClick", "statusId", "", "sendDeleteStatusClick", "sendDeleteStatusDialogClick", "isConfirmDelete", "sendDeleteStatusDialogView", "sendDurationClick", "duration", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;", "isStatusOn", "sendFloatClick", "sendFloatView", "sendMineTitlePersonalStatusClick", "sendMoreClick", "sendMoreSettingClick", "sendOtherTimeClick", "sendPersonalStatusClick", "sendPersonalStatusSettingClick", "sendPersonalStatusSettingView", "sendPersonalStatusView", "number", "sendSettingAddStatusClick", "sendSettingCardClick", "sendStatusCard", "sendStatusSettingClick", "sendTimePickerCancel", "sendTimePickerClick", "sendTimePickerOpen", "time", "sendTimePickerView", "sendTitleWordsLimit", "sendUpClick", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.a.a */
public final class UserCustomStatusHitPoint {

    /* renamed from: a */
    public static final UserCustomStatusHitPoint f115066a = new UserCustomStatusHitPoint();

    private UserCustomStatusHitPoint() {
    }

    /* renamed from: a */
    public final void mo160409a(boolean z, int i) {
        Statistics.sendEvent("setting_personal_status_view", C54952a.m213204a(z ? UserCustomStatusExtraParams.IsStatusOn.TRUE : UserCustomStatusExtraParams.IsStatusOn.FALSE, MapsKt.mapOf(TuplesKt.to("status_num", Integer.valueOf(i)))).toJson());
    }

    /* renamed from: a */
    public final void mo160408a(boolean z) {
        m180587d(UserCustomStatusExtraParams.Click.SAVE.plus(UserCustomStatusExtraParams.Target.NONE).plus(z ? UserCustomStatusExtraParams.NotificationStatus.MUTE : UserCustomStatusExtraParams.NotificationStatus.UNMUTE));
    }

    /* renamed from: a */
    public final void mo160407a(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.SAVE;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.NONE;
        m180583a(str, click.plus(target).plus(z2 ? UserCustomStatusExtraParams.AutomaticStatus.AUTO : UserCustomStatusExtraParams.AutomaticStatus.NONAUTO).plus(z ? UserCustomStatusExtraParams.NotificationStatus.MUTE : UserCustomStatusExtraParams.NotificationStatus.UNMUTE));
    }

    /* renamed from: a */
    public final void mo160406a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m180583a(str, UserCustomStatusExtraParams.Click.SAVE.plus(UserCustomStatusExtraParams.Target.NONE).plus(z ? UserCustomStatusExtraParams.NotificationStatus.MUTE : UserCustomStatusExtraParams.NotificationStatus.UNMUTE));
    }

    /* renamed from: a */
    public final void mo160410a(boolean z, boolean z2, boolean z3) {
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.BACK;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.NONE;
        UserCustomStatusExtraParams.HolidayAutomaticStatus holidayAutomaticStatus = z ? UserCustomStatusExtraParams.HolidayAutomaticStatus.AUTOMATIC : UserCustomStatusExtraParams.HolidayAutomaticStatus.NONAUTOMATIC;
        m180588e(click.plus(target).plus(holidayAutomaticStatus).plus(z2 ? UserCustomStatusExtraParams.MeetingAutomaticStatus.AUTOMATIC : UserCustomStatusExtraParams.MeetingAutomaticStatus.NONAUTOMATIC).plus(z3 ? UserCustomStatusExtraParams.CalendarAutomaticStatus.AUTOMATIC : UserCustomStatusExtraParams.CalendarAutomaticStatus.NONAUTOMATIC));
    }

    /* renamed from: g */
    public final void mo160428g() {
        Statistics.sendEvent("setting_personal_status_text_over_toast_view");
    }

    /* renamed from: h */
    public final void mo160430h() {
        Statistics.sendEvent("setting_personal_status_detail_change_confirm_view");
    }

    /* renamed from: i */
    public final void mo160432i() {
        Statistics.sendEvent("setting_personal_status_detail_view");
    }

    /* renamed from: d */
    public final void mo160419d() {
        m180584b(UserCustomStatusExtraParams.PageType.CREATE.plus(UserCustomStatusExtraParams.StatusCard.CUSTOMIZED));
    }

    /* renamed from: f */
    public final void mo160425f() {
        m180587d(UserCustomStatusExtraParams.Click.CHANGE_EMOJI.plus(UserCustomStatusExtraParams.Target.NONE));
    }

    /* renamed from: j */
    public final void mo160433j() {
        m180588e(UserCustomStatusExtraParams.Click.ADD_STATUS.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_ADD_CHANGE_CLICK));
    }

    /* renamed from: c */
    public final void mo160415c() {
        m180581a(UserCustomStatusExtraParams.Click.MORE_STATUS.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_DETAIL_VIEW));
    }

    /* renamed from: e */
    public final void mo160422e() {
        m180587d(UserCustomStatusExtraParams.Click.CANCEL.plus(UserCustomStatusExtraParams.Target.NONE));
    }

    /* renamed from: b */
    public final void mo160411b() {
        m180581a(UserCustomStatusExtraParams.Click.ADD_STATUS.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_ADD_CHANGE_CLICK));
    }

    /* renamed from: a */
    public final void mo160400a() {
        Statistics.sendEvent("setting_main_click", UserCustomStatusExtraParams.Click.PERSONAL_STATUS.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_VIEW).toJson());
    }

    /* renamed from: a */
    private final void m180581a(IParam cVar) {
        Statistics.sendEvent("setting_personal_status_click", cVar.toJson());
    }

    /* renamed from: b */
    private final void m180584b(IParam cVar) {
        Statistics.sendEvent("setting_personal_status_add_change_view", cVar.toJson());
    }

    /* renamed from: c */
    private final void m180586c(IParam cVar) {
        Statistics.sendEvent("setting_personal_status_add_change_click", cVar.toJson());
    }

    /* renamed from: e */
    private final void m180588e(IParam cVar) {
        Statistics.sendEvent("setting_personal_status_detail_click", cVar.toJson());
    }

    /* renamed from: h */
    public final void mo160431h(int i) {
        m180585b(UserCustomStatusExtraParams.Click.CANCEL.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_FLOAT_VIEW), i);
    }

    /* renamed from: d */
    private final void m180587d(IParam cVar) {
        m180586c(UserCustomStatusExtraParams.PageType.CREATE.plus(UserCustomStatusExtraParams.StatusCard.CUSTOMIZED).plus(cVar));
    }

    /* renamed from: f */
    public final void mo160426f(int i) {
        m180582a(UserCustomStatusExtraParams.Click.MORE_SETTING.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_ADD_CHANGE_CLICK), i);
    }

    /* renamed from: g */
    public final void mo160429g(int i) {
        Statistics.sendEvent("setting_personal_status_time_change_view", new JSONObject().put("status_id", i));
    }

    /* renamed from: c */
    public final void mo160416c(int i) {
        Statistics.sendEvent("setting_personal_status_float_view", new JSONObject().put("status_id", i));
    }

    /* renamed from: d */
    public final void mo160420d(int i) {
        m180582a(UserCustomStatusExtraParams.Click.OTHER_TIME.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_TIME_CHANGE_VIEW), i);
    }

    /* renamed from: e */
    public final void mo160423e(int i) {
        m180582a(UserCustomStatusExtraParams.Click.CUSTOMIZED_TIME.plus(UserCustomStatusExtraParams.Target.NONE), i);
    }

    /* renamed from: f */
    public final void mo160427f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.STATUS_ICON;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_ADD_CHANGE_CLICK;
        m180588e(C54952a.m213204a(click.plus(target), MapsKt.mapOf(TuplesKt.to("status_card", str))));
    }

    /* renamed from: b */
    public final void mo160412b(int i) {
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.UP;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.NONE;
        m180581a(C54952a.m213204a(click.plus(target), MapsKt.mapOf(TuplesKt.to("status_id", Integer.valueOf(i)))));
    }

    /* renamed from: c */
    public final void mo160417c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m180583a(str, UserCustomStatusExtraParams.Click.CHANGE_EMOJI.plus(UserCustomStatusExtraParams.Target.NONE));
    }

    /* renamed from: d */
    public final void mo160421d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m180583a(str, UserCustomStatusExtraParams.Click.CHANGE_STATUS_NAME.plus(UserCustomStatusExtraParams.Target.NONE));
    }

    /* renamed from: e */
    public final void mo160424e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m180583a(str, UserCustomStatusExtraParams.Click.DELETE_STATUS.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_DETAIL_CHANGE_CONFIRM_VIEW));
    }

    /* renamed from: a */
    public final void mo160401a(int i) {
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.MORE;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_FLOAT_VIEW;
        m180581a(C54952a.m213204a(click.plus(target), MapsKt.mapOf(TuplesKt.to("status_id", Integer.valueOf(i)))));
    }

    /* renamed from: b */
    public final void mo160413b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m180583a(str, UserCustomStatusExtraParams.Click.CANCEL.plus(UserCustomStatusExtraParams.Target.NONE));
    }

    /* renamed from: c */
    public final void mo160418c(boolean z) {
        UserCustomStatusExtraParams.ShowStatus showStatus;
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.ALL_STATUS;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.NONE;
        if (z) {
            showStatus = UserCustomStatusExtraParams.ShowStatus.WIDE;
        } else {
            showStatus = UserCustomStatusExtraParams.ShowStatus.NARROW;
        }
        m180588e(click.plus(target).plus(showStatus));
    }

    /* renamed from: b */
    public final void mo160414b(boolean z) {
        UserCustomStatusExtraParams.Click click;
        if (z) {
            click = UserCustomStatusExtraParams.Click.DELETE;
        } else {
            click = UserCustomStatusExtraParams.Click.CANCEL;
        }
        Statistics.sendEvent("setting_personal_status_detail_change_confirm_click", click.plus(UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_ADD_CHANGE_CLICK).toJson());
    }

    /* renamed from: a */
    public final void mo160405a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m180584b(C54952a.m213204a(UserCustomStatusExtraParams.PageType.CHANGE, MapsKt.mapOf(TuplesKt.to("status_card", str))));
    }

    /* renamed from: a */
    private final void m180582a(IParam cVar, int i) {
        Statistics.sendEvent("setting_personal_status_float_click", C54952a.m213205a(MapsKt.mapOf(TuplesKt.to("status_id", Integer.valueOf(i))), cVar).toJson());
    }

    /* renamed from: b */
    private final void m180585b(IParam cVar, int i) {
        Statistics.sendEvent("setting_personal_status_time_change_click", C54952a.m213205a(MapsKt.mapOf(TuplesKt.to("status_id", Integer.valueOf(i))), cVar).toJson());
    }

    /* renamed from: a */
    private final void m180583a(String str, IParam cVar) {
        m180586c(C54952a.m213204a(UserCustomStatusExtraParams.PageType.CHANGE, MapsKt.mapOf(TuplesKt.to("status_card", str))).plus(cVar));
    }

    /* renamed from: a */
    public final void mo160402a(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "time");
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.OPEN;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.SETTING_PERSONAL_STATUS_FLOAT_VIEW;
        m180585b(C54952a.m213204a(click.plus(target), MapsKt.mapOf(TuplesKt.to("time", str))), i);
    }

    /* renamed from: a */
    public final void mo160403a(int i, boolean z) {
        UserCustomStatusExtraParams.Status status;
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.CHANGE_STATUS;
        Map mapOf = MapsKt.mapOf(TuplesKt.to("status_id", Integer.valueOf(i)));
        if (z) {
            status = UserCustomStatusExtraParams.Status.ON;
        } else {
            status = UserCustomStatusExtraParams.Status.OFF;
        }
        m180581a(C54952a.m213204a(click.plus(status), mapOf).plus(UserCustomStatusExtraParams.Target.NONE));
    }

    /* renamed from: a */
    public final void mo160404a(UserCustomStatusDuration userCustomStatusDuration, boolean z, int i) {
        UserCustomStatusExtraParams.IconDuration iconDuration;
        UserCustomStatusExtraParams.Status status;
        Intrinsics.checkParameterIsNotNull(userCustomStatusDuration, "duration");
        UserCustomStatusExtraParams.Click click = UserCustomStatusExtraParams.Click.FIXED_TIME;
        UserCustomStatusExtraParams.Target target = UserCustomStatusExtraParams.Target.NONE;
        int i2 = C45472b.f115067a[userCustomStatusDuration.ordinal()];
        if (i2 == 1) {
            iconDuration = UserCustomStatusExtraParams.IconDuration.MINUTE;
        } else if (i2 == 2) {
            iconDuration = UserCustomStatusExtraParams.IconDuration.HOUR_1;
        } else if (i2 == 3) {
            iconDuration = UserCustomStatusExtraParams.IconDuration.HOUR_2;
        } else if (i2 == 4) {
            iconDuration = UserCustomStatusExtraParams.IconDuration.HOUR_4;
        } else if (i2 == 5) {
            iconDuration = UserCustomStatusExtraParams.IconDuration.TONIGHT;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            status = UserCustomStatusExtraParams.Status.ON;
        } else {
            status = UserCustomStatusExtraParams.Status.OFF;
        }
        m180582a(click.plus(target).plus(iconDuration).plus(status), i);
    }
}
