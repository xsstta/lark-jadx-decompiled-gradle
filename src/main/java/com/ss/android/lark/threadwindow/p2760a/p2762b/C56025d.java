package com.ss.android.lark.threadwindow.p2760a.p2762b;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.response.C34022c;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.threadwindow.a.b.d */
public class C56025d extends AbstractC33953b<ThreadInfo, C33952a<ThreadInfo>> implements AbstractC56019a {

    /* renamed from: b */
    private final AbstractC34230k f138530b = C32881i.m126556a();

    /* renamed from: c */
    private String f138531c = "";

    /* renamed from: d */
    private String f138532d = "";

    /* renamed from: e */
    private String f138533e = "";

    /* renamed from: f */
    private String f138534f = "";

    /* renamed from: g */
    private final String f138535g;

    /* renamed from: h */
    private final List<String> f138536h;

    /* renamed from: i */
    private String f138537i = "";

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: b */
    public String mo122968b() {
        return "ThreadMentionFilter";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: a */
    public String mo122966a() {
        return this.f138535g;
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.p2762b.AbstractC56019a
    /* renamed from: c */
    public boolean mo191049c() {
        return !TextUtils.isEmpty(this.f138532d);
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.p2762b.AbstractC56019a
    /* renamed from: d */
    public boolean mo191050d() {
        return !TextUtils.isEmpty(this.f138531c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.threadwindow.a.b.d$1 */
    public static /* synthetic */ class C560261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f138538a;

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
                com.ss.android.lark.threadwindow.p2760a.p2762b.C56025d.C560261.f138538a = r0
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.FIRST_SCREEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.threadwindow.p2760a.p2762b.C56025d.C560261.f138538a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.PREVIOUS_PAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.threadwindow.p2760a.p2762b.C56025d.C560261.f138538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.NEXT_PAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.threadwindow.p2760a.p2762b.C56025d.C560261.f138538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.SPECIFIED_POSITION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadwindow.p2760a.p2762b.C56025d.C560261.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo122964a(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().getPosition();
    }

    /* renamed from: a */
    private String m217953a(MessageFetchScene messageFetchScene) {
        int i = C560261.f138538a[messageFetchScene.ordinal()];
        if (i == 2) {
            return this.f138531c;
        }
        if (i != 3) {
            return null;
        }
        return this.f138532d;
    }

    /* renamed from: b */
    private String m217955b(MessageFetchScene messageFetchScene) {
        int i = C560261.f138538a[messageFetchScene.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f138533e;
            }
            if (i == 3) {
                return this.f138534f;
            }
            if (i != 4) {
                return null;
            }
        }
        return this.f138537i;
    }

    /* renamed from: a */
    private void m217954a(MessageFetchScene messageFetchScene, C34022c cVar) {
        int i = C560261.f138538a[messageFetchScene.ordinal()];
        if (i == 1) {
            this.f138531c = cVar.f87925c;
            this.f138532d = cVar.f87924b;
            this.f138533e = cVar.f87927e;
            this.f138534f = cVar.f87926d;
        } else if (i == 2) {
            this.f138531c = cVar.f87925c;
            this.f138533e = cVar.f87927e;
        } else if (i == 3) {
            this.f138532d = cVar.f87924b;
            this.f138534f = cVar.f87926d;
        }
    }

    public C56025d(String str, List<String> list, Executor executor) {
        super(executor);
        this.f138535g = str;
        this.f138536h = list;
        if (!CollectionUtils.isEmpty(list)) {
            this.f138537i = list.get(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: b */
    public C33952a<ThreadInfo> mo122967b(MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str) {
        String a = m217953a(messageFetchScene);
        C34022c a2 = this.f138530b.mo121349a(this.f138535g, m217955b(messageFetchScene), messageFetchScene, a, i2, 30, this.f138536h);
        if (a2 == null) {
            return null;
        }
        C33952a<ThreadInfo> aVar = new C33952a<>(a2.f87923a, new ArrayList(), new ArrayList());
        m217954a(messageFetchScene, a2);
        return aVar;
    }
}
