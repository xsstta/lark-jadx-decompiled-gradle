package com.ss.android.lark.mail.impl.message.template;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.message.template.C43050h;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.g */
public class C43048g extends AbstractC43031a<C43050h.C43053a> {
    /* renamed from: a */
    public String mo154227a(final C43050h.C43053a aVar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-attendee-item"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43048g.C430491 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43048g.this.mo154228a(str, aVar);
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public String mo154228a(String str, C43050h.C43053a aVar) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -995388293:
                if (str.equals("calendar-is-organizer")) {
                    c = 0;
                    break;
                }
                break;
            case -357541735:
                if (str.equals("calendar-attendee-organizer-tip")) {
                    c = 1;
                    break;
                }
                break;
            case 1043457606:
                if (str.equals("calendar-attendee-item-email")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (aVar.mo154233b()) {
                    return "is-organizer";
                }
                break;
            case 1:
                return C43819s.m173684a((int) R.string.Mail_Calendar_Organizer);
            case 2:
                return aVar.mo154232a();
        }
        return "";
    }
}
