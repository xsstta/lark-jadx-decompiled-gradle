package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.dependency.idependency.entity.IMessageCardData;
import com.ss.android.lark.calendar.impl.features.events.detail.RecruitmentUrlProcess;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.calendar.impl.features.messagecard.InternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper.CalendarBotCardFontHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper.CalendarBotMessageHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper.CalendarMessageCompareHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.CalendarViewHolder;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.OpenDetailActivityClickListener;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.ReplyWithCommentActionListener;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarEventCardDiff;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardBinderCommonHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarMessageCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IBindStatusListener;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.ReplyEventInvitationAction;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.View$OnTouchListenerC32214a;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32666r;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.a */
public class C32187a implements IMessageCellFactory {

    /* renamed from: b */
    private static final ConcurrentHashMap<View, Boolean> f82302b = new ConcurrentHashMap<>();

    /* renamed from: a */
    private final Activity f82303a;

    @Override // com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public View mo117503a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.calendar_bot_item, viewGroup, false);
        f82302b.put(inflate, true);
        return inflate;
    }

    @Override // com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public void mo117504a(View view, int i, InternalContent internalContent, IMessageCardData fVar) {
        String a = fVar.mo108167a();
        if (!(internalContent instanceof CalendarInternalContent)) {
            Log.m165389i("CalendarMessageCellBinder", C32673y.m125377c("messageContent is invalid"));
            return;
        }
        CalendarInternalContent calendarInternalContent = (CalendarInternalContent) internalContent;
        Context context = view.getContext();
        CalendarViewHolder calendarViewHolder = (CalendarViewHolder) view.getTag();
        if (calendarViewHolder == null) {
            calendarViewHolder = new CalendarViewHolder(view);
            CalendarBotCardFontHelper.m122700a(calendarViewHolder);
            view.setTag(calendarViewHolder);
        }
        Log.m165389i("CalendarMessageCellBinder", C32673y.m125374b("pushBot"));
        OpenDetailActivityClickListener aVar = new OpenDetailActivityClickListener(calendarInternalContent);
        calendarViewHolder.f82311a.setOnClickListener(aVar);
        calendarViewHolder.mEventTitle.setText(CalendarMessageCardHelper.m122673a(context, calendarInternalContent));
        m122682a(this.f82303a, calendarInternalContent, calendarViewHolder);
        CalendarCardBinderCommonHelper.m122631a(calendarViewHolder.mExternalLabel, calendarInternalContent.isCrossExternal(), CalendarCardHelper.f82294a.mo117525a().mo108270b());
        calendarViewHolder.mEventSummary.setText(CalendarCardBinderCommonHelper.m122627a(calendarInternalContent.getSummary()));
        m122685a(calendarViewHolder.mTimeContainer, calendarViewHolder.mTime, calendarInternalContent);
        CalendarCardBinderCommonHelper.m122630a(calendarViewHolder.mOptionalAttendee, calendarInternalContent.isOptional());
        m122686a(calendarViewHolder, calendarInternalContent);
        ConcurrentHashMap<View, Boolean> concurrentHashMap = f82302b;
        if (concurrentHashMap.containsKey(view)) {
            boolean z = true;
            if (concurrentHashMap.get(view).booleanValue()) {
                String eventServiceId = calendarInternalContent.getEventServiceId();
                String valueOf = String.valueOf(calendarInternalContent.getStartTime());
                Map<String, Object> b = ChatParamUtils.m133148b();
                Boolean valueOf2 = Boolean.valueOf(calendarInternalContent.getmStatus() != CalendarEventAttendee.Status.REMOVED);
                if (calendarInternalContent.getEventCardStatus() != CalendarInternalContent.CalendarEventCardStatus.INVALID) {
                    z = false;
                }
                CalendarEventHitPoint.m124345a(eventServiceId, valueOf, b, valueOf2, Boolean.valueOf(z));
                concurrentHashMap.put(view, false);
            }
        }
        if (calendarInternalContent.getEventCardStatus() != CalendarInternalContent.CalendarEventCardStatus.INVALID) {
            CalendarCardBinderCommonHelper.m122629a(calendarViewHolder.mTimeConflict, calendarInternalContent.getConflictType(), calendarInternalContent.getConflictTime(), aVar);
            m122687a(calendarViewHolder, calendarInternalContent, this.f82303a);
            ao.m125226a(calendarViewHolder.mMeetingRoomContainer, calendarViewHolder.mMeetingRoom, calendarInternalContent.getMeetingRoom());
            ao.m125226a(calendarViewHolder.mLocationContainer, calendarViewHolder.mLocation, calendarInternalContent.getLocation());
            ao.m125226a(calendarViewHolder.mRepeatContainer, calendarViewHolder.mRepeat, m122689b(calendarInternalContent));
            m122681a(this.f82303a, calendarViewHolder, calendarInternalContent.getDescription(), aVar);
            m122680a(this.f82303a, calendarViewHolder, calendarInternalContent, a);
            m122691b(calendarViewHolder, calendarInternalContent);
        }
    }

    /* renamed from: a */
    private static void m122687a(CalendarViewHolder calendarViewHolder, CalendarInternalContent calendarInternalContent, Context context) {
        CalendarCardBinderCommonHelper.m122628a(context, calendarViewHolder.mAttendeeContainer, calendarViewHolder.mAttendees, m122679a(calendarInternalContent), calendarInternalContent.getAttendeeCount(), calendarInternalContent.getTitle(), calendarInternalContent.getEventServiceId());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m122688a(CalendarViewHolder calendarViewHolder, CalendarInternalContent calendarInternalContent, CalendarEventAttendee.Status status) {
        calendarViewHolder.mReplyContainer.mo117764a(status);
        calendarViewHolder.f82312b = Long.valueOf(System.currentTimeMillis());
        if (calendarInternalContent != null) {
            GeneralHitPoint.m124199a("card_message", status, "invitation", calendarInternalContent.getEventServiceId(), calendarInternalContent.isCrossExternal(), calendarInternalContent.getMeetingRoomList() != null ? calendarInternalContent.getMeetingRoomList().size() : 0, 0, calendarInternalContent.getAttendeeList() != null ? calendarInternalContent.getAttendeeList().size() : 0, calendarInternalContent.getChatNames() != null ? calendarInternalContent.getChatNames().size() : 0);
        }
    }

    public C32187a(Activity activity) {
        this.f82303a = activity;
    }

    /* renamed from: a */
    private static String m122679a(CalendarInternalContent calendarInternalContent) {
        if (calendarInternalContent.isOldVersion()) {
            return calendarInternalContent.getAttendees();
        }
        return CalendarCardHelper.m122669a(calendarInternalContent.getAttendeeList(), calendarInternalContent.getChatNames());
    }

    /* renamed from: b */
    private static String m122689b(CalendarInternalContent calendarInternalContent) {
        if (calendarInternalContent.isOldVersion()) {
            return calendarInternalContent.getRepeat();
        }
        if (TextUtils.isEmpty(calendarInternalContent.getrRule())) {
            return null;
        }
        return C32632ac.m125171b(calendarInternalContent.getrRule());
    }

    /* renamed from: a */
    private static void m122684a(LinearLayout linearLayout) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.width != -1) {
            layoutParams.width = -1;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    private static void m122691b(CalendarViewHolder calendarViewHolder, CalendarInternalContent calendarInternalContent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 8;
        if (calendarInternalContent.getEventCardStatus() == CalendarInternalContent.CalendarEventCardStatus.INVALID || calendarInternalContent.getEventCardDiffInfo() == null) {
            calendarViewHolder.mTimeDiffLabel.setVisibility(8);
            calendarViewHolder.mRepeatDiffLabel.setVisibility(8);
            calendarViewHolder.mLocationDiffLabel.setVisibility(8);
            calendarViewHolder.mMeetingRoomDiffLabel.setVisibility(8);
            calendarViewHolder.mDescriptionDiffLabel.setVisibility(8);
            return;
        }
        CalendarEventCardDiff eventCardDiffInfo = calendarInternalContent.getEventCardDiffInfo();
        TextView textView = calendarViewHolder.mTimeDiffLabel;
        if (CalendarMessageCompareHelper.m122709a(eventCardDiffInfo, calendarInternalContent)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = calendarViewHolder.mRepeatDiffLabel;
        if (CalendarMessageCompareHelper.m122711b(eventCardDiffInfo, calendarInternalContent)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        TextView textView3 = calendarViewHolder.mLocationDiffLabel;
        if (CalendarMessageCompareHelper.m122712c(eventCardDiffInfo, calendarInternalContent)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView3.setVisibility(i3);
        TextView textView4 = calendarViewHolder.mMeetingRoomDiffLabel;
        if (CalendarMessageCompareHelper.m122713d(eventCardDiffInfo, calendarInternalContent)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView4.setVisibility(i4);
        TextView textView5 = calendarViewHolder.mDescriptionDiffLabel;
        if (CalendarMessageCompareHelper.m122714e(eventCardDiffInfo, calendarInternalContent)) {
            i5 = 0;
        }
        textView5.setVisibility(i5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m122683a(Context context, String str) {
        C30022a.f74882a.statisticsDependency().mo108184a();
        RecruitmentUrlProcess eVar = new RecruitmentUrlProcess(context, str);
        if (eVar.mo113586b()) {
            eVar.mo113583a();
        } else {
            C30022a.f74882a.browserModuleDependency().mo108211a(context, str);
        }
    }

    /* renamed from: a */
    public static void m122686a(CalendarViewHolder calendarViewHolder, CalendarInternalContent calendarInternalContent) {
        if (calendarInternalContent.getEventCardStatus() == CalendarInternalContent.CalendarEventCardStatus.INVALID) {
            calendarViewHolder.mEventContent.setVisibility(8);
            calendarViewHolder.mReplyContainer.setVisibility(8);
            calendarViewHolder.updateContainer.setVisibility(0);
            return;
        }
        calendarViewHolder.updateContainer.setVisibility(8);
        calendarViewHolder.mEventContent.setVisibility(0);
        calendarViewHolder.mReplyContainer.setVisibility(0);
    }

    /* renamed from: a */
    private static void m122682a(Context context, CalendarInternalContent calendarInternalContent, CalendarViewHolder calendarViewHolder) {
        boolean z;
        int i;
        int i2;
        if (calendarInternalContent.getMeesageType() != CalendarInternalContent.CalendarMessageType.EVENT_DELETE) {
            z = true;
        } else {
            z = false;
        }
        int i3 = R.color.udtoken_message_card_text_neutral;
        if (z) {
            i = R.color.udtoken_message_card_text_orange;
        } else {
            i = R.color.udtoken_message_card_text_neutral;
        }
        int color = UDColorUtils.getColor(context, i);
        calendarViewHolder.mEventSummary.setTextColor(color);
        calendarViewHolder.mEventSummary.getPaint().setFakeBoldText(true);
        calendarViewHolder.mEventTitle.setTextColor(color);
        calendarViewHolder.mBotHeadIcon.setColorFilter(color);
        if (z) {
            i3 = R.color.udtoken_tag_text_s_orange;
        }
        if (z) {
            i2 = R.color.udtoken_tag_bg_orange;
        } else {
            i2 = R.color.static_black_20;
        }
        UDTagsDrawable i4 = new UDTagsDrawable.Builder(context).mo91384a(new UDTagsDrawable.TagModel.Builder(context).mo91418a(C32634ae.m125182b(R.string.Calendar_Detail_External)).mo91422c(UDColorUtils.getColor(context, i3)).mo91419b(UDColorUtils.getColor(context, i2)).mo91427g()).mo91383a(LKUIDisplayManager.m91864a(context, 12)).mo91398i();
        Objects.requireNonNull(i4);
        i4.mo91369a(calendarViewHolder.mExternalLabel);
        UDTagsDrawable i5 = new UDTagsDrawable.Builder(context).mo91384a(new UDTagsDrawable.TagModel.Builder(context).mo91418a(C32634ae.m125182b(R.string.Calendar_Detail_Optional)).mo91422c(UDColorUtils.getColor(context, i3)).mo91419b(UDColorUtils.getColor(context, i2)).mo91427g()).mo91383a(LKUIDisplayManager.m91864a(context, 12)).mo91398i();
        Objects.requireNonNull(i5);
        i5.mo91369a(calendarViewHolder.mOptionalAttendee);
    }

    /* renamed from: a */
    private static void m122685a(final LinearLayout linearLayout, TimeShowTextView timeShowTextView, CalendarInternalContent calendarInternalContent) {
        m122684a(linearLayout);
        TimeZone timeZone = TimeZone.getDefault();
        if (calendarInternalContent.isAllDay()) {
            timeZone = TimeZone.getTimeZone("UTC");
        }
        String a = CalendarBotMessageHelper.m122704a(calendarInternalContent);
        boolean a2 = C26279i.m95157a(calendarInternalContent.getStartTime(), calendarInternalContent.getEndTime(), timeZone);
        timeShowTextView.setWidthListener(new TimeShowTextView.AbstractC31471a() {
            /* class com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.C32187a.C321881 */

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView.AbstractC31471a
            /* renamed from: a */
            public void mo114204a() {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                linearLayout.setLayoutParams(layoutParams);
            }
        });
        timeShowTextView.mo114201a(a, a2);
        timeShowTextView.setVisibility(0);
    }

    /* renamed from: a */
    private static void m122681a(Context context, CalendarViewHolder calendarViewHolder, String str, OpenDetailActivityClickListener aVar) {
        if (TextUtils.isEmpty(str)) {
            calendarViewHolder.mDescriptionContainer.setVisibility(8);
            return;
        }
        calendarViewHolder.mDescriptionContainer.setVisibility(0);
        calendarViewHolder.mDescription.setText(C32666r.m125357a(str, new C32666r.C32667a.AbstractC32668a(context) {
            /* class com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.$$Lambda$a$8QBlWK5_kvb7G2tUNkj4pq57nvw */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.utils.C32666r.C32667a.AbstractC32668a
            public final void onClick(String str) {
                C32187a.lambda$8QBlWK5_kvb7G2tUNkj4pq57nvw(this.f$0, str);
            }
        }));
        calendarViewHolder.mDescription.setOnClickListener(aVar);
        calendarViewHolder.mDescription.setOnTouchListener(new View$OnTouchListenerC32214a());
    }

    /* renamed from: b */
    private static void m122690b(Activity activity, CalendarViewHolder calendarViewHolder, final CalendarInternalContent calendarInternalContent, String str) {
        calendarViewHolder.mReplyContainer.setActionListener(new ReplyEventInvitationAction(activity, new IBindStatusListener(calendarInternalContent) {
            /* class com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.$$Lambda$a$cXwULV3jYhmKuby54iBE1bovGE */
            public final /* synthetic */ CalendarInternalContent f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IBindStatusListener
            public final void refreshActionStatus(CalendarEventAttendee.Status status) {
                C32187a.m270313lambda$cXwULV3jYhmKuby54iBE1bovGE(CalendarViewHolder.this, this.f$1, status);
            }
        }, new IContentDataListener() {
            /* class com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.C32187a.C321892 */

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: a */
            public String mo117509a() {
                return calendarInternalContent.getEventServiceId();
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: b */
            public String mo117510b() {
                return calendarInternalContent.getCalendarId();
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: c */
            public String mo117511c() {
                return calendarInternalContent.getEventKey();
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: d */
            public long mo117512d() {
                return calendarInternalContent.getOriginalTime();
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: e */
            public long mo117513e() {
                return calendarInternalContent.getStartTime();
            }
        }, str));
        if (calendarInternalContent.isShowReplyInviterEntry()) {
            calendarViewHolder.mReplyContainer.setIsShowReplySpan(C30022a.f74883b.mo112718z());
            calendarViewHolder.mReplyContainer.setReplySpanClickListener(new ReplyWithCommentActionListener(activity, calendarViewHolder, calendarInternalContent, str));
            return;
        }
        calendarViewHolder.mReplyContainer.setIsShowReplySpan(false);
    }

    /* renamed from: a */
    private static void m122680a(Activity activity, CalendarViewHolder calendarViewHolder, CalendarInternalContent calendarInternalContent, String str) {
        if (calendarInternalContent.getEventCardStatus() == CalendarInternalContent.CalendarEventCardStatus.INVALID || !calendarInternalContent.isNeedShowAction()) {
            calendarViewHolder.mReplyContainer.setVisibility(8);
            return;
        }
        calendarViewHolder.mReplyContainer.setVisibility(0);
        if ((!TextUtils.isEmpty(calendarViewHolder.f82313c) && !calendarViewHolder.f82313c.equals(str)) || System.currentTimeMillis() - calendarViewHolder.f82312b.longValue() > 10000) {
            calendarViewHolder.mReplyContainer.mo117764a(calendarInternalContent.getmStatus());
        }
        calendarViewHolder.f82313c = str;
        m122690b(activity, calendarViewHolder, calendarInternalContent, str);
    }
}
