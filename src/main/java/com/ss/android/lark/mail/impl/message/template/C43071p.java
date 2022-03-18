package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.share.C43691h;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.p */
public class C43071p extends AbstractC43031a<MailDraft> {

    /* renamed from: a */
    private static String f109610a = "$draft_title$";

    /* renamed from: b */
    private static String f109611b = "$show_draft_delete_icon$";

    /* renamed from: c */
    private String f109612c;

    /* renamed from: d */
    private PermissionCode f109613d;

    /* renamed from: a */
    public String mo154251a(MailDraft mailDraft) {
        StringBuilder sb = new StringBuilder();
        m171260a(sb, mailDraft);
        return sb.toString();
    }

    public C43071p(PermissionCode permissionCode) {
        String replace = mo154209a("draft_item").replace(f109610a, C43819s.m173684a((int) R.string.Mail_Normal_Draft));
        this.f109612c = replace;
        this.f109612c = replace.replace(f109611b, "");
        this.f109613d = permissionCode;
    }

    /* renamed from: a */
    private void m171260a(StringBuilder sb, final MailDraft mailDraft) {
        if (mailDraft != null) {
            mo154210a(sb, this.f109612c, new AbstractC43088y() {
                /* class com.ss.android.lark.mail.impl.message.template.C43071p.C430721 */

                @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
                /* renamed from: a */
                public String mo154220a(String str) {
                    return C43071p.this.mo154252a(str, mailDraft);
                }
            });
        }
    }

    /* renamed from: a */
    public String mo154252a(String str, MailDraft mailDraft) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1913631774:
                if (str.equals("message_list_avatar")) {
                    c = 0;
                    break;
                }
                break;
            case -1690722221:
                if (str.equals("message_id")) {
                    c = 1;
                    break;
                }
                break;
            case -1592567883:
                if (str.equals("show_draft_attachment_icon")) {
                    c = 2;
                    break;
                }
                break;
            case -841643911:
                if (str.equals("draft_id")) {
                    c = 3;
                    break;
                }
                break;
            case -147132913:
                if (str.equals("user_id")) {
                    c = 4;
                    break;
                }
                break;
            case 80500224:
                if (str.equals("from_name")) {
                    c = 5;
                    break;
                }
                break;
            case 1446799655:
                if (str.equals("body_plaint")) {
                    c = 6;
                    break;
                }
                break;
        }
        String str2 = "";
        switch (c) {
            case 0:
                MailAddress e = C42107a.m168074a().mo152038e(mailDraft.mo151331b().mo151182e());
                if (e == null || TextUtils.isEmpty(e.mo151192m())) {
                    return str2;
                }
                return mo154209a("message_list_avatar").replace("$avatar_url$", e.mo151192m());
            case 1:
                if (C43691h.m173280a(this.f109613d)) {
                    return mailDraft.mo151362o();
                }
                String C = mailDraft.mo151318C();
                if (TextUtils.isEmpty(C)) {
                    return mailDraft.mo151362o();
                }
                return C;
            case 2:
                if (mailDraft.mo151355i() == null || mailDraft.mo151355i().isEmpty()) {
                    return "hide";
                }
                return str2;
            case 3:
                return mailDraft.mo151321a();
            case 4:
                if (mailDraft.mo151331b() != null) {
                    return mailDraft.mo151331b().mo151189j();
                }
                return str2;
            case 5:
                if (!(mailDraft.mo151331b() == null || mailDraft.mo151331b().mo151182e() == null)) {
                    str2 = mailDraft.mo151331b().mo151182e();
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = " @ ";
                }
                return C43032aa.m171192d(str2);
            case 6:
                return C43032aa.m171192d(mailDraft.mo151359l());
            default:
                return str2;
        }
    }
}
