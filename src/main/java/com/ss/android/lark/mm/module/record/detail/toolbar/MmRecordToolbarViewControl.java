package com.ss.android.lark.mm.module.record.detail.toolbar;

import android.app.Dialog;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.reaction.model.EmojiReaction;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.detail.menu.RecordMenu;
import com.ss.android.lark.mm.module.record.detail.menu.RecordMenuDialog;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.MmLikeLottieView;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarListener;", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarDependency;", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "baseViewControlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "mRecordTime", "", "recordMenuDialog", "Lcom/ss/android/lark/mm/module/record/detail/menu/RecordMenuDialog;", "recordToolbar", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/RecordToolbarView;", "kotlin.jvm.PlatformType", "translateIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "translateLangIcon", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "initRecordingDevice", "", "initThirdViewer", "onChangeTranslateLang", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "onCreate", "onDuration", "it", "onRecordingStateChange", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "onVolumeChange", "", "setupViewerTranslateIcon", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e */
public final class MmRecordToolbarViewControl extends MmBaseViewControl<IMmRecordToolbarListener, IMmRecordToolbarDependency> implements IMmRecordToolbarInquirer, IMmRecordToolbarListener {

    /* renamed from: a */
    public final RecordToolbarView f118165a;

    /* renamed from: b */
    public RecordMenuDialog f118166b;

    /* renamed from: c */
    public long f118167c;

    /* renamed from: d */
    public final IMmViewControlContext f118168d;

    /* renamed from: e */
    private final AppCompatImageView f118169e;

    /* renamed from: f */
    private final AppCompatImageView f118170f;

    /* renamed from: g */
    private final MmBaseViewControlAdapter<IMmRecordToolbarListener, IMmRecordToolbarDependency> f118171g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$g */
    static final class C46946g extends Lambda implements Function0<Unit> {
        public static final C46946g INSTANCE = new C46946g();

        C46946g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    /* renamed from: a */
    public IMmRecordToolbarListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarViewControl$initRecordingDevice$2", "Lkotlin/Function0;", "Lcom/ss/android/lark/mm/module/record/model/Language;", "invoke", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$b */
    public static final class C46935b implements Function0<Language> {

        /* renamed from: a */
        final /* synthetic */ MmRecordToolbarViewControl f118172a;

