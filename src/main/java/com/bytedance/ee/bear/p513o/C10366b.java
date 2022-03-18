package com.bytedance.ee.bear.p513o;

import android.content.Context;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.o.b */
public class C10366b implements AbstractC10365a {

    /* renamed from: a */
    static int f27892a = 10009;

    /* renamed from: b */
    static int f27893b = 10013;

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: a */
    public int mo39495a() {
        return R.string.Doc_Review_Fail_Notify_Member;
    }

    C10366b() {
    }

    /* renamed from: b */
    private static boolean m43090b(int i) {
        if (i == f27892a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m43091c(int i) {
        if (i == f27893b) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: a */
    public boolean mo39496a(int i) {
        if (i == f27892a || i == f27893b) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: a */
    public boolean mo39497a(Context context) {
        if (context == null) {
            return false;
        }
        Toast.showFailureText(context, context.getText(mo39495a()), 0);
        return true;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: a */
    public boolean mo39501a(Throwable th) {
        if (!(th instanceof NetService.ServerErrorException)) {
            return false;
        }
        int code = ((NetService.ServerErrorException) th).getCode();
        if (m43090b(code) || m43091c(code)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: a */
    public boolean mo39499a(Context context, Runnable runnable) {
        if (context == null) {
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        Toast.showFailureText(context, context.getText(R.string.Doc_Review_Fail_Rename), 0);
        return true;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: b */
    public boolean mo39502b(Context context, Throwable th, Runnable runnable) {
        if (context == null || !mo39501a(th)) {
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        Toast.showFailureText(context, context.getText(R.string.Drive_Drive_OpeationFailByPolicy), 0);
        return true;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: c */
    public boolean mo39503c(Context context, Throwable th, Runnable runnable) {
        if (context == null || !mo39501a(th)) {
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        Toast.showFailureText(context, context.getText(R.string.Doc_Review_Fail_Notify_Member), 0);
        return true;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: a */
    public boolean mo39498a(Context context, int i, Runnable runnable) {
        int i2;
        if (context == null) {
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        if (m43090b(i)) {
            i2 = R.string.Doc_Review_Fail_Share;
        } else {
            i2 = R.string.Doc_Review_Fail_By_Service;
        }
        Toast.showFailureText(context, context.getText(i2), 0);
        return true;
    }

    @Override // com.bytedance.ee.bear.p513o.AbstractC10365a
    /* renamed from: a */
    public boolean mo39500a(Context context, Throwable th, Runnable runnable) {
        if (context == null || !mo39501a(th)) {
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        Toast.showFailureText(context, context.getText(R.string.Doc_Review_Fail_Rename), 0);
        return true;
    }
}
