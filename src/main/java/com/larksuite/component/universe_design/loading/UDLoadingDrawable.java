package com.larksuite.component.universe_design.loading;

import android.content.Context;
import android.graphics.Paint;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/loading/UDLoadingDrawable;", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "universe-ui-loading_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.d.a */
public final class UDLoadingDrawable extends CircularProgressDrawable {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDLoadingDrawable(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo7698a(1);
        mo7701a(UDColorUtils.getColor(context, R.color.static_white));
        mo7699a(Paint.Cap.ROUND);
    }
}
