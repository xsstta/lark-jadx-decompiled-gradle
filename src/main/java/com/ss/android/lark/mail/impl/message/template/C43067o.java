package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.RedirectType;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.ss.android.lark.mail.impl.message.template.o */
public class C43067o extends AbstractC43031a<List<C42097j>> {

    /* renamed from: a */
    List<C42097j> f109591a;

    /* renamed from: b */
    private String f109592b;

    /* renamed from: c */
    private String f109593c = "";

    /* renamed from: d */
    private String f109594d = "";

    /* renamed from: e */
    private C43071p f109595e;

    /* renamed from: f */
    private boolean f109596f;

    /* renamed from: g */
    private String f109597g;

    /* renamed from: h */
    private boolean f109598h = C41816b.m166115a().mo150116F().mo150192b();

    /* renamed from: i */
    private boolean f109599i = false;

    /* renamed from: j */
    private C43086x f109600j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.template.o$3 */
    public static /* synthetic */ class C430703 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109609a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel[] r0 = com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.template.C43067o.C430703.f109609a = r0
                com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel r1 = com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel.SPOOF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.template.C43067o.C430703.f109609a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel r1 = com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel.PHISHING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.template.C43067o.C430703.<clinit>():void");
        }
    }

    /* renamed from: a */
    private String m171251a() {
        if (this.f109592b == null) {
            this.f109592b = mo154209a("message_list_item").replace("$lan$", C43032aa.m171186a()).replace("$button_readmore$", C43819s.m173684a((int) R.string.Mail_Message_ReadMore));
            this.f109593c = mo154209a("fold_recipients_list").replace("$mail_receiver$", C43819s.m173684a((int) R.string.Mail_Normal_Receiver));
            this.f109594d = mo154209a("fold_recipients_list").replace("$mail_receiver$", C43819s.m173684a((int) R.string.Mail_Compose_SendSeparatelyTo));
        }
        return this.f109592b;
    }

    /* renamed from: a */
    public String mo154248a(List<C42097j> list) {
        this.f109591a = list;
        return m171254b(list);
    }

    /* renamed from: b */
    private String m171254b(final List<C42097j> list) {
        Locale m = C41816b.m166115a().mo150146m();
        if (m != null && "en".equals(m.getLanguage().toLowerCase())) {
            this.f109599i = true;
        }
        final int size = list.size();
        if (size == 1) {
            return mo154246a(list.get(0), size, size);
        }
        ArrayList arrayList = new ArrayList();
        for (final int i = 0; i < size; i++) {
            FutureTask futureTask = new FutureTask(new Callable<String>() {
                /* class com.ss.android.lark.mail.impl.message.template.C43067o.CallableC430681 */

                /* renamed from: a */
                public String call() throws Exception {
                    return C43067o.this.mo154246a((C42097j) list.get(i), i + 1, size);
                }
            });
            CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask);
            arrayList.add(futureTask);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                sb.append((String) ((FutureTask) arrayList.get(i2)).get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private String m171252a(String str, String str2) {
        return str.replaceAll("(<img.*?src=\")cid:(.*?)\"", "$1file:///android_asset/mail_template/images/blank.png?cid=$2_msgId" + str2 + "\"");
    }

    public C43067o(C42104p pVar, String str) {
        this.f109597g = str;
        this.f109595e = new C43071p(pVar.mo152021c());
        this.f109596f = pVar.mo152024f();
        this.f109600j = new C43086x(str);
    }

    /* renamed from: a */
    private void m171253a(StringBuilder sb, MailDraft mailDraft, String str) {
        sb.append(this.f109595e.mo154251a(mailDraft));
    }

    /* renamed from: a */
    public String mo154246a(final C42097j jVar, final int i, final int i2) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, m171251a(), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43067o.C430692 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43067o.this.mo154247a(str, jVar, i, i2);
            }
        });
        List<MailDraft> a = jVar.mo151950a();
        if (a != null && !a.isEmpty()) {
            m171253a(sb, a.get(0), jVar.mo151964g().mo151581b());
        }
        return m171252a(sb.toString(), jVar.mo151964g().mo151581b());
    }

    /* renamed from: a */
    public String mo154247a(String str, C42097j jVar, int i, int i2) {
        MailAddress e;
        MailMessage g = jVar.mo151964g();
        str.hashCode();
        String str2 = "centerFrom";
        int i3 = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1913631774:
                if (str.equals("message_list_avatar")) {
                    c = 0;
                    break;
                }
                break;
            case -1852780336:
                if (str.equals("tenant_id")) {
                    c = 1;
                    break;
                }
                break;
            case -1690722221:
                if (str.equals("message_id")) {
                    c = 2;
                    break;
                }
                break;
            case -1662595137:
                if (str.equals("item-content")) {
                    c = 3;
                    break;
                }
                break;
            case -1099017395:
                if (str.equals("format_message_time")) {
                    c = 4;
                    break;
                }
                break;
            case -658033425:
                if (str.equals("redirect_banner")) {
                    c = 5;
                    break;
                }
                break;
            case -147132913:
                if (str.equals("user_id")) {
                    c = 6;
                    break;
                }
                break;
            case 80500224:
                if (str.equals("from_name")) {
                    c = 7;
                    break;
                }
                break;
            case 339542830:
                if (str.equals("user_type")) {
                    c = '\b';
                    break;
                }
                break;
            case 532479614:
                if (str.equals("attachment_tag")) {
                    c = '\t';
                    break;
                }
                break;
            case 611718610:
                if (str.equals("message_expand")) {
                    c = '\n';
                    break;
                }
                break;
            case 1026402985:
                if (str.equals("address_address")) {
                    c = 11;
                    break;
                }
                break;
            case 1030698348:
                if (str.equals("recall_tag")) {
                    c = '\f';
                    break;
                }
                break;
            case 1070544573:
                if (str.equals("context-menu")) {
                    c = '\r';
                    break;
                }
                break;
            case 1161569695:
                if (str.equals(str2)) {
                    c = 14;
                    break;
                }
                break;
            case 1446799655:
                if (str.equals("body_plaint")) {
                    c = 15;
                    break;
                }
                break;
            case 1527624709:
                if (str.equals("fold_recipients_list")) {
                    c = 16;
                    break;
                }
                break;
            case 1615100053:
                if (str.equals("display_none")) {
                    c = 17;
                    break;
                }
                break;
            case 2082189195:
                if (str.equals("is_read")) {
                    c = 18;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                int i4 = C430703.f109609a[g.mo151565a().ordinal()];
                if (i4 == 1 || i4 == 2 || (e = C42107a.m168074a().mo152038e(g.mo151586c().mo151182e())) == null || TextUtils.isEmpty(e.mo151192m())) {
                    return "";
                }
                return mo154209a("message_list_avatar").replace("$avatar_url$", e.mo151192m());
            case 1:
                return String.valueOf(g.mo151586c().mo151196q());
            case 2:
                return g.mo151581b();
            case 3:
                if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mobile.readmail.lazyloaditem")) {
                    return this.f109600j.mo154270a(g);
                }
                if (i == i2 || !g.mo151616p() || this.f109596f) {
                    return this.f109600j.mo154270a(g);
                }
                return "";
            case 4:
                return g.mo151566a(this.f109598h, this.f109599i);
            case 5:
                RedirectType Q = jVar.mo151964g().mo151564Q();
                if (Q == null || this.f109596f || Q == RedirectType.NONE_REDIRECT) {
                    return "";
                }
                String replace = C43089z.m171291a().mo154272a("message-redirect-banner").replace("$redirect-title$", C43819s.m173684a((int) R.string.Mail_DataProtection_SendRedirected));
                if (Q == RedirectType.TO) {
                    return replace.replace("$redirect-info$", C43819s.m173684a((int) R.string.Mail_DataProtection_SendRedirectedDesc));
                }
                if (Q == RedirectType.CC) {
                    return replace.replace("$redirect-info$", C43819s.m173684a((int) R.string.Mail_DataProtection_CCToYouDesc));
                }
                if (Q == RedirectType.BCC) {
                    return replace.replace("$redirect-info$", C43819s.m173684a((int) R.string.Mail_DataProtection_SendBCCToYouDesc));
                }
                return replace;
            case 6:
                if (g.mo151586c() != null) {
                    return g.mo151586c().mo151189j();
                }
                return "";
            case 7:
                return C43032aa.m171192d(g.mo151586c().mo151176a());
            case '\b':
                if (g.mo151586c().mo151190k() != null) {
                    i3 = g.mo151586c().mo151190k().getValue();
                }
                return String.valueOf(i3);
            case '\t':
                if (!g.mo151622v()) {
                    return "";
                }
                String a = mo154209a("attachment_tag");
                return a.replace("$attachments_count$", g.mo151625x() + "");
            case '\n':
                if (i == i2 || !g.mo151616p() || this.f109596f) {
                    return "expand";
                }
                return "";
            case 11:
                return C43032aa.m171192d(g.mo151586c().mo151182e());
            case HwBuildEx.VersionCodes.EMUI_5_1:
                String a2 = mo154209a("recall_tag");
                if (g.mo151551D().mo151640a() != 0) {
                    return a2.replace("$showRecallTag$", "showRecallTag");
                }
                return a2.replace("$showRecallTag$", "");
            case '\r':
                if (g.mo151623w()) {
                    return mo154209a("context-menu");
                }
                return "";
            case 14:
                if (g == null) {
                    return "";
                }
                if (!TextUtils.isEmpty(g.mo151597e(this.f109597g))) {
                    str2 = "";
                }
                return str2;
            case 15:
                return C43032aa.m171192d(g.mo151608i());
            case 16:
                String e2 = g.mo151597e(this.f109597g);
                if (TextUtils.isEmpty(e2)) {
                    return "";
                }
                if (g.mo151560M()) {
                    return this.f109594d.replace("$to_name_list_fold$", e2).replace("$from_address$", g.mo151586c().mo151182e());
                }
                return this.f109593c.replace("$to_name_list_fold$", e2).replace("$from_address$", g.mo151586c().mo151182e());
            case 17:
                int i5 = C430703.f109609a[g.mo151565a().ordinal()];
                if (i5 == 1 || i5 == 2) {
                    return "display-none";
                }
                return "";
            case 18:
                if (!g.mo151616p() || this.f109591a.size() == 1) {
                    return "false";
                }
                return "true";
            default:
                return null;
        }
    }
}
