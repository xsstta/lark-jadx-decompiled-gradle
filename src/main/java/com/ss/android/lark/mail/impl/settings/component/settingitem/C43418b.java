package com.ss.android.lark.mail.impl.settings.component.settingitem;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.b */
public class C43418b implements ISettingItemModel {

    /* renamed from: a */
    protected final String f110330a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel
    public C43350d aP_() {
        return C43350d.m172099a(this.f110330a);
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel
    /* renamed from: c */
    public C42093e mo155225c() {
        return C43277a.m171921a().mo154926a(this.f110330a);
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel
    /* renamed from: d */
    public C42094f mo155226d() {
        return C43350d.m172099a(this.f110330a).mo155041f();
    }

    public C43418b(String str) {
        this.f110330a = str;
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel
    /* renamed from: a */
    public LiveData<Boolean> mo155222a(ISettingItemModel.Function function) {
        return C43350d.m172099a(this.f110330a).mo155024a(function.getSettingType());
    }

    @Override // com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel
    /* renamed from: a */
    public void mo155223a(Setting setting, ISettingItemModel.Function function) {
        mo155228a(setting, function, null);
    }

    /* renamed from: a */
    public void mo155228a(Setting setting, ISettingItemModel.Function function, final IGetDataCallback<MailUpdateAccountResponse> iGetDataCallback) {
        C43350d.m172099a(this.f110330a).mo155026a(setting, function.getSettingType(), new AbstractC41870b<MailUpdateAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b.C434191 */

            /* renamed from: a */
            public void mo150435a(MailUpdateAccountResponse mailUpdateAccountResponse) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(mailUpdateAccountResponse);
                }
            }

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }
}
