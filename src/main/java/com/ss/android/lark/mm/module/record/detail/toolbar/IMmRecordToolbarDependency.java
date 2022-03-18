package com.ss.android.lark.mm.module.record.detail.toolbar;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.record.model.Language;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u000fH&J7\u0010\u0010\u001a\u00020\u00032-\b\u0002\u0010\u0006\u001a'\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\b\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/IMmRecordToolbarDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "changeRecordingLanguage", "", "lan", "Lcom/ss/android/lark/mm/module/record/model/Language;", "onResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "recordingLan", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getCurrentRecordingLanguage", "getRecordCurrentTime", "", "getRecordingLanguageList", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getTranslateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "loadTranslateLanguages", "onSuccess", "Lkotlin/Function0;", "notifyExitTranslate", "notifyStartTranslate", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.a */
public interface IMmRecordToolbarDependency extends IMmDependency {
    /* renamed from: a */
    MmBaseInfo mo164789a();

    /* renamed from: a */
    void mo164790a(Language language, Function1<? super Language, Unit> function1);

    /* renamed from: a */
    void mo164791a(Function0<Unit> function0);

    /* renamed from: a */
    void mo164792a(Function1<? super List<? extends Language>, Unit> function1);

    /* renamed from: b */
    Language mo164793b();

    /* renamed from: c */
    long mo164794c();

    /* renamed from: d */
    MmTranslateLangType mo164795d();

    /* renamed from: e */
    void mo164796e();

    /* renamed from: f */
    void mo164797f();
}
