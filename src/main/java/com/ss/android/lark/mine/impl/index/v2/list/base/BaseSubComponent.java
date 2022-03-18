package com.ss.android.lark.mine.impl.index.v2.list.base;

import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.framework.larkwidget.Widget;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0004R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/ISubComponent;", "()V", "content", "Landroid/view/View;", "getContent", "()Landroid/view/View;", "onStart", "", "setupVisibility", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseSubComponent extends Widget implements ISubComponent {
    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: A */
    public void mo123661A() {
        super.mo123661A();
        mo121985c();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: h */
    public View mo160836h() {
        return mo141184K();
    }

    /* renamed from: c */
    public final void mo121985c() {
        UIUtils.display(mo141184K(), mo160829b());
    }
}
