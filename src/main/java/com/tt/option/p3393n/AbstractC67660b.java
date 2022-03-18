package com.tt.option.p3393n;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.entity.C67525e;

/* renamed from: com.tt.option.n.b */
public interface AbstractC67660b {
    boolean chooseLocationActivity(IAppContext iAppContext, String str, int i);

    C67525e handleChooseLocationResult(int i, int i2, Intent intent);

    boolean openLocation(Activity activity, String str, String str2, double d, double d2, int i, String str3, String str4);
}