        /* renamed from: a */
        public Language invoke() {
            return ((IMmRecordToolbarDependency) this.f118172a.mo161247w()).mo164793b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46935b(MmRecordToolbarViewControl eVar) {
            this.f118172a = eVar;
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        ((IMmRecordToolbarDependency) mo161247w()).mo164791a(C46946g.INSTANCE);
        if (((IMmRecordToolbarDependency) mo161247w()).mo164789a().isRecordingDevice()) {
            m185894b();
        } else {
            m185896f();
        }
    }

    /* renamed from: f */
    private final void m185896f() {
        RecordToolbarView recordToolbarView = this.f118165a;
        Intrinsics.checkExpressionValueIsNotNull(recordToolbarView, "recordToolbar");
        recordToolbarView.setVisibility(8);
        View findViewById = this.f118168d.mo161233o().findViewById(R.id.mm_record_bottom);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vcContext.getRootView().…w>(R.id.mm_record_bottom)");
        findViewById.setVisibility(0);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f118168d.mo161233o().findViewById(R.id.mm_record_bottom_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "bottomLikeBtn");
        C47110e.m186573a(lottieAnimationView, new C46944f(this, lottieAnimationView, (MmLikeLottieView) this.f118168d.mo161233o().findViewById(R.id.mm_record_bottom_like)));
        m185895b(((IMmRecordToolbarDependency) mo161247w()).mo164795d());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$e */
    public static final class C46940e extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmRecordToolbarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46940e(MmRecordToolbarViewControl eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RecordMenuDialog cVar;
            Dialog v_;
            RecordMenuDialog cVar2 = this.this$0.f118166b;
            if (cVar2 == null || (v_ = cVar2.v_()) == null || !v_.isShowing()) {
                StringBuilder sb = new StringBuilder();
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
                Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
                sb.append(domainDepend.mo144616a());
                sb.append("/minutes/");
                sb.append(((IMmRecordToolbarDependency) this.this$0.mo161247w()).mo164789a().getObjectToken());
                this.this$0.f118166b = new RecordMenuDialog(sb.toString(), new RecordMenu.IMenuDependency(this) {
                    /* class com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl.C46940e.C469411 */

                    /* renamed from: a */
                    final /* synthetic */ C46940e f118173a;

                    @Override // com.ss.android.lark.mm.module.record.detail.menu.RecordMenu.IMenuDependency
                    /* renamed from: a */
                    public MmBaseInfo mo164713a() {
                        return ((IMmRecordToolbarDependency) this.f118173a.this$0.mo161247w()).mo164789a();
                    }

                    @Override // com.ss.android.lark.mm.module.record.detail.menu.RecordMenu.IMenuDependency
                    /* renamed from: c */
                    public MmTranslateLangType mo164715c() {
                        return ((IMmRecordToolbarDependency) this.f118173a.this$0.mo161247w()).mo164795d();
                    }

                    @Override // com.ss.android.lark.mm.module.record.detail.menu.RecordMenu.IMenuDependency
                    /* renamed from: b */
                    public C47084f mo164714b() {
                        MmBaseInfo a = ((IMmRecordToolbarDependency) this.f118173a.this$0.mo161247w()).mo164789a();
                        return new C47084f(a.getMeetingId(), true, a.getObjectToken(), a.getObjectType(), a.isCanModify());
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f118173a = r1;
                    }
                });
                FragmentActivity a2 = C47107a.m186565a(this.this$0.f118168d.mo161232n());
                if (!(a2 == null || (cVar = this.this$0.f118166b) == null)) {
                    FragmentManager supportFragmentManager = a2.getSupportFragmentManager();
                    Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it.supportFragmentManager");
                    cVar.mo5511a(supportFragmentManager, "record");
                }
                RecordMenuDialog cVar3 = this.this$0.f118166b;
                if (cVar3 != null) {
                    cVar3.mo164720a(new Function0<Unit>(this) {
                        /* class com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl.C46940e.C469422 */
                        final /* synthetic */ C46940e this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            ((IMmRecordToolbarDependency) this.this$0.this$0.mo161247w()).mo164796e();
                        }
                    });
                }
                RecordMenuDialog cVar4 = this.this$0.f118166b;
                if (cVar4 != null) {
                    cVar4.mo164721b(new Function0<Unit>(this) {
                        /* class com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl.C46940e.C469433 */
                        final /* synthetic */ C46940e this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            ((IMmRecordToolbarDependency) this.this$0.this$0.mo161247w()).mo164797f();
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private final void m185894b() {
        RecordToolbarView recordToolbarView = this.f118165a;
        Intrinsics.checkExpressionValueIsNotNull(recordToolbarView, "recordToolbar");
        recordToolbarView.setVisibility(0);
        MmBaseInfo a = ((IMmRecordToolbarDependency) mo161247w()).mo164789a();
        ((IMmRecordToolbarDependency) mo161247w()).mo164792a(new C46934a(this));
        this.f118165a.setTrackContext(new C47084f(a.getMeetingId(), true, a.getObjectToken(), a.getObjectType(), a.isCanModify()));
        this.f118165a.mo164768a(new C46935b(this), new C46936c(this));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f118168d.mo161233o().findViewById(R.id.mm_record_reaction);
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "likeBtn");
        C47110e.m186573a(lottieAnimationView, new C46938d(this, lottieAnimationView));
        this.f118165a.setOnMoreActionListener(new C46940e(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/mm/module/record/model/Language;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$a */
    public static final class C46934a extends Lambda implements Function1<List<? extends Language>, Unit> {
        final /* synthetic */ MmRecordToolbarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46934a(MmRecordToolbarViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Language> list) {
            invoke(list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<? extends Language> list) {
            if (C47098d.m186535b(C47098d.m186533a(this.this$0.f118168d.mo161232n()))) {
                this.this$0.f118165a.mo164767a(list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "lan", "Lcom/ss/android/lark/mm/module/record/model/Language;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$c */
    public static final class C46936c extends Lambda implements Function1<Language, Unit> {
        final /* synthetic */ MmRecordToolbarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46936c(MmRecordToolbarViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Language language) {
            invoke(language);
            return Unit.INSTANCE;
        }

        public final void invoke(Language language) {
            Intrinsics.checkParameterIsNotNull(language, "lan");
            ((IMmRecordToolbarDependency) this.this$0.mo161247w()).mo164790a(language, new Function1<Language, Unit>(this) {
                /* class com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl.C46936c.C469371 */
                final /* synthetic */ C46936c this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Language language) {
                    invoke(language);
                    return Unit.INSTANCE;
                }

                public final void invoke(Language language) {
                    Intrinsics.checkParameterIsNotNull(language, "recordingLan");
                    if (C47098d.m186535b(C47098d.m186533a(this.this$0.this$0.f118168d.mo161232n()))) {
                        this.this$0.this$0.f118165a.setRecordingLanguage(language);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$d */
    public static final class C46938d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ LottieAnimationView $likeBtn;
        final /* synthetic */ MmRecordToolbarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46938d(MmRecordToolbarViewControl eVar, LottieAnimationView lottieAnimationView) {
            super(1);
            this.this$0 = eVar;
            this.$likeBtn = lottieAnimationView;
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
            C45855f.m181664c("MmRecordToolbarViewControl", "send reaction");
            C47083e.m186425a(this.this$0.f118165a.getTrackContext(), "vc_minutes_recording_click", C47086i.m186432a().mo165422d("create_reaction").mo165423e("none").mo165421c());
            this.$likeBtn.playAnimation();
            ((MmLikeLottieView) this.this$0.f118168d.mo161233o().findViewById(R.id.mm_record_like_big)).mo165610a();
            String json = new EmojiReaction("THUMBSUP", this.this$0.f118167c, UUID.randomUUID().toString()).toJson();
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
            Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
            C47057a.m186288f(domainDepend.mo144616a(), ((IMmRecordToolbarDependency) this.this$0.mo161247w()).mo164789a().getObjectToken(), json, new AbstractC47070c<String>() {
                /* class com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl.C46938d.C469391 */

                /* renamed from: a */
                public void mo161289a(String str) {
                    C45855f.m181663b("MmRecordToolbarViewControl", "onSuccess");
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    C45855f.m181666e("MmRecordToolbarViewControl", "error " + aVar);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$f */
    public static final class C46944f extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ LottieAnimationView $bottomLikeBtn;
        final /* synthetic */ MmLikeLottieView $reactionLikeBtn;
        final /* synthetic */ MmRecordToolbarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46944f(MmRecordToolbarViewControl eVar, LottieAnimationView lottieAnimationView, MmLikeLottieView mmLikeLottieView) {
            super(1);
            this.this$0 = eVar;
            this.$bottomLikeBtn = lottieAnimationView;
            this.$reactionLikeBtn = mmLikeLottieView;
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
            C45855f.m181664c("MmRecordToolbarViewControl", "click bottomLikeBtn, send reaction");
            this.$bottomLikeBtn.playAnimation();
            this.$reactionLikeBtn.mo165610a();
            String json = new EmojiReaction("THUMBSUP", ((IMmRecordToolbarDependency) this.this$0.mo161247w()).mo164794c(), UUID.randomUUID().toString()).toJson();
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
            Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
            C47057a.m186288f(domainDepend.mo144616a(), ((IMmRecordToolbarDependency) this.this$0.mo161247w()).mo164789a().getObjectToken(), json, new AbstractC47070c<String>() {
                /* class com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl.C46944f.C469451 */

                /* renamed from: a */
                public void mo161289a(String str) {
                    C45855f.m181663b("MmRecordToolbarViewControl", "onSuccess");
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    C45855f.m181666e("MmRecordToolbarViewControl", "error " + aVar);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.e$h */
    public static final class C46947h extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmRecordToolbarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46947h(MmRecordToolbarViewControl eVar) {
            super(1);
            this.this$0 = eVar;
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
            C45855f.m181664c("MmRecordToolbarViewControl", "start translate");
            ((IMmRecordToolbarDependency) this.this$0.mo161247w()).mo164791a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl.C46947h.C469481 */
                final /* synthetic */ C46947h this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    ((IMmRecordToolbarDependency) this.this$0.this$0.mo161247w()).mo164796e();
                }
            });
        }
    }

    @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarListener
    /* renamed from: a */
    public void mo164798a(int i) {
        if (i >= 0) {
            this.f118165a.mo164764a(i);
        }
    }

    @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarListener
    /* renamed from: a */
    public void mo164799a(long j) {
        this.f118167c = j;
        this.f118165a.mo164765a(j);
    }

    @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarListener
    /* renamed from: a */
    public void mo164801a(MmRecordManager.RecordState recordState) {
        Intrinsics.checkParameterIsNotNull(recordState, "it");
        this.f118165a.mo164766a(recordState);
    }

    @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarListener
    /* renamed from: a */
    public void mo164800a(MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
        C45855f.m181664c("MmRecordToolbarViewControl", " thirdViewer  onChangeTranslateLang, " + mmTranslateLangType.getValue());
        m185895b(mmTranslateLangType);
    }

    /* renamed from: b */
    private final void m185895b(MmTranslateLangType mmTranslateLangType) {
        int i = C46949f.f118174a[mmTranslateLangType.ordinal()];
        if (i == 1) {
            this.f118169e.setColorFilter(ContextCompat.getColor(this.f118168d.mo161232n(), R.color.lkui_N500));
            AppCompatImageView appCompatImageView = this.f118170f;
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "translateLangIcon");
            appCompatImageView.setVisibility(8);
        } else if (i == 2) {
            this.f118169e.setColorFilter(ContextCompat.getColor(this.f118168d.mo161232n(), R.color.mm_blue));
            AppCompatImageView appCompatImageView2 = this.f118170f;
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "translateLangIcon");
            appCompatImageView2.setVisibility(0);
            this.f118170f.setImageResource(R.drawable.mm_icon_zh);
        } else if (i == 3) {
            this.f118169e.setColorFilter(ContextCompat.getColor(this.f118168d.mo161232n(), R.color.mm_blue));
            AppCompatImageView appCompatImageView3 = this.f118170f;
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "translateLangIcon");
            appCompatImageView3.setVisibility(0);
            this.f118170f.setImageResource(R.drawable.mm_icon_en);
        } else if (i == 4) {
            this.f118169e.setColorFilter(ContextCompat.getColor(this.f118168d.mo161232n(), R.color.mm_blue));
            AppCompatImageView appCompatImageView4 = this.f118170f;
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView4, "translateLangIcon");
            appCompatImageView4.setVisibility(0);
            this.f118170f.setImageResource(R.drawable.mm_icon_ja);
        }
        AppCompatImageView appCompatImageView5 = this.f118169e;
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView5, "translateIcon");
        C47110e.m186573a(appCompatImageView5, new C46947h(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordToolbarViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmRecordToolbarListener, IMmRecordToolbarDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "baseViewControlAdapter");
        this.f118168d = gVar;
        this.f118171g = jVar;
        this.f118165a = (RecordToolbarView) gVar.mo161233o().findViewById(R.id.recordToolbar);
        this.f118169e = (AppCompatImageView) gVar.mo161233o().findViewById(R.id.translateIcon);
        this.f118170f = (AppCompatImageView) gVar.mo161233o().findViewById(R.id.translateLangIcon);
    }
}
