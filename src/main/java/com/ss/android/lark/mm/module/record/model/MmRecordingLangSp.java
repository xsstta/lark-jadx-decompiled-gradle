package com.ss.android.lark.mm.module.record.model;

import com.ss.android.lark.mm.external.MmSp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/module/record/model/MmRecordingLangSp;", "", "()V", "LAST_RECORDING_LANG_NAME_PREFIX", "", "LAST_RECORDING_LANG_PREFIX", "RECORDING_LANG_PREFIX", "getLastRecordingLang", "Lcom/ss/android/lark/mm/module/record/model/Language;", "getSpecificRecordingLang", "objectToken", "putLastRecordingLang", "", "recordingLan", "recordingName", "putSpecificRecordingLang", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.model.a */
public final class MmRecordingLangSp {

    /* renamed from: a */
    public static final MmRecordingLangSp f118185a = new MmRecordingLangSp();

    private MmRecordingLangSp() {
    }

    /* renamed from: a */
    public final Language mo164879a() {
        boolean z;
        String a = MmSp.f115679a.mo161156a("last_recording_lang_prefix", "");
        String a2 = MmSp.f115679a.mo161156a("last_recording_lang_name_prefix", "");
        String str = a;
        boolean z2 = false;
        if (str == null || StringsKt.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str2 = a2;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        return new Language(a2, a);
    }

    /* renamed from: a */
    public final String mo164880a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        MmSp hVar = MmSp.f115679a;
        return hVar.mo161156a("recording_lang_prefix" + str, "");
    }

    /* renamed from: a */
    public final void mo164881a(String str, Language language) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        Intrinsics.checkParameterIsNotNull(language, "recordingLan");
        MmSp hVar = MmSp.f115679a;
        hVar.mo161161b("recording_lang_prefix" + str, language.getLanguage());
    }

    /* renamed from: a */
    public final void mo164882a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "recordingLan");
        Intrinsics.checkParameterIsNotNull(str2, "recordingName");
        MmSp.f115679a.mo161161b("last_recording_lang_prefix", str);
        MmSp.f115679a.mo161161b("last_recording_lang_name_prefix", str2);
    }
}
