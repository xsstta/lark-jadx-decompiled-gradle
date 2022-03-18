package com.ss.android.lark.app.glide;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bumptech.glide.C2121d;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.engine.C2338d;
import com.bumptech.glide.load.engine.C2385w;
import com.bumptech.glide.load.engine.p088b.C2309d;
import com.bumptech.glide.load.engine.p088b.C2315g;
import com.bumptech.glide.load.engine.p088b.C2319j;
import com.bumptech.glide.load.engine.p088b.C2323k;
import com.bumptech.glide.manager.AbstractC2492c;
import com.bumptech.glide.manager.AbstractC2494d;
import com.bumptech.glide.p080a.AbstractC2099a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.app.glide.LarkGlideModule;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.impl.p1961a.C38844c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57881t;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class LarkGlideModule extends AbstractC2099a {
    @Override // com.bumptech.glide.p080a.AbstractC2099a
    /* renamed from: c */
    public boolean mo10292c() {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.glide.LarkGlideModule$a */
    public static class C28899a implements AbstractC2492c {

        /* renamed from: a */
        final AbstractC2492c.AbstractC2493a f72518a;

        /* renamed from: b */
        private volatile boolean f72519b;

        /* renamed from: a */
        private void m105728a() {
            this.f72519b = true;
        }

        @Override // com.bumptech.glide.manager.AbstractC2500i
        /* renamed from: h */
        public void mo10429h() {
        }

        @Override // com.bumptech.glide.manager.AbstractC2500i
        /* renamed from: f */
        public void mo10427f() {
            m105728a();
        }

        @Override // com.bumptech.glide.manager.AbstractC2500i
        /* renamed from: g */
        public void mo10428g() {
            m105729b();
        }

        /* renamed from: b */
        private void m105729b() {
            if (this.f72519b) {
                this.f72519b = false;
            }
        }

        C28899a(AbstractC2492c.AbstractC2493a aVar) {
            this.f72518a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102562a(boolean z) {
            if (this.f72519b) {
                this.f72518a.mo10445a(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.glide.LarkGlideModule$b */
    public static class C28900b implements AbstractC2494d, WSConnState.AbstractC29537a {

        /* renamed from: a */
        private volatile boolean f72520a;

        /* renamed from: b */
        private List<WeakReference<C28899a>> f72521b;

        private C28900b() {
            this.f72521b = new ArrayList();
        }

        @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
        /* renamed from: a */
        public void mo102563a(WSConnState.ConnState connState) {
            boolean z;
            if (connState == WSConnState.ConnState.Connected) {
                z = true;
            } else {
                z = false;
            }
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(z) {
                /* class com.ss.android.lark.app.glide.$$Lambda$LarkGlideModule$b$JUdkR973irhaYQIyJyS0P790HP8 */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    LarkGlideModule.C28900b.this.m105734a((LarkGlideModule.C28900b) this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m105734a(boolean z) {
            for (int size = this.f72521b.size() - 1; size >= 0; size--) {
                WeakReference<C28899a> weakReference = this.f72521b.get(size);
                if (weakReference == null || weakReference.get() == null) {
                    this.f72521b.remove(size);
                } else {
                    weakReference.get().mo102562a(z);
                }
            }
        }

        @Override // com.bumptech.glide.manager.AbstractC2494d
        /* renamed from: a */
        public AbstractC2492c mo11069a(Context context, AbstractC2492c.AbstractC2493a aVar) {
            if (!this.f72520a) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addConnStateListener(this);
                this.f72520a = true;
            }
            C28899a aVar2 = new C28899a(aVar);
            this.f72521b.add(new WeakReference<>(aVar2));
            return aVar2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ File m105721a(String str) {
        return new File(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ File m105722b(String str) {
        return new File(str);
    }

    @Override // com.bumptech.glide.p080a.AbstractC2100b, com.bumptech.glide.p080a.AbstractC2099a
    /* renamed from: a */
    public void mo10291a(final Context context, C2121d dVar) {
        int i;
        String H = C57881t.m224609H(context);
        String c = C26252ad.m94994c(context);
        if (TextUtils.isEmpty(c)) {
            c = "main";
        }
        boolean contains = c.contains("miniapp");
        if (contains) {
            c = "miniapp";
        }
        String str = H + File.separator + c + File.separator;
        C26311p.m95289i(str);
        Log.m165389i("LarkGlideModule", "Glide disk cache path is:" + str);
        if (C26252ad.m94993b(context)) {
            i = 157286400;
        } else if (contains) {
            i = 41943040;
        } else {
            i = 62914560;
        }
        String J = C57881t.m224611J(context);
        Log.m165389i("LarkGlideModule", "Glide rust avatar path is:" + J);
        C26311p.m95289i(J);
        dVar.mo10372a(new C2315g(new C2309d.AbstractC2310a(str) {
            /* class com.ss.android.lark.app.glide.$$Lambda$LarkGlideModule$PbCoB6XuxHBjtSj0RxhQOlw81A */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bumptech.glide.load.engine.p088b.C2309d.AbstractC2310a
            public final File getCacheDirectory() {
                return LarkGlideModule.m105722b(this.f$0);
            }
        }, new C2309d.AbstractC2310a(J) {
            /* class com.ss.android.lark.app.glide.$$Lambda$LarkGlideModule$vxP7FdbtGOvL39nHHW_PRmTiVA */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bumptech.glide.load.engine.p088b.C2309d.AbstractC2310a
            public final File getCacheDirectory() {
                return LarkGlideModule.m105721a(this.f$0);
            }
        }, (long) i, new C2323k.AbstractC2325a() {
            /* class com.ss.android.lark.app.glide.LarkGlideModule.C288981 */

            @Override // com.bumptech.glide.load.engine.p088b.C2323k.AbstractC2325a
            /* renamed from: a */
            public boolean mo10755a(AbstractC2265c cVar) {
                if (!(cVar instanceof C2338d) || !(((C2338d) cVar).mo10782a() instanceof AvatarImage)) {
                    return false;
                }
                return true;
            }

            @Override // com.bumptech.glide.load.engine.p088b.C2323k.AbstractC2325a
            /* renamed from: b */
            public boolean mo10756b(AbstractC2265c cVar) {
                if (!(cVar instanceof C2385w) || !(((C2385w) cVar).mo10892a() instanceof AvatarImage)) {
                    return false;
                }
                return true;
            }

            @Override // com.bumptech.glide.load.engine.p088b.C2323k.AbstractC2325a
            /* renamed from: c */
            public String mo10757c(AbstractC2265c cVar) {
                if (cVar instanceof C2338d) {
                    C2338d dVar = (C2338d) cVar;
                    if (dVar.mo10782a() instanceof AvatarImage) {
                        return C38844c.m153339a().mo142340a(context, (AvatarImage) dVar.mo10782a());
                    }
                }
                throw new IllegalArgumentException("avatar key invalid");
            }
        }));
        dVar.mo10375a(new C28900b());
        C2319j.C2320a aVar = new C2319j.C2320a(context);
        if (Build.VERSION.SDK_INT < 26) {
            aVar.mo10748c(0.2f);
            aVar.mo10749d(0.15f);
            aVar.mo10744a(1.5f);
            aVar.mo10747b(0.8f);
            aVar.mo10745a(2097152);
        } else {
            aVar.mo10748c(0.3f);
            aVar.mo10749d(0.2f);
            aVar.mo10744a(2.0f);
            aVar.mo10747b(1.0f);
            aVar.mo10745a(4194304);
        }
        dVar.mo10373a(aVar);
    }

    @Override // com.bumptech.glide.p080a.AbstractC2104f, com.bumptech.glide.p080a.AbstractC2102d
    public void registerComponents(Context context, ComponentCallbacks2C2115c cVar, Registry registry) {
        super.registerComponents(context, cVar, registry);
    }
}
