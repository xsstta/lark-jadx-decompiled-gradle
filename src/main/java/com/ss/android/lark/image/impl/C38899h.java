package com.ss.android.lark.image.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38812c;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.transform.AbstractC38925a;
import com.ss.android.lark.image.transform.C38926b;
import com.ss.android.lark.image.transform.CropTransformation;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.image.impl.h */
public class C38899h implements IRequestCreator {

    /* renamed from: A */
    private CropTransformation f99943A;

    /* renamed from: B */
    private C38926b f99944B;

    /* renamed from: C */
    private AbstractC38925a f99945C;

    /* renamed from: D */
    private Object f99946D;

    /* renamed from: E */
    private boolean f99947E;

    /* renamed from: a */
    protected AbstractC38812c f99948a;

    /* renamed from: b */
    protected Context f99949b;

    /* renamed from: c */
    protected Fragment f99950c;

    /* renamed from: d */
    protected android.app.Fragment f99951d;

    /* renamed from: e */
    public ImageView.ScaleType f99952e = ImageView.ScaleType.CENTER;

    /* renamed from: f */
    public ImageView f99953f;

    /* renamed from: g */
    private int f99954g = -1;

    /* renamed from: h */
    private int f99955h = -1;

    /* renamed from: i */
    private Drawable f99956i;

    /* renamed from: j */
    private int f99957j = -1;

    /* renamed from: k */
    private Drawable f99958k;

    /* renamed from: l */
    private int f99959l = -1;

    /* renamed from: m */
    private boolean f99960m;

    /* renamed from: n */
    private boolean f99961n;

    /* renamed from: o */
    private boolean f99962o;

    /* renamed from: p */
    private boolean f99963p;

    /* renamed from: q */
    private boolean f99964q;

    /* renamed from: r */
    private boolean f99965r;

    /* renamed from: s */
    private float f99966s = -1.0f;

    /* renamed from: t */
    private IRequestCreator f99967t;

    /* renamed from: u */
    private C38904a f99968u;

    /* renamed from: v */
    private DiskCacheStrategy f99969v;

    /* renamed from: w */
    private boolean f99970w = true;

    /* renamed from: x */
    private boolean f99971x;

    /* renamed from: y */
    private boolean f99972y;

    /* renamed from: z */
    private AbstractC38819j f99973z;

    /* renamed from: a */
    public C38899h centerCrop() {
        this.f99960m = true;
        return this;
    }

