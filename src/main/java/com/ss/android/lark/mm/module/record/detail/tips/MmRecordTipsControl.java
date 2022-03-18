package com.ss.android.lark.mm.module.record.detail.tips;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;)V", "getBaseInfo", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "listeners", "", "Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsControl$IRecordTipsControlListener;", "addListener", "", "listener", "onDestroy", "onRecordAlmostReachLimit", "onWeakNetWork", "removeListener", "IRecordTipsControlListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.tips.d */
public final class MmRecordTipsControl extends MmBaseControl {

    /* renamed from: a */
    private final List<IRecordTipsControlListener> f118106a = new ArrayList();

    /* renamed from: b */
    private final MmBaseInfo f118107b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/tips/MmRecordTipsControl$IRecordTipsControlListener;", "", "onRecordAlmostReachLimit", "", "onWeakNetwork", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.tips.d$a */
    public interface IRecordTipsControlListener {
        /* renamed from: b */
        void mo164739b();

        /* renamed from: e */
        void mo164740e();
    }

    /* renamed from: c */
    public final MmBaseInfo mo164738c() {
        return this.f118107b;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        super.mo161235k();
        this.f118106a.clear();
    }

    /* renamed from: a */
    public final void mo164734a() {
        Iterator<T> it = this.f118106a.iterator();
        while (it.hasNext()) {
            it.next().mo164739b();
        }
    }

    /* renamed from: b */
    public final void mo164736b() {
        Iterator<T> it = this.f118106a.iterator();
        while (it.hasNext()) {
            it.next().mo164740e();
        }
    }

    /* renamed from: a */
    public final void mo164735a(IRecordTipsControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f118106a.add(aVar);
    }

    /* renamed from: b */
    public final void mo164737b(IRecordTipsControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f118106a.remove(aVar);
    }

    public MmRecordTipsControl(MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        this.f118107b = mmBaseInfo;
    }
}
