package com.ss.android.lark.calendar.impl.features.common.widget.guide;

import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/GuidePopupWindow;", "", "()V", "Companion", "WHICH", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GuidePopupWindow {

    /* renamed from: a */
    public static final Companion f78921a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/GuidePopupWindow$WHICH;", "", "(Ljava/lang/String;I)V", "TIME_ZONE_FIND_TIME", "TIME_ZONE_SWITCH_VIEW", "ADD_EMAIL_ATTENDEE", "SWITCH_EVENT_CALENDAR", "EVENT_VC_PRE_SETTING", "EVENT_VC_EDIT_CONFIG", "ADD_THIRD_PART_CALENDAR", "SWITCH_THIRD_PART_CALENDAR", "FIND_BUILDING_ROOM", "FIND_ROOM", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum WHICH {
        TIME_ZONE_FIND_TIME,
        TIME_ZONE_SWITCH_VIEW,
        ADD_EMAIL_ATTENDEE,
        SWITCH_EVENT_CALENDAR,
        EVENT_VC_PRE_SETTING,
        EVENT_VC_EDIT_CONFIG,
        ADD_THIRD_PART_CALENDAR,
        SWITCH_THIRD_PART_CALENDAR,
        FIND_BUILDING_ROOM,
        FIND_ROOM
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/GuidePopupWindow$Companion;", "", "()V", "getHintTextResId", "", "which", "Lcom/ss/android/lark/calendar/impl/features/common/widget/guide/GuidePopupWindow$WHICH;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.guide.GuidePopupWindow$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo113186a(WHICH which) {
            Intrinsics.checkParameterIsNotNull(which, "which");
            switch (C31215c.f78937a[which.ordinal()]) {
                case 1:
                    return R.string.Calendar_Timezone_SwitchTips;
                case 2:
                    return R.string.Calendar_Timezone_GuideTips;
                case 3:
                    return R.string.Calendar_EmailGuest_OnboardingToast;
                case 4:
                    return R.string.Calendar_Edit_SwitchCalendarTip;
                case 5:
                    return R.string.Calendar_Edit_ChangeJoinSettingsTip;
                case 6:
                    return R.string.Calendar_Sync_OnboardingTip;
                case 7:
                    return R.string.Calendar_Sync_SwitchCalendarTip;
                case 8:
                    return R.string.Calendar_Edit_VCSettingsOnboarding;
                case 9:
                    return R.string.Calendar_MeetingRoom_FindRoomOnboardingTwo;
                case 10:
                    return R.string.Calendar_MeetingRoom_FindRoomOnboardingOne;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
