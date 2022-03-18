package com.ss.android.lark.chat.service.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.PushUserReactionsResponse;
import com.bytedance.lark.pb.im.v1.UserReactions;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.chat.service.impl.z */
public class C34291z {

    /* renamed from: a */
    public List<AbstractC34294b> f88584a;

    /* renamed from: com.ss.android.lark.chat.service.impl.z$a */
    private static class C34293a {

        /* renamed from: a */
        public static final C34291z f88587a = new C34291z();
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.z$b */
    public interface AbstractC34294b {
        /* renamed from: a */
        void mo123087a(List<String> list);
    }

    /* renamed from: a */
    public static C34291z m132976a() {
        return C34293a.f88587a;
    }

    private C34291z() {
        this.f88584a = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132978b() {
        C53248k.m205912a().mo181696a(Command.PUSH_USER_REACTIONS);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132979c() {
        C53248k.m205912a().mo181697a(Command.PUSH_USER_REACTIONS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$z$LVFVi5HPNR2YWAakz6WaWwG651Q */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34291z.this.m132977a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: b */
    public void mo126839b(AbstractC34294b bVar) {
        C53246j.m205911b(this.f88584a, bVar, $$Lambda$z$DjUWdoVHOWej52X9H1YmPc7UZE0.INSTANCE);
    }

    /* renamed from: a */
    public void mo126838a(AbstractC34294b bVar) {
        C53246j.m205910a(this.f88584a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$z$H5UW_NNQ7ApSEeE_zBopoZnto */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34291z.this.m132979c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m132977a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            UserReactions userReactions = PushUserReactionsResponse.ADAPTER.decode(bArr).user_reactions;
            if (userReactions != null) {
                final ArrayList arrayList = new ArrayList(userReactions.keys);
                if (CollectionUtils.isNotEmpty(userReactions.extra_keys)) {
                    arrayList.addAll(userReactions.extra_keys);
                }
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.chat.service.impl.C34291z.RunnableC342921 */

                    public void run() {
                        for (AbstractC34294b bVar : C34291z.this.f88584a) {
                            bVar.mo123087a(arrayList);
                        }
                    }
                });
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
