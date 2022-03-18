package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.SendState;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.u */
public class C43079u extends AbstractC43031a<MailMessage> {

    /* renamed from: a */
    private String f109633a;

    /* renamed from: b */
    private SendState f109634b;

    /* renamed from: c */
    private boolean f109635c;

    /* renamed from: d */
    private boolean f109636d;

    /* renamed from: e */
    private boolean f109637e = C41816b.m166115a().mo150154u().mo150160a("lark.mail.send_status");

    /* renamed from: b */
    private void m171277b() {
        if (TextUtils.isEmpty(this.f109633a)) {
            this.f109633a = mo154209a("send_status_banner");
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.message.template.u$1 */
    static /* synthetic */ class C430801 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109638a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.mail.impl.entity.SendState[] r0 = com.ss.android.lark.mail.impl.entity.SendState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.template.C43079u.C430801.f109638a = r0
                com.ss.android.lark.mail.impl.entity.SendState r1 = com.ss.android.lark.mail.impl.entity.SendState.ALL_FAIL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.template.C43079u.C430801.f109638a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.SendState r1 = com.ss.android.lark.mail.impl.entity.SendState.ALL_SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.message.template.C43079u.C430801.f109638a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.entity.SendState r1 = com.ss.android.lark.mail.impl.entity.SendState.PARTIAL_FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.message.template.C43079u.C430801.f109638a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.entity.SendState r1 = com.ss.android.lark.mail.impl.entity.SendState.PARTIAL_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.message.template.C43079u.C430801.f109638a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.mail.impl.entity.SendState r1 = com.ss.android.lark.mail.impl.entity.SendState.UNKNOWN_SEND_STATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.template.C43079u.C430801.<clinit>():void");
        }
    }

    /* renamed from: a */
    public boolean mo154262a() {
        SendState sendState;
        if (!this.f109637e || !C43350d.m172098a().mo155012D() || this.f109636d || (sendState = this.f109634b) == null || (sendState.ordinal() <= SendState.UNKNOWN_SEND_STATE.ordinal() && !this.f109635c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public String mo154261a(MailMessage mailMessage) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        int i = 0;
        if (mailMessage.mo151613m() == null || mailMessage.mo151613m().mo151632a() != 9) {
            z = false;
        } else {
            z = true;
        }
        this.f109635c = z;
        if (mailMessage.mo151551D() == null || mailMessage.mo151551D().mo151640a() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f109636d = z2;
        this.f109634b = mailMessage.mo151561N();
        String str5 = "";
        if (!mo154262a()) {
            return str5;
        }
        m171277b();
        String str6 = this.f109633a;
        if (this.f109634b == SendState.ALL_FAIL) {
            str = "showFail";
        } else {
            str = str5;
        }
        String replace = str6.replace("$showFail$", str);
        if (this.f109634b == SendState.ALL_SUCCESS) {
            str2 = "showSuccess";
        } else {
            str2 = str5;
        }
        String replace2 = replace.replace("$showSuccess$", str2);
        if (this.f109634b == SendState.PARTIAL_FAIL) {
            str3 = "showPartFail";
        } else {
            str3 = str5;
        }
        String replace3 = replace2.replace("$showPartFail$", str3);
        if (this.f109634b == SendState.PARTIAL_SUCCESS || this.f109634b == SendState.DELIVERING || this.f109634b == SendState.UNKNOWN_SEND_STATE) {
            str4 = "showRefresh";
        } else {
            str4 = str5;
        }
        String replace4 = replace3.replace("$showRefresh$", str4);
        if (this.f109634b.ordinal() <= SendState.UNKNOWN_SEND_STATE.ordinal()) {
            str5 = "hideArrow";
        }
        String replace5 = replace4.replace("$hideArrow$", str5);
        if (this.f109634b != null) {
            int i2 = C430801.f109638a[this.f109634b.ordinal()];
            if (i2 == 1) {
                i = R.string.Mail_Send_FailedToSend;
            } else if (i2 == 2) {
                i = R.string.Mail_Send_SendSuccess;
            } else if (i2 == 3) {
                i = R.string.Mail_Send_PartFailedToSend;
            } else if (i2 != 4) {
                i = R.string.Mail_Send_Sending;
            } else {
                i = R.string.Mail_Send_SendingPartSuccess;
            }
        }
        return replace5.replace("$sendStatusText$", C43819s.m173684a(i));
    }
}
