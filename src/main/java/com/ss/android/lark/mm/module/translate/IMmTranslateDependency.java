package com.ss.android.lark.mm.module.translate;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import io.reactivex.AbstractC68259a;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/translate/IMmTranslateDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "doTranslating", "Lio/reactivex/Completable;", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "getCurrentTranslateLang", "getOriginSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "getSubtitleLanguages", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$SubtitleLanguage;", "isRecording", "", "isRecordingViewer", "notifyExitOriginTextDialog", "", "notifyTranslateSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.b.a */
public interface IMmTranslateDependency extends IMmDependency {
    /* renamed from: a */
    AbstractC68259a mo161267a(MmTranslateLangType mmTranslateLangType);

    /* renamed from: a */
    boolean mo161268a();

    /* renamed from: b */
    boolean mo161269b();

    /* renamed from: c */
    MmMeetingSubtitles mo161270c();

    /* renamed from: d */
    void mo161271d();

    /* renamed from: e */
    List<MmBaseInfo.SubtitleLanguage> mo161272e();

    /* renamed from: f */
    MmTranslateLangType mo161273f();
}
