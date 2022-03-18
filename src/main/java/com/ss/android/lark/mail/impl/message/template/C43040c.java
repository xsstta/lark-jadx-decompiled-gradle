package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.utils.C43760c;
import com.ss.android.lark.mail.impl.utils.C43766i;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.mail.impl.message.template.c */
public class C43040c extends AbstractC43031a<MailAttachment> {

    /* renamed from: a */
    private final String f109560a = "MailAttachmentItemSegmentHandler";

    /* renamed from: b */
    private int f109561b;

    /* renamed from: a */
    public void mo154219a(int i) {
        this.f109561b = i;
    }

    /* renamed from: a */
    public String mo154217a(final MailAttachment mailAttachment) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("attachment_list_item"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43040c.C430411 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43040c.this.mo154218a(str, mailAttachment);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154218a(String str, MailAttachment mailAttachment) {
        str.hashCode();
        int i = 3;
        char c = 65535;
        switch (str.hashCode()) {
            case -1209430948:
                if (str.equals("attachment_warning_tip")) {
                    c = 0;
                    break;
                }
                break;
            case -825417294:
                if (str.equals("attachment_expire_date")) {
                    c = 1;
                    break;
                }
                break;
            case -735196116:
                if (str.equals("file_url")) {
                    c = 2;
                    break;
                }
                break;
            case -673326571:
                if (str.equals("attachment_icon")) {
                    c = 3;
                    break;
                }
                break;
            case -673179609:
                if (str.equals("attachment_name")) {
                    c = 4;
                    break;
                }
                break;
            case -673022563:
                if (str.equals("attachment_size")) {
                    c = 5;
                    break;
                }
                break;
            case -672977706:
                if (str.equals("attachment_type")) {
                    c = 6;
                    break;
                }
                break;
            case 20379223:
                if (str.equals("attachment_sizetype")) {
                    c = 7;
                    break;
                }
                break;
            case 596535027:
                if (str.equals("attachment_count")) {
                    c = '\b';
                    break;
                }
                break;
            case 1162361753:
                if (str.equals("attachment_warning_type")) {
                    c = '\t';
                    break;
                }
                break;
            case 1948867125:
                if (str.equals("attachment-expire-date-type")) {
                    c = '\n';
                    break;
                }
                break;
            case 2145125750:
                if (str.equals("file_token")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C43819s.m173684a((int) R.string.Mail_Attachment_HarmfulDetected);
            case 1:
                if (mailAttachment.mo151236l() != 0 && mailAttachment.mo151239o()) {
                    if (mailAttachment.mo151236l() > System.currentTimeMillis()) {
                        return C43819s.m173686a(R.string.Mail_Attachment_ExpireDateFuture, "ExpireDate", C43760c.m173467a(mailAttachment.mo151236l(), false));
                    }
                    return C43819s.m173686a(R.string.Mail_Attachment_ExpireDate, "ExpireDate", C43760c.m173467a(mailAttachment.mo151236l(), false));
                }
                return "";
            case 2:
                return mailAttachment.mo151230g();
            case 3:
                return "mail-attachment-icon:" + mailAttachment.mo151241q();
            case 4:
                if (!TextUtils.isEmpty(mailAttachment.mo151229f())) {
                    return mailAttachment.mo151241q();
                }
                C53241h.m205894a("MailAttachmentItemSegmentHandler", "replaceTagByValue empty file_name");
                return "";
            case 5:
                return C26311p.m95277b(mailAttachment.mo151231h());
            case 6:
                return C43785p.m173544b(mailAttachment.mo151241q());
            case 7:
                return String.valueOf(mailAttachment.mo151238n());
            case '\b':
                int i2 = this.f109561b;
                if (i2 <= 3) {
                    i = i2;
                }
                return "_" + i;
            case '\t':
                if (!TextUtils.isEmpty(mailAttachment.mo151229f())) {
                    String d = C26311p.m95284d(mailAttachment.mo151229f());
                    if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.harmfulattachment") && C43766i.m173487b(d)) {
                        return "warning";
                    }
                }
                return "none";
            case '\n':
                if (mailAttachment.mo151236l() != 0) {
                    if (mailAttachment.mo151236l() > System.currentTimeMillis()) {
                        return "normal";
                    }
                    return "warning";
                }
                return "none";
            case 11:
                return mailAttachment.mo151234j();
            default:
                return "";
        }
    }
}
