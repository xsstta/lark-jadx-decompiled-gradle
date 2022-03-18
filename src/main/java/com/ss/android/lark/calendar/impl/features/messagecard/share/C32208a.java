package com.ss.android.lark.calendar.impl.features.messagecard.share;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.dependency.idependency.entity.IMessageCardData;
import com.ss.android.lark.calendar.impl.features.common.helper.MeetingRoomHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.C31240c;
import com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.calendar.impl.features.messagecard.InternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalShareEventContent;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardBinderCommonHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IBindStatusListener;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.ReplyEventInvitationAction;
import com.ss.android.lark.calendar.impl.features.messagecard.share.helper.CalendarShareCardSizeHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.share.listener.JoinActionClickListener;
import com.ss.android.lark.calendar.impl.features.messagecard.share.listener.OpenDetailClickListener;
import com.ss.android.lark.calendar.impl.features.messagecard.share.listener.ShareCalendarEventContentHolder;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.share.a */
public class C32208a implements IMessageCellFactory {

    /* renamed from: c */
    private static final ConcurrentHashMap<View, Boolean> f82372c = new ConcurrentHashMap<>();

    /* renamed from: a */
    private final IMessageContext f82373a;

    /* renamed from: b */
    private boolean f82374b;

    public C32208a(IMessageContext aVar, boolean z) {
        this.f82373a = aVar;
        this.f82374b = z;
    }

    /* renamed from: c */
    private void m122773c(ShareCalendarEventContentHolder shareCalendarEventContentHolder, CalendarInternalShareEventContent calendarInternalShareEventContent) {
        C32646c.m125268a(shareCalendarEventContentHolder.mTime, (Object) calendarInternalShareEventContent.getCalendarEvent());
        CalendarCardBinderCommonHelper.m122629a(shareCalendarEventContentHolder.mTimeConflict, calendarInternalShareEventContent.getConflictType(), calendarInternalShareEventContent.getConflictTime() * 1000, null);
    }

    /* renamed from: d */
    private void m122774d(ShareCalendarEventContentHolder shareCalendarEventContentHolder, CalendarInternalShareEventContent calendarInternalShareEventContent) {
        String str;
        CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
        if (!TextUtils.isEmpty(calendarEvent.getRRule())) {
            str = C32632ac.m125171b(calendarEvent.getRRule());
        } else {
            str = null;
        }
        ao.m125226a(shareCalendarEventContentHolder.mRepeatContainer, shareCalendarEventContentHolder.mRepeat, str);
    }

    /* renamed from: e */
    private void m122775e(ShareCalendarEventContentHolder shareCalendarEventContentHolder, CalendarInternalShareEventContent calendarInternalShareEventContent) {
        String str;
        CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
        if (calendarEvent.getLocation() != null) {
            str = calendarEvent.getLocation().getLocation();
        } else {
            str = null;
        }
        ao.m125226a(shareCalendarEventContentHolder.mLocationContainer, shareCalendarEventContentHolder.mLocation, str);
    }

    /* renamed from: f */
    private void m122776f(ShareCalendarEventContentHolder shareCalendarEventContentHolder, CalendarInternalShareEventContent calendarInternalShareEventContent) {
        CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
        ao.m125226a(shareCalendarEventContentHolder.mMeetingRoomContainer, shareCalendarEventContentHolder.mMeetingRoom, m122768a(Long.valueOf(calendarEvent.getStartTime()), Long.valueOf(calendarEvent.getEndTime()), C31240c.m116936a(calendarEvent.getAttendees())));
    }

