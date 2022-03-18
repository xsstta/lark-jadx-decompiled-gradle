package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.ReportType;
import com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.w */
public class C43084w extends AbstractC43031a<MailMessage> {

    /* renamed from: a */
    private final String f109646a = "MessageBannerSegmentHandler";

    /* renamed from: b */
    private C43077s f109647b = new C43077s();

    /* renamed from: c */
    private C43079u f109648c = new C43079u();

    /* renamed from: d */
    private C43078t f109649d = new C43078t();

    /* renamed from: e */
    private boolean f109650e = false;

    /* renamed from: f */
    private String f109651f;

    public C43084w(String str) {
        this.f109651f = str;
    }

    /* renamed from: a */
    public String mo154268a(final MailMessage mailMessage) {
        Log.m165389i("MessageBannerSegmentHandler", "handleSegment");
        String str = "";
        if (mailMessage == null) {
            Log.m165383e("MessageBannerSegmentHandler", "handleSegment invalid message");
            return str;
        }
        this.f109650e = false;
        String replace = mo154209a("banner_container").replace("$translate-view-original-button-text$", C43819s.m173684a((int) R.string.Mail_Translations_Vieworiginal)).replace("$translation-view-translation-button$", C43819s.m173684a((int) R.string.Mail_Translations_Viewtranslation)).replace("$translating_hint$", C43819s.m173684a((int) R.string.Mail_Translations_Translatingthismessage));
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, replace, new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43084w.C430851 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43084w.this.mo154269a(str, mailMessage);
            }
        });
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return str;
        }
        if (!this.f109650e) {
            str = "display-none";
        }
        return sb2.replaceFirst("$banner-display-none$", str);
    }

    /* renamed from: a */
    public String mo154269a(String str, MailMessage mailMessage) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (TextUtils.isEmpty(str)) {
            return str6;
        }
        str.hashCode();
        char c = 65535;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -2064895732:
                if (str.equals("schedule_message_banner")) {
                    c = 0;
                    break;
                }
                break;
            case -1428960942:
                if (str.equals("recall_message_banner")) {
                    c = 1;
                    break;
                }
                break;
            case -743191455:
                if (str.equals("safe_tips_banner")) {
                    c = 2;
                    break;
                }
                break;
            case 1898646434:
                if (str.equals("send_status_banner")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                str6 = this.f109649d.mo154260a(mailMessage);
                if (!TextUtils.isEmpty(str6)) {
                    this.f109650e = true;
                    break;
                }
                break;
            case 1:
                str6 = this.f109647b.mo154258a(mailMessage);
                if (!TextUtils.isEmpty(str6) && !this.f109647b.mo154259a()) {
                    this.f109650e = true;
                    break;
                }
            case 2:
                ThreadSecurityLevel a = mailMessage.mo151565a();
                if (mailMessage.mo151563P() || a == ThreadSecurityLevel.PHISHING || a == ThreadSecurityLevel.SPOOF) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(mailMessage.mo151562O() == ReportType.CLOSED || mailMessage.mo151562O() == ReportType.HAM)) {
                    z2 = true;
                }
                if (z && z2) {
                    C42209j.m168612a("read_safe_tips_warning_banner", "flag");
                    String replace = mo154209a("safe_tips_banner").replace("$safe_tips_wording$", C43819s.m173684a((int) R.string.Mail_ReportTrash_RiskNoteMobile));
                    if (mailMessage.mo151562O() == ReportType.SPAM || ((str5 = this.f109651f) != null && str5.equals("SHARE"))) {
                        str2 = replace.replace("$safety-buttons-display-none$", "display-none");
                    } else {
                        str2 = replace.replace("$safety-buttons-display-none$", str6);
                    }
                    String str7 = this.f109651f;
                    if (str7 == null || str7.equals("SEARCH") || (!this.f109651f.equals("TRASH") && !this.f109651f.equals("SPAM"))) {
                        str3 = str2.replace("$normal-button-display-none$", "display-none");
                    } else {
                        str3 = str2.replace("$normal-button-display-none$", str6);
                    }
                    String str8 = this.f109651f;
                    if (str8 == null || !str8.equals("SHARE")) {
                        str4 = str3.replace("$close-display-none$", str6);
                    } else {
                        str4 = str3.replace("$close-display-none$", "display-none");
                    }
                    str6 = str4.replace("$report_wording$", C43819s.m173684a((int) R.string.Mail_ReportTrash_ReportMobile)).replace("$normal_wording$", C43819s.m173684a((int) R.string.Mail_ReportTrash_NormalEmailMobile));
                }
                if (!TextUtils.isEmpty(str6)) {
                    this.f109650e = true;
                    break;
                }
                break;
            case 3:
                str6 = this.f109648c.mo154261a(mailMessage);
                if (!TextUtils.isEmpty(str6) && this.f109648c.mo154262a()) {
                    this.f109650e = true;
                    break;
                }
        }
        return str6;
    }
}
