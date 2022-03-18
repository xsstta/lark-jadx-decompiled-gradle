package com.ss.android.lark.mine.impl.index.v2.list.base;

import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/base/IAsyncSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/ISubComponent;", "onAsyncViewReady", "", "registerAsyncObserver", "observer", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/IAsyncSubComponent$IAsyncObserver;", "unRegisterAsyncObserver", "IAsyncObserver", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.list.base.a */
public interface IAsyncSubComponent extends ISubComponent {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/base/IAsyncSubComponent$IAsyncObserver;", "", "onAsyncReady", "", "contentView", "Landroid/view/ViewGroup;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.base.a$a */
    public interface IAsyncObserver {
        /* renamed from: a */
        void mo160826a(ViewGroup viewGroup);
    }

    /* renamed from: a */
    void mo160833a(IAsyncObserver aVar);

    /* renamed from: b */
    void mo160834b(IAsyncObserver aVar);
}
