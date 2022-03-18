package com.ss.android.lark.phone.impl.phoneamountedit.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a;
import com.ss.android.lark.phone.impl.service.C51413a;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryDailyAmountInfo;

/* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.b */
public class C51376b extends BaseModel implements AbstractC51372a.AbstractC51373a {

    /* renamed from: a */
    public int f127900a;

    /* renamed from: b */
    private C51413a f127901b = C51413a.m199326a();

    /* renamed from: c */
    private String f127902c;

    @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51373a
    /* renamed from: a */
    public int mo176985a() {
        return this.f127900a;
    }

    public C51376b(String str) {
        this.f127902c = str;
    }

    @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51373a
    /* renamed from: a */
    public void mo176986a(final IGetDataCallback<PhoneQueryDailyAmountInfo> iGetDataCallback) {
        this.f127901b.mo177047b(this.f127902c, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<PhoneQueryDailyAmountInfo>() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.C51376b.C513771 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(PhoneQueryDailyAmountInfo phoneQueryDailyAmountInfo) {
                C51376b.this.f127900a = phoneQueryDailyAmountInfo.getMaxLimit();
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(phoneQueryDailyAmountInfo);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51373a
    /* renamed from: a */
    public void mo176987a(String str, final IGetDataCallback<String> iGetDataCallback) {
        this.f127901b.mo177046a(this.f127902c, str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.C51376b.C513782 */

            /* renamed from: a */
            public void onSuccess(String str) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }
}
