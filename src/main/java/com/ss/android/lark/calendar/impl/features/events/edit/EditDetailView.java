package com.ss.android.lark.calendar.impl.features.events.edit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.SearchBar;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.container.AttachmentContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.AttendeeContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.CalendarContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.DescriptionContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.FeatureIconContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.LocationContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.MeetingRoomContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.MultiTimeContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.ReminderContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.container.RepeatContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionShowData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventAttendeeData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventCalendarData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible;
import com.ss.android.lark.calendar.impl.framework.desktop.widget.PointScrollEventDisallowScrollView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\b\u0010\u0018\u0000 s2\u00020\u0001:\u0001sB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010!\u001a\u00020\u001cJ \u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bJ\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u000eJ\u000e\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.J.\u0010/\u001a\u00020\u001c2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`32\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000bJ\u001e\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000bJ^\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00162\u0016\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u000b01j\b\u0012\u0004\u0012\u00020\u000b`32\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u000b01j\b\u0012\u0004\u0012\u00020\u000b`32\u0006\u0010C\u001a\u00020\u000bJ\u000e\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020)J\u001e\u0010F\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000bJ\u000e\u0010K\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020\u000bJ\u001e\u0010M\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000bJ\\\u0010P\u001a\u00020\u001c2\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020R01j\b\u0012\u0004\u0012\u00020R`32\u0014\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020U\u0018\u00010T2\u0006\u0010V\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020YJ&\u0010Z\u001a\u00020\u001c2\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000bJp\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u00162\u0006\u0010a\u001a\u00020\u00162\u0014\u0010b\u001a\u0010\u0012\u0004\u0012\u00020d\u0012\u0006\u0012\u0004\u0018\u00010e0c2\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\b\u0010h\u001a\u0004\u0018\u00010i2\b\u0010j\u001a\u0004\u0018\u00010\u00162\u0006\u0010k\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020)J\u0016\u0010m\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010n\u001a\u00020\u000bJ\u0016\u0010o\u001a\u00020\u001c2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\u000bR\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\u0013R$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditDetailView;", "Lcom/ss/android/lark/calendar/impl/framework/desktop/widget/PointScrollEventDisallowScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mHideFeatureListener", "com/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$mHideFeatureListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$mHideFeatureListener$1;", "mIsAttachmentEnable", "", "mIsEndDateValidate", "mListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mTimeZoneListener", "com/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$mTimeZoneListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$mTimeZoneListener$1;", "needShowAddEmailAttendeeGuide", "Ljava/lang/Boolean;", "needShowSwitchCalendarGuide", "summary", "", "getSummary", "()Ljava/lang/String;", "setSummary", "(Ljava/lang/String;)V", "checkAndShowGuides", "", "focusOnSummary", "hideKeyboard", "initFreeBusyClickListener", "initView", "onDestroy", "refreshVideoContainer", "videoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "isEventCreateOrEditable", "isExternalEvent", "setDividerBottomVisibility", "visibility", "", "setOnItemClickedCallBack", "listener", "setTimeTypeface", "typeface", "Landroid/graphics/Typeface;", "showAttachmentData", "attachmentData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "Lkotlin/collections/ArrayList;", "isDisableDeleteAttachment", "isHideAttachmentView", "showAttendeeData", "eventAttendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventAttendeeData;", "hideAttendeeView", "isDisableAttendee", "showCalendarData", "calendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "eventColor", "isFreeStr", "visibilityStr", "isShowList", "isEnableList", "hasThirdPartCalendar", "showDeleteIcon", "deleteBtnType", "showDescriptionData", "descriptionShowData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionShowData;", "isDisableDescription", "isShow", "showFreeBusyContainer", "isFreeBusyShow", "showLocationData", "locationStr", "isDisableLocation", "showMeetingRoomData", "meetingRoomContainerList", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "unusableMeetingRoom", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "disableMeetingRoom", "needShowDisableFrom", "eventEndTime", "", "showReminderData", "reminderContainerVisible", "reminderContainerData", "isDisableReminder", "showRepeatData", "isCreateOrEditable", "repeatContainerStr", "repeatEndContainerStr", "repeatUIState", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$EditUIState;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible$DisableReason;", "hasGoogleRRule", "isRepeatEndValidate", "repeatEndLimitDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "repeatEndLimitMtRoomName", "isRepeatEndBeforeStart", "meetingRoomSize", "showSummary", "disableSummaryEdit", "showTimeData", "timeContainerData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "disableDateSelect", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditDetailView extends PointScrollEventDisallowScrollView {

    /* renamed from: b */
    public static final Companion f79833b = new Companion(null);

    /* renamed from: a */
    public IDetailItemListener f79834a;

    /* renamed from: c */
    private boolean f79835c;

    /* renamed from: d */
    private final boolean f79836d;

    /* renamed from: e */
    private Boolean f79837e;

    /* renamed from: f */
    private Boolean f79838f;

    /* renamed from: g */
    private final C31505d f79839g;

    /* renamed from: h */
    private final C31506e f79840h;

    /* renamed from: i */
    private HashMap f79841i;

    public EditDetailView(Context context) {
        this(context, null, 2, null);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.desktop.widget.PointScrollEventDisallowScrollView
    /* renamed from: b */
    public View mo114297b(int i) {
        if (this.f79841i == null) {
            this.f79841i = new HashMap();
        }
        View view = (View) this.f79841i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79841i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$Companion;", "", "()V", "EDIT_TEXT_VIEW_LEFT_MARGIN", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo114290a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "summary");
        SearchBar searchBar = (SearchBar) mo114297b(R.id.search_bar);
        Intrinsics.checkExpressionValueIsNotNull(searchBar, "search_bar");
        searchBar.setText(str);
        if (z) {
            ((SearchBar) mo114297b(R.id.search_bar)).setEditTextEnabled(false);
            ((SearchBar) mo114297b(R.id.search_bar)).mo112606c();
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((SearchBar) mo114297b(R.id.search_bar)).setTextColor(context.getResources().getColor(R.color.text_placeholder));
        }
    }

    /* renamed from: a */
    public final void mo114296a(boolean z, String str, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "reminderContainerData");
        if (!z3) {
            ReminderContainer reminderContainer = (ReminderContainer) mo114297b(R.id.event_reminder_container);
            Intrinsics.checkExpressionValueIsNotNull(reminderContainer, "event_reminder_container");
            reminderContainer.setVisibility(8);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(13);
        } else if (z) {
            ReminderContainer reminderContainer2 = (ReminderContainer) mo114297b(R.id.event_reminder_container);
            Intrinsics.checkExpressionValueIsNotNull(reminderContainer2, "event_reminder_container");
            reminderContainer2.setVisibility(0);
            ((ReminderContainer) mo114297b(R.id.event_reminder_container)).mo114813a(str);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(13);
            if (z2) {
                ((ReminderContainer) mo114297b(R.id.event_reminder_container)).mo114814b();
            }
        } else {
            ReminderContainer reminderContainer3 = (ReminderContainer) mo114297b(R.id.event_reminder_container);
            Intrinsics.checkExpressionValueIsNotNull(reminderContainer3, "event_reminder_container");
            reminderContainer3.setVisibility(8);
            if (z2) {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(13);
            } else {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114766b(13);
            }
        }
    }

    /* renamed from: a */
    public final void mo114291a(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "locationStr");
        if (!z2) {
            LocationContainer locationContainer = (LocationContainer) mo114297b(R.id.event_location_container);
            Intrinsics.checkExpressionValueIsNotNull(locationContainer, "event_location_container");
            locationContainer.setVisibility(8);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(12);
        } else if (TextUtils.isEmpty(str)) {
            LocationContainer locationContainer2 = (LocationContainer) mo114297b(R.id.event_location_container);
            Intrinsics.checkExpressionValueIsNotNull(locationContainer2, "event_location_container");
            locationContainer2.setVisibility(8);
            if (!z) {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114766b(12);
            } else {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(12);
            }
        } else {
            LocationContainer locationContainer3 = (LocationContainer) mo114297b(R.id.event_location_container);
            Intrinsics.checkExpressionValueIsNotNull(locationContainer3, "event_location_container");
            locationContainer3.setVisibility(0);
            ((LocationContainer) mo114297b(R.id.event_location_container)).mo114773a(str);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(12);
            if (z) {
                ((LocationContainer) mo114297b(R.id.event_location_container)).mo114774b();
            }
        }
    }

    /* renamed from: a */
    public final void mo114292a(ArrayList<CalendarEventAttendee> arrayList, Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> map, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoomContainerList");
        if (!z2) {
            MeetingRoomContainer meetingRoomContainer = (MeetingRoomContainer) mo114297b(R.id.event_boardroom_container);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomContainer, "event_boardroom_container");
            meetingRoomContainer.setVisibility(8);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(10);
        } else if (arrayList.isEmpty()) {
            MeetingRoomContainer meetingRoomContainer2 = (MeetingRoomContainer) mo114297b(R.id.event_boardroom_container);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomContainer2, "event_boardroom_container");
            meetingRoomContainer2.setVisibility(8);
            if (!z) {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114766b(10);
            } else {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(10);
            }
        } else {
            if (z) {
                ((MeetingRoomContainer) mo114297b(R.id.event_boardroom_container)).mo114782a();
            }
            MeetingRoomContainer meetingRoomContainer3 = (MeetingRoomContainer) mo114297b(R.id.event_boardroom_container);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomContainer3, "event_boardroom_container");
            meetingRoomContainer3.setVisibility(0);
            ((MeetingRoomContainer) mo114297b(R.id.event_boardroom_container)).mo114783a(arrayList, map, z3, z4, j);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(10);
        }
    }

    /* renamed from: a */
    public final void mo114295a(boolean z, String str, String str2, Pair<? extends EditEventUIVisible.EditUIState, ? extends EditEventUIVisible.DisableReason> pair, boolean z2, boolean z3, boolean z4, CalendarDate calendarDate, String str3, boolean z5, int i) {
        Intrinsics.checkParameterIsNotNull(str, "repeatContainerStr");
        Intrinsics.checkParameterIsNotNull(str2, "repeatEndContainerStr");
        Intrinsics.checkParameterIsNotNull(pair, "repeatUIState");
        if (!z4) {
            RepeatContainer repeatContainer = (RepeatContainer) mo114297b(R.id.event_repeat_container);
            Intrinsics.checkExpressionValueIsNotNull(repeatContainer, "event_repeat_container");
            repeatContainer.setVisibility(8);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(14);
            return;
        }
        boolean z6 = true;
        boolean z7 = ((EditEventUIVisible.EditUIState) pair.getFirst()) != EditEventUIVisible.EditUIState.SHOW;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            RepeatContainer repeatContainer2 = (RepeatContainer) mo114297b(R.id.event_repeat_container);
            Intrinsics.checkExpressionValueIsNotNull(repeatContainer2, "event_repeat_container");
            repeatContainer2.setVisibility(8);
            if (!(((EditEventUIVisible.DisableReason) pair.getSecond()) == EditEventUIVisible.DisableReason.TIME_LIMITED_APPROVAL || ((EditEventUIVisible.DisableReason) pair.getSecond()) == EditEventUIVisible.DisableReason.TOTAL_APPROVAL)) {
                z6 = false;
            }
            if (!z7) {
                FeatureIconContainer.m119119a((FeatureIconContainer) mo114297b(R.id.event_feature_container), 14, true, null, 4, null);
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114766b(14);
            } else if (((EditEventUIVisible.EditUIState) pair.getFirst()) != EditEventUIVisible.EditUIState.DISABLE || !z6) {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(14);
            } else {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114765a(14, false, new View$OnClickListenerC31508g(this));
            }
        } else {
            ((RepeatContainer) mo114297b(R.id.event_repeat_container)).setRepeatDesc(str);
            ((RepeatContainer) mo114297b(R.id.event_repeat_container)).setRepeatEndDesc(str2);
            ((RepeatContainer) mo114297b(R.id.event_repeat_container)).setRepeatEndUsable(!z2);
            if (z3) {
                this.f79835c = true;
                ((RepeatContainer) mo114297b(R.id.event_repeat_container)).mo114824c();
            } else {
                this.f79835c = false;
                ((RepeatContainer) mo114297b(R.id.event_repeat_container)).mo114821a(z, calendarDate, str3, z5, i);
            }
            if (z2) {
                ((RepeatContainer) mo114297b(R.id.event_repeat_container)).mo114823b();
            }
            if (z7) {
                ((RepeatContainer) mo114297b(R.id.event_repeat_container)).mo114825d();
            }
            RepeatContainer repeatContainer3 = (RepeatContainer) mo114297b(R.id.event_repeat_container);
            Intrinsics.checkExpressionValueIsNotNull(repeatContainer3, "event_repeat_container");
            repeatContainer3.setVisibility(0);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(14);
        }
    }

    /* renamed from: a */
    public final void mo114293a(ArrayList<AttachmentItemData> arrayList, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attachmentData");
        if (arrayList.isEmpty() || z2 || !this.f79836d) {
            AttachmentContainer attachmentContainer = (AttachmentContainer) mo114297b(R.id.event_attachment_container);
            Intrinsics.checkExpressionValueIsNotNull(attachmentContainer, "event_attachment_container");
            attachmentContainer.setVisibility(8);
            return;
        }
        AttachmentContainer attachmentContainer2 = (AttachmentContainer) mo114297b(R.id.event_attachment_container);
        Intrinsics.checkExpressionValueIsNotNull(attachmentContainer2, "event_attachment_container");
        attachmentContainer2.setVisibility(0);
        ((AttachmentContainer) mo114297b(R.id.event_attachment_container)).mo114740a(arrayList, z);
    }

    /* renamed from: a */
    public final void mo114283a() {
        KeyboardUtils.hideKeyboard(getContext());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView$f */
    static final class C31507f extends Lambda implements Function0<Unit> {
        final /* synthetic */ EditDetailView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31507f(EditDetailView editDetailView) {
            super(0);
            this.this$0 = editDetailView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            EditDetailView.m118510a(this.this$0).mo114360a(19);
        }
    }

    /* renamed from: b */
    public final void mo114298b() {
        ((DescriptionContainer) mo114297b(R.id.event_description_container)).mo114756a();
    }

    /* renamed from: c */
    public final void mo114299c() {
        ((SearchBar) mo114297b(R.id.search_bar)).mo112604b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$mTimeZoneListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/ITimeZoneChosenListener;", "onChooseEndTime", "", "onChooseStartTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView$e */
    public static final class C31506e implements ITimeZoneChosenListener {

        /* renamed from: a */
        final /* synthetic */ EditDetailView f79845a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener
        /* renamed from: a */
        public void mo114311a() {
            EditDetailView.m118510a(this.f79845a).mo114364a(true);
            EditDetailView.m118510a(this.f79845a).mo114360a(2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.ITimeZoneChosenListener
        /* renamed from: b */
        public void mo114312b() {
            EditDetailView.m118510a(this.f79845a).mo114364a(false);
            EditDetailView.m118510a(this.f79845a).mo114360a(2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31506e(EditDetailView editDetailView) {
            this.f79845a = editDetailView;
        }
    }

    /* renamed from: d */
    private final void m118512d() {
        ((LinearLayout) mo114297b(R.id.event_attendee_freebusy_container)).setOnClickListener(new View$OnClickListenerC31503b(this));
    }

    public final String getSummary() {
        SearchBar searchBar = (SearchBar) mo114297b(R.id.search_bar);
        Intrinsics.checkExpressionValueIsNotNull(searchBar, "search_bar");
        String text = searchBar.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "search_bar.text");
        return text;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$mHideFeatureListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IHideFeatureListener;", "hasNext", "", "index", "", "hideBottomDividerIfRepeatTipShow", "", "onHideFeature", "featureId", "onJudgeDividerVisibility", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView$d */
    public static final class C31505d implements IHideFeatureListener {

        /* renamed from: a */
        final /* synthetic */ EditDetailView f79844a;

        /* renamed from: b */
        private final void m118531b() {
            RepeatContainer repeatContainer = (RepeatContainer) this.f79844a.mo114297b(R.id.event_repeat_container);
            Intrinsics.checkExpressionValueIsNotNull(repeatContainer, "event_repeat_container");
            if (repeatContainer.getVisibility() == 0 && ((RepeatContainer) this.f79844a.mo114297b(R.id.event_repeat_container)).mo114822a()) {
                View b = this.f79844a.mo114297b(R.id.container_bottom_divider);
                Intrinsics.checkExpressionValueIsNotNull(b, "container_bottom_divider");
                b.setVisibility(8);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener
        /* renamed from: a */
        public void mo114309a() {
            boolean z;
            int i;
            boolean z2;
            int i2;
            boolean z3;
            int i3;
            boolean z4;
            int i4;
            boolean z5;
            int i5;
            MeetingRoomContainer meetingRoomContainer = (MeetingRoomContainer) this.f79844a.mo114297b(R.id.event_boardroom_container);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomContainer, "event_boardroom_container");
            boolean z6 = true;
            if (meetingRoomContainer.getVisibility() != 0 || !m118532b(0)) {
                z = false;
            } else {
                z = true;
            }
            View b = this.f79844a.mo114297b(R.id.divide_boardroom_location);
            Intrinsics.checkExpressionValueIsNotNull(b, "divide_boardroom_location");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
            LocationContainer locationContainer = (LocationContainer) this.f79844a.mo114297b(R.id.event_location_container);
            Intrinsics.checkExpressionValueIsNotNull(locationContainer, "event_location_container");
            if (locationContainer.getVisibility() != 0 || !m118532b(1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            View b2 = this.f79844a.mo114297b(R.id.divide_location_reminder);
            Intrinsics.checkExpressionValueIsNotNull(b2, "divide_location_reminder");
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            b2.setVisibility(i2);
            ReminderContainer reminderContainer = (ReminderContainer) this.f79844a.mo114297b(R.id.event_reminder_container);
            Intrinsics.checkExpressionValueIsNotNull(reminderContainer, "event_reminder_container");
            if (reminderContainer.getVisibility() != 0 || !m118532b(2)) {
                z3 = false;
            } else {
                z3 = true;
            }
            View b3 = this.f79844a.mo114297b(R.id.divide_reminder_repeat);
            Intrinsics.checkExpressionValueIsNotNull(b3, "divide_reminder_repeat");
            if (z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            b3.setVisibility(i3);
            RepeatContainer repeatContainer = (RepeatContainer) this.f79844a.mo114297b(R.id.event_repeat_container);
            Intrinsics.checkExpressionValueIsNotNull(repeatContainer, "event_repeat_container");
            if (repeatContainer.getVisibility() != 0 || !m118532b(3)) {
                z4 = false;
            } else {
                z4 = true;
            }
            View b4 = this.f79844a.mo114297b(R.id.divide_repeat_attachment);
            Intrinsics.checkExpressionValueIsNotNull(b4, "divide_repeat_attachment");
            if (z4) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            b4.setVisibility(i4);
            AttachmentContainer attachmentContainer = (AttachmentContainer) this.f79844a.mo114297b(R.id.event_attachment_container);
            Intrinsics.checkExpressionValueIsNotNull(attachmentContainer, "event_attachment_container");
            if (attachmentContainer.getVisibility() != 0 || !m118532b(4)) {
                z5 = false;
            } else {
                z5 = true;
            }
            View b5 = this.f79844a.mo114297b(R.id.divide_attachment_description);
            Intrinsics.checkExpressionValueIsNotNull(b5, "divide_attachment_description");
            if (z5) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            b5.setVisibility(i5);
            MeetingRoomContainer meetingRoomContainer2 = (MeetingRoomContainer) this.f79844a.mo114297b(R.id.event_boardroom_container);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomContainer2, "event_boardroom_container");
            if (meetingRoomContainer2.getVisibility() != 0) {
                LocationContainer locationContainer2 = (LocationContainer) this.f79844a.mo114297b(R.id.event_location_container);
                Intrinsics.checkExpressionValueIsNotNull(locationContainer2, "event_location_container");
                if (locationContainer2.getVisibility() != 0) {
                    ReminderContainer reminderContainer2 = (ReminderContainer) this.f79844a.mo114297b(R.id.event_reminder_container);
                    Intrinsics.checkExpressionValueIsNotNull(reminderContainer2, "event_reminder_container");
                    if (reminderContainer2.getVisibility() != 0) {
                        RepeatContainer repeatContainer2 = (RepeatContainer) this.f79844a.mo114297b(R.id.event_repeat_container);
                        Intrinsics.checkExpressionValueIsNotNull(repeatContainer2, "event_repeat_container");
                        if (repeatContainer2.getVisibility() != 0) {
                            DescriptionContainer descriptionContainer = (DescriptionContainer) this.f79844a.mo114297b(R.id.event_description_container);
                            Intrinsics.checkExpressionValueIsNotNull(descriptionContainer, "event_description_container");
                            if (descriptionContainer.getVisibility() != 0) {
                                z6 = false;
                            }
                        }
                    }
                }
            }
            if (z6) {
                View b6 = this.f79844a.mo114297b(R.id.container_top_divider);
                Intrinsics.checkExpressionValueIsNotNull(b6, "container_top_divider");
                b6.setVisibility(0);
                View b7 = this.f79844a.mo114297b(R.id.container_bottom_divider);
                Intrinsics.checkExpressionValueIsNotNull(b7, "container_bottom_divider");
                b7.setVisibility(0);
                m118531b();
                return;
            }
            View b8 = this.f79844a.mo114297b(R.id.container_top_divider);
            Intrinsics.checkExpressionValueIsNotNull(b8, "container_top_divider");
            b8.setVisibility(8);
            View b9 = this.f79844a.mo114297b(R.id.container_bottom_divider);
            Intrinsics.checkExpressionValueIsNotNull(b9, "container_bottom_divider");
            b9.setVisibility(8);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31505d(EditDetailView editDetailView) {
            this.f79844a = editDetailView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener
        /* renamed from: a */
        public void mo114310a(int i) {
            if (EditDetailView.m118510a(this.f79844a).mo114369c(i)) {
                ((FeatureIconContainer) this.f79844a.mo114297b(R.id.event_feature_container)).mo114766b(i);
            }
            EditDetailView.m118510a(this.f79844a).mo114366b(i);
        }

        /* renamed from: b */
        private final boolean m118532b(int i) {
            MeetingRoomContainer meetingRoomContainer = (MeetingRoomContainer) this.f79844a.mo114297b(R.id.event_boardroom_container);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomContainer, "event_boardroom_container");
            LocationContainer locationContainer = (LocationContainer) this.f79844a.mo114297b(R.id.event_location_container);
            Intrinsics.checkExpressionValueIsNotNull(locationContainer, "event_location_container");
            ReminderContainer reminderContainer = (ReminderContainer) this.f79844a.mo114297b(R.id.event_reminder_container);
            Intrinsics.checkExpressionValueIsNotNull(reminderContainer, "event_reminder_container");
            RepeatContainer repeatContainer = (RepeatContainer) this.f79844a.mo114297b(R.id.event_repeat_container);
            Intrinsics.checkExpressionValueIsNotNull(repeatContainer, "event_repeat_container");
            AttachmentContainer attachmentContainer = (AttachmentContainer) this.f79844a.mo114297b(R.id.event_attachment_container);
            Intrinsics.checkExpressionValueIsNotNull(attachmentContainer, "event_attachment_container");
            DescriptionContainer descriptionContainer = (DescriptionContainer) this.f79844a.mo114297b(R.id.event_description_container);
            Intrinsics.checkExpressionValueIsNotNull(descriptionContainer, "event_description_container");
            View[] viewArr = {meetingRoomContainer, locationContainer, reminderContainer, repeatContainer, attachmentContainer, descriptionContainer};
            for (int i2 = i + 1; i2 < 6; i2++) {
                if (viewArr[i2].getVisibility() == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    private final void m118513e() {
        Boolean bool = this.f79838f;
        if (bool != null && this.f79837e != null) {
            Activity activity = null;
            if (Intrinsics.areEqual((Object) bool, (Object) true) && Intrinsics.areEqual((Object) this.f79837e, (Object) true)) {
                CalendarGuideManager aVar = CalendarGuideManager.f78922a;
                Context context = getContext();
                if (context instanceof Activity) {
                    activity = context;
                }
                CalendarContainer calendarContainer = (CalendarContainer) mo114297b(R.id.event_calendar_container);
                Intrinsics.checkExpressionValueIsNotNull(calendarContainer, "event_calendar_container");
                AttendeeContainer attendeeContainer = (AttendeeContainer) mo114297b(R.id.event_attendee_container);
                Intrinsics.checkExpressionValueIsNotNull(attendeeContainer, "event_attendee_container");
                aVar.mo113188a((Activity) activity, (RelativeLayout) calendarContainer.mo114746a(R.id.rl_event_calendar), (TextView) attendeeContainer.mo114742a(R.id.tv_invite_attendee));
            } else if (Intrinsics.areEqual((Object) this.f79838f, (Object) true)) {
                CalendarGuideManager aVar2 = CalendarGuideManager.f78922a;
                Context context2 = getContext();
                if (context2 instanceof Activity) {
                    activity = context2;
                }
                CalendarContainer calendarContainer2 = (CalendarContainer) mo114297b(R.id.event_calendar_container);
                Intrinsics.checkExpressionValueIsNotNull(calendarContainer2, "event_calendar_container");
                CalendarGuideManager.m116625a(aVar2, (Activity) activity, (RelativeLayout) calendarContainer2.mo114746a(R.id.rl_event_calendar), null, 4, null);
            } else if (Intrinsics.areEqual((Object) this.f79837e, (Object) true)) {
                CalendarGuideManager aVar3 = CalendarGuideManager.f78922a;
                Context context3 = getContext();
                if (context3 instanceof Activity) {
                    activity = context3;
                }
                AttendeeContainer attendeeContainer2 = (AttendeeContainer) mo114297b(R.id.event_attendee_container);
                Intrinsics.checkExpressionValueIsNotNull(attendeeContainer2, "event_attendee_container");
                aVar3.mo113193c(activity, (TextView) attendeeContainer2.mo114742a(R.id.tv_invite_attendee));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditDetailView$initView$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView$c */
    public static final class C31504c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EditDetailView f79843a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31504c(EditDetailView editDetailView) {
            this.f79843a = editDetailView;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            EditDetailView.m118510a(this.f79843a).mo114362a(editable.toString());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m118510a(EditDetailView editDetailView) {
        IDetailItemListener bVar = editDetailView.f79834a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        return bVar;
    }

    public final void setDividerBottomVisibility(int i) {
        View b = mo114297b(R.id.container_bottom_divider);
        Intrinsics.checkExpressionValueIsNotNull(b, "container_bottom_divider");
        b.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView$b */
    public static final class View$OnClickListenerC31503b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditDetailView f79842a;

        View$OnClickListenerC31503b(EditDetailView editDetailView) {
            this.f79842a = editDetailView;
        }

        public final void onClick(View view) {
            CalendarHitPoint.m124101C();
            CalendarPerfMonitor.m124415a("key_freebusy_view", "cal_perf_common", "scene_type", "freebusy_view", "extra_name", "append");
            EditDetailView.m118510a(this.f79842a).mo114371e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView$g */
    static final class View$OnClickListenerC31508g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditDetailView f79846a;

        View$OnClickListenerC31508g(EditDetailView editDetailView) {
            this.f79846a = editDetailView;
        }

        public final void onClick(View view) {
            Context context = this.f79846a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.show(context, (int) R.string.Calendar_Approval_RecurToast);
        }
    }

    /* renamed from: a */
    public final void mo114294a(boolean z) {
        int i;
        LinearLayout linearLayout = (LinearLayout) mo114297b(R.id.event_attendee_freebusy_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "event_attendee_freebusy_container");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public final void setSummary(String str) {
        Intrinsics.checkParameterIsNotNull(str, "summary");
        SearchBar searchBar = (SearchBar) mo114297b(R.id.search_bar);
        Intrinsics.checkExpressionValueIsNotNull(searchBar, "search_bar");
        searchBar.setText(str);
    }

    public final void setTimeTypeface(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeface");
        ((MultiTimeContainer) mo114297b(R.id.event_time_zone_container)).setTimeTypeface(typeface);
    }

    /* renamed from: a */
    public final void mo114284a(int i) {
        if (i != 0) {
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114766b(18);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114767c(i);
            return;
        }
        ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(18);
    }

    public final void setOnItemClickedCallBack(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f79834a = bVar;
        FeatureIconContainer featureIconContainer = (FeatureIconContainer) mo114297b(R.id.event_feature_container);
        IDetailItemListener bVar2 = this.f79834a;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        featureIconContainer.setDetailItemListener(bVar2);
        CalendarContainer calendarContainer = (CalendarContainer) mo114297b(R.id.event_calendar_container);
        IDetailItemListener bVar3 = this.f79834a;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        calendarContainer.setDetailItemListener(bVar3);
        ReminderContainer reminderContainer = (ReminderContainer) mo114297b(R.id.event_reminder_container);
        IDetailItemListener bVar4 = this.f79834a;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        reminderContainer.setDetailItemListener(bVar4);
        LocationContainer locationContainer = (LocationContainer) mo114297b(R.id.event_location_container);
        IDetailItemListener bVar5 = this.f79834a;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        locationContainer.setDetailItemListener(bVar5);
        MeetingRoomContainer meetingRoomContainer = (MeetingRoomContainer) mo114297b(R.id.event_boardroom_container);
        IDetailItemListener bVar6 = this.f79834a;
        if (bVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        meetingRoomContainer.setDetailItemListener(bVar6);
        RepeatContainer repeatContainer = (RepeatContainer) mo114297b(R.id.event_repeat_container);
        IDetailItemListener bVar7 = this.f79834a;
        if (bVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        repeatContainer.setDetailItemListener(bVar7);
        DescriptionContainer descriptionContainer = (DescriptionContainer) mo114297b(R.id.event_description_container);
        IDetailItemListener bVar8 = this.f79834a;
        if (bVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        descriptionContainer.setDetailItemListener(bVar8);
        AttendeeContainer attendeeContainer = (AttendeeContainer) mo114297b(R.id.event_attendee_container);
        IDetailItemListener bVar9 = this.f79834a;
        if (bVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        attendeeContainer.setDetailItemListener(bVar9);
        AttachmentContainer attachmentContainer = (AttachmentContainer) mo114297b(R.id.event_attachment_container);
        IDetailItemListener bVar10 = this.f79834a;
        if (bVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListener");
        }
        attachmentContainer.setDetailItemListener(bVar10);
        m118512d();
    }

    /* renamed from: a */
    private final void m118511a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_edit_detail, (ViewGroup) this, true);
        setBackgroundColor(context.getResources().getColor(R.color.bg_base));
        setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout = (LinearLayout) mo114297b(R.id.ll_content);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_content");
        linearLayout.setFocusable(true);
        LinearLayout linearLayout2 = (LinearLayout) mo114297b(R.id.ll_content);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_content");
        linearLayout2.setFocusableInTouchMode(true);
        ((LinearLayout) mo114297b(R.id.ll_content)).requestFocus();
        ((SearchBar) mo114297b(R.id.search_bar)).setFilters(new InputFilter[]{new InputFilter.LengthFilter(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)});
        ((SearchBar) mo114297b(R.id.search_bar)).setStyle(R.style.AppendViewEditText);
        ((SearchBar) mo114297b(R.id.search_bar)).setHint(R.string.Calendar_Edit_AddTitle);
        ((SearchBar) mo114297b(R.id.search_bar)).setSearchIconVisibility(8);
        ((SearchBar) mo114297b(R.id.search_bar)).mo112602a(UIHelper.dp2px(33.0f), 0, 0, 0);
        ((SearchBar) mo114297b(R.id.search_bar)).mo112603a(new C31504c(this));
        ((MultiTimeContainer) mo114297b(R.id.event_time_zone_container)).setOnTimeChosenListener(this.f79840h);
        ((ReminderContainer) mo114297b(R.id.event_reminder_container)).setOnHideListener(this.f79839g);
        ((LocationContainer) mo114297b(R.id.event_location_container)).setOnHideListener(this.f79839g);
        ((MeetingRoomContainer) mo114297b(R.id.event_boardroom_container)).setOnHideListener(this.f79839g);
        ((RepeatContainer) mo114297b(R.id.event_repeat_container)).setOnHideListener(this.f79839g);
        ((DescriptionContainer) mo114297b(R.id.event_description_container)).setOnHideListener(this.f79839g);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f79836d = C30022a.f74886e.mo112723c();
        this.f79839g = new C31505d(this);
        this.f79840h = new C31506e(this);
        m118511a(context);
    }

    /* renamed from: a */
    public final void mo114286a(TimeData timeData, boolean z) {
        Intrinsics.checkParameterIsNotNull(timeData, "timeContainerData");
        if (z) {
            ((MultiTimeContainer) mo114297b(R.id.event_time_zone_container)).mo114805g();
        }
        ((MultiTimeContainer) mo114297b(R.id.event_time_zone_container)).setData(timeData);
        ((MultiTimeContainer) mo114297b(R.id.event_time_zone_container)).mo114801c();
    }

    /* renamed from: a */
    public final void mo114287a(DescriptionShowData bVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(bVar, "descriptionShowData");
        if (!z2) {
            DescriptionContainer descriptionContainer = (DescriptionContainer) mo114297b(R.id.event_description_container);
            Intrinsics.checkExpressionValueIsNotNull(descriptionContainer, "event_description_container");
            descriptionContainer.setVisibility(8);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(17);
        } else if (bVar.mo115073a() == IEditContract.DescriptionShowType.SHOW_NULL) {
            DescriptionContainer descriptionContainer2 = (DescriptionContainer) mo114297b(R.id.event_description_container);
            Intrinsics.checkExpressionValueIsNotNull(descriptionContainer2, "event_description_container");
            descriptionContainer2.setVisibility(8);
            if (!z) {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114766b(17);
            } else {
                ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(17);
            }
        } else {
            DescriptionContainer descriptionContainer3 = (DescriptionContainer) mo114297b(R.id.event_description_container);
            Intrinsics.checkExpressionValueIsNotNull(descriptionContainer3, "event_description_container");
            descriptionContainer3.setVisibility(0);
            ((DescriptionContainer) mo114297b(R.id.event_description_container)).setDescription(bVar);
            ((FeatureIconContainer) mo114297b(R.id.event_feature_container)).mo114764a(17);
            if (z) {
                ((DescriptionContainer) mo114297b(R.id.event_description_container)).mo114757b();
            }
        }
    }

    /* renamed from: a */
    public final void mo114288a(EventAttendeeData dVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(dVar, "eventAttendeeData");
        if (z) {
            AttendeeContainer attendeeContainer = (AttendeeContainer) mo114297b(R.id.event_attendee_container);
            Intrinsics.checkExpressionValueIsNotNull(attendeeContainer, "event_attendee_container");
            attendeeContainer.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) mo114297b(R.id.event_attendee_freebusy_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "event_attendee_freebusy_container");
            linearLayout.setVisibility(8);
            View b = mo114297b(R.id.attendee_container_bottom_divider);
            Intrinsics.checkExpressionValueIsNotNull(b, "attendee_container_bottom_divider");
            b.setVisibility(8);
            this.f79837e = false;
        } else {
            AttendeeContainer attendeeContainer2 = (AttendeeContainer) mo114297b(R.id.event_attendee_container);
            Intrinsics.checkExpressionValueIsNotNull(attendeeContainer2, "event_attendee_container");
            attendeeContainer2.setVisibility(0);
            View b2 = mo114297b(R.id.attendee_container_bottom_divider);
            Intrinsics.checkExpressionValueIsNotNull(b2, "attendee_container_bottom_divider");
            b2.setVisibility(0);
            this.f79837e = Boolean.valueOf(!dVar.mo115089d());
        }
        m118513e();
        ((AttendeeContainer) mo114297b(R.id.event_attendee_container)).mo114743a(dVar, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r9 == com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType.GOOGLE_VIDEO_CONFERENCE) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114289a(com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.EditDetailView.mo114289a(com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting, boolean, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditDetailView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public final void mo114285a(EventCalendarData eventCalendarData, int i, String str, String str2, ArrayList<Boolean> arrayList, ArrayList<Boolean> arrayList2, boolean z) {
        Intrinsics.checkParameterIsNotNull(eventCalendarData, "calendarData");
        Intrinsics.checkParameterIsNotNull(str, "isFreeStr");
        Intrinsics.checkParameterIsNotNull(str2, "visibilityStr");
        Intrinsics.checkParameterIsNotNull(arrayList, "isShowList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "isEnableList");
        boolean z2 = false;
        Boolean bool = arrayList.get(0);
        Intrinsics.checkExpressionValueIsNotNull(bool, "isShowList[0]");
        if (bool.booleanValue()) {
            CalendarContainer calendarContainer = (CalendarContainer) mo114297b(R.id.event_calendar_container);
            Intrinsics.checkExpressionValueIsNotNull(calendarContainer, "event_calendar_container");
            calendarContainer.setVisibility(0);
            View b = mo114297b(R.id.calendar_container_top_divider);
            Intrinsics.checkExpressionValueIsNotNull(b, "calendar_container_top_divider");
            b.setVisibility(0);
            View b2 = mo114297b(R.id.calendar_container_bottom_divider);
            Intrinsics.checkExpressionValueIsNotNull(b2, "calendar_container_bottom_divider");
            b2.setVisibility(0);
            if (C30022a.f74883b.mo112712t() && z) {
                z2 = true;
            }
            this.f79838f = Boolean.valueOf(z2);
        } else {
            CalendarContainer calendarContainer2 = (CalendarContainer) mo114297b(R.id.event_calendar_container);
            Intrinsics.checkExpressionValueIsNotNull(calendarContainer2, "event_calendar_container");
            calendarContainer2.setVisibility(8);
            View b3 = mo114297b(R.id.calendar_container_top_divider);
            Intrinsics.checkExpressionValueIsNotNull(b3, "calendar_container_top_divider");
            b3.setVisibility(8);
            View b4 = mo114297b(R.id.calendar_container_bottom_divider);
            Intrinsics.checkExpressionValueIsNotNull(b4, "calendar_container_bottom_divider");
            b4.setVisibility(8);
            this.f79838f = false;
        }
        m118513e();
        ((CalendarContainer) mo114297b(R.id.event_calendar_container)).mo114748a(eventCalendarData, i, str, str2, arrayList, arrayList2);
    }
}
