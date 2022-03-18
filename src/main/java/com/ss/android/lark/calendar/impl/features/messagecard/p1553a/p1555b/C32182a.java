package com.ss.android.lark.calendar.impl.features.messagecard.p1553a.p1555b;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.b.a */
public class C32182a {

    /* renamed from: a */
    private static final String f82291a = UIHelper.getString(R.color.lkui_N900);

    /* renamed from: b */
    private CalendarInternalContent f82292b;

    public C32182a(CalendarInternalContent calendarInternalContent) {
        this.f82292b = calendarInternalContent;
    }

    /* renamed from: a */
    public CalendarInternalContent mo117524a(String str) {
        m122660b(str);
        return this.f82292b;
    }

    /* renamed from: c */
    private boolean m122662c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private String m122663d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return f82291a;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("style");
        if (jSONObject2 == null) {
            return f82291a;
        }
        return m122657a(jSONObject2, "color");
    }

    /* renamed from: e */
    private String m122664e(JSONObject jSONObject) {
        if (jSONObject != null) {
            return m122657a(jSONObject.getJSONObject("property"), "content");
        }
        return "";
    }

    /* renamed from: a */
    private void m122658a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("elements")) != null && (jSONObject3 = jSONObject2.getJSONObject("title")) != null) {
            this.f82292b.setTitleContent(m122664e(jSONObject3).replace("\n", ""));
        }
    }

    /* renamed from: b */
    private void m122660b(String str) {
        JSONObject parseObject;
        if (str != null && !str.isEmpty() && (parseObject = JSONObject.parseObject(str)) != null) {
            m122658a(parseObject.getJSONObject("title"));
            m122659b(parseObject.getJSONObject("contents"));
            m122661c(parseObject.getJSONObject("actions"));
        }
    }

    /* renamed from: b */
    private void m122659b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("elements")) == null)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("summary_content");
            if (jSONObject3 != null) {
                this.f82292b.setSummary(m122664e(jSONObject3));
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("time_content");
            if (jSONObject4 != null) {
                this.f82292b.setTime(m122664e(jSONObject4));
            }
            JSONObject jSONObject5 = jSONObject2.getJSONObject("attendees_content");
            if (!(jSONObject5 == null || (jSONArray = jSONObject5.getJSONArray("child_ids")) == null || jSONArray.size() <= 0)) {
                StringBuilder sb = new StringBuilder();
                int size = jSONArray.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    String string = jSONArray.getString(i2);
                    String e = m122664e(jSONObject2.getJSONObject(string));
                    sb.append(C30022a.f74882a.utilsDependency().mo108197a(string, e) + "  ");
                    i++;
                }
                this.f82292b.setAttendeeCount(i);
                this.f82292b.setAttendees(sb.toString());
            }
            JSONObject jSONObject6 = jSONObject2.getJSONObject("meeting_room_content");
            if (jSONObject6 != null) {
                this.f82292b.setMeetingRoom(m122664e(jSONObject6));
            }
            JSONObject jSONObject7 = jSONObject2.getJSONObject("location_content");
            if (jSONObject7 != null) {
                this.f82292b.setLocation(m122664e(jSONObject7));
            }
            JSONObject jSONObject8 = jSONObject2.getJSONObject("description_content");
            if (jSONObject8 != null) {
                this.f82292b.setDescription(m122664e(jSONObject8));
            }
            JSONObject jSONObject9 = jSONObject2.getJSONObject("recurrence_content");
            if (jSONObject9 != null) {
                this.f82292b.setRepeat(m122664e(jSONObject9));
            }
        }
    }

    /* renamed from: c */
    private void m122661c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("elements")) != null && (jSONObject3 = jSONObject2.getJSONObject("accept")) != null && (jSONObject4 = jSONObject3.getJSONObject("action")) != null && (jSONObject5 = jSONObject4.getJSONObject("payload")) != null) {
            String string = jSONObject5.getString("calendar_id");
            String string2 = jSONObject5.getString("key");
            long longValue = jSONObject5.getLong("original_time").longValue();
            this.f82292b.setCalendarId(string);
            this.f82292b.setEventKey(string2);
            this.f82292b.setOriginalTime(longValue);
            if (m122662c(string) && m122662c(string2) && longValue >= 0) {
                this.f82292b.setIsNeedShowAction(true);
                this.f82292b.setAcceptContent(m122664e(jSONObject3));
                this.f82292b.setAcceptColor(m122663d(jSONObject3));
                JSONObject jSONObject6 = jSONObject2.getJSONObject("decline");
                this.f82292b.setDeclineContent(m122664e(jSONObject6));
                this.f82292b.setDeclineColor(m122663d(jSONObject6));
                JSONObject jSONObject7 = jSONObject2.getJSONObject("tentative");
                this.f82292b.setTentativeContent(m122664e(jSONObject7));
                this.f82292b.setTentativeColor(m122663d(jSONObject7));
                if ("#4699FF".equals(this.f82292b.getAcceptColor())) {
                    this.f82292b.setmStatus(CalendarEventAttendee.Status.ACCEPT);
                }
                if ("#4699FF".equals(this.f82292b.getDeclineColor())) {
                    this.f82292b.setmStatus(CalendarEventAttendee.Status.DECLINE);
                }
                if ("#4699FF".equals(this.f82292b.getTentativeColor())) {
                    this.f82292b.setmStatus(CalendarEventAttendee.Status.TENTATIVE);
                }
            }
        }
    }

    /* renamed from: a */
    private String m122657a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.getString(str);
    }
}
