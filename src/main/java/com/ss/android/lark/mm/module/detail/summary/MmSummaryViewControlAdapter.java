package com.ss.android.lark.mm.module.detail.summary;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.IMmDetailInquirer;
import com.ss.android.lark.mm.module.detail.main.IMmDetailListener;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.mention.MmMentionUrlUtils;
import com.ss.android.lark.mm.module.translate.IMmTranslateListener;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryListener;", "Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryControl;)V", "mentionSummaryId", "", "getDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.summary.g */
public final class MmSummaryViewControlAdapter extends MmBaseViewControlAdapter<IMmSummaryListener, IMmSummaryDependency> {

    /* renamed from: a */
    public String f116607a;

    /* renamed from: b */
    public final MmViewControlRegister f116608b;

    /* renamed from: c */
    public final MmControlRegister f116609c;

    /* renamed from: d */
    public final MmSummaryControl f116610d;

    /* renamed from: b */
    public IMmSummaryDependency mo161230c() {
        return new C46281a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\tH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J-\u0010\u000f\u001a\u00020\u00032#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\tH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u001c\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\tH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016¨\u0006\u001e"}, d2 = {"com/ss/android/lark/mm/module/detail/summary/MmSummaryViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/summary/IMmSummaryDependency;", "checkSummary", "", "contentId", "", "isChecked", "", "onResult", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getMentionSummaryId", "getOriginalContent", "getSummaries", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "getTranslateLanguage", "isInitialDisplaySummary", "loadBaseInfo", "onSuccess", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "notifyChangeSummaryTabVisible", "notifyDismissOriginSubtitleHighlight", "notifyFinishLoading", "notifyShowOriginTextDialog", "originText", "notifyTranslateBarHide", "notifyTranslateBarShow", "notifyUpdateViewDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.g$a */
    public static final class C46281a implements IMmSummaryDependency {

        /* renamed from: a */
        final /* synthetic */ MmSummaryViewControlAdapter f116611a;

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: b */
        public void mo162615b() {
            IMmDetailListener cVar = (IMmDetailListener) this.f116611a.f116608b.mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                cVar.mo161907j();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: c */
        public void mo162618c() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116611a.f116608b.mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161278g();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: d */
        public void mo162619d() {
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116611a.f116608b.mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161279i();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: f */
        public boolean mo162621f() {
            IMmDetailInquirer bVar = (IMmDetailInquirer) this.f116611a.f116608b.mo161259a(IMmDetailInquirer.class);
            if (bVar == null || bVar.mo161899b() != 1) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: g */
        public void mo162622g() {
            IMmDetailStartUpListener cVar = (IMmDetailStartUpListener) this.f116611a.f116608b.mo161266d(IMmDetailStartUpListener.class);
            if (cVar != null) {
                cVar.mo161411a();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: h */
        public void mo162623h() {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f116611a.f116608b.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162293k();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: i */
        public void mo162624i() {
            IMmDetailListener cVar = (IMmDetailListener) this.f116611a.f116608b.mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                cVar.mo161906i();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: a */
        public String mo162611a() {
            MmTranslateLangType a;
            String value;
            MmTranslateControl dVar = (MmTranslateControl) this.f116611a.f116609c.mo161912a(MmTranslateControl.class);
            if (dVar == null || (a = dVar.mo161280a()) == null || (value = a.getValue()) == null) {
                return MmTranslateLangType.DEFAULT.getValue();
            }
            return value;
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: e */
        public String mo162620e() {
            boolean z;
            String str = this.f116611a.f116607a;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f116611a.f116607a = MmMentionUrlUtils.f117052a.mo163367e(this.f116611a.f116610d.mo162631a());
            }
            return this.f116611a.f116607a;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummary;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.summary.g$a$a */
        static final class C46282a extends Lambda implements Function1<MmSummary, Unit> {
            final /* synthetic */ Function1 $onResult;
            final /* synthetic */ C46281a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46282a(C46281a aVar, Function1 function1) {
                super(1);
                this.this$0 = aVar;
                this.$onResult = function1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MmSummary mmSummary) {
                invoke(mmSummary);
                return Unit.INSTANCE;
            }

            public final void invoke(MmSummary mmSummary) {
                MmBaseInfo b;
                int i;
                Integer total;
                MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.this$0.f116611a.f116609c.mo161912a(MmMeetingBaseInfoControl.class);
                if (!(mmMeetingBaseInfoControl == null || (b = mmMeetingBaseInfoControl.mo161581b()) == null)) {
                    boolean z = false;
                    if (mmSummary == null || (total = mmSummary.getTotal()) == null) {
                        i = 0;
                    } else {
                        i = total.intValue();
                    }
                    if (i > 0) {
                        z = true;
                    }
                    b.setHasSummary(z);
                }
                this.$onResult.invoke(mmSummary);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46281a(MmSummaryViewControlAdapter gVar) {
            this.f116611a = gVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: a */
        public String mo162612a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "contentId");
            MmSummaryControl dVar = (MmSummaryControl) this.f116611a.f116609c.mo161912a(MmSummaryControl.class);
            if (dVar != null) {
                return dVar.mo162632a(str);
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: b */
        public void mo162616b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originText");
            IMmTranslateListener cVar = (IMmTranslateListener) this.f116611a.f116608b.mo161266d(IMmTranslateListener.class);
            if (cVar != null) {
                cVar.mo161275a(str);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: b */
        public void mo162617b(Function1<? super MmSummary, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onResult");
            MmSummaryControl dVar = (MmSummaryControl) this.f116611a.f116609c.mo161912a(MmSummaryControl.class);
            if (dVar != null) {
                dVar.mo162634a(mo162611a(), new C46282a(this, function1));
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: a */
        public void mo162614a(Function1<? super MmBaseInfo, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f116611a.f116609c.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                MmMeetingBaseInfoControl.m182198a(mmMeetingBaseInfoControl, function1, null, false, true, 6, null);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.summary.IMmSummaryDependency
        /* renamed from: a */
        public void mo162613a(String str, boolean z, Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(str, "contentId");
            Intrinsics.checkParameterIsNotNull(function1, "onResult");
            MmSummaryControl dVar = (MmSummaryControl) this.f116611a.f116609c.mo161912a(MmSummaryControl.class);
            if (dVar != null) {
                dVar.mo162635a(str, z, function1);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSummaryViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmSummaryControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f116608b = kVar;
        this.f116609c = eVar;
        this.f116610d = dVar;
    }
}
