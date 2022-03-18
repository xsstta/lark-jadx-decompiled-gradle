package com.ss.android.lark.chat.service.impl.p1681a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.chat.service.impl.a.b */
public class C34136b {

    /* renamed from: a */
    private final ExecutorService f88369a;

    /* renamed from: com.ss.android.lark.chat.service.impl.a.b$a */
    private static final class C34138a {

        /* renamed from: a */
        public static final C34136b f88371a = new C34136b(null);
    }

    /* renamed from: a */
    public static C34136b m132589a() {
        return C34138a.f88371a;
    }

    private C34136b() {
        this.f88369a = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-media-compress");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.a.b$1 */
    public static /* synthetic */ class C341371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f88370a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.chat.entity.message.Message$Type[] r0 = com.ss.android.lark.chat.entity.message.Message.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.service.impl.p1681a.C34136b.C341371.f88370a = r0
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.MEDIA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.service.impl.p1681a.C34136b.C341371.f88370a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.p1681a.C34136b.C341371.<clinit>():void");
        }
    }

    /* synthetic */ C34136b(C341371 r1) {
        this();
    }

    /* renamed from: b */
    private synchronized List<Runnable> m132590b(Message message, AbstractC34135a<VideoCompressResult> aVar) {
        int i = C341371.f88370a[message.getType().ordinal()];
        if (i == 1) {
            return new C34144d().mo126688a(message, aVar);
        } else if (i != 2) {
            return null;
        } else {
            return new C34145e().mo126689a(message, aVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo126664a(Message message, AbstractC34135a<VideoCompressResult> aVar) {
        List<Runnable> b = m132590b(message, aVar);
        if (CollectionUtils.isEmpty(b)) {
            aVar.mo126663a(new ErrorResult("create compress task failure, mgs id: " + message.getId()));
        } else {
            for (Runnable runnable : b) {
                if (runnable != null) {
                    this.f88369a.execute(runnable);
                } else {
                    aVar.onError(new ErrorResult("compress task is null, mgs id: " + message.getId()));
                }
            }
        }
    }
}
