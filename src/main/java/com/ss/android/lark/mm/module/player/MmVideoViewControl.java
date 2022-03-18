package com.ss.android.lark.mm.module.player;

import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.player.core.AbstractC46597d;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.core.MmSimpleMediaView;
import com.ss.android.lark.mm.module.player.notification.AbstractC46706b;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47117q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0002B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/mm/module/player/MmVideoViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/player/IMmVideoListener;", "Lcom/ss/android/lark/mm/module/player/IMmVideoDependency;", "Lcom/ss/android/lark/mm/module/player/IMmVideoInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "mockPlayerView", "Landroid/view/View;", "videoView", "Lcom/ss/android/lark/mm/module/player/core/MmSimpleMediaView;", "videoViewContainer", "Landroid/view/ViewGroup;", "detachVideoViewAndGet", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "getVideoView", "initNotice", "", "initVideoView", "isAudio", "", "notifyUpdatePlayPos", "timestamp", "", "isFromUser", "onCreate", "onDestroy", "onMediaViewModeChange", "isNormal", "onPausePlay", "onStart", "onStartTrackingTouch", "onStopTrackingTouch", "startPlay", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.f */
public final class MmVideoViewControl extends MmBaseViewControl<IMmVideoListener, IMmVideoDependency> implements IMmVideoInquirer, IMmVideoListener {

    /* renamed from: a */
    public final MmBaseViewControlAdapter<IMmVideoListener, IMmVideoDependency> f117484a;

    /* renamed from: b */
    private ViewGroup f117485b;

    /* renamed from: c */
    private MmSimpleMediaView f117486c;

    /* renamed from: d */
    private final View f117487d;

    /* renamed from: e */
    private final IMmViewControlContext f117488e;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.player.IMmVideoListener
    /* renamed from: f */
    public void mo164011f() {
    }

