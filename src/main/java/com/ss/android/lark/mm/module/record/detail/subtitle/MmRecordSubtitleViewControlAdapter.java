package com.ss.android.lark.mm.module.record.detail.subtitle;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleControl;
import com.ss.android.lark.mm.module.record.model.MmRecordPara;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.p2288b.C45852d;
import io.reactivex.AbstractC68259a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleListener;", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleDependency;", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleControl$IMmRecordSubtitleControlListener;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleControl;)V", "getDependency", "getTranslateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "onCreate", "", "onDestroy", "onPushRecordSubtitle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.a.h */
public final class MmRecordSubtitleViewControlAdapter extends MmBaseViewControlAdapter<IMmRecordSubtitleListener, IMmRecordSubtitleDependency> implements MmRecordSubtitleControl.IMmRecordSubtitleControlListener {

    /* renamed from: a */
    public final MmRecordSubtitleControl f118077a;

    /* renamed from: b */
    private final MmViewControlRegister f118078b;

    /* renamed from: c */
    private final MmControlRegister f118079c;

    /* renamed from: b */
    public IMmRecordSubtitleDependency mo161230c() {
        return new C46900a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/record/detail/subtitle/IMmRecordSubtitleDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getParas", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/mm/module/record/model/MmRecordPara;", "getRecordingDuration", "", "loadPara", "", "pid", "onSuccess", "Lkotlin/Function1;", "loadSubtitles", "Lio/reactivex/Completable;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.h$a */
    public static final class C46900a implements IMmRecordSubtitleDependency {

        /* renamed from: a */
        final /* synthetic */ MmRecordSubtitleViewControlAdapter f118080a;

        @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleDependency
        /* renamed from: a */
        public ConcurrentHashMap<String, MmRecordPara> mo164656a() {
            return this.f118080a.f118077a.mo164669a();
        }

        @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleDependency
        /* renamed from: c */
        public MmBaseInfo mo164659c() {
            return this.f118080a.f118077a.mo164672b();
        }

        @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleDependency
        /* renamed from: b */
        public AbstractC68259a mo164658b() {
            return MmRecordSubtitleControl.m185729a(this.f118080a.f118077a, this.f118080a.mo164701e(), null, 2, null);
        }

        @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleDependency
        /* renamed from: d */
        public long mo164660d() {
            Long w = C45852d.m181651a().mo161150a(mo164659c().getObjectToken()).mo164541w();
            if (w != null) {
                return w.longValue();
            }
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46900a(MmRecordSubtitleViewControlAdapter hVar) {
            this.f118080a = hVar;
        }

        @Override // com.ss.android.lark.mm.module.record.detail.subtitle.IMmRecordSubtitleDependency
        /* renamed from: a */
        public void mo164657a(String str, Function1<? super MmRecordPara, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(str, "pid");
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            this.f118080a.f118077a.mo164671a(str, this.f118080a.mo164701e(), function1);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        this.f118077a.mo164670a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: d */
    public void mo161256d() {
        super.mo161256d();
        this.f118077a.mo164673b(this);
    }

    /* renamed from: e */
    public final MmTranslateLangType mo164701e() {
        MmTranslateLangType a;
        MmTranslateControl dVar = (MmTranslateControl) this.f118079c.mo161912a(MmTranslateControl.class);
        if (dVar == null || (a = dVar.mo161280a()) == null) {
            return MmTranslateLangType.DEFAULT;
        }
        return a;
    }

    @Override // com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleControl.IMmRecordSubtitleControlListener
    /* renamed from: a */
    public void mo164674a(MmRecordSentence mmRecordSentence) {
        Intrinsics.checkParameterIsNotNull(mmRecordSentence, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IMmRecordSubtitleListener cVar = (IMmRecordSubtitleListener) this.f118078b.mo161266d(IMmRecordSubtitleListener.class);
        if (cVar != null) {
            cVar.mo164662a(mmRecordSentence);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordSubtitleViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmRecordSubtitleControl eVar2) {
        super(kVar, eVar, eVar2);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(eVar2, "control");
        this.f118078b = kVar;
        this.f118079c = eVar;
        this.f118077a = eVar2;
    }
}
