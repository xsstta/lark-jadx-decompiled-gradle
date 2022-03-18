package com.ss.android.lark.mm.module.translate;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.net.api.MmApiService2;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import io.reactivex.AbstractC68259a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/translate/MmTranslateControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "host", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "isRecordingDevice", "", "()Z", "setRecordingDevice", "(Z)V", "subtitleLanguages", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$SubtitleLanguage;", "getToken", "translateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getTranslateLangType", "()Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "setTranslateLangType", "(Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;)V", "getSubtitleTranslateLanguages", "", "loadTranslateLanguages", "", "onSuccess", "Lkotlin/Function0;", "setRecordingTranslateLang", "Lio/reactivex/Completable;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.b.d */
public final class MmTranslateControl extends MmBaseControl {

    /* renamed from: a */
    public final List<MmBaseInfo.SubtitleLanguage> f115732a = new ArrayList();

    /* renamed from: b */
    private MmTranslateLangType f115733b = MmTranslateLangType.DEFAULT;

    /* renamed from: c */
    private boolean f115734c;

    /* renamed from: d */
    private final String f115735d;

    /* renamed from: e */
    private final String f115736e;

    /* renamed from: a */
    public final MmTranslateLangType mo161280a() {
        return this.f115733b;
    }

    /* renamed from: b */
    public final boolean mo161285b() {
        return this.f115734c;
    }

    /* renamed from: c */
    public final List<MmBaseInfo.SubtitleLanguage> mo161286c() {
        return this.f115732a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/translate/MmTranslateControl$loadTranslateLanguages$1", "Lcom/ss/android/lark/mm/net/callback/IHttpRespCallback;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$MmBaseInfoResp;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "resp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.b.d$a */
    public static final class C45906a extends AbstractC47071d<MmBaseInfo.MmBaseInfoResp> {

        /* renamed from: a */
        final /* synthetic */ MmTranslateControl f115737a;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45906a(MmTranslateControl dVar) {
            this.f115737a = dVar;
        }

        /* renamed from: a */
        public void mo161289a(MmBaseInfo.MmBaseInfoResp mmBaseInfoResp) {
            List<MmBaseInfo.SubtitleLanguage> subtitleLanguages;
            Intrinsics.checkParameterIsNotNull(mmBaseInfoResp, "resp");
            MmTranslateControl dVar = this.f115737a;
            MmBaseInfo mmBaseInfo = (MmBaseInfo) mmBaseInfoResp.data;
            boolean z = true;
            if (mmBaseInfo == null || !mmBaseInfo.isRecordingDevice()) {
                z = false;
            }
            dVar.mo161283a(z);
            MmBaseInfo mmBaseInfo2 = (MmBaseInfo) mmBaseInfoResp.data;
            if (mmBaseInfo2 != null && (subtitleLanguages = mmBaseInfo2.getSubtitleLanguages()) != null) {
                this.f115737a.f115732a.clear();
                this.f115737a.f115732a.addAll(subtitleLanguages);
            }
        }
    }

    /* renamed from: a */
    public final void mo161281a(MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "<set-?>");
        this.f115733b = mmTranslateLangType;
    }

    /* renamed from: a */
    public final void mo161283a(boolean z) {
        this.f115734c = z;
    }

    /* renamed from: a */
    public final void mo161282a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
        if (this.f115732a.isEmpty()) {
            C47057a.m186251a(this.f115735d, this.f115736e, new C45906a(this));
        } else {
            function0.invoke();
        }
    }

    /* renamed from: b */
    public final AbstractC68259a mo161284b(MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLangType");
        C45855f.m181664c("MmTranslateControl", "setRecordingTranslateLang");
        return MmApiService2.f118430a.mo165287a(this.f115736e, mmTranslateLangType.getValue(), (String) null);
    }

    public MmTranslateControl(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        this.f115735d = str;
        this.f115736e = str2;
    }
}
