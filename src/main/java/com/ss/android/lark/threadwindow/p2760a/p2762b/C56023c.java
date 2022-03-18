package com.ss.android.lark.threadwindow.p2760a.p2762b;

import android.text.TextUtils;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.response.C34022c;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.threadwindow.a.b.c */
public class C56023c extends AbstractC33953b<ThreadInfo, C33952a<ThreadInfo>> implements AbstractC56019a {

    /* renamed from: b */
    private final AbstractC34230k f138524b = C32881i.m126556a();

    /* renamed from: c */
    private String f138525c = "";

    /* renamed from: d */
    private String f138526d = "";

    /* renamed from: e */
    private final String f138527e;

    /* renamed from: f */
    private String f138528f;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: b */
    public String mo122968b() {
        return "ThreadFilter";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: a */
    public String mo122966a() {
        return this.f138527e;
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.p2762b.AbstractC56019a
    /* renamed from: c */
    public boolean mo191049c() {
        return !TextUtils.isEmpty(this.f138526d);
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.p2762b.AbstractC56019a
    /* renamed from: d */
    public boolean mo191050d() {
        return !TextUtils.isEmpty(this.f138525c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.threadwindow.a.b.c$1 */
    public static /* synthetic */ class C560241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f138529a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.chat.core.model.MessageFetchScene[] r0 = com.ss.android.lark.chat.core.model.MessageFetchScene.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.threadwindow.p2760a.p2762b.C56023c.C560241.f138529a = r0
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.FIRST_SCREEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.threadwindow.p2760a.p2762b.C56023c.C560241.f138529a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.PREVIOUS_PAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.threadwindow.p2760a.p2762b.C56023c.C560241.f138529a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.NEXT_PAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.threadwindow.p2760a.p2762b.C56023c.C560241.f138529a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.SPECIFIED_POSITION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadwindow.p2760a.p2762b.C56023c.C560241.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo122964a(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().getPosition();
    }

    /* renamed from: a */
    private String m217944a(MessageFetchScene messageFetchScene) {
        int i = C560241.f138529a[messageFetchScene.ordinal()];
        if (i == 2) {
            return this.f138525c;
        }
        if (i != 3) {
            return null;
        }
        return this.f138526d;
    }

    /* renamed from: a */
    private void m217945a(MessageFetchScene messageFetchScene, C34022c cVar) {
        int i = C560241.f138529a[messageFetchScene.ordinal()];
        if (i == 1) {
            this.f138525c = cVar.f87925c;
            this.f138526d = cVar.f87924b;
        } else if (i == 2) {
            this.f138525c = cVar.f87925c;
        } else if (i == 3) {
            this.f138526d = cVar.f87924b;
        }
    }

    public C56023c(String str, String str2, Executor executor) {
        super(executor);
        this.f138527e = str;
        this.f138528f = str2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: b */
    public C33952a<ThreadInfo> mo122967b(MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str) {
        C34022c a = this.f138524b.mo121348a(this.f138527e, this.f138528f, messageFetchScene, m217944a(messageFetchScene), i2, 30);
        if (a == null) {
            return null;
        }
        C33952a<ThreadInfo> aVar = new C33952a<>(a.f87923a, new ArrayList(), new ArrayList());
        m217945a(messageFetchScene, a);
        return aVar;
    }
}
