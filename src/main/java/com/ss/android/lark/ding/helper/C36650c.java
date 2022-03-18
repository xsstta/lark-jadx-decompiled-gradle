package com.ss.android.lark.ding.helper;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import com.ss.android.lark.ding.helper.AbstractC36654g;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.ding.helper.c */
public class C36650c extends AbstractC36639a {
    /* renamed from: d */
    public int mo135228d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.ding.helper.AbstractC36639a
    /* renamed from: a */
    public WindowManager.LayoutParams mo135194a(WindowManager.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else if (Build.VERSION.SDK_INT < 19 || Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2003;
        } else {
            layoutParams.type = 2005;
        }
        Log.m165389i("FloatDialogOverlayWindowPlan", "getParamType > " + layoutParams.type);
        return layoutParams;
    }

    public C36650c(Context context, AbstractC36654g.AbstractC36655a aVar) {
        super(context, aVar);
    }
}
