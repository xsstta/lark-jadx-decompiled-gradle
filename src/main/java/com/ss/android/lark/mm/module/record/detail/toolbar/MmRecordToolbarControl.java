package com.ss.android.lark.mm.module.record.detail.toolbar;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.module.record.model.MmRecordingLangSp;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J5\u0010\u0013\u001a\u00020\u00142-\b\u0002\u0010\u0015\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J$\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "currentRecordingLan", "Lcom/ss/android/lark/mm/module/record/model/Language;", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;Lcom/ss/android/lark/mm/module/record/model/Language;)V", "getBaseInfo", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getCurrentRecordingLan", "()Lcom/ss/android/lark/mm/module/record/model/Language;", "setCurrentRecordingLan", "(Lcom/ss/android/lark/mm/module/record/model/Language;)V", "languageList", "", "getLanguageList", "()Ljava/util/List;", "setLanguageList", "(Ljava/util/List;)V", "getRecordingLanguageList", "", "onResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreate", "setRecordingLanguage", "objectToken", "", "recordingLan", "Lkotlin/Function0;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.d */
public final class MmRecordToolbarControl extends MmBaseControl {

    /* renamed from: a */
    private List<? extends Language> f118159a;

    /* renamed from: b */
    private final MmBaseInfo f118160b;

    /* renamed from: c */
    private Language f118161c;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.mm.module.record.model.Language>, java.util.List<com.ss.android.lark.mm.module.record.model.Language> */
    /* renamed from: a */
    public final List<Language> mo164802a() {
        return this.f118159a;
    }

    /* renamed from: b */
    public final MmBaseInfo mo164806b() {
        return this.f118160b;
    }

    /* renamed from: c */
    public final Language mo164807c() {
        return this.f118161c;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: m */
    public void mo161236m() {
        super.mo161236m();
        m185880a(this, null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarControl$setRecordingLanguage$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.d$b */
    public static final class C46933b extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ Function0 f118164a;

        C46933b(Function0 function0) {
            this.f118164a = function0;
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            this.f118164a.invoke();
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f118164a.invoke();
        }
    }

    /* renamed from: a */
    public final void mo164804a(List<? extends Language> list) {
        this.f118159a = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/record/detail/toolbar/MmRecordToolbarControl$getRecordingLanguageList$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "Lcom/ss/android/lark/mm/module/record/model/Language;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.d$a */
    public static final class C46932a extends AbstractC47070c<List<? extends Language>> {

        /* renamed from: a */
        final /* synthetic */ MmRecordToolbarControl f118162a;

        /* renamed from: b */
        final /* synthetic */ Function1 f118163b;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
        }

        /* renamed from: a */
        public void mo161289a(List<? extends Language> list) {
            this.f118162a.mo164804a(list);
            Function1 function1 = this.f118163b;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(this.f118162a.mo164802a());
            }
        }

        C46932a(MmRecordToolbarControl dVar, Function1 function1) {
            this.f118162a = dVar;
            this.f118163b = function1;
        }
    }

    /* renamed from: a */
    public final void mo164805a(Function1<? super List<? extends Language>, Unit> function1) {
        List<? extends Language> list = this.f118159a;
        if (list == null) {
            C47057a.m186242a(this.f118160b.getObjectToken(), 1, new C46932a(this, function1));
        } else if (function1 != null) {
            function1.invoke(list);
        }
    }

    public MmRecordToolbarControl(MmBaseInfo mmBaseInfo, Language language) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        Intrinsics.checkParameterIsNotNull(language, "currentRecordingLan");
        this.f118160b = mmBaseInfo;
        this.f118161c = language;
    }

    /* renamed from: a */
    public final void mo164803a(String str, Language language, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        Intrinsics.checkParameterIsNotNull(language, "recordingLan");
        Intrinsics.checkParameterIsNotNull(function0, "onResult");
        this.f118161c = language;
        MmRecordingLangSp.f118185a.mo164881a(str, language);
        MmRecordingLangSp aVar = MmRecordingLangSp.f118185a;
        String language2 = language.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language2, "recordingLan.language");
        String languageName = language.getLanguageName();
        Intrinsics.checkExpressionValueIsNotNull(languageName, "recordingLan.languageName");
        aVar.mo164882a(language2, languageName);
        C47057a.m186290g(str, "", language.getLanguage(), new C46933b(function0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.record.detail.toolbar.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m185880a(MmRecordToolbarControl dVar, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        dVar.mo164805a(function1);
    }
}
