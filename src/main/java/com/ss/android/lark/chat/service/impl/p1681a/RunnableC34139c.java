package com.ss.android.lark.chat.service.impl.p1681a;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.service.impl.C34276v;
import com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.compress.AbstractC57817a;
import com.ss.android.lark.utils.compress.C57818b;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import java.io.File;

/* renamed from: com.ss.android.lark.chat.service.impl.a.c */
public class RunnableC34139c implements Runnable {

    /* renamed from: a */
    public String f88372a;

    /* renamed from: b */
    public String f88373b;

    /* renamed from: c */
    public String f88374c;

    /* renamed from: d */
    public AbstractC34135a<VideoCompressResult> f88375d;

    /* renamed from: e */
    private C34142b f88376e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.a.c$b */
    public static class C34142b {

        /* renamed from: a */
        private String f88379a;

        /* renamed from: b */
        private String f88380b;

        /* renamed from: c */
        private String f88381c;

        /* renamed from: d */
        private long f88382d;

        /* renamed from: e */
        private String f88383e;

        /* renamed from: f */
        private AbstractC34135a<VideoCompressResult> f88384f;

        private C34142b() {
        }

        /* renamed from: a */
        public String mo126674a() {
            return this.f88379a;
        }

        /* renamed from: b */
        public String mo126678b() {
            return this.f88380b;
        }

        /* renamed from: c */
        public String mo126680c() {
            return this.f88381c;
        }

        /* renamed from: f */
        public AbstractC34135a<VideoCompressResult> mo126685f() {
            return this.f88384f;
        }

        /* renamed from: e */
        public String mo126684e() {
            return ao.m224319h(mo126682d());
        }

        /* renamed from: d */
        public String mo126682d() {
            if (TextUtils.isEmpty(this.f88383e)) {
                this.f88383e = ao.m224300a(LarkContext.getApplication(), this.f88381c, true);
            }
            return this.f88383e;
        }

        /* renamed from: d */
        public void mo126683d(String str) {
            this.f88383e = str;
        }

        /* synthetic */ C34142b(C341401 r1) {
            this();
        }

        /* renamed from: a */
        public void mo126675a(long j) {
            this.f88382d = j;
        }

        /* renamed from: b */
        public void mo126679b(String str) {
            this.f88380b = str;
        }

        /* renamed from: c */
        public void mo126681c(String str) {
            this.f88381c = str;
        }

        /* renamed from: a */
        public void mo126676a(AbstractC34135a<VideoCompressResult> aVar) {
            this.f88384f = aVar;
        }

        /* renamed from: a */
        public void mo126677a(String str) {
            this.f88379a = str;
        }
    }

