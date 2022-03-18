package com.ss.android.lark.ui.lkuiplus;

import android.view.View;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.component.ui.layout.OnMeasureData;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ui/lkuiplus/WidthLimitLKUIPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "mMaxWidth", "", "onDelegateMeasureStart", "", "onMeasureData", "Lcom/larksuite/component/ui/layout/OnMeasureData;", "setMaxWidth", "maxWidth", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class WidthLimitLKUIPlus extends BaseLKUIPlus {
    private int mMaxWidth = UIHelper.dp2px((float) 1300);

    public final void setMaxWidth(int i) {
        if (i > 0) {
            this.mMaxWidth = i;
            getLayout().requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WidthLimitLKUIPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateMeasureStart(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        int mode = View.MeasureSpec.getMode(cVar.mo89736a());
        int size = View.MeasureSpec.getSize(cVar.mo89736a());
        int i = this.mMaxWidth;
        if (size > i) {
            cVar.mo89737a(View.MeasureSpec.makeMeasureSpec(i, mode));
        }
        super.onDelegateMeasureStart(cVar);
    }
}
