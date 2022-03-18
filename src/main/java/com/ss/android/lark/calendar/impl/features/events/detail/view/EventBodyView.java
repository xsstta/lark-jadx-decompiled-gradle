package com.ss.android.lark.calendar.impl.features.events.detail.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.calendar.bean.WebEditorStyle;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8922b;
import com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentLayout;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView;
import com.ss.android.lark.calendar.impl.features.common.widget.p1500b.C31164a;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.RecruitmentUrlProcess;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailMeetingRoomBinder;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedLiveStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedVideoChatStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.listener.IVideoUrlListener;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.AttendeeAvatarAdapter;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.C31481d;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.InterceptConstraintLayout;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.MeetingRoomView;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.ObservedScrollView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30053r;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30024b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 P2\u00020\u0001:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020\u001bJ\u000e\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0019J\u0010\u00105\u001a\u00020\u001b2\b\u00106\u001a\u0004\u0018\u00010\u0017J\b\u00107\u001a\u00020\u001bH\u0002J\u0006\u00108\u001a\u00020\u001bJ\b\u00109\u001a\u00020\u001bH\u0002J\b\u0010:\u001a\u00020\u001bH\u0002J\u0006\u0010;\u001a\u00020\u001bJ\b\u0010<\u001a\u00020\u001bH\u0002J\u0006\u0010=\u001a\u00020\u001bJ\b\u0010>\u001a\u00020\u001bH\u0002J\u0016\u0010?\u001a\u00020\u001b2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010AJ\b\u0010B\u001a\u00020\u001bH\u0002J\b\u0010C\u001a\u00020\u001bH\u0002J\b\u0010D\u001a\u00020\u001bH\u0002J\b\u0010E\u001a\u00020\u001bH\u0002J\b\u0010F\u001a\u00020\u001bH\u0002J\u0006\u0010G\u001a\u00020\u001bJ\u0006\u0010H\u001a\u00020\u001bJ\u000e\u0010I\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020\u001bJ\u0018\u0010M\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020K2\u0006\u0010O\u001a\u00020KH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ObservedScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAttendeeAvatarAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeAvatarAdapter;", "mBodyData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "mCalMap", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/ICalMap;", "mDescWebEditor", "Lcom/bytedance/ee/bear/middleground/calendar/pool/WebEditorWrapper;", "mMapView", "Landroid/view/View;", "mOrganizerAvatarAdapter", "mSavedInstanceState", "Landroid/os/Bundle;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "destroy", "", "getSeeMoreTextView", "Landroid/widget/TextView;", "hiddenAttendees", "initAttendeeRecyclerView", "initDocWebView", "initMapifNeed", "initOrganizerRecyclerView", "makeMeetRoomView", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/MeetingRoomView;", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "makeMeetingRoomDivider", "openProfilePage", "attendeeCalendarId", "", "refreshAttendeeNum", "refreshLiveStatusByVCPush", "associatedLiveStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedLiveStatus;", "refreshVCStatusByVCPush", "associatedVideoChatStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedVideoChatStatus;", "setDependency", "viewIn", "viewOut", "setSavedInstanceState", "savedInstanceState", "showAttachment", "showAttendeeListItem", "showAttendees", "showAttendeesInLine", "showCalendarItem", "showCreator", "showCreatorItem", "showDescription", "showEventDetailItem", "forbidItemName", "", "showEventLocation", "showEventScope", "showEventStatus", "showMeetingRooms", "showOrganizer", "showOrganizerItem", "showRemindersItem", "showVideoStatusOnUrlContainer", "isLiving", "", "showVideoUrlContainer", "updateLocationTopPadding", "isHideMapView", "isHideAddress", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventBodyView extends ObservedScrollView {

    /* renamed from: b */
    public static final Companion f79586b = new Companion(null);

    /* renamed from: a */
    public ICalendarDetailContact.IDetailViewAction f79587a;

    /* renamed from: c */
    private IBodyData f79588c;

    /* renamed from: d */
    private WebEditorWrapper f79589d;

    /* renamed from: e */
    private AttendeeAvatarAdapter f79590e;

    /* renamed from: f */
    private AttendeeAvatarAdapter f79591f;

    /* renamed from: g */
    private AbstractC30024b f79592g;

    /* renamed from: h */
    private View f79593h;

    /* renamed from: i */
    private Bundle f79594i;

    /* renamed from: j */
    private HashMap f79595j;

    /* renamed from: e */
    public View mo114060e(int i) {
        if (this.f79595j == null) {
            this.f79595j = new HashMap();
        }
        View view = (View) this.f79595j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79595j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$Companion;", "", "()V", "DIVIDER_WIDTH", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$showEventLocation$4", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/CopyPopWindow$CopyPopWindowCallBack;", "finishCopy", "", "getCopyText", "", "ifShowPopWindow", "", "xLocaton", "", "onPopWindowDismiss", "onPopWindowShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$k */
    public static final class C31417k implements C31475c.AbstractC31480a {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79608a;

        /* renamed from: b */
        final /* synthetic */ String f79609b;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public boolean mo114000a(int i) {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: d */
        public void mo114003d() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: c */
        public String mo114002c() {
            return this.f79609b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public void mo113999a() {
            ((ConstraintLayout) this.f79608a.mo114060e(R.id.locationLayout)).setBackgroundColor(C25653b.m91893a(C32634ae.m125178a(R.color.ud_N900), 0.05f));
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: b */
        public void mo114001b() {
            ((ConstraintLayout) this.f79608a.mo114060e(R.id.locationLayout)).setBackgroundColor(C32634ae.m125178a(R.color.ud_N00));
        }

        C31417k(EventBodyView eventBodyView, String str) {
            this.f79608a = eventBodyView;
            this.f79609b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$showMeetingRooms$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/CopyPopWindow$CopyPopWindowCallBack;", "finishCopy", "", "getCopyText", "", "ifShowPopWindow", "", "XLocation", "", "onPopWindowDismiss", "onPopWindowShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$l */
    public static final class C31418l implements C31475c.AbstractC31480a {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79610a;

        /* renamed from: b */
        final /* synthetic */ String f79611b;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public boolean mo114000a(int i) {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: d */
        public void mo114003d() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: c */
        public String mo114002c() {
            return this.f79611b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public void mo113999a() {
            ((ConstraintLayout) this.f79610a.mo114060e(R.id.meetingRoomZone)).setBackgroundColor(C25653b.m91893a(C32634ae.m125178a(R.color.ud_N900), 0.05f));
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: b */
        public void mo114001b() {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f79610a.mo114060e(R.id.meetingRoomZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "meetingRoomZone");
            ((ConstraintLayout) this.f79610a.mo114060e(R.id.meetingRoomZone)).setBackgroundColor(constraintLayout.getResources().getColor(R.color.bg_body));
        }

        C31418l(EventBodyView eventBodyView, String str) {
            this.f79610a = eventBodyView;
            this.f79611b = str;
        }
    }

    /* renamed from: a */
    public final void mo114056a(boolean z) {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        DoVideoMeeting E = iBodyData.mo113637E();
        if (E != null) {
            int i = z ? 2 : 4;
            VideoUrlContainer videoUrlContainer = (VideoUrlContainer) mo114060e(R.id.videoUrlContainer);
            IBodyData iBodyData2 = this.f79588c;
            if (iBodyData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            boolean K = iBodyData2.mo113643K();
            IBodyData iBodyData3 = this.f79588c;
            if (iBodyData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            CalendarEvent.Type L = iBodyData3.mo113644L();
            IBodyData iBodyData4 = this.f79588c;
            if (iBodyData4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            CalendarEvent.Source M = iBodyData4.mo113645M();
            IBodyData iBodyData5 = this.f79588c;
            if (iBodyData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            String P = iBodyData5.mo113648P();
            IBodyData iBodyData6 = this.f79588c;
            if (iBodyData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            boolean G = iBodyData6.mo113639G();
            IBodyData iBodyData7 = this.f79588c;
            if (iBodyData7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            String N = iBodyData7.mo113646N();
            IBodyData iBodyData8 = this.f79588c;
            if (iBodyData8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            String O = iBodyData8.mo113647O();
            IBodyData iBodyData9 = this.f79588c;
            if (iBodyData9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            CalendarPstnDetailInfo F = iBodyData9.mo113638F();
            IBodyData iBodyData10 = this.f79588c;
            if (iBodyData10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            Long H = iBodyData10.mo113640H();
            IBodyData iBodyData11 = this.f79588c;
            if (iBodyData11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            Long I = iBodyData11.mo113641I();
            IBodyData iBodyData12 = this.f79588c;
            if (iBodyData12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            videoUrlContainer.mo113994a(E, i, K, L, M, P, G, N, O, F, H, I, iBodyData12.mo113642J());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRenderProcessGone"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$d */
    public static final class C31410d implements AbstractC8921a {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79599a;

        C31410d(EventBodyView eventBodyView) {
            this.f79599a = eventBodyView;
        }

        @Override // com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a
        /* renamed from: a */
        public final void mo34221a() {
            Log.m165389i("EventBodyView", C32673y.m125378d("Webview render process gone!"));
            Context context = this.f79599a.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: j */
    private final void m118175j() {
        RecyclerView recyclerView = (RecyclerView) mo114060e(R.id.organizerCreatorAvatarRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "organizerCreatorAvatarRV");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f79591f = new AttendeeAvatarAdapter(context);
        RecyclerView recyclerView2 = (RecyclerView) mo114060e(R.id.organizerCreatorAvatarRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "organizerCreatorAvatarRV");
        recyclerView2.setAdapter(this.f79591f);
    }

    /* renamed from: a */
    public final void mo114050a() {
        AbstractC30024b bVar = this.f79592g;
        if (bVar != null) {
            bVar.mo108158a();
        }
        WebEditorWrapper webEditorWrapper = this.f79589d;
        if (webEditorWrapper != null) {
            webEditorWrapper.setRenderProcessListener(null);
        }
        WebEditorWrapper webEditorWrapper2 = this.f79589d;
        if (webEditorWrapper2 != null) {
            webEditorWrapper2.setOnUrlLoadingCallback(null);
        }
        WebEditorWrapper webEditorWrapper3 = this.f79589d;
        if (webEditorWrapper3 != null) {
            webEditorWrapper3.destroy();
        }
    }

    /* renamed from: c */
    public final void mo114058c() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData.mo113673y()) {
            m118182q();
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo114060e(R.id.organizerZone);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "organizerZone");
        relativeLayout.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo114059d() {
        if (!C30022a.f74883b.mo112710r()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.eventCreatorZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "eventCreatorZone");
            constraintLayout.setVisibility(8);
            return;
        }
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData.mo113634B()) {
            m118183r();
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.eventCreatorZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "eventCreatorZone");
        constraintLayout2.setVisibility(8);
    }

    private final TextView getSeeMoreTextView() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, UIUtils.dp2px(getContext(), 7.0f), 0, 0);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(UIHelper.getColor(R.color.text_link_normal));
        textView.setText(C32634ae.m125182b(R.string.Calendar_Edit_ViewAll));
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new View$OnClickListenerC31408b(this, layoutParams));
        return textView;
    }

    /* renamed from: h */
    private final void m118173h() {
        WebEditorWrapper b = C31164a.m116337a().mo112896b(getContext());
        this.f79589d = b;
        if (b != null) {
            b.setRenderProcessListener(new C31410d(this));
        }
        WebEditorWrapper webEditorWrapper = this.f79589d;
        if (webEditorWrapper != null) {
            webEditorWrapper.setEditable(false);
        }
        WebEditorWrapper webEditorWrapper2 = this.f79589d;
        if (webEditorWrapper2 != null) {
            webEditorWrapper2.setOnUrlLoadingCallback(new C31411e(this));
        }
        WebEditorStyle.C8917a aVar = new WebEditorStyle.C8917a();
        aVar.mo34206b(C32634ae.m125178a(R.color.text_title));
        aVar.mo34207c(C32634ae.m125178a(R.color.bg_body));
        WebEditorWrapper webEditorWrapper3 = this.f79589d;
        if (webEditorWrapper3 != null) {
            webEditorWrapper3.setCustomStyle(aVar.mo34205a());
        }
        ((FrameLayout) mo114060e(R.id.descriptionLayout)).addView(this.f79589d, new ViewGroup.LayoutParams(-1, -2));
    }

    /* renamed from: i */
    private final void m118174i() {
        RecyclerView recyclerView = (RecyclerView) mo114060e(R.id.attendeeRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "attendeeRV");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.f79590e = new AttendeeAvatarAdapter(context);
        RecyclerView recyclerView2 = (RecyclerView) mo114060e(R.id.attendeeRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "attendeeRV");
        recyclerView2.setAdapter(this.f79590e);
        AttendeeAvatarAdapter aVar = this.f79590e;
        if (aVar != null) {
            aVar.mo114206a(new C31409c(this));
        }
    }

    /* renamed from: m */
    private final View m118178m() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, UIUtils.dp2px(getContext(), 0.5f));
        layoutParams.topMargin = UIUtils.dp2px(getContext(), 12.0f);
        layoutParams.bottomMargin = UIUtils.dp2px(getContext(), 5.0f);
        view.setLayoutParams(layoutParams);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        view.setBackgroundColor(context.getResources().getColor(R.color.line_divider_default));
        return view;
    }

    /* renamed from: r */
    private final void m118183r() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        String C = iBodyData.mo113635C();
        if (TextUtils.isEmpty(C)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.eventCreatorZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "eventCreatorZone");
            constraintLayout.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.eventCreatorZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "eventCreatorZone");
        constraintLayout2.setVisibility(0);
        TextView textView = (TextView) mo114060e(R.id.eventCreatorTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "eventCreatorTV");
        textView.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_CreatedBy, "creator", C));
    }

    /* renamed from: s */
    private final void m118184s() {
        ((ConstraintLayout) mo114060e(R.id.attendeeZone)).setOnClickListener(null);
        AttendeeAvatarAdapter aVar = this.f79590e;
        if (aVar != null) {
            aVar.mo114206a((View.OnClickListener) null);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.attendeeZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "attendeeZone");
        constraintLayout.setVisibility(0);
        TextView textView = (TextView) mo114060e(R.id.hiddenAttendeeTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "hiddenAttendeeTV");
        textView.setVisibility(0);
        TextView textView2 = (TextView) mo114060e(R.id.attendeeNumTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "attendeeNumTV");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) mo114060e(R.id.attendeeNumDetailTV);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "attendeeNumDetailTV");
        textView3.setVisibility(8);
        ImageView imageView = (ImageView) mo114060e(R.id.rightArrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rightArrow");
        imageView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo114060e(R.id.attendeeRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "attendeeRV");
        recyclerView.setVisibility(8);
    }

    /* renamed from: t */
    private final void m118185t() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        String m = iBodyData.mo113661m();
        if (!TextUtils.isEmpty(m)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.eventScopeZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "eventScopeZone");
            constraintLayout.setVisibility(0);
            TextView textView = (TextView) mo114060e(R.id.eventScopeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "eventScopeTV");
            textView.setText(m);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.eventScopeZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "eventScopeZone");
        constraintLayout2.setVisibility(8);
    }

    /* renamed from: u */
    private final void m118186u() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        String o = iBodyData.mo113663o();
        if (!TextUtils.isEmpty(o)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.eventStatusZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "eventStatusZone");
            constraintLayout.setVisibility(0);
            TextView textView = (TextView) mo114060e(R.id.eventStatusTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "eventStatusTV");
            textView.setText(o);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.eventStatusZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "eventStatusZone");
        constraintLayout2.setVisibility(8);
    }

    /* renamed from: w */
    private final void m118188w() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        List<AttachmentItemData> q = iBodyData.mo113665q();
        if (q.isEmpty()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.eventAttachmentZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "eventAttachmentZone");
            constraintLayout.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.eventAttachmentZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "eventAttachmentZone");
        constraintLayout2.setVisibility(0);
        ((AttachmentLayout) mo114060e(R.id.attachmentLayout)).setData(q);
        ((AttachmentLayout) mo114060e(R.id.attachmentLayout)).setOnItemClickListener(new C31413g(this));
    }

    /* renamed from: b */
    public final void mo114057b() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        String x = iBodyData.mo113672x();
        IBodyData iBodyData2 = this.f79588c;
        if (iBodyData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        boolean v = iBodyData2.mo113670v();
        if (v) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.calendarOwnerZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "calendarOwnerZone");
            constraintLayout.setVisibility(0);
            TextView textView = (TextView) mo114060e(R.id.calendarOwnerTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "calendarOwnerTV");
            textView.setText(x);
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.calendarOwnerZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "calendarOwnerZone");
            constraintLayout2.setVisibility(8);
        }
        IBodyData iBodyData3 = this.f79588c;
        if (iBodyData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        boolean w = iBodyData3.mo113671w();
        if (!v || !w) {
            TextView textView2 = (TextView) mo114060e(R.id.ownerResignedLabel);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "ownerResignedLabel");
            textView2.setVisibility(8);
            return;
        }
        TextView textView3 = (TextView) mo114060e(R.id.ownerResignedLabel);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "ownerResignedLabel");
        textView3.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo114061e() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        int i = C31451c.f79694a[iBodyData.mo113653e().ordinal()];
        if (i == 1) {
            m118180o();
        } else if (i == 2) {
            m118181p();
        } else if (i == 3) {
            m118184s();
        } else if (i == 4) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.attendeeZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "attendeeZone");
            constraintLayout.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo114062f() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData.mo113658j()) {
            IBodyData iBodyData2 = this.f79588c;
            if (iBodyData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            String k = iBodyData2.mo113659k();
            if (!TextUtils.isEmpty(k)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.reminderZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "reminderZone");
                constraintLayout.setVisibility(0);
                TextView textView = (TextView) mo114060e(R.id.reminderTV);
                Intrinsics.checkExpressionValueIsNotNull(textView, "reminderTV");
                textView.setText(k);
                return;
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.reminderZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "reminderZone");
            constraintLayout2.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) mo114060e(R.id.reminderZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "reminderZone");
        constraintLayout3.setVisibility(8);
    }

    /* renamed from: k */
    private final void m118176k() {
        View view;
        if (this.f79592g == null || this.f79593h == null) {
            Bundle bundle = this.f79594i;
            if (bundle == null) {
                bundle = new Bundle();
            }
            AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
            Intrinsics.checkExpressionValueIsNotNull(languageDependency, "CalendarDependencyHolder…ency.languageDependency()");
            boolean b = languageDependency.mo108249b();
            AbstractC30053r locationDependency = C30022a.f74882a.locationDependency();
            Intrinsics.checkExpressionValueIsNotNull(locationDependency, "CalendarDependencyHolder…ency.locationDependency()");
            AbstractC30024b a = locationDependency.mo108267a();
            this.f79592g = a;
            if (a != null) {
                view = a.mo108157a(getContext(), bundle, b);
            } else {
                view = null;
            }
            this.f79593h = view;
            if (Build.VERSION.SDK_INT >= 23) {
                View view2 = this.f79593h;
                if (view2 != null) {
                    Context context = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    view2.setForegroundTintList(context.getResources().getColorStateList(R.color.fill_img_mask));
                }
                View view3 = this.f79593h;
                if (view3 != null) {
                    view3.setForegroundTintMode(PorterDuff.Mode.SRC_ATOP);
                }
            }
            if (this.f79593h != null) {
                ((LinearLayout) mo114060e(R.id.mapLayout)).addView(this.f79593h, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: o */
    private final void m118180o() {
        boolean z;
        boolean z2;
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        ArrayList<IBodyData.IAttendeeDetailData> i = iBodyData.mo113657i();
        if (CollectionUtils.isEmpty(i)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.attendeeZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "attendeeZone");
            constraintLayout.setVisibility(8);
            return;
        }
        IBodyData iBodyData2 = this.f79588c;
        if (iBodyData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        String f = iBodyData2.mo113654f();
        IBodyData iBodyData3 = this.f79588c;
        if (iBodyData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        String h = iBodyData3.mo113656h();
        String str = f;
        boolean z3 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = h;
            if (str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (this.f79590e == null) {
                    m118174i();
                    Unit unit = Unit.INSTANCE;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.attendeeZone);
                Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "attendeeZone");
                constraintLayout2.setVisibility(0);
                RecyclerView recyclerView = (RecyclerView) mo114060e(R.id.attendeeRV);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "attendeeRV");
                recyclerView.setVisibility(0);
                TextView textView = (TextView) mo114060e(R.id.hiddenAttendeeTV);
                Intrinsics.checkExpressionValueIsNotNull(textView, "hiddenAttendeeTV");
                textView.setVisibility(8);
                ((ConstraintLayout) mo114060e(R.id.attendeeZone)).setOnClickListener(new View$OnClickListenerC31414h(this));
                TextView textView2 = (TextView) mo114060e(R.id.attendeeNumTV);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "attendeeNumTV");
                textView2.setText(str);
                TextView textView3 = (TextView) mo114060e(R.id.attendeeNumDetailTV);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "attendeeNumDetailTV");
                textView3.setText(str2);
                int min = Math.min(i.size(), 5);
                List<IBodyData.IAttendeeDetailData> subList = i.subList(0, min);
                Intrinsics.checkExpressionValueIsNotNull(subList, "attendees.subList(0, maxSize)");
                AttendeeAvatarAdapter aVar = this.f79590e;
                if (aVar != null) {
                    if (min >= i.size()) {
                        z3 = false;
                    }
                    aVar.mo114207a(subList, z3);
                    return;
                }
                return;
            }
        }
        m118181p();
    }

    /* renamed from: v */
    private final void m118187v() {
        if (this.f79589d == null) {
            m118173h();
            Unit unit = Unit.INSTANCE;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.descriptionZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "descriptionZone");
        constraintLayout.setVisibility(0);
        FrameLayout frameLayout = (FrameLayout) mo114060e(R.id.descriptionLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "descriptionLayout");
        frameLayout.setVisibility(0);
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData.mo113667s()) {
            WebEditorWrapper webEditorWrapper = this.f79589d;
            if (webEditorWrapper != null) {
                IBodyData iBodyData2 = this.f79588c;
                if (iBodyData2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
                }
                webEditorWrapper.setData(iBodyData2.mo113669u());
                return;
            }
            return;
        }
        IBodyData iBodyData3 = this.f79588c;
        if (iBodyData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData3.mo113666r()) {
            WebEditorWrapper webEditorWrapper2 = this.f79589d;
            if (webEditorWrapper2 != null) {
                IBodyData iBodyData4 = this.f79588c;
                if (iBodyData4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
                }
                webEditorWrapper2.setContent(iBodyData4.mo113668t());
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.descriptionZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "descriptionZone");
        constraintLayout2.setVisibility(8);
        FrameLayout frameLayout2 = (FrameLayout) mo114060e(R.id.descriptionLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "descriptionLayout");
        frameLayout2.setVisibility(8);
    }

    /* renamed from: g */
    public final void mo114063g() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        int i = C31451c.f79695b[iBodyData.mo113636D().ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else if (i == 3) {
                i2 = 0;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        IBodyData iBodyData2 = this.f79588c;
        if (iBodyData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        DoVideoMeeting E = iBodyData2.mo113637E();
        if (E != null) {
            VideoUrlContainer videoUrlContainer = (VideoUrlContainer) mo114060e(R.id.videoUrlContainer);
            IBodyData iBodyData3 = this.f79588c;
            if (iBodyData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            boolean K = iBodyData3.mo113643K();
            IBodyData iBodyData4 = this.f79588c;
            if (iBodyData4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            CalendarEvent.Type L = iBodyData4.mo113644L();
            IBodyData iBodyData5 = this.f79588c;
            if (iBodyData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            CalendarEvent.Source M = iBodyData5.mo113645M();
            IBodyData iBodyData6 = this.f79588c;
            if (iBodyData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            String P = iBodyData6.mo113648P();
            IBodyData iBodyData7 = this.f79588c;
            if (iBodyData7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            boolean G = iBodyData7.mo113639G();
            IBodyData iBodyData8 = this.f79588c;
            if (iBodyData8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            String N = iBodyData8.mo113646N();
            IBodyData iBodyData9 = this.f79588c;
            if (iBodyData9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            String O = iBodyData9.mo113647O();
            IBodyData iBodyData10 = this.f79588c;
            if (iBodyData10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            VideoUrlContainer.m118136a(videoUrlContainer, E, i2, K, L, M, P, G, N, O, iBodyData10.mo113638F(), null, null, null, 7168, null);
        }
        ((VideoUrlContainer) mo114060e(R.id.videoUrlContainer)).setListener(new C31421o(this));
    }

    /* renamed from: l */
    private final void m118177l() {
        int i;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.meetingRoomZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "meetingRoomZone");
        constraintLayout.setVisibility(0);
        ((LinearLayout) mo114060e(R.id.meetingRoomLayout)).removeAllViews();
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        List<IBodyData.IMeetingRoomData> b = iBodyData.mo113650b();
        if (CollectionUtils.isEmpty(b)) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.meetingRoomZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "meetingRoomZone");
            constraintLayout2.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout3 = (ConstraintLayout) mo114060e(R.id.meetingRoomZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "meetingRoomZone");
            constraintLayout3.setVisibility(0);
        }
        if (C30022a.f74883b.mo112715w()) {
            i = 10;
        } else {
            i = Integer.MAX_VALUE;
        }
        String str = "";
        int i2 = 0;
        for (T t : b) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i2 > 0) {
                layoutParams.setMargins(0, UIUtils.dp2px(getContext(), 7.0f), 0, 0);
                str = str + "\n";
            }
            str = str + t.mo113627b();
            if (i2 == i) {
                ((LinearLayout) mo114060e(R.id.meetingRoomLayout)).addView(getSeeMoreTextView());
            } else if (i2 <= i) {
                MeetingRoomView a = m118171a((IBodyData.IMeetingRoomData) t);
                a.setLayoutParams(layoutParams);
                ((LinearLayout) mo114060e(R.id.meetingRoomLayout)).addView(a);
                if (a.mo114183a() && (!Intrinsics.areEqual(b.get(b.size() - 1), t))) {
                    ((LinearLayout) mo114060e(R.id.meetingRoomLayout)).addView(m118178m());
                }
            }
            i2++;
        }
        C31481d.m118441a((ConstraintLayout) mo114060e(R.id.meetingRoomZone), new C31418l(this, str));
    }

    /* renamed from: n */
    private final void m118179n() {
        String str;
        boolean z;
        InterceptConstraintLayout interceptConstraintLayout = (InterceptConstraintLayout) mo114060e(R.id.locationZone);
        Intrinsics.checkExpressionValueIsNotNull(interceptConstraintLayout, "locationZone");
        interceptConstraintLayout.setVisibility(0);
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        IBodyData.ILocationData d = iBodyData.mo113652d();
        String str2 = "";
        String b = d.mo113608b();
        if (d.mo113607a()) {
            TextView textView = (TextView) mo114060e(R.id.locationTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "locationTV");
            textView.setVisibility(0);
            TextView textView2 = (TextView) mo114060e(R.id.locationTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "locationTV");
            textView2.setText(b);
            str2 = str2 + b;
        } else {
            InterceptConstraintLayout interceptConstraintLayout2 = (InterceptConstraintLayout) mo114060e(R.id.locationZone);
            Intrinsics.checkExpressionValueIsNotNull(interceptConstraintLayout2, "locationZone");
            interceptConstraintLayout2.setVisibility(8);
            TextView textView3 = (TextView) mo114060e(R.id.locationTV);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "locationTV");
            textView3.setVisibility(8);
        }
        String d2 = d.mo113610d();
        if (d.mo113609c()) {
            TextView textView4 = (TextView) mo114060e(R.id.addressTV);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "addressTV");
            textView4.setVisibility(0);
            TextView textView5 = (TextView) mo114060e(R.id.addressTV);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "addressTV");
            textView5.setText(d2);
            str2 = str2 + d2;
        } else {
            TextView textView6 = (TextView) mo114060e(R.id.addressTV);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "addressTV");
            textView6.setVisibility(8);
        }
        if (d.mo113611e()) {
            LinearLayout linearLayout = (LinearLayout) mo114060e(R.id.mapLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mapLayout");
            linearLayout.setVisibility(0);
            ImageView imageView = (ImageView) mo114060e(R.id.mapPinIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "mapPinIV");
            imageView.setVisibility(0);
            m118176k();
            AbstractC30024b bVar = this.f79592g;
            if (bVar != null) {
                str = str2;
                bVar.mo108159a(d.mo113612f(), d.mo113613g());
            } else {
                str = str2;
                LinearLayout linearLayout2 = (LinearLayout) mo114060e(R.id.mapLayout);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "mapLayout");
                linearLayout2.setVisibility(8);
                ImageView imageView2 = (ImageView) mo114060e(R.id.mapPinIV);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "mapPinIV");
                imageView2.setVisibility(8);
            }
        } else {
            str = str2;
            LinearLayout linearLayout3 = (LinearLayout) mo114060e(R.id.mapLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "mapLayout");
            linearLayout3.setVisibility(8);
            ImageView imageView3 = (ImageView) mo114060e(R.id.mapPinIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "mapPinIV");
            imageView3.setVisibility(8);
        }
        LinearLayout linearLayout4 = (LinearLayout) mo114060e(R.id.mapLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "mapLayout");
        boolean z2 = true;
        if (linearLayout4.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        TextView textView7 = (TextView) mo114060e(R.id.addressTV);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "addressTV");
        if (textView7.getVisibility() != 8) {
            z2 = false;
        }
        m118172a(z, z2);
        ImageView imageView4 = (ImageView) mo114060e(R.id.locationRightArrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "locationRightArrow");
        imageView4.setVisibility(0);
        ((InterceptConstraintLayout) mo114060e(R.id.locationZone)).setOnClickListener(new View$OnClickListenerC31416j(this, b, d));
        if (!TextUtils.isEmpty(str)) {
            C31481d.m118441a((ConstraintLayout) mo114060e(R.id.locationLayout), new C31417k(this, str));
        }
    }

    /* renamed from: p */
    private final void m118181p() {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        ArrayList<IBodyData.IAttendeeDetailData> i = iBodyData.mo113657i();
        if (CollectionUtils.isEmpty(i)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.attendeeZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "attendeeZone");
            constraintLayout.setVisibility(8);
            return;
        }
        if (this.f79590e == null) {
            m118174i();
            Unit unit = Unit.INSTANCE;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.attendeeZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "attendeeZone");
        boolean z = false;
        constraintLayout2.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) mo114060e(R.id.attendeeRV);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "attendeeRV");
        recyclerView.setVisibility(0);
        TextView textView = (TextView) mo114060e(R.id.attendeeNumTVInLine);
        Intrinsics.checkExpressionValueIsNotNull(textView, "attendeeNumTVInLine");
        textView.setVisibility(0);
        TextView textView2 = (TextView) mo114060e(R.id.attendeeNumTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "attendeeNumTV");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) mo114060e(R.id.attendeeNumDetailTV);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "attendeeNumDetailTV");
        textView3.setVisibility(8);
        TextView textView4 = (TextView) mo114060e(R.id.hiddenAttendeeTV);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "hiddenAttendeeTV");
        textView4.setVisibility(8);
        ((ConstraintLayout) mo114060e(R.id.attendeeZone)).setOnClickListener(new View$OnClickListenerC31415i(this));
        TextView textView5 = (TextView) mo114060e(R.id.attendeeNumTVInLine);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "attendeeNumTVInLine");
        IBodyData iBodyData2 = this.f79588c;
        if (iBodyData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        textView5.setText(iBodyData2.mo113654f());
        ImageView imageView = (ImageView) mo114060e(R.id.attendeeLabel);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "attendeeLabel");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            marginLayoutParams.topMargin = (int) UDDimenUtils.m93308a(context, 19);
            ImageView imageView2 = (ImageView) mo114060e(R.id.attendeeLabel);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "attendeeLabel");
            imageView2.setLayoutParams(marginLayoutParams);
            int min = Math.min(i.size(), 5);
            List<IBodyData.IAttendeeDetailData> subList = i.subList(0, min);
            Intrinsics.checkExpressionValueIsNotNull(subList, "attendees.subList(0, maxSize)");
            AttendeeAvatarAdapter aVar = this.f79590e;
            if (aVar != null) {
                if (min < i.size()) {
                    z = true;
                }
                aVar.mo114207a(subList, z);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r1 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        if (r1 != null) goto L_0x00d9;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m118182q() {
        /*
        // Method dump skipped, instructions count: 562
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView.m118182q():void");
    }

    public final void setSavedInstanceState(Bundle bundle) {
        this.f79594i = bundle;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$initAttendeeRecyclerView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$c */
    public static final class C31409c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79598a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31409c(EventBodyView eventBodyView) {
            this.f79598a = eventBodyView;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Log.m165389i("EventBodyView", C32673y.m125369a("attend"));
            EventBodyView.m118170a(this.f79598a).mo113554h();
            CalendarHitPoint.m124162u();
            GeneralHitPoint.m124235c("event_detail");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$makeMeetRoomView$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailMeetingRoomBinder$DetailMeetingRoomListener;", "onMeetingRoomInfoClicked", "", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$f */
    public static final class C31412f implements DetailMeetingRoomBinder.DetailMeetingRoomListener {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79601a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31412f(EventBodyView eventBodyView) {
            this.f79601a = eventBodyView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom.DetailMeetingRoomBinder.DetailMeetingRoomListener
        /* renamed from: a */
        public void mo113707a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            EventBodyView.m118170a(this.f79601a).mo113549c(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$showAttachment$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentView$OnClickListener;", "onClick", "", "token", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$g */
    public static final class C31413g implements AttachmentView.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79602a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31413g(EventBodyView eventBodyView) {
            this.f79602a = eventBodyView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView.OnClickListener
        /* renamed from: a */
        public void mo112886a(String str, CalendarEventAttachment.Type type) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            if (type == CalendarEventAttachment.Type.UNKNOWN) {
                Context context = this.f79602a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                UDToast.show(context, (int) R.string.Calendar_Attachment_MobileToast);
                return;
            }
            GeneralHitPoint.m124231b("preview", "detail");
            EventBodyView.m118170a(this.f79602a).mo113547b(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$showVideoUrlContainer$2", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/listener/IVideoUrlListener;", "onClickEnterVideoMeeting", "", "videoType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "meetingId", "", "meetingUrl", "onClickPhoneNumber", "phoneNumber", "onClickPstnDetailPage", "adminSettingsResponse", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "onClickVideoMeetingSetting", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$o */
    public static final class C31421o implements IVideoUrlListener {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79616a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31421o(EventBodyView eventBodyView) {
            this.f79616a = eventBodyView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.listener.IVideoUrlListener
        /* renamed from: b */
        public void mo114017b(String str) {
            C30022a.f74882a.calPhoneDependency().mo108290a((Activity) this.f79616a.getContext(), "", str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.listener.IVideoUrlListener
        /* renamed from: a */
        public void mo114016a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "meetingId");
            ICalendarDetailContact.IDetailViewAction a = EventBodyView.m118170a(this.f79616a);
            Context context = this.f79616a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            a.mo113539a(context, str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.listener.IVideoUrlListener
        /* renamed from: a */
        public void mo114014a(VideoType videoType, String str, GetAdminSettingsResponse getAdminSettingsResponse) {
            Intrinsics.checkParameterIsNotNull(videoType, "videoType");
            Intrinsics.checkParameterIsNotNull(str, "meetingUrl");
            ICalendarDetailContact.IDetailViewAction a = EventBodyView.m118170a(this.f79616a);
            Context context = this.f79616a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            a.mo113537a(context, videoType, str, getAdminSettingsResponse);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.listener.IVideoUrlListener
        /* renamed from: a */
        public void mo114015a(VideoType videoType, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(videoType, "videoType");
            Intrinsics.checkParameterIsNotNull(str, "meetingId");
            Intrinsics.checkParameterIsNotNull(str2, "meetingUrl");
            ICalendarDetailContact.IDetailViewAction a = EventBodyView.m118170a(this.f79616a);
            Context context = this.f79616a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            a.mo113538a(context, videoType, str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$getSeeMoreTextView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$b */
    public static final class View$OnClickListenerC31408b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79596a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout.LayoutParams f79597b;

        View$OnClickListenerC31408b(EventBodyView eventBodyView, LinearLayout.LayoutParams layoutParams) {
            this.f79596a = eventBodyView;
            this.f79597b = layoutParams;
        }

        public final void onClick(View view) {
            EventBodyView.m118170a(this.f79596a).mo113558l();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$h */
    public static final class View$OnClickListenerC31414h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79603a;

        View$OnClickListenerC31414h(EventBodyView eventBodyView) {
            this.f79603a = eventBodyView;
        }

        public final void onClick(View view) {
            EventBodyView.m118170a(this.f79603a).mo113554h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$i */
    public static final class View$OnClickListenerC31415i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79604a;

        View$OnClickListenerC31415i(EventBodyView eventBodyView) {
            this.f79604a = eventBodyView;
        }

        public final void onClick(View view) {
            EventBodyView.m118170a(this.f79604a).mo113554h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$showOrganizer$4", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$n */
    public static final class C31420n extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79614a;

        /* renamed from: b */
        final /* synthetic */ IBodyData.IOrganizerData f79615b;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            this.f79614a.mo114054a(this.f79615b.mo113378d());
        }

        C31420n(EventBodyView eventBodyView, IBodyData.IOrganizerData eVar) {
            this.f79614a = eventBodyView;
            this.f79615b = eVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventBodyView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ ICalendarDetailContact.IDetailViewAction m118170a(EventBodyView eventBodyView) {
        ICalendarDetailContact.IDetailViewAction cVar = eventBodyView.f79587a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$j */
    public static final class View$OnClickListenerC31416j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79605a;

        /* renamed from: b */
        final /* synthetic */ String f79606b;

        /* renamed from: c */
        final /* synthetic */ IBodyData.ILocationData f79607c;

        View$OnClickListenerC31416j(EventBodyView eventBodyView, String str, IBodyData.ILocationData dVar) {
            this.f79605a = eventBodyView;
            this.f79606b = str;
            this.f79607c = dVar;
        }

        public final void onClick(View view) {
            EventBodyView.m118170a(this.f79605a).mo113544a(this.f79606b, this.f79607c.mo113612f(), this.f79607c.mo113613g());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/view/EventBodyView$showOrganizer$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$m */
    public static final class C31419m extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79612a;

        /* renamed from: b */
        final /* synthetic */ IBodyData.IOrganizerData f79613b;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f79612a.mo114054a(this.f79613b.mo113378d());
        }

        C31419m(EventBodyView eventBodyView, IBodyData.IOrganizerData eVar) {
            this.f79612a = eventBodyView;
            this.f79613b = eVar;
        }
    }

    /* renamed from: a */
    private final MeetingRoomView m118171a(IBodyData.IMeetingRoomData iMeetingRoomData) {
        MeetingRoomView meetingRoomView = new MeetingRoomView(getContext());
        DetailMeetingRoomBinder.f79228a.mo113706a(meetingRoomView, iMeetingRoomData, new C31412f(this));
        return meetingRoomView;
    }

    /* renamed from: a */
    public final void mo114052a(AssociatedLiveStatus associatedLiveStatus) {
        Intrinsics.checkParameterIsNotNull(associatedLiveStatus, "associatedLiveStatus");
        ((VideoUrlContainer) mo114060e(R.id.videoUrlContainer)).mo113992a(associatedLiveStatus);
    }

    /* renamed from: a */
    public final void mo114053a(AssociatedVideoChatStatus associatedVideoChatStatus) {
        Intrinsics.checkParameterIsNotNull(associatedVideoChatStatus, "associatedVideoChatStatus");
        ((VideoUrlContainer) mo114060e(R.id.videoUrlContainer)).mo113993a(associatedVideoChatStatus);
    }

    /* renamed from: a */
    public final void mo114054a(String str) {
        ICalendarDetailContact.IDetailViewAction cVar = this.f79587a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        cVar.mo113543a(str);
        CalendarHitPoint.m124161t();
        GeneralHitPoint.m124264o("event_detail");
    }

    /* renamed from: a */
    public final void mo114055a(List<String> list) {
        IBodyData iBodyData = this.f79588c;
        if (iBodyData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData.mo113649a()) {
            m118177l();
        } else {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.meetingRoomZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "meetingRoomZone");
            constraintLayout.setVisibility(8);
        }
        IBodyData iBodyData2 = this.f79588c;
        if (iBodyData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData2.mo113651c()) {
            m118179n();
        } else {
            InterceptConstraintLayout interceptConstraintLayout = (InterceptConstraintLayout) mo114060e(R.id.locationZone);
            Intrinsics.checkExpressionValueIsNotNull(interceptConstraintLayout, "locationZone");
            interceptConstraintLayout.setVisibility(8);
        }
        IBodyData iBodyData3 = this.f79588c;
        if (iBodyData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData3.mo113660l()) {
            m118185t();
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.eventScopeZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "eventScopeZone");
            constraintLayout2.setVisibility(8);
        }
        IBodyData iBodyData4 = this.f79588c;
        if (iBodyData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData4.mo113662n()) {
            m118186u();
        } else {
            ConstraintLayout constraintLayout3 = (ConstraintLayout) mo114060e(R.id.eventStatusZone);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "eventStatusZone");
            constraintLayout3.setVisibility(8);
        }
        if (list == null || !list.contains("event_description")) {
            IBodyData iBodyData5 = this.f79588c;
            if (iBodyData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
            }
            if (!iBodyData5.mo113666r()) {
                IBodyData iBodyData6 = this.f79588c;
                if (iBodyData6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
                }
                if (!iBodyData6.mo113667s()) {
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) mo114060e(R.id.descriptionZone);
                    Intrinsics.checkExpressionValueIsNotNull(constraintLayout4, "descriptionZone");
                    constraintLayout4.setVisibility(8);
                }
            }
            m118187v();
        }
        IBodyData iBodyData7 = this.f79588c;
        if (iBodyData7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBodyData");
        }
        if (iBodyData7.mo113664p()) {
            m118188w();
            return;
        }
        ConstraintLayout constraintLayout5 = (ConstraintLayout) mo114060e(R.id.eventAttachmentZone);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout5, "eventAttachmentZone");
        constraintLayout5.setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EventBodyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "webView", "Landroid/webkit/WebView;", "kotlin.jvm.PlatformType", "url", "", "onStartLoading"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.EventBodyView$e */
    public static final class C31411e implements AbstractC8922b {

        /* renamed from: a */
        final /* synthetic */ EventBodyView f79600a;

        C31411e(EventBodyView eventBodyView) {
            this.f79600a = eventBodyView;
        }

        @Override // com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8922b
        public final boolean onStartLoading(WebView webView, String str) {
            C30022a.f74882a.statisticsDependency().mo108184a();
            Context context = this.f79600a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Intrinsics.checkExpressionValueIsNotNull(str, "url");
            RecruitmentUrlProcess eVar = new RecruitmentUrlProcess(context, str);
            if (eVar.mo113586b()) {
                eVar.mo113583a();
                return true;
            }
            C30022a.f74882a.browserModuleDependency().mo108211a(this.f79600a.getContext(), str);
            return true;
        }
    }

    /* renamed from: a */
    private final void m118172a(boolean z, boolean z2) {
        int i;
        if (!z || !z2) {
            i = UIHelper.dp2px(13.0f);
        } else {
            i = UIHelper.dp2px(15.0f);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo114060e(R.id.locationLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "locationLayout");
        int paddingLeft = constraintLayout.getPaddingLeft();
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo114060e(R.id.locationLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "locationLayout");
        int paddingRight = constraintLayout2.getPaddingRight();
        ConstraintLayout constraintLayout3 = (ConstraintLayout) mo114060e(R.id.locationLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "locationLayout");
        ((ConstraintLayout) mo114060e(R.id.locationLayout)).setPadding(paddingLeft, i, paddingRight, constraintLayout3.getPaddingBottom());
    }

    /* renamed from: a */
    public final void mo114051a(IBodyData iBodyData, ICalendarDetailContact.IDetailViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(iBodyData, "viewIn");
        Intrinsics.checkParameterIsNotNull(cVar, "viewOut");
        this.f79588c = iBodyData;
        this.f79587a = cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventBodyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
