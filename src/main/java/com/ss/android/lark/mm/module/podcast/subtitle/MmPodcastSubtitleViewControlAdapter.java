package com.ss.android.lark.mm.module.podcast.subtitle;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.IMmVideoListener;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.podcast.initial.IMmPodcastInitialListener;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/podcast/subtitle/IMmPodcastSubtitleListener;", "Lcom/ss/android/lark/mm/module/podcast/subtitle/IMmPodcastSubtitleDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleControl;)V", "isFirstPlay", "", "getDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.h */
public final class MmPodcastSubtitleViewControlAdapter extends MmBaseViewControlAdapter<IMmPodcastSubtitleListener, IMmPodcastSubtitleDependency> {

    /* renamed from: a */
    public boolean f117812a = true;

    /* renamed from: b */
    public final MmViewControlRegister f117813b;

    /* renamed from: c */
    public final MmControlRegister f117814c;

    /* renamed from: d */
    public final MmPodcastSubtitleControl f117815d;

    /* renamed from: b */
    public IMmPodcastSubtitleDependency mo161230c() {
        return new C46809a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/mm/module/podcast/subtitle/MmPodcastSubtitleViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/podcast/subtitle/IMmPodcastSubtitleDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getPodcastSubtitles", "Lcom/ss/android/lark/mm/module/player/core/subtitle/MmSubtitles;", "isPlaying", "", "loadPodcastSubtitle", "", "onLoadSuccess", "Lkotlin/Function1;", "notifyChangePlaceholder", "isShow", "notifyDismissLoading", "notifySeekToPosition", "timestamp", "", "notifyStartPlay", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.subtitle.h$a */
    public static final class C46809a implements IMmPodcastSubtitleDependency {

        /* renamed from: a */
        final /* synthetic */ MmPodcastSubtitleViewControlAdapter f117816a;

        @Override // com.ss.android.lark.mm.module.framework.IMmBaseInfoDependency
        /* renamed from: a */
        public MmBaseInfo mo161229a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f117816a.f117814c.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleDependency
        /* renamed from: b */
        public MmSubtitles mo164399b() {
            return this.f117816a.f117815d.mo164428b().get(this.f117816a.f117815d.mo164425a());
        }

        @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleDependency
        /* renamed from: c */
        public void mo164400c() {
            IMmPodcastInitialListener cVar = (IMmPodcastInitialListener) this.f117816a.f117813b.mo161266d(IMmPodcastInitialListener.class);
            if (cVar != null) {
                cVar.mo164319b();
            }
        }

        @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleDependency
        /* renamed from: d */
        public boolean mo164401d() {
            MmVideoControl eVar = (MmVideoControl) this.f117816a.f117814c.mo161912a(MmVideoControl.class);
            if (eVar != null) {
                return eVar.mo164035i();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleDependency
        /* renamed from: e */
        public void mo164402e() {
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            if (!a.mo161151b().mo164289y() || !this.f117816a.f117812a) {
                C45855f.m181664c("MmPodcastSubtitleViewControlAdapter", "notifyStartPlay, isCanAutoPlay: false");
                return;
            }
            C45855f.m181664c("MmPodcastSubtitleViewControlAdapter", "notifyStartPlay, isCanAutoPlay: true ");
            this.f117816a.f117812a = false;
            IMmVideoListener dVar = (IMmVideoListener) this.f117816a.f117813b.mo161266d(IMmVideoListener.class);
            if (dVar != null) {
                dVar.mo164010b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46809a(MmPodcastSubtitleViewControlAdapter hVar) {
            this.f117816a = hVar;
        }

        @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleDependency
        /* renamed from: a */
        public void mo164397a(Function1<? super MmSubtitles, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onLoadSuccess");
            MmPodcastSubtitleControl.m185448a(this.f117816a.f117815d, function1, null, 2, null);
        }

        @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleDependency
        /* renamed from: a */
        public void mo164396a(long j) {
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) this.f117816a.f117813b.mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                cVar.mo164210a(j, true);
            }
        }

        @Override // com.ss.android.lark.mm.module.podcast.subtitle.IMmPodcastSubtitleDependency
        /* renamed from: a */
        public void mo164398a(boolean z) {
            IMmPodcastInitialListener cVar = (IMmPodcastInitialListener) this.f117816a.f117813b.mo161266d(IMmPodcastInitialListener.class);
            if (cVar != null) {
                cVar.mo164318a(z);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastSubtitleViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmPodcastSubtitleControl fVar) {
        super(kVar, eVar, fVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(fVar, "control");
        this.f117813b = kVar;
        this.f117814c = eVar;
        this.f117815d = fVar;
    }
}
