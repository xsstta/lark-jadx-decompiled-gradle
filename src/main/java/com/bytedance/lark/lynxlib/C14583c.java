package com.bytedance.lark.lynxlib;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.tools.SafelyLibraryLoader;
import com.bytedance.ies.bullet.service.base.api.BaseServiceContext;
import com.bytedance.ies.bullet.service.base.api.BaseServiceToken;
import com.bytedance.ies.bullet.service.base.impl.ServiceCenter;
import com.bytedance.ies.bullet.service.base.lynx.ILynxKitService;
import com.bytedance.kit.nglynx.LynxKitService;
import com.bytedance.kit.nglynx.debug.LynxDevtoolProcessor;
import com.bytedance.kit.nglynx.init.ILynxImageConfig;
import com.bytedance.kit.nglynx.init.LynxConfig;
import com.bytedance.lark.lynxlib.C14583c;
import com.bytedance.lynx.tasm.ui.imageloader.C19899c;
import com.lynx.tasm.AbstractC26887e;
import com.lynx.tasm.C26931o;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.analytics.AbstractC26555a;
import com.lynx.tasm.behavior.AbstractC26624b;
import com.lynx.tasm.behavior.AbstractC26674h;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.ui.background.AbstractC26752b;
import com.lynx.tasm.behavior.ui.canvas.C26758a;
import com.lynx.tasm.provider.AbstractC26934b;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.lark.lynxlib.c */
public class C14583c {

    /* renamed from: a */
    public static Handler f38623a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final AtomicBoolean f38624b = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lark.lynxlib.c$c */
    public static class C14594c extends ILynxImageConfig {
        C14594c() {
        }

        @Override // com.bytedance.kit.nglynx.init.ILynxImageConfig
        /* renamed from: a */
        public AbstractC26752b mo53741a() {
            return new C14580a();
        }

        @Override // com.bytedance.kit.nglynx.init.ILynxImageConfig
        /* renamed from: b */
        public List<C26622a> mo53742b() {
            return C14583c.m59061b().mo53784a();
        }
    }

    /* renamed from: a */
    public static String m59056a() {
        return LynxEnv.m96123e().mo94114s();
    }

