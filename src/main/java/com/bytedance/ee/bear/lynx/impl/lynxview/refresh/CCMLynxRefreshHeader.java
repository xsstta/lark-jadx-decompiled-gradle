package com.bytedance.ee.bear.lynx.impl.lynxview.refresh;

import android.content.Context;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.C26840a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/lynxview/refresh/CCMLynxRefreshHeader;", "Lcom/lynx/tasm/behavior/ui/UIGroup;", "Lcom/lynx/tasm/behavior/ui/view/AndroidView;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "createView", "Landroid/content/Context;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CCMLynxRefreshHeader extends UIGroup<C26840a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26840a mo33942b(Context context) {
        return new C26840a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CCMLynxRefreshHeader(AbstractC26684l lVar) {
        super(lVar);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
    }
}
