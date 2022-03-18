package com.bytedance.ee.bear.watermark;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.p534s.C10744b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.db.C13641e;
import com.bytedance.ee.util.db.C13645f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13616d;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.watermark.Watermark;
import com.ss.android.lark.watermark.core.IAttachResultCallback;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import io.reactivex.functions.Consumer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001dH\u0002J\u001c\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0002J4\u0010!\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020\u0007H\u0002J \u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001dH\u0002J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'H\u0007J\b\u0010(\u001a\u00020\u0007H\u0002J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007J\u001c\u0010*\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007J \u0010+\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010-\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/bytedance/ee/bear/watermark/WatermarkManager;", "", "()V", "TAG", "", "sConfigMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "sToken", "sType", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "watermarkInfo", "Lcom/ss/android/lark/watermark/dto/WatermarkInfo;", "addGlobalWatermarkForDialog", "", "frameLayout", "Landroid/widget/FrameLayout;", "addWaterMark", "activity", "Landroid/app/Activity;", "addWatermarkToBitmapIfNeed", "bitmap", "Landroid/graphics/Bitmap;", "callback", "Lcom/ss/android/lark/watermark/core/IAttachToBitmapCallback;", "detachWatermark", "getConfigAndHandle", "addWatermark", "Lkotlin/Function0;", "getKey", "token", ShareHitPoint.f121869d, "handleByNetConfig", "getConfigFromDb", "handleResult", "showWatermark", "init", "context", "Landroid/content/Context;", "isLarkShowGlobalWatermark", "pullWatermarkConfig", "updateTokenAndType", "updateWatermarkForActivity", "updateWatermarkForActivityWithoutToken", "updateWatermarkForDialog", "updateWatermarkInfo", "info", "watermark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.s.c */
public final class WatermarkManager {

    /* renamed from: a */
    public static final WatermarkManager f28733a = new WatermarkManager();

    /* renamed from: b */
    private static volatile String f28734b;

    /* renamed from: c */
    private static volatile String f28735c;

    /* renamed from: d */
    private static final ConcurrentHashMap<String, Boolean> f28736d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static WatermarkInfo f28737e = new WatermarkInfo();

    /* renamed from: f */
    private static C10917c f28738f;

    private WatermarkManager() {
    }

