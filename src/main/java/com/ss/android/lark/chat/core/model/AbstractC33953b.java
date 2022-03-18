package com.ss.android.lark.chat.core.model;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.C53241h;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.chat.core.model.b */
public abstract class AbstractC33953b<T extends AbstractC34006a, PageData extends C33952a<T>> extends PageLoader<C33963h, PageData> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo122964a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo122966a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract PageData mo122967b(MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo122968b();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.core.model.b$1 */
    public static /* synthetic */ class C339541 {

        /* renamed from: a */
        static final /* synthetic */ int[] f87538a;

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
                com.ss.android.lark.chat.core.model.AbstractC33953b.C339541.f87538a = r0
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.FIRST_SCREEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.core.model.AbstractC33953b.C339541.f87538a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.SPECIFIED_POSITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.core.model.AbstractC33953b.C339541.f87538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.PREVIOUS_PAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chat.core.model.AbstractC33953b.C339541.f87538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.core.model.MessageFetchScene r1 = com.ss.android.lark.chat.core.model.MessageFetchScene.NEXT_PAGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.core.model.AbstractC33953b.C339541.<clinit>():void");
        }
    }

    public AbstractC33953b(Executor executor) {
        super(executor);
    }

    /* renamed from: a */
    private int m131402a(MessageFetchScene messageFetchScene) {
        int i = C339541.f87538a[messageFetchScene.ordinal()];
        if (i == 1 || i == 2) {
            return 5;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo124050b(C33963h hVar, PageLoader.AbstractC33948a<PageData> aVar) {
        m131404a(MessageFetchScene.NEXT_PAGE, hVar.mo124055a(), hVar.mo124056b(), ChannelDataFetcherStrategy.SYNC_SERVER_DATA, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo124046a(C33963h hVar, PageLoader.AbstractC33948a<PageData> aVar) {
        m131404a(MessageFetchScene.PREVIOUS_PAGE, hVar.mo124055a(), hVar.mo124056b(), ChannelDataFetcherStrategy.SYNC_SERVER_DATA, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo124052c(C33963h hVar, PageLoader.AbstractC33948a<PageData> aVar) {
        m131404a(hVar.f87553a, hVar.mo124055a(), hVar.mo124056b(), hVar.f87554b, aVar);
    }

    /* renamed from: a */
    private void m131403a(int i, MessageFetchScene messageFetchScene, C33952a<T> aVar, long j) {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - j;
        StringBuilder sb = new StringBuilder();
        sb.append("load success, total cost = [");
        sb.append(currentTimeMillis + "ms], channelId = [");
        sb.append(mo122966a());
        sb.append("], type = [");
        sb.append(messageFetchScene.getDesc());
        sb.append("], start position = [");
        sb.append(i);
        if (aVar == null || CollectionUtils.isEmpty(aVar.mo124058b())) {
            sb.append("], ");
            if (aVar == null) {
                str = "page data is null";
            } else {
                str = "data list is empty";
            }
            sb.append(str);
        } else {
            int a = mo122964a(aVar.mo124058b().get(0));
            int a2 = mo122964a(aVar.mo124058b().get(aVar.mo124058b().size() - 1));
            sb.append("], start = [");
            sb.append(a);
            sb.append("], end = [");
            sb.append(a2);
            sb.append("], size = [");
            sb.append(aVar.mo124058b().size());
            sb.append("]");
        }
        C53241h.m205898b(mo122968b(), sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.ss.android.lark.chat.core.model.b<T extends com.ss.android.lark.chat.entity.message.a, PageData extends com.ss.android.lark.chat.core.model.a<T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: com.ss.android.lark.chat.core.model.PageLoader$a<PageData extends com.ss.android.lark.chat.core.model.a<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m131404a(MessageFetchScene messageFetchScene, int i, int i2, ChannelDataFetcherStrategy channelDataFetcherStrategy, PageLoader.AbstractC33948a<PageData> aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String a = C53234a.m205877a();
        int a2 = m131402a(messageFetchScene);
        String b = mo122968b();
        C53241h.m205898b(b, "load: fetchScene = [" + messageFetchScene + "], position = [" + i + "], pageSize = [" + i2 + "], strategy = [" + channelDataFetcherStrategy + "]");
        C33952a b2 = mo122967b(messageFetchScene, i, i2, a2, 30, true, channelDataFetcherStrategy, a);
        m131403a(i, messageFetchScene, b2, currentTimeMillis);
        if (aVar == 0) {
            return;
        }
        if (b2 != null) {
            aVar.mo124053a((PageData) b2);
            return;
        }
        aVar.mo124054a(new Throwable("load data failed :" + messageFetchScene.getDesc() + " " + i + " " + i2));
    }
}
