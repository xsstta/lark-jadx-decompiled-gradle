package com.bytedance.ee.bear.drive.biz.upload.error;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.error.e */
public class C6763e {

    /* renamed from: a */
    private static long f18404a;

    /* renamed from: b */
    private static int f18405b;

    /* renamed from: c */
    private Context f18406c;

    /* renamed from: d */
    private C10917c f18407d = new C10917c(new C10929e());

    /* renamed from: b */
    public boolean mo26599b(int i) {
        return i == 12009;
    }

    /* renamed from: a */
    private boolean m26678a() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f18404a >= 1000) {
            z = false;
        } else {
            z = true;
        }
        f18404a = currentTimeMillis;
        return z;
    }

    /* renamed from: d */
    private CharSequence m26679d(int i) {
        return this.f18406c.getText(R.string.Drive_Drive_UploadFailByPolicy);
    }

    /* renamed from: c */
    public void mo26600c(int i) {
        Toast.showText(this.f18406c, m26679d(i), 0);
    }

    /* renamed from: a */
    public void mo26597a(Context context) {
        this.f18406c = context;
        ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35626a("all_files_token", "", new UploadErrorManager$1(this, context));
    }

    /* renamed from: a */
    public boolean mo26598a(int i) {
        if (!C4511g.m18594d().mo17345F()) {
            return false;
        }
        if ((m26678a() && i == f18405b) || (i != 90003042 && i != 13001)) {
            return false;
        }
        f18405b = i;
        return true;
    }
}
