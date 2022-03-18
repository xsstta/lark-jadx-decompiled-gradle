package com.ss.android.lark.mm.module.record.detail.tips;

import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/record/detail/tips/IMmRecordTipsListener;", "Lcom/ss/android/lark/mm/module/record/detail/tips/IMmRecordTipsDependency;", "Lcom/ss/android/lark/mm/module/record/detail/tips/IMmRecordTipsInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "banner", "Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordBanner;", "kotlin.jvm.PlatformType", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "onPhoneStateChange", "", "isCalling", "", "onRecordAlmostReachLimit", "onRecordStateChange", "state", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "onWeakNetwork", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.tips.e */
public final class MmRecordTipsViewControl extends MmBaseViewControl<IMmRecordTipsListener, IMmRecordTipsDependency> implements IMmRecordTipsInquirer, IMmRecordTipsListener {

    /* renamed from: a */
    private final MmRecordBanner f118108a;

    /* renamed from: b */
    private final IMmViewControlContext f118109b;

    /* renamed from: c */
    private final MmBaseViewControlAdapter<IMmRecordTipsListener, IMmRecordTipsDependency> f118110c;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: f */
    public IMmRecordTipsListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.record.detail.tips.IMmRecordTipsListener
    /* renamed from: a */
    public void mo164731a() {
        C45855f.m181664c("MmRecordTipsViewControl", "onRecordAlmostReachLimit");
        this.f118108a.mo164727a();
    }

    @Override // com.ss.android.lark.mm.module.record.detail.tips.IMmRecordTipsListener
    /* renamed from: b */
    public void mo164733b() {
        C45855f.m181664c("MmRecordTipsViewControl", "onWeakNetwork");
        this.f118108a.mo164729b();
    }

    /* renamed from: a */
    private final void m185819a(boolean z) {
        C45855f.m181664c("MmRecordTipsViewControl", "onPhoneStateChange isCalling: " + z);
        this.f118108a.mo164728a(z);
    }

    @Override // com.ss.android.lark.mm.module.record.detail.tips.IMmRecordTipsListener
    /* renamed from: a */
    public void mo164732a(MmRecordManager.RecordState recordState) {
        Intrinsics.checkParameterIsNotNull(recordState, "state");
        if (recordState == MmRecordManager.RecordState.DISABLED_BY_PHONE) {
            m185819a(true);
        } else if (recordState == MmRecordManager.RecordState.PAUSED) {
            m185819a(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordTipsViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmRecordTipsListener, IMmRecordTipsDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f118109b = gVar;
        this.f118110c = jVar;
        this.f118108a = (MmRecordBanner) gVar.mo161233o().findViewById(R.id.recordBanner);
    }
}
