package com.ss.android.lark.mm.module.detail.titlebar;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.IMmDetailListener;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.MmVideoControl;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolbarControl;
import com.ss.android.lark.mm.module.share.model.PermissionStatus;
import com.ss.android.lark.mm.module.translate.IMmTranslateListener;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.p2288b.C45859k;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68294a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarListener;", "Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarControl;)V", "getDependency", "onCreate", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.titlebar.e */
public final class MmDetailTitleBarViewControlAdapter extends MmBaseViewControlAdapter<IMmDetailTitleBarListener, IMmDetailTitleBarDependency> {

    /* renamed from: a */
    public final MmViewControlRegister f116628a;

    /* renamed from: b */
    public final MmControlRegister f116629b;

    /* renamed from: c */
    public final MmDetailTitleBarControl f116630c;

    /* renamed from: b */
    public IMmDetailTitleBarDependency mo161230c() {
        return new C46295a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u001a\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016¨\u0006%"}, d2 = {"com/ss/android/lark/mm/module/detail/titlebar/MmDetailTitleBarViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/titlebar/IMmDetailTitleBarDependency;", "changeTitle", "", "title", "", "onSuccess", "Lkotlin/Function0;", "deleteMm", "onData", "Lkotlin/Function1;", "detachVideoViewFromParent", "Landroid/view/View;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "getLatestPollVersion", "", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isRemoteVideoPlayable", "", "isValidateStatus", "notifyChangeTopic", "objectToken", "newName", "notifyDeleted", "notifyExitTranslate", "notifyMediaViewModeChange", "isNormal", "videoView", "notifyShowVideoView", "notifyStartTranslate", "notifySwitchComment", "switchOn", "notifySwitchReaction", "notifySwitchToSubtitleTab", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.e$a */
    public static final class C46295a implements IMmDetailTitleBarDependency {

        /* renamed from: a */
        final /* synthetic */ MmDetailTitleBarViewControlAdapter f116631a;

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: i */
        public String mo162745i() {
            return this.f116631a.f116630c.mo162746a();
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: a */
        public MmBaseInfo mo162732a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116631a.f116629b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: b */
        public void mo162737b() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116631a.f116628a.mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161276b();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: c */
        public void mo162739c() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116631a.f116628a.mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161277f();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: d */
        public MmTranslateLangType mo162740d() {
            MmTranslateLangType a;
            MmTranslateControl dVar = (MmTranslateControl) this.f116631a.f116629b.mo161912a(MmTranslateControl.class);
            if (dVar == null || (a = dVar.mo161280a()) == null) {
                return MmTranslateLangType.DEFAULT;
            }
            return a;
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: e */
        public boolean mo162741e() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116631a.f116629b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161590h();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: g */
        public void mo162743g() {
            IMmDetailStartUpListener cVar = (IMmDetailStartUpListener) this.f116631a.f116628a.mo161266d(IMmDetailStartUpListener.class);
            if (cVar != null) {
                cVar.mo161413b();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: h */
        public int mo162744h() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116631a.f116629b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161588f();
            }
            return 0;
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: f */
        public boolean mo162742f() {
            MmBaseInfo b;
            String videoUrl;
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116631a.f116629b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl == null || (b = mmMeetingBaseInfoControl.mo161581b()) == null || (videoUrl = b.getVideoUrl()) == null || !(!StringsKt.isBlank(videoUrl))) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46295a(MmDetailTitleBarViewControlAdapter eVar) {
            this.f116631a = eVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: b */
        public void mo162738b(boolean z) {
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) this.f116631a.f116628a.mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                cVar.mo164217b(z);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: a */
        public void mo162735a(Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onData");
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116631a.f116629b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                mmMeetingBaseInfoControl.mo161583b(function1);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: a */
        public void mo162736a(boolean z) {
            IMmVideoToolbarListener cVar = (IMmVideoToolbarListener) this.f116631a.f116628a.mo161266d(IMmVideoToolbarListener.class);
            if (cVar != null) {
                cVar.mo164215a(z);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: a */
        public void mo162734a(String str, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116631a.f116629b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                mmMeetingBaseInfoControl.mo161576a(str, function0);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.titlebar.IMmDetailTitleBarDependency
        /* renamed from: a */
        public void mo162733a(String str, String str2) {
            long j;
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            Intrinsics.checkParameterIsNotNull(str2, "newName");
            MmVideoToolbarControl fVar = (MmVideoToolbarControl) this.f116631a.f116629b.mo161912a(MmVideoToolbarControl.class);
            if (fVar != null) {
                fVar.mo164229a(str, str2);
            }
            IMmDetailListener cVar = (IMmDetailListener) this.f116631a.f116628a.mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                cVar.mo161901a(str2);
            }
            MmVideoControl eVar = (MmVideoControl) this.f116631a.f116629b.mo161912a(MmVideoControl.class);
            if (eVar != null) {
                MmBaseInfo a = mo162732a();
                if (a != null) {
                    j = a.getDuration();
                } else {
                    j = 0;
                }
                eVar.mo164022a(str2, j);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        C68294a<PermissionStatus> d;
        Disposable subscribe;
        super.mo161251a();
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116629b.mo161912a(MmMeetingBaseInfoControl.class);
        if (mmMeetingBaseInfoControl != null && (d = mmMeetingBaseInfoControl.mo161586d()) != null && (subscribe = d.subscribe(new C46296b(this))) != null) {
            mo161257h().mo237937a(subscribe);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/share/model/PermissionStatus;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.titlebar.e$b */
    static final class C46296b<T> implements Consumer<PermissionStatus> {

        /* renamed from: a */
        final /* synthetic */ MmDetailTitleBarViewControlAdapter f116632a;

        C46296b(MmDetailTitleBarViewControlAdapter eVar) {
            this.f116632a = eVar;
        }

        /* renamed from: a */
        public final void accept(final PermissionStatus permissionStatus) {
            C45859k.m181685a(new Runnable(this) {
                /* class com.ss.android.lark.mm.module.detail.titlebar.MmDetailTitleBarViewControlAdapter.C46296b.RunnableC462971 */

                /* renamed from: a */
                final /* synthetic */ C46296b f116633a;

                {
                    this.f116633a = r1;
                }

                public final void run() {
                    IMmDetailTitleBarListener cVar = (IMmDetailTitleBarListener) this.f116633a.f116632a.mo161258i();
                    if (cVar != null) {
                        PermissionStatus permissionStatus = permissionStatus;
                        Intrinsics.checkExpressionValueIsNotNull(permissionStatus, "it");
                        cVar.mo162719a(permissionStatus);
                    }
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailTitleBarViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmDetailTitleBarControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f116628a = kVar;
        this.f116629b = eVar;
        this.f116630c = dVar;
    }
}
