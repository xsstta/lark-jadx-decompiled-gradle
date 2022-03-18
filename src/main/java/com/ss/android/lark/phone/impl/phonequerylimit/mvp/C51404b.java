package com.ss.android.lark.phone.impl.phonequerylimit.mvp;

import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.phone.C51341b;
import com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a;
import com.ss.android.lark.phone.impl.service.C51413a;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryControlInfo;

/* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.b */
public class C51404b extends BaseModel implements AbstractC51400a.AbstractC51401a {

    /* renamed from: a */
    private PhoneQueryControlInfo f127936a;

    /* renamed from: b */
    private String f127937b;

    /* renamed from: c */
    private C51413a f127938c = C51413a.m199326a();

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51401a
    /* renamed from: a */
    public PhoneQueryControlInfo mo177024a() {
        return this.f127936a;
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51401a
    /* renamed from: b */
    public String mo177026b() {
        return this.f127937b;
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51401a
    /* renamed from: d */
    public String mo177029d() {
        return C51341b.m199137a().mo144002b();
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51401a
    /* renamed from: c */
    public String mo177028c() {
        PhoneQueryControlInfo phoneQueryControlInfo = this.f127936a;
        if (phoneQueryControlInfo == null) {
            Log.m165383e("PhoneQueryLimitModel", "failed to getPhoneNumber, because mPhoneQueryControlInfo is null.");
            return null;
        }
        String phoneNum = phoneQueryControlInfo.getPhoneNum();
        if (TextUtils.isEmpty(phoneNum)) {
            return null;
        }
        return phoneNum;
    }

    public C51404b(Bundle bundle) {
        this.f127937b = bundle.getString("user_id");
        this.f127936a = (PhoneQueryControlInfo) bundle.getSerializable("control_info");
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51401a
    /* renamed from: b */
    public void mo177027b(final IGetDataCallback<Message> iGetDataCallback) {
        this.f127938c.mo177044a(this.f127936a, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Message>() {
            /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.C51404b.C514062 */

            /* renamed from: a */
            public void onSuccess(Message message) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(message);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("PhoneQueryLimitModel", "sendPhoneQueryQuotaApply failed: " + errorResult.getDebugMsg());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51401a
    /* renamed from: a */
    public void mo177025a(final IGetDataCallback<String> iGetDataCallback) {
        PhoneQueryControlInfo phoneQueryControlInfo = this.f127936a;
        if (phoneQueryControlInfo == null) {
            Log.m165383e("PhoneQueryLimitModel", "failed to getLeaderName, because mPhoneQueryControlInfo is null.");
            return;
        }
        String leaderId = phoneQueryControlInfo.getLeaderId();
        if (!TextUtils.isEmpty(leaderId)) {
            C51341b.m199137a().mo144004d().mo144010a(leaderId, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.C51404b.C514051 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(str);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("PhoneQueryLimitModel", "getUserDisplayNameByAliasName failed, " + errorResult.getDebugMsg());
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("leader id is empty"));
        }
    }
}
