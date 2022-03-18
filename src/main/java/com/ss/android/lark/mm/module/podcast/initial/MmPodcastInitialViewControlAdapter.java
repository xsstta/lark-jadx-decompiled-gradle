package com.ss.android.lark.mm.module.podcast.initial;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialControl;
import com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleListener;
import com.ss.android.lark.mm.module.podcast.subtitle.MmPodcastSubtitleControl;
import com.ss.android.lark.mm.module.podcast.titlebar.IMmPodcastTitleBarListener;
import com.ss.android.lark.mm.p2288b.C45852d;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/podcast/initial/IMmPodcastInitialListener;", "Lcom/ss/android/lark/mm/module/podcast/initial/IMmPodcastInitialDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl;)V", "getDependency", "onCreate", "", "onDestroy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.a.f */
public final class MmPodcastInitialViewControlAdapter extends MmBaseViewControlAdapter<IMmPodcastInitialListener, IMmPodcastInitialDependency> {

    /* renamed from: a */
    public final MmViewControlRegister f117690a;

    /* renamed from: b */
    public final MmControlRegister f117691b;

    /* renamed from: c */
    public final MmPodcastInitialControl f117692c;

    /* renamed from: b */
    public IMmPodcastInitialDependency mo161230c() {
        return new C46772a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/podcast/initial/IMmPodcastInitialDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getListInfoList", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "getPodcastBg", "", "onSuccess", "Lkotlin/Function1;", "", "getSpeed", "", "getToken", "getUrl", "isPlaying", "", "isSilenceEnabled", "loadBaseInfoRx", "Lio/reactivex/Single;", "loadSubtitles", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "releasePlayer", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.f$a */
    public static final class C46772a implements IMmPodcastInitialDependency {

        /* renamed from: a */
        final /* synthetic */ MmPodcastInitialViewControlAdapter f117693a;

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: g */
        public String mo164313g() {
            return this.f117693a.f117692c.mo164327b();
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: j */
        public String mo164316j() {
            return this.f117693a.f117692c.mo164323a();
        }

        @Override // com.ss.android.lark.mm.module.framework.IMmBaseInfoDependency
        /* renamed from: a */
        public MmBaseInfo mo161229a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f117693a.f117691b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: d */
        public float mo164310d() {
            MmVideoControl eVar = (MmVideoControl) this.f117693a.f117691b.mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164037l();
            }
            return 1.0f;
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: e */
        public boolean mo164311e() {
            MmVideoControl eVar = (MmVideoControl) this.f117693a.f117691b.mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164035i();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: f */
        public boolean mo164312f() {
            MmVideoControl eVar = (MmVideoControl) this.f117693a.f117691b.mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164032f();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: h */
        public List<MmPodcastLinkInfo> mo164314h() {
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            return a.mo161151b().mo164270b();
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: i */
        public void mo164315i() {
            MmVideoControl eVar = (MmVideoControl) this.f117693a.f117691b.mo161912a(MmVideoControl.class);
            if (eVar != null) {
                eVar.mo161235k();
            }
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: b */
        public Single<MmBaseInfo> mo164308b() {
            Single<MmBaseInfo> a;
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f117693a.f117691b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null && (a = MmMeetingBaseInfoControl.m182196a(mmMeetingBaseInfoControl, false, 1, (Object) null)) != null) {
                return a;
            }
            Single<MmBaseInfo> error = Single.error(new Throwable("MmMeetingBaseInfoControl is null"));
            Intrinsics.checkExpressionValueIsNotNull(error, "Single.error(Throwable(\"…aseInfoControl is null\"))");
            return error;
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: c */
        public Single<MmSubtitles> mo164309c() {
            Single<MmSubtitles> c;
            MmPodcastSubtitleControl fVar = (MmPodcastSubtitleControl) this.f117693a.f117691b.mo161912a(MmPodcastSubtitleControl.class);
            if (fVar != null && (c = fVar.mo164429c()) != null) {
                return c;
            }
            Single<MmSubtitles> error = Single.error(new Throwable("MmPodcastSubtitleControl is null"));
            Intrinsics.checkExpressionValueIsNotNull(error, "Single.error(Throwable(\"…ubtitleControl is null\"))");
            return error;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46772a(MmPodcastInitialViewControlAdapter fVar) {
            this.f117693a = fVar;
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialDependency
        /* renamed from: a */
        public void mo164307a(Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            this.f117693a.f117692c.mo164326a(function1);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        this.f117692c.mo164324a(new C46773b(this));
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: d */
    public void mo161256d() {
        super.mo161256d();
        this.f117692c.mo164324a((MmPodcastInitialControl.IMmPodcastInitialControlListener) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialViewControlAdapter$onCreate$1", "Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl$IMmPodcastInitialControlListener;", "onShowNoAvailablePlayInfo", "", "onShowRetryPage", "onSwitchPodcastSucceed", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.f$b */
    public static final class C46773b implements MmPodcastInitialControl.IMmPodcastInitialControlListener {

        /* renamed from: a */
        final /* synthetic */ MmPodcastInitialViewControlAdapter f117694a;

        @Override // com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialControl.IMmPodcastInitialControlListener
        /* renamed from: b */
        public void mo164332b() {
            IMmPodcastInitialListener cVar = (IMmPodcastInitialListener) this.f117694a.f117690a.mo161266d(IMmPodcastInitialListener.class);
            if (cVar != null) {
                cVar.mo164321g();
            }
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialControl.IMmPodcastInitialControlListener
        /* renamed from: a */
        public void mo164331a() {
            IMmPodcastInitialListener cVar = (IMmPodcastInitialListener) this.f117694a.f117690a.mo161266d(IMmPodcastInitialListener.class);
            if (cVar != null) {
                cVar.mo164322i();
            }
            IMmVideoToolbarListener cVar2 = (IMmVideoToolbarListener) this.f117694a.f117690a.mo161266d(IMmVideoToolbarListener.class);
            if (cVar2 != null) {
                cVar2.mo164219i();
            }
        }

        @Override // com.ss.android.lark.mm.module.podcast.initial.MmPodcastInitialControl.IMmPodcastInitialControlListener
        /* renamed from: c */
        public void mo164333c() {
            IMmPodcastInitialListener cVar = (IMmPodcastInitialListener) this.f117694a.f117690a.mo161266d(IMmPodcastInitialListener.class);
            if (cVar != null) {
                cVar.mo164320f();
            }
            IMmPodcastTitleBarListener cVar2 = (IMmPodcastTitleBarListener) this.f117694a.f117690a.mo161266d(IMmPodcastTitleBarListener.class);
            if (cVar2 != null) {
                cVar2.mo164354a();
            }
            IMmPodcastSubtitleListener cVar3 = (IMmPodcastSubtitleListener) this.f117694a.f117690a.mo161266d(IMmPodcastSubtitleListener.class);
            if (cVar3 != null) {
                cVar3.mo164407g();
            }
            IMmVideoToolbarListener cVar4 = (IMmVideoToolbarListener) this.f117694a.f117690a.mo161266d(IMmVideoToolbarListener.class);
            if (cVar4 != null) {
                cVar4.mo164218g();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46773b(MmPodcastInitialViewControlAdapter fVar) {
            this.f117694a = fVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastInitialViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmPodcastInitialControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f117690a = kVar;
        this.f117691b = eVar;
        this.f117692c = dVar;
    }
}
