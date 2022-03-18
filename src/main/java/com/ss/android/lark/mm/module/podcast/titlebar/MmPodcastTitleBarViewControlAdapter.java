package com.ss.android.lark.mm.module.podcast.titlebar;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/titlebar/MmPodcastTitleBarViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/podcast/titlebar/IMmPodcastTitleBarListener;", "Lcom/ss/android/lark/mm/module/podcast/titlebar/IMmPodcastTitleBarDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/podcast/titlebar/MmPodcastTitleBarControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/podcast/titlebar/MmPodcastTitleBarControl;)V", "getDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.b.f */
public final class MmPodcastTitleBarViewControlAdapter extends MmBaseViewControlAdapter<IMmPodcastTitleBarListener, IMmPodcastTitleBarDependency> {

    /* renamed from: a */
    public final MmControlRegister f117700a;

    /* renamed from: b */
    private final MmViewControlRegister f117701b;

    /* renamed from: c */
    private final MmPodcastTitleBarControl f117702c;

    /* renamed from: b */
    public IMmPodcastTitleBarDependency mo161230c() {
        return new C46775a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/podcast/titlebar/MmPodcastTitleBarViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/podcast/titlebar/IMmPodcastTitleBarDependency;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getTopic", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.b.f$a */
    public static final class C46775a implements IMmPodcastTitleBarDependency {

        /* renamed from: a */
        final /* synthetic */ MmPodcastTitleBarViewControlAdapter f117703a;

        @Override // com.ss.android.lark.mm.module.framework.IMmBaseInfoDependency
        /* renamed from: a */
        public MmBaseInfo mo161229a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f117703a.f117700a.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.podcast.titlebar.IMmPodcastTitleBarDependency
        /* renamed from: b */
        public String mo164353b() {
            String a;
            MmPodcastControl mmPodcastControl = (MmPodcastControl) this.f117703a.f117700a.mo161912a(MmPodcastControl.class);
            if (mmPodcastControl == null || (a = mmPodcastControl.mo164263a()) == null) {
                return "";
            }
            return a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46775a(MmPodcastTitleBarViewControlAdapter fVar) {
            this.f117703a = fVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmPodcastTitleBarViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmPodcastTitleBarControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f117701b = kVar;
        this.f117700a = eVar;
        this.f117702c = dVar;
    }
}
