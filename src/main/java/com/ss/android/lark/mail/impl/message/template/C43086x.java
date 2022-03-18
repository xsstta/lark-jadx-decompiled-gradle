package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.template.MailAddressSegmentHandler;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.x */
public class C43086x extends AbstractC43031a<MailMessage> {

    /* renamed from: a */
    private final String f109654a = "MessageItemContentSegmentHandler";

    /* renamed from: b */
    private MailAddressSegmentHandler f109655b = new MailAddressSegmentHandler();

    /* renamed from: c */
    private C43042d f109656c = new C43042d();

    /* renamed from: d */
    private C43065n f109657d = new C43065n();

    /* renamed from: e */
    private C43084w f109658e;

    /* renamed from: f */
    private String f109659f;

    public C43086x(String str) {
        this.f109659f = str;
        this.f109658e = new C43084w(str);
    }

    /* renamed from: a */
    public String mo154270a(final MailMessage mailMessage) {
        Log.m165389i("MessageItemContentSegmentHandler", "handleSegment");
        if (mailMessage == null) {
            Log.m165383e("MessageItemContentSegmentHandler", "handleSegment invalid message");
            return "";
        }
        String a = mo154209a("item-content");
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, a, new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43086x.C430871 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43086x.this.mo154271a(str, mailMessage);
            }
        });
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return "";
        }
        return sb2;
    }

    /* renamed from: a */
    public String mo154271a(String str, MailMessage mailMessage) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2001937320:
                if (str.equals("button_readmore")) {
                    c = 0;
                    break;
                }
                break;
            case -1963501277:
                if (str.equals("attachment")) {
                    c = 1;
                    break;
                }
                break;
            case -1772930281:
                if (str.equals("is_body_clipped")) {
                    c = 2;
                    break;
                }
                break;
            case -1731916186:
                if (str.equals("address_bcc_list")) {
                    c = 3;
                    break;
                }
                break;
            case -1526978606:
                if (str.equals("address_cc_list")) {
                    c = 4;
                    break;
                }
                break;
            case -716980434:
                if (str.equals("banner_container")) {
                    c = 5;
                    break;
                }
                break;
            case -250551231:
                if (str.equals("message_content")) {
                    c = 6;
                    break;
                }
                break;
            case 106905:
                if (str.equals("lan")) {
                    c = 7;
                    break;
                }
                break;
            case 155948354:
                if (str.equals("address_separately_list")) {
                    c = '\b';
                    break;
                }
                break;
            case 1019231895:
                if (str.equals("address_to_list")) {
                    c = '\t';
                    break;
                }
                break;
            case 1962643313:
                if (str.equals("calendar_card")) {
                    c = '\n';
                    break;
                }
                break;
            case 2031665544:
                if (str.equals("address_from_list")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C43819s.m173684a((int) R.string.Mail_Message_ReadMore);
            case 1:
                if (mailMessage.mo151622v()) {
                    return this.f109656c.mo154221a(mailMessage);
                }
                return str2;
            case 2:
                if (mailMessage.mo151550C()) {
                    return "is_body_clipped";
                }
                return str2;
            case 3:
                if (mailMessage.mo151560M() || !mailMessage.mo151620t()) {
                    return str2;
                }
                if (mailMessage.mo151621u() || "EML".equals(this.f109659f)) {
                    return this.f109655b.mo154205a(MailAddressSegmentHandler.RecipientType.BCC, mailMessage.mo151560M()).mo154207a(mailMessage.mo151601f());
                }
                return str2;
            case 4:
                if (mailMessage.mo151560M() || !mailMessage.mo151619s()) {
                    return str2;
                }
                return this.f109655b.mo154205a(MailAddressSegmentHandler.RecipientType.CC, mailMessage.mo151560M()).mo154207a(mailMessage.mo151598e());
            case 5:
                return this.f109658e.mo154268a(mailMessage);
            case 6:
                if (mailMessage.mo151550C()) {
                    str2 = "<!--";
                }
                String str3 = str2 + mailMessage.mo151606h();
                if (!mailMessage.mo151550C()) {
                    return str3;
                }
                return str3 + "-->";
            case 7:
                return C43032aa.m171186a();
            case '\b':
                if (!mailMessage.mo151560M() || !mailMessage.mo151620t()) {
                    return str2;
                }
                return this.f109655b.mo154205a(MailAddressSegmentHandler.RecipientType.SEPARATELY, mailMessage.mo151560M()).mo154207a(mailMessage.mo151601f());
            case '\t':
                if (mailMessage.mo151560M() || !mailMessage.mo151618r()) {
                    return str2;
                }
                return this.f109655b.mo154205a(MailAddressSegmentHandler.RecipientType.TO, mailMessage.mo151560M()).mo154207a(mailMessage.mo151591d());
            case '\n':
                if (mailMessage.mo151548A() != null) {
                    return this.f109657d.mo154244a(mailMessage);
                }
                return str2;
            case 11:
                if (mailMessage == null || mailMessage.mo151586c() == null || mailMessage.mo151586c().mo151176a() == null) {
                    return str2;
                }
                return this.f109655b.mo154205a(MailAddressSegmentHandler.RecipientType.FROM, mailMessage.mo151560M()).mo154206a(mailMessage.mo151586c());
            default:
                return str2;
        }
    }
}
