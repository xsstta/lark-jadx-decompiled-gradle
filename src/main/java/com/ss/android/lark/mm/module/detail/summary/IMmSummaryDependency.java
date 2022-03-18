package com.ss.android.lark.mm.module.detail.summary;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\tH&J\n\u0010\r\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J-\u0010\u000f\u001a\u00020\u00032#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\tH&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0007H&J\u001c\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\tH&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "checkSummary", "", "contentId", "", "isChecked", "", "onResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getMentionSummaryId", "getOriginalContent", "getSummaries", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "getTranslateLanguage", "isInitialDisplaySummary", "loadBaseInfo", "onSuccess", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "notifyChangeSummaryTabVisible", "notifyDismissOriginSubtitleHighlight", "notifyFinishLoading", "notifyShowOriginTextDialog", "originText", "notifyTranslateBarHide", "notifyTranslateBarShow", "notifyUpdateViewDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.summary.a */
public interface IMmSummaryDependency extends IMmDependency {
    /* renamed from: a */
    String mo162611a();

    /* renamed from: a */
    String mo162612a(String str);

    /* renamed from: a */
    void mo162613a(String str, boolean z, Function1<? super Boolean, Unit> function1);

    /* renamed from: a */
    void mo162614a(Function1<? super MmBaseInfo, Unit> function1);

    /* renamed from: b */
    void mo162615b();

    /* renamed from: b */
    void mo162616b(String str);

    /* renamed from: b */
    void mo162617b(Function1<? super MmSummary, Unit> function1);

    /* renamed from: c */
    void mo162618c();

    /* renamed from: d */
    void mo162619d();

    /* renamed from: e */
    String mo162620e();

    /* renamed from: f */
    boolean mo162621f();

    /* renamed from: g */
    void mo162622g();

    /* renamed from: h */
    void mo162623h();

    /* renamed from: i */
    void mo162624i();
}
