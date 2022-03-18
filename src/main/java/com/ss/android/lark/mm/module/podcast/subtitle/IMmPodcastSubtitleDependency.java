package com.ss.android.lark.mm.module.podcast.subtitle;

import com.ss.android.lark.mm.module.framework.IMmBaseInfoDependency;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/subtitle/IMmPodcastSubtitleDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmBaseInfoDependency;", "getPodcastSubtitles", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "isPlaying", "", "loadPodcastSubtitle", "", "onLoadSuccess", "Lkotlin/Function1;", "notifyChangePlaceholder", "isShow", "notifyDismissLoading", "notifySeekToPosition", "timestamp", "", "notifyStartPlay", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.a */
public interface IMmPodcastSubtitleDependency extends IMmBaseInfoDependency {
    /* renamed from: a */
    void mo164396a(long j);

    /* renamed from: a */
    void mo164397a(Function1<? super MmSubtitles, Unit> function1);

    /* renamed from: a */
    void mo164398a(boolean z);

    /* renamed from: b */
    MmSubtitles mo164399b();

    /* renamed from: c */
    void mo164400c();

    /* renamed from: d */
    boolean mo164401d();

    /* renamed from: e */
    void mo164402e();
}
