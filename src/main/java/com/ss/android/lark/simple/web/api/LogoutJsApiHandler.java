package com.ss.android.lark.simple.web.api;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.simple.SimpleModule;
import com.ss.android.lark.simple.service.SimpleModeService;
import com.ss.android.lark.simple.switcher.SimpleModeSwitcher;
import com.ss.android.lark.utils.UIHelper;

public class LogoutJsApiHandler extends AbstractInjectJSApiHandler<LogoutConfig> implements Parcelable {
    public static final Parcelable.Creator<LogoutJsApiHandler> CREATOR = new Parcelable.Creator<LogoutJsApiHandler>() {
        /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.C548921 */

        /* renamed from: a */
        public LogoutJsApiHandler[] newArray(int i) {
            return new LogoutJsApiHandler[i];
        }

        /* renamed from: a */
        public LogoutJsApiHandler createFromParcel(Parcel parcel) {
            return new LogoutJsApiHandler(parcel);
        }
    };

    public static class LogoutConfig implements BaseJSModel {
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public LogoutJsApiHandler() {
    }

    protected LogoutJsApiHandler(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public void mo187193a(final AbstractC25832c cVar) {
        SimpleModeService.f135451c.mo187138a().mo187132a(mo91997u(), 0, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.C548954 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("PassportLogoutHandlerV2", "logout: reset to normal mode, continue logout");
                LogoutJsApiHandler logoutJsApiHandler = LogoutJsApiHandler.this;
                logoutJsApiHandler.mo187196b(logoutJsApiHandler.mo91997u(), cVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("PassportLogoutHandlerV2", "logout: reset to normal mode fail " + errorResult.getDisplayMsg());
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.C548954.RunnableC548961 */

                    public void run() {
                        LKUIToast.show(LogoutJsApiHandler.this.mo91997u(), (int) R.string.Lark_Settings_BasicModeExitLoginFailed);
                    }
                });
            }
        });
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(LogoutConfig logoutConfig, final AbstractC25832c cVar) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.RunnableC548932 */

            public void run() {
                LogoutJsApiHandler logoutJsApiHandler = LogoutJsApiHandler.this;
                logoutJsApiHandler.mo187192a(logoutJsApiHandler.mo91997u(), cVar);
            }
        });
    }

    /* renamed from: b */
    public void mo187196b(final Activity activity, final AbstractC25832c cVar) {
        SimpleModule.m212716c().mo187090a().mo187085a(mo91997u(), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.C548975 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.C548975.RunnableC548992 */

                    public void run() {
                        LKUIToast.show(LogoutJsApiHandler.this.mo91997u(), (int) R.string.Lark_Settings_BasicModeExitLoginFailed);
                    }
                });
                LogoutJsApiHandler.this.mo187194a(cVar, 441001, errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", (Object) 0);
                cVar.mo91902a(jSONObject.toJSONString());
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.C548975.RunnableC548981 */

                    public void run() {
                        SimpleModeSwitcher.m212751c(activity);
                    }
                }, 1000);
            }
        });
    }

    /* renamed from: a */
    public void mo187192a(Activity activity, final AbstractC25832c cVar) {
        new C25639g(activity).mo89237b(UIHelper.mustacheFormat((int) R.string.Lark_Settings_LogOutConfirmTitle)).mo89246d(true).mo89247e(true).mo89238b(true).mo89249h(17).mo89250i(R.color.lkui_N900).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Settings_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Settings_LogOutConfirmButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.simple.web.api.LogoutJsApiHandler.DialogInterface$OnClickListenerC548943 */

            public void onClick(DialogInterface dialogInterface, int i) {
                LogoutJsApiHandler.this.mo187193a(cVar);
            }
        }).mo89239c();
    }

    /* renamed from: a */
    public void mo187194a(AbstractC25832c cVar, int i, String str) {
        if (cVar == null) {
            Log.m165383e("PassportLogoutHandlerV2", "handleError, callback is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            jSONObject.put("errorMessage", (Object) str);
        } catch (Throwable th) {
            Log.m165383e("PassportLogoutHandlerV2", "handleError, error：" + th.getMessage());
        }
        cVar.mo91904b(jSONObject.toString());
    }
}
