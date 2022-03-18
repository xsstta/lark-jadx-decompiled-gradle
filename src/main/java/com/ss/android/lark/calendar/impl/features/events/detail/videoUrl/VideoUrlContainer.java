package com.ss.android.lark.calendar.impl.features.events.detail.videoUrl;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.aq;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedIdType;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedLiveStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedMeetingStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedVideoChatStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.LiveStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.listener.IVideoUrlListener;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u0000 ^2\u00020\u0001:\u0001^B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010,\u001a\u00020-H\u0002J\u001c\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00132\n\u00100\u001a\u000601j\u0002`2H\u0002J\b\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u001fH\u0002J\b\u00107\u001a\u00020-H\u0002J\u0010\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020-2\u0006\u00109\u001a\u00020:H\u0002J\u0018\u0010<\u001a\u00020-2\u0006\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020\nH\u0002J\b\u0010>\u001a\u00020-H\u0002J\u000e\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020'J\b\u0010G\u001a\u00020-H\u0002J\u0010\u0010H\u001a\u00020-2\u0006\u0010I\u001a\u00020\nH\u0002J\b\u0010J\u001a\u00020-H\u0002J1\u0010K\u001a\u00020-2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010MH\u0002¢\u0006\u0002\u0010PJ\b\u0010Q\u001a\u00020-H\u0002J\b\u0010R\u001a\u00020-H\u0002J\b\u0010S\u001a\u00020-H\u0002J\u0001\u0010T\u001a\u00020-2\u0006\u00109\u001a\u00020:2\u0006\u0010U\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\n2\b\b\u0002\u0010Z\u001a\u00020\u00132\b\b\u0002\u0010[\u001a\u00020\u00132\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010M¢\u0006\u0002\u0010]R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/VideoUrlContainer;", "Landroid/widget/RelativeLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isCalendarMeetingStatusEnabled", "", "isFirstHitPointInfo", "isVcPreSettingEnabled", "getMContext", "()Landroid/content/Context;", "mCopyToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mEventCrossTenant", "mEventServerId", "", "mEventSource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;", "mEventStartTime", "mEventType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Type;", "mGoogleVideoMeetingConfigs", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$GoogleVideoMeetingConfigs;", "mLiveEventId", "mMeetingUniqueId", "mMeetingUrl", "mOtherVideoMeetingConfigs", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs;", "mPstnDetailInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "mVideoShow", "mVideoShowStatus", "mVideoType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "mVideoUrlListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/listener/IVideoUrlListener;", "onClickListenerEnterVideo", "Landroid/view/View$OnClickListener;", "onClickListenerPhone", "onClickListenerSetting", "bindCopyListener", "", "excludeCharactersPhoneNumberNeedNot", "str", "phoneNumber", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getOtherVideoDrawable", "Landroid/graphics/drawable/Drawable;", "getOtherVideoTip", "otherVideoMeetingConfigs", "initListener", "initLiveShowData", "videoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "initOtherShowData", "initVCShowData", "canEditEvent", "initView", "refreshLiveStatusByVCPush", "liveStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedLiveStatus;", "refreshVCStatusByVCPush", "vcMeetingStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedVideoChatStatus;", "setListener", "videoUrlListener", "showLiveInitialView", "showMeetingVideo", "isShow", "showMeetingVideoDisable", "showMeetingVideoLive", "dueTime", "", "reqServerTime", "reqClientStartTime", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "showMeetingVideoNotLive", "showOtherInitialView", "showVCInitialView", "showVideoMeetingStatus", "videoStatus", "isCrossTenant", "eventType", "eventSource", "liveEventId", "eventServerId", "eventStartTime", "pstnDetailInfo", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;IZLcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Type;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoUrlContainer extends RelativeLayout {

    /* renamed from: n */
    public static final Companion f79546n = new Companion(null);

    /* renamed from: a */
    public VideoType f79547a;

    /* renamed from: b */
    public String f79548b;

    /* renamed from: c */
    public String f79549c;

    /* renamed from: d */
    public int f79550d;

    /* renamed from: e */
    public CalendarPstnDetailInfo f79551e;

    /* renamed from: f */
    public IVideoUrlListener f79552f;

    /* renamed from: g */
    public RequestLoadingDialog f79553g;

    /* renamed from: h */
    public CalendarEvent.Type f79554h;

    /* renamed from: i */
    public CalendarEvent.Source f79555i;

    /* renamed from: j */
    public boolean f79556j;

    /* renamed from: k */
    public String f79557k;

    /* renamed from: l */
    public String f79558l;

    /* renamed from: m */
    public final boolean f79559m;

    /* renamed from: o */
    private boolean f79560o;

    /* renamed from: p */
    private String f79561p;

    /* renamed from: q */
    private EventVideoMeetingConfig.OtherVideoMeetingConfigs f79562q;

    /* renamed from: r */
    private EventVideoMeetingConfig.GoogleVideoMeetingConfigs f79563r;

    /* renamed from: s */
    private boolean f79564s;

    /* renamed from: t */
    private boolean f79565t;

    /* renamed from: u */
    private View.OnClickListener f79566u;

    /* renamed from: v */
    private View.OnClickListener f79567v;

    /* renamed from: w */
    private final View.OnClickListener f79568w;

    /* renamed from: x */
    private final Context f79569x;

    /* renamed from: y */
    private HashMap f79570y;

    public VideoUrlContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public VideoUrlContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo113991a(int i) {
        if (this.f79570y == null) {
            this.f79570y = new HashMap();
        }
        View view = (View) this.f79570y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79570y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/VideoUrlContainer$Companion;", "", "()V", "ANIM_MEETING_LIVE_FILE_PATH", "", "ANIM_MEETING_VIDEO_FILE_PATH", "COPY_RIGHT_MARGIN", "", "DIALOG_HEIGHT", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getMContext() {
        return this.f79569x;
    }

    /* renamed from: a */
    public final void mo113995a(String str, StringBuilder sb) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (('0' <= charAt && '9' >= charAt) || charAt == ' ' || charAt == '+' || charAt == '*' || charAt == '#') {
                sb.append(charAt);
            }
        }
    }

    /* renamed from: a */
    public final void mo113994a(DoVideoMeeting doVideoMeeting, int i, boolean z, CalendarEvent.Type type, CalendarEvent.Source source, String str, boolean z2, String str2, String str3, CalendarPstnDetailInfo aVar, Long l, Long l2, Long l3) {
        Intrinsics.checkParameterIsNotNull(doVideoMeeting, "videoMeeting");
        Intrinsics.checkParameterIsNotNull(type, "eventType");
        Intrinsics.checkParameterIsNotNull(source, "eventSource");
        Intrinsics.checkParameterIsNotNull(str, "liveEventId");
        Intrinsics.checkParameterIsNotNull(str2, "eventServerId");
        Intrinsics.checkParameterIsNotNull(str3, "eventStartTime");
        this.f79547a = VideoType.Companion.mo114049a(doVideoMeeting.getMeetingType().getNumber());
        if (!C30022a.f74883b.mo112704l() && doVideoMeeting.getMeetingType() == VideoType.LARK_LIVE_HOST) {
            this.f79547a = VideoType.UNKNOWN_VIDEO_MEETING_TYPE;
        }
        this.f79556j = z;
        this.f79554h = type;
        this.f79555i = source;
        this.f79550d = (this.f79547a != VideoType.GOOGLE_VIDEO_CONFERENCE || C30022a.f74883b.mo112696d()) ? i : 0;
        this.f79561p = str;
        this.f79562q = doVideoMeeting.getOtherVideoConfigs();
        this.f79563r = doVideoMeeting.getGoogleVideoConfigs();
        this.f79551e = aVar;
        this.f79557k = str2;
        this.f79558l = str3;
        String str4 = null;
        boolean z3 = true;
        if (aVar == null || !aVar.mo108374a() || !this.f79559m) {
            if (this.f79551e == null) {
                RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.img_phone_icon_container);
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(null);
                }
            } else {
                RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.img_phone_icon_container);
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
            }
            RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.calendar_phone_container);
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
            View a = mo113991a(R.id.video_url_bottom_divider);
            if (a != null) {
                a.setVisibility(8);
            }
        } else {
            RelativeLayout relativeLayout4 = (RelativeLayout) mo113991a(R.id.img_phone_icon_container);
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(0);
            }
            TextView textView = (TextView) mo113991a(R.id.phone_number);
            Intrinsics.checkExpressionValueIsNotNull(textView, "phone_number");
            CalendarPstnDetailInfo aVar2 = this.f79551e;
            if (aVar2 != null) {
                str4 = aVar2.mo108376c();
            }
            textView.setText(str4);
            RelativeLayout relativeLayout5 = (RelativeLayout) mo113991a(R.id.img_phone_icon_container);
            if (relativeLayout5 != null) {
                relativeLayout5.setOnClickListener(this.f79568w);
            }
            if (this.f79547a == VideoType.GOOGLE_VIDEO_CONFERENCE) {
                String googlePhoneNumber = doVideoMeeting.getGooglePhoneNumber();
                if (googlePhoneNumber != null) {
                    if (googlePhoneNumber.length() == 0) {
                        RelativeLayout relativeLayout6 = (RelativeLayout) mo113991a(R.id.calendar_phone_container);
                        Intrinsics.checkExpressionValueIsNotNull(relativeLayout6, "calendar_phone_container");
                        relativeLayout6.setVisibility(8);
                        RelativeLayout relativeLayout7 = (RelativeLayout) mo113991a(R.id.img_phone_icon_container);
                        Intrinsics.checkExpressionValueIsNotNull(relativeLayout7, "img_phone_icon_container");
                        relativeLayout7.setVisibility(8);
                    }
                }
                String googleMorePhoneNumberUrl = doVideoMeeting.getGoogleMorePhoneNumberUrl();
                if (googleMorePhoneNumberUrl != null) {
                    if (googleMorePhoneNumberUrl.length() == 0) {
                        RelativeLayout relativeLayout8 = (RelativeLayout) mo113991a(R.id.more_phone_number_container);
                        Intrinsics.checkExpressionValueIsNotNull(relativeLayout8, "more_phone_number_container");
                        relativeLayout8.setVisibility(8);
                        RelativeLayout relativeLayout9 = (RelativeLayout) mo113991a(R.id.calendar_phone_container);
                        Intrinsics.checkExpressionValueIsNotNull(relativeLayout9, "calendar_phone_container");
                        ViewGroup.LayoutParams layoutParams = relativeLayout9.getLayoutParams();
                        if (layoutParams != null) {
                            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                            layoutParams2.height = -2;
                            RelativeLayout relativeLayout10 = (RelativeLayout) mo113991a(R.id.calendar_phone_container);
                            Intrinsics.checkExpressionValueIsNotNull(relativeLayout10, "calendar_phone_container");
                            relativeLayout10.setLayoutParams(layoutParams2);
                            TextView textView2 = (TextView) mo113991a(R.id.phone_number);
                            Intrinsics.checkExpressionValueIsNotNull(textView2, "phone_number");
                            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                            if (layoutParams3 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                                marginLayoutParams.bottomMargin = (int) C25653b.m91892a(getContext(), 16.0f);
                                TextView textView3 = (TextView) mo113991a(R.id.phone_number);
                                Intrinsics.checkExpressionValueIsNotNull(textView3, "phone_number");
                                textView3.setLayoutParams(marginLayoutParams);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        }
                    }
                }
            }
        }
        int i2 = C31407a.f79584a[this.f79547a.ordinal()];
        if (i2 == 1) {
            m118143b(doVideoMeeting);
        } else if (i2 != 2) {
            m118139a(doVideoMeeting, z2);
        } else {
            m118138a(doVideoMeeting);
        }
        if (i == 0) {
            m118141a(false);
        } else if (i == 1) {
            m118141a(true);
        } else if (i == 2) {
            m118140a(l, l2, l3);
        } else if (i == 3) {
            m118146e();
        } else if (i != 4) {
            m118141a(false);
        } else {
            m118145d();
        }
        boolean z4 = i == 2 || i == 4;
        if (this.f79565t && this.f79560o && z4) {
            String str5 = this.f79557k;
            String str6 = this.f79558l;
            if (i != 2) {
                z3 = false;
            }
            CalendarEventHitPoint.m124346a(str5, str6, z3);
            this.f79565t = false;
        }
    }

    /* renamed from: a */
    public final void mo113993a(AssociatedVideoChatStatus associatedVideoChatStatus) {
        Intrinsics.checkParameterIsNotNull(associatedVideoChatStatus, "vcMeetingStatus");
        if ((associatedVideoChatStatus.getIdType() != AssociatedIdType.UNIQUE_ID && associatedVideoChatStatus.getIdType() != AssociatedIdType.INTERVIEW_UID) || !Intrinsics.areEqual(associatedVideoChatStatus.getId(), this.f79548b)) {
            return;
        }
        if (associatedVideoChatStatus.getMeetingInfo().getMeetingStatus() == AssociatedMeetingStatus.MEETING_ON_THE_CALL) {
            m118137a(this, null, null, null, 7, null);
        } else {
            m118145d();
        }
    }

    /* renamed from: a */
    public final void mo113992a(AssociatedLiveStatus associatedLiveStatus) {
        Intrinsics.checkParameterIsNotNull(associatedLiveStatus, "liveStatus");
        if (!Intrinsics.areEqual(associatedLiveStatus.getAssociated_event_id(), this.f79561p)) {
            return;
        }
        if (associatedLiveStatus.getLive_status() == LiveStatus.LIVING) {
            m118137a(this, null, null, null, 7, null);
        } else {
            m118145d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/videoUrl/VideoUrlContainer$bindCopyListener$callback$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/CopyPopWindow$CopyPopWindowCallBack;", "finishCopy", "", "getCopyText", "", "ifShowPopWindow", "", "xLocation", "", "onPopWindowDismiss", "onPopWindowShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$c */
    public static final class C31396c implements C31475c.AbstractC31480a {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79573a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public void mo113999a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: a */
        public boolean mo114000a(int i) {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: b */
        public void mo114001b() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: c */
        public String mo114002c() {
            String b;
            if (!this.f79573a.f79559m) {
                return this.f79573a.f79549c;
            }
            CalendarPstnDetailInfo aVar = this.f79573a.f79551e;
            if (aVar == null || (b = aVar.mo108375b()) == null) {
                return "";
            }
            return b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.AbstractC31480a
        /* renamed from: d */
        public void mo114003d() {
            RequestLoadingDialog requestLoadingDialog = this.f79573a.f79553g;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112593d(R.string.Calendar_VideoMeeting_VCLinkSuccess);
            }
            RequestLoadingDialog requestLoadingDialog2 = this.f79573a.f79553g;
            if (requestLoadingDialog2 != null) {
                requestLoadingDialog2.show();
            }
            GeneralHitPoint.m124215a("event_detail", this.f79573a.f79556j, this.f79573a.f79554h, this.f79573a.f79555i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31396c(VideoUrlContainer videoUrlContainer) {
            this.f79573a = videoUrlContainer;
        }
    }

    /* renamed from: c */
    private final void m118144c() {
        View$OnLongClickListenerC31395b bVar;
        C31396c cVar = new C31396c(this);
        View rootView = getRootView();
        if (!this.f79559m) {
            bVar = new View$OnLongClickListenerC31395b(this, cVar);
        } else {
            bVar = null;
        }
        rootView.setOnLongClickListener(bVar);
    }

    /* renamed from: d */
    private final void m118145d() {
        if (this.f79560o) {
            setVisibility(0);
            int i = C31407a.f79585b[this.f79547a.ordinal()];
            if (i == 1) {
                m118149h();
            } else if (i == 2 || i == 3) {
                m118148g();
            } else {
                m118147f();
            }
        }
    }

    /* renamed from: a */
    private final void m118135a() {
        if (this.f79559m) {
            LayoutInflater.from(this.f79569x).inflate(R.layout.calendar_view_url_container_status, this);
        } else {
            LayoutInflater.from(this.f79569x).inflate(R.layout.calendar_view_url_container, this);
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.video_meeting_time_container);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.calendar_phone_container);
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.calendar_video_setting_container);
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(0);
        }
        Context context = this.f79569x;
        if (context != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
            this.f79553g = requestLoadingDialog;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    private final Drawable getOtherVideoDrawable() {
        EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType;
        EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs = this.f79562q;
        if (otherVideoMeetingConfigs == null || (iconType = otherVideoMeetingConfigs.icon) == null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            return UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_video_outlined, UDColorUtils.getColor(context2, R.color.icon_n3));
        } else if (iconType == EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.LIVE) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            return UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_livestream_outlined, UDColorUtils.getColor(context4, R.color.icon_n3));
        } else {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            return UDIconUtils.getIconDrawable(context5, (int) R.drawable.ud_icon_video_outlined, UDColorUtils.getColor(context6, R.color.icon_n3));
        }
    }

    /* renamed from: b */
    private final void m118142b() {
        View.OnClickListener onClickListener;
        m118144c();
        UDButton uDButton = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton != null) {
            uDButton.setOnClickListener(this.f79566u);
        }
        View rootView = getRootView();
        if (this.f79559m) {
            onClickListener = null;
        } else {
            onClickListener = this.f79566u;
        }
        rootView.setOnClickListener(onClickListener);
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.img_copy_icon_container);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View$OnClickListenerC31397d(this));
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this.f79567v);
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.more_phone_number_container);
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new View$OnClickListenerC31398e(this));
        }
        ImageView imageView = (ImageView) mo113991a(R.id.more_phone_number_arrow);
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC31399f(this));
        }
        TextView textView = (TextView) mo113991a(R.id.phone_dial_in);
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC31400g(this));
        }
    }

    /* renamed from: e */
    private final void m118146e() {
        setVisibility(0);
        m118147f();
        ImageView imageView = (ImageView) mo113991a(R.id.img_setting_icon);
        if (imageView != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_setting_outlined, UDColorUtils.getColor(context2, R.color.ud_N400)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(null);
        }
        TextView textView = (TextView) mo113991a(R.id.tv_video_tip);
        if (textView != null) {
            textView.setTextColor(C32634ae.m125178a(R.color.text_link_disable));
        }
        TextView textView2 = (TextView) mo113991a(R.id.video_setting_text);
        if (textView2 != null) {
            textView2.setTextColor(C32634ae.m125178a(R.color.text_disable));
        }
        ImageView imageView2 = (ImageView) mo113991a(R.id.video_setting_arrow);
        if (imageView2 != null) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            imageView2.setImageDrawable(UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_right_outlined, UDColorUtils.getColor(context4, R.color.icon_disable)));
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.calendar_video_setting_container);
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(null);
        }
        ImageView imageView3 = (ImageView) mo113991a(R.id.video_setting_arrow);
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
    }

    /* renamed from: h */
    private final void m118149h() {
        ImageView imageView = (ImageView) mo113991a(R.id.img_live_status);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo113991a(R.id.anim_live_status);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo113991a(R.id.anim_live_status);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.cancelAnimation();
        }
        ImageView imageView2 = (ImageView) mo113991a(R.id.img_video_live_meeting);
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = (ImageView) mo113991a(R.id.img_video_live_meeting);
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.ud_icon_video_outlined);
        }
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.cancelAnimation();
        }
        UDButton uDButton = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            uDButton.setStrokeColor(UDColorUtils.getColor(context, R.color.primary_pri_500));
        }
        UDButton uDButton2 = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton2 != null) {
            uDButton2.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
        }
        UDButton uDButton3 = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton3 != null) {
            uDButton3.setText(C32634ae.m125182b(R.string.Calendar_Edit_EnterLivestream));
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.video_meeting_time_container);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        Chronometer chronometer = (Chronometer) mo113991a(R.id.video_meeting_time);
        if (chronometer != null) {
            chronometer.stop();
        }
    }

    /* renamed from: f */
    private final void m118147f() {
        TextView textView = (TextView) mo113991a(R.id.tv_video_tip);
        if (textView != null) {
            textView.setTextColor(C32634ae.m125178a(R.color.text_link_normal));
        }
        ImageView imageView = (ImageView) mo113991a(R.id.img_video_meeting);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo113991a(R.id.anim_video_meeting_live);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo113991a(R.id.anim_video_meeting_live);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.cancelAnimation();
        }
        TextView textView2 = (TextView) mo113991a(R.id.tv_video_tip);
        if (textView2 != null) {
            textView2.setText(C32634ae.m125182b(R.string.Calendar_VideoMeeting_OpenVideoMeeting));
        }
        ImageView imageView2 = (ImageView) mo113991a(R.id.img_setting_icon);
        if (imageView2 != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            imageView2.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_setting_outlined, UDColorUtils.getColor(context2, R.color.icon_n3)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(this.f79567v);
        }
        ImageView imageView3 = (ImageView) mo113991a(R.id.img_video_live_meeting);
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = (ImageView) mo113991a(R.id.img_video_live_meeting);
        if (imageView4 != null) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            imageView4.setImageDrawable(UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_video_outlined, UDColorUtils.getColor(context4, R.color.icon_n3)));
        }
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.cancelAnimation();
        }
        UDButton uDButton = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton != null) {
            uDButton.setText(C32634ae.m125182b(R.string.Calendar_VideoMeeting_OpenVideoMeeting));
        }
        UDButton uDButton2 = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton2 != null) {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            uDButton2.setStrokeColor(UDColorUtils.getColor(context5, R.color.primary_pri_500));
        }
        UDButton uDButton3 = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton3 != null) {
            uDButton3.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
        }
        TextView textView3 = (TextView) mo113991a(R.id.video_setting_text);
        if (textView3 != null) {
            textView3.setTextColor(C32634ae.m125178a(R.color.text_title));
        }
        ImageView imageView5 = (ImageView) mo113991a(R.id.video_setting_arrow);
        if (imageView5 != null) {
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            Context context7 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context7, "context");
            imageView5.setImageDrawable(UDIconUtils.getIconDrawable(context6, (int) R.drawable.ud_icon_right_outlined, UDColorUtils.getColor(context7, R.color.icon_n3)));
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.video_setting_text_container);
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this.f79567v);
        }
        ImageView imageView6 = (ImageView) mo113991a(R.id.video_setting_arrow);
        if (imageView6 != null) {
            imageView6.setOnClickListener(this.f79567v);
        }
        RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.video_meeting_time_container);
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        Chronometer chronometer = (Chronometer) mo113991a(R.id.video_meeting_time);
        if (chronometer != null) {
            chronometer.stop();
        }
    }

    /* renamed from: g */
    private final void m118148g() {
        int i;
        int i2;
        int i3;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo113991a(R.id.anim_video_meeting_live);
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo113991a(R.id.anim_video_meeting_live);
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.cancelAnimation();
        }
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
        if (lottieAnimationView4 != null) {
            lottieAnimationView4.cancelAnimation();
        }
        ImageView imageView = (ImageView) mo113991a(R.id.img_video_meeting);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) mo113991a(R.id.img_video_meeting);
        if (imageView2 != null) {
            imageView2.setImageDrawable(getOtherVideoDrawable());
        }
        ImageView imageView3 = (ImageView) mo113991a(R.id.img_video_live_meeting);
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = (ImageView) mo113991a(R.id.img_video_live_meeting);
        if (imageView4 != null) {
            imageView4.setImageDrawable(getOtherVideoDrawable());
        }
        boolean c = aq.m95060c(this.f79549c);
        TextView textView = (TextView) mo113991a(R.id.tv_video_tip);
        if (textView != null) {
            if (c) {
                i3 = R.color.text_link_normal;
            } else {
                i3 = R.color.text_link_disable;
            }
            textView.setTextColor(C32634ae.m125178a(i3));
        }
        UDButton uDButton = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton != null) {
            if (c) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                i2 = UDColorUtils.getColor(context, R.color.primary_pri_500);
            } else {
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                i2 = UDColorUtils.getColor(context2, R.color.text_title);
            }
            uDButton.setStrokeColor(i2);
        }
        UDButton uDButton2 = (UDButton) mo113991a(R.id.video_live_btn);
        if (uDButton2 != null) {
            if (c) {
                i = C32634ae.m125178a(R.color.primary_pri_500);
            } else {
                i = C32634ae.m125178a(R.color.text_title);
            }
            uDButton2.setTextColor(i);
        }
        EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs = this.f79562q;
        if (otherVideoMeetingConfigs != null) {
            TextView textView2 = (TextView) mo113991a(R.id.tv_video_tip);
            if (textView2 != null) {
                textView2.setText(m118134a(otherVideoMeetingConfigs));
            }
            UDButton uDButton3 = (UDButton) mo113991a(R.id.video_live_btn);
            if (uDButton3 != null) {
                uDButton3.setText(m118134a(otherVideoMeetingConfigs));
            }
        } else {
            TextView textView3 = (TextView) mo113991a(R.id.tv_video_tip);
            if (textView3 != null) {
                textView3.setText(C32634ae.m125182b(R.string.Calendar_VideoMeeting_OpenVideoMeeting));
            }
            UDButton uDButton4 = (UDButton) mo113991a(R.id.video_live_btn);
            if (uDButton4 != null) {
                uDButton4.setText(C32634ae.m125182b(R.string.Calendar_VideoMeeting_OpenVideoMeeting));
            }
        }
        if (this.f79563r != null) {
            TextView textView4 = (TextView) mo113991a(R.id.tv_video_tip);
            if (textView4 != null) {
                textView4.setText(C32634ae.m125182b(R.string.Calendar_VideoMeeting_JoinVideoMeeting));
            }
            UDButton uDButton5 = (UDButton) mo113991a(R.id.video_live_btn);
            if (uDButton5 != null) {
                uDButton5.setText(C32634ae.m125182b(R.string.Calendar_VideoMeeting_JoinVideoMeeting));
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.calendar_video_setting_container);
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
    }

    public final void setListener(IVideoUrlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "videoUrlListener");
        this.f79552f = aVar;
    }

    /* renamed from: a */
    private final void m118141a(boolean z) {
        int i;
        this.f79560o = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$j */
    static final class View$OnClickListenerC31403j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79580a;

        View$OnClickListenerC31403j(VideoUrlContainer videoUrlContainer) {
            this.f79580a = videoUrlContainer;
        }

        public final void onClick(View view) {
            IVideoUrlListener aVar = this.f79580a.f79552f;
            if (aVar != null) {
                aVar.mo114016a(this.f79580a.f79548b);
            }
            CalendarEventHitPoint.m124344a(this.f79580a.f79557k, this.f79580a.f79558l, "edit_vc_setting", (String) null, (String) null, 24, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$k */
    public static final class View$OnClickListenerC31404k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79581a;

        View$OnClickListenerC31404k(VideoUrlContainer videoUrlContainer) {
            this.f79581a = videoUrlContainer;
        }

        public final void onClick(View view) {
            Context context = this.f79581a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.show(context, (int) R.string.Calendar_Edit_MeetingCantChange);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$l */
    public static final class View$OnClickListenerC31405l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79582a;

        View$OnClickListenerC31405l(VideoUrlContainer videoUrlContainer) {
            this.f79582a = videoUrlContainer;
        }

        public final void onClick(View view) {
            Context context = this.f79582a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.show(context, (int) R.string.Calendar_Edit_MeetingCantChange);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$m */
    public static final class View$OnClickListenerC31406m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79583a;

        View$OnClickListenerC31406m(VideoUrlContainer videoUrlContainer) {
            this.f79583a = videoUrlContainer;
        }

        public final void onClick(View view) {
            Context context = this.f79583a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.show(context, (int) R.string.Calendar_Edit_MeetingCantChange);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$e */
    public static final class View$OnClickListenerC31398e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79575a;

        View$OnClickListenerC31398e(VideoUrlContainer videoUrlContainer) {
            this.f79575a = videoUrlContainer;
        }

        public final void onClick(View view) {
            GetAdminSettingsResponse getAdminSettingsResponse;
            IVideoUrlListener aVar = this.f79575a.f79552f;
            if (aVar != null) {
                VideoType videoType = this.f79575a.f79547a;
                String str = this.f79575a.f79549c;
                CalendarPstnDetailInfo aVar2 = this.f79575a.f79551e;
                if (aVar2 != null) {
                    getAdminSettingsResponse = aVar2.mo108377d();
                } else {
                    getAdminSettingsResponse = null;
                }
                aVar.mo114014a(videoType, str, getAdminSettingsResponse);
            }
            CalendarEventHitPoint.m124344a(this.f79575a.f79557k, this.f79575a.f79558l, "join_phone_more", (String) null, (String) null, 24, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$f */
    public static final class View$OnClickListenerC31399f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79576a;

        View$OnClickListenerC31399f(VideoUrlContainer videoUrlContainer) {
            this.f79576a = videoUrlContainer;
        }

        public final void onClick(View view) {
            GetAdminSettingsResponse getAdminSettingsResponse;
            IVideoUrlListener aVar = this.f79576a.f79552f;
            if (aVar != null) {
                VideoType videoType = this.f79576a.f79547a;
                String str = this.f79576a.f79549c;
                CalendarPstnDetailInfo aVar2 = this.f79576a.f79551e;
                if (aVar2 != null) {
                    getAdminSettingsResponse = aVar2.mo108377d();
                } else {
                    getAdminSettingsResponse = null;
                }
                aVar.mo114014a(videoType, str, getAdminSettingsResponse);
            }
            CalendarEventHitPoint.m124344a(this.f79576a.f79557k, this.f79576a.f79558l, "join_phone_more", (String) null, (String) null, 24, (Object) null);
        }
    }

    /* renamed from: a */
    private final String m118134a(EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs) {
        boolean z;
        String str = otherVideoMeetingConfigs.customized_description;
        Intrinsics.checkExpressionValueIsNotNull(str, "otherVideoMeetingConfigs.customized_description");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str2 = otherVideoMeetingConfigs.customized_description;
            if (str2 != null) {
                return str2;
            }
            return "";
        } else if (otherVideoMeetingConfigs.icon == EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.LIVE) {
            String b = C32634ae.m125182b(R.string.Calendar_Edit_EnterLivestream);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…dar_Edit_EnterLivestream)");
            return b;
        } else {
            String b2 = C32634ae.m125182b(R.string.Calendar_Edit_JoinVC);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Edit_JoinVC)");
            return b2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$h */
    static final class View$OnClickListenerC31401h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79578a;

        View$OnClickListenerC31401h(VideoUrlContainer videoUrlContainer) {
            this.f79578a = videoUrlContainer;
        }

        public final void onClick(View view) {
            boolean z;
            IVideoUrlListener aVar = this.f79578a.f79552f;
            if (aVar != null) {
                aVar.mo114015a(this.f79578a.f79547a, this.f79578a.f79548b, this.f79578a.f79549c);
            }
            boolean z2 = this.f79578a.f79556j;
            CalendarEvent.Type type = this.f79578a.f79554h;
            CalendarEvent.Source source = this.f79578a.f79555i;
            if (this.f79578a.f79550d == 2) {
                z = true;
            } else {
                z = false;
            }
            GeneralHitPoint.m124216a("event_detail", z2, type, source, z);
            CalendarEventHitPoint.m124344a(this.f79578a.f79557k, this.f79578a.f79558l, "enter_vc", (String) null, (String) null, 24, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$i */
    static final class View$OnClickListenerC31402i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79579a;

        View$OnClickListenerC31402i(VideoUrlContainer videoUrlContainer) {
            this.f79579a = videoUrlContainer;
        }

        public final void onClick(View view) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f79579a.mo113991a(R.id.calendar_phone_container);
            if (relativeLayout == null || relativeLayout.getVisibility() != 8) {
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f79579a.mo113991a(R.id.calendar_phone_container);
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
                View a = this.f79579a.mo113991a(R.id.video_url_bottom_divider);
                if (a != null) {
                    a.setVisibility(8);
                }
                ImageView imageView = (ImageView) this.f79579a.mo113991a(R.id.img_phone_icon);
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_down_outlined);
                    return;
                }
                return;
            }
            RelativeLayout relativeLayout3 = (RelativeLayout) this.f79579a.mo113991a(R.id.calendar_phone_container);
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(0);
            }
            View a2 = this.f79579a.mo113991a(R.id.video_url_bottom_divider);
            if (a2 != null) {
                a2.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) this.f79579a.mo113991a(R.id.img_phone_icon);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ud_icon_up_outlined);
            }
            CalendarEventHitPoint.m124344a(this.f79579a.f79557k, this.f79579a.f79558l, "join_more", (String) null, (String) null, 24, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "rootView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$b */
    public static final class View$OnLongClickListenerC31395b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79571a;

        /* renamed from: b */
        final /* synthetic */ C31396c f79572b;

        View$OnLongClickListenerC31395b(VideoUrlContainer videoUrlContainer, C31396c cVar) {
            this.f79571a = videoUrlContainer;
            this.f79572b = cVar;
        }

        public final boolean onLongClick(View view) {
            CalendarEventHitPoint.m124344a(this.f79571a.f79557k, this.f79571a.f79558l, "copy_vc_link", (String) null, (String) null, 24, (Object) null);
            if (this.f79571a.f79547a == VideoType.LARK_LIVE_HOST) {
                return false;
            }
            int[] iArr = new int[2];
            C31475c cVar = new C31475c((TextView) this.f79571a.mo113991a(R.id.tv_meeting_url), this.f79572b);
            if (TextUtils.isEmpty(this.f79571a.f79549c) || !this.f79572b.mo114000a(iArr[0])) {
                return false;
            }
            TextView textView = (TextView) this.f79571a.mo113991a(R.id.tv_meeting_url);
            if (textView != null) {
                textView.getLocationOnScreen(iArr);
            }
            this.f79572b.mo113999a();
            int i = iArr[0];
            TextView textView2 = (TextView) this.f79571a.mo113991a(R.id.tv_meeting_url);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_meeting_url");
            cVar.mo114215a((i + textView2.getWidth()) - C57582a.m223601a(this.f79571a.getMContext(), 7.0f), iArr[1]);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$d */
    public static final class View$OnClickListenerC31397d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79574a;

        View$OnClickListenerC31397d(VideoUrlContainer videoUrlContainer) {
            this.f79574a = videoUrlContainer;
        }

        public final void onClick(View view) {
            String str;
            if (!TextUtils.isEmpty(this.f79574a.f79549c)) {
                Object systemService = this.f79574a.getMContext().getSystemService("clipboard");
                if (systemService != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    if (!this.f79574a.f79559m || !(this.f79574a.f79547a == VideoType.VCHAT || this.f79574a.f79547a == VideoType.GOOGLE_VIDEO_CONFERENCE)) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(null, this.f79574a.f79549c));
                        RequestLoadingDialog requestLoadingDialog = this.f79574a.f79553g;
                        if (requestLoadingDialog != null) {
                            requestLoadingDialog.mo112593d(R.string.Calendar_VideoMeeting_VCLinkSuccess);
                        }
                        GeneralHitPoint.m124215a("event_detail", this.f79574a.f79556j, this.f79574a.f79554h, this.f79574a.f79555i);
                    } else {
                        CalendarPstnDetailInfo aVar = this.f79574a.f79551e;
                        if (aVar != null) {
                            str = aVar.mo108375b();
                        } else {
                            str = null;
                        }
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
                        RequestLoadingDialog requestLoadingDialog2 = this.f79574a.f79553g;
                        if (requestLoadingDialog2 != null) {
                            requestLoadingDialog2.mo112593d(R.string.Calendar_Edit_JoinInfoCopied);
                        }
                    }
                    RequestLoadingDialog requestLoadingDialog3 = this.f79574a.f79553g;
                    if (requestLoadingDialog3 != null) {
                        requestLoadingDialog3.show();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
                }
            }
            CalendarEventHitPoint.m124344a(this.f79574a.f79557k, this.f79574a.f79558l, "copy_vc_link", (String) null, (String) null, 24, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.VideoUrlContainer$g */
    public static final class View$OnClickListenerC31400g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoUrlContainer f79577a;

        View$OnClickListenerC31400g(VideoUrlContainer videoUrlContainer) {
            this.f79577a = videoUrlContainer;
        }

        public final void onClick(View view) {
            String c;
            String str;
            CalendarPstnDetailInfo aVar = this.f79577a.f79551e;
            if (!(aVar == null || (c = aVar.mo108376c()) == null)) {
                StringBuilder sb = new StringBuilder();
                if (this.f79577a.f79547a == VideoType.GOOGLE_VIDEO_CONFERENCE) {
                    List split$default = StringsKt.split$default((CharSequence) c, new String[]{"PIN"}, false, 0, 6, (Object) null);
                    boolean z = true;
                    String str2 = "";
                    if (!split$default.isEmpty()) {
                        String str3 = (String) split$default.get(0);
                        if (split$default.size() > 1) {
                            str2 = (String) split$default.get(1);
                        }
                        str = str2;
                        str2 = str3;
                    } else {
                        str = str2;
                    }
                    this.f79577a.mo113995a(str2, sb);
                    if (str.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        sb.append(';');
                        this.f79577a.mo113995a(str, sb);
                    }
                } else {
                    this.f79577a.mo113995a(c, sb);
                }
                IVideoUrlListener aVar2 = this.f79577a.f79552f;
                if (aVar2 != null) {
                    aVar2.mo114017b(sb.toString());
                }
            }
            CalendarEventHitPoint.m124344a(this.f79577a.f79557k, this.f79577a.f79558l, "join_phone", (String) null, (String) null, 24, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m118138a(DoVideoMeeting doVideoMeeting) {
        String str;
        boolean z;
        String str2;
        String id = doVideoMeeting.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "videoMeeting.getId()");
        this.f79548b = id;
        this.f79549c = doVideoMeeting.getMeetingUrl();
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.vc_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "vc_container");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.vc_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "vc_container");
        relativeLayout2.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.bg_video_meeting);
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(0);
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) mo113991a(R.id.bg_live_host);
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        TextView textView = (TextView) mo113991a(R.id.tv_meeting_url);
        boolean z2 = true;
        if (textView != null) {
            if (this.f79549c.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = this.f79549c;
            } else {
                str2 = C32634ae.m125182b(R.string.Calendar_Edit_NoVCLink);
            }
            textView.setText(str2);
        }
        RelativeLayout relativeLayout6 = (RelativeLayout) mo113991a(R.id.url_container);
        if (relativeLayout6 != null) {
            relativeLayout6.setVisibility(0);
        }
        RelativeLayout relativeLayout7 = (RelativeLayout) mo113991a(R.id.calendar_video_setting_container);
        if (relativeLayout7 != null) {
            relativeLayout7.setVisibility(8);
        }
        TextView textView2 = (TextView) mo113991a(R.id.tv_video_live_url);
        if (textView2 != null) {
            if (this.f79549c.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                str = this.f79549c;
            } else {
                str = C32634ae.m125182b(R.string.Calendar_Edit_NoVCLink);
            }
            textView2.setText(str);
        }
        RelativeLayout relativeLayout8 = (RelativeLayout) mo113991a(R.id.img_phone_icon_container);
        if (relativeLayout8 != null) {
            relativeLayout8.setVisibility(8);
        }
        RelativeLayout relativeLayout9 = (RelativeLayout) mo113991a(R.id.calendar_phone_container);
        if (relativeLayout9 != null) {
            relativeLayout9.setVisibility(8);
        }
        RelativeLayout relativeLayout10 = (RelativeLayout) mo113991a(R.id.img_copy_icon_container);
        if (relativeLayout10 != null) {
            relativeLayout10.setVisibility(0);
        }
    }

    /* renamed from: b */
    private final void m118143b(DoVideoMeeting doVideoMeeting) {
        boolean z;
        String str;
        this.f79549c = doVideoMeeting.getMeetingUrl();
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.vc_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "vc_container");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.vc_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "vc_container");
        relativeLayout2.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.bg_video_meeting);
        int i = 8;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = (RelativeLayout) mo113991a(R.id.bg_live_host);
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(0);
        }
        TextView textView = (TextView) mo113991a(R.id.tv_live_url);
        if (textView != null) {
            if (this.f79549c.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = this.f79549c;
            } else {
                str = C32634ae.m125182b(R.string.Calendar_Edit_NoVCLink);
            }
            textView.setText(str);
        }
        RelativeLayout relativeLayout6 = (RelativeLayout) mo113991a(R.id.url_container);
        if (relativeLayout6 != null) {
            relativeLayout6.setVisibility(8);
        }
        RelativeLayout relativeLayout7 = (RelativeLayout) mo113991a(R.id.calendar_video_setting_container);
        if (relativeLayout7 != null) {
            relativeLayout7.setVisibility(8);
        }
        if (this.f79559m) {
            RelativeLayout relativeLayout8 = (RelativeLayout) mo113991a(R.id.img_copy_icon_container);
            if (relativeLayout8 != null) {
                relativeLayout8.setVisibility(8);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout9 = (RelativeLayout) mo113991a(R.id.img_copy_icon_container);
        if (relativeLayout9 != null) {
            if (!TextUtils.isEmpty(this.f79549c)) {
                i = 0;
            }
            relativeLayout9.setVisibility(i);
        }
    }

    /* renamed from: a */
    private final void m118139a(DoVideoMeeting doVideoMeeting, boolean z) {
        boolean z2;
        String str;
        boolean z3;
        String str2;
        int i;
        String id = doVideoMeeting.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "videoMeeting.getId()");
        this.f79548b = id;
        boolean z4 = true;
        if (!Intrinsics.areEqual(this.f79549c, doVideoMeeting.getMeetingUrl())) {
            if (!TextUtils.isEmpty(this.f79549c) && !TextUtils.isEmpty(doVideoMeeting.getMeetingUrl())) {
                Context context = this.f79569x;
                String b = C32634ae.m125182b(R.string.Calendar_VideoMeeting_ChangeVCLink);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ideoMeeting_ChangeVCLink)");
                UDToast.show(context, b);
            }
            this.f79549c = doVideoMeeting.getMeetingUrl();
        }
        RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.vc_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "vc_container");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.vc_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "vc_container");
        relativeLayout2.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.img_copy_icon_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "img_copy_icon_container");
        relativeLayout3.setVisibility(0);
        RelativeLayout relativeLayout4 = (RelativeLayout) mo113991a(R.id.bg_video_meeting);
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(0);
        }
        RelativeLayout relativeLayout5 = (RelativeLayout) mo113991a(R.id.bg_live_host);
        int i2 = 8;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        if (!z || this.f79547a != VideoType.VCHAT) {
            z2 = false;
        } else {
            z2 = true;
        }
        RelativeLayout relativeLayout6 = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
        Activity activity = null;
        if (relativeLayout6 != null) {
            if (!z2 || !this.f79564s) {
                i = 8;
            } else {
                CalendarGuideManager aVar = CalendarGuideManager.f78922a;
                Context context2 = getContext();
                if (!(context2 instanceof Activity)) {
                    context2 = null;
                }
                aVar.mo113196d((Activity) context2, (RelativeLayout) mo113991a(R.id.img_setting_icon_container));
                i = 0;
            }
            relativeLayout6.setVisibility(i);
        }
        RelativeLayout relativeLayout7 = (RelativeLayout) mo113991a(R.id.url_container);
        if (relativeLayout7 != null) {
            relativeLayout7.setVisibility(0);
        }
        RelativeLayout relativeLayout8 = (RelativeLayout) mo113991a(R.id.calendar_video_setting_container);
        if (relativeLayout8 != null) {
            if (z2 && this.f79564s) {
                CalendarGuideManager aVar2 = CalendarGuideManager.f78922a;
                Context context3 = getContext();
                if (context3 instanceof Activity) {
                    activity = context3;
                }
                aVar2.mo113196d(activity, (RelativeLayout) mo113991a(R.id.calendar_video_setting_container));
                i2 = 0;
            }
            relativeLayout8.setVisibility(i2);
        }
        if (this.f79547a != VideoType.VCHAT && this.f79547a != VideoType.GOOGLE_VIDEO_CONFERENCE) {
            TextView textView = (TextView) mo113991a(R.id.tv_meeting_url);
            if (textView != null) {
                if (this.f79549c.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str2 = this.f79549c;
                } else {
                    str2 = C32634ae.m125182b(R.string.Calendar_Edit_NoVCLink);
                }
                textView.setText(str2);
            }
            TextView textView2 = (TextView) mo113991a(R.id.tv_video_live_url);
            if (textView2 != null) {
                if (this.f79549c.length() <= 0) {
                    z4 = false;
                }
                if (z4) {
                    str = this.f79549c;
                } else {
                    str = C32634ae.m125182b(R.string.Calendar_Edit_NoVCLink);
                }
                textView2.setText(str);
            }
        } else if (!TextUtils.isEmpty(this.f79549c)) {
            List split$default = StringsKt.split$default((CharSequence) this.f79549c, new String[]{"://"}, false, 0, 6, (Object) null);
            if (split$default.size() > 1) {
                TextView textView3 = (TextView) mo113991a(R.id.tv_meeting_url);
                if (textView3 != null) {
                    textView3.setText((CharSequence) split$default.get(1));
                }
                TextView textView4 = (TextView) mo113991a(R.id.tv_video_live_url);
                if (textView4 != null) {
                    textView4.setText((CharSequence) split$default.get(1));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoUrlContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f79569x = context;
        this.f79547a = VideoType.UNKNOWN_VIDEO_MEETING_TYPE;
        this.f79548b = "";
        this.f79549c = "";
        this.f79554h = CalendarEvent.Type.DEFAULT_TYPE;
        this.f79555i = CalendarEvent.Source.UNKNOWN_SOURCE;
        this.f79561p = "";
        this.f79557k = "";
        this.f79558l = "";
        this.f79564s = C30022a.f74883b.mo112705m();
        this.f79559m = C30022a.f74883b.mo112701i();
        this.f79565t = true;
        this.f79566u = new View$OnClickListenerC31401h(this);
        this.f79567v = new View$OnClickListenerC31403j(this);
        this.f79568w = new View$OnClickListenerC31402i(this);
        m118135a();
        m118142b();
    }

    /* renamed from: a */
    private final void m118140a(Long l, Long l2, Long l3) {
        String str;
        String str2;
        if (this.f79560o) {
            setVisibility(0);
            if (this.f79547a == VideoType.LARK_LIVE_HOST) {
                ImageView imageView = (ImageView) mo113991a(R.id.img_live_status);
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) mo113991a(R.id.anim_live_status);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo113991a(R.id.anim_live_status);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.playAnimation();
                }
            } else {
                ImageView imageView2 = (ImageView) mo113991a(R.id.img_video_meeting);
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo113991a(R.id.anim_video_meeting_live);
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo113991a(R.id.anim_video_meeting_live);
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.playAnimation();
                }
                ImageView imageView3 = (ImageView) mo113991a(R.id.img_setting_icon);
                if (imageView3 != null) {
                    Context context = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    Context context2 = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    imageView3.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_setting_outlined, UDColorUtils.getColor(context2, R.color.ud_N400)));
                }
                RelativeLayout relativeLayout = (RelativeLayout) mo113991a(R.id.img_setting_icon_container);
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View$OnClickListenerC31404k(this));
                }
            }
            ImageView imageView4 = (ImageView) mo113991a(R.id.img_video_live_meeting);
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView5 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView6 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
            if (lottieAnimationView6 != null) {
                if (this.f79547a != VideoType.LARK_LIVE_HOST) {
                    str2 = "lottie/calendar_video_meeting_color_anim.json";
                } else {
                    str2 = "lottie/calendar_live_stream_anim.json";
                }
                lottieAnimationView6.setAnimation(str2);
            }
            LottieAnimationView lottieAnimationView7 = (LottieAnimationView) mo113991a(R.id.anim_video_live_meeting_live);
            if (lottieAnimationView7 != null) {
                lottieAnimationView7.playAnimation();
            }
            UDButton uDButton = (UDButton) mo113991a(R.id.video_live_btn);
            if (uDButton != null) {
                Context context3 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                uDButton.setStrokeColor(UDColorUtils.getColor(context3, R.color.ud_G600));
            }
            UDButton uDButton2 = (UDButton) mo113991a(R.id.video_live_btn);
            if (uDButton2 != null) {
                uDButton2.setTextColor(C32634ae.m125178a(R.color.ud_G600));
            }
            UDButton uDButton3 = (UDButton) mo113991a(R.id.video_live_btn);
            if (uDButton3 != null) {
                if (this.f79547a == VideoType.LARK_LIVE_HOST) {
                    str = C32634ae.m125182b(R.string.Calendar_Edit_EnterLivestream);
                } else {
                    str = C32634ae.m125182b(R.string.Calendar_Edit_JoinVC);
                }
                uDButton3.setText(str);
            }
            TextView textView = (TextView) mo113991a(R.id.video_setting_text);
            if (textView != null) {
                textView.setTextColor(C32634ae.m125178a(R.color.text_disable));
            }
            ImageView imageView5 = (ImageView) mo113991a(R.id.video_setting_arrow);
            if (imageView5 != null) {
                Context context4 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                Context context5 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context5, "context");
                imageView5.setImageDrawable(UDIconUtils.getIconDrawable(context4, (int) R.drawable.ud_icon_right_outlined, UDColorUtils.getColor(context5, R.color.icon_disable)));
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) mo113991a(R.id.video_setting_text_container);
            if (relativeLayout2 != null) {
                relativeLayout2.setOnClickListener(new View$OnClickListenerC31405l(this));
            }
            ImageView imageView6 = (ImageView) mo113991a(R.id.video_setting_arrow);
            if (imageView6 != null) {
                imageView6.setOnClickListener(new View$OnClickListenerC31406m(this));
            }
            if ((this.f79547a == VideoType.LARK_LIVE_HOST || this.f79547a == VideoType.VCHAT) && l != null && l.longValue() > 0 && l3 != null && l3.longValue() > 0 && l2 != null && l2.longValue() > 0) {
                RelativeLayout relativeLayout3 = (RelativeLayout) mo113991a(R.id.video_meeting_time_container);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "video_meeting_time_container");
                relativeLayout3.setVisibility(0);
                Chronometer chronometer = (Chronometer) mo113991a(R.id.video_meeting_time);
                Intrinsics.checkExpressionValueIsNotNull(chronometer, "video_meeting_time");
                chronometer.setBase(SystemClock.elapsedRealtime() - (l.longValue() + (((System.currentTimeMillis() - l3.longValue()) - l2.longValue()) / ((long) 2))));
                ((Chronometer) mo113991a(R.id.video_meeting_time)).start();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoUrlContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    static /* synthetic */ void m118137a(VideoUrlContainer videoUrlContainer, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            l3 = null;
        }
        videoUrlContainer.m118140a(l, l2, l3);
    }

    /* renamed from: a */
    public static /* synthetic */ void m118136a(VideoUrlContainer videoUrlContainer, DoVideoMeeting doVideoMeeting, int i, boolean z, CalendarEvent.Type type, CalendarEvent.Source source, String str, boolean z2, String str2, String str3, CalendarPstnDetailInfo aVar, Long l, Long l2, Long l3, int i2, Object obj) {
        String str4;
        String str5;
        CalendarPstnDetailInfo aVar2;
        Long l4;
        Long l5;
        Long l6;
        if ((i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i2 & DynamicModule.f58006b) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i2 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 1024) != 0) {
            l4 = null;
        } else {
            l4 = l;
        }
        if ((i2 & 2048) != 0) {
            l5 = null;
        } else {
            l5 = l2;
        }
        if ((i2 & 4096) != 0) {
            l6 = null;
        } else {
            l6 = l3;
        }
        videoUrlContainer.mo113994a(doVideoMeeting, i, z, type, source, str, z2, str4, str5, aVar2, l4, l5, l6);
    }
}
