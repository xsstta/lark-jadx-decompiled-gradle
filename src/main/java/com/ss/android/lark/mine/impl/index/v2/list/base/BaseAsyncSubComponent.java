package com.ss.android.lark.mine.impl.index.v2.list.base;

import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.mine.impl.index.v2.list.base.IAsyncSubComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseAsyncSubComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/IAsyncSubComponent;", "()V", "content", "Landroid/view/View;", "getContent", "()Landroid/view/View;", "observers", "", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/IAsyncSubComponent$IAsyncObserver;", "", "onAsyncViewReady", "", "registerAsyncObserver", "observer", "setupVisibility", "unRegisterAsyncObserver", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseAsyncSubComponent extends Widget implements IAsyncSubComponent {

    /* renamed from: a */
    private final Map<IAsyncSubComponent.IAsyncObserver, Object> f115371a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: h */
    public View mo160836h() {
        return mo141184K();
    }

    /* renamed from: c */
    private final void mo121985c() {
        UIUtils.display(mo141184K(), mo160829b());
    }

    /* renamed from: g */
    public void mo160835g() {
        mo121985c();
        for (Map.Entry<IAsyncSubComponent.IAsyncObserver, Object> entry : this.f115371a.entrySet()) {
            IAsyncSubComponent.IAsyncObserver key = entry.getKey();
            View h = mo160836h();
            if (h != null) {
                key.mo160826a((ViewGroup) h);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.IAsyncSubComponent
    /* renamed from: a */
    public void mo160833a(IAsyncSubComponent.IAsyncObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f115371a.put(aVar, new Object());
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.IAsyncSubComponent
    /* renamed from: b */
    public void mo160834b(IAsyncSubComponent.IAsyncObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f115371a.remove(aVar);
    }
}
