package com.ss.android.vc.meeting.module.preview.calender;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.request.JoinCalendarGroupMeetingEntityRequest;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.statistics.event.aj;
import com.ss.android.vc.statistics.event.bq;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MeetingPreviewCalendarFragment extends AbstractC62684c<C62703c> {

    /* renamed from: f */
    static Map<String, String> f157773f = new HashMap();

    /* renamed from: g */
    private String f157774g;

    /* renamed from: h */
    private String f157775h;

    /* renamed from: i */
    private String f157776i;

    /* renamed from: j */
    private JoinCalendarGroupMeetingEntityRequest.EntrySource f157777j;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: e */
    public String mo216564e() {
        return "日历";
    }

    public static class UniqueIDMapping implements Serializable {
        private static final long serialVersionUID = 1;
        public String meetingId;
        public String uniqueId;

        public UniqueIDMapping() {
        }

        public String getMeetingId() {
            return this.meetingId;
        }

        public String getUniqueId() {
            return this.uniqueId;
        }

        public void setMeetingId(String str) {
            this.meetingId = str;
        }

        public void setUniqueId(String str) {
            this.uniqueId = str;
        }

        public UniqueIDMapping(String str, String str2) {
            this.uniqueId = str;
            this.meetingId = str2;
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public String mo216561a() {
        return this.f157774g;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: d */
    public void mo216563d() {
        bq.m250207a(this.f157774g, this.f157736c);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public boolean mo216587a(Bundle bundle) {
        if (!super.mo216587a(bundle)) {
            return false;
        }
        if (this.f157734a == 3) {
            this.f157777j = JoinCalendarGroupMeetingEntityRequest.EntrySource.fromValue(bundle.getInt("param_calendar_entry_source", -1));
            this.f157774g = bundle.getString("param_calendar_unique_id");
            this.f157775h = bundle.getString("param_calendar_chat_id");
            this.f157776i = bundle.getString("param_meeting_title");
            if (this.f157777j == null || TextUtils.isEmpty(this.f157774g)) {
                C60700b.m235861e("MeetingPreviewCalendarFragment", "[parseParams]", "Param error. [type]" + this.f157734a + ", [calendarSource]" + this.f157777j + ", [calendarUniqueId]" + this.f157774g + ", [mCalendarChatId]" + this.f157775h + ", [mCalendarTitle]" + this.f157776i);
                return false;
            }
        }
        if (this.f157777j != JoinCalendarGroupMeetingEntityRequest.EntrySource.FROM_CALENDAR_DETAIL) {
            return true;
        }
        aj.m250014a("calendar_detail", this.f157774g, this.f157736c);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62703c mo216560a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62703c(baseFragment, hVar, this.f157774g, this.f157775h, this.f157776i, this.f157777j);
    }
}
