package com.ss.android.lark.mm.module.detail.titlebar;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\u001c\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\fH&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0015H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0015H&J\b\u0010$\u001a\u00020\u0003H&¨\u0006%"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "changeTitle", "", "title", "", "onSuccess", "Lkotlin/Function0;", "deleteMm", "onData", "Lkotlin/Function1;", "detachVideoViewFromParent", "Landroid/view/View;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "getLatestPollVersion", "", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isRemoteVideoPlayable", "", "isValidateStatus", "notifyChangeTopic", "objectToken", "newName", "notifyDeleted", "notifyExitTranslate", "notifyMediaViewModeChange", "isNormal", "videoView", "notifyShowVideoView", "notifyStartTranslate", "notifySwitchComment", "switchOn", "notifySwitchReaction", "notifySwitchToSubtitleTab", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.titlebar.a */
public interface IMmDetailTitleBarDependency extends IMmDependency {
    /* renamed from: a */
    MmBaseInfo mo162732a();

    /* renamed from: a */
    void mo162733a(String str, String str2);

    /* renamed from: a */
    void mo162734a(String str, Function0<Unit> function0);

    /* renamed from: a */
    void mo162735a(Function1<? super String, Unit> function1);

    /* renamed from: a */
    void mo162736a(boolean z);

    /* renamed from: b */
    void mo162737b();

    /* renamed from: b */
    void mo162738b(boolean z);

    /* renamed from: c */
    void mo162739c();

    /* renamed from: d */
    MmTranslateLangType mo162740d();

    /* renamed from: e */
    boolean mo162741e();

    /* renamed from: f */
    boolean mo162742f();

    /* renamed from: g */
    void mo162743g();

    /* renamed from: h */
    int mo162744h();

    /* renamed from: i */
    String mo162745i();
}
