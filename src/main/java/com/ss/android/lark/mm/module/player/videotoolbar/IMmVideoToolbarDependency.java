package com.ss.android.lark.mm.module.player.videotoolbar;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0016H&J\b\u0010\u001a\u001a\u00020\u0016H&J\b\u0010\u001b\u001a\u00020\u0016H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0016H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H\u0016J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000eH&J\b\u0010+\u001a\u00020\u0003H\u0016J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0016H\u0016¨\u0006/"}, d2 = {"Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "destroyVideoPlayer", "", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "", "getListInfoList", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "getPlayerAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "getSpeed", "", "getTimeLine", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/highlight/timeline/HightlightTimeLine;", "getToken", "getUrl", "isCompletedStatus", "", "isNextBtnEnable", "isPlaying", "isPodcast", "isPreBtnEnable", "isSilenceEnabled", "notifySeekManual", "notifyStartPlay", "notifyStartTrackingTouch", "notifyStopPlay", "notifyStopTrackingTouch", "notifyUpdatePlayPos", "timeStamp", "", "fromUser", "playNext", "playPrev", "releaseVideoPlayer", "setSilenceEnabled", "setSpeed", "speed", "showMoreMenu", "updatePlayerUrl", "musicUrl", "isAutoPlay", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.a */
public interface IMmVideoToolbarDependency extends IMmDependency {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.a$a */
    public static final class C46731a {
        /* renamed from: a */
        public static void m185041a(IMmVideoToolbarDependency aVar) {
        }

        /* renamed from: a */
        public static void m185042a(IMmVideoToolbarDependency aVar, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "musicUrl");
        }

        /* renamed from: b */
        public static void m185043b(IMmVideoToolbarDependency aVar) {
        }

        /* renamed from: c */
        public static void m185044c(IMmVideoToolbarDependency aVar) {
        }

        /* renamed from: d */
        public static void m185045d(IMmVideoToolbarDependency aVar) {
        }

        /* renamed from: e */
        public static void m185046e(IMmVideoToolbarDependency aVar) {
        }
    }

    /* renamed from: a */
    MmBaseInfo mo161643a();

    /* renamed from: a */
    void mo161644a(float f);

    /* renamed from: a */
    void mo161645a(long j, boolean z);

    /* renamed from: a */
    void mo161646a(AbstractC47070c<HightlightTimeLine> cVar);

    /* renamed from: a */
    void mo161647a(String str, boolean z);

    /* renamed from: a */
    void mo161648a(boolean z);

    /* renamed from: b */
    C46602i mo161649b();

    /* renamed from: c */
    void mo161650c();

    /* renamed from: d */
    void mo161651d();

    /* renamed from: e */
    void mo161652e();

    /* renamed from: f */
    void mo161653f();

    /* renamed from: g */
    void mo161654g();

    /* renamed from: h */
    boolean mo161655h();

    /* renamed from: i */
    boolean mo161656i();

    /* renamed from: j */
    List<MmPodcastLinkInfo> mo161657j();

    /* renamed from: k */
    float mo161658k();

    /* renamed from: l */
    boolean mo161659l();

    /* renamed from: m */
    String mo161660m();

    /* renamed from: n */
    String mo161661n();

    /* renamed from: o */
    String mo161662o();

    /* renamed from: p */
    boolean mo161663p();

    /* renamed from: q */
    boolean mo161664q();

    /* renamed from: r */
    boolean mo161665r();

    /* renamed from: s */
    void mo161666s();

    /* renamed from: t */
    void mo161667t();

    /* renamed from: u */
    void mo161668u();

    /* renamed from: v */
    void mo161669v();

    /* renamed from: w */
    void mo161670w();
}
