package com.ss.android.lark.mm.module.record.detail.tips;

import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.detail.tips.MmRecordTipsControl;
import com.ss.android.lark.mm.p2288b.C45852d;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/record/detail/tips/IMmRecordTipsListener;", "Lcom/ss/android/lark/mm/module/record/detail/tips/IMmRecordTipsDependency;", "Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsControl$IRecordTipsControlListener;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsControl;)V", "getDependency", "onCreate", "", "onDestroy", "onRecordAlmostReachLimit", "onWeakNetwork", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.tips.f */
public final class MmRecordTipsViewControlAdapter extends MmBaseViewControlAdapter<IMmRecordTipsListener, IMmRecordTipsDependency> implements MmRecordTipsControl.IRecordTipsControlListener {

    /* renamed from: a */
    public final MmViewControlRegister f118111a;

    /* renamed from: b */
    public final MmRecordTipsControl f118112b;

    /* renamed from: c */
    private final MmControlRegister f118113c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/record/detail/tips/IMmRecordTipsDependency;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.tips.f$a */
    public static final class C46912a implements IMmRecordTipsDependency {
        C46912a() {
        }
    }

    /* renamed from: f */
    public IMmRecordTipsDependency mo161230c() {
        return new C46912a();
    }

    @Override // com.ss.android.lark.mm.module.record.detail.tips.MmRecordTipsControl.IRecordTipsControlListener
    /* renamed from: b */
    public void mo164739b() {
        IMmRecordTipsListener cVar = (IMmRecordTipsListener) this.f118111a.mo161266d(IMmRecordTipsListener.class);
        if (cVar != null) {
            cVar.mo164731a();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: d */
    public void mo161256d() {
        super.mo161256d();
        this.f118112b.mo164737b(this);
    }

    @Override // com.ss.android.lark.mm.module.record.detail.tips.MmRecordTipsControl.IRecordTipsControlListener
    /* renamed from: e */
    public void mo164740e() {
        IMmRecordTipsListener cVar = (IMmRecordTipsListener) this.f118111a.mo161266d(IMmRecordTipsListener.class);
        if (cVar != null) {
            cVar.mo164733b();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        this.f118112b.mo164735a(this);
        mo161257h().mo237937a(C45852d.m181651a().mo161150a(this.f118112b.mo164738c().getObjectToken()).mo164524b().subscribe(new C46913b(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.tips.f$b */
    static final class C46913b<T> implements Consumer<Pair<? extends String, ? extends MmRecordManager.RecordState>> {

        /* renamed from: a */
        final /* synthetic */ MmRecordTipsViewControlAdapter f118114a;

        C46913b(MmRecordTipsViewControlAdapter fVar) {
            this.f118114a = fVar;
        }

        /* renamed from: a */
        public final void accept(Pair<String, ? extends MmRecordManager.RecordState> pair) {
            IMmRecordTipsListener cVar;
            if (Intrinsics.areEqual(pair.getFirst(), this.f118114a.f118112b.mo164738c().getObjectToken()) && (cVar = (IMmRecordTipsListener) this.f118114a.f118111a.mo161266d(IMmRecordTipsListener.class)) != null) {
                cVar.mo164732a((MmRecordManager.RecordState) pair.getSecond());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordTipsViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmRecordTipsControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f118111a = kVar;
        this.f118113c = eVar;
        this.f118112b = dVar;
    }
}
