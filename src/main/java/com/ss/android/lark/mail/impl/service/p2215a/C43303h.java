package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.email.v1.MailCollaboratorsChange;
import com.bytedance.lark.pb.email.v1.MailShareDraftChange;
import com.bytedance.lark.pb.email.v1.MailSharePermissionCodeChange;
import com.bytedance.lark.pb.email.v1.MailShareThreadChange;
import com.bytedance.lark.pb.email.v1.MailUnShareThreadChange;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43330q;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43331r;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43332s;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43334u;

/* renamed from: com.ss.android.lark.mail.impl.service.a.h */
public class C43303h {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.service.a.h$1 */
    public static /* synthetic */ class C433041 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110152a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.DraftChangeAction[] r0 = com.bytedance.lark.pb.email.client.v1.DraftChangeAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.service.p2215a.C43303h.C433041.f110152a = r0
                com.bytedance.lark.pb.email.client.v1.DraftChangeAction r1 = com.bytedance.lark.pb.email.client.v1.DraftChangeAction.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.service.p2215a.C43303h.C433041.f110152a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.DraftChangeAction r1 = com.bytedance.lark.pb.email.client.v1.DraftChangeAction.SEND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.service.p2215a.C43303h.C433041.f110152a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.DraftChangeAction r1 = com.bytedance.lark.pb.email.client.v1.DraftChangeAction.DELETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.service.p2215a.C43303h.C433041.f110152a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.email.client.v1.DraftChangeAction r1 = com.bytedance.lark.pb.email.client.v1.DraftChangeAction.UPDATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.service.p2215a.C43303h.C433041.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final void m172018a(MailCollaboratorsChange mailCollaboratorsChange) {
        Log.m165389i("SharePushDispatcher", "dispatchCollaboratorsChange");
        ((AbstractC43330q) Watchers.m167205a(AbstractC43330q.class)).mo154987a(mailCollaboratorsChange.thread_id);
    }

    /* renamed from: a */
    public static final void m172020a(MailSharePermissionCodeChange mailSharePermissionCodeChange) {
        Log.m165389i("SharePushDispatcher", "dispatchSharePermissionChange");
        ((AbstractC43332s) Watchers.m167205a(AbstractC43332s.class)).mo150849a(mailSharePermissionCodeChange.thread_id, mailSharePermissionCodeChange.permission_code);
    }

    /* renamed from: a */
    public static final void m172019a(MailShareDraftChange mailShareDraftChange) {
        Log.m165389i("SharePushDispatcher", "dispatchShareDraftChange");
        if (mailShareDraftChange == null) {
            Log.m165383e("SharePushDispatcher", "dispatchShareDraftChange null");
        } else if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.coedit")) {
            int i = C433041.f110152a[mailShareDraftChange.action.ordinal()];
            if (i == 1) {
                ((AbstractC43331r) Watchers.m167205a(AbstractC43331r.class)).mo150848a(mailShareDraftChange.thread_id, mailShareDraftChange.draft);
            } else if (i == 2) {
                ((AbstractC43331r) Watchers.m167205a(AbstractC43331r.class)).mo150859c(mailShareDraftChange.thread_id, mailShareDraftChange.draft);
            } else if (i == 3) {
                ((AbstractC43331r) Watchers.m167205a(AbstractC43331r.class)).mo150857b(mailShareDraftChange.thread_id, mailShareDraftChange.draft);
            } else if (i == 4) {
                ((AbstractC43331r) Watchers.m167205a(AbstractC43331r.class)).mo150861d(mailShareDraftChange.thread_id, mailShareDraftChange.draft);
            }
        }
    }

    /* renamed from: a */
    public static final void m172021a(MailShareThreadChange mailShareThreadChange) {
        Log.m165389i("SharePushDispatcher", "dispatchShareChange");
        if (mailShareThreadChange == null) {
            Log.m165383e("SharePushDispatcher", "dispatchShareChange null");
        } else {
            ((AbstractC43334u) Watchers.m167205a(AbstractC43334u.class)).mo150846a(mailShareThreadChange.thread_id);
        }
    }

    /* renamed from: a */
    public static final void m172022a(MailUnShareThreadChange mailUnShareThreadChange) {
        Log.m165389i("SharePushDispatcher", "dispatchUnshareChange");
        if (mailUnShareThreadChange == null) {
            Log.m165383e("SharePushDispatcher", "dispatchUnshareChange null");
        } else {
            ((AbstractC43334u) Watchers.m167205a(AbstractC43334u.class)).mo150850a(mailUnShareThreadChange.thread_id, mailUnShareThreadChange.operator_user_id);
        }
    }
}
