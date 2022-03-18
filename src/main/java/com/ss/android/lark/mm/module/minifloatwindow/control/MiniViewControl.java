package com.ss.android.lark.mm.module.minifloatwindow.control;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.minifloatwindow.C46509b;
import com.ss.android.lark.mm.module.minifloatwindow.floating.MiniType;
import com.ss.android.lark.mm.module.minifloatwindow.view.IMiniView;
import com.ss.android.lark.mm.module.minifloatwindow.view.MiniAudioRecord;
import com.ss.android.lark.mm.module.minifloatwindow.view.MiniPodCast;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\r\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u000bH\u0016J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0013H\u0016J\u0016\u0010*\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002JI\u0010.\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u000b2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0013012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130,H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniListener;", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniDependency;", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "baseViewControlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "isShowing", "", "miniType", "Lcom/ss/android/lark/mm/module/minifloatwindow/floating/MiniType;", "miniView", "Lcom/ss/android/lark/mm/module/minifloatwindow/view/IMiniView;", "vcInnoFloatWindowManager", "Lcom/ss/android/lark/mm/module/minifloatwindow/VcInnoFloatWindowManager;", "dismiss", "", "forcedToDestroy", "forcedToDestroy$mm_release", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "onCover", "url", "", "defaultResId", "", "onCreate", "onDestroy", "onDuration", "duration", "", "onLoading", "onPause", "isEnabled", "onProgress", "progress", "onResume", "onStop", "setMiniViewOnClickAction", "trackContextGetter", "Lkotlin/Function0;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "show", "requestPermission", "onShowResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onForcedToDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e */
public final class MiniViewControl extends MmBaseViewControl<IMiniListener, IMiniDependency> implements IMiniInquirer, IMiniListener {

    /* renamed from: a */
    public IMiniView f117056a;

    /* renamed from: b */
    public MiniType f117057b = MiniType.NULL;

    /* renamed from: c */
    public boolean f117058c;

    /* renamed from: d */
    private C46509b f117059d;

    /* renamed from: e */
    private final IMmViewControlContext f117060e;