    /* renamed from: b */
    public C38899h fitCenter() {
        this.f99961n = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Fragment mo142430A() {
        return this.f99950c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public android.app.Fragment mo142431B() {
        return this.f99951d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo142432C() {
        return this.f99947E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo142449d() {
        return this.f99957j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo142450e() {
        return this.f99959l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo142451f() {
        return this.f99970w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo142452g() {
        return this.f99971x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo142453h() {
        return this.f99954g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo142454i() {
        return this.f99955h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Drawable mo142455j() {
        return this.f99956i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Drawable mo142456k() {
        return this.f99958k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo142457l() {
        return this.f99960m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo142458m() {
        return this.f99961n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo142459n() {
        return this.f99962o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo142460o() {
        return this.f99963p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo142461p() {
        return this.f99964q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo142462q() {
        return this.f99966s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public IRequestCreator mo142463r() {
        return this.f99967t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public AbstractC38817h mo142464s() {
        return this.f99968u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public DiskCacheStrategy mo142465t() {
        return this.f99969v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public ImageView mo142466u() {
        return this.f99953f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public CropTransformation mo142467v() {
        return this.f99943A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C38926b mo142468w() {
        return this.f99944B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public AbstractC38925a mo142469x() {
        return this.f99945C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public Object mo142470y() {
        return this.f99946D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public Context mo142471z() {
        return this.f99949b;
    }

    /* renamed from: a */
    public C38899h load(Object obj) {
        this.f99946D = m153527b(obj);
        return this;
    }

    /* renamed from: a */
    public C38899h transform(C38926b bVar) {
        this.f99944B = bVar;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public void pauseRequests() {
        this.f99948a.mo142234b(this);
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public void resumeRequests() {
        this.f99948a.mo142231a(this);
    }

    /* renamed from: D */
    private void m153526D() {
        this.f99968u = new C38904a();
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator asDrawable() {
        this.f99965r = true;
        this.f99964q = false;
        this.f99963p = false;
        this.f99962o = false;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator asFile() {
        this.f99963p = true;
        this.f99962o = false;
        this.f99965r = false;
        this.f99964q = false;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator asGif() {
        this.f99964q = true;
        this.f99963p = false;
        this.f99962o = false;
        this.f99965r = false;
        return this;
    }

    /* renamed from: c */
    public C38899h asBitmap() {
        this.f99962o = true;
        this.f99963p = false;
        this.f99965r = false;
        this.f99964q = false;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.image.impl.h$a */
    public class C38904a implements AbstractC38817h {

        /* renamed from: b */
        private AbstractC38817h f99982b;

        /* renamed from: a */
        public void mo142477a(AbstractC38817h hVar) {
            this.f99982b = hVar;
        }

        private C38904a() {
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
            if (C38899h.this.mo142466u() != null) {
                try {
                    C38899h.this.mo142466u().setScaleType(C38899h.this.f99952e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            AbstractC38817h hVar = this.f99982b;
            if (hVar != null) {
                return hVar.mo53861a(exc, obj, jVar, z);
            }
            return false;
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
            AbstractC38817h hVar = this.f99982b;
            if (hVar != null) {
                return hVar.mo53862a(obj, obj2, jVar, dataSource, z);
            }
            return false;
        }
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator dontAnimate(boolean z) {
        this.f99970w = z;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator isAsync(boolean z) {
        this.f99972y = z;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator onlyRetrieveFromCache(boolean z) {
        this.f99947E = z;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator setErrorScaleType(ImageView.ScaleType scaleType) {
        this.f99952e = scaleType;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public IRequestCreator skipMemoryCache(boolean z) {
        this.f99971x = z;
        return this;
    }

    /* renamed from: a */
    public C38899h thumbnail(float f) {
        this.f99966s = f;
        return this;
    }

    /* renamed from: b */
    public C38899h error(int i) {
        this.f99959l = i;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public <R> void into(AbstractC38819j<R> jVar) {
        this.f99973z = jVar;
        this.f99948a.mo142230a(jVar, this);
    }

    /* renamed from: a */
    public C38899h placeholder(int i) {
        this.f99957j = i;
        return this;
    }

    /* renamed from: b */
    public C38899h error(Drawable drawable) {
        this.f99958k = drawable;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public <R> void downloadOnly(AbstractC38819j<R> jVar) {
        this.f99973z = jVar;
        this.f99948a.mo142233b(jVar, this);
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public void into(final ImageView imageView) {
        this.f99953f = imageView;
        if (this.f99972y) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.image.impl.C38899h.RunnableC389001 */

                public void run() {
                    C389011 r0 = new C38818i<Drawable>() {
                        /* class com.ss.android.lark.image.impl.C38899h.RunnableC389001.C389011 */

                        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
                        /* renamed from: c */
                        public void mo142224c(final Drawable drawable) {
                            super.mo142224c(drawable);
                            mo142473a((Runnable) new Runnable() {
                                /* class com.ss.android.lark.image.impl.C38899h.RunnableC389001.C389011.RunnableC389032 */

                                public void run() {
                                    C38899h.this.f99953f.setImageDrawable(drawable);
                                }
                            });
                        }

                        /* renamed from: d */
                        public void mo49248a(final Drawable drawable) {
                            super.mo49248a((Object) drawable);
                            mo142473a((Runnable) new Runnable() {
                                /* class com.ss.android.lark.image.impl.C38899h.RunnableC389001.C389011.RunnableC389021 */

                                public void run() {
                                    C38899h.this.f99953f.setImageDrawable(drawable);
                                }
                            });
                        }

                        /* renamed from: a */
                        public void mo142473a(Runnable runnable) {
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                UICallbackExecutor.execute(runnable);
                            } else {
                                runnable.run();
                            }
                        }
                    };
                    r0.mo142250a(ImageLoader.getRequest(imageView));
                    C38899h.this.f99948a.mo142230a(r0, C38899h.this);
                    ImageLoader.setRequest(imageView, r0.mo142253c());
                }
            });
        } else {
            this.f99948a.mo142229a(imageView, this);
        }
    }

    /* renamed from: a */
    public C38899h placeholder(Drawable drawable) {
        this.f99956i = drawable;
        return this;
    }

    /* renamed from: a */
    public C38899h diskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
        this.f99969v = diskCacheStrategy;
        return this;
    }

    /* renamed from: b */
    private Object m153527b(Object obj) {
        File file;
        try {
            File file2 = null;
            if (obj instanceof File) {
                file2 = (File) obj;
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!TextUtils.isEmpty(str) && str.charAt(0) == '/') {
                        file = new File(str);
                        if (!file.isFile()) {
                        }
                    }
                } else if (obj instanceof Uri) {
                    Uri uri = (Uri) obj;
                    if (uri.toString().startsWith("file://")) {
                        file = new File(uri.getPath());
                        if (!file.isFile()) {
                        }
                    }
                }
                file2 = file;
            }
            if (file2 != null) {
                file2 = C36808a.m145199a(file2, false);
            }
            if (file2 != null) {
                if (obj instanceof File) {
                    return file2;
                }
                if (obj instanceof String) {
                    return file2.getPath();
                }
                if (obj instanceof Uri) {
                    return Uri.fromFile(file2);
                }
            }
        } catch (Exception e) {
            Log.m165389i("RequestCreator", "getDecryptObjectIfNeeded exception e =" + e);
            e.printStackTrace();
        }
        return obj;
    }

    /* renamed from: a */
    public C38899h thumbnail(IRequestCreator iRequestCreator) {
        this.f99967t = iRequestCreator;
        return this;
    }

    /* renamed from: a */
    public C38899h listener(AbstractC38817h hVar) {
        this.f99968u.mo142477a(hVar);
        return this;
    }

    /* renamed from: a */
    public C38899h transform(CropTransformation cropTransformation) {
        this.f99943A = cropTransformation;
        return this;
    }

    /* renamed from: a */
    public C38899h transform(AbstractC38925a aVar) {
        this.f99945C = aVar;
        return this;
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public File downloadOnly(int i, int i2) throws InterruptedException, ExecutionException {
        return this.f99948a.mo142232b(i, i2, this);
    }

    @Override // com.ss.android.lark.image.api.IRequestCreator
    public Bitmap getBitmap(int i, int i2) throws InterruptedException, ExecutionException {
        return this.f99948a.mo142225a(i, i2, this);
    }

    public C38899h(AbstractC38812c cVar, android.app.Fragment fragment) {
        this.f99948a = cVar;
        this.f99951d = fragment;
        m153526D();
    }

    /* renamed from: a */
    public C38899h override(int i, int i2) {
        this.f99954g = i;
        this.f99955h = i2;
        return this;
    }

    public C38899h(AbstractC38812c cVar, Context context) {
        this.f99948a = cVar;
        this.f99949b = context;
        m153526D();
    }

    public C38899h(AbstractC38812c cVar, Fragment fragment) {
        this.f99948a = cVar;
        this.f99950c = fragment;
        m153526D();
    }
}
