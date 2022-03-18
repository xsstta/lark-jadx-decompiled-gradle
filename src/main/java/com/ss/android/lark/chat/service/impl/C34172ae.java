package com.ss.android.lark.chat.service.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.chat.service.AbstractC34127i;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.chat.service.impl.ae */
public class C34172ae {

    /* renamed from: a */
    public List<AbstractC34127i> f88429a = new CopyOnWriteArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.ae$a */
    public static class C34174a {

        /* renamed from: a */
        public static final C34172ae f88432a = new C34172ae();
    }

    /* renamed from: a */
    public static C34172ae m132668a() {
        return C34174a.f88432a;
    }

    C34172ae() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132670b() {
        C53248k.m205912a().mo181696a(Command.PUSH_TOPIC_GROUPS);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132671c() {
        C53248k.m205912a().mo181697a(Command.PUSH_TOPIC_GROUPS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ae$vow9AjIDMbp3Kgc43w4PTw4uRB4 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34172ae.this.m132669a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo126714b(AbstractC34127i iVar) {
        C53246j.m205911b(this.f88429a, iVar, $$Lambda$ae$brpmbnf2DDhhrt3smT5bSNVdg9Q.INSTANCE);
    }

    /* renamed from: a */
    public void mo126713a(AbstractC34127i iVar) {
        C53246j.m205910a(this.f88429a, iVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$ae$RiGRKViokSwaAkKKCB16nSZAkM */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34172ae.this.m132671c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r4 = com.ss.android.lark.p2851u.p2852a.C57335x.m222234a(r2.get(r4.item_id));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m132669a(byte[] r2, java.lang.String r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            com.squareup.wire.ProtoAdapter<com.bytedance.lark.pb.im.v1.PushTopicGroups> r3 = com.bytedance.lark.pb.im.v1.PushTopicGroups.ADAPTER     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r2 = r3.decode(r2)     // Catch:{ Exception -> 0x0053 }
            com.bytedance.lark.pb.im.v1.PushTopicGroups r2 = (com.bytedance.lark.pb.im.v1.PushTopicGroups) r2     // Catch:{ Exception -> 0x0053 }
            java.util.List<com.bytedance.lark.pb.im.v1.PushTopicGroups$Item> r3 = r2.items     // Catch:{ Exception -> 0x0053 }
            com.bytedance.lark.pb.basic.v1.Entity r2 = r2.entity     // Catch:{ Exception -> 0x0053 }
            java.util.Map<java.lang.String, com.bytedance.lark.pb.basic.v1.TopicGroup> r2 = r2.topic_groups     // Catch:{ Exception -> 0x0053 }
            boolean r4 = com.larksuite.framework.utils.CollectionUtils.isNotEmpty(r3)     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x0053
            boolean r4 = com.larksuite.framework.utils.CollectionUtils.isNotEmpty(r2)     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x0053
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0053 }
        L_0x001e:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x0053
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0053 }
            com.bytedance.lark.pb.im.v1.PushTopicGroups$Item r4 = (com.bytedance.lark.pb.im.v1.PushTopicGroups.Item) r4     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x001e
            java.lang.String r5 = r4.item_id     // Catch:{ Exception -> 0x0053 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0053 }
            if (r5 != 0) goto L_0x001e
            java.lang.String r4 = r4.item_id     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ Exception -> 0x0053 }
            com.bytedance.lark.pb.basic.v1.TopicGroup r4 = (com.bytedance.lark.pb.basic.v1.TopicGroup) r4     // Catch:{ Exception -> 0x0053 }
            com.ss.android.lark.chat.entity.thread.TopicGroup r4 = com.ss.android.lark.p2851u.p2852a.C57335x.m222234a(r4)     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x001e
            com.larksuite.framework.thread.CoreThreadPool r5 = com.larksuite.framework.thread.CoreThreadPool.getDefault()     // Catch:{ Exception -> 0x0053 }
            java.util.concurrent.Executor r5 = r5.getUIExecutor()     // Catch:{ Exception -> 0x0053 }
            com.ss.android.lark.chat.service.impl.ae$1 r0 = new com.ss.android.lark.chat.service.impl.ae$1     // Catch:{ Exception -> 0x0053 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0053 }
            r5.execute(r0)     // Catch:{ Exception -> 0x0053 }
            goto L_0x001e
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.C34172ae.m132669a(byte[], java.lang.String, boolean, boolean):void");
    }
}
