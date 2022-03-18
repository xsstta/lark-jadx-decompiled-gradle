package com.ss.android.lark.phone.impl.phonequerylimit.mvp;

import android.app.Activity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.phone.C51341b;
import com.ss.android.lark.phone.impl.C51348a;
import com.ss.android.lark.phone.impl.common.C51355a;
import com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a;
import com.ss.android.lark.phone.impl.phonequerylimit.p2461a.C51385a;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryControlInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.c */
public class C51407c extends BasePresenter<AbstractC51400a.AbstractC51401a, AbstractC51400a.AbstractC51402b, AbstractC51400a.AbstractC51402b.AbstractC51403a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC51400a.AbstractC51402b.AbstractC51403a createViewDelegate() {
        return new C51409a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m199315b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.c$a */
    public class C51409a implements AbstractC51400a.AbstractC51402b.AbstractC51403a {
        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b.AbstractC51403a
        /* renamed from: a */
        public void mo177030a() {
            String d = ((AbstractC51400a.AbstractC51401a) C51407c.this.getModel()).mo177029d();
            if (d != null) {
                C51341b.m199137a().mo143999a(C51341b.m199137a().mo144003c(), d);
            }
        }

        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b.AbstractC51403a
        /* renamed from: b */
        public void mo177032b() {
            ((AbstractC51400a.AbstractC51401a) C51407c.this.getModel()).mo177025a(new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.C51407c.C51409a.C514112 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    ((AbstractC51400a.AbstractC51402b) C51407c.this.getView()).mo177013a(str);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC51400a.AbstractC51402b) C51407c.this.getView()).mo177010a(R.string.Lark_Legacy_ApplicationPhoneCallTimeCardErrorToast);
                }
            }));
        }

        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b.AbstractC51403a
        /* renamed from: c */
        public void mo177034c() {
            ((AbstractC51400a.AbstractC51401a) C51407c.this.getModel()).mo177027b(new UIGetDataCallback(new IGetDataCallback<Message>() {
                /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.C51407c.C51409a.C514123 */

                /* renamed from: a */
                public void onSuccess(Message message) {
                    ((AbstractC51400a.AbstractC51402b) C51407c.this.getView()).mo177014a(message.getChatId(), message.getPosition());
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("PhoneQueryPresenter", "sendPhoneQueryQuotaApply failed: " + errorResult.getDebugMsg());
                    ((AbstractC51400a.AbstractC51402b) C51407c.this.getView()).mo177010a(R.string.Lark_Legacy_ApplicationPhoneCallTimeCardErrorToast);
                }
            }));
        }

        private C51409a() {
        }

        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b.AbstractC51403a
        /* renamed from: a */
        public void mo177031a(Activity activity) {
            C51341b.m199137a().mo143998a(activity, ((AbstractC51400a.AbstractC51401a) C51407c.this.getModel()).mo177026b());
        }

        @Override // com.ss.android.lark.phone.impl.phonequerylimit.mvp.AbstractC51400a.AbstractC51402b.AbstractC51403a
        /* renamed from: b */
        public void mo177033b(final Activity activity) {
            String c = ((AbstractC51400a.AbstractC51401a) C51407c.this.getModel()).mo177028c();
            if (c == null) {
                Log.m165383e("PhoneQueryPresenter", "phone number is null");
                ((AbstractC51400a.AbstractC51402b) C51407c.this.getView()).mo177010a(R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed);
                return;
            }
            C51348a.m199179a(activity, c, (C51348a.AbstractC51354b) new C51348a.AbstractC51354b() {
                /* class com.ss.android.lark.phone.impl.phonequerylimit.mvp.C51407c.C51409a.C514101 */

                @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
                /* renamed from: a */
                public void mo176941a() {
                }

                @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
                /* renamed from: a */
                public void mo176942a(List<C51348a.C51352a> list, String str) {
                    C51355a.m199196a(activity, list, str);
                }
            });
        }
    }

    /* renamed from: b */
    private void m199315b() {
        PhoneQueryControlInfo a = ((AbstractC51400a.AbstractC51401a) getModel()).mo177024a();
        if (a == null) {
            Log.m165383e("PhoneQueryPresenter", "failed to showPhoneControlInfo, because PhoneQueryControlInfo is null.");
        } else {
            ((AbstractC51400a.AbstractC51402b) getView()).mo177011a(m199314a(a));
        }
    }

    /* renamed from: a */
    private C51385a m199314a(PhoneQueryControlInfo phoneQueryControlInfo) {
        C51385a aVar = new C51385a();
        aVar.mo177007a(phoneQueryControlInfo.getAnnouncement());
        aVar.mo177006a(phoneQueryControlInfo.getControlStatus());
        return aVar;
    }

    public C51407c(AbstractC51400a.AbstractC51401a aVar, AbstractC51400a.AbstractC51402b bVar) {
        super(aVar, bVar);
    }
}