    /* renamed from: i */
    public IMmVideoListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.player.IMmVideoListener
    /* renamed from: g */
    public void mo164012g() {
        MmSimpleMediaView mmSimpleMediaView = this.f117486c;
        if (mmSimpleMediaView != null) {
            mmSimpleMediaView.mo163648a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/mm/module/player/MmVideoViewControl$initNotice$1", "Lcom/ss/android/lark/mm/module/player/notification/IMmVideoClientDepend;", "getDuration", "", "getPosition", "isPlaying", "", "onSeekTo", "", "pos", "", "onSkipNextProcess", "onSkipPrevProcess", "onVideoPause", "onVideoResume", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.f$a */
    public static final class C46700a implements AbstractC46706b {

        /* renamed from: a */
        final /* synthetic */ MmVideoViewControl f117489a;

        /* renamed from: b */
        final /* synthetic */ MmBaseInfo f117490b;

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: e */
        public int mo164046e() {
            return (int) this.f117489a.f117484a.mo161230c().mo163627d();
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: a */
        public void mo164041a() {
            AbstractC46597d b;
            C46602i g = ((IMmVideoDependency) this.f117489a.mo161247w()).mo163630g();
            if (g != null && (b = g.mo163686b()) != null) {
                b.mo163700a();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: b */
        public void mo164043b() {
            AbstractC46597d b;
            C46602i g = ((IMmVideoDependency) this.f117489a.mo161247w()).mo163630g();
            if (g != null && (b = g.mo163686b()) != null) {
                b.mo163706b();
            }
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: c */
        public void mo164044c() {
            this.f117489a.f117484a.mo161230c().mo163618a(RangesKt.coerceAtLeast(this.f117489a.f117484a.mo161230c().mo163627d() - ((long) 15000), 0L));
            C47083e.m186425a(C47085h.m186430a(((IMmVideoDependency) this.f117489a.mo161247w()).mo163616a()), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("fifteen_secs_back").mo165423e("none").mo165426h("background_mode").mo165421c());
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: d */
        public void mo164045d() {
            this.f117489a.f117484a.mo161230c().mo163618a(RangesKt.coerceAtMost(this.f117489a.f117484a.mo161230c().mo163627d() + ((long) 15000), this.f117490b.getDuration()));
            C47083e.m186425a(C47085h.m186430a(((IMmVideoDependency) this.f117489a.mo161247w()).mo163616a()), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("fifteen_secs_forward").mo165423e("none").mo165426h("background_mode").mo165421c());
        }

        @Override // com.ss.android.lark.mm.module.player.notification.AbstractC46706b
        /* renamed from: a */
        public void mo164042a(long j) {
            this.f117489a.f117484a.mo161230c().mo163618a(j);
        }

        C46700a(MmVideoViewControl fVar, MmBaseInfo mmBaseInfo) {
            this.f117489a = fVar;
            this.f117490b = mmBaseInfo;
        }
    }

    @Override // com.ss.android.lark.mm.module.player.IMmVideoListener
    /* renamed from: a */
    public void mo164008a() {
        AbstractC46597d b;
        C46602i g = ((IMmVideoDependency) mo161247w()).mo163630g();
        if (g != null && (b = g.mo163686b()) != null) {
            b.mo163700a();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.IMmVideoListener
    /* renamed from: b */
    public void mo164010b() {
        AbstractC46597d b;
        C46602i g = ((IMmVideoDependency) mo161247w()).mo163630g();
        if (g != null && (b = g.mo163686b()) != null) {
            b.mo163706b();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: x */
    public void mo161248x() {
        super.mo161248x();
        if (!((IMmVideoDependency) mo161247w()).mo163631h()) {
            ((IMmVideoDependency) mo161247w()).mo163628e();
        }
    }

    /* renamed from: j */
    private final void m184806j() {
        MmBaseInfo a = ((IMmVideoDependency) mo161247w()).mo163616a();
        if (a != null) {
            ((IMmVideoDependency) mo161247w()).mo163622a(a.getTopic(), ((IMmVideoDependency) mo161247w()).mo163627d(), a.getDuration());
            ((IMmVideoDependency) mo161247w()).mo163621a(new C46700a(this, a));
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        this.f117485b = (ViewGroup) this.f117488e.mo161233o().findViewById(R.id.videoContainer);
        m184805a(((IMmVideoDependency) mo161247w()).mo163625b());
        m184806j();
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        if (!((IMmVideoDependency) mo161247w()).mo163631h()) {
            ((IMmVideoDependency) mo161247w()).mo163629f();
        }
        ((IMmVideoDependency) mo161247w()).mo163621a((AbstractC46706b) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mm/module/player/MmVideoViewControl$initVideoView$1$1", "Lcom/ss/android/lark/mm/module/player/core/MmSimpleMediaView$IMmSimpleMediaViewListener;", "onMediaViewTouchMove", "", "diff", "", "onMediaViewTouchUp", "totalDiff", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.f$b */
    public static final class C46701b implements MmSimpleMediaView.AbstractC46592a {

        /* renamed from: a */
        final /* synthetic */ MmVideoViewControl f117491a;

        C46701b(MmVideoViewControl fVar) {
            this.f117491a = fVar;
        }

        @Override // com.ss.android.lark.mm.module.player.core.MmSimpleMediaView.AbstractC46592a
        /* renamed from: a */
        public void mo163652a(float f) {
            ((IMmVideoDependency) this.f117491a.mo161247w()).mo163617a(f);
        }

        @Override // com.ss.android.lark.mm.module.player.core.MmSimpleMediaView.AbstractC46592a
        /* renamed from: b */
        public void mo163653b(float f) {
            ((IMmVideoDependency) this.f117491a.mo161247w()).mo163623b(f);
        }
    }

    /* renamed from: a */
    private final void m184805a(boolean z) {
        if (z) {
            ((IMmVideoDependency) mo161247w()).mo163620a(this.f117488e.mo161232n(), this.f117484a.mo161230c().mo163626c());
            return;
        }
        C47117q.m186583a(this.f117487d);
        MmSimpleMediaView mmSimpleMediaView = new MmSimpleMediaView(this.f117488e.mo161232n());
        mmSimpleMediaView.setListener(new C46701b(this));
        this.f117486c = mmSimpleMediaView;
        ViewGroup viewGroup = this.f117485b;
        if (viewGroup != null) {
            viewGroup.addView(mmSimpleMediaView, 0, new ViewGroup.LayoutParams(-1, UIUtils.dp2px(this.f117488e.mo161232n(), 210.0f)));
        }
        MmBaseInfo a = ((IMmVideoDependency) mo161247w()).mo163616a();
        if (a != null) {
            ((IMmVideoDependency) mo161247w()).mo163619a(this.f117488e.mo161232n(), this.f117486c, a.getVideoUrl(), a.getVideoCover(), a.getTopic(), a.getDuration(), a.getVideoEncodingType());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmVideoViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmVideoListener, IMmVideoDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f117488e = gVar;
        this.f117484a = jVar;
        this.f117487d = gVar.mo161233o().findViewById(R.id.mockPlayerView);
    }

    @Override // com.ss.android.lark.mm.module.player.IMmVideoListener
    /* renamed from: a */
    public void mo164009a(long j, boolean z) {
        if (z) {
            ((IMmVideoDependency) mo161247w()).mo163624b(j);
            MmSimpleMediaView mmSimpleMediaView = this.f117486c;
            if (mmSimpleMediaView != null) {
                mmSimpleMediaView.mo163649a(j);
            }
        }
    }
}
