package com.ss.android.lark.mm.module.podcast.toolbar;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.IMmVideoListener;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarControl;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener;
import com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleListener;
import com.ss.android.lark.mm.module.podcast.titlebar.IMmPodcastTitleBarListener;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.p2288b.C45859k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/toolbar/MmPodcastToolbarControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarListener;", "Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarDependency;", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl$IMmDetailToolBarControlListener;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl;)V", "getControl", "()Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl;", "getControlRegister", "()Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getDependency", "onCreate", "", "onDestroy", "onPushReactionLine", "list", "", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.c.a */
public final class MmPodcastToolbarControlAdapter extends MmBaseViewControlAdapter<IMmVideoToolbarListener, IMmVideoToolbarDependency> implements MmVideoToolbarControl.IMmDetailToolBarControlListener {

    /* renamed from: a */
    private final MmViewControlRegister f117704a;

    /* renamed from: b */
    private final MmControlRegister f117705b;

    /* renamed from: c */
    private final MmVideoToolbarControl f117706c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u0003H\u0016J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000eH\u0016¨\u0006)"}, d2 = {"com/ss/android/lark/mm/module/podcast/toolbar/MmPodcastToolbarControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarDependency;", "destroyVideoPlayer", "", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "", "getListInfoList", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "getPlayerAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "getSpeed", "", "getTimeLine", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/highlight/timeline/HightlightTimeLine;", "getToken", "getUrl", "isCompletedStatus", "", "isNextBtnEnable", "isPlaying", "isPodcast", "isPreBtnEnable", "isSilenceEnabled", "notifySeekManual", "notifyStartPlay", "notifyStopPlay", "notifyUpdatePlayPos", "timeStamp", "", "fromUser", "playNext", "playPrev", "releaseVideoPlayer", "setSilenceEnabled", "setSpeed", "speed", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.c.a$a */
    public static final class C46776a implements IMmVideoToolbarDependency {

        /* renamed from: a */
        final /* synthetic */ MmPodcastToolbarControlAdapter f117707a;

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: p */
        public boolean mo161663p() {
            return true;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: s */
        public void mo161666s() {
            IMmVideoToolbarDependency.C46731a.m185044c(this);
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: t */
        public void mo161667t() {
            IMmVideoToolbarDependency.C46731a.m185045d(this);
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: u */
        public void mo161668u() {
            IMmVideoToolbarDependency.C46731a.m185046e(this);
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: j */
        public List<MmPodcastLinkInfo> mo161657j() {
            return this.f117707a.mo164363g().mo164234d();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: m */
        public String mo161660m() {
            return this.f117707a.mo164363g().mo164225a();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: n */
        public String mo161661n() {
            return this.f117707a.mo164363g().mo164231b();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: o */
        public String mo161662o() {
            return this.f117707a.mo164363g().mo164233c();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: a */
        public MmBaseInfo mo161643a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f117707a.mo164362f().mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: b */
        public C46602i mo161649b() {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164034h();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: c */
        public void mo161650c() {
            IMmPodcastSubtitleListener cVar = (IMmPodcastSubtitleListener) this.f117707a.mo164361e().mo161266d(IMmPodcastSubtitleListener.class);
            if (cVar != null) {
                cVar.mo164403a();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: d */
        public void mo161651d() {
            IMmPodcastSubtitleListener cVar = (IMmPodcastSubtitleListener) this.f117707a.mo164361e().mo161266d(IMmPodcastSubtitleListener.class);
            if (cVar != null) {
                cVar.mo164405b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: e */
        public void mo161652e() {
            IMmPodcastSubtitleListener cVar = (IMmPodcastSubtitleListener) this.f117707a.mo164361e().mo161266d(IMmPodcastSubtitleListener.class);
            if (cVar != null) {
                cVar.mo164406f();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: h */
        public boolean mo161655h() {
            MmPodcastControl mmPodcastControl = (MmPodcastControl) this.f117707a.mo164362f().mo161912a(MmPodcastControl.class);
            if (mmPodcastControl != null) {
                return mmPodcastControl.mo164287w();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: i */
        public boolean mo161656i() {
            MmPodcastControl mmPodcastControl = (MmPodcastControl) this.f117707a.mo164362f().mo161912a(MmPodcastControl.class);
            if (mmPodcastControl != null) {
                return mmPodcastControl.mo164288x();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: k */
        public float mo161658k() {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164037l();
            }
            return 1.0f;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: l */
        public boolean mo161659l() {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164035i();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: q */
        public boolean mo161664q() {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164032f();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: r */
        public boolean mo161665r() {
            MmBaseInfo b;
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f117707a.mo164362f().mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl == null || (b = mmMeetingBaseInfoControl.mo161581b()) == null || !b.isCompletedState()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: v */
        public void mo161669v() {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                eVar.mo161235k();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: w */
        public void mo161670w() {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                eVar.mo164033g();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: f */
        public void mo161653f() {
            IMmVideoListener dVar = (IMmVideoListener) this.f117707a.mo164361e().mo161266d(IMmVideoListener.class);
            if (dVar != null) {
                dVar.mo164008a();
            }
            MmPodcastControl mmPodcastControl = (MmPodcastControl) this.f117707a.mo164362f().mo161912a(MmPodcastControl.class);
            if (mmPodcastControl != null) {
                mmPodcastControl.mo164285u();
            }
            IMmPodcastInitialListener cVar = (IMmPodcastInitialListener) this.f117707a.mo164361e().mo161266d(IMmPodcastInitialListener.class);
            if (cVar != null) {
                cVar.mo164317a();
            }
            IMmPodcastTitleBarListener cVar2 = (IMmPodcastTitleBarListener) this.f117707a.mo164361e().mo161266d(IMmPodcastTitleBarListener.class);
            if (cVar2 != null) {
                cVar2.mo164355b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: g */
        public void mo161654g() {
            IMmVideoListener dVar = (IMmVideoListener) this.f117707a.mo164361e().mo161266d(IMmVideoListener.class);
            if (dVar != null) {
                dVar.mo164008a();
            }
            MmPodcastControl mmPodcastControl = (MmPodcastControl) this.f117707a.mo164362f().mo161912a(MmPodcastControl.class);
            if (mmPodcastControl != null) {
                mmPodcastControl.mo164286v();
            }
            IMmPodcastInitialListener cVar = (IMmPodcastInitialListener) this.f117707a.mo164361e().mo161266d(IMmPodcastInitialListener.class);
            if (cVar != null) {
                cVar.mo164317a();
            }
            IMmPodcastTitleBarListener cVar2 = (IMmPodcastTitleBarListener) this.f117707a.mo164361e().mo161266d(IMmPodcastTitleBarListener.class);
            if (cVar2 != null) {
                cVar2.mo164355b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46776a(MmPodcastToolbarControlAdapter aVar) {
            this.f117707a = aVar;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: a */
        public void mo161646a(AbstractC47070c<HightlightTimeLine> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            this.f117707a.mo164363g().mo164227a(cVar);
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: a */
        public void mo161644a(float f) {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                eVar.mo164014a(f);
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: a */
        public void mo161648a(boolean z) {
            MmVideoControl eVar = (MmVideoControl) this.f117707a.mo164362f().mo161912a(MmVideoControl.class);
            if (eVar != null) {
                eVar.mo164024a(z);
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: a */
        public void mo161645a(long j, boolean z) {
            IMmPodcastSubtitleListener cVar = (IMmPodcastSubtitleListener) this.f117707a.mo164361e().mo161266d(IMmPodcastSubtitleListener.class);
            if (cVar != null) {
                cVar.mo164404a(j, z);
            }
            IMmVideoListener dVar = (IMmVideoListener) this.f117707a.mo164361e().mo161266d(IMmVideoListener.class);
            if (dVar != null) {
                dVar.mo164009a(j, z);
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarDependency
        /* renamed from: a */
        public void mo161647a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "musicUrl");
            IMmVideoToolbarDependency.C46731a.m185042a(this, str, z);
        }
    }

    /* renamed from: e */
    public final MmViewControlRegister mo164361e() {
        return this.f117704a;
    }

    /* renamed from: f */
    public final MmControlRegister mo164362f() {
        return this.f117705b;
    }

    /* renamed from: g */
    public final MmVideoToolbarControl mo164363g() {
        return this.f117706c;
    }

    /* renamed from: b */
    public IMmVideoToolbarDependency mo161230c() {
        return new C46776a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        this.f117706c.mo164226a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: d */
    public void mo161256d() {
        super.mo161256d();
        this.f117706c.mo164232b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.c.a$b */
    static final class RunnableC46777b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmPodcastToolbarControlAdapter f117708a;

        /* renamed from: b */
        final /* synthetic */ List f117709b;

        RunnableC46777b(MmPodcastToolbarControlAdapter aVar, List list) {
            this.f117708a = aVar;
            this.f117709b = list;
        }

        public final void run() {
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) this.f117708a.mo164361e().mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                cVar.mo164214a(this.f117709b);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarControl.IMmDetailToolBarControlListener
    /* renamed from: a */
    public void mo161638a(List<? extends HighlightTimeLineItem> list) {
        C45859k.m181685a(new RunnableC46777b(this, list));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastToolbarControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmVideoToolbarControl fVar) {
        super(kVar, eVar, fVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(fVar, "control");
        this.f117704a = kVar;
        this.f117705b = eVar;
        this.f117706c = fVar;
    }
}
