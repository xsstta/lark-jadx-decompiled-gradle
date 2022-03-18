package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.more.p502c.AbstractC10204a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ap */
class ap implements AbstractC10204a {
    ap() {
    }

    @Override // com.bytedance.ee.bear.more.p502c.AbstractC10204a
    /* renamed from: a */
    public boolean mo38998a(String str) {
        Log.m165389i("ShortcutAgentImpl", "isFeedCardShortcut()... feedId = " + str);
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).isShortcut(str);
    }

    /* renamed from: a */
    private void m154995a(boolean z, int i, String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (z) {
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).putShortcuts(new Shortcut(Channel.Type.DOC, str), new IGetDataCallback<Shortcut>() {
                /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.ap.C392922 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(Shortcut shortcut) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(true);
                    }
                }
            }, 1);
            return;
        }
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).deleteShortcuts(new Shortcut(Channel.Type.DOC, str), new IGetDataCallback<Shortcut>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.ap.C392933 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Shortcut shortcut) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        }, 1);
    }

    @Override // com.bytedance.ee.bear.more.p502c.AbstractC10204a
    /* renamed from: a */
    public void mo38997a(boolean z, int i, String str, final ak.AbstractC5106b bVar) {
        Log.m165389i("ShortcutAgentImpl", "markFeedCardShortcut()...isAdd = " + z + ",channelType = " + i + " , feedId = " + str);
        m154995a(z, i, str, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.ap.C392911 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ak.AbstractC5106b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess("");
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ak.AbstractC5106b bVar = bVar;
                if (bVar != null) {
                    bVar.onFail(errorResult.getErrorCode(), errorResult.getDisplayMsg());
                }
            }
        });
    }
}
