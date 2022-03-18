package com.tt.option.p3389j;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.entity.C67524d;
import com.tt.miniapphost.entity.C67526f;
import com.tt.miniapphost.entity.C67537k;

/* renamed from: com.tt.option.j.b */
public interface AbstractC67643b {

    /* renamed from: com.tt.option.j.b$a */
    public interface AbstractC67644a {
    }

    void chooseImage(IAppContext iAppContext, int i, boolean z, boolean z2, String str);

    void chooseImageForFeedback(IAppContext iAppContext, int i, boolean z, boolean z2, String str);

    void chooseVideo(IAppContext iAppContext, int i, boolean z, boolean z2, String str);

    AbstractC67645c createChooseFileHandler(Activity activity);

    C67524d handleActivityImageResult(int i, int i2, Intent intent);

    C67537k handleActivityScanResult(int i, int i2, Intent intent);

    C67526f handleActivityVideoResult(int i, int i2, Intent intent);

    boolean scanCode(Activity activity, AbstractC67644a aVar);
}
