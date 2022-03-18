package com.tt.miniapp.p3301m;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapp.chooser.PickerActivity;
import com.tt.miniapp.chooser.p3267a.C65820b;
import com.tt.miniapp.component.nativeview.p3273e.C65884a;
import com.tt.miniapphost.entity.C67524d;
import com.tt.miniapphost.entity.C67526f;
import com.tt.miniapphost.entity.C67537k;
import com.tt.option.p3389j.AbstractC67643b;
import com.tt.option.p3389j.AbstractC67645c;

/* renamed from: com.tt.miniapp.m.c */
public class C66331c implements AbstractC67643b {
    @Override // com.tt.option.p3389j.AbstractC67643b
    public boolean scanCode(Activity activity, AbstractC67643b.AbstractC67644a aVar) {
        return false;
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public AbstractC67645c createChooseFileHandler(Activity activity) {
        return new C65884a(activity);
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67524d handleActivityImageResult(int i, int i2, Intent intent) {
        return new C67524d();
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67537k handleActivityScanResult(int i, int i2, Intent intent) {
        return new C67537k();
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67526f handleActivityVideoResult(int i, int i2, Intent intent) {
        return new C67526f();
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseImage(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (!z2 || z) {
            Intent intent = new Intent(currentActivity, PickerActivity.class);
            intent.putExtra("select_mode", 100);
            intent.putExtra("max_select_count", i);
            if (z2 || !z) {
                intent.putExtra("camerType", 1);
            }
            AbstractC12888c i2 = C25529d.m91168i(iAppContext);
            if (i2 != null) {
                i2.startActivityForResult(intent, 7);
            } else {
                currentActivity.startActivityForResult(intent, 7);
            }
        } else {
            C65820b.m257983a(currentActivity, 10);
        }
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseImageForFeedback(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (!z2 || z) {
            Intent intent = new Intent(currentActivity, PickerActivity.class);
            intent.putExtra("select_mode", 100);
            intent.putExtra("max_select_count", i);
            if (z2 || !z) {
                intent.putExtra("camerType", 1);
            }
            AbstractC12888c i2 = C25529d.m91168i(iAppContext);
            if (i2 != null) {
                i2.startActivityForResult(intent, 7);
            } else {
                currentActivity.startActivityForResult(intent, 7);
            }
        } else {
            C65820b.m257983a(currentActivity, 10);
        }
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseVideo(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        if (!z2 || z) {
            Activity currentActivity = iAppContext.getCurrentActivity();
            Intent intent = new Intent(currentActivity, PickerActivity.class);
            intent.putExtra("select_mode", 102);
            intent.putExtra("max_select_count", 1);
            if (z2 || !z) {
                intent.putExtra("camerType", 2);
            }
            AbstractC12888c i2 = C25529d.m91168i(iAppContext);
            if (i2 != null) {
                i2.startActivityForResult(intent, 4);
            } else {
                currentActivity.startActivityForResult(intent, 4);
            }
        } else {
            C65820b.m257984a(iAppContext, 9);
        }
    }
}
