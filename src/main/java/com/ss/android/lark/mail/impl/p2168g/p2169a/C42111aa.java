package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Message;
import com.ss.android.lark.mail.impl.entity.MailMessageRecallState;

/* renamed from: com.ss.android.lark.mail.impl.g.a.aa */
public class C42111aa extends C42128h<Message.RecallStatus, MailMessageRecallState> {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.g.a.aa$1 */
    public static /* synthetic */ class C421121 {

        /* renamed from: a */
        static final /* synthetic */ int[] f107146a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.Message$RecallStatus[] r0 = com.bytedance.lark.pb.email.client.v1.Message.RecallStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.p2168g.p2169a.C42111aa.C421121.f107146a = r0
                com.bytedance.lark.pb.email.client.v1.Message$RecallStatus r1 = com.bytedance.lark.pb.email.client.v1.Message.RecallStatus.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42111aa.C421121.f107146a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.Message$RecallStatus r1 = com.bytedance.lark.pb.email.client.v1.Message.RecallStatus.Processing     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42111aa.C421121.f107146a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.Message$RecallStatus r1 = com.bytedance.lark.pb.email.client.v1.Message.RecallStatus.Done     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42111aa.C421121.f107146a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.email.client.v1.Message$RecallStatus r1 = com.bytedance.lark.pb.email.client.v1.Message.RecallStatus.ALL_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42111aa.C421121.f107146a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.lark.pb.email.client.v1.Message$RecallStatus r1 = com.bytedance.lark.pb.email.client.v1.Message.RecallStatus.ALL_FAIL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.mail.impl.p2168g.p2169a.C42111aa.C421121.f107146a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.lark.pb.email.client.v1.Message$RecallStatus r1 = com.bytedance.lark.pb.email.client.v1.Message.RecallStatus.SOME_FAIL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.p2168g.p2169a.C42111aa.C421121.<clinit>():void");
        }
    }

    public C42111aa(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: b */
    public Message.RecallStatus mo152040a(Message.RecallStatus recallStatus, MailMessageRecallState mailMessageRecallState) {
        int a = mailMessageRecallState.mo151640a();
        if (a == 1) {
            return Message.RecallStatus.Processing;
        }
        if (a == 2) {
            return Message.RecallStatus.Done;
        }
        if (a == 3) {
            return Message.RecallStatus.ALL_SUCCESS;
        }
        if (a == 4) {
            return Message.RecallStatus.ALL_FAIL;
        }
        if (a != 5) {
            return Message.RecallStatus.None;
        }
        return Message.RecallStatus.SOME_FAIL;
    }

    /* renamed from: a */
    public MailMessageRecallState mo152042b(Message.RecallStatus recallStatus, MailMessageRecallState mailMessageRecallState) {
        if (mailMessageRecallState == null) {
            mailMessageRecallState = new MailMessageRecallState();
        }
        switch (C421121.f107146a[recallStatus.ordinal()]) {
            case 1:
                mailMessageRecallState.mo151641a(0);
                break;
            case 2:
                mailMessageRecallState.mo151641a(1);
                break;
            case 3:
                mailMessageRecallState.mo151641a(2);
                break;
            case 4:
                mailMessageRecallState.mo151641a(3);
                break;
            case 5:
                mailMessageRecallState.mo151641a(4);
                break;
            case 6:
                mailMessageRecallState.mo151641a(5);
                break;
        }
        return mailMessageRecallState;
    }
}
