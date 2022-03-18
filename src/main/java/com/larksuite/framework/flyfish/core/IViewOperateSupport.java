package com.larksuite.framework.flyfish.core;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/larksuite/framework/flyfish/core/IViewOperateSupport;", "", "addViewNoLayoutRequest", "", "child", "Landroid/view/View;", "index", "", "params", "Landroid/view/ViewGroup$LayoutParams;", "getChildCount", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.framework.flyfish.core.d */
public interface IViewOperateSupport {
    /* renamed from: a */
    void mo92354a(View view, int i, ViewGroup.LayoutParams layoutParams);

    int getChildCount();
}
