package com.ss.android.lark.watermark;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.p1405e.AbstractC29559a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.watermark.C58222b;
import com.ss.android.lark.watermark.C58275e;
import com.ss.android.lark.watermark.IWatermarkModuleDependency;
import com.ss.android.lark.watermark.Watermark;
import com.ss.android.lark.watermark.core.IAttachResultCallback;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.interceptor.LoginInterceptor;
import com.ss.android.lark.watermark.interceptor.WatermarkInterceptor;
import com.ss.android.lark.watermark.mysterious.MysteriousWatermarkInfo;
import com.ss.android.lark.watermark.mysterious.MysteriousWatermarkInfoService;
import com.ss.android.lark.watermark.p2924a.AbstractC58221a;
import com.ss.android.lark.watermark.p2925b.C58244b;
import com.ss.android.lark.watermark.p2928e.AbstractC58277a;
import com.ss.android.lark.watermark.p2928e.AbstractC58279b;
import com.ss.android.lark.watermark.p2928e.C58281d;
import com.ss.android.lark.watermark.p2928e.C58285e;
import com.ss.android.lark.watermark.p2929f.AbstractC58289c;
import com.ss.android.lark.watermark.p2929f.C58286a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.watermark.b */
public class C58222b {

    /* renamed from: a */
    public AbstractC58277a f143158a;

    /* renamed from: b */
    public final AbstractC58279b f143159b;

    /* renamed from: c */
    public final IWatermarkModuleDependency.AbstractC58209b f143160c = C58275e.m225982a().mo177769f();

    /* renamed from: d */
    public final Context f143161d = C58275e.m225982a().mo177764a();

    /* renamed from: e */
    public final AtomicBoolean f143162e;

    /* renamed from: f */
    public final Map<AbstractC29559a, Object> f143163f = new ConcurrentHashMap();

    /* renamed from: g */
    private final IWatermarkModuleDependency.AbstractC58211d f143164g = C58275e.m225982a().mo177765b();

    /* renamed from: h */
    private WatermarkInterceptor f143165h;

