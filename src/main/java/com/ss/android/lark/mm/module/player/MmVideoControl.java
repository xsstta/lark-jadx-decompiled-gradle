package com.ss.android.lark.mm.module.player;

import android.content.Context;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmPlaySettingInfo;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.player.core.AbstractC46593a;
import com.ss.android.lark.mm.module.player.core.AbstractC46597d;
import com.ss.android.lark.mm.module.player.core.AbstractC46598e;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.core.C46605j;
import com.ss.android.lark.mm.module.player.notification.AbstractC46706b;
import com.ss.android.lark.mm.module.player.notification.C46709e;
import com.ss.android.lark.mm.module.player.p2308a.C46587a;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmTimedHitPointEvent;
import com.ss.android.lark.mm.utils.UrlUtil;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.videoshop.mediaview.SimpleMediaView;
import com.ss.ttvideoengine.utils.Error;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001bJ\u0006\u0010;\u001a\u000209J\u001e\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u001bJ \u0010A\u001a\u0002092\b\u0010B\u001a\u0004\u0018\u00010\u00032\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020DJN\u0010F\u001a\u0002092\u0006\u0010=\u001a\u00020>2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u0010?\u001a\u0004\u0018\u00010\u00032\b\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010B\u001a\u0004\u0018\u00010\u00032\u0006\u0010E\u001a\u00020D2\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020KJ\b\u0010L\u001a\u0004\u0018\u00010!J\u0006\u0010M\u001a\u00020NJ\b\u0010O\u001a\u000209H\u0002J\u0006\u0010P\u001a\u00020\u001bJ\u0006\u0010Q\u001a\u00020\u001bJ\u0006\u0010R\u001a\u000209J\u0006\u0010S\u001a\u000209J\u000e\u0010T\u001a\u0002092\u0006\u0010U\u001a\u00020DJ\b\u0010V\u001a\u000209H\u0016J\b\u0010W\u001a\u000209H\u0016J\u0006\u0010X\u001a\u000209J\u000e\u0010Y\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010Z\u001a\u000209J\u000e\u0010[\u001a\u0002092\u0006\u0010\\\u001a\u00020\u0015J\u000e\u0010]\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010^\u001a\u0002092\b\u0010\\\u001a\u0004\u0018\u00010'J\u000e\u0010_\u001a\u0002092\u0006\u0010`\u001a\u00020NJ\u0010\u0010a\u001a\u0002092\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010b\u001a\u0002092\u0006\u0010B\u001a\u00020\u00032\u0006\u0010E\u001a\u00020DJ\u0010\u0010c\u001a\u0002092\u0006\u0010d\u001a\u00020eH\u0002R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR$\u0010\u0002\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\r¨\u0006f"}, d2 = {"Lcom/ss/android/lark/mm/module/player/MmVideoControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "url", "", "playSettingInfo", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmPlaySettingInfo;", "timerExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmPlaySettingInfo;Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;)V", "host", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "mClient", "Lcom/ss/android/lark/mm/module/player/notification/MmServiceClient;", "getMClient", "()Lcom/ss/android/lark/mm/module/player/notification/MmServiceClient;", "setMClient", "(Lcom/ss/android/lark/mm/module/player/notification/MmServiceClient;)V", "mDepend", "Lcom/ss/android/lark/mm/module/player/IMmVideoControlDepend;", "getMDepend", "()Lcom/ss/android/lark/mm/module/player/IMmVideoControlDepend;", "setMDepend", "(Lcom/ss/android/lark/mm/module/player/IMmVideoControlDepend;)V", "mIsSilenceEnabled", "", "getMIsSilenceEnabled", "()Z", "setMIsSilenceEnabled", "(Z)V", "mPlayerAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "getMPlayerAdapter", "()Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "setMPlayerAdapter", "(Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;)V", "mSeriveDepend", "Lcom/ss/android/lark/mm/module/player/notification/IMmVideoClientDepend;", "getMSeriveDepend", "()Lcom/ss/android/lark/mm/module/player/notification/IMmVideoClientDepend;", "setMSeriveDepend", "(Lcom/ss/android/lark/mm/module/player/notification/IMmVideoClientDepend;)V", "getPlaySettingInfo", "()Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmPlaySettingInfo;", "playerDurationHitPoint", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "getTimerExecutor", "()Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "token", "getToken", "setToken", "value", "getUrl", "setUrl", "changeEditMode", "", "isEdit", "checkIsNeedAutoPlay", "createAudioPlayer", "context", "Landroid/content/Context;", "videoUrl", "iscast", "createServiceClient", ChatTypeStateKeeper.f135670e, "position", "", "duration", "createVideoPlayer", "mediaView", "Lcom/ss/android/videoshop/mediaview/SimpleMediaView;", "videoCover", "encodingType", "", "getPlayerAdapter", "getSpeed", "", "initPlayer", "isFullScreen", "isPlaying", "notifyServicePause", "notifyServiceResume", "notifyServieProgress", "timestamp", "onDestroy", "onStart", "pause", "playMusicUrl", "releasePlayerAdapter", "setControlDepend", "depend", "setMusicUrl", "setServiceDepend", "setSpeed", "speed", "setVideoUrl", "updateNotificationInfo", "uploadAppreciableError", "error", "Lcom/ss/ttvideoengine/utils/Error;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.e */
public final class MmVideoControl extends MmBaseControl {

