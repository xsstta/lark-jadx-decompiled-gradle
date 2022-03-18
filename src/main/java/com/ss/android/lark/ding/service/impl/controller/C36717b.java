package com.ss.android.lark.ding.service.impl.controller;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ding.service.impl.C36690c;
import com.ss.android.lark.ding.service.impl.C36758e;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.b */
public class C36717b extends DataLoader {

    /* renamed from: com.ss.android.lark.ding.service.impl.controller.b$a */
    public interface AbstractC36719a {
        /* renamed from: a */
        void mo135373a(ErrorResult errorResult);

        /* renamed from: a */
        void mo135374a(List<C36758e> list);
    }

    /* renamed from: a */
    public void mo135376a(final AbstractC36719a aVar) {
        if (mo135314b()) {
            C36690c.m144778a().mo135300b(new IGetDataCallback<List<C36758e>>() {
                /* class com.ss.android.lark.ding.service.impl.controller.C36717b.C367181 */

                /* renamed from: a */
                public void onSuccess(List<C36758e> list) {
                    AbstractC36719a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo135374a(list);
                    }
                    C36717b.this.mo135316d();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Exception exc;
                    String str = "DingDataLoader onError: " + errorResult;
                    if (errorResult == null) {
                        exc = null;
                    } else {
                        exc = errorResult.getException();
                    }
                    Log.m165398w("DingDataLoader", str, exc);
                    AbstractC36719a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo135373a(errorResult);
                    }
                    C36717b.this.mo135315c();
                }
            });
        }
    }
}
