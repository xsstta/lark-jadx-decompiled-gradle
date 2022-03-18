package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.template.q */
public class C43073q extends AbstractC43031a<List<C42097j>> {

    /* renamed from: a */
    public boolean f109616a = true;

    /* renamed from: b */
    private C42844a f109617b;

    /* renamed from: c */
    private C42104p f109618c;

    /* renamed from: d */
    private String f109619d;

    /* renamed from: e */
    private boolean f109620e;

    /* renamed from: f */
    private int f109621f;

    /* renamed from: g */
    private final String f109622g = "MailHtmlSegmentHandler";

    /* renamed from: a */
    public String mo154255a(final List<C42097j> list) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("main"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43073q.C430741 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                C43073q qVar = C43073q.this;
                return qVar.mo154254a(str, list, qVar.f109616a);
            }
        });
        return sb.toString();
    }

    /* renamed from: b */
    private String m171264b(List<C42097j> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (C42871i.m170779b()) {
            return str6;
        }
        C42844a aVar = this.f109617b;
        boolean z = false;
        if (aVar != null) {
            str = aVar.mo153786c().mo151993j();
        } else {
            str = list.get(0).mo151964g().mo151604g();
        }
        if (TextUtils.isEmpty(str)) {
            str = C43819s.m173684a((int) R.string.Mail_ThreadList_NoName);
            z = true;
        }
        String d = C43032aa.m171192d(str);
        C42104p pVar = this.f109618c;
        if (pVar == null || !pVar.mo152022d()) {
            str2 = str6;
        } else {
            str2 = "message-external-item";
        }
        if (this.f109618c.mo152024f()) {
            str3 = "isforward";
        } else {
            str3 = str6;
        }
        C42104p pVar2 = this.f109618c;
        if (pVar2 == null || !pVar2.mo152022d()) {
            str4 = str6;
        } else {
            str4 = C43819s.m173684a((int) R.string.Mail_SecurityWarning_External);
        }
        C42104p pVar3 = this.f109618c;
        if (pVar3 == null || CollectionUtils.isEmpty(pVar3.mo152018b())) {
            str5 = str6;
        } else {
            str5 = new C43075r(this.f109618c).mo154257a(C43374f.m172256a(this.f109618c.mo152021c(), this.f109618c.mo152018b(), this.f109619d));
        }
        if ("EML".equals(this.f109619d) || "OUTBOX".equals(this.f109619d) || "TRASH".equals(this.f109619d) || "SPAM".equals(this.f109619d) || "SHARE".equals(this.f109619d)) {
            str6 = "is-hidden";
        } else if (this.f109618c.mo152023e()) {
            str6 = "is-flagged";
        }
        String replace = mo154209a("message_header_item").replace(C43032aa.m171187a("subject"), d).replace(C43032aa.m171187a("message-external-item"), str2).replace(C43032aa.m171187a("isAndroidFont"), "android-font-style").replace(C43032aa.m171187a("isforward"), str3).replace(C43032aa.m171187a("message_external"), str4).replace(C43032aa.m171187a("message_labels"), str5).replace(C43032aa.m171187a("message-is-flagged"), str6);
        if (z) {
            return replace.replace(C43032aa.m171187a("isEmptySubject"), "message-subject-empty");
        }
        return replace;
    }

    /* renamed from: a */
    public String mo154253a(String str, String str2) {
        return str.replace(C43032aa.m171187a("message_list"), str2);
    }

    /* renamed from: a */
    public String mo154254a(String str, List<C42097j> list, boolean z) {
        String a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1945990618:
                if (str.equals("header_title")) {
                    c = 0;
                    break;
                }
                break;
            case -1830642091:
                if (str.equals("init_anchor_point")) {
                    c = 1;
                    break;
                }
                break;
            case -1634919082:
                if (str.equals("quote_expand_title")) {
                    c = 2;
                    break;
                }
                break;
            case -1609618811:
                if (str.equals("ownerwording")) {
                    c = 3;
                    break;
                }
                break;
            case -1562235024:
                if (str.equals("thread_id")) {
                    c = 4;
                    break;
                }
                break;
            case -1286318634:
                if (str.equals("message_list")) {
                    c = 5;
                    break;
                }
                break;
            case -939134710:
                if (str.equals("body_padding_top")) {
                    c = 6;
                    break;
                }
                break;
            case -814408215:
                if (str.equals("keyword")) {
                    c = 7;
                    break;
                }
                break;
            case -50798406:
                if (str.equals("screenWidth")) {
                    c = '\b';
                    break;
                }
                break;
            case 411785918:
                if (str.equals("quote_hide_title")) {
                    c = '\t';
                    break;
                }
                break;
            case 1012806018:
                if (str.equals("recommend-translate-button")) {
                    c = '\n';
                    break;
                }
                break;
            case 1192805648:
                if (str.equals("header_display")) {
                    c = 11;
                    break;
                }
                break;
            case 1213147185:
                if (str.equals("locate_to_expand")) {
                    c = '\f';
                    break;
                }
                break;
            case 1499573416:
                if (str.equals("myAddress")) {
                    c = '\r';
                    break;
                }
                break;
            case 2043148045:
                if (str.equals("translate_popover_title")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m171264b(list);
            case 1:
                if (this.f109620e) {
                    return "larkmail-readmore-anchor";
                }
                return "";
            case 2:
                if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.column_quote_style")) {
                    a = C43819s.m173684a((int) R.string.Mail_Edit_ShowHistoryEmail);
                    break;
                } else {
                    return "";
                }
            case 3:
                return C43819s.m173684a((int) R.string.Mail_DocPreview_Owner);
            case 4:
                return this.f109618c.mo152010a();
            case 5:
                return C43032aa.m171187a(str);
            case 6:
                if (C42871i.m170779b()) {
                    int i = this.f109621f;
                    if (i <= 0) {
                        i = C42871i.m170775a().mo153855e();
                    }
                    String str2 = (((float) i) / C41816b.m166115a().mo150132b().getResources().getDisplayMetrics().density) + "px";
                    Log.m165389i("MailHtmlSegmentHandler", "updateHeaderTop BODY_PADDING_TOP value:" + str2);
                    return str2;
                }
                return (((float) UIHelper.getDimens(R.dimen.mail_operation_title_bar_height)) / C41816b.m166115a().mo150132b().getResources().getDisplayMetrics().density) + "px";
            case 7:
                a = this.f109618c.mo152025g();
                if (TextUtils.isEmpty(a)) {
                    return "";
                }
                break;
            case '\b':
                return Integer.toString(UIHelper.px2dp((float) UIHelper.getWindowWidth(UIHelper.getContext())));
            case '\t':
                if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.column_quote_style")) {
                    a = C43819s.m173684a((int) R.string.Mail_Edit_HideHistoryEmail);
                    break;
                } else {
                    return "";
                }
            case '\n':
                return C43819s.m173684a((int) R.string.Mail_Translations_Translate);
            case 11:
                if (C42871i.m170779b()) {
                    return "none";
                }
                return "";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "true";
            case '\r':
                EmailAliasList j = C43350d.m172098a().mo155044j();
                if (j == null || CollectionUtils.isEmpty(j.mo151122d())) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                List<MailAddress> d = j.mo151122d();
                int size = d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MailAddress mailAddress = d.get(i2);
                    if (mailAddress != null && !TextUtils.isEmpty(mailAddress.mo151182e())) {
                        sb.append(mailAddress.mo151182e());
                        if (i2 + 1 < size) {
                            sb.append(",");
                        }
                    }
                }
                return sb.toString();
            case 14:
                return C43819s.m173684a((int) R.string.Mail_Translations_OriginalText);
            default:
                return "";
        }
        return a;
    }

    public C43073q(boolean z, C42104p pVar, String str, C42844a aVar, boolean z2, int i) {
        this.f109616a = z;
        this.f109618c = pVar;
        this.f109619d = str;
        this.f109620e = z2;
        this.f109617b = aVar;
        this.f109621f = i;
    }
}
