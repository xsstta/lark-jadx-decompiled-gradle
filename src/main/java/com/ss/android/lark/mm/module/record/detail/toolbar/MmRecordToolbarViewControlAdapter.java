package com.ss.android.lark.mm.module.record.detail.toolbar;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleInquirer;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.module.translate.IMmTranslateListener;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.p2288b.C45852d;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarListener;", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarControl;)V", "objectToken", "", "kotlin.jvm.PlatformType", "recordingManager", "Lcom/ss/android/lark/mm/module/record/MmRecordManager;", "getDependency", "onCreate", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.g */
public final class MmRecordToolbarViewControlAdapter extends MmBaseViewControlAdapter<IMmRecordToolbarListener, IMmRecordToolbarDependency> {

    /* renamed from: a */
    public final String f118175a;

    /* renamed from: b */
    public final MmViewControlRegister f118176b;

    /* renamed from: c */
    public final MmControlRegister f118177c;

    /* renamed from: d */
    public final MmRecordToolbarControl f118178d;

    /* renamed from: e */
    private final MmRecordManager f118179e;

    /* renamed from: b */
    public IMmRecordToolbarDependency mo161230c() {
        return new C46950a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J5\u0010\u0010\u001a\u00020\u00032+\u0010\u0006\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016¨\u0006\u001a"}, d2 = {"com/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarDependency;", "changeRecordingLanguage", "", "lan", "Lcom/ss/android/lark/mm/module/record/model/Language;", "onResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "recordingLan", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getCurrentRecordingLanguage", "getRecordCurrentTime", "", "getRecordingLanguageList", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getTranslateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "loadTranslateLanguages", "onSuccess", "Lkotlin/Function0;", "notifyExitTranslate", "notifyStartTranslate", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.g$a */
    public static final class C46950a implements IMmRecordToolbarDependency {

        /* renamed from: a */
        final /* synthetic */ MmRecordToolbarViewControlAdapter f118180a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.g$a$a */
        static final class C46951a extends Lambda implements Function0<Unit> {
            final /* synthetic */ Language $lan;
            final /* synthetic */ Function1 $onResult;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46951a(Function1 function1, Language language) {
                super(0);
                this.$onResult = function1;
                this.$lan = language;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.$onResult.invoke(this.$lan);
            }
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: a */
        public MmBaseInfo mo164789a() {
            return this.f118180a.f118178d.mo164806b();
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: b */
        public Language mo164793b() {
            return this.f118180a.f118178d.mo164807c();
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: c */
        public long mo164794c() {
            IMmRecordSubtitleInquirer bVar = (IMmRecordSubtitleInquirer) this.f118180a.f118176b.mo161259a(IMmRecordSubtitleInquirer.class);
            if (bVar != null) {
                return bVar.mo164661a();
            }
            return 0;
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: d */
        public MmTranslateLangType mo164795d() {
            MmTranslateLangType a;
            MmTranslateControl dVar = (MmTranslateControl) this.f118180a.f118177c.mo161912a(MmTranslateControl.class);
            if (dVar == null || (a = dVar.mo161280a()) == null) {
                return MmTranslateLangType.DEFAULT;
            }
            return a;
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: e */
        public void mo164796e() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f118180a.f118176b.mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161276b();
            }
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: f */
        public void mo164797f() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f118180a.f118176b.mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161277f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46950a(MmRecordToolbarViewControlAdapter gVar) {
            this.f118180a = gVar;
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: a */
        public void mo164792a(Function1<? super List<? extends Language>, Unit> function1) {
            this.f118180a.f118178d.mo164805a(function1);
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: a */
        public void mo164791a(Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
            MmTranslateControl dVar = (MmTranslateControl) this.f118180a.f118177c.mo161912a(MmTranslateControl.class);
            if (dVar != null) {
                dVar.mo161282a(function0);
            }
        }

        @Override // com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarDependency
        /* renamed from: a */
        public void mo164790a(Language language, Function1<? super Language, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(language, "lan");
            Intrinsics.checkParameterIsNotNull(function1, "onResult");
            MmRecordToolbarControl dVar = this.f118180a.f118178d;
            String str = this.f118180a.f118175a;
            Intrinsics.checkExpressionValueIsNotNull(str, "objectToken");
            dVar.mo164803a(str, language, new C46951a(function1, language));
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        mo161257h().mo237938a(this.f118179e.mo164524b().subscribe(new C46952b(this)), this.f118179e.mo164525c().subscribe(new C46953c(this)), this.f118179e.mo164526d().throttleFirst(1, TimeUnit.SECONDS).subscribe(new C46954d(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.g$b */
    static final class C46952b<T> implements Consumer<Pair<? extends String, ? extends MmRecordManager.RecordState>> {

        /* renamed from: a */
        final /* synthetic */ MmRecordToolbarViewControlAdapter f118181a;

        C46952b(MmRecordToolbarViewControlAdapter gVar) {
            this.f118181a = gVar;
        }

        /* renamed from: a */
        public final void accept(Pair<String, ? extends MmRecordManager.RecordState> pair) {
            IMmRecordToolbarListener cVar = (IMmRecordToolbarListener) this.f118181a.f118176b.mo161266d(IMmRecordToolbarListener.class);
            if (cVar != null) {
                cVar.mo164801a((MmRecordManager.RecordState) pair.getSecond());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.g$c */
    static final class C46953c<T> implements Consumer<Pair<? extends String, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ MmRecordToolbarViewControlAdapter f118182a;

        C46953c(MmRecordToolbarViewControlAdapter gVar) {
            this.f118182a = gVar;
        }

        /* renamed from: a */
        public final void accept(Pair<String, Integer> pair) {
            IMmRecordToolbarListener cVar = (IMmRecordToolbarListener) this.f118182a.f118176b.mo161266d(IMmRecordToolbarListener.class);
            if (cVar != null) {
                cVar.mo164798a(pair.getSecond().intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.g$d */
    static final class C46954d<T> implements Consumer<Pair<? extends String, ? extends Long>> {

        /* renamed from: a */
        final /* synthetic */ MmRecordToolbarViewControlAdapter f118183a;

        C46954d(MmRecordToolbarViewControlAdapter gVar) {
            this.f118183a = gVar;
        }

        /* renamed from: a */
        public final void accept(Pair<String, Long> pair) {
            IMmRecordToolbarListener cVar = (IMmRecordToolbarListener) this.f118183a.f118176b.mo161266d(IMmRecordToolbarListener.class);
            if (cVar != null) {
                cVar.mo164799a(pair.getSecond().longValue());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordToolbarViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmRecordToolbarControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f118176b = kVar;
        this.f118177c = eVar;
        this.f118178d = dVar;
        String objectToken = dVar.mo164806b().getObjectToken();
        this.f118175a = objectToken;
        this.f118179e = C45852d.m181651a().mo161150a(objectToken);
    }
}
