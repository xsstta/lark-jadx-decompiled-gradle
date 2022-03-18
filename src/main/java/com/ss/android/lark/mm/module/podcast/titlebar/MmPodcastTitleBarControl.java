package com.ss.android.lark.mm.module.podcast.titlebar;

import com.ss.android.lark.mm.module.framework.MmBaseControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/titlebar/MmPodcastTitleBarControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.b.d */
public final class MmPodcastTitleBarControl extends MmBaseControl {

    /* renamed from: a */
    private String f117695a;

    /* renamed from: a */
    public final void mo164356a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f117695a = str;
    }

    public MmPodcastTitleBarControl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f117695a = str;
    }
}