    /* renamed from: a */
    public MmTimedHitPointEvent f117471a;

    /* renamed from: b */
    private String f117472b;

    /* renamed from: c */
    private String f117473c;

    /* renamed from: d */
    private String f117474d;

    /* renamed from: e */
    private C46602i f117475e;

    /* renamed from: f */
    private C46709e f117476f;

    /* renamed from: g */
    private AbstractC46706b f117477g;

    /* renamed from: h */
    private IMmVideoControlDepend f117478h;

    /* renamed from: i */
    private boolean f117479i;

    /* renamed from: j */
    private final MmPlaySettingInfo f117480j;

    /* renamed from: k */
    private final C47096b f117481k;

    /* renamed from: a */
    public final String mo164013a() {
        return this.f117473c;
    }

    /* renamed from: b */
    public final C46602i mo164025b() {
        return this.f117475e;
    }

    /* renamed from: c */
    public final C46709e mo164028c() {
        return this.f117476f;
    }

    /* renamed from: d */
    public final AbstractC46706b mo164030d() {
        return this.f117477g;
    }

    /* renamed from: e */
    public final IMmVideoControlDepend mo164031e() {
        return this.f117478h;
    }

    /* renamed from: f */
    public final boolean mo164032f() {
        return this.f117479i;
    }

    /* renamed from: h */
    public final C46602i mo164034h() {
        return this.f117475e;
    }

    /* renamed from: s */
    public final MmPlaySettingInfo mo164039s() {
        return this.f117480j;
    }

    /* renamed from: t */
    public final C47096b mo164040t() {
        return this.f117481k;
    }

    /* renamed from: a */
    public final void mo164024a(boolean z) {
        this.f117479i = z;
    }

    /* renamed from: a */
    public final void mo164023a(String str, long j, long j2) {
        if (this.f117476f == null) {
            C46709e eVar = new C46709e(str, j2);
            this.f117476f = eVar;
            if (eVar != null) {
                eVar.mo164069a(new C46698a(this));
            }
        }
    }

