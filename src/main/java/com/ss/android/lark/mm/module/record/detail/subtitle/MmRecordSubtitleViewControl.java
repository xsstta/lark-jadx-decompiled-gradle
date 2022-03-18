package com.ss.android.lark.mm.module.record.detail.subtitle;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.record.model.MmRecordPara;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableRecordTracker;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020$H\u0003J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0016J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\u0012\u0010.\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleListener;", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleDependency;", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "adapter", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleAdapter;", "autoRetryTimes", "", "backHandler", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "isAutoTrack", "", "isTrackedFirstFrameCostTime", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "objectLock", "", "recordSubtitleRv", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "seekPositionIv", "Landroid/view/View;", "getLatestTimestamp", "", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "initRecyclerViews", "", "loadSubtitles", "onChangeTranslateLang", "onCreate", "onDestroy", "onPushRecordSubtitle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "scrollToBottom", "showHistorySubtitles", "update", "isScrollToBottom", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.a.f */
public final class MmRecordSubtitleViewControl extends MmBaseViewControl<IMmRecordSubtitleListener, IMmRecordSubtitleDependency> implements IMmRecordSubtitleInquirer, IMmRecordSubtitleListener {

    /* renamed from: a */
    public final RecyclerView f118052a;

    /* renamed from: b */
    public final View f118053b;

    /* renamed from: c */
    public MmRecordSubtitleAdapter f118054c;

    /* renamed from: d */
    public Handler f118055d;

    /* renamed from: e */
    public boolean f118056e = true;

    /* renamed from: f */
    public final Object f118057f = new Object();

    /* renamed from: g */
    public int f118058g = 3;

    /* renamed from: h */
    public boolean f118059h;

    /* renamed from: i */
    public final IMmViewControlContext f118060i;

    /* renamed from: j */
    private LinearLayoutManager f118061j;

    /* renamed from: k */
    private final HandlerThread f118062k = m185745a("record-subtitle");

    /* renamed from: l */
    private final MmBaseViewControlAdapter<IMmRecordSubtitleListener, IMmRecordSubtitleDependency> f118063l;

