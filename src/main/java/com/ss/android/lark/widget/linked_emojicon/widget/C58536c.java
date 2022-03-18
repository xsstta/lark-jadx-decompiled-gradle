package com.ss.android.lark.widget.linked_emojicon.widget;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.widget.span.C59176n;
import com.ss.android.lark.widget.span.PhoneInfo;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.lark.widget.span.SpanInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.c */
public class C58536c {

    /* renamed from: a */
    private static volatile C58536c f144499a;

    /* renamed from: b */
    private void m227061b() {
    }

    private C58536c() {
        m227061b();
    }

    /* renamed from: a */
    public static C58536c m227060a() {
        if (f144499a == null) {
            synchronized (C58536c.class) {
                if (f144499a == null) {
                    f144499a = new C58536c();
                }
            }
        }
        return f144499a;
    }

    /* renamed from: a */
    public void mo198442a(IGetDataCallback<RecogniseSpansResult> iGetDataCallback, String str, boolean z) {
        mo198443a(iGetDataCallback, str, z, null);
    }

    /* renamed from: a */
    public void mo198444a(final String str, final List<SpanInfo> list, final IGetDataCallback<List<PhoneInfo>> iGetDataCallback) {
        if (!TextUtils.isEmpty(str)) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.widget.linked_emojicon.widget.C58536c.RunnableC585392 */

                public void run() {
                    final List<PhoneInfo> b = C59176n.m229853a().mo201131b(str, list);
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.widget.linked_emojicon.widget.C58536c.RunnableC585392.RunnableC585401 */

                        public void run() {
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(b);
                            }
                        }
                    });
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("text is empty"));
        }
    }

    /* renamed from: a */
    public void mo198443a(final IGetDataCallback<RecogniseSpansResult> iGetDataCallback, final String str, final boolean z, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.widget.linked_emojicon.widget.C58536c.RunnableC585371 */

                public void run() {
                    final RecogniseSpansResult a = C59176n.m229853a().mo201127a(str, z, str2);
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.widget.linked_emojicon.widget.C58536c.RunnableC585371.RunnableC585381 */

                        public void run() {
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(a);
                            }
                        }
                    });
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("text is empty"));
        }
    }
}