    /* renamed from: b */
    public static AbstractC26624b m59061b() {
        C19899c.m72622a(new C19899c.AbstractC19905b() {
            /* class com.bytedance.lark.lynxlib.C14583c.C145874 */

            @Override // com.bytedance.lynx.tasm.ui.imageloader.C19899c.AbstractC19905b
            /* renamed from: a */
            public void mo53858a(Context context, String str, String str2, float f, float f2, C19899c.AbstractC19906c cVar, C19899c.AbstractC19904a aVar) {
                AbstractC26674h c;
                if (!(context instanceof AbstractC26684l) || (c = ((AbstractC26684l) context).mo94677c()) == null || (c instanceof C26931o)) {
                    C14583c.m59057a(context, str2, cVar, aVar, f, f2);
                    return;
                }
                Log.m165389i("CardEnv", "load image with ImageInterceptor");
                c.mo53708a(context, str, str2, f, f2, null, new AbstractC26674h.AbstractC26675a(context, aVar, str2, f, f2) {
                    /* class com.bytedance.lark.lynxlib.$$Lambda$c$4$Hiz0A47XpMPVBs4BCfS62S6Mt0 */
                    public final /* synthetic */ Context f$1;
                    public final /* synthetic */ C19899c.AbstractC19904a f$2;
                    public final /* synthetic */ String f$3;
                    public final /* synthetic */ float f$4;
                    public final /* synthetic */ float f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    @Override // com.lynx.tasm.behavior.AbstractC26674h.AbstractC26675a
                    public final void imageLoadCompletion(Object obj, Throwable th) {
                        C14583c.C145874.m59065a(C19899c.AbstractC19906c.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, obj, th);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m59065a(C19899c.AbstractC19906c cVar, Context context, C19899c.AbstractC19904a aVar, String str, float f, float f2, Object obj, Throwable th) {
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (cVar != null) {
                        bitmap = cVar.mo67408a(bitmap);
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                    bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                    aVar.mo67403a(bitmapDrawable, th);
                    return;
                }
                C14583c.m59057a(context, str, cVar, aVar, f, f2);
            }
        });
        return C19899c.m72621a();
    }

    /* renamed from: com.bytedance.lark.lynxlib.c$a */
    static class C14590a {

        /* renamed from: a */
        private final OkHttpClient f38631a;

        C14590a(OkHttpClient okHttpClient) {
            this.f38631a = okHttpClient;
        }

        /* renamed from: a */
        public byte[] mo53863a(String str) {
            try {
                Response execute = this.f38631a.newCall(new Request.Builder().url(str).build()).execute();
                if (execute.body() != null) {
                    return execute.body().bytes();
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lark.lynxlib.c$b */
    public static class C14591b extends AbstractC26934b {

        /* renamed from: a */
        public final C14590a f38632a;

        /* renamed from: b */
        private Executor f38633b;

        /* renamed from: c */
        private OkHttpClient f38634c;

        public C14591b(OkHttpClient okHttpClient) {
            this.f38634c = okHttpClient;
            this.f38632a = new C14590a(okHttpClient);
        }

        @Override // com.lynx.tasm.provider.AbstractC26934b
        /* renamed from: a */
        public void mo53786a(final String str, final AbstractC26934b.AbstractC26935a aVar) {
            if (this.f38633b == null) {
                this.f38633b = Executors.newSingleThreadExecutor();
            }
            this.f38633b.execute(new Runnable() {
                /* class com.bytedance.lark.lynxlib.C14583c.C14591b.RunnableC145921 */

                public void run() {
                    final byte[] a = C14591b.this.f38632a.mo53863a(str);
                    C14583c.f38623a.post(new Runnable() {
                        /* class com.bytedance.lark.lynxlib.C14583c.C14591b.RunnableC145921.RunnableC145931 */

                        public void run() {
                            if (a == null) {
                                aVar.mo94212a("card template data is null!");
                            } else {
                                aVar.mo94213a(a);
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: b */
    private static void m59062b(AbstractC14596e eVar) {
        C26758a.m97172a().mo95196a(eVar.mo50268a(), new AbstractC26887e() {
            /* class com.bytedance.lark.lynxlib.$$Lambda$c$lcFWmDMb6NNtMm9gIA3qPw9p_Bo */

            @Override // com.lynx.tasm.AbstractC26887e
            public final void loadLibrary(String str) {
                C14583c.m59059a(AbstractC14596e.this, str);
            }
        }, null, null);
        LynxEnv.m96123e().mo94086a(C26758a.m97172a());
    }

    /* renamed from: a */
    public static void m59058a(final AbstractC14596e eVar) {
        AtomicBoolean atomicBoolean = f38624b;
        if (!atomicBoolean.get()) {
            boolean z = true;
            atomicBoolean.compareAndSet(false, true);
            final Application a = eVar.mo50268a();
            if (!eVar.mo50272d() && !a.getPackageName().endsWith(".debug")) {
                z = false;
            }
            LynxKitService dVar = new LynxKitService(new LynxConfig.Builder(eVar.mo50268a()).mo53757a(z).mo53754a(new AbstractC26887e() {
                /* class com.bytedance.lark.lynxlib.C14583c.C145852 */

                @Override // com.lynx.tasm.AbstractC26887e
                public void loadLibrary(String str) throws UnsatisfiedLinkError {
                    SafelyLibraryLoader.loadLibrary(a, str);
                }
            }).mo53756a(XElements.m59085a(eVar)).mo53753a(new C14594c()).mo53755a(new C14591b(eVar.mo50273e())).mo53759b(false).mo53752a(new LynxDevtoolProcessor() {
                /* class com.bytedance.lark.lynxlib.C14583c.C145841 */
            }).mo53768j());
            ServiceCenter.m57996a().mo52636a(ILynxKitService.class, dVar);
            dVar.mo53790b(new BaseServiceToken("default_bid", new BaseServiceContext(eVar.mo50268a(), z)));
            LynxEnv.m96122a(new AbstractC26555a() {
                /* class com.bytedance.lark.lynxlib.C14583c.C145863 */

                @Override // com.lynx.tasm.analytics.AbstractC26555a
                /* renamed from: a */
                public void mo53856a(String str, JSONObject jSONObject) {
                    C14583c.m59060a(eVar, str, jSONObject);
                }

                @Override // com.lynx.tasm.analytics.AbstractC26555a
                /* renamed from: b */
                public void mo53857b(String str, JSONObject jSONObject) {
                    C14583c.m59060a(eVar, str, jSONObject);
                }
            });
            m59062b(eVar);
            Log.m165389i("CardEnv", "card init success, card version:" + m59056a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m59059a(AbstractC14596e eVar, String str) throws UnsatisfiedLinkError {
        SafelyLibraryLoader.loadLibrary(eVar.mo50268a(), str);
    }

    /* renamed from: a */
    public static void m59060a(AbstractC14596e eVar, String str, JSONObject jSONObject) {
        try {
            eVar.mo50269a(str, new JSONObject(jSONObject.toString()));
        } catch (JSONException e) {
            Log.m165386e("CardEnv", e);
        }
    }

    /* renamed from: a */
    public static void m59057a(Context context, final String str, C19899c.AbstractC19906c cVar, final C19899c.AbstractC19904a aVar, float f, float f2) {
        Log.m165389i("CardEnv", "load image with ImageLoader");
        int i = (int) f;
        int i2 = (int) f2;
        ImageLoader.with(context).load(str).dontAnimate(false).override(i, i2).transform(new C14595d(context, cVar)).listener(new AbstractC38817h<Object, Drawable>() {
            /* class com.bytedance.lark.lynxlib.C14583c.C145896 */

            /* renamed from: a */
            public boolean mo53862a(Drawable drawable, Object obj, AbstractC38819j<Drawable> jVar, DataSource dataSource, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.image.api.AbstractC38817h
            /* renamed from: a */
            public boolean mo53861a(Exception exc, Object obj, AbstractC38819j<Drawable> jVar, boolean z) {
                Log.m165383e("CardEnv", "onLoadFailed" + exc.getLocalizedMessage());
                aVar.mo67403a(null, exc);
                return false;
            }
        }).into(new C38818i<Drawable>(i, i2) {
            /* class com.bytedance.lark.lynxlib.C14583c.C145885 */

            /* renamed from: c_ */
            public void mo49248a(Drawable drawable) {
                super.mo49248a((Object) drawable);
                Log.m165389i("CardEnv", "onResourceReady:" + str);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                aVar.mo67403a(drawable, null);
            }
        });
    }
}
