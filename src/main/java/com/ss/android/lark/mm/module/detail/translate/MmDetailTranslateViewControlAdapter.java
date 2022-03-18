package com.ss.android.lark.mm.module.detail.translate;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.comment.MmCommentControl;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener;
import com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.summary.IMmSummaryListener;
import com.ss.android.lark.mm.module.detail.summary.MmSummaryControl;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.translate.IMmTranslateDependency;
import com.ss.android.lark.mm.module.translate.IMmTranslateListener;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.net.error.MmTranslateLocalErrorHandler;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.AbstractC68315g;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmDetailTranslateViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateListener;", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/translate/MmTranslateControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/translate/MmTranslateControl;)V", "getDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.translate.a */
public final class MmDetailTranslateViewControlAdapter extends MmBaseViewControlAdapter<IMmTranslateListener, IMmTranslateDependency> {

    /* renamed from: a */
    public final MmViewControlRegister f116637a;

    /* renamed from: b */
    public final MmControlRegister f116638b;

    /* renamed from: c */
    public final MmTranslateControl f116639c;

    /* renamed from: b */
    public IMmTranslateDependency mo161230c() {
        return new C46300a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/mm/module/detail/translate/MmDetailTranslateViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateDependency;", "doTranslating", "Lio/reactivex/Completable;", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getCurrentTranslateLang", "getOriginSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "getSubtitleLanguages", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$SubtitleLanguage;", "isRecording", "", "isRecordingViewer", "notifyExitOriginTextDialog", "", "notifyTranslateSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.a$a */
    public static final class C46300a implements IMmTranslateDependency {

        /* renamed from: a */
        final /* synthetic */ MmDetailTranslateViewControlAdapter f116640a;

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: a */
        public boolean mo161268a() {
            return false;
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: b */
        public boolean mo161269b() {
            return false;
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: f */
        public MmTranslateLangType mo161273f() {
            return this.f116640a.f116639c.mo161280a();
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: c */
        public MmMeetingSubtitles mo161270c() {
            MmMeetingSubtitleControl dVar = (MmMeetingSubtitleControl) this.f116640a.f116638b.mo161912a(MmMeetingSubtitleControl.class);
            if (dVar != null) {
                return dVar.mo162296a();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: d */
        public void mo161271d() {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116640a.f116637a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162293k();
            }
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: e */
        public List<MmBaseInfo.SubtitleLanguage> mo161272e() {
            MmBaseInfo b;
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116640a.f116638b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl == null || (b = mmMeetingBaseInfoControl.mo161581b()) == null) {
                return null;
            }
            return b.getSubtitleLanguages();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46300a(MmDetailTranslateViewControlAdapter aVar) {
            this.f116640a = aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.translate.a$a$a */
        static final class C46301a<T> implements AbstractC69013u<T> {

            /* renamed from: a */
            public static final C46301a f116641a = new C46301a();

            C46301a() {
            }

            @Override // io.reactivex.AbstractC69013u
            public final void subscribe(AbstractC69011s<MmSummary> sVar) {
                Intrinsics.checkParameterIsNotNull(sVar, "it");
                sVar.onSuccess(new MmSummary());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.translate.a$a$c */
        static final class C46303c<T> implements Consumer<List<? extends Object>> {

            /* renamed from: a */
            final /* synthetic */ C46300a f116643a;

            /* renamed from: b */
            final /* synthetic */ MmTranslateLangType f116644b;

            C46303c(C46300a aVar, MmTranslateLangType mmTranslateLangType) {
                this.f116643a = aVar;
                this.f116644b = mmTranslateLangType;
            }

            /* renamed from: a */
            public final void accept(List<? extends Object> list) {
                this.f116643a.f116640a.f116639c.mo161281a(this.f116644b);
                C46300a aVar = this.f116643a;
                MmTranslateLangType mmTranslateLangType = this.f116644b;
                Intrinsics.checkExpressionValueIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                aVar.mo162759a(mmTranslateLangType, list);
                if (this.f116644b != MmTranslateLangType.DEFAULT) {
                    this.f116643a.mo161271d();
                }
            }
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: a */
        public AbstractC68259a mo161267a(MmTranslateLangType mmTranslateLangType) {
            Single single;
            Single single2;
            Single<MmSummary> single3;
            Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
            MmMeetingSubtitleControl dVar = (MmMeetingSubtitleControl) this.f116640a.f116638b.mo161912a(MmMeetingSubtitleControl.class);
            Single<MmComment> single4 = null;
            if (dVar != null) {
                single = MmMeetingSubtitleControl.m182875a(dVar, mmTranslateLangType, false, new MmTranslateLocalErrorHandler(), 2, null);
            } else {
                single = null;
            }
            Single single5 = single;
            MmMeetingSubtitleControl dVar2 = (MmMeetingSubtitleControl) this.f116640a.f116638b.mo161912a(MmMeetingSubtitleControl.class);
            if (dVar2 != null) {
                single2 = MmMeetingSubtitleControl.m182874a(dVar2, mmTranslateLangType, false, 2, (Object) null);
            } else {
                single2 = null;
            }
            Single single6 = single2;
            MmCommentControl dVar3 = (MmCommentControl) this.f116640a.f116638b.mo161912a(MmCommentControl.class);
            if (dVar3 != null) {
                single4 = dVar3.mo161689a(mmTranslateLangType);
            }
            Single<MmComment> single7 = single4;
            MmSummaryControl dVar4 = (MmSummaryControl) this.f116640a.f116638b.mo161912a(MmSummaryControl.class);
            if (dVar4 == null || (single3 = dVar4.mo162629a(mmTranslateLangType)) == null) {
                single3 = Single.create(C46301a.f116641a);
            }
            AbstractC68259a ignoreElement = Single.zip(single5, single6, single7, single3, C46302b.f116642a).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSuccess(new C46303c(this, mmTranslateLangType)).ignoreElement();
            Intrinsics.checkExpressionValueIsNotNull(ignoreElement, "Single.zip(controlRegist…        }.ignoreElement()");
            return ignoreElement;
        }

        /* renamed from: a */
        public void mo162759a(MmTranslateLangType mmTranslateLangType, List<? extends Object> list) {
            Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116640a.f116637a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162284a(mmTranslateLangType, list);
            }
            IMmSummaryListener cVar2 = (IMmSummaryListener) this.f116640a.f116637a.mo161266d(IMmSummaryListener.class);
            if (cVar2 != null) {
                Object obj = list.get(3);
                if (!(obj instanceof MmSummary)) {
                    obj = null;
                }
                cVar2.mo162626a((MmSummary) obj);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "", "t1", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "t2", "", "t3", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "t4", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.translate.a$a$b */
        static final class C46302b<T1, T2, T3, T4, R> implements AbstractC68315g<MmMeetingSubtitles, List<? extends String>, MmComment, MmSummary, List<? extends Object>> {

            /* renamed from: a */
            public static final C46302b f116642a = new C46302b();

            C46302b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // io.reactivex.functions.AbstractC68315g
            /* renamed from: a */
            public /* bridge */ /* synthetic */ List<? extends Object> mo161434a(MmMeetingSubtitles mmMeetingSubtitles, List<? extends String> list, MmComment mmComment, MmSummary mmSummary) {
                return mo162760a(mmMeetingSubtitles, (List<String>) list, mmComment, mmSummary);
            }

            /* renamed from: a */
            public final List<Object> mo162760a(MmMeetingSubtitles mmMeetingSubtitles, List<String> list, MmComment mmComment, MmSummary mmSummary) {
                Intrinsics.checkParameterIsNotNull(mmMeetingSubtitles, "t1");
                Intrinsics.checkParameterIsNotNull(list, "t2");
                Intrinsics.checkParameterIsNotNull(mmComment, "t3");
                Intrinsics.checkParameterIsNotNull(mmSummary, "t4");
                return CollectionsKt.listOf(mmMeetingSubtitles, list, mmComment, mmSummary);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailTranslateViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmTranslateControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f116637a = kVar;
        this.f116638b = eVar;
        this.f116639c = dVar;
    }
}
