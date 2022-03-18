package com.ss.android.lark.setting.page.content.common.dto;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.utils.C57849k;

/* renamed from: com.ss.android.lark.setting.page.content.common.dto.a */
public class C54164a {
    /* renamed from: a */
    public static void m210285a(final IGetDataCallback<Boolean> iGetDataCallback) {
        C54115c.m210080a().mo178274a().mo178331b(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.page.content.common.dto.C54164a.C541651 */

            /* renamed from: a */
            private void m210286a(final boolean z) {
                C54115c.m210080a().mo178282b().mo178372a(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.setting.page.content.common.dto.C54164a.C541651.C541661 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        m210288a(true);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        m210288a(false);
                    }

                    /* renamed from: a */
                    private void m210288a(boolean z) {
                        boolean z2;
                        Context C = C54115c.m210080a().mo178267C();
                        boolean a = C57849k.m224523a(C);
                        C57849k.m224522a(C, C54115c.m210080a().mo178270F());
                        if (iGetDataCallback != null) {
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (z || a || z) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            iGetDataCallback.onSuccess(Boolean.valueOf(z2));
                        }
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165397w("ClearCacheUnit", "clearDocCache:" + errorResult);
                m210286a(false);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("ClearCacheUnit", "clearDocCache:" + bool);
                m210286a(bool.booleanValue());
            }
        });
    }
}
