package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.entity.MailFullEventInfo;
import com.ss.android.lark.mail.impl.utils.C43760c;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.message.template.h */
public class C43050h extends AbstractC43031a<MailCalendar> {

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.mail.impl.message.template.h$a */
    public static class C43053a {

        /* renamed from: a */
        private String f109576a;

        /* renamed from: b */
        private boolean f109577b;

        /* renamed from: a */
        public String mo154232a() {
            return this.f109576a;
        }

        /* renamed from: b */
        public boolean mo154233b() {
            return this.f109577b;
        }

        public C43053a(String str, boolean z) {
            this.f109576a = str;
            this.f109577b = z;
        }
    }

    /* renamed from: b */
    private String m171222b(final MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card-body"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43050h.C430511 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43050h.this.mo154230a(str, mailCalendar);
            }
        });
        return sb.toString();
    }

    /* renamed from: c */
    private String m171223c(final MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card-body"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43050h.C430522 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43050h.this.mo154231b(str, mailCalendar);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154229a(MailCalendar mailCalendar) {
        if (mailCalendar.mo151275h() != null) {
            return m171222b(mailCalendar);
        }
        if (mailCalendar.mo151284q() != null) {
            return m171223c(mailCalendar);
        }
        return "";
    }

    /* renamed from: a */
    private boolean m171221a(MailFullEventInfo mailFullEventInfo, String str) {
        return TextUtils.equals(mailFullEventInfo.mo151459i(), str);
    }

    /* renamed from: a */
    public String mo154230a(String str, MailCalendar mailCalendar) {
        MailFullEventInfo h = mailCalendar.mo151275h();
        StringBuilder sb = new StringBuilder();
        str.hashCode();
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -2108410759:
                if (str.equals("calendar-attendee-count-tip")) {
                    c = 0;
                    break;
                }
                break;
            case -718791118:
                if (str.equals("calendar-no-location")) {
                    c = 1;
                    break;
                }
                break;
            case -263485095:
                if (str.equals("calender-action-location")) {
                    c = 2;
                    break;
                }
                break;
            case -185872235:
                if (str.equals("hidden-conflict")) {
                    c = 3;
                    break;
                }
                break;
            case 290784847:
                if (str.equals("calendar-conflict-tip")) {
                    c = 4;
                    break;
                }
                break;
            case 759116521:
                if (str.equals("calendar-card-footer")) {
                    c = 5;
                    break;
                }
                break;
            case 1238351351:
                if (str.equals("calendar-no-repeated")) {
                    c = 6;
                    break;
                }
                break;
            case 1355853425:
                if (str.equals("calender-action-time")) {
                    c = 7;
                    break;
                }
                break;
            case 1386979490:
                if (str.equals("calendar-action-repeated")) {
                    c = '\b';
                    break;
                }
                break;
            case 1562628482:
                if (str.equals("calendar-attendee-list")) {
                    c = '\t';
                    break;
                }
                break;
            case 1660816338:
                if (str.equals("calendar-more-tip")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                sb.append(C43819s.m173685a((int) R.plurals.Mail_Calendar_NumberOfGuests, h.mo151460j().size()));
                break;
            case 1:
                if (TextUtils.isEmpty(mailCalendar.mo151275h().mo151453e())) {
                    sb.append("no-location");
                    break;
                }
                break;
            case 2:
                if (!TextUtils.isEmpty(mailCalendar.mo151275h().mo151453e())) {
                    sb.append(C43032aa.m171192d(mailCalendar.mo151275h().mo151453e()));
                    break;
                }
                break;
            case 3:
                if (!mailCalendar.mo151275h().mo151462l()) {
                    sb.append("hidden-conflict");
                    break;
                }
                break;
            case 4:
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_ConflictTip));
                break;
            case 5:
                sb.append(new C43057j().mo154236a(mailCalendar));
                break;
            case 6:
                if (TextUtils.isEmpty(h.mo151455f())) {
                    sb.append("no-repeated");
                    break;
                }
                break;
            case 7:
                sb.append(C43760c.m173463a(h.mo151434a() * 1000, h.mo151442b() * 1000, h.mo151449c()));
                break;
            case '\b':
                sb.append(h.mo151455f());
                break;
            case '\t':
                C43048g gVar = new C43048g();
                if (h.mo151460j() != null) {
                    ArrayList<String> arrayList = new ArrayList(h.mo151460j());
                    if (!TextUtils.isEmpty(h.mo151459i()) && arrayList.remove(h.mo151459i())) {
                        sb.append(gVar.mo154227a(new C43053a(h.mo151459i(), true)));
                        i = 1;
                    }
                    for (String str2 : arrayList) {
                        i++;
                        sb.append(gVar.mo154227a(new C43053a(str2, m171221a(h, str2))));
                        if (i == 3) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case '\n':
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_MoreDetail));
                break;
        }
        return sb.toString();
    }

    /* renamed from: b */
    public String mo154231b(String str, MailCalendar mailCalendar) {
        mailCalendar.mo151274g();
        StringBuilder sb = new StringBuilder();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2077078729:
                if (str.equals("calendar-no-attendee")) {
                    c = 0;
                    break;
                }
                break;
            case -718791118:
                if (str.equals("calendar-no-location")) {
                    c = 1;
                    break;
                }
                break;
            case -185872235:
                if (str.equals("hidden-conflict")) {
                    c = 2;
                    break;
                }
                break;
            case 290784847:
                if (str.equals("calendar-conflict-tip")) {
                    c = 3;
                    break;
                }
                break;
            case 759116521:
                if (str.equals("calendar-card-footer")) {
                    c = 4;
                    break;
                }
                break;
            case 950196909:
                if (str.equals("calendar-hidden-icon")) {
                    c = 5;
                    break;
                }
                break;
            case 1238351351:
                if (str.equals("calendar-no-repeated")) {
                    c = 6;
                    break;
                }
                break;
            case 1355853425:
                if (str.equals("calender-action-time")) {
                    c = 7;
                    break;
                }
                break;
            case 1386979490:
                if (str.equals("calendar-action-repeated")) {
                    c = '\b';
                    break;
                }
                break;
            case 1660816338:
                if (str.equals("calendar-more-tip")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                sb.append("no-attendee");
                break;
            case 1:
                sb.append("no-location");
                break;
            case 2:
                sb.append("hidden-conflict");
                break;
            case 3:
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_ConflictTip));
                break;
            case 4:
                sb.append(new C43057j().mo154236a(mailCalendar));
                break;
            case 5:
                sb.append("hidden-icon");
                break;
            case 6:
                if (mailCalendar.mo151284q() == null || TextUtils.isEmpty(mailCalendar.mo151284q().mo151427e())) {
                    sb.append("no-repeated");
                    break;
                }
            case 7:
                if (mailCalendar.mo151284q() != null) {
                    sb.append(C43760c.m173463a(mailCalendar.mo151284q().mo151423c() * 1000, mailCalendar.mo151284q().mo151425d() * 1000, mailCalendar.mo151284q().mo151428f()));
                    break;
                }
                break;
            case '\b':
                if (mailCalendar.mo151284q() != null) {
                    sb.append(mailCalendar.mo151284q().mo151427e());
                    break;
                }
                break;
            case '\t':
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_MoreDetail));
                break;
        }
        return sb.toString();
    }
}
