package com.ss.android.lark.mm.module.record.detail.translate;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.subtitles.MmMeetingSubtitleControl;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleListener;
import com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleControl;
import com.ss.android.lark.mm.module.record.detail.toolbar.IMmRecordToolbarListener;
import com.ss.android.lark.mm.module.translate.IMmTranslateDependency;
import com.ss.android.lark.mm.module.translate.IMmTranslateListener;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.net.error.MmTranslateLocalErrorHandler;
import io.reactivex.AbstractC68259a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.AbstractC68309a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/translate/MmRecordTranslateViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateListener;", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/translate/MmTranslateControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/translate/MmTranslateControl;)V", "getDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.b.a */
public final class MmRecordTranslateViewControlAdapter extends MmBaseViewControlAdapter<IMmTranslateListener, IMmTranslateDependency> {

    /* renamed from: a */
    public final MmViewControlRegister f118081a;

    /* renamed from: b */
    public final MmControlRegister f118082b;

    /* renamed from: c */
    public final MmTranslateControl f118083c;

    /* renamed from: b */
    public IMmTranslateDependency mo161230c() {
        return new C46901a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/mm/module/record/detail/translate/MmRecordTranslateViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/translate/IMmTranslateDependency;", "doTranslating", "Lio/reactivex/Completable;", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getCurrentTranslateLang", "getOriginSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "getSubtitleLanguages", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$SubtitleLanguage;", "isRecording", "", "isRecordingViewer", "notifyExitOriginTextDialog", "", "notifyTranslateSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.b.a$a */
    public static final class C46901a implements IMmTranslateDependency {

        /* renamed from: a */
        final /* synthetic */ MmRecordTranslateViewControlAdapter f118084a;

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: b */
        public boolean mo161269b() {
            return true;
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: d */
        public void mo161271d() {
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: a */
        public boolean mo161268a() {
            return !this.f118084a.f118083c.mo161285b();
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: e */
        public List<MmBaseInfo.SubtitleLanguage> mo161272e() {
            return this.f118084a.f118083c.mo161286c();
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: f */
        public MmTranslateLangType mo161273f() {
            return this.f118084a.f118083c.mo161280a();
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: c */
        public MmMeetingSubtitles mo161270c() {
            MmMeetingSubtitleControl dVar = (MmMeetingSubtitleControl) this.f118084a.f118082b.mo161912a(MmMeetingSubtitleControl.class);
            if (dVar != null) {
                return dVar.mo162296a();
            }
            return null;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.b.a$a$a */
        static final class C46902a implements AbstractC68309a {

            /* renamed from: a */
            final /* synthetic */ C46901a f118085a;

            /* renamed from: b */
            final /* synthetic */ MmTranslateLangType f118086b;

            C46902a(C46901a aVar, MmTranslateLangType mmTranslateLangType) {
                this.f118085a = aVar;
                this.f118086b = mmTranslateLangType;
            }

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                this.f118085a.f118084a.f118083c.mo161281a(this.f118086b);
                IMmRecordSubtitleListener cVar = (IMmRecordSubtitleListener) this.f118085a.f118084a.f118081a.mo161266d(IMmRecordSubtitleListener.class);
                if (cVar != null) {
                    cVar.mo164663b();
                }
                IMmRecordToolbarListener cVar2 = (IMmRecordToolbarListener) this.f118085a.f118084a.f118081a.mo161266d(IMmRecordToolbarListener.class);
                if (cVar2 != null) {
                    cVar2.mo164800a(this.f118086b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46901a(MmRecordTranslateViewControlAdapter aVar) {
            this.f118084a = aVar;
        }

        @Override // com.ss.android.lark.mm.module.translate.IMmTranslateDependency
        /* renamed from: a */
        public AbstractC68259a mo161267a(MmTranslateLangType mmTranslateLangType) {
            AbstractC68259a aVar;
            AbstractC68259a a;
            Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
            AbstractC68259a b = this.f118084a.f118083c.mo161284b(mmTranslateLangType);
            MmRecordSubtitleControl eVar = (MmRecordSubtitleControl) this.f118084a.f118082b.mo161912a(MmRecordSubtitleControl.class);
            if (eVar == null || (a = eVar.mo164668a(mmTranslateLangType, new MmTranslateLocalErrorHandler())) == null) {
                aVar = AbstractC68259a.m264983a();
            } else {
                aVar = a;
            }
            AbstractC68259a a2 = b.mo237887b(aVar).mo237881a(AndroidSchedulers.mainThread()).mo237883a(new C46902a(this, mmTranslateLangType));
            Intrinsics.checkExpressionValueIsNotNull(a2, "control.setRecordingTran…ng)\n                    }");
            return a2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordTranslateViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmTranslateControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f118081a = kVar;
        this.f118082b = eVar;
        this.f118083c = dVar;
    }
}
