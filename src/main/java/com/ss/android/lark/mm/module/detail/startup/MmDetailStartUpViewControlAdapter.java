package com.ss.android.lark.mm.module.detail.startup;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailListener;
import com.ss.android.lark.mm.module.detail.main.IMmDetailListener;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener;
import com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.summary.IMmSummaryListener;
import com.ss.android.lark.mm.module.detail.summary.MmSummaryControl;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.share.model.ApplyInfo;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.utils.MmRxThrowable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpListener;", "Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmMeetingBaseInfoControl;", "mControlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/baseinfo/MmMeetingBaseInfoControl;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;)V", "getDependency", "onCreate", "", "uploadAppreciableError", "it", "", "userAction", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.b.e */
public final class MmDetailStartUpViewControlAdapter extends MmBaseViewControlAdapter<IMmDetailStartUpListener, IMmDetailStartUpDependency> {

    /* renamed from: a */
    public final MmViewControlRegister f115853a;

    /* renamed from: b */
    public final MmMeetingBaseInfoControl f115854b;

    /* renamed from: c */
    public final MmControlRegister f115855c;

    /* renamed from: b */
    public IMmDetailStartUpDependency mo161230c() {
        return new C45966a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000eH\u0016¨\u0006\u001a"}, d2 = {"com/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpDependency;", "applyInfo", "", "onData", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/share/model/ApplyInfo;", "checkHasSummary", "Lio/reactivex/Single;", "", "isRefresh", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getRequestId", "", "getUrl", "isBaseInfoLoaded", "loadBaseInfo", "loadKeywords", "", "loadSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "notifyChangeSummaryTabVisible", "notifyFragmentRefresh", "refresh", "sendApply", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.e$a */
    public static final class C45966a implements IMmDetailStartUpDependency {

        /* renamed from: a */
        final /* synthetic */ MmDetailStartUpViewControlAdapter f115856a;

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: b */
        public MmBaseInfo mo161405b() {
            return this.f115856a.f115854b.mo161581b();
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: c */
        public void mo161408c() {
            IMmDetailListener cVar = (IMmDetailListener) this.f115856a.f115853a.mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                cVar.mo161906i();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: d */
        public void mo161410d() {
            IMmSummaryListener cVar = (IMmSummaryListener) this.f115856a.f115853a.mo161266d(IMmSummaryListener.class);
            if (cVar != null) {
                cVar.mo162628b();
            }
            IMmContentDetailListener cVar2 = (IMmContentDetailListener) this.f115856a.f115853a.mo161266d(IMmContentDetailListener.class);
            if (cVar2 != null) {
                cVar2.mo161352b();
            }
            IMmMeetingSubtitleListener cVar3 = (IMmMeetingSubtitleListener) this.f115856a.f115853a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar3 != null) {
                cVar3.mo162294l();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: a */
        public void mo161402a() {
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) this.f115856a.f115853a.mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                cVar.mo164220j();
            }
            MmMeetingBaseInfoControl.m182198a(this.f115856a.f115854b, C45971e.INSTANCE, null, false, false, 14, null);
            IMmMeetingSubtitleListener cVar2 = (IMmMeetingSubtitleListener) this.f115856a.f115853a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar2 != null) {
                cVar2.mo162294l();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.b.e$a$e */
        static final class C45971e extends Lambda implements Function1<MmBaseInfo, Unit> {
            public static final C45971e INSTANCE = new C45971e();

            C45971e() {
                super(1);
            }

            public final void invoke(MmBaseInfo mmBaseInfo) {
                Intrinsics.checkParameterIsNotNull(mmBaseInfo, "it");
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
                invoke(mmBaseInfo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45966a(MmDetailStartUpViewControlAdapter eVar) {
            this.f115856a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.b.e$a$a */
        static final class C45967a<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C45966a f115857a;

            C45967a(C45966a aVar) {
                this.f115857a = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                MmDetailStartUpViewControlAdapter eVar = this.f115857a.f115856a;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                eVar.mo161438a(th, "summaries");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.b.e$a$b */
        static final class C45968b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C45966a f115858a;

            C45968b(C45966a aVar) {
                this.f115858a = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                MmDetailStartUpViewControlAdapter eVar = this.f115858a.f115856a;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                eVar.mo161438a(th, "BaseInfo");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.b.e$a$c */
        static final class C45969c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C45966a f115859a;

            C45969c(C45966a aVar) {
                this.f115859a = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                MmDetailStartUpViewControlAdapter eVar = this.f115859a.f115856a;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                eVar.mo161438a(th, "keywords");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.b.e$a$d */
        static final class C45970d<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C45966a f115860a;

            C45970d(C45966a aVar) {
                this.f115860a = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                MmDetailStartUpViewControlAdapter eVar = this.f115860a.f115856a;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                eVar.mo161438a(th, "subtitles");
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: a */
        public void mo161403a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "applyInfo");
            this.f115856a.f115854b.mo161582b(str);
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: a */
        public void mo161404a(Function1<? super ApplyInfo, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onData");
            this.f115856a.f115854b.mo161577a(function1);
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: a */
        public Single<MmBaseInfo> mo161401a(boolean z) {
            Single<MmBaseInfo> single;
            if (z) {
                single = MmMeetingBaseInfoControl.m182196a(this.f115856a.f115854b, false, 1, (Object) null);
            } else {
                single = this.f115856a.f115854b.mo161591i();
            }
            Single<MmBaseInfo> doOnError = single.doOnError(new C45968b(this));
            Intrinsics.checkExpressionValueIsNotNull(doOnError, "request.doOnError {\n    …eInfo\")\n                }");
            return doOnError;
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: c */
        public Single<Boolean> mo161407c(boolean z) {
            Single<Boolean> a;
            Single<Boolean> doOnError;
            MmSummaryControl dVar = (MmSummaryControl) this.f115856a.f115855c.mo161912a(MmSummaryControl.class);
            if (dVar != null && (a = dVar.mo162630a(z)) != null && (doOnError = a.doOnError(new C45967a(this))) != null) {
                return doOnError;
            }
            Single<Boolean> just = Single.just(false);
            Intrinsics.checkExpressionValueIsNotNull(just, "Single.just(false)");
            return just;
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: b */
        public Single<MmMeetingSubtitles> mo161406b(boolean z) {
            Single<MmMeetingSubtitles> doOnError;
            Single<MmMeetingSubtitles> single = null;
            if (z) {
                MmMeetingSubtitleControl dVar = (MmMeetingSubtitleControl) this.f115856a.f115855c.mo161912a(MmMeetingSubtitleControl.class);
                if (dVar != null) {
                    single = MmMeetingSubtitleControl.m182875a(dVar, MmTranslateLangType.DEFAULT, true, null, 4, null);
                }
            } else {
                MmMeetingSubtitleControl dVar2 = (MmMeetingSubtitleControl) this.f115856a.f115855c.mo161912a(MmMeetingSubtitleControl.class);
                if (dVar2 != null) {
                    single = dVar2.mo162309e();
                }
            }
            if (single != null && (doOnError = single.doOnError(new C45970d(this))) != null) {
                return doOnError;
            }
            Single<MmMeetingSubtitles> just = Single.just(new MmMeetingSubtitles());
            Intrinsics.checkExpressionValueIsNotNull(just, "Single.just(MmMeetingSubtitles())");
            return just;
        }

        @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpDependency
        /* renamed from: d */
        public Single<List<String>> mo161409d(boolean z) {
            Single<List<String>> doOnError;
            Single<List<String>> single = null;
            if (z) {
                MmMeetingSubtitleControl dVar = (MmMeetingSubtitleControl) this.f115856a.f115855c.mo161912a(MmMeetingSubtitleControl.class);
                if (dVar != null) {
                    single = dVar.mo162297a(MmTranslateLangType.DEFAULT, true);
                }
            } else {
                MmMeetingSubtitleControl dVar2 = (MmMeetingSubtitleControl) this.f115856a.f115855c.mo161912a(MmMeetingSubtitleControl.class);
                if (dVar2 != null) {
                    single = dVar2.mo162310f();
                }
            }
            if (single != null && (doOnError = single.doOnError(new C45969c(this))) != null) {
                return doOnError;
            }
            Single<List<String>> just = Single.just(CollectionsKt.emptyList());
            Intrinsics.checkExpressionValueIsNotNull(just, "Single.just(emptyList())");
            return just;
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        mo161257h().mo237938a(this.f115854b.mo161584c().subscribe(new C45972b(this)), this.f115854b.mo161586d().subscribe(new C45973c(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmMeetingBaseInfoControl$DataError;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.e$b */
    static final class C45972b<T> implements Consumer<MmMeetingBaseInfoControl.DataError> {

        /* renamed from: a */
        final /* synthetic */ MmDetailStartUpViewControlAdapter f115861a;

        C45972b(MmDetailStartUpViewControlAdapter eVar) {
            this.f115861a = eVar;
        }

        /* renamed from: a */
        public final void accept(MmMeetingBaseInfoControl.DataError dataError) {
            IMmDetailStartUpListener cVar = (IMmDetailStartUpListener) this.f115861a.mo161258i();
            if (cVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(dataError, "it");
                cVar.mo161412a(dataError);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.e$c */
    static final class C45973c<T> implements Consumer<PermissionStatus> {

        /* renamed from: a */
        final /* synthetic */ MmDetailStartUpViewControlAdapter f115862a;

        C45973c(MmDetailStartUpViewControlAdapter eVar) {
            this.f115862a = eVar;
        }

        /* renamed from: a */
        public final void accept(PermissionStatus permissionStatus) {
            Integer num;
            IMmDetailStartUpListener cVar;
            MmBaseInfo b = this.f115862a.f115854b.mo161581b();
            if (b != null && b.isRecordingObjectType()) {
                MmBaseInfo b2 = this.f115862a.f115854b.mo161581b();
                if (b2 == null || b2.getObjectStatus() != ObjectStatus.Complete.getValue()) {
                    if (permissionStatus != null) {
                        num = permissionStatus.getObjectStatus();
                    } else {
                        num = null;
                    }
                    int value = ObjectStatus.Complete.getValue();
                    if (num != null && num.intValue() == value && (cVar = (IMmDetailStartUpListener) this.f115862a.mo161258i()) != null) {
                        cVar.mo161414d();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo161438a(Throwable th, String str) {
        if (th instanceof MmRxThrowable) {
            MmRxThrowable mmRxThrowable = (MmRxThrowable) th;
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.VideoConference, Scene.MinutesDetail, Event.minutes_load_detail_error, ErrorType.Network, ErrorLevel.Exception, mmRxThrowable.getErrorCode(), str, null, mmRxThrowable.getErrorMessage(), false, MapsKt.mapOf(TuplesKt.to("objecttoken", this.f115854b.mo161572a())), null, null, 6144, null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailStartUpViewControlAdapter(MmViewControlRegister kVar, MmMeetingBaseInfoControl mmMeetingBaseInfoControl, MmControlRegister eVar) {
        super(kVar, eVar, mmMeetingBaseInfoControl);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(mmMeetingBaseInfoControl, "control");
        Intrinsics.checkParameterIsNotNull(eVar, "mControlRegister");
        this.f115853a = kVar;
        this.f115854b = mmMeetingBaseInfoControl;
        this.f115855c = eVar;
    }
}
