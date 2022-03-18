package com.ss.android.lark.calendar.wrapper;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.calendar.AbstractC30017a;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalShareEventContent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.wrapper.api.ICalendarServiceForForwardModule;
import com.ss.android.lark.calendar.wrapper.impl.chat.C32682a;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1582c.C32689a;
import com.ss.android.lark.calendar.wrapper.impl.handler.CalendarProfileAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.CalendarSidebarAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.CalendarViewAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.CreateCalendarAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.CreateEventAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.EditCalendarAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.EditEventAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.OpenAccountManagerAppHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.OpenCalendarAppLinkHandler;
import com.ss.android.lark.calendar.wrapper.impl.handler.OpenEventDetailAppHandler;
import com.ss.android.lark.calendar.wrapper.impl.tabspec.CalendarTabPageSpec;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32678b;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32681e;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.wrapper.a */
public class C32674a extends AbstractC30017a implements AbstractC32677a {
    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: b */
    public void mo120367b(Activity activity) {
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a, com.ss.android.lark.calendar.AbstractC30017a
    /* renamed from: m */
    public AbstractC32679d mo120369m() {
        return C32682a.m125458c();
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: n */
    public AbstractC32678b mo120370n() {
        return new C32689a();
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: o */
    public AbstractC32681e mo120371o() {
        return new AbstractC32681e() {
            /* class com.ss.android.lark.calendar.wrapper.C32674a.C326751 */

            @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32681e
            /* renamed from: a */
            public void mo120373a(TextView textView, TextView textView2, ImageView imageView, ShareCalendarEventContent shareCalendarEventContent) {
                String str;
                textView.setVisibility(0);
                textView2.setVisibility(0);
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.forward_icon_share_event);
                CalendarInternalShareEventContent calendarInternalShareEventContent = shareCalendarEventContent.getCalendarInternalShareEventContent();
                if (calendarInternalShareEventContent.isSharable()) {
                    str = calendarInternalShareEventContent.getCalendarEvent().getSummary();
                    if (TextUtils.isEmpty(str)) {
                        str = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
                    }
                } else {
                    str = "(" + C32634ae.m125182b(R.string.Calendar_Share_Expired) + ")";
                }
                textView.setText(str);
                textView2.setText(C32646c.m125260a(calendarInternalShareEventContent.getCalendarEvent()));
            }
        };
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: p */
    public ICalendarServiceForForwardModule mo120372p() {
        return new ICalendarServiceForForwardModule() {
            /* class com.ss.android.lark.calendar.wrapper.C32674a.C326762 */

            @Override // com.ss.android.lark.calendar.wrapper.api.ICalendarServiceForForwardModule
            /* renamed from: a */
            public Content mo120374a(Object obj) {
                ShareCalendarEventContent shareCalendarEventContent = new ShareCalendarEventContent();
                if (obj instanceof CalendarEvent) {
                    shareCalendarEventContent.getCalendarInternalShareEventContent().setCalendarEvent((CalendarEvent) obj);
                }
                shareCalendarEventContent.getCalendarInternalShareEventContent().setSharable(true);
                return shareCalendarEventContent;
            }

            @Override // com.ss.android.lark.calendar.wrapper.api.ICalendarServiceForForwardModule
            /* renamed from: a */
            public boolean mo120375a(ShareCalendarEventContent shareCalendarEventContent) {
                CalendarEvent calendarEvent = shareCalendarEventContent.getCalendarInternalShareEventContent().getCalendarEvent();
                if (calendarEvent == null) {
                    return true;
                }
                if ((calendarEvent.isMeeting() || calendarEvent.hasMeetingMinute()) && !calendarEvent.isCrossTenant()) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: b */
    public void mo120368b(Context context) {
        C30022a.f74882a.mainModuleDependency().mo108279b();
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: a */
    public Map<String, AbstractC29186b> mo120365a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/calendar/open", new OpenCalendarAppLinkHandler());
        hashMap.put("/client/calendar/view", new CalendarViewAppLinkHandler());
        hashMap.put("/client/calendar/event/create", new CreateEventAppLinkHandler(this));
        hashMap.put("/client/calendar/event/edit", new EditEventAppLinkHandler(this));
        hashMap.put("/client/calendar/create", new CreateCalendarAppLinkHandler(this));
        hashMap.put("/client/calendar/edit", new EditCalendarAppLinkHandler(this));
        hashMap.put("/client/calendar/event/detail", new OpenEventDetailAppHandler(this));
        hashMap.put("/client/calendar/account", new OpenAccountManagerAppHandler());
        hashMap.put("/client/calendar/detail", new CalendarProfileAppLinkHandler(this));
        hashMap.put("/client/calendar/sidebar", new CalendarSidebarAppLinkHandler(this));
        return hashMap;
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: a */
    public AbstractC44552i mo120364a(Context context, ITitleController iTitleController) {
        return new CalendarTabPageSpec(context, iTitleController);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r0 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r7.isSecret() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r0 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r7.isThread() == false) goto L_0x0080;
     */
    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32677a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo120366a(com.ss.android.lark.chat.entity.chat.Chat r7, com.ss.android.lark.chat.entity.chatter.ChatChatter r8) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.wrapper.C32674a.mo120366a(com.ss.android.lark.chat.entity.chat.Chat, com.ss.android.lark.chat.entity.chatter.ChatChatter):boolean");
    }
}
