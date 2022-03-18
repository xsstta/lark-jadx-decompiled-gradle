package com.ss.android.lark.mm.module.detail.search;

import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.mm.module.detail.main.IMmDetailListener;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.player.IMmVideoListener;
import com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/MmDetailSearchViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchListener;", "Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/search/MmSearchControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/detail/search/MmSearchControl;)V", "getDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.search.f */
public final class MmDetailSearchViewControlAdapter extends MmBaseViewControlAdapter<IMmDetailSearchListener, IMmDetailSearchDependency> {

    /* renamed from: a */
    public final MmViewControlRegister f116246a;

    /* renamed from: b */
    public final MmControlRegister f116247b;

    /* renamed from: c */
    public final MmSearchControl f116248c;

    /* renamed from: b */
    public IMmDetailSearchDependency mo161230c() {
        return new C46125a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000728\u0010\b\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\tH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016¨\u0006\u001e"}, d2 = {"com/ss/android/lark/mm/module/detail/search/MmDetailSearchViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchDependency;", "find", "", SearchIntents.EXTRA_QUERY, "", "findKeyword", "", "onResponse", "Lkotlin/Function2;", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "Lkotlin/ParameterName;", "name", "res", "", "total", "getBottomPanelHeight", "getToken", "getTranslateLang", "notifyChangeFindResultFocus", "index", "notifyChangeKeyword", "content", "isAuto", "isKeyword", "notifyFindResult", "findResponse", "notifyPausePlay", "notifyStartFind", "notifyStopFind", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.f$a */
    public static final class C46125a implements IMmDetailSearchDependency {

        /* renamed from: a */
        final /* synthetic */ MmDetailSearchViewControlAdapter f116249a;

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: a */
        public String mo162028a() {
            return this.f116249a.f116248c.mo162044a();
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: b */
        public void mo162032b() {
            IMmVideoListener dVar = (IMmVideoListener) this.f116249a.f116246a.mo161266d(IMmVideoListener.class);
            if (dVar != null) {
                dVar.mo164008a();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: c */
        public void mo162033c() {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116249a.f116246a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162291i();
            }
            IMmDetailListener cVar2 = (IMmDetailListener) this.f116249a.f116246a.mo161266d(IMmDetailListener.class);
            if (cVar2 != null) {
                cVar2.mo161905g();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: d */
        public void mo162034d() {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116249a.f116246a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162292j();
            }
            IMmDetailListener cVar2 = (IMmDetailListener) this.f116249a.f116246a.mo161266d(IMmDetailListener.class);
            if (cVar2 != null) {
                cVar2.bf_();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: e */
        public String mo162035e() {
            MmTranslateLangType a;
            String value;
            MmTranslateControl dVar = (MmTranslateControl) this.f116249a.f116247b.mo161912a(MmTranslateControl.class);
            if (dVar == null || (a = dVar.mo161280a()) == null || (value = a.getValue()) == null) {
                return MmTranslateLangType.DEFAULT.getValue();
            }
            return value;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46125a(MmDetailSearchViewControlAdapter fVar) {
            this.f116249a = fVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: a */
        public void mo162029a(int i) {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116249a.f116246a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162276a(i);
            }
            IMmVideoToolbarListener cVar2 = (IMmVideoToolbarListener) this.f116249a.f116246a.mo161266d(IMmVideoToolbarListener.class);
            if (cVar2 != null) {
                cVar2.mo164209a(i);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: a */
        public void mo162030a(FindResponse findResponse) {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116249a.f116246a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162282a(findResponse);
            }
            IMmVideoToolbarListener cVar2 = (IMmVideoToolbarListener) this.f116249a.f116246a.mo161266d(IMmVideoToolbarListener.class);
            if (cVar2 != null) {
                cVar2.mo164212a(findResponse);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchDependency
        /* renamed from: a */
        public void mo162031a(String str, boolean z, Function2<? super FindResponse, ? super Integer, Unit> kVar) {
            MmTranslateLangType mmTranslateLangType;
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            Intrinsics.checkParameterIsNotNull(kVar, "onResponse");
            MmSearchControl gVar = this.f116249a.f116248c;
            MmTranslateControl dVar = (MmTranslateControl) this.f116249a.f116247b.mo161912a(MmTranslateControl.class);
            if (dVar == null || (mmTranslateLangType = dVar.mo161280a()) == null) {
                mmTranslateLangType = MmTranslateLangType.DEFAULT;
            }
            gVar.mo162045a(str, z, mmTranslateLangType, kVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailSearchViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmSearchControl gVar) {
        super(kVar, eVar, gVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(gVar, "control");
        this.f116246a = kVar;
        this.f116247b = eVar;
        this.f116248c = gVar;
    }
}