    /* renamed from: a */
    public final void mo40662a(boolean z, Function0<Unit> function0) {
        if (!z) {
            C13479a.m54764b("WatermarkManager", "do not need watermark");
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: a */
    public final boolean mo40663a() {
        boolean isGlobalWatermark = f28737e.isGlobalWatermark();
        C13479a.m54764b("WatermarkManager", "isGlobalWatermark=" + isGlobalWatermark);
        return isGlobalWatermark;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$a */
    public static final class C10750a extends Lambda implements Function0<Unit> {
        final /* synthetic */ FrameLayout $frameLayout;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10750a(FrameLayout frameLayout) {
            super(0);
            this.$frameLayout = frameLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            WatermarkManager.f28733a.mo40665c(this.$frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/bear/watermark/WatermarkManager$addWaterMark$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$b */
    public static final class RunnableC10751b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f28739a;

        RunnableC10751b(FrameLayout frameLayout) {
            this.f28739a = frameLayout;
        }

        public final void run() {
            Watermark.inst().attachWatermark(this.f28739a, (IAttachResultCallback) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$d */
    public static final class C10757d extends Lambda implements Function0<Unit> {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10757d(Activity activity) {
            super(0);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            WatermarkManager.f28733a.mo40664b(this.$activity);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$e */
    public static final class C10758e extends Lambda implements Function0<Unit> {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10758e(Activity activity) {
            super(0);
            this.$activity = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            WatermarkManager.f28733a.mo40664b(this.$activity);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$g */
    public static final class C10761g extends Lambda implements Function0<Unit> {
        final /* synthetic */ FrameLayout $frameLayout;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10761g(FrameLayout frameLayout) {
            super(0);
            this.$frameLayout = frameLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            WatermarkManager.f28733a.mo40665c(this.$frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$h */
    public static final class C10762h extends Lambda implements Function0<Unit> {
        final /* synthetic */ FrameLayout $frameLayout;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10762h(FrameLayout frameLayout) {
            super(0);
            this.$frameLayout = frameLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            WatermarkManager.f28733a.mo40665c(this.$frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$f */
    public static final class RunnableC10759f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f28747a;

        RunnableC10759f(Activity activity) {
            this.f28747a = activity;
        }

        public final void run() {
            if (!WatermarkManager.f28733a.mo40663a()) {
                WatermarkManager.f28733a.mo40661a(new Function0<Unit>(this) {
                    /* class com.bytedance.ee.bear.watermark.WatermarkManager.RunnableC10759f.C107601 */
                    final /* synthetic */ RunnableC10759f this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        WatermarkManager.f28733a.mo40664b(this.this$0.f28747a);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/watermark/WatermarkManager$handleByNetConfig$1", "Lcom/bytedance/ee/bear/watermark/WatermarkConfigPuller$CallBack;", "onError", "", "onSuccess", "result", "Lcom/bytedance/ee/bear/watermark/WatermarkConfigPuller$WatermarkResult;", "watermark-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.s.c$c */
    public static final class C10752c implements C10744b.AbstractC10747a {

        /* renamed from: a */
        final /* synthetic */ String f28740a;

        /* renamed from: b */
        final /* synthetic */ Function0 f28741b;

        /* renamed from: c */
        final /* synthetic */ boolean f28742c;

        @Override // com.bytedance.ee.bear.p534s.C10744b.AbstractC10747a
        /* renamed from: a */
        public void mo40658a() {
            C13479a.m54758a("WatermarkManager", "getWatermarkFromNet error");
            if (this.f28742c) {
                C13641e.m55359a().mo50606b(this.f28740a).mo237985a(C11678b.m48481e()).mo238001b(new C10753a(this), new C10754b(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.s.c$c$c */
        static final class C10755c<T> implements Consumer<Long> {

            /* renamed from: a */
            public static final C10755c f28745a = new C10755c();

            C10755c() {
            }

            /* renamed from: a */
            public final void accept(Long l) {
                C13479a.m54764b("WatermarkManager", "");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.s.c$c$d */
        static final class C10756d<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C10756d f28746a = new C10756d();

            C10756d() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54766b("WatermarkManager", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.s.c$c$b */
        static final class C10754b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C10752c f28744a;

            C10754b(C10752c cVar) {
                this.f28744a = cVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54761a("WatermarkManager", th);
                WatermarkManager.f28733a.mo40662a(true, this.f28744a.f28741b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "model", "Lcom/bytedance/ee/util/db/KeyValueModel;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.s.c$c$a */
        static final class C10753a<T> implements Consumer<C13645f> {

            /* renamed from: a */
            final /* synthetic */ C10752c f28743a;

            C10753a(C10752c cVar) {
                this.f28743a = cVar;
            }

            /* renamed from: a */
            public final void accept(C13645f fVar) {
                if (fVar == null) {
                    WatermarkManager.f28733a.mo40662a(true, this.f28743a.f28741b);
                    return;
                }
                WatermarkManager.f28733a.mo40662a(Boolean.parseBoolean(fVar.mo50611b()), this.f28743a.f28741b);
                WatermarkManager cVar = WatermarkManager.f28733a;
                String a = fVar.mo50609a();
                Intrinsics.checkExpressionValueIsNotNull(a, "model.key");
                WatermarkManager.f28736d.put(a, Boolean.valueOf(Boolean.parseBoolean(fVar.mo50611b())));
            }
        }

        @Override // com.bytedance.ee.bear.p534s.C10744b.AbstractC10747a
        /* renamed from: a */
        public void mo40659a(C10744b.C10749c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "result");
            C13479a.m54764b("WatermarkManager", String.valueOf(cVar.showWatermark));
            C13641e.m55359a().mo50605b(new C13645f(this.f28740a, String.valueOf(cVar.showWatermark))).mo238001b(C10755c.f28745a, C10756d.f28746a);
            WatermarkManager cVar2 = WatermarkManager.f28733a;
            WatermarkManager.f28736d.put(this.f28740a, Boolean.valueOf(cVar.showWatermark));
            WatermarkManager.f28733a.mo40662a(cVar.showWatermark, this.f28741b);
        }

        C10752c(String str, Function0 function0, boolean z) {
            this.f28740a = str;
            this.f28741b = function0;
            this.f28742c = z;
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m44560b(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "frameLayout");
        Watermark.inst().detachWatermark(frameLayout);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44552a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        C11678b.m48480d().scheduleDirect(new RunnableC10759f(activity));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m44563d(FrameLayout frameLayout) {
        WatermarkManager cVar = f28733a;
        if (cVar.mo40663a()) {
            cVar.mo40662a(true, (Function0<Unit>) new C10750a(frameLayout));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44554a(FrameLayout frameLayout) {
        WatermarkManager cVar = f28733a;
        if (cVar.mo40663a()) {
            cVar.mo40662a(true, (Function0<Unit>) new C10761g(frameLayout));
        } else {
            cVar.mo40661a(new C10762h(frameLayout));
        }
    }

    /* renamed from: b */
    public final void mo40664b(Activity activity) {
        C13479a.m54764b("WatermarkManager", "addWaterMark for activity");
        if (activity != null) {
            Watermark.inst().attachWatermark(activity, (IAttachResultCallback) null);
        }
    }

    /* renamed from: c */
    public final void mo40665c(FrameLayout frameLayout) {
        C13479a.m54764b("WatermarkManager", "addWaterMark for frameLayout");
        if (frameLayout == null) {
            return;
        }
        if (frameLayout.getHeight() == 0) {
            frameLayout.post(new RunnableC10751b(frameLayout));
        } else {
            Watermark.inst().attachWatermark(frameLayout, (IAttachResultCallback) null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44556a(WatermarkInfo watermarkInfo) {
        Intrinsics.checkParameterIsNotNull(watermarkInfo, "info");
        C13479a.m54764b("WatermarkManager", "updateWatermark");
        f28737e = watermarkInfo;
        Watermark.inst().update(watermarkInfo);
    }

    /* renamed from: a */
    public final void mo40661a(Function0<Unit> function0) {
        Boolean bool = f28736d.get(m44562c(f28734b, f28735c));
        if (bool != null) {
            mo40662a(bool.booleanValue(), function0);
        } else {
            m44559a(f28734b, f28735c, function0, true);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44557a(String str, String str2) {
        f28734b = str;
        f28735c = str2;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m44561b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
        f28733a.m44559a(str, str2, null, false);
    }

    /* renamed from: c */
    private final String m44562c(String str, String str2) {
        return "watermark" + str + str2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44553a(Bitmap bitmap, IAttachToBitmapCallback iAttachToBitmapCallback) {
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(iAttachToBitmapCallback, "callback");
        if (C13616d.m55263b()) {
            iAttachToBitmapCallback.onAttachSuccess(bitmap);
            return;
        }
        WatermarkManager cVar = f28733a;
        if (cVar.mo40663a()) {
            Watermark.inst().addWatermarkToBitmap(bitmap, iAttachToBitmapCallback);
            return;
        }
        Boolean bool = f28736d.get(cVar.m44562c(f28734b, f28735c));
        if (bool == null || bool.booleanValue()) {
            Watermark.inst().addWatermarkToBitmap(bitmap, iAttachToBitmapCallback);
        } else {
            iAttachToBitmapCallback.onAttachSuccess(bitmap);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44555a(C10917c cVar, Context context) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(context, "context");
        C13479a.m54764b("WatermarkManager", "init");
        f28738f = cVar;
        if (!C26252ad.m94993b(C13615c.f35773a)) {
            Watermark.inst().init(context);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m44558a(String str, String str2, Activity activity) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C13479a.m54758a("WatermarkManager", "updateWatermark token= " + C13598b.m55197d(str) + " type = " + str2);
            return;
        }
        f28734b = str;
        f28735c = str2;
        WatermarkManager cVar = f28733a;
        if (!cVar.mo40663a()) {
            Boolean bool = f28736d.get(cVar.m44562c(str, str2));
            if (bool != null) {
                cVar.mo40662a(bool.booleanValue(), new C10757d(activity));
            } else {
                cVar.m44559a(str, str2, new C10758e(activity), true);
            }
        }
    }

    /* renamed from: a */
    private final void m44559a(String str, String str2, Function0<Unit> function0, boolean z) {
        boolean z2;
        String c = m44562c(str, str2);
        String str3 = str;
        boolean z3 = false;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z3 = true;
            }
            if (!z3) {
                new C10744b((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo40655a(str, str2, new C10752c(c, function0, z));
                return;
            }
        }
        C13479a.m54758a("WatermarkManager", "token.isNullOrEmpty() || type.isNullOrEmpty()");
        mo40662a(true, function0);
    }
}
