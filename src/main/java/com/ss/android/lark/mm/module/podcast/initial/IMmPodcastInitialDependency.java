package com.ss.android.lark.mm.module.podcast.initial;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmBaseInfoDependency;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\u001c\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H&J\b\u0010\u0016\u001a\u00020\u0006H&¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/initial/IMmPodcastInitialDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmBaseInfoDependency;", "getListInfoList", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "getPodcastBg", "", "onSuccess", "Lkotlin/Function1;", "", "getSpeed", "", "getToken", "getUrl", "isPlaying", "", "isSilenceEnabled", "loadBaseInfoRx", "Lio/reactivex/Single;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "loadSubtitles", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "releasePlayer", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.a.a */
public interface IMmPodcastInitialDependency extends IMmBaseInfoDependency {
    /* renamed from: a */
    void mo164307a(Function1<? super String, Unit> function1);

    /* renamed from: b */
    Single<MmBaseInfo> mo164308b();

    /* renamed from: c */
    Single<MmSubtitles> mo164309c();

    /* renamed from: d */
    float mo164310d();

    /* renamed from: e */
    boolean mo164311e();

    /* renamed from: f */
    boolean mo164312f();

    /* renamed from: g */
    String mo164313g();

    /* renamed from: h */
    List<MmPodcastLinkInfo> mo164314h();

    /* renamed from: i */
    void mo164315i();

    /* renamed from: j */
    String mo164316j();
}
