package com.ss.android.lark.guide.landing.vc.mvp;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a;
import com.ss.android.lark.guide.landing.vc.p1929a.C38653a;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.guide.landing.vc.mvp.c */
public class C38667c extends BasePresenter<AbstractC38662a.AbstractC38663a, AbstractC38662a.AbstractC38664b, AbstractC38662a.AbstractC38664b.AbstractC38665a> {

    /* renamed from: a */
    public AbstractC38669b f99372a;

    /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.c$b */
    public interface AbstractC38669b {
        /* renamed from: a */
        Context mo141579a();

        /* renamed from: b */
        C38653a mo141580b();

        /* renamed from: c */
        void mo141581c();

        /* renamed from: d */
        void mo141582d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC38662a.AbstractC38664b.AbstractC38665a createViewDelegate() {
        return new C38672d();
    }

    /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.c$d */
    public class C38672d implements AbstractC38662a.AbstractC38664b.AbstractC38665a {
        @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b.AbstractC38665a
        /* renamed from: a */
        public String mo141585a() {
            C38653a b = C38667c.this.mo141593b();
            if (b != null) {
                return b.f99358b;
            }
            return null;
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b.AbstractC38665a
        /* renamed from: b */
        public int mo141586b() {
            C38653a b = C38667c.this.mo141593b();
            if (b != null) {
                return b.f99359c;
            }
            return R.drawable.illustration_initialization_function_vc;
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b.AbstractC38665a
        /* renamed from: c */
        public String mo141587c() {
            C38653a b = C38667c.this.mo141593b();
            if (b != null) {
                return b.f99360d;
            }
            return null;
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b.AbstractC38665a
        /* renamed from: d */
        public String mo141588d() {
            C38653a b = C38667c.this.mo141593b();
            if (b != null) {
                return b.f99361e;
            }
            return null;
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b.AbstractC38665a
        /* renamed from: e */
        public String mo141589e() {
            C38653a b = C38667c.this.mo141593b();
            if (b != null) {
                return b.f99362f;
            }
            return null;
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b.AbstractC38665a
        /* renamed from: f */
        public void mo141590f() {
            if (C38667c.this.f99372a != null) {
                C38667c.this.f99372a.mo141581c();
            }
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.AbstractC38662a.AbstractC38664b.AbstractC38665a
        /* renamed from: g */
        public void mo141591g() {
            if (C38667c.this.f99372a != null) {
                C38667c.this.f99372a.mo141582d();
            }
        }

        public C38672d() {
        }
    }

    /* renamed from: b */
    public C38653a mo141593b() {
        AbstractC38669b bVar = this.f99372a;
        if (bVar != null) {
            return bVar.mo141580b();
        }
        return null;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        AbstractC38669b bVar = this.f99372a;
        if (bVar != null) {
            m152550a(bVar.mo141579a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.c$c */
    public static class RunnableC38670c implements Runnable {

        /* renamed from: a */
        public WeakReference<AbstractC38662a.AbstractC38664b> f99373a;

        /* renamed from: b */
        private WeakReference<Context> f99374b;

        /* renamed from: c */
        private Bitmap f99375c;

        public void run() {
            final Bitmap a = C38668a.m152553a(this.f99374b.get(), this.f99375c, 25.0f);
            this.f99375c = null;
            if (a != null) {
                UICallbackExecutor.post(new Runnable() {
                    /* class com.ss.android.lark.guide.landing.vc.mvp.C38667c.RunnableC38670c.RunnableC386711 */

                    public void run() {
                        AbstractC38662a.AbstractC38664b bVar = RunnableC38670c.this.f99373a.get();
                        if (bVar != null) {
                            bVar.mo141584a(a);
                        }
                    }
                });
            }
        }

        public RunnableC38670c(Context context, Bitmap bitmap, AbstractC38662a.AbstractC38664b bVar) {
            this.f99374b = new WeakReference<>(context);
            this.f99373a = new WeakReference<>(bVar);
            this.f99375c = bitmap;
        }
    }

    /* renamed from: a */
    private void m152550a(Context context) {
        C38653a b;
        Bitmap bitmap;
        if (context != null && (b = mo141593b()) != null && (bitmap = b.f99357a) != null) {
            CoreThreadPool.getDefault().getCachedThreadPool().submit(new RunnableC38670c(context, bitmap, (AbstractC38662a.AbstractC38664b) getView()));
        }
    }

    public C38667c(AbstractC38662a.AbstractC38663a aVar, AbstractC38662a.AbstractC38664b bVar, AbstractC38669b bVar2) {
        super(aVar, bVar);
        this.f99372a = bVar2;
    }

    /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.c$a */
    private static class C38668a {
        /* renamed from: a */
        public static Bitmap m152553a(Context context, Bitmap bitmap, float f) {
            String str;
            if (!(context == null || bitmap == null)) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 0.5f), (int) (((float) bitmap.getHeight()) * 0.5f), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(context);
                    Bitmap.Config config = bitmap.getConfig();
                    if (config == Bitmap.Config.ARGB_8888) {
                        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                        create2.setRadius(f);
                        create2.setInput(createFromBitmap);
                        create2.forEach(createFromBitmap2);
                        createFromBitmap2.copyTo(createBitmap);
                        create.destroy();
                        return createBitmap;
                    }
                    if (("not support bitmap " + config) != null) {
                        str = config.name();
                    } else {
                        str = "null";
                    }
                    Log.m165383e("BlurHelper", str);
                    return null;
                } catch (Exception e) {
                    Log.m165384e("BlurHelper", "blur image error", e);
                }
            }
            return null;
        }
    }
}