    /* renamed from: g */
    public final void mo164033g() {
        C46602i iVar = this.f117475e;
        if (iVar != null) {
            iVar.mo163736i();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: n */
    public void mo161237n() {
        C46709e eVar = this.f117476f;
        if (eVar != null) {
            eVar.mo164077e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/mm/module/player/MmVideoControl$createServiceClient$1", "Lcom/ss/android/lark/mm/module/player/notification/IMmVideoClientDepend;", "getDuration", "", "getPosition", "isPlaying", "", "onSeekTo", "", "pos", "", "onSkipNextProcess", "onSkipPrevProcess", "onVideoPause", "onVideoResume", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.e$a */
    public static final class C46698a implements AbstractC46706b {

        /* renamed from: a */
        final /* synthetic */ MmVideoControl f117482a;

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: a */
        public void mo164041a() {
            AbstractC46706b d = this.f117482a.mo164030d();
            if (d != null) {
                d.mo164041a();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: b */
        public void mo164043b() {
            AbstractC46706b d = this.f117482a.mo164030d();
            if (d != null) {
                d.mo164043b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: c */
        public void mo164044c() {
            AbstractC46706b d = this.f117482a.mo164030d();
            if (d != null) {
                d.mo164044c();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: d */
        public void mo164045d() {
            AbstractC46706b d = this.f117482a.mo164030d();
            if (d != null) {
                d.mo164045d();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: e */
        public int mo164046e() {
            AbstractC46706b d;
            if (this.f117482a.mo164030d() == null || (d = this.f117482a.mo164030d()) == null) {
                return 0;
            }
            return d.mo164046e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46698a(MmVideoControl eVar) {
            this.f117482a = eVar;
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: a */
        public void mo164042a(long j) {
            AbstractC46706b d = this.f117482a.mo164030d();
            if (d != null) {
                d.mo164042a(j);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/mm/module/player/MmVideoControl$initPlayer$1", "Lcom/ss/android/lark/mm/module/player/core/AbsPlayerListener;", "onComplete", "", "onError", "error", "Lcom/ss/ttvideoengine/utils/Error;", "onPause", "onPlay", "onProgressChange", "current", "", "onRelease", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.e$b */
    public static final class C46699b extends AbstractC46593a {

        /* renamed from: a */
        final /* synthetic */ MmVideoControl f117483a;

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f, com.ss.android.lark.mm.module.player.core.AbstractC46593a
        /* renamed from: c */
        public void mo163661c() {
            super.mo163661c();
            MmTimedHitPointEvent mmTimedHitPointEvent = this.f117483a.f117471a;
            if (mmTimedHitPointEvent != null) {
                mmTimedHitPointEvent.mo165405b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f, com.ss.android.lark.mm.module.player.core.AbstractC46593a
        /* renamed from: b */
        public void mo163660b() {
            C46709e c = this.f117483a.mo164028c();
            if (c != null) {
                c.mo164074b();
            }
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            a.mo161151b().mo164276f().onNext(TuplesKt.to(this.f117483a.mo164013a(), MmPodcastControl.PlayState.PAUSED));
            MmTimedHitPointEvent mmTimedHitPointEvent = this.f117483a.f117471a;
            if (mmTimedHitPointEvent != null) {
                mmTimedHitPointEvent.mo165405b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f, com.ss.android.lark.mm.module.player.core.AbstractC46593a
        /* renamed from: a */
        public void mo163655a() {
            MmTimedHitPointEvent mmTimedHitPointEvent;
            C46709e c = this.f117483a.mo164028c();
            if (c != null) {
                c.mo164075c();
            }
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            a.mo161151b().mo164276f().onNext(TuplesKt.to(this.f117483a.mo164013a(), MmPodcastControl.PlayState.PLAYING));
            MmVideoControl eVar = this.f117483a;
            IMmVideoControlDepend e = eVar.mo164031e();
            MmBaseInfo mmBaseInfo = null;
            if (e == null || !e.mo161335a()) {
                C47096b t = this.f117483a.mo164040t();
                IMmVideoControlDepend e2 = this.f117483a.mo164031e();
                if (e2 != null) {
                    mmBaseInfo = e2.mo161337c();
                }
                mmTimedHitPointEvent = new MmTimedHitPointEvent(t, "vc_minutes_detail_status", "play_duration", C47085h.m186430a(mmBaseInfo));
                mmTimedHitPointEvent.mo165402a("page_type", "normal");
            } else {
                C47096b t2 = this.f117483a.mo164040t();
                IMmVideoControlDepend e3 = this.f117483a.mo164031e();
                if (e3 != null) {
                    mmBaseInfo = e3.mo161337c();
                }
                mmTimedHitPointEvent = new MmTimedHitPointEvent(t2, "vc_minutes_detail_status", "play_duration", C47085h.m186430a(mmBaseInfo));
                mmTimedHitPointEvent.mo165402a("page_type", "podcast");
            }
            eVar.f117471a = mmTimedHitPointEvent;
            MmTimedHitPointEvent mmTimedHitPointEvent2 = this.f117483a.f117471a;
            if (mmTimedHitPointEvent2 != null) {
                mmTimedHitPointEvent2.mo165403a();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f, com.ss.android.lark.mm.module.player.core.AbstractC46593a
        /* renamed from: d */
        public void mo163662d() {
            super.mo163662d();
            C46709e c = this.f117483a.mo164028c();
            if (c != null) {
                c.mo164074b();
            }
            C46587a.m184215a(this.f117483a.mo164013a(), 0);
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            if (a.mo161151b().mo164288x()) {
                C45852d a2 = C45852d.m181651a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmControl.of()");
                a2.mo161151b().mo164285u();
            } else {
                C45852d a3 = C45852d.m181651a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "MmControl.of()");
                a3.mo161151b().mo164276f().onNext(TuplesKt.to(this.f117483a.mo164013a(), MmPodcastControl.PlayState.PAUSED));
            }
            MmTimedHitPointEvent mmTimedHitPointEvent = this.f117483a.f117471a;
            if (mmTimedHitPointEvent != null) {
                mmTimedHitPointEvent.mo165405b();
            }
            IMmVideoControlDepend e = this.f117483a.mo164031e();
            if (e != null && !e.mo161335a()) {
                C47083e.m186425a(C47085h.m186430a(e.mo161337c()), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_play_finish").mo165421c());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46699b(MmVideoControl eVar) {
            this.f117483a = eVar;
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f, com.ss.android.lark.mm.module.player.core.AbstractC46593a
        /* renamed from: a */
        public void mo163658a(Error error) {
            Intrinsics.checkParameterIsNotNull(error, "error");
            super.mo163658a(error);
            this.f117483a.mo164020a(error);
            MmTimedHitPointEvent mmTimedHitPointEvent = this.f117483a.f117471a;
            if (mmTimedHitPointEvent != null) {
                mmTimedHitPointEvent.mo165405b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f, com.ss.android.lark.mm.module.player.core.AbstractC46593a
        /* renamed from: a */
        public void mo163656a(long j) {
            int i;
            AbstractC46598e a;
            super.mo163656a(j);
            if (this.f117483a.mo164025b() != null) {
                C46602i b = this.f117483a.mo164025b();
                if (b == null || (a = b.mo163685a()) == null) {
                    i = 0;
                } else {
                    i = a.mo163710a();
                }
                if (i <= 0 || ((long) i) - j > ((long) 2000)) {
                    C46587a.m184215a(this.f117483a.mo164013a(), (int) j);
                } else {
                    C46587a.m184215a(this.f117483a.mo164013a(), 0);
                }
                C46709e c = this.f117483a.mo164028c();
                if (c != null) {
                    c.mo164068a(j);
                }
                C45852d a2 = C45852d.m181651a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmControl.of()");
                a2.mo161151b().mo164275e().onNext(TuplesKt.to(this.f117483a.mo164013a(), Long.valueOf(j)));
            }
        }
    }

    /* renamed from: i */
    public final boolean mo164035i() {
        AbstractC46598e a;
        C46602i iVar = this.f117475e;
        if (iVar == null || (a = iVar.mo163685a()) == null) {
            return false;
        }
        return a.mo163715d();
    }

    /* renamed from: j */
    public final boolean mo164036j() {
        AbstractC46598e a;
        C46602i iVar = this.f117475e;
        if (iVar == null || (a = iVar.mo163685a()) == null) {
            return false;
        }
        return a.mo163718g();
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        C45855f.m181663b("MmVideoControl", "onDestroy");
        C46709e eVar = this.f117476f;
        if (eVar != null) {
            eVar.mo164076d();
        }
        C46602i iVar = this.f117475e;
        if (iVar != null) {
            iVar.mo163736i();
        }
    }

    /* renamed from: r */
    public final void mo164038r() {
        C46602i h;
        AbstractC46597d b;
        MmPlaySettingInfo mmPlaySettingInfo = this.f117480j;
        if (mmPlaySettingInfo != null && mmPlaySettingInfo.isAutoPlay() && (h = mo164034h()) != null && (b = h.mo163686b()) != null) {
            b.mo163706b();
        }
    }

    /* renamed from: u */
    private final void m184762u() {
        C46602i iVar = this.f117475e;
        if (iVar != null) {
            iVar.mo163730a(new C46699b(this));
        }
        MmPlaySettingInfo mmPlaySettingInfo = this.f117480j;
        if (mmPlaySettingInfo != null) {
            mo164014a(mmPlaySettingInfo.getSpeed());
        }
        MmPlaySettingInfo mmPlaySettingInfo2 = this.f117480j;
        if (mmPlaySettingInfo2 != null) {
            this.f117479i = mmPlaySettingInfo2.isSilenceEnabled();
        }
    }

    /* renamed from: l */
    public final float mo164037l() {
        AbstractC46598e a;
        AbstractC46598e a2;
        C46602i iVar = this.f117475e;
        if (iVar == null || iVar == null || (a = iVar.mo163685a()) == null || !a.mo163714c()) {
            C46602i iVar2 = this.f117475e;
            if (iVar2 != null) {
                return iVar2.mo163691g();
            }
            return 1.0f;
        }
        C46602i iVar3 = this.f117475e;
        if (iVar3 == null || (a2 = iVar3.mo163685a()) == null) {
            return 1.0f;
        }
        return a2.mo163722k();
    }

    /* renamed from: a */
    public final void mo164014a(float f) {
        C46602i iVar = this.f117475e;
        if (iVar != null) {
            iVar.mo163732b(f);
        }
    }

    /* renamed from: b */
    public final void mo164027b(boolean z) {
        C46602i iVar = this.f117475e;
        if (iVar != null) {
            iVar.mo163735b(z);
        }
    }

    /* renamed from: a */
    public final void mo164015a(long j) {
        C46709e eVar = this.f117476f;
        if (eVar != null) {
            eVar.mo164068a(j);
        }
    }

    /* renamed from: a */
    public final void mo164018a(IMmVideoControlDepend aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "depend");
        this.f117478h = aVar;
    }

    /* renamed from: a */
    public final void mo164019a(AbstractC46706b bVar) {
        this.f117477g = bVar;
    }

    /* renamed from: b */
    public final void mo164026b(String str) {
        AbstractC46597d b;
        Intrinsics.checkParameterIsNotNull(str, "url");
        C45855f.m181663b("MmVideoControl", "[playMusicUrl] url:" + str);
        mo164029c(str);
        C46602i iVar = this.f117475e;
        if (iVar != null && (b = iVar.mo163686b()) != null) {
            b.mo163706b();
        }
    }

    /* renamed from: c */
    public final void mo164029c(String str) {
        AbstractC46597d b;
        Intrinsics.checkParameterIsNotNull(str, "url");
        C45855f.m181663b("MmVideoControl", "[setMusicUrl] url:" + str);
        C46602i iVar = this.f117475e;
        if (iVar != null && (b = iVar.mo163686b()) != null) {
            b.mo163707b(str);
        }
    }

    /* renamed from: a */
    public final void mo164020a(Error error) {
        Scene scene;
        String str;
        IMmVideoControlDepend aVar;
        IMmVideoControlDepend aVar2 = this.f117478h;
        boolean z = true;
        if ((aVar2 == null || !aVar2.mo161335a()) && ((aVar = this.f117478h) == null || !aVar.mo161336b())) {
            z = false;
        }
        AppreciableKit a = AppreciableKit.f73094h.mo103524a();
        Biz biz = Biz.VideoConference;
        if (z) {
            scene = Scene.MinutesPodcast;
        } else {
            scene = Scene.MinutesDetail;
        }
        Event event = Event.minutes_media_play_error;
        ErrorType errorType = ErrorType.Other;
        ErrorLevel errorLevel = ErrorLevel.Exception;
        int i = error.code;
        if (z) {
            str = "podcast";
        } else {
            str = "Detail";
        }
        a.mo103514a(new ErrorParams(biz, scene, event, errorType, errorLevel, i, str, null, error.toString(), false, MapsKt.mapOf(TuplesKt.to("objecttoken", this.f117473c)), null, null, 6144, null));
    }

    /* renamed from: a */
    public final void mo164021a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f117479i = false;
        this.f117474d = str;
        this.f117472b = UrlUtil.f118671a.mo165518b(this.f117474d);
        this.f117473c = UrlUtil.f118671a.mo165517a(this.f117474d);
    }

    /* renamed from: a */
    public final void mo164022a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, ChatTypeStateKeeper.f135670e);
        if (j != 0) {
            C46709e eVar = this.f117476f;
            if (eVar != null) {
                eVar.mo164071a(str, j);
            }
            C46709e eVar2 = this.f117476f;
            if (eVar2 != null) {
                eVar2.mo164077e();
            }
        }
    }

    public MmVideoControl(String str, MmPlaySettingInfo mmPlaySettingInfo, C47096b bVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(bVar, "timerExecutor");
        this.f117480j = mmPlaySettingInfo;
        this.f117481k = bVar;
        this.f117472b = UrlUtil.f118671a.mo165518b(str);
        this.f117473c = UrlUtil.f118671a.mo165517a(str);
        this.f117474d = str;
    }

    /* renamed from: a */
    public final void mo164017a(Context context, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "videoUrl");
        if (this.f117475e == null) {
            this.f117475e = new C46602i(new C46605j.C46607a().mo163757a(context).mo163763b(str).mo163761a(z).mo163766e(this.f117473c).mo163758a(new C46605j.C46608b(this.f117472b, this.f117473c)).mo163762a(), true);
            m184762u();
        }
    }

    /* renamed from: a */
    public final void mo164016a(Context context, SimpleMediaView simpleMediaView, String str, String str2, String str3, long j, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (this.f117475e == null) {
            this.f117475e = new C46602i(new C46605j.C46607a().mo163757a(context).mo163759a(simpleMediaView).mo163760a(str).mo163764c(str2).mo163765d(str3).mo163766e(this.f117473c).mo163756a(j).mo163761a(z).mo163755a(i).mo163758a(new C46605j.C46608b(this.f117472b, this.f117473c)).mo163762a(), false);
            m184762u();
        }
    }
}
