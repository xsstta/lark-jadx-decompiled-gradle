package com.ss.android.lark.image.impl;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2266d;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import com.bumptech.glide.load.resource.bitmap.AbstractC2429f;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.AbstractC2533d;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.C2537g;
import com.bumptech.glide.request.p095a.AbstractC2520h;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p095a.C2517e;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.image.api.AbstractC38812c;
import com.ss.android.lark.image.api.AbstractC38814e;
import com.ss.android.lark.image.api.AbstractC38815f;
import com.ss.android.lark.image.api.AbstractC38816g;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.C38811b;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.p1958a.C38807d;
import com.ss.android.lark.image.transform.AbstractC38925a;
import com.ss.android.lark.image.transform.C38926b;
import com.ss.android.lark.image.transform.CropTransformation;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import jp.wasabeef.glide.transformations.C69024b;
import jp.wasabeef.glide.transformations.CropTransformation;

/* renamed from: com.ss.android.lark.image.impl.a */
public class C38828a implements AbstractC38812c {
    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: a */
    public void mo142228a(View view) {
        if (view != null) {
            Context context = view.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isDestroyed()) {
                ComponentCallbacks2C2115c.m9141a(view).mo10416a(view);
            }
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: a */
    public void mo142229a(ImageView imageView, C38899h hVar) {
        Object obj;
        C38807d.m153155a(imageView.getContext());
        C38807d.m153156b(imageView.getContext());
        C2124f e = m153257e(hVar);
        if (e != null) {
            e.mo10399a(imageView);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("requestBuilder is null, return, request model is:");
        if (hVar == null) {
            obj = "null";
        } else {
            obj = hVar.mo142470y();
        }
        sb.append(obj);
        Log.m165387e("GlideImageLoader", (Throwable) new Exception(sb.toString()), true);
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: a */
    public void mo142230a(final AbstractC38819j jVar, C38899h hVar) {
        C38807d.m153155a(hVar.mo142471z());
        C38807d.m153156b(hVar.mo142471z());
        if (hVar.mo142431B() != null && hVar.mo142431B().getActivity() == null) {
            Log.m165383e("GlideImageLoader", "getFragment activity is null");
        } else if (hVar.mo142430A() == null || hVar.mo142430A().getActivity() != null) {
            C2124f e = m153257e(hVar);
            if (e == null) {
                Log.m165383e("GlideImageLoader", "async into , request is null, return");
            } else if (jVar instanceof C38811b) {
                final C38811b bVar = (C38811b) jVar;
                e.mo10397a((AbstractC2522j) new C2517e(bVar.mo142223a()) {
                    /* class com.ss.android.lark.image.impl.C38828a.C388376 */

                    @Override // com.bumptech.glide.request.p095a.AbstractC2518f, com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2523k, com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: a */
                    public void mo11036a(Drawable drawable) {
                        super.mo11036a(drawable);
                        bVar.mo142224c(drawable);
                    }

                    @Override // com.bumptech.glide.request.p095a.AbstractC2518f, com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: b */
                    public void mo10444b(Drawable drawable) {
                        super.mo10444b(drawable);
                        bVar.mo49247a(drawable);
                    }

                    @Override // com.bumptech.glide.request.p095a.AbstractC2518f, com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2523k, com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: c */
                    public void mo11172c(Drawable drawable) {
                        super.mo11172c(drawable);
                        bVar.mo99365b(drawable);
                    }

                    /* renamed from: a */
                    public void mo10442a(Drawable drawable, AbstractC2529b<? super Drawable> bVar) {
                        super.mo10442a((Object) drawable, (AbstractC2529b) bVar);
                        bVar.mo49248a((Object) drawable);
                    }
                });
            } else {
                C388387 r0 = new AbstractC2520h() {
                    /* class com.ss.android.lark.image.impl.C38828a.C388387 */

                    @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
                    /* renamed from: f */
                    public void mo10427f() {
                    }

                    @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
                    /* renamed from: g */
                    public void mo10428g() {
                    }

                    @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
                    /* renamed from: h */
                    public void mo10429h() {
                    }

                    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: a */
                    public void mo11036a(Drawable drawable) {
                        jVar.mo142224c(drawable);
                    }

                    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: b */
                    public void mo10444b(Drawable drawable) {
                        jVar.mo49247a(drawable);
                    }

                    @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: c */
                    public void mo11172c(Drawable drawable) {
                        jVar.mo99365b(drawable);
                    }

                    @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                    /* renamed from: a */
                    public void mo10442a(Object obj, AbstractC2529b bVar) {
                        jVar.mo49248a(obj);
                    }
                };
                r0.mo11171a(jVar.mo142253c());
                e.mo10397a((AbstractC2522j) r0);
                jVar.mo142250a(r0.mo11170a());
            }
        } else {
            Log.m165383e("GlideImageLoader", "getSupportFragment activity is null");
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: a */
    public void mo142231a(C38899h hVar) {
        ComponentCallbacks2C2126g f = m153258f(hVar);
        if (f != null) {
            f.mo10426e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.image.impl.a$2 */
    public static /* synthetic */ class C388302 {

        /* renamed from: a */
        static final /* synthetic */ int[] f99789a;

        /* renamed from: b */
        static final /* synthetic */ int[] f99790b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.ss.android.lark.image.transform.CropTransformation$CropType[] r0 = com.ss.android.lark.image.transform.CropTransformation.CropType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.image.impl.C38828a.C388302.f99790b = r0
                r1 = 1
                com.ss.android.lark.image.transform.CropTransformation$CropType r2 = com.ss.android.lark.image.transform.CropTransformation.CropType.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.image.impl.C38828a.C388302.f99790b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.image.transform.CropTransformation$CropType r3 = com.ss.android.lark.image.transform.CropTransformation.CropType.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.lark.image.impl.C38828a.C388302.f99790b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.image.transform.CropTransformation$CropType r4 = com.ss.android.lark.image.transform.CropTransformation.CropType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.ss.android.lark.image.api.DiskCacheStrategy[] r3 = com.ss.android.lark.image.api.DiskCacheStrategy.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.lark.image.impl.C38828a.C388302.f99789a = r3
                com.ss.android.lark.image.api.DiskCacheStrategy r4 = com.ss.android.lark.image.api.DiskCacheStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.lark.image.impl.C38828a.C388302.f99789a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.android.lark.image.api.DiskCacheStrategy r3 = com.ss.android.lark.image.api.DiskCacheStrategy.RESULT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.ss.android.lark.image.impl.C38828a.C388302.f99789a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.ss.android.lark.image.api.DiskCacheStrategy r1 = com.ss.android.lark.image.api.DiskCacheStrategy.ALL     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = com.ss.android.lark.image.impl.C38828a.C388302.f99789a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.ss.android.lark.image.api.DiskCacheStrategy r1 = com.ss.android.lark.image.api.DiskCacheStrategy.NONE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.image.impl.C38828a.C388302.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AbstractC2533d m153245a(final AbstractC38816g gVar) {
        return new AbstractC2533d() {
            /* class com.ss.android.lark.image.impl.C38828a.C388324 */

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: c */
            public void mo11198c() {
                gVar.mo142249g();
            }

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: a */
            public void mo11194a() {
                AbstractC38816g gVar = gVar;
                if (gVar != null) {
                    gVar.mo142242a();
                }
            }

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: b */
            public void mo11197b() {
                AbstractC38816g gVar = gVar;
                if (gVar != null) {
                    gVar.mo142244b();
                }
            }

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: d */
            public boolean mo11199d() {
                AbstractC38816g gVar = gVar;
                if (gVar == null) {
                    return false;
                }
                return gVar.mo142245c();
            }

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: e */
            public boolean mo11200e() {
                AbstractC38816g gVar = gVar;
                if (gVar == null) {
                    return false;
                }
                return gVar.mo142246d();
            }

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: f */
            public boolean mo11201f() {
                AbstractC38816g gVar = gVar;
                if (gVar == null) {
                    return false;
                }
                return gVar.mo142248f();
            }

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: g */
            public boolean mo11106g() {
                AbstractC38816g gVar = gVar;
                if (gVar == null) {
                    return false;
                }
                return gVar.mo142247e();
            }

            @Override // com.bumptech.glide.request.AbstractC2533d
            /* renamed from: a */
            public boolean mo11196a(AbstractC2533d dVar) {
                AbstractC38816g gVar = gVar;
                if (gVar == null) {
                    return false;
                }
                return gVar.mo142243a(dVar);
            }
        };
    }

    /* renamed from: a */
    public static AbstractC38816g m153246a(final AbstractC2533d dVar) {
        return new AbstractC38816g() {
            /* class com.ss.android.lark.image.impl.C38828a.C388313 */

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: a */
            public void mo142242a() {
                dVar.mo11194a();
            }

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: b */
            public void mo142244b() {
                dVar.mo11197b();
            }

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: c */
            public boolean mo142245c() {
                return dVar.mo11199d();
            }

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: d */
            public boolean mo142246d() {
                return dVar.mo11200e();
            }

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: e */
            public boolean mo142247e() {
                return dVar.mo11106g();
            }

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: f */
            public boolean mo142248f() {
                return dVar.mo11201f();
            }

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: g */
            public void mo142249g() {
                dVar.mo11198c();
            }

            @Override // com.ss.android.lark.image.api.AbstractC38816g
            /* renamed from: a */
            public boolean mo142243a(AbstractC2533d dVar) {
                return dVar.mo11196a(dVar);
            }
        };
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: b */
    public void mo142234b(C38899h hVar) {
        ComponentCallbacks2C2126g f = m153258f(hVar);
        if (f != null) {
            f.mo10422b();
        }
    }

    /* renamed from: a */
    public static AbstractC38819j m153247a(final AbstractC2522j jVar) {
        return new AbstractC38819j() {
            /* class com.ss.android.lark.image.impl.C38828a.C388291 */

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: a */
            public void mo142250a(AbstractC2533d dVar) {
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: c */
            public AbstractC2533d mo142253c() {
                return null;
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: b */
            public AbstractC38816g mo142252b() {
                return C38828a.m153246a(jVar.mo11170a());
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: a */
            public void mo49247a(Drawable drawable) {
                jVar.mo10444b(drawable);
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: b */
            public void mo99365b(Drawable drawable) {
                jVar.mo11172c(drawable);
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: c */
            public void mo142224c(Drawable drawable) {
                jVar.mo11036a(drawable);
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: a */
            public void mo142251a(AbstractC38816g gVar) {
                jVar.mo11171a(C38828a.m153245a(gVar));
            }

            @Override // com.ss.android.lark.image.api.AbstractC38819j
            /* renamed from: a */
            public void mo49248a(Object obj) {
                jVar.mo10442a(obj, null);
            }
        };
    }

    /* renamed from: d */
    private C2124f m153255d(C38899h hVar) {
        ComponentCallbacks2C2126g f = m153258f(hVar);
        if (f == null) {
            return null;
        }
        if (hVar.mo142459n()) {
            return f.mo10430i();
        }
        if (hVar.mo142460o()) {
            return f.mo10434m();
        }
        if (hVar.mo142461p()) {
            return f.mo10431j();
        }
        return f.mo10432k();
    }

    /* renamed from: e */
    private C2124f m153257e(C38899h hVar) {
        C2124f d = m153255d(hVar);
        if (d == null) {
            Log.m165383e("GlideImageLoader", "getRequest is null, model is:" + hVar.mo142470y());
            return null;
        }
        m153251b(hVar, d);
        m153256d(hVar, d);
        m153248a(hVar, d);
        m153254c(hVar, d);
        d.mo10395a(hVar.mo142470y());
        return d;
    }

    /* renamed from: a */
    private boolean m153249a(Fragment fragment) {
        Activity activity = fragment.getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m153252b(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return false;
            }
            return true;
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                Log.m165379d("GlideImageLoader", "context is ContextWrapper, base context is:" + contextWrapper.getBaseContext());
                return m153252b(contextWrapper.getBaseContext());
            }
        }
        return true;
    }

    /* renamed from: f */
    private ComponentCallbacks2C2126g m153258f(C38899h hVar) {
        Context z = hVar.mo142471z();
        androidx.fragment.app.Fragment A = hVar.mo142430A();
        Fragment B = hVar.mo142431B();
        ComponentCallbacks2C2126g gVar = null;
        if (z != null) {
            if (m153252b(z)) {
                gVar = ComponentCallbacks2C2115c.m9151c(z);
            } else {
                Log.m165383e("GlideImageLoader", "check context invalidate, request manager is null");
            }
        } else if (A != null) {
            if (m153250a(A)) {
                FragmentActivity activity = A.getActivity();
                if (activity != null) {
                    gVar = ComponentCallbacks2C2115c.m9139a((Activity) activity);
                } else {
                    Log.m165383e("GlideImageLoader", "fragment activity is null, request manager is null");
                }
            } else {
                Log.m165383e("GlideImageLoader", "support fragment context invalidate, request manager is null");
            }
        } else if (B == null) {
            Log.m165383e("GlideImageLoader", "context && fragment is null, request manager is null");
        } else if (m153249a(B)) {
            gVar = ComponentCallbacks2C2115c.m9140a(B);
        } else {
            Log.m165383e("GlideImageLoader", "fragment context invalidate, request manager is null");
        }
        if (hVar != null) {
            return gVar;
        }
        throw new RuntimeException("cannot create imageloader context is null");
    }

    /* renamed from: a */
    private boolean m153250a(androidx.fragment.app.Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private C2537g m153253c(C38899h hVar) {
        C2537g gVar = new C2537g();
        if ((hVar.mo142453h() >= 0 && hVar.mo142454i() >= 0) || (hVar.mo142453h() == Integer.MIN_VALUE && hVar.mo142454i() == Integer.MIN_VALUE)) {
            gVar.mo11144c(hVar.mo142453h(), hVar.mo142454i());
        }
        if (hVar.mo142457l()) {
            gVar.mo11150h();
        }
        if (hVar.mo142458m()) {
            gVar.mo11153j();
        }
        Drawable j = hVar.mo142455j();
        if (j != null) {
            gVar.mo11125a(j);
        }
        int d = hVar.mo142449d();
        if (d >= 0) {
            gVar.mo11123a(d);
        }
        Drawable k = hVar.mo142456k();
        if (k != null) {
            gVar.mo11140b(k);
        }
        int e = hVar.mo142450e();
        if (e >= 0) {
            gVar.mo11143c(e);
        }
        if (hVar.mo142451f()) {
            gVar.mo11157n();
        }
        gVar.mo11145c(hVar.mo142452g());
        gVar.mo11124a(0L);
        if (hVar.mo142432C()) {
            gVar = (C2537g) gVar.mo11142b(true);
        }
        DiskCacheStrategy t = hVar.mo142465t();
        if (t != null) {
            AbstractC2354j jVar = AbstractC2354j.f7811a;
            int i = C388302.f99789a[t.ordinal()];
            if (i == 1) {
                jVar = AbstractC2354j.f7813c;
            } else if (i == 2) {
                jVar = AbstractC2354j.f7814d;
            } else if (i == 3) {
                jVar = AbstractC2354j.f7811a;
            } else if (i == 4) {
                jVar = AbstractC2354j.f7812b;
            }
            gVar.mo11129a(jVar);
        }
        return gVar;
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: a */
    public void mo142226a(Context context) {
        ComponentCallbacks2C2115c.m9149b(context).mo10359f();
    }

    /* renamed from: d */
    private void m153256d(C38899h hVar, C2124f fVar) {
        final AbstractC38817h s = hVar.mo142464s();
        if (s != null) {
            fVar.mo10392a((AbstractC2536f) new AbstractC2536f() {
                /* class com.ss.android.lark.image.impl.C38828a.AnonymousClass10 */

                @Override // com.bumptech.glide.request.AbstractC2536f
                /* renamed from: a */
                public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j jVar, boolean z) {
                    return s.mo53861a(glideException, obj, C38828a.m153247a(jVar), z);
                }

                @Override // com.bumptech.glide.request.AbstractC2536f
                /* renamed from: a */
                public boolean mo11205a(Object obj, Object obj2, AbstractC2522j jVar, DataSource dataSource, boolean z) {
                    return s.mo53862a(obj, obj2, C38828a.m153247a(jVar), com.ss.android.lark.image.api.DataSource.fromOrdinal(dataSource.ordinal()), z);
                }
            });
        }
    }

    /* renamed from: b */
    private void m153251b(C38899h hVar, C2124f fVar) {
        hVar.mo142462q();
        if (hVar.mo142463r() != null) {
            fVar.mo10390a(m153257e((C38899h) hVar.mo142463r()));
        }
    }

    /* renamed from: a */
    private void m153248a(C38899h hVar, C2124f fVar) {
        fVar.mo10391a((AbstractC2510a<?>) m153253c(hVar));
    }

    /* renamed from: c */
    private void m153254c(C38899h hVar, C2124f fVar) {
        ArrayList arrayList = new ArrayList();
        CropTransformation v = hVar.mo142467v();
        if (v != null) {
            CropTransformation.CropType cropType = CropTransformation.CropType.CENTER;
            int i = C388302.f99790b[v.mo142513c().ordinal()];
            if (i == 1) {
                cropType = CropTransformation.CropType.TOP;
            } else if (i == 2) {
                cropType = CropTransformation.CropType.BOTTOM;
            } else if (i == 3) {
                cropType = CropTransformation.CropType.CENTER;
            }
            arrayList.add(new jp.wasabeef.glide.transformations.CropTransformation(v.mo142511a(), v.mo142512b(), cropType));
        }
        C38926b w = hVar.mo142468w();
        if (w != null) {
            arrayList.add(new C69024b(w.mo142515a(), w.mo142516b()));
        }
        final AbstractC38925a x = hVar.mo142469x();
        if (x != null) {
            arrayList.add(new AbstractC2429f() {
                /* class com.ss.android.lark.image.impl.C38828a.C388409 */

                @Override // com.bumptech.glide.load.AbstractC2265c
                public void updateDiskCacheKey(MessageDigest messageDigest) {
                    x.mo53868a(messageDigest);
                }

                /* access modifiers changed from: protected */
                @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2429f
                /* renamed from: a */
                public Bitmap mo10942a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
                    return (Bitmap) x.mo53867a(bitmap, i, i2);
                }
            });
        }
        if (!arrayList.isEmpty()) {
            fVar.mo11130a((AbstractC2393i<Bitmap>) new C2266d(arrayList));
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: b */
    public void mo142233b(final AbstractC38819j jVar, C38899h hVar) {
        hVar.asFile();
        C2124f e = m153257e(hVar);
        C388398 r0 = new AbstractC2520h() {
            /* class com.ss.android.lark.image.impl.C38828a.C388398 */

            @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public void mo11036a(Drawable drawable) {
            }

            @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
            /* renamed from: f */
            public void mo10427f() {
            }

            @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
            /* renamed from: g */
            public void mo10428g() {
            }

            @Override // com.bumptech.glide.manager.AbstractC2500i, com.bumptech.glide.request.p095a.AbstractC2511a
            /* renamed from: h */
            public void mo10429h() {
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public AbstractC2533d mo11170a() {
                return C38828a.m153245a(jVar.mo142252b());
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: b */
            public void mo10444b(Drawable drawable) {
                jVar.mo49247a(drawable);
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: c */
            public void mo11172c(Drawable drawable) {
                jVar.mo99365b(drawable);
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public void mo11171a(AbstractC2533d dVar) {
                jVar.mo142251a(C38828a.m153246a(dVar));
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public void mo10442a(Object obj, AbstractC2529b bVar) {
                Log.m165379d("GlideImageLoader", "onResourceReady resource " + obj.getClass());
                jVar.mo49248a(obj);
            }
        };
        if (e != null) {
            e.mo10402b((AbstractC2522j) r0);
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: b */
    public File mo142232b(int i, int i2, C38899h hVar) {
        try {
            C2124f e = m153257e(hVar);
            if (e != null) {
                return (File) e.mo10405b(i, i2).get();
            }
            return null;
        } catch (InterruptedException unused) {
            Log.m165383e("GlideImageLoader", "download image failed, ");
            return null;
        } catch (ExecutionException unused2) {
            Log.m165383e("GlideImageLoader", "download image failed, ");
            return null;
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: a */
    public Bitmap mo142225a(int i, int i2, C38899h hVar) {
        try {
            hVar.asBitmap();
            C2124f e = m153257e(hVar);
            if (e != null) {
                Object obj = e.mo10400a(i, i2).get();
                if (obj instanceof Bitmap) {
                    return (Bitmap) obj;
                }
            }
            return null;
        } catch (InterruptedException e2) {
            Log.m165384e("GlideImageLoader", "getBitmap failed", e2);
            return null;
        } catch (ExecutionException e3) {
            Log.m165384e("GlideImageLoader", "getBitmap failed", e3);
            return null;
        }
    }

    @Override // com.ss.android.lark.image.api.AbstractC38812c
    /* renamed from: a */
    public <T extends AbstractC2265c, Y> void mo142227a(Context context, Class<T> cls, Class<Y> cls2, final AbstractC38815f<T, Y> fVar) {
        ComponentCallbacks2C2115c.m9149b(context).mo10361h().mo10317c(cls, cls2, new AbstractC2235o<T, Y>() {
            /* class com.ss.android.lark.image.impl.C38828a.C388335 */

            @Override // com.bumptech.glide.load.p085b.AbstractC2235o
            /* renamed from: a */
            public void mo10539a() {
                fVar.mo142241a();
            }

            @Override // com.bumptech.glide.load.p085b.AbstractC2235o
            /* renamed from: a */
            public AbstractC2233n<T, Y> mo10538a(C2241r rVar) {
                final AbstractC38814e a = fVar.mo142240a(rVar);
                return new AbstractC2233n<T, Y>() {
                    /* class com.ss.android.lark.image.impl.C38828a.C388335.C388341 */

                    /* renamed from: a */
                    public boolean mo10536a(T t) {
                        return true;
                    }

                    /* renamed from: a */
                    public AbstractC2233n.C2234a<Y> mo10534a(T t, int i, int i2, C2390f fVar) {
                        final AbstractC38809a a = a.mo142239a(t, i, i2);
                        return new AbstractC2233n.C2234a<>(t, new AbstractC2147d<Y>() {
                            /* class com.ss.android.lark.image.impl.C38828a.C388335.C388341.C388351 */

                            @Override // com.bumptech.glide.load.p083a.AbstractC2147d
                            /* renamed from: a */
                            public Class<Y> mo10481a() {
                                return a.mo142219c();
                            }

                            @Override // com.bumptech.glide.load.p083a.AbstractC2147d
                            /* renamed from: b */
                            public void mo10489b() {
                                a.mo142216a();
                            }

                            @Override // com.bumptech.glide.load.p083a.AbstractC2147d
                            /* renamed from: c */
                            public void mo10490c() {
                                a.mo142218b();
                            }

                            @Override // com.bumptech.glide.load.p083a.AbstractC2147d
                            /* renamed from: d */
                            public DataSource mo10491d() {
                                return a.mo142220d();
                            }

                            @Override // com.bumptech.glide.load.p083a.AbstractC2147d
                            /* renamed from: a */
                            public void mo10488a(Priority priority, final AbstractC2147d.AbstractC2148a<? super Y> aVar) {
                                a.mo142217a(priority, new AbstractC38809a.AbstractC38810a<Y>() {
                                    /* class com.ss.android.lark.image.impl.C38828a.C388335.C388341.C388351.C388361 */

                                    @Override // com.ss.android.lark.image.api.AbstractC38809a.AbstractC38810a
                                    /* renamed from: a */
                                    public void mo142221a(Exception exc) {
                                        aVar.mo10502a(exc);
                                    }

                                    @Override // com.ss.android.lark.image.api.AbstractC38809a.AbstractC38810a
                                    /* renamed from: a */
                                    public void mo142222a(Y y) {
                                        aVar.mo10503a((Object) y);
                                    }
                                });
                            }
                        });
                    }
                };
            }
        });
    }
}