    /* renamed from: a */
    private void m122769a(ShareCalendarEventContentHolder shareCalendarEventContentHolder, CalendarInternalShareEventContent calendarInternalShareEventContent) {
        shareCalendarEventContentHolder.mEventSummary.setText(CalendarCardBinderCommonHelper.m122627a(calendarInternalShareEventContent.getCalendarEvent().getSummary()));
        int color = UDColorUtils.getColor(this.f82373a.mo122543g(), R.color.udtoken_message_card_text_orange);
        shareCalendarEventContentHolder.mEventSummary.setTextColor(color);
        shareCalendarEventContentHolder.mEventSummary.getPaint().setFakeBoldText(true);
        shareCalendarEventContentHolder.mEventHeaderIcon.setColorFilter(color);
    }

    /* renamed from: b */
    private void m122772b(ShareCalendarEventContentHolder shareCalendarEventContentHolder, CalendarInternalShareEventContent calendarInternalShareEventContent) {
        CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
        shareCalendarEventContentHolder.mEventSummary.setText(C32634ae.m125182b(R.string.Calendar_Share_Expired));
        int color = UDColorUtils.getColor(this.f82373a.mo122543g(), R.color.udtoken_message_card_text_neutral);
        shareCalendarEventContentHolder.mEventSummary.setTextColor(color);
        shareCalendarEventContentHolder.mEventSummary.getPaint().setFakeBoldText(true);
        shareCalendarEventContentHolder.mEventHeaderIcon.setColorFilter(color);
        UDTagsDrawable i = new UDTagsDrawable.Builder(this.f82373a.mo122543g()).mo91384a(new UDTagsDrawable.TagModel.Builder(this.f82373a.mo122543g()).mo91418a(C32634ae.m125182b(R.string.Calendar_Detail_External)).mo91422c(UDColorUtils.getColor(this.f82373a.mo122543g(), R.color.udtoken_message_card_text_neutral)).mo91419b(UDColorUtils.getColor(this.f82373a.mo122543g(), R.color.static_black_20)).mo91427g()).mo91383a(LKUIDisplayManager.m91864a((Context) this.f82373a.mo122543g(), 12)).mo91398i();
        Objects.requireNonNull(i);
        i.mo91369a(shareCalendarEventContentHolder.mExternalEventLabel);
        C32646c.m125268a(shareCalendarEventContentHolder.mTime, (Object) calendarEvent);
        shareCalendarEventContentHolder.mTimeConflict.setVisibility(8);
        shareCalendarEventContentHolder.mRepeatContainer.setVisibility(8);
        shareCalendarEventContentHolder.mLocationContainer.setVisibility(8);
        shareCalendarEventContentHolder.mMeetingRoomContainer.setVisibility(8);
        shareCalendarEventContentHolder.mReplyContainer.setVisibility(8);
        shareCalendarEventContentHolder.mEventAction.setVisibility(0);
        shareCalendarEventContentHolder.mEventAction.setText(C32634ae.m125182b(R.string.Calendar_Share_Expired));
        shareCalendarEventContentHolder.mEventAction.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        shareCalendarEventContentHolder.holderView.setOnClickListener(null);
        shareCalendarEventContentHolder.mEventAction.setOnClickListener(null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public View mo117503a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        if (this.f82374b) {
            i = R.layout.calendar_thread_share_event_item;
        } else {
            i = R.layout.calendar_share_event_item;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        f82372c.put(inflate, true);
        return inflate;
    }

    /* renamed from: a */
    private void m122770a(final ShareCalendarEventContentHolder shareCalendarEventContentHolder, final CalendarInternalShareEventContent calendarInternalShareEventContent, String str) {
        shareCalendarEventContentHolder.mReplyContainer.setActionListener(new ReplyEventInvitationAction(this.f82373a.mo122543g(), new IBindStatusListener() {
            /* class com.ss.android.lark.calendar.impl.features.messagecard.share.C32208a.C322091 */

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IBindStatusListener
            public void refreshActionStatus(CalendarEventAttendee.Status status) {
                shareCalendarEventContentHolder.mReplyContainer.mo117764a(status);
                shareCalendarEventContentHolder.f82382b = Long.valueOf(System.currentTimeMillis());
                CalendarInternalShareEventContent calendarInternalShareEventContent = calendarInternalShareEventContent;
                if (calendarInternalShareEventContent != null) {
                    GeneralHitPoint.m124198a("card_message", status, "invitation", calendarInternalShareEventContent.getCalendarEvent());
                }
            }
        }, new IContentDataListener() {
            /* class com.ss.android.lark.calendar.impl.features.messagecard.share.C32208a.C322102 */

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: b */
            public String mo117510b() {
                return calendarInternalShareEventContent.getCurrentUserCalendarId();
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: a */
            public String mo117509a() {
                CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
                if (calendarEvent != null) {
                    return calendarEvent.getServerId();
                }
                return null;
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: c */
            public String mo117511c() {
                CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
                if (calendarEvent != null) {
                    return calendarEvent.getKey();
                }
                return "";
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: d */
            public long mo117512d() {
                CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
                if (calendarEvent != null) {
                    return calendarEvent.getOriginalTime();
                }
                return 0;
            }

            @Override // com.ss.android.lark.calendar.impl.features.messagecard.helper.listener.IContentDataListener
            /* renamed from: e */
            public long mo117513e() {
                CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
                if (calendarEvent != null) {
                    return calendarEvent.getStartTime();
                }
                return 0;
            }
        }, str));
    }

    /* renamed from: a */
    private String m122768a(Long l, Long l2, List<CalendarEventAttendee> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (CalendarEventAttendee calendarEventAttendee : list) {
            if (calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.DECLINE && !calendarEventAttendee.isDisabled() && !MeetingRoomHelper.m116191a(l, l2, calendarEventAttendee)) {
                if (z) {
                    sb.append(", ");
                }
                sb.append(calendarEventAttendee.getLocalizedDisplayName());
                z = true;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m122771a(ShareCalendarEventContentHolder shareCalendarEventContentHolder, CalendarInternalShareEventContent calendarInternalShareEventContent, String str, JoinActionClickListener aVar) {
        if (calendarInternalShareEventContent.isJoined()) {
            shareCalendarEventContentHolder.mEventAction.setVisibility(8);
            shareCalendarEventContentHolder.mReplyContainer.setVisibility(0);
            shareCalendarEventContentHolder.mReplyContainer.setIsShowReplySpan(false);
            if ((!TextUtils.isEmpty(shareCalendarEventContentHolder.f82383c) && !shareCalendarEventContentHolder.f82383c.equals(str)) || System.currentTimeMillis() - shareCalendarEventContentHolder.f82382b.longValue() > 10000) {
                shareCalendarEventContentHolder.mReplyContainer.mo117764a(calendarInternalShareEventContent.getSelfAttendeeState());
            }
            m122770a(shareCalendarEventContentHolder, calendarInternalShareEventContent, str);
            return;
        }
        shareCalendarEventContentHolder.mEventAction.setVisibility(0);
        shareCalendarEventContentHolder.mReplyContainer.setVisibility(8);
        shareCalendarEventContentHolder.mEventAction.setText(C32634ae.m125182b(R.string.Calendar_Share_Join));
        shareCalendarEventContentHolder.mEventAction.setTextColor(C32634ae.m125178a(R.color.text_title));
        shareCalendarEventContentHolder.mEventAction.setOnClickListener(aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.messagecard.IMessageCellFactory
    /* renamed from: a */
    public void mo117504a(View view, int i, InternalContent internalContent, IMessageCardData fVar) {
        int i2;
        String a = fVar.mo108167a();
        if (!(internalContent instanceof CalendarInternalShareEventContent)) {
            Log.m165389i("ShareCalendarEventCellBinder", C32673y.m125377c("messageContent is invalid"));
            return;
        }
        ShareCalendarEventContentHolder shareCalendarEventContentHolder = (ShareCalendarEventContentHolder) view.getTag();
        if (shareCalendarEventContentHolder == null) {
            shareCalendarEventContentHolder = new ShareCalendarEventContentHolder(view);
            CalendarShareCardSizeHelper.m122784a(shareCalendarEventContentHolder);
            view.setTag(shareCalendarEventContentHolder);
        }
        CalendarInternalShareEventContent calendarInternalShareEventContent = (CalendarInternalShareEventContent) internalContent;
        CalendarEvent calendarEvent = calendarInternalShareEventContent.getCalendarEvent();
        if (calendarEvent == null) {
            Log.m165389i("ShareCalendarEventCellBinder", C32673y.m125377c("shareEvent = null"));
            return;
        }
        Log.m165389i("ShareCalendarEventCellBinder", C32673y.m125374b("pushShare"));
        OpenDetailClickListener bVar = new OpenDetailClickListener(calendarInternalShareEventContent, a);
        JoinActionClickListener aVar = new JoinActionClickListener(this.f82373a.mo122543g(), calendarInternalShareEventContent, a);
        CalendarCardBinderCommonHelper.m122631a(shareCalendarEventContentHolder.mExternalEventLabel, calendarEvent.isCrossTenant(), CalendarCardHelper.f82294a.mo117525a().mo108270b());
        if (calendarInternalShareEventContent.isSharable()) {
            shareCalendarEventContentHolder.holderView.setOnClickListener(bVar);
            m122769a(shareCalendarEventContentHolder, calendarInternalShareEventContent);
            UDTagsDrawable i3 = new UDTagsDrawable.Builder(this.f82373a.mo122543g()).mo91384a(new UDTagsDrawable.TagModel.Builder(this.f82373a.mo122543g()).mo91418a(C32634ae.m125182b(R.string.Calendar_Detail_External)).mo91422c(UDColorUtils.getColor(this.f82373a.mo122543g(), R.color.udtoken_tag_text_s_orange)).mo91419b(UDColorUtils.getColor(this.f82373a.mo122543g(), R.color.udtoken_tag_bg_orange)).mo91427g()).mo91383a(LKUIDisplayManager.m91864a((Context) this.f82373a.mo122543g(), 12)).mo91398i();
            Objects.requireNonNull(i3);
            i3.mo91369a(shareCalendarEventContentHolder.mExternalEventLabel);
            m122773c(shareCalendarEventContentHolder, calendarInternalShareEventContent);
            m122776f(shareCalendarEventContentHolder, calendarInternalShareEventContent);
            m122775e(shareCalendarEventContentHolder, calendarInternalShareEventContent);
            m122774d(shareCalendarEventContentHolder, calendarInternalShareEventContent);
            m122771a(shareCalendarEventContentHolder, calendarInternalShareEventContent, a, aVar);
        } else {
            m122772b(shareCalendarEventContentHolder, calendarInternalShareEventContent);
        }
        ConcurrentHashMap<View, Boolean> concurrentHashMap = f82372c;
        if (concurrentHashMap.containsKey(view) && concurrentHashMap.get(view).booleanValue()) {
            CalendarEventHitPoint.m124345a(calendarEvent.getServerId(), String.valueOf(calendarEvent.getStartTime()), (Map<String, ? extends Object>) ChatParamUtils.m133148b(), Boolean.valueOf(calendarInternalShareEventContent.isJoined()), (Boolean) false);
            concurrentHashMap.put(view, false);
        }
        if (this.f82373a.mo122558v()) {
            if (calendarInternalShareEventContent.isSharable()) {
                i2 = ActivityIdentificationData.WALKING;
            } else {
                i2 = 100;
            }
            C30022a.f74882a.chatModuleDependency().mo108223a(shareCalendarEventContentHolder.f82381a, i2, shareCalendarEventContentHolder.mEventSummaryBg, BubbleStyle.m131963a(i2, shareCalendarEventContentHolder.mEventSummaryBg, 0).mo126150d());
        }
    }
}
