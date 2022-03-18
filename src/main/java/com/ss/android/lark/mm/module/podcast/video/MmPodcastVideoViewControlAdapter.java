package com.ss.android.lark.mm.module.podcast.video;

import android.content.Context;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.IMmVideoControlDepend;
import com.ss.android.lark.mm.module.player.IMmVideoDependency;
import com.ss.android.lark.mm.module.player.IMmVideoListener;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.notification.AbstractC46706b;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarInquirer;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.videoshop.mediaview.SimpleMediaView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/video/MmPodcastVideoViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/player/IMmVideoListener;", "Lcom/ss/android/lark/mm/module/player/IMmVideoDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/player/MmVideoControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/player/MmVideoControl;)V", "getControl", "()Lcom/ss/android/lark/mm/module/player/MmVideoControl;", "getControlRegister", "()Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getDependency", "onCreate", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.d.a */
public final class MmPodcastVideoViewControlAdapter extends MmBaseViewControlAdapter<IMmVideoListener, IMmVideoDependency> {

    /* renamed from: a */
    private final MmViewControlRegister f117710a;

    /* renamed from: b */
    private final MmControlRegister f117711b;

    /* renamed from: c */
    private final MmVideoControl f117712c;

    /* renamed from: e */
    public final MmViewControlRegister mo164366e() {
        return this.f117710a;
    }

    /* renamed from: f */
    public final MmControlRegister mo164367f() {
        return this.f117711b;
    }

    /* renamed from: g */
    public final MmVideoControl mo164368g() {
        return this.f117712c;
    }

    /* renamed from: b */
    public IMmVideoDependency mo161230c() {
        return new C46778a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016JH\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0012\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)H\u0016¨\u0006*"}, d2 = {"com/ss/android/lark/mm/module/podcast/video/MmPodcastVideoViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/player/IMmVideoDependency;", "createAudioPlayer", "", "context", "Landroid/content/Context;", "url", "", "createServiceClient", ChatTypeStateKeeper.f135670e, "position", "", "duration", "createVideoPlayer", "mediaView", "Lcom/ss/android/videoshop/mediaview/SimpleMediaView;", "videoUrl", "coverUrl", "videoEncodingType", "", "getAudioUrl", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "getPlayerAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "getSeekBarPosition", "getToken", "isAudioType", "", "isPodcast", "notifyServicePause", "notifyServiceResume", "notifyServieProgress", "timestamp", "onDestroy", "onStart", "seekToManual", "pos", "setVideoServiceDepend", "depend", "Lcom/ss/android/lark/mm/module/player/notification/IMmVideoClientDepend;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.d.a$a */
    public static final class C46778a implements IMmVideoDependency {

        /* renamed from: a */
        final /* synthetic */ MmPodcastVideoViewControlAdapter f117713a;

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: b */
        public boolean mo163625b() {
            return true;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: h */
        public boolean mo163631h() {
            return true;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: c */
        public String mo163626c() {
            String audioUrl;
            MmBaseInfo a = mo163616a();
            if (a == null || (audioUrl = a.getAudioUrl()) == null) {
                return "";
            }
            return audioUrl;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: e */
        public void mo163628e() {
            this.f117713a.mo164368g().mo161237n();
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: f */
        public void mo163629f() {
            this.f117713a.mo164368g().mo161235k();
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: g */
        public C46602i mo163630g() {
            return this.f117713a.mo164368g().mo164034h();
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: a */
        public MmBaseInfo mo163616a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f117713a.mo164367f().mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: d */
        public long mo163627d() {
            IMmVideoToolbarInquirer bVar = (IMmVideoToolbarInquirer) this.f117713a.mo164366e().mo161259a(IMmVideoToolbarInquirer.class);
            if (bVar != null) {
                return bVar.mo164207f();
            }
            return 0;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: a */
        public void mo163617a(float f) {
            IMmVideoDependency.C46591a.m184236a(this, f);
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: b */
        public void mo163623b(float f) {
            IMmVideoDependency.C46591a.m184237b(this, f);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46778a(MmPodcastVideoViewControlAdapter aVar) {
            this.f117713a = aVar;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: a */
        public void mo163621a(AbstractC46706b bVar) {
            this.f117713a.mo164368g().mo164019a(bVar);
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: b */
        public void mo163624b(long j) {
            this.f117713a.mo164368g().mo164015a(j);
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: a */
        public void mo163618a(long j) {
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) this.f117713a.mo164366e().mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                cVar.mo164210a(j, true);
            }
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: a */
        public void mo163620a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f117713a.mo164368g().mo164017a(context, str, true);
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: a */
        public void mo163622a(String str, long j, long j2) {
            this.f117713a.mo164368g().mo164023a(str, j, j2);
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoDependency
        /* renamed from: a */
        public void mo163619a(Context context, SimpleMediaView simpleMediaView, String str, String str2, String str3, long j, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f117713a.mo164368g().mo164016a(context, simpleMediaView, str, str2, str3, j, true, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/podcast/video/MmPodcastVideoViewControlAdapter$onCreate$1", "Lcom/ss/android/lark/mm/module/player/IMmVideoControlDepend;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "isPodWin", "", "isPodcast", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.d.a$b */
    public static final class C46779b implements IMmVideoControlDepend {

        /* renamed from: a */
        final /* synthetic */ MmPodcastVideoViewControlAdapter f117714a;

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: a */
        public boolean mo161335a() {
            return true;
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: c */
        public MmBaseInfo mo161337c() {
            return this.f117714a.mo161230c().mo163616a();
        }

        @Override // com.ss.android.lark.mm.module.player.IMmVideoControlDepend
        /* renamed from: b */
        public boolean mo161336b() {
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            if (a.mo161151b().mo164273c() == MmPodcastControl.DisplayMode.FLOAT_WINDOW) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46779b(MmPodcastVideoViewControlAdapter aVar) {
            this.f117714a = aVar;
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        this.f117712c.mo164018a(new C46779b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastVideoViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmVideoControl eVar2) {
        super(kVar, eVar, eVar2);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(eVar2, "control");
        this.f117710a = kVar;
        this.f117711b = eVar;
        this.f117712c = eVar2;
    }
}
