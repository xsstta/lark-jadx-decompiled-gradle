package com.ss.android.lark.mm.module.translate;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateBar;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLoadingDialog;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateMenuDialog;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateOriginTextDialog;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J\b\u0010,\u001a\u00020\u001eH\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\u001eH\u0016J\b\u00102\u001a\u00020\u001eH\u0002J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020(H\u0002J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/mm/module/translate/MmTranslateViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateListener;", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateDependency;", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "viewControlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable$delegate", "Lkotlin/Lazy;", "loadingDialog", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLoadingDialog;", "mmTranslateBar", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar;", "mmTranslateBarContainer", "Landroid/view/View;", "mmTranslateMenuDialog", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog;", "getMmTranslateMenuDialog", "()Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog;", "mmTranslateMenuDialog$delegate", "mmTranslateOriginTextDialog", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateOriginTextDialog;", "animHide", "", "view", "animShow", "doTranslate", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getMmInquirer", "getMmListener", "hideLoading", "isOriginalTextDialogShowing", "", "onCreate", "onDestroy", "onExitTranslate", "onHideTranslateBar", "onShowOriginalTextDialog", "originContent", "", "onShowTranslateBar", "onStartTranslate", "restoreOriginLang", "showLoading", "isExitTranslate", "showTranslateBar", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.b.e */
public final class MmTranslateViewControl extends MmBaseViewControl<IMmTranslateListener, IMmTranslateDependency> implements IMmTranslateInquirer, IMmTranslateListener {

    /* renamed from: a */
    public final View f115738a;

    /* renamed from: b */
    public final IMmViewControlContext f115739b;

    /* renamed from: c */
    private final MmTranslateBar f115740c;

    /* renamed from: d */
    private MmTranslateOriginTextDialog f115741d;

    /* renamed from: e */
    private MmTranslateLoadingDialog f115742e;

    /* renamed from: f */
    private final Lazy f115743f;

    /* renamed from: g */
    private final Lazy f115744g;

    /* renamed from: h */
    private final MmBaseViewControlAdapter<IMmTranslateListener, IMmTranslateDependency> f115745h;

    /* renamed from: j */
    public final C68289a mo161293j() {
        return (C68289a) this.f115743f.getValue();
    }

    /* renamed from: k */
    public final MmTranslateMenuDialog mo161294k() {
        return (MmTranslateMenuDialog) this.f115744g.getValue();
    }

    /* renamed from: m */
    public IMmTranslateListener mo161243c() {
        return this;
    }

    /* renamed from: n */
    public IMmTranslateInquirer mo161244e() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.translate.IMmTranslateListener
    /* renamed from: f */
    public void mo161277f() {
        m181937o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$a */
    static final class C45907a extends Lambda implements Function0<C68289a> {
        public static final C45907a INSTANCE = new C45907a();

        C45907a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C68289a invoke() {
            return new C68289a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/mm/module/translate/MmTranslateViewControl$onCreate$1", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar$IMmTranslateBarCallback;", "changeTranslateLang", "", "exitTranslate", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$f */
    public static final class C45914f implements MmTranslateBar.IMmTranslateBarCallback {

        /* renamed from: a */
        final /* synthetic */ MmTranslateViewControl f115751a;

        @Override // com.ss.android.lark.mm.module.detail.translate.MmTranslateBar.IMmTranslateBarCallback
        /* renamed from: a */
        public void mo161304a() {
            this.f115751a.mo161277f();
        }

        @Override // com.ss.android.lark.mm.module.detail.translate.MmTranslateBar.IMmTranslateBarCallback
        /* renamed from: b */
        public void mo161305b() {
            FragmentManager supportFragmentManager;
            FragmentActivity a = C47107a.m186565a(this.f115751a.f115739b.mo161232n());
            if (a != null && (supportFragmentManager = a.getSupportFragmentManager()) != null) {
                MmTranslateMenuDialog k = this.f115751a.mo161294k();
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
                k.mo5511a(supportFragmentManager, "");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45914f(MmTranslateViewControl eVar) {
            this.f115751a = eVar;
        }
    }

    @Override // com.ss.android.lark.mm.module.translate.IMmTranslateListener
    /* renamed from: g */
    public void mo161278g() {
        View view = this.f115738a;
        if (view != null) {
            m181936b(view);
        }
    }

    @Override // com.ss.android.lark.mm.module.translate.IMmTranslateListener
    /* renamed from: i */
    public void mo161279i() {
        View view = this.f115738a;
        if (view != null) {
            m181935a(view);
        }
    }

    /* renamed from: l */
    public final void mo161295l() {
        MmTranslateLoadingDialog cVar = this.f115742e;
        if (cVar != null) {
            cVar.u_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$e */
    public static final class C45911e extends Lambda implements Function0<MmTranslateMenuDialog> {
        final /* synthetic */ MmTranslateViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45911e(MmTranslateViewControl eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/translate/MmTranslateViewControl$mmTranslateMenuDialog$2$1$1", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog$IMmTranslateMenuDependency;", "getSubtitleLanguages", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$SubtitleLanguage;", "getTranslateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isFilterOriginalLang", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.b.e$e$a */
        public static final class C45912a implements MmTranslateMenuDialog.IMmTranslateMenuDependency {

            /* renamed from: a */
            final /* synthetic */ C45911e f115750a;

            @Override // com.ss.android.lark.mm.module.detail.translate.MmTranslateMenuDialog.IMmTranslateMenuDependency
            /* renamed from: a */
            public MmTranslateLangType mo161300a() {
                return ((IMmTranslateDependency) this.f115750a.this$0.mo161247w()).mo161273f();
            }

            @Override // com.ss.android.lark.mm.module.detail.translate.MmTranslateMenuDialog.IMmTranslateMenuDependency
            /* renamed from: b */
            public List<MmBaseInfo.SubtitleLanguage> mo161301b() {
                return ((IMmTranslateDependency) this.f115750a.this$0.mo161247w()).mo161272e();
            }

            @Override // com.ss.android.lark.mm.module.detail.translate.MmTranslateMenuDialog.IMmTranslateMenuDependency
            /* renamed from: c */
            public boolean mo161302c() {
                return !((IMmTranslateDependency) this.f115750a.this$0.mo161247w()).mo161268a();
            }

            C45912a(C45911e eVar) {
                this.f115750a = eVar;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmTranslateMenuDialog invoke() {
            MmTranslateMenuDialog dVar = new MmTranslateMenuDialog();
            dVar.mo162769a(new C45912a(this));
            dVar.mo162770a(new C45913b(this));
            return dVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "invoke", "com/ss/android/lark/mm/module/translate/MmTranslateViewControl$mmTranslateMenuDialog$2$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.b.e$e$b */
        public static final class C45913b extends Lambda implements Function1<MmTranslateLangType, Unit> {
            final /* synthetic */ C45911e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45913b(C45911e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MmTranslateLangType mmTranslateLangType) {
                invoke(mmTranslateLangType);
                return Unit.INSTANCE;
            }

            public final void invoke(MmTranslateLangType mmTranslateLangType) {
                Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "it");
                if (mmTranslateLangType == MmTranslateLangType.DEFAULT) {
                    this.this$0.this$0.mo161277f();
                } else {
                    this.this$0.this$0.mo161292b(mmTranslateLangType);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$g */
    static final class C45915g extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmTranslateViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45915g(MmTranslateViewControl eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ((IMmTranslateDependency) this.this$0.mo161247w()).mo161271d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/translate/MmTranslateViewControl$showLoading$1$1$1", "com/ss/android/lark/mm/module/translate/MmTranslateViewControl$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$k */
    public static final class C45919k extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isExitTranslate$inlined;
        final /* synthetic */ MmTranslateViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45919k(MmTranslateViewControl eVar, boolean z) {
            super(0);
            this.this$0 = eVar;
            this.$isExitTranslate$inlined = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo161293j().mo237935a();
        }
    }

    @Override // com.ss.android.lark.mm.module.translate.IMmTranslateInquirer
    /* renamed from: a */
    public boolean mo161274a() {
        MmTranslateOriginTextDialog fVar = this.f115741d;
        if (fVar == null || !fVar.mo162781a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        mo161293j().dispose();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$i */
    public static final class C45917i implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ MmTranslateViewControl f115753a;

        C45917i(MmTranslateViewControl eVar) {
            this.f115753a = eVar;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            View view = this.f115753a.f115738a;
            if (view != null) {
                view.setVisibility(8);
            }
            this.f115753a.mo161295l();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        MmTranslateBar mmTranslateBar = this.f115740c;
        if (mmTranslateBar != null) {
            mmTranslateBar.setCallback(new C45914f(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$c */
    public static final class C45909c implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ MmTranslateViewControl f115747a;

        /* renamed from: b */
        final /* synthetic */ MmTranslateLangType f115748b;

        C45909c(MmTranslateViewControl eVar, MmTranslateLangType mmTranslateLangType) {
            this.f115747a = eVar;
            this.f115748b = mmTranslateLangType;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            this.f115747a.mo161295l();
            C45858j.m181677a((int) R.string.MMWeb_G_Translated);
            if (!((IMmTranslateDependency) this.f115747a.mo161247w()).mo161269b()) {
                this.f115747a.mo161290a(this.f115748b);
            }
        }
    }

    /* renamed from: o */
    private final void m181937o() {
        mo161293j().mo237937a(((IMmTranslateDependency) mo161247w()).mo161267a(MmTranslateLangType.DEFAULT).mo237886b(LarkRxSchedulers.io()).mo237881a(AndroidSchedulers.mainThread()).mo237882a(new C45916h(this)).mo237884a(new C45917i(this), new C45918j(this)));
    }

    @Override // com.ss.android.lark.mm.module.translate.IMmTranslateListener
    /* renamed from: b */
    public void mo161276b() {
        FragmentManager supportFragmentManager;
        List<MmMeetingParagraph> list;
        if (!((IMmTranslateDependency) mo161247w()).mo161269b()) {
            MmMeetingSubtitles c = ((IMmTranslateDependency) mo161247w()).mo161270c();
            if (c != null) {
                list = c.getParagraphs();
            } else {
                list = null;
            }
            if (list == null || c.getParagraphs().isEmpty()) {
                C45858j.m181677a((int) R.string.MMWeb_G_NoTranscript);
                return;
            }
        }
        FragmentActivity a = C47107a.m186565a(this.f115739b.mo161232n());
        if (a != null && (supportFragmentManager = a.getSupportFragmentManager()) != null) {
            MmTranslateMenuDialog k = mo161294k();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
            k.mo5511a(supportFragmentManager, "");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$b */
    public static final class C45908b<T> implements Consumer<Disposable> {

        /* renamed from: a */
        final /* synthetic */ MmTranslateViewControl f115746a;

        C45908b(MmTranslateViewControl eVar) {
            this.f115746a = eVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f115746a.mo161291a(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$h */
    public static final class C45916h<T> implements Consumer<Disposable> {

        /* renamed from: a */
        final /* synthetic */ MmTranslateViewControl f115752a;

        C45916h(MmTranslateViewControl eVar) {
            this.f115752a = eVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f115752a.mo161291a(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$d */
    public static final class C45910d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MmTranslateViewControl f115749a;

        C45910d(MmTranslateViewControl eVar) {
            this.f115749a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C45855f.m181666e("MmTranslateViewControl", th.getMessage());
            this.f115749a.mo161295l();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.e$j */
    public static final class C45918j<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MmTranslateViewControl f115754a;

        C45918j(MmTranslateViewControl eVar) {
            this.f115754a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C45855f.m181666e("MmTranslateViewControl", th.getMessage());
            this.f115754a.mo161295l();
        }
    }

    /* renamed from: a */
    public final void mo161290a(MmTranslateLangType mmTranslateLangType) {
        View view = this.f115738a;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f115738a;
        if (view2 != null) {
            m181935a(view2);
        }
        MmTranslateBar mmTranslateBar = this.f115740c;
        if (mmTranslateBar != null) {
            mmTranslateBar.setCurrentLang(mmTranslateLangType);
        }
    }

    /* renamed from: a */
    private final void m181935a(View view) {
        view.animate().translationY((float) C57582a.m223600a(2)).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200).start();
    }

    /* renamed from: b */
    private final void m181936b(View view) {
        view.animate().translationY((float) view.getHeight()).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200).start();
    }

    @Override // com.ss.android.lark.mm.module.translate.IMmTranslateListener
    /* renamed from: a */
    public void mo161275a(String str) {
        MmTranslateOriginTextDialog fVar;
        Intrinsics.checkParameterIsNotNull(str, "originContent");
        if (this.f115741d == null) {
            MmTranslateOriginTextDialog fVar2 = new MmTranslateOriginTextDialog(this.f115739b.mo161232n());
            this.f115741d = fVar2;
            if (fVar2 != null) {
                fVar2.setOnDismissCallback(new C45915g(this));
            }
        }
        MmTranslateOriginTextDialog fVar3 = this.f115741d;
        if (!(fVar3 == null || fVar3.mo162781a() || (fVar = this.f115741d) == null)) {
            fVar.mo162782b();
        }
        MmTranslateOriginTextDialog fVar4 = this.f115741d;
        if (fVar4 != null) {
            fVar4.setOriginText(str);
        }
    }

    /* renamed from: a */
    public final void mo161291a(boolean z) {
        FragmentManager supportFragmentManager;
        FragmentActivity a = C47107a.m186565a(this.f115739b.mo161232n());
        if (a != null && (supportFragmentManager = a.getSupportFragmentManager()) != null) {
            MmTranslateLoadingDialog a2 = MmTranslateLoadingDialog.f116646c.mo162766a(z);
            this.f115742e = a2;
            a2.mo162763a(new C45919k(this, z));
            a2.mo5511a(supportFragmentManager, "");
        }
    }

    /* renamed from: b */
    public final void mo161292b(MmTranslateLangType mmTranslateLangType) {
        mo161293j().mo237937a(((IMmTranslateDependency) mo161247w()).mo161267a(mmTranslateLangType).mo237882a(new C45908b(this)).mo237884a(new C45909c(this, mmTranslateLangType), new C45910d(this)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmTranslateViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmTranslateListener, IMmTranslateDependency> jVar) {
        super(gVar, jVar);
        MmTranslateBar mmTranslateBar;
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "viewControlAdapter");
        this.f115739b = gVar;
        this.f115745h = jVar;
        FragmentActivity a = C47107a.m186565a(gVar.mo161232n());
        View view = null;
        if (a != null) {
            mmTranslateBar = (MmTranslateBar) a.findViewById(R.id.translateBar);
        } else {
            mmTranslateBar = null;
        }
        this.f115740c = mmTranslateBar;
        FragmentActivity a2 = C47107a.m186565a(gVar.mo161232n());
        this.f115738a = a2 != null ? a2.findViewById(R.id.translateBarContainer) : view;
        this.f115743f = LazyKt.lazy(C45907a.INSTANCE);
        this.f115744g = LazyKt.lazy(new C45911e(this));
    }
}