    /* renamed from: a */
    public void mo126665a() {
        synchronized (this) {
            notify();
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.a.c$a */
    public static class C34141a {

        /* renamed from: a */
        private C34142b f88378a = new C34142b(null);

        /* renamed from: a */
        public RunnableC34139c mo126670a() {
            return new RunnableC34139c(this.f88378a, null);
        }

        /* renamed from: a */
        public C34141a mo126667a(long j) {
            this.f88378a.mo126675a(j);
            return this;
        }

        /* renamed from: b */
        public C34141a mo126671b(String str) {
            this.f88378a.mo126679b(str);
            return this;
        }

        /* renamed from: c */
        public C34141a mo126672c(String str) {
            this.f88378a.mo126681c(str);
            return this;
        }

        /* renamed from: d */
        public C34141a mo126673d(String str) {
            this.f88378a.mo126683d(str);
            return this;
        }

        /* renamed from: a */
        public C34141a mo126668a(AbstractC34135a<VideoCompressResult> aVar) {
            this.f88378a.mo126676a(aVar);
            return this;
        }

        /* renamed from: a */
        public C34141a mo126669a(String str) {
            this.f88378a.mo126677a(str);
            return this;
        }
    }

    /* renamed from: b */
    private void m132593b() {
        synchronized (this) {
            try {
                wait(300000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.m165383e("MediaCompressTask", "thread is interrupted while waiting, message: " + this.f88376e.mo126674a());
                this.f88375d.onError(new ErrorResult(e.getMessage()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.a.c$1 */
    public static /* synthetic */ class C341401 {

        /* renamed from: a */
        static final /* synthetic */ int[] f88377a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType[] r0 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c.C341401.f88377a = r0
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.REUSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c.C341401.f88377a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_VE_NO_SUPPORT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c.C341401.f88377a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_SKIP_PROCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c.C341401.f88377a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.COPY_SKIP_MUXER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c.C341401.f88377a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.MUXER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c.C341401.f88377a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.utils.compress.VideoCompressResult$ResultType r1 = com.ss.android.lark.utils.compress.VideoCompressResult.ResultType.ENCODE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.p1681a.RunnableC34139c.C341401.<clinit>():void");
        }
    }

    public void run() {
        Log.m165389i("MediaCompressTask", "origin path: " + this.f88372a);
        Log.m165389i("MediaCompressTask", "compress path: " + this.f88373b);
        Log.m165389i("MediaCompressTask", "temp path: " + this.f88374c);
        if (C26311p.m95290j(this.f88374c)) {
            Log.m165389i("MediaCompressTask", "delete last temp file: " + this.f88374c);
            C26311p.m95291k(this.f88374c);
        }
        C34143c cVar = new C34143c(this, null);
        if (C26311p.m95290j(this.f88373b)) {
            Log.m165389i("MediaCompressTask", "compress result file has existed: " + this.f88373b);
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(cVar) {
                /* class com.ss.android.lark.chat.service.impl.p1681a.$$Lambda$c$ID72Q49sMJF7j4PMIejcWmwwbOo */
                public final /* synthetic */ RunnableC34139c.C34143c f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    RunnableC34139c.this.m132592a(this.f$1);
                }
            });
        } else {
            C57818b.m224421a(C29990c.m110930b().mo134528a(), this.f88376e.mo126678b(), this.f88372a, this.f88374c, cVar);
        }
        m132593b();
        Log.m165389i("MediaCompressTask", "finish compress task");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.a.c$c */
    public class C34143c implements AbstractC57817a<VideoCompressResult> {
        private C34143c() {
        }

        @Override // com.ss.android.lark.utils.ao.AbstractC57802a
        /* renamed from: a */
        public void mo126686a(float f) {
            RunnableC34139c.this.f88375d.mo126686a(f);
        }

        /* renamed from: a */
        public void onSuccess(VideoCompressResult videoCompressResult) {
            boolean b = m132614b(videoCompressResult);
            RunnableC34139c.this.mo126665a();
            if (b) {
                RunnableC34139c.this.f88375d.onSuccess(videoCompressResult);
            } else {
                onError(new ErrorResult("handle result error"));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Log.m165383e("MediaCompressTask", "compress video fail: " + errorResult.getException());
            if (C26311p.m95290j(RunnableC34139c.this.f88374c)) {
                C26311p.m95291k(RunnableC34139c.this.f88374c);
            }
            if (C26311p.m95290j(RunnableC34139c.this.f88373b)) {
                C26311p.m95291k(RunnableC34139c.this.f88373b);
            }
            RunnableC34139c.this.mo126665a();
            RunnableC34139c.this.f88375d.onError(errorResult);
        }

        /* renamed from: b */
        private boolean m132614b(VideoCompressResult videoCompressResult) {
            int i = C341401.f88377a[videoCompressResult.mo196120a().ordinal()];
            boolean z = true;
            if (i == 1) {
                Log.m165389i("MediaCompressTask", "re use last compress file");
            } else if (i == 5 || i == 6) {
                Log.m165389i("MediaCompressTask", "compress success: " + RunnableC34139c.this.f88374c);
                z = ao.m224308a(RunnableC34139c.this.f88374c, RunnableC34139c.this.f88373b);
                if (z) {
                    Log.m165389i("MediaCompressTask", "success rename: " + RunnableC34139c.this.f88373b);
                } else {
                    Log.m165389i("MediaCompressTask", "failed rename");
                }
            } else {
                Log.m165389i("MediaCompressTask", "copy origin video");
                z = C57818b.m224424b(RunnableC34139c.this.f88372a, RunnableC34139c.this.f88373b);
            }
            if (z) {
                C34276v.m132952a((((float) C26311p.m95281c(new File(RunnableC34139c.this.f88372a))) / 1024.0f) / 1024.0f, videoCompressResult);
            }
            return z;
        }

        /* synthetic */ C34143c(RunnableC34139c cVar, C341401 r2) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m132592a(C34143c cVar) {
        VideoCompressResult videoCompressResult = new VideoCompressResult(VideoCompressResult.ResultType.REUSE);
        videoCompressResult.mo196121a(C57818b.m224418a(this.f88372a, this.f88373b));
        cVar.onSuccess(videoCompressResult);
    }

    private RunnableC34139c(C34142b bVar) {
        this.f88376e = bVar;
        this.f88372a = bVar.mo126680c();
        this.f88373b = this.f88376e.mo126682d();
        this.f88374c = this.f88376e.mo126684e();
        this.f88375d = this.f88376e.mo126685f();
    }

    /* synthetic */ RunnableC34139c(C34142b bVar, C341401 r2) {
        this(bVar);
    }
}
