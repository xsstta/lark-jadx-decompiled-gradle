package com.ss.android.lark.mm.module.detail.main;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailListener;
import com.ss.android.lark.mm.module.detail.search.IMmDetailSearchInquirer;
import com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener;
import com.ss.android.lark.mm.module.detail.summary.IMmSummaryListener;
import com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarInquirer;
import com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarListener;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.mention.MmMentionUrlUtils;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.p2288b.C45855f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68294a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/MmDetailViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/main/IMmDetailListener;", "Lcom/ss/android/lark/mm/module/detail/main/IMmDetailDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/main/MmDetailControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmDetailControl;)V", "getControl", "()Lcom/ss/android/lark/mm/module/detail/main/MmDetailControl;", "getControlRegister", "()Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getDependency", "onCreate", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.i */
public final class MmDetailViewControlAdapter extends MmBaseViewControlAdapter<IMmDetailListener, IMmDetailDependency> {

    /* renamed from: a */
    private final MmViewControlRegister f116163a;

    /* renamed from: b */
    private final MmControlRegister f116164b;

    /* renamed from: c */
    private final MmDetailControl f116165c;

    /* renamed from: e */
    public final MmViewControlRegister mo161944e() {
        return this.f116163a;
    }

    /* renamed from: f */
    public final MmControlRegister mo161945f() {
        return this.f116164b;
    }

    /* renamed from: g */
    public final MmDetailControl mo161946g() {
        return this.f116165c;
    }

    /* renamed from: b */
    public IMmDetailDependency mo161230c() {
        return new C46085a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0011H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/lark/mm/module/detail/main/MmDetailViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/main/IMmDetailDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "isEditMode", "", "isMentionFromSummary", "isSearching", "notifyRefresh", "", "notifyStopScroll", "notifyVideoPlayerCompletelyVisible", "isCompletelyVisible", "notifyVideoPlayerVisibilityChange", "isVisible", "sendReviewAppeal", "onData", "Lkotlin/Function1;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.i$a */
    public static final class C46085a implements IMmDetailDependency {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControlAdapter f116166a;

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: b */
        public MmBaseInfo mo161892b() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116166a.mo161945f().mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: c */
        public void mo161894c() {
            IMmDetailStartUpListener cVar = (IMmDetailStartUpListener) this.f116166a.mo161944e().mo161266d(IMmDetailStartUpListener.class);
            if (cVar != null) {
                cVar.mo161415f();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: d */
        public boolean mo161895d() {
            return MmMentionUrlUtils.f117052a.mo163366d(this.f116166a.mo161946g().mo161922a());
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: e */
        public boolean mo161896e() {
            IMmDetailTitleBarInquirer bVar = (IMmDetailTitleBarInquirer) this.f116166a.mo161944e().mo161259a(IMmDetailTitleBarInquirer.class);
            if (bVar != null) {
                return bVar.mo162722a();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: f */
        public boolean mo161897f() {
            Boolean b;
            IMmDetailSearchInquirer cVar = (IMmDetailSearchInquirer) this.f116166a.mo161944e().mo161259a(IMmDetailSearchInquirer.class);
            if (cVar == null || (b = cVar.mo162037b()) == null) {
                return false;
            }
            return b.booleanValue();
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: a */
        public void mo161889a() {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116166a.mo161944e().mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162275a();
            }
            IMmContentDetailListener cVar2 = (IMmContentDetailListener) this.f116166a.mo161944e().mo161266d(IMmContentDetailListener.class);
            if (cVar2 != null) {
                cVar2.mo161349a();
            }
            IMmSummaryListener cVar3 = (IMmSummaryListener) this.f116166a.mo161944e().mo161266d(IMmSummaryListener.class);
            if (cVar3 != null) {
                cVar3.mo162625a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46085a(MmDetailViewControlAdapter iVar) {
            this.f116166a = iVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: a */
        public void mo161890a(Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onData");
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116166a.mo161945f().mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                mmMeetingBaseInfoControl.mo161585c(function1);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: b */
        public void mo161893b(boolean z) {
            IMmDetailTitleBarListener cVar = (IMmDetailTitleBarListener) this.f116166a.mo161944e().mo161266d(IMmDetailTitleBarListener.class);
            if (cVar != null) {
                cVar.mo162721a(z);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.main.IMmDetailDependency
        /* renamed from: a */
        public void mo161891a(boolean z) {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116166a.mo161944e().mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162286a(z);
            }
            IMmContentDetailListener cVar2 = (IMmContentDetailListener) this.f116166a.mo161944e().mo161266d(IMmContentDetailListener.class);
            if (cVar2 != null) {
                cVar2.mo161351a(z);
            }
            IMmSummaryListener cVar3 = (IMmSummaryListener) this.f116166a.mo161944e().mo161266d(IMmSummaryListener.class);
            if (cVar3 != null) {
                cVar3.mo162627a(z);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        C68294a<PermissionStatus> d;
        Disposable subscribe;
        C68294a<MmBaseInfo> e;
        Disposable subscribe2;
        super.mo161251a();
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116164b.mo161912a(MmMeetingBaseInfoControl.class);
        if (!(mmMeetingBaseInfoControl == null || (e = mmMeetingBaseInfoControl.mo161587e()) == null || (subscribe2 = e.subscribe(new C46086b(this))) == null)) {
            mo161257h().mo237937a(subscribe2);
        }
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl2 = (MmMeetingBaseInfoControl) this.f116164b.mo161912a(MmMeetingBaseInfoControl.class);
        if (mmMeetingBaseInfoControl2 != null && (d = mmMeetingBaseInfoControl2.mo161586d()) != null && (subscribe = d.subscribe(new C46087c(this))) != null) {
            mo161257h().mo237937a(subscribe);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.i$c */
    static final class C46087c<T> implements Consumer<PermissionStatus> {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControlAdapter f116168a;

        C46087c(MmDetailViewControlAdapter iVar) {
            this.f116168a = iVar;
        }

        /* renamed from: a */
        public final void accept(PermissionStatus permissionStatus) {
            IMmDetailListener cVar = (IMmDetailListener) this.f116168a.mo161258i();
            if (cVar != null) {
                cVar.mo161900a(permissionStatus);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.main.i$b */
    static final class C46086b<T> implements Consumer<MmBaseInfo> {

        /* renamed from: a */
        final /* synthetic */ MmDetailViewControlAdapter f116167a;

        C46086b(MmDetailViewControlAdapter iVar) {
            this.f116167a = iVar;
        }

        /* renamed from: a */
        public final void accept(MmBaseInfo mmBaseInfo) {
            Intrinsics.checkExpressionValueIsNotNull(mmBaseInfo, "it");
            String videoUrlWithLocal = mmBaseInfo.getVideoUrlWithLocal();
            boolean z = true;
            if (videoUrlWithLocal == null || !(!StringsKt.isBlank(videoUrlWithLocal))) {
                z = false;
            }
            C45855f.m181663b("MmDetailViewControlAdapter", "baseInfo Change isAudioResourceAvailable: " + z);
            IMmDetailListener cVar = (IMmDetailListener) this.f116167a.mo161258i();
            if (cVar != null) {
                cVar.mo161902a(z);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmDetailControl fVar) {
        super(kVar, eVar, fVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(fVar, "control");
        this.f116163a = kVar;
        this.f116164b = eVar;
        this.f116165c = fVar;
    }
}