    /* renamed from: a */
    public static HandlerThread m185745a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: g */
    public IMmRecordSubtitleListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        this.f118062k.quitSafely();
    }

    /* renamed from: i */
    public final void mo164682i() {
        if (this.f118056e) {
            this.f118052a.scrollBy(0, Integer.MAX_VALUE);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$d */
    public static final class C46884d implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControl f118066a;

        C46884d(MmRecordSubtitleViewControl fVar) {
            this.f118066a = fVar;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            C45855f.m181664c("MmRecordSubtitleViewControl", "[loadSubtitles] load success");
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleViewControl.C46884d.RunnableC468851 */

                /* renamed from: a */
                final /* synthetic */ C46884d f118067a;

                {
                    this.f118067a = r1;
                }

                public final void run() {
                    MmRecordSubtitleAdapter a = MmRecordSubtitleViewControl.m185746a(this.f118067a.f118066a);
                    Collection<MmRecordPara> values = ((IMmRecordSubtitleDependency) this.f118067a.f118066a.mo161247w()).mo164656a().values();
                    Intrinsics.checkExpressionValueIsNotNull(values, "getDependency().getParas().values");
                    a.mo164665a(CollectionsKt.sortedWith(values, new C46886a()));
                    this.f118067a.f118066a.mo164682i();
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$d$1$a */
                public static final class C46886a<T> implements Comparator<T> {
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        T t3 = t2;
                        Intrinsics.checkExpressionValueIsNotNull(t3, "it");
                        String pid = t3.getPid();
                        Intrinsics.checkExpressionValueIsNotNull(pid, "it.pid");
                        T t4 = t;
                        Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                        String pid2 = t4.getPid();
                        Intrinsics.checkExpressionValueIsNotNull(pid2, "it.pid");
                        return ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(pid)), Long.valueOf(Long.parseLong(pid2)));
                    }
                }
            });
        }
    }

    @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleListener
    /* renamed from: b */
    public void mo164663b() {
        C45855f.m181664c("MmRecordSubtitleViewControl", "onChangeTranslateLang");
        C45859k.m181685a(new RunnableC46889f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$f */
    static final class RunnableC46889f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControl f118070a;

        RunnableC46889f(MmRecordSubtitleViewControl fVar) {
            this.f118070a = fVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0038 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.ss.android.lark.mm.module.record.detail.a.f r0 = r4.f118070a
                java.lang.Object r0 = r0.f118057f
                monitor-enter(r0)
                com.ss.android.lark.mm.module.record.detail.a.f r1 = r4.f118070a     // Catch:{ Exception -> 0x0038 }
                com.ss.android.lark.mm.module.record.detail.a.d r1 = com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleViewControl.m185746a(r1)     // Catch:{ Exception -> 0x0038 }
                com.ss.android.lark.mm.module.record.detail.a.f r2 = r4.f118070a     // Catch:{ Exception -> 0x0038 }
                com.ss.android.lark.mm.module.a.b r2 = r2.mo161247w()     // Catch:{ Exception -> 0x0038 }
                com.ss.android.lark.mm.module.record.detail.a.a r2 = (com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleDependency) r2     // Catch:{ Exception -> 0x0038 }
                java.util.concurrent.ConcurrentHashMap r2 = r2.mo164656a()     // Catch:{ Exception -> 0x0038 }
                java.util.Collection r2 = r2.values()     // Catch:{ Exception -> 0x0038 }
                java.lang.String r3 = "getDependency().getParas().values"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Exception -> 0x0038 }
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Exception -> 0x0038 }
                com.ss.android.lark.mm.module.record.detail.a.f$f$a r3 = new com.ss.android.lark.mm.module.record.detail.a.f$f$a     // Catch:{ Exception -> 0x0038 }
                r3.<init>()     // Catch:{ Exception -> 0x0038 }
                java.util.Comparator r3 = (java.util.Comparator) r3     // Catch:{ Exception -> 0x0038 }
                java.util.List r2 = kotlin.collections.CollectionsKt.sortedWith(r2, r3)     // Catch:{ Exception -> 0x0038 }
                r1.mo164665a(r2)     // Catch:{ Exception -> 0x0038 }
                com.ss.android.lark.mm.module.record.detail.a.f r1 = r4.f118070a     // Catch:{ Exception -> 0x0038 }
                r1.mo164682i()     // Catch:{ Exception -> 0x0038 }
                goto L_0x0038
            L_0x0036:
                r1 = move-exception
                goto L_0x003c
            L_0x0038:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0036 }
                monitor-exit(r0)
                return
            L_0x003c:
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleViewControl.RunnableC46889f.run():void");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$f$a */
        public static final class C46890a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                T t3 = t2;
                Intrinsics.checkExpressionValueIsNotNull(t3, "it");
                String pid = t3.getPid();
                Intrinsics.checkExpressionValueIsNotNull(pid, "it.pid");
                T t4 = t;
                Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                String pid2 = t4.getPid();
                Intrinsics.checkExpressionValueIsNotNull(pid2, "it.pid");
                return ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(pid)), Long.valueOf(Long.parseLong(pid2)));
            }
        }
    }

    /* renamed from: j */
    private final void m185748j() {
        try {
            MmRecordSubtitleAdapter dVar = this.f118054c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            Collection<MmRecordPara> values = ((IMmRecordSubtitleDependency) mo161247w()).mo164656a().values();
            Intrinsics.checkExpressionValueIsNotNull(values, "getDependency().getParas().values");
            dVar.mo164665a(CollectionsKt.sortedWith(values, new C46896i()));
            mo164682i();
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        this.f118062k.start();
        this.f118055d = new Handler(this.f118062k.getLooper());
        View view = this.f118053b;
        Intrinsics.checkExpressionValueIsNotNull(view, "seekPositionIv");
        C47110e.m186573a(view, new C46891g(this));
        m185749k();
        m185748j();
        mo164680f();
    }

    /* renamed from: f */
    public final void mo164680f() {
        C45855f.m181664c("MmRecordSubtitleViewControl", "[loadSubtitles] begin load");
        mo161246v().mo237937a(((IMmRecordSubtitleDependency) mo161247w()).mo164658b().mo237884a(new C46884d(this), new C46887e(this)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$j */
    public static final class RunnableC46897j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControl f118075a;

        /* renamed from: b */
        final /* synthetic */ boolean f118076b;

        RunnableC46897j(MmRecordSubtitleViewControl fVar, boolean z) {
            this.f118075a = fVar;
            this.f118076b = z;
        }

        public final void run() {
            synchronized (this.f118075a.f118057f) {
                C45855f.m181663b("MmRecordSubtitleViewControl", "update");
                try {
                    MmRecordSubtitleAdapter a = MmRecordSubtitleViewControl.m185746a(this.f118075a);
                    Collection<MmRecordPara> values = ((IMmRecordSubtitleDependency) this.f118075a.mo161247w()).mo164656a().values();
                    Intrinsics.checkExpressionValueIsNotNull(values, "getDependency().getParas().values");
                    a.mo164665a(CollectionsKt.sortedWith(values, new C46898a()));
                    if (this.f118076b) {
                        this.f118075a.mo164682i();
                    }
                } catch (Exception unused) {
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$j$a */
        public static final class C46898a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                T t3 = t2;
                Intrinsics.checkExpressionValueIsNotNull(t3, "it");
                String pid = t3.getPid();
                Intrinsics.checkExpressionValueIsNotNull(pid, "it.pid");
                T t4 = t;
                Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                String pid2 = t4.getPid();
                Intrinsics.checkExpressionValueIsNotNull(pid2, "it.pid");
                return ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(pid)), Long.valueOf(Long.parseLong(pid2)));
            }
        }
    }

    /* renamed from: k */
    private final void m185749k() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f118060i.mo161232n());
        this.f118061j = linearLayoutManager;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
        }
        linearLayoutManager.setReverseLayout(true);
        LinearLayoutManager linearLayoutManager2 = this.f118061j;
        if (linearLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
        }
        linearLayoutManager2.setStackFromEnd(true);
        RecyclerView recyclerView = this.f118052a;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recordSubtitleRv");
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f118052a;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recordSubtitleRv");
        LinearLayoutManager linearLayoutManager3 = this.f118061j;
        if (linearLayoutManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linearLayoutManager");
        }
        recyclerView2.setLayoutManager(linearLayoutManager3);
        this.f118054c = new MmRecordSubtitleAdapter();
        RecyclerView recyclerView3 = this.f118052a;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "recordSubtitleRv");
        MmRecordSubtitleAdapter dVar = this.f118054c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView3.setAdapter(dVar);
        RecyclerView recyclerView4 = this.f118052a;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "recordSubtitleRv");
        recyclerView4.setOverScrollMode(2);
        this.f118052a.addOnScrollListener(new C46882b(this));
        this.f118052a.setOnTouchListener(new View$OnTouchListenerC46883c(this));
    }

    @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleInquirer
    /* renamed from: a */
    public long mo164661a() {
        List<MmRecordSentence> sentences;
        MmRecordSubtitleAdapter dVar = this.f118054c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        MmRecordPara a = dVar.mo164664a();
        if (a == null || (sentences = a.getSentences()) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : sentences) {
            T t2 = t;
            Intrinsics.checkExpressionValueIsNotNull(t2, "it");
            if (t2.isFinal()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sortedWith(arrayList2, new C46881a());
        Object obj = arrayList2.get(arrayList2.size() - 1);
        Intrinsics.checkExpressionValueIsNotNull(obj, "sentences[sentences.size - 1]");
        String stopTime = ((MmRecordSentence) obj).getStopTime();
        Intrinsics.checkExpressionValueIsNotNull(stopTime, "sentences[sentences.size - 1].stopTime");
        return Long.parseLong(stopTime);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$h */
    public static final class RunnableC46892h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControl f118071a;

        /* renamed from: b */
        final /* synthetic */ MmRecordSentence f118072b;

        RunnableC46892h(MmRecordSubtitleViewControl fVar, MmRecordSentence mmRecordSentence) {
            this.f118071a = fVar;
            this.f118072b = mmRecordSentence;
        }

        public final void run() {
            T t;
            boolean z;
            synchronized (this.f118071a.f118057f) {
                if (!this.f118071a.f118059h) {
                    this.f118071a.f118059h = true;
                    long d = ((IMmRecordSubtitleDependency) this.f118071a.mo161247w()).mo164660d();
                    StringBuilder sb = new StringBuilder();
                    sb.append(" recordingTime: ");
                    sb.append(d);
                    sb.append(",  cost: ");
                    String stopTime = this.f118072b.getStopTime();
                    Intrinsics.checkExpressionValueIsNotNull(stopTime, "data.stopTime");
                    sb.append(d - Long.parseLong(stopTime));
                    C45855f.m181663b("MmRecordSubtitleViewControl", sb.toString());
                    MmAppreciableRecordTracker.TrackAudioTextGenerateTime aVar = MmAppreciableRecordTracker.TrackAudioTextGenerateTime.f118537a;
                    String objectToken = ((IMmRecordSubtitleDependency) this.f118071a.mo161247w()).mo164659c().getObjectToken();
                    Intrinsics.checkExpressionValueIsNotNull(objectToken, "getDependency().getBaseInfo().objectToken");
                    String stopTime2 = this.f118072b.getStopTime();
                    Intrinsics.checkExpressionValueIsNotNull(stopTime2, "data.stopTime");
                    aVar.mo165396a(objectToken, d - Long.parseLong(stopTime2));
                }
                ConcurrentHashMap<String, MmRecordPara> a = ((IMmRecordSubtitleDependency) this.f118071a.mo161247w()).mo164656a();
                C45855f.m181663b("MmRecordSubtitleViewControl", "[onPushRecordSubtitle]: pid: " + this.f118072b.getPid() + ", sid: " + this.f118072b.getSid() + ", isFinal: " + this.f118072b.isFinal() + ", sentences: " + this.f118072b.getSentences() + ", stopTime: " + this.f118072b.getStopTime());
                if (a.containsKey(this.f118072b.getPid())) {
                    MmRecordPara mmRecordPara = a.get(this.f118072b.getPid());
                    if (mmRecordPara != null) {
                        Intrinsics.checkExpressionValueIsNotNull(mmRecordPara, "mRecordPara[data.pid] ?: return@post");
                        List<MmRecordSentence> sentences = mmRecordPara.getSentences();
                        Intrinsics.checkExpressionValueIsNotNull(sentences, "para.sentences");
                        Iterator<T> it = sentences.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            T t2 = t;
                            if (t2 == null || !Intrinsics.areEqual(t2.getSid(), this.f118072b.getSid())) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 != null) {
                            int indexOf = mmRecordPara.getSentences().indexOf(t3);
                            if (!t3.isFinal()) {
                                mmRecordPara.getSentences().set(indexOf, this.f118072b);
                            }
                        } else {
                            mmRecordPara.getSentences().add(this.f118072b);
                        }
                    } else {
                        return;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f118072b);
                    String pid = this.f118072b.getPid();
                    Intrinsics.checkExpressionValueIsNotNull(pid, "data.pid");
                    MmRecordPara mmRecordPara2 = new MmRecordPara();
                    mmRecordPara2.setSentences(arrayList);
                    mmRecordPara2.setPid(this.f118072b.getPid());
                    a.put(pid, mmRecordPara2);
                    MmRecordPara a2 = MmRecordSubtitleViewControl.m185746a(this.f118071a).mo164664a();
                    if (a2 != null) {
                        String pid2 = a2.getPid();
                        Intrinsics.checkExpressionValueIsNotNull(pid2, "it.pid");
                        ((IMmRecordSubtitleDependency) this.f118071a.mo161247w()).mo164657a(pid2, new C46894b(a2, this));
                    }
                }
                MmRecordPara mmRecordPara3 = a.get(this.f118072b.getPid());
                if (mmRecordPara3 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(mmRecordPara3, "mRecordPara[data.pid] ?: return@post");
                    List<MmRecordSentence> sentences2 = mmRecordPara3.getSentences();
                    Intrinsics.checkExpressionValueIsNotNull(sentences2, "para.sentences");
                    if (sentences2.size() > 1) {
                        CollectionsKt.sortWith(sentences2, new C46893a());
                    }
                    MmRecordSubtitleViewControl.m185747a(this.f118071a, false, 1, null);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "newPara", "Lcom/ss/android/lark/mm/module/record/model/MmRecordPara;", "invoke", "com/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleViewControl$onPushRecordSubtitle$1$1$2$1", "com/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleViewControl$onPushRecordSubtitle$1$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$h$b */
        static final class C46894b extends Lambda implements Function1<MmRecordPara, Unit> {
            final /* synthetic */ MmRecordPara $it;
            final /* synthetic */ RunnableC46892h this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46894b(MmRecordPara mmRecordPara, RunnableC46892h hVar) {
                super(1);
                this.$it = mmRecordPara;
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MmRecordPara mmRecordPara) {
                invoke(mmRecordPara);
                return Unit.INSTANCE;
            }

            public final void invoke(final MmRecordPara mmRecordPara) {
                Intrinsics.checkParameterIsNotNull(mmRecordPara, "newPara");
                Handler handler = this.this$0.f118071a.f118055d;
                if (handler != null) {
                    handler.post(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleViewControl.RunnableC46892h.C46894b.RunnableC468951 */

                        /* renamed from: a */
                        final /* synthetic */ C46894b f118073a;

                        {
                            this.f118073a = r1;
                        }

                        public final void run() {
                            synchronized (this.f118073a.this$0.f118071a.f118057f) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("load para subtitle from success, newPara: ");
                                List<MmRecordSentence> sentences = mmRecordPara.getSentences();
                                Intrinsics.checkExpressionValueIsNotNull(sentences, "newPara.sentences");
                                sb.append(CollectionsKt.joinToString$default(sentences, null, null, null, 0, null, C46899g.INSTANCE, 31, null));
                                C45855f.m181663b("MmRecordSubtitleViewControl", sb.toString());
                                String pid = this.f118073a.$it.getPid();
                                Intrinsics.checkExpressionValueIsNotNull(pid, "it.pid");
                                ((IMmRecordSubtitleDependency) this.f118073a.this$0.f118071a.mo161247w()).mo164656a().put(pid, mmRecordPara);
                                Unit unit = Unit.INSTANCE;
                            }
                            this.f118073a.this$0.f118071a.mo164679a(false);
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$h$a */
        public static final class C46893a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                T t3 = t;
                Intrinsics.checkExpressionValueIsNotNull(t3, "it");
                String sid = t3.getSid();
                Intrinsics.checkExpressionValueIsNotNull(sid, "it.sid");
                T t4 = t2;
                Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                String sid2 = t4.getSid();
                Intrinsics.checkExpressionValueIsNotNull(sid2, "it.sid");
                return ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(sid)), Long.valueOf(Long.parseLong(sid2)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleViewControl$initRecyclerViews$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$b */
    public static final class C46882b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControl f118064a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46882b(MmRecordSubtitleViewControl fVar) {
            this.f118064a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            boolean z = !this.f118064a.f118052a.canScrollVertically(1);
            View view = this.f118064a.f118053b;
            Intrinsics.checkExpressionValueIsNotNull(view, "seekPositionIv");
            if (this.f118064a.f118056e || z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view.setVisibility(i3);
            if (z) {
                this.f118064a.f118056e = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$g */
    static final class C46891g extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmRecordSubtitleViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46891g(MmRecordSubtitleViewControl fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmRecordSubtitleViewControl", "click seekPositionIv");
            this.this$0.f118056e = true;
            this.this$0.mo164682i();
            View view2 = this.this$0.f118053b;
            Intrinsics.checkExpressionValueIsNotNull(view2, "seekPositionIv");
            view2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MmRecordSubtitleAdapter m185746a(MmRecordSubtitleViewControl fVar) {
        MmRecordSubtitleAdapter dVar = fVar.f118054c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$e */
    public static final class C46887e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControl f118068a;

        C46887e(MmRecordSubtitleViewControl fVar) {
            this.f118068a = fVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C45855f.m181666e("MmRecordSubtitleViewControl", "[loadSubtitles] load failed " + th);
            if (NetworkUtils.isNetworkAvailable(this.f118068a.f118060i.mo161232n()) && this.f118068a.f118058g >= 0) {
                MmRecordSubtitleViewControl fVar = this.f118068a;
                fVar.f118058g--;
                C45855f.m181666e("MmRecordSubtitleViewControl", "[loadSubtitles] ERROR_OFFLINE，retryTimes: " + this.f118068a.f118058g);
                C45859k.m181686a(new Runnable(this) {
                    /* class com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleViewControl.C46887e.RunnableC468881 */

                    /* renamed from: a */
                    final /* synthetic */ C46887e f118069a;

                    {
                        this.f118069a = r1;
                    }

                    public final void run() {
                        this.f118069a.f118068a.mo164680f();
                    }
                }, 200);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleListener
    /* renamed from: a */
    public void mo164662a(MmRecordSentence mmRecordSentence) {
        Intrinsics.checkParameterIsNotNull(mmRecordSentence, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Handler handler = this.f118055d;
        if (handler != null) {
            handler.post(new RunnableC46892h(this, mmRecordSentence));
        }
    }

    /* renamed from: a */
    public final void mo164679a(boolean z) {
        C45859k.m181685a(new RunnableC46897j(this, z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$a */
    public static final class C46881a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            T t3 = t;
            Intrinsics.checkExpressionValueIsNotNull(t3, "it");
            String sid = t3.getSid();
            Intrinsics.checkExpressionValueIsNotNull(sid, "it.sid");
            T t4 = t2;
            Intrinsics.checkExpressionValueIsNotNull(t4, "it");
            String sid2 = t4.getSid();
            Intrinsics.checkExpressionValueIsNotNull(sid2, "it.sid");
            return ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(sid)), Long.valueOf(Long.parseLong(sid2)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$c */
    public static final class View$OnTouchListenerC46883c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControl f118065a;

        View$OnTouchListenerC46883c(MmRecordSubtitleViewControl fVar) {
            this.f118065a = fVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 2) {
                this.f118065a.f118056e = !this.f118065a.f118052a.canScrollVertically(1);
                return false;
            } else if (motionEvent.getAction() != 1) {
                return false;
            } else {
                this.f118065a.f118056e = !this.f118065a.f118052a.canScrollVertically(1);
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.f$i */
    public static final class C46896i<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            T t3 = t2;
            Intrinsics.checkExpressionValueIsNotNull(t3, "it");
            String pid = t3.getPid();
            Intrinsics.checkExpressionValueIsNotNull(pid, "it.pid");
            T t4 = t;
            Intrinsics.checkExpressionValueIsNotNull(t4, "it");
            String pid2 = t4.getPid();
            Intrinsics.checkExpressionValueIsNotNull(pid2, "it.pid");
            return ComparisonsKt.compareValues(Long.valueOf(Long.parseLong(pid)), Long.valueOf(Long.parseLong(pid2)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordSubtitleViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmRecordSubtitleListener, IMmRecordSubtitleDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f118060i = gVar;
        this.f118063l = jVar;
        this.f118052a = (RecyclerView) gVar.mo161233o().findViewById(R.id.recordSubtitleRv);
        this.f118053b = gVar.mo161233o().findViewById(R.id.seekPositionIv);
    }

    /* renamed from: a */
    static /* synthetic */ void m185747a(MmRecordSubtitleViewControl fVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        fVar.mo164679a(z);
    }
}
