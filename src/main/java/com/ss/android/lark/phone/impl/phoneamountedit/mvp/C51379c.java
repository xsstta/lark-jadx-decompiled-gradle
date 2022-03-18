package com.ss.android.lark.phone.impl.phoneamountedit.mvp;

import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryDailyAmountInfo;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.c */
public class C51379c extends BasePresenter<AbstractC51372a.AbstractC51373a, AbstractC51372a.AbstractC51374b, AbstractC51372a.AbstractC51374b.AbstractC51375a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC51372a.AbstractC51374b.AbstractC51375a createViewDelegate() {
        return new C51381a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m199244b();
    }

    /* renamed from: b */
    private void m199244b() {
        ((AbstractC51372a.AbstractC51373a) getModel()).mo176986a(new C25975i(new IGetDataCallback<PhoneQueryDailyAmountInfo>() {
            /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.C51379c.C513801 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(PhoneQueryDailyAmountInfo phoneQueryDailyAmountInfo) {
                ((AbstractC51372a.AbstractC51374b) C51379c.this.getView()).mo176976a(phoneQueryDailyAmountInfo.getDailyQuota(), phoneQueryDailyAmountInfo.getMaxLimit());
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.c$a */
    public class C51381a implements AbstractC51372a.AbstractC51374b.AbstractC51375a {
        private C51381a() {
        }

        @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51374b.AbstractC51375a
        /* renamed from: a */
        public void mo176988a(String str) {
            ((AbstractC51372a.AbstractC51373a) C51379c.this.getModel()).mo176987a(str, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.phone.impl.phoneamountedit.mvp.C51379c.C51381a.C513821 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC51372a.AbstractC51374b) C51379c.this.getView()).mo176978a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveFail)));
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    ((AbstractC51372a.AbstractC51374b) C51379c.this.getView()).mo176978a(UIHelper.getString(R.string.Lark_Legacy_SaveSuccess));
                    ((AbstractC51372a.AbstractC51374b) C51379c.this.getView()).mo176975a();
                }
            }));
        }

        @Override // com.ss.android.lark.phone.impl.phoneamountedit.mvp.AbstractC51372a.AbstractC51374b.AbstractC51375a
        /* renamed from: b */
        public void mo176989b(String str) {
            ((AbstractC51372a.AbstractC51374b) C51379c.this.getView()).mo176979a(str, String.valueOf(((AbstractC51372a.AbstractC51373a) C51379c.this.getModel()).mo176985a()));
        }
    }

    public C51379c(AbstractC51372a.AbstractC51373a aVar, AbstractC51372a.AbstractC51374b bVar) {
        super(aVar, bVar);
    }
}