    /* renamed from: a */
    public void mo197260a(final C58275e.AbstractC58276a aVar) {
        Log.m165389i("WatermarkController", "init watermark");
        C58248c.m225948a();
        Watermark.inst().init(this.f143161d);
        this.f143158a = m225871d();
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.watermark.C58222b.RunnableC582324 */

            public void run() {
                C58222b.this.mo197258a(new AbstractC58242a(null) {
                    /* class com.ss.android.lark.watermark.C58222b.RunnableC582324.C582331 */

                    @Override // com.ss.android.lark.watermark.C58222b.AbstractC58242a
                    /* renamed from: a */
                    public void mo197269a() {
                        if (aVar != null) {
                            aVar.mo133339a();
                        }
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo197261a() {
        MysteriousWatermarkInfo a;
        AbstractC58277a aVar = this.f143158a;
        if (!(aVar instanceof MysteriousWatermarkInfoService) || (a = ((MysteriousWatermarkInfoService) aVar).mo197398a()) == null) {
            return false;
        }
        return a.mo197390c();
    }

    /* renamed from: a */
    public void mo197258a(final AbstractC58242a aVar) {
        if (!this.f143165h.mo197338a(aVar.f143212h)) {
            final int a = this.f143159b.mo197378a();
            StringBuilder sb = new StringBuilder();
            sb.append("fetch watermark strategy = isGlobal: ");
            sb.append(a == 0);
            Log.m165389i("WatermarkController", sb.toString());
            if (aVar != null) {
                aVar.mo197281a(a);
            }
            this.f143158a.mo197376a(new AbstractC58277a.AbstractC58278a() {
                /* class com.ss.android.lark.watermark.C58222b.AnonymousClass10 */

                @Override // com.ss.android.lark.watermark.p2929f.AbstractC58289c
                /* renamed from: a */
                public void mo197241a(C58286a aVar) {
                }

                /* renamed from: a */
                public void mo197242a(WatermarkInfo watermarkInfo) {
                    boolean z;
                    if (a == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    watermarkInfo.setGlobalWatermark(z);
                    C58222b.this.mo197259a(watermarkInfo);
                    C58222b.this.f143162e.set(true);
                    AbstractC58242a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo197282a(watermarkInfo);
                        aVar.mo197269a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo197259a(final WatermarkInfo watermarkInfo) {
        Watermark.inst().update(watermarkInfo);
        if (C26252ad.m94993b(this.f143161d)) {
            C57744a.m224104a().putString("KEY_WATERMARKINFO", JSONObject.toJSONString(watermarkInfo));
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.watermark.C58222b.AnonymousClass11 */

                public void run() {
                    for (AbstractC29559a aVar : C58222b.this.f143163f.keySet()) {
                        if (aVar != null) {
                            aVar.mo105734a(watermarkInfo);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo197257a(AbstractC29559a aVar) {
        if (aVar != null) {
            this.f143163f.put(aVar, new Object());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ boolean m225876i() {
        return this.f143164g.mo177771b();
    }

    /* renamed from: b */
    public int mo197262b() {
        return this.f143159b.mo197379b();
    }

    /* renamed from: g */
    private void m225874g() {
        Watermark.inst().setWatermarkCompressor(new AbstractC58221a() {
            /* class com.ss.android.lark.watermark.C58222b.C582231 */

            @Override // com.ss.android.lark.watermark.p2924a.AbstractC58221a
            /* renamed from: a */
            public void mo197247a(Context context, final File file, final AbstractC58289c<File> cVar) {
                C58222b.this.f143160c.mo177777a(context, file, new IGetDataCallback<File>() {
                    /* class com.ss.android.lark.watermark.C58222b.C582231.C582241 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        AbstractC58289c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo197241a(new C58286a(errorResult.getErrorCode(), errorResult.getErrorMsg()));
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(File file) {
                        Log.m165389i("WatermarkController", "compress result: after -- " + file.length() + " vs before -- " + file.length());
                        AbstractC58289c cVar = cVar;
                        if (cVar != null) {
                            cVar.mo197242a(file);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: h */
    private void m225875h() {
        Watermark.inst().setIs24Hours(new Watermark.AbstractC58218b() {
            /* class com.ss.android.lark.watermark.$$Lambda$b$6QSkKD490w5rHdyMXd3v92t9PE */

            @Override // com.ss.android.lark.watermark.Watermark.AbstractC58218b
            public final boolean is24Hours() {
                return C58222b.this.m225876i();
            }
        });
    }

    /* renamed from: c */
    public void mo197265c() {
        Log.m165389i("WatermarkController", "water mark is reset");
        this.f143162e.set(false);
    }

    /* renamed from: d */
    private AbstractC58277a m225871d() {
        if (Watermark.inst().isFgEnable("lark.core.mysterious.watermark")) {
            return new MysteriousWatermarkInfoService();
        }
        return new C58281d();
    }

    /* renamed from: e */
    private void m225872e() {
        C58248c.m225948a();
        Watermark.inst().init(this.f143161d);
        m225874g();
        m225873f();
        m225875h();
    }

    /* renamed from: f */
    private void m225873f() {
        WatermarkInterceptor bVar = new WatermarkInterceptor(this.f143161d);
        this.f143165h = bVar;
        bVar.mo197337a((WatermarkInterceptor.IWatermarkInterceptor) new LoginInterceptor());
    }

    public C58222b() {
        m225872e();
        this.f143158a = m225871d();
        this.f143159b = new C58285e();
        this.f143162e = new AtomicBoolean(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.watermark.b$a */
    public static abstract class AbstractC58242a {

        /* renamed from: f */
        int f143210f;

        /* renamed from: g */
        WatermarkInfo f143211g;

        /* renamed from: h */
        Object f143212h;

        /* renamed from: a */
        public abstract void mo197269a();

        public AbstractC58242a(Object obj) {
            this.f143212h = obj;
        }

        /* renamed from: a */
        public void mo197281a(int i) {
            this.f143210f = i;
        }

        /* renamed from: a */
        public void mo197282a(WatermarkInfo watermarkInfo) {
            this.f143211g = watermarkInfo;
        }
    }

    /* renamed from: a */
    public void mo197249a(final Activity activity) {
        Watermark.inst().attachWatermark(activity, new IAttachResultCallback() {
            /* class com.ss.android.lark.watermark.C58222b.C582366 */

            @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
            public void onAttachSuccess() {
                Log.m165389i("WatermarkController", "attach watermark to " + activity.getClass().getSimpleName() + " success");
            }

            @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
            public void onAttachFailed(String str) {
                Log.m165389i("WatermarkController", "attach watermark to " + activity.getClass().getSimpleName() + " failed: " + str);
            }
        });
    }

    /* renamed from: b */
    public void mo197263b(Activity activity) {
        Watermark.inst().detachWatermark(activity);
    }

    /* renamed from: b */
    private void m225869b(final AbstractC58242a aVar) {
        if (!m225870c(aVar)) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.watermark.C58222b.RunnableC582419 */

                public void run() {
                    boolean z = true;
                    if (!C26252ad.m94993b(C58222b.this.f143161d)) {
                        int b = C58222b.this.f143159b.mo197379b();
                        WatermarkInfo b2 = C58222b.this.f143158a.mo197377b();
                        if (b2 == null) {
                            b2 = WatermarkInfoFactory.m225977a();
                        }
                        if (b != 0) {
                            z = false;
                        }
                        b2.setGlobalWatermark(z);
                        C58222b.this.mo197259a(b2);
                        aVar.mo197281a(b);
                        aVar.mo197282a(b2);
                        aVar.mo197269a();
                    } else if (C58222b.this.f143162e.get()) {
                        Log.m165389i("WatermarkController", "get local watermark info");
                        int b3 = C58222b.this.f143159b.mo197379b();
                        WatermarkInfo b4 = C58222b.this.f143158a.mo197377b();
                        if (b4 == null) {
                            b4 = WatermarkInfoFactory.m225977a();
                        }
                        if (b3 != 0) {
                            z = false;
                        }
                        b4.setGlobalWatermark(z);
                        aVar.mo197281a(b3);
                        aVar.mo197282a(b4);
                        aVar.mo197269a();
                    } else {
                        Log.m165389i("WatermarkController", "get net watermark info");
                        C58222b.this.mo197258a(aVar);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private boolean m225870c(AbstractC58242a aVar) {
        if (!this.f143165h.mo197338a(aVar.f143212h)) {
            return false;
        }
        Log.m165389i("WatermarkController", "watermark not attach by intercept");
        return true;
    }

    /* renamed from: a */
    public WatermarkInfo mo197248a(Context context) {
        if (C26252ad.m94993b(context)) {
            return Watermark.inst().get();
        }
        return (WatermarkInfo) JSONObject.parseObject(C57744a.m224104a().getString("KEY_WATERMARKINFO", ""), WatermarkInfo.class);
    }

    /* renamed from: b */
    public void mo197264b(AbstractC29559a aVar) {
        if (aVar != null) {
            this.f143163f.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo197255a(final View view) {
        m225869b(new AbstractC58242a(view) {
            /* class com.ss.android.lark.watermark.C58222b.C582252 */

            @Override // com.ss.android.lark.watermark.C58222b.AbstractC58242a
            /* renamed from: a */
            public void mo197269a() {
                Watermark.inst().attachBackgroundWatermark(view, new IAttachResultCallback() {
                    /* class com.ss.android.lark.watermark.C58222b.C582252.C582261 */

                    @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
                    public void onAttachSuccess() {
                        Log.m165389i("WatermarkController", "attach watermark to view success");
                    }

                    @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
                    public void onAttachFailed(String str) {
                        Log.m165389i("WatermarkController", "attach watermark to view failed: " + str);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo197252a(Activity activity, boolean z) {
        LifecycleOwner lifecycleOwner;
        if (activity instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) activity;
        } else {
            lifecycleOwner = null;
        }
        mo197250a(activity, lifecycleOwner, z);
    }

    /* renamed from: a */
    public void mo197253a(final Dialog dialog, final boolean z) {
        m225869b(new AbstractC58242a(dialog) {
            /* class com.ss.android.lark.watermark.C58222b.C582377 */

            @Override // com.ss.android.lark.watermark.C58222b.AbstractC58242a
            /* renamed from: a */
            public void mo197269a() {
                if (z) {
                    if (this.f143210f == 0) {
                        Dialog dialog = dialog;
                        if ((dialog instanceof IWatermarkable) && !((IWatermarkable) dialog).enableGlobalWatermark()) {
                            Log.m165389i("WatermarkController", "watermark is disable");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Watermark.inst().attachWatermark(dialog, new IAttachResultCallback() {
                    /* class com.ss.android.lark.watermark.C58222b.C582377.C582381 */

                    @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
                    public void onAttachSuccess() {
                        Log.m165389i("WatermarkController", "attach watermark to dialog success");
                    }

                    @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
                    public void onAttachFailed(String str) {
                        Log.m165389i("WatermarkController", "attach watermark to dialog failed: " + str);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo197256a(final FrameLayout frameLayout, final boolean z) {
        m225869b(new AbstractC58242a(frameLayout) {
            /* class com.ss.android.lark.watermark.C58222b.C582398 */

            @Override // com.ss.android.lark.watermark.C58222b.AbstractC58242a
            /* renamed from: a */
            public void mo197269a() {
                if (z) {
                    if (this.f143210f == 0) {
                        FrameLayout frameLayout = frameLayout;
                        if ((frameLayout instanceof IWatermarkable) && !((IWatermarkable) frameLayout).enableGlobalWatermark()) {
                            Log.m165389i("WatermarkController", "watermark is disable");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Watermark.inst().attachWatermark(frameLayout, new IAttachResultCallback() {
                    /* class com.ss.android.lark.watermark.C58222b.C582398.C582401 */

                    @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
                    public void onAttachSuccess() {
                        Log.m165389i("WatermarkController", "attach watermark to view success");
                    }

                    @Override // com.ss.android.lark.watermark.core.IAttachResultCallback
                    public void onAttachFailed(String str) {
                        Log.m165389i("WatermarkController", "attach watermark to view failed: " + str);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo197250a(Activity activity, LifecycleOwner lifecycleOwner, boolean z) {
        mo197251a(activity, lifecycleOwner, z, false);
    }

    /* renamed from: a */
    public void mo197251a(final Activity activity, final LifecycleOwner lifecycleOwner, final boolean z, final boolean z2) {
        m225869b(new AbstractC58242a(activity) {
            /* class com.ss.android.lark.watermark.C58222b.C582345 */

            @Override // com.ss.android.lark.watermark.C58222b.AbstractC58242a
            /* renamed from: a */
            public void mo197269a() {
                if (z) {
                    if (this.f143210f != 0) {
                        Watermark.inst().detachWatermark(activity);
                        return;
                    }
                    Activity activity = activity;
                    if ((activity instanceof IWatermarkable) && !((IWatermarkable) activity).enableGlobalWatermark()) {
                        Log.m165389i("WatermarkController", "watermark is disable");
                        return;
                    }
                }
                if ((!z && !z2) || !Watermark.inst().isFgEnable("lark.core.mysterious.watermark")) {
                    C58222b.this.mo197249a(activity);
                } else if (lifecycleOwner != null) {
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.lark.watermark.C58222b.C582345.RunnableC582351 */

                        public void run() {
                            lifecycleOwner.getLifecycle().addObserver(new WatermarkController$3$1$1(this));
                            C58248c.m225949a(activity, lifecycleOwner, new Function1(activity) {
                                /* class com.ss.android.lark.watermark.$$Lambda$b$5$1$lv0m1Au_a4iUE1Q6DQVigsFUtvg */
                                public final /* synthetic */ Activity f$1;

                                {
                                    this.f$1 = r2;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C58222b.C582345.RunnableC582351.this.m225910a(this.f$1, (Activity) obj);
                                }
                            });
                        }

                        /* access modifiers changed from: private */
                        /* access modifiers changed from: public */
                        /* renamed from: a */
                        private /* synthetic */ Unit m225910a(Activity activity, Activity activity2) {
                            if (C58222b.this.mo197261a()) {
                                C58222b.this.mo197249a(activity);
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo197254a(final Context context, final int i, final float f, final IGetDataCallback<Drawable> iGetDataCallback) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.watermark.C58222b.RunnableC582273 */

            public void run() {
                new C58281d().mo197376a(new AbstractC58277a.AbstractC58278a() {
                    /* class com.ss.android.lark.watermark.C58222b.RunnableC582273.C582281 */

                    @Override // com.ss.android.lark.watermark.p2929f.AbstractC58289c
                    /* renamed from: a */
                    public void mo197241a(C58286a aVar) {
                        mo197274b(aVar);
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: b */
                    public void mo197274b(final C58286a aVar) {
                        if (iGetDataCallback != null) {
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.watermark.C58222b.RunnableC582273.C582281.RunnableC582312 */

                                public void run() {
                                    iGetDataCallback.onError(new ErrorResult(aVar.mo197384a(), aVar.mo197385b()));
                                }
                            });
                        }
                    }

                    /* renamed from: a */
                    public void mo197242a(WatermarkInfo watermarkInfo) {
                        watermarkInfo.setGlobalWatermark(false);
                        watermarkInfo.setAlpha(f);
                        watermarkInfo.setBgColor(i);
                        watermarkInfo.setWatermarkTag(C26320t.m95318a(watermarkInfo.getWatermarkTag() + i + f));
                        new C58244b().mo197292a(context, watermarkInfo, new AbstractC58289c<Drawable>() {
                            /* class com.ss.android.lark.watermark.C58222b.RunnableC582273.C582281.C582291 */

                            @Override // com.ss.android.lark.watermark.p2929f.AbstractC58289c
                            /* renamed from: a */
                            public void mo197241a(C58286a aVar) {
                                C582281.this.mo197274b(aVar);
                            }

                            /* renamed from: a */
                            public void mo197242a(final Drawable drawable) {
                                if (iGetDataCallback != null) {
                                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                        /* class com.ss.android.lark.watermark.C58222b.RunnableC582273.C582281.C582291.RunnableC582301 */

                                        public void run() {
                                            iGetDataCallback.onSuccess(drawable);
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            }
        });
    }
}
