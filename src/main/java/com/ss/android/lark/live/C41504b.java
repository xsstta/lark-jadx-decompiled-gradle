package com.ss.android.lark.live;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a\b\u0010\n\u001a\u00020\u000bH\u0000\u001a\b\u0010\f\u001a\u00020\u000bH\u0000\u001a\b\u0010\r\u001a\u00020\u000bH\u0000\u001a\b\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\b\u0010\u000f\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0010\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0011\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0012\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0013\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0014\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0015\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0016\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0017\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0018\u001a\u00020\u000bH\u0000\u001a\b\u0010\u0019\u001a\u00020\u000bH\u0000\u001a\b\u0010\u001a\u001a\u00020\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XD¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"TAG", "", "liveFirstFrameKey", "liveHomeFailedKey", "liveHomeReadyKey", "liveLoadUrlKey", "playbackFirstFrameKey", "playbackHomeFailedKey", "playbackHomeReadyKey", "playbackLoadUrlKey", "endLiveFirstFrame", "", "endLiveHomeFailed", "endLiveHomeReady", "endLiveLoadUrl", "endPlaybackFirstFrame", "endPlaybackHomeFailed", "endPlaybackHomeReady", "endPlaybackLoadUrl", "startLiveFirstFrame", "startLiveHomeFailed", "startLiveHomeReady", "startLiveLoadUrl", "startPlaybackFirstFrame", "startPlaybackHomeFailed", "startPlaybackHomeReady", "startPlaybackLoadUrl", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.b */
public final class C41504b {

    /* renamed from: a */
    private static String f105513a = null;

    /* renamed from: b */
    private static String f105514b = null;

    /* renamed from: c */
    private static String f105515c = null;

    /* renamed from: d */
    private static String f105516d = null;

    /* renamed from: e */
    private static String f105517e = null;

    /* renamed from: f */
    private static String f105518f = null;

    /* renamed from: g */
    private static String f105519g = null;

    /* renamed from: h */
    private static String f105520h = null;

    /* renamed from: i */
    private static final String f105521i = "vcappreciable";

    /* renamed from: a */
    public static final void m164711a() {
        C45855f.m181664c(f105521i, "[startLiveLoadUrl]");
        f105513a = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_url_load_time, (String) null, false, 16, (Object) null);
    }

    /* renamed from: b */
    public static final void m164712b() {
        C45855f.m181664c(f105521i, "[endLiveLoadUrl]");
        String str = f105513a;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105513a = null;
    }

    /* renamed from: c */
    public static final void m164713c() {
        C45855f.m181664c(f105521i, "[startLiveHomeReady]");
        f105514b = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_home_ready, (String) null, false, 16, (Object) null);
    }

    /* renamed from: d */
    public static final void m164714d() {
        C45855f.m181664c(f105521i, "[endLiveHomeReady]");
        String str = f105514b;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105514b = null;
    }

    /* renamed from: e */
    public static final void m164715e() {
        C45855f.m181664c(f105521i, "[startLiveHomeFailed]");
        f105515c = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_home_fail, (String) null, false, 16, (Object) null);
    }

    /* renamed from: f */
    public static final void m164716f() {
        C45855f.m181664c(f105521i, "[endLiveHomeFailed]");
        String str = f105515c;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105515c = null;
    }

    /* renamed from: g */
    public static final void m164717g() {
        C45855f.m181664c(f105521i, "[startLiveFirstFrame]");
        f105516d = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_appreciable_first_frame, (String) null, false, 16, (Object) null);
    }

    /* renamed from: h */
    public static final void m164718h() {
        C45855f.m181664c(f105521i, "[endLiveFirstFrame]");
        String str = f105516d;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105516d = null;
    }

    /* renamed from: i */
    public static final void m164719i() {
        C45855f.m181664c(f105521i, "[startPlaybackLoadUrl]");
        f105517e = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_playback_url_load_time, (String) null, false, 16, (Object) null);
    }

    /* renamed from: j */
    public static final void m164720j() {
        C45855f.m181664c(f105521i, "[endPlaybackLoadUrl]");
        String str = f105517e;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105517e = null;
    }

    /* renamed from: k */
    public static final void m164721k() {
        C45855f.m181664c(f105521i, "[startPlaybackHomeReady]");
        f105518f = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_playback_home_ready, (String) null, false, 16, (Object) null);
    }

    /* renamed from: l */
    public static final void m164722l() {
        C45855f.m181664c(f105521i, "[endPlaybackHomeReady]");
        String str = f105518f;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105518f = null;
    }

    /* renamed from: m */
    public static final void m164723m() {
        C45855f.m181664c(f105521i, "[startPlaybackHomeFailed]");
        f105519g = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_playback_home_failed, (String) null, false, 16, (Object) null);
    }

    /* renamed from: n */
    public static final void m164724n() {
        C45855f.m181664c(f105521i, "[endPlaybackHomeFailed]");
        String str = f105519g;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105519g = null;
    }

    /* renamed from: o */
    public static final void m164725o() {
        C45855f.m181664c(f105521i, "[startPlaybackFirstFrame]");
        f105520h = AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.VideoConference, Scene.LarkLive, Event.larklive_playback_appreciable_first_frame, (String) null, false, 16, (Object) null);
    }

    /* renamed from: p */
    public static final void m164726p() {
        C45855f.m181664c(f105521i, "[endPlaybackFirstFrame]");
        String str = f105520h;
        if (str != null) {
            AppreciableKit.f73094h.mo103524a().mo103515a(str);
        }
        f105520h = null;
    }
}
