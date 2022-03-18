package com.ss.android.lark.mm.module.record.detail.titlebar;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/IMmRecordTitleBarListener;", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/IMmRecordTitleBarDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarControl;)V", "getControl", "()Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarControl;", "getControlRegister", "()Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getDependency", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.f */
public final class MmRecordTitleBarViewControlAdapter extends MmBaseViewControlAdapter<IMmRecordTitleBarListener, IMmRecordTitleBarDependency> {

    /* renamed from: a */
    private final MmViewControlRegister f118127a;

    /* renamed from: b */
    private final MmControlRegister f118128b;

    /* renamed from: c */
    private final MmRecordTitleBarControl f118129c;

    /* renamed from: e */
    public final MmRecordTitleBarControl mo164763e() {
        return this.f118129c;
    }

    /* renamed from: b */
    public IMmRecordTitleBarDependency mo161230c() {
        return new C46922a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/IMmRecordTitleBarDependency;", "changeTitle", "", "title", "", "onSuccess", "Lkotlin/Function0;", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.f$a */
    public static final class C46922a implements IMmRecordTitleBarDependency {

        /* renamed from: a */
        final /* synthetic */ MmRecordTitleBarViewControlAdapter f118130a;

        @Override // com.ss.android.lark.mm.module.record.detail.titlebar.IMmRecordTitleBarDependency
        /* renamed from: a */
        public MmBaseInfo mo164754a() {
            return this.f118130a.mo164763e().mo164756a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46922a(MmRecordTitleBarViewControlAdapter fVar) {
            this.f118130a = fVar;
        }

        @Override // com.ss.android.lark.mm.module.record.detail.titlebar.IMmRecordTitleBarDependency
        /* renamed from: a */
        public void mo164755a(String str, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(function0, "onSuccess");
            this.f118130a.mo164763e().mo164757a(str, function0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordTitleBarViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmRecordTitleBarControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f118127a = kVar;
        this.f118128b = eVar;
        this.f118129c = dVar;
    }
}