    /* renamed from: f */
    private final MmBaseViewControlAdapter<IMiniListener, IMiniDependency> f117061f;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: f */
    public IMiniListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener, com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: z */
    public void mo161250z() {
        mo163388g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControl$show$1", "Lcom/ss/android/lark/mm/module/minifloatwindow/VcInnoFloatWindowManager$ICreatedCallback;", "onCreatedResultCallBack", "", "isSuccessful", "", "onForcedToDismiss", "onResumeActivityFloatWindow", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$i */
    public static final class C46500i implements C46509b.AbstractC46515a {

        /* renamed from: a */
        final /* synthetic */ MiniViewControl f117074a;

        /* renamed from: b */
        final /* synthetic */ Function0 f117075b;

        /* renamed from: c */
        final /* synthetic */ Function1 f117076c;

        /* renamed from: d */
        final /* synthetic */ Function0 f117077d;

        @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
        /* renamed from: a */
        public void mo149312a() {
            this.f117077d.invoke();
        }

        @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
        /* renamed from: a */
        public void mo149313a(boolean z) {
            if (z) {
                this.f117074a.mo161241A();
            }
        }

        @Override // com.ss.android.lark.mm.module.minifloatwindow.C46509b.AbstractC46515a
        public void onCreatedResultCallBack(boolean z) {
            this.f117074a.f117058c = z;
            if (this.f117074a.f117058c) {
                this.f117074a.mo163385a(this.f117075b);
            }
            this.f117076c.invoke(Boolean.valueOf(this.f117074a.f117058c));
        }

        C46500i(MiniViewControl eVar, Function0 function0, Function1 function1, Function0 function02) {
            this.f117074a = eVar;
            this.f117075b = function0;
            this.f117076c = function1;
            this.f117077d = function02;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$a */
    static final class RunnableC46492a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniViewControl f117062a;

        /* renamed from: b */
        final /* synthetic */ String f117063b;

        /* renamed from: c */
        final /* synthetic */ int f117064c;

        RunnableC46492a(MiniViewControl eVar, String str, int i) {
            this.f117062a = eVar;
            this.f117063b = str;
            this.f117064c = i;
        }

        public final void run() {
            IMiniView aVar = this.f117062a.f117056a;
            if (aVar != null) {
                aVar.mo163379a(this.f117063b, this.f117064c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$b */
    static final class RunnableC46493b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniViewControl f117065a;

        /* renamed from: b */
        final /* synthetic */ long f117066b;

        RunnableC46493b(MiniViewControl eVar, long j) {
            this.f117065a = eVar;
            this.f117066b = j;
        }

        public final void run() {
            IMiniView aVar = this.f117065a.f117056a;
            if (aVar != null) {
                aVar.mo163377a(this.f117066b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$c */
    static final class RunnableC46494c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniViewControl f117067a;

        RunnableC46494c(MiniViewControl eVar) {
            this.f117067a = eVar;
        }

        public final void run() {
            IMiniView aVar = this.f117067a.f117056a;
            if (aVar != null) {
                aVar.mo163376a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$d */
    static final class RunnableC46495d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniViewControl f117068a;

        /* renamed from: b */
        final /* synthetic */ boolean f117069b;

        RunnableC46495d(MiniViewControl eVar, boolean z) {
            this.f117068a = eVar;
            this.f117069b = z;
        }

        public final void run() {
            IMiniView aVar = this.f117068a.f117056a;
            if (aVar != null) {
                aVar.mo163380a(this.f117069b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$e */
    static final class RunnableC46496e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniViewControl f117070a;

        /* renamed from: b */
        final /* synthetic */ long f117071b;

        /* renamed from: c */
        final /* synthetic */ long f117072c;

        RunnableC46496e(MiniViewControl eVar, long j, long j2) {
            this.f117070a = eVar;
            this.f117071b = j;
            this.f117072c = j2;
        }

        public final void run() {
            IMiniView aVar = this.f117070a.f117056a;
            if (aVar != null) {
                aVar.mo163378a(this.f117071b, this.f117072c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$f */
    public static final class RunnableC46497f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MiniViewControl f117073a;

        RunnableC46497f(MiniViewControl eVar) {
            this.f117073a = eVar;
        }

        public final void run() {
            IMiniView aVar = this.f117073a.f117056a;
            if (aVar != null) {
                aVar.mo163375A();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$j */
    public static final class C46501j extends Lambda implements Function0<C47084f> {
        final /* synthetic */ MiniViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46501j(MiniViewControl eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C47084f invoke() {
            return ((IMiniDependency) this.this$0.mo161247w()).mo163369a();
        }
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener, com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: A */
    public void mo161241A() {
        if (this.f117058c) {
            C26171w.m94675a(new RunnableC46497f(this));
        }
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163376a() {
        if (this.f117058c) {
            C26171w.m94675a(new RunnableC46494c(this));
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        this.f117059d = new C46509b();
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        mo161250z();
        this.f117059d = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControl$setMiniViewOnClickAction$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$h */
    public static final class C46499h extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function0 $trackContextGetter$inlined;
        final /* synthetic */ MiniViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46499h(MiniViewControl eVar, Function0 function0) {
            super(0);
            this.this$0 = eVar;
            this.$trackContextGetter$inlined = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo163388g();
            ((IMiniDependency) this.this$0.mo161247w()).mo163372b(this.this$0.f117057b);
        }
    }

    /* renamed from: b */
    public final void mo163386b() {
        super.mo161245h();
        this.f117058c = false;
        this.f117056a = null;
        this.f117059d = null;
    }

    /* renamed from: g */
    public final void mo163388g() {
        if (this.f117058c) {
            this.f117058c = false;
            C46509b bVar = this.f117059d;
            if (bVar != null) {
                bVar.mo163402a();
            }
            this.f117056a = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "isRecording", "", "invoke", "com/ss/android/lark/mm/module/minifloatwindow/control/MiniViewControl$setMiniViewOnClickAction$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.a.e$g */
    public static final class C46498g extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ Function0 $trackContextGetter$inlined;
        final /* synthetic */ MiniViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46498g(MiniViewControl eVar, Function0 function0) {
            super(1);
            this.this$0 = eVar;
            this.$trackContextGetter$inlined = function0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                ((IMiniDependency) this.this$0.mo161247w()).mo163374d();
            } else {
                ((IMiniDependency) this.this$0.mo161247w()).mo163373c();
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163377a(long j) {
        if (this.f117058c) {
            C26171w.m94675a(new RunnableC46493b(this, j));
        }
    }

    /* renamed from: a */
    public final void mo163385a(Function0<? extends C47084f> function0) {
        IMiniView aVar = this.f117056a;
        if (aVar != null) {
            ((IMiniDependency) mo161247w()).mo163370a(this.f117057b);
            aVar.mo163459a(function0, new C46498g(this, function0));
            aVar.mo163458a(function0, new C46499h(this, function0));
        }
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163380a(boolean z) {
        if (this.f117058c) {
            C26171w.m94675a(new RunnableC46495d(this, z));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMiniListener, IMiniDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "baseViewControlAdapter");
        this.f117060e = gVar;
        this.f117061f = jVar;
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163378a(long j, long j2) {
        if (this.f117058c) {
            C26171w.m94675a(new RunnableC46496e(this, j, j2));
        }
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163379a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (this.f117058c) {
            C26171w.m94675a(new RunnableC46492a(this, str, i));
        }
    }

    /* renamed from: a */
    public void mo163384a(MiniType miniType, boolean z, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        C46509b bVar;
        Intrinsics.checkParameterIsNotNull(miniType, "miniType");
        Intrinsics.checkParameterIsNotNull(function1, "onShowResult");
        Intrinsics.checkParameterIsNotNull(function0, "onForcedToDismiss");
        Context b = ((IMiniDependency) mo161247w()).mo163371b();
        if (miniType == MiniType.MINUTES_RECORDING) {
            this.f117056a = new MiniAudioRecord(b);
        } else if (miniType == MiniType.MINUTES_PODCAST) {
            this.f117056a = new MiniPodCast(b);
        } else {
            this.f117056a = null;
        }
        this.f117057b = miniType;
        C46501j jVar = new C46501j(this);
        IMiniView aVar = this.f117056a;
        if (aVar != null && (aVar instanceof View) && (bVar = this.f117059d) != null) {
            if (aVar != null) {
                bVar.mo163403a((View) aVar, miniType, z, new C46500i(this, jVar, function1, function0));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }
}
