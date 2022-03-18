package com.ss.android.lark.oncall.ui;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.oncall.OnCallModule;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.entity.OnCallTag;
import com.ss.android.lark.oncall.hitpoint.OnCallHitPoint;
import com.ss.android.lark.oncall.ui.AbstractC48732a;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.oncall.ui.e */
public class C48752e extends BasePresenter<AbstractC48732a.AbstractC48733a, AbstractC48732a.AbstractC48735b, AbstractC48732a.AbstractC48735b.AbstractC48736a> {

    /* renamed from: a */
    private C48755b f122522a;

    /* renamed from: b */
    private C48754a f122523b;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC48732a.AbstractC48735b.AbstractC48736a createViewDelegate() {
        C48755b bVar = new C48755b();
        this.f122522a = bVar;
        return bVar;
    }

    /* renamed from: com.ss.android.lark.oncall.ui.e$b */
    public class C48755b implements AbstractC48732a.AbstractC48735b.AbstractC48736a {
        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b.AbstractC48736a
        /* renamed from: b */
        public void mo170008b() {
            ((AbstractC48732a.AbstractC48733a) C48752e.this.getModel()).mo170001b();
        }

        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b.AbstractC48736a
        /* renamed from: c */
        public void mo170010c() {
            ((AbstractC48732a.AbstractC48733a) C48752e.this.getModel()).mo169996a();
        }

        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b.AbstractC48736a
        /* renamed from: a */
        public boolean mo170007a() {
            if (((AbstractC48732a.AbstractC48733a) C48752e.this.getModel()) == null) {
                return false;
            }
            return ((AbstractC48732a.AbstractC48733a) C48752e.this.getModel()).mo170003c();
        }

        public C48755b() {
        }

        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b.AbstractC48736a
        /* renamed from: b */
        public void mo170009b(String str) {
            ((AbstractC48732a.AbstractC48733a) C48752e.this.getModel()).mo170002b(str);
        }

        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b.AbstractC48736a
        /* renamed from: c */
        public void mo170011c(String str) {
            ((AbstractC48732a.AbstractC48733a) C48752e.this.getModel()).mo169999a(str);
        }

        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b.AbstractC48736a
        /* renamed from: a */
        public void mo170006a(String str) {
            AbstractC48732a.AbstractC48733a aVar = (AbstractC48732a.AbstractC48733a) C48752e.this.getModel();
            if (aVar != null) {
                aVar.mo170000a(OnCallModule.f122434b.mo169922a().mo143993a(), str, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.oncall.ui.C48752e.C48755b.C487561 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            ((AbstractC48732a.AbstractC48735b) C48752e.this.getView()).mo169981a(str);
                            return;
                        }
                        ((AbstractC48732a.AbstractC48735b) C48752e.this.getView()).mo169985b(UIHelper.getString(R.string.Lark_HelpDesk_HelpDesksfail));
                        Log.m165383e("OnCallPresenter", "get chatId failed");
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC48732a.AbstractC48735b) C48752e.this.getView()).mo169985b(UIHelper.getString(R.string.Lark_HelpDesk_HelpDesksfail));
                        Log.m165383e("OnCallPresenter", " ErrorMsg：" + errorResult.toString());
                    }
                });
                OnCallHitPoint.m191931a(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC48732a.AbstractC48733a.AbstractC48734a mo170037b() {
        C48754a aVar = new C48754a();
        this.f122523b = aVar;
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.oncall.ui.e$a */
    public class C48754a implements AbstractC48732a.AbstractC48733a.AbstractC48734a {
        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a.AbstractC48734a
        /* renamed from: a */
        public void mo170004a() {
            ((AbstractC48732a.AbstractC48735b) C48752e.this.getView()).mo169985b(UIHelper.getString(R.string.Lark_Legacy_NetError));
        }

        private C48754a() {
        }

        @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48733a.AbstractC48734a
        /* renamed from: a */
        public void mo170005a(List<OnCall> list, int i, boolean z) {
            ((AbstractC48732a.AbstractC48735b) C48752e.this.getView()).mo169983a(list, i, z);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC48732a.AbstractC48733a) getModel()).mo169996a();
        ((AbstractC48732a.AbstractC48733a) getModel()).mo169997a(new IGetDataCallback<List<OnCallTag>>() {
            /* class com.ss.android.lark.oncall.ui.C48752e.C487531 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<OnCallTag> list) {
                ((AbstractC48732a.AbstractC48735b) C48752e.this.getView()).mo169982a(list);
            }
        });
    }

    public C48752e(AbstractC48732a.AbstractC48733a aVar, AbstractC48732a.AbstractC48735b bVar) {
        super(aVar, bVar);
        aVar.mo169998a(mo170037b());
    }
}
