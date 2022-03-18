package com.ss.android.lark.exception.crash.p1828a;

import android.content.Context;
import android.widget.Toast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.exception.crash.C37008a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.exception.crash.a.a */
public class C37012a implements C37008a.AbstractC37010a {

    /* renamed from: a */
    public Context f95120a;

    public C37012a(Context context) {
        this.f95120a = context;
    }

    @Override // com.ss.android.lark.exception.crash.C37008a.AbstractC37010a
    /* renamed from: a */
    public boolean mo136537a(Thread thread, Throwable th) {
        Log.m165383e("Crash-DefaultHandler", "exception = " + th.getMessage() + "\nthreadName = " + thread.getName() + "\n");
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.exception.crash.p1828a.C37012a.RunnableC370131 */

            public void run() {
                try {
                    Toast.makeText(C37012a.this.f95120a, C37012a.this.f95120a.getString(R.string.Lark_Legacy_FatalExceptionTip), 0).show();
                } catch (Exception e) {
                    Log.m165382e(e.toString());
                }
            }
        });
        return true;
    }
}
