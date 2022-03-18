package com.ss.android.lark.leanmode.ui.close;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.leanmode.C41267h;
import com.ss.android.lark.leanmode.p2120b.AbstractC41243a;
import com.ss.android.lark.leanmode.p2121c.C41255c;
import com.ss.android.lark.leanmode.ui.close.C41289c;
import com.ss.android.lark.leanmode.ui.close.C41292d;
import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.leanmode.ui.close.c */
public class C41289c extends BasePresenter<C41292d.AbstractC41293a, C41292d.AbstractC41294b, C41292d.AbstractC41294b.AbstractC41295a> {

    /* renamed from: a */
    public String f105080a;

    /* renamed from: b */
    public String f105081b;

    /* renamed from: c */
    private Bundle f105082c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C41292d.AbstractC41294b.AbstractC41295a createViewDelegate() {
        return new C41291a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.leanmode.ui.close.c$a */
    public class C41291a implements C41292d.AbstractC41294b.AbstractC41295a {
        @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b.AbstractC41295a
        /* renamed from: a */
        public void mo148719a() {
            ((C41292d.AbstractC41294b) C41289c.this.getView()).mo148713a(C41267h.m163598a().mo143878d());
        }

        @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b.AbstractC41295a
        /* renamed from: b */
        public void mo148722b() {
            ((C41292d.AbstractC41294b) C41289c.this.getView()).mo148714a(C41267h.m163598a().mo143879e(), C41267h.m163598a().mo143880f());
        }

        private C41291a() {
        }

        @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b.AbstractC41295a
        /* renamed from: a */
        public void mo148721a(boolean z) {
            C41255c.m163565a().mo148612a(C41289c.this.f105081b, z);
        }

        @Override // com.ss.android.lark.leanmode.ui.close.C41292d.AbstractC41294b.AbstractC41295a
        /* renamed from: a */
        public void mo148720a(Context context) {
            C41267h.m163598a().mo143869a(context, C41289c.this.f105080a, C41289c.this.f105081b, new AbstractC41243a.AbstractC41246b() {
                /* class com.ss.android.lark.leanmode.ui.close.$$Lambda$c$a$TwmE1L2Vi5AkIv8UZ3s_Bv8BRA */

                @Override // com.ss.android.lark.leanmode.p2120b.AbstractC41243a.AbstractC41246b
                public final void onResult(String str) {
                    C41289c.C41291a.this.m163708a((C41289c.C41291a) str);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m163708a(String str) {
            try {
                if (new JSONObject(str).optInt("errorCode", -1) == 0) {
                    ((C41292d.AbstractC41294b) C41289c.this.getView()).mo148715a(true);
                    ((C41292d.AbstractC41294b) C41289c.this.getView()).mo148711a();
                    return;
                }
                ((C41292d.AbstractC41294b) C41289c.this.getView()).mo148715a(false);
            } catch (JSONException e) {
                Log.m165383e("CloseLeanModePresenter", "failed to startSecurityVerify, e:" + e);
                ((C41292d.AbstractC41294b) C41289c.this.getView()).mo148715a(false);
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        Bundle bundle = this.f105082c;
        if (bundle != null) {
            this.f105080a = bundle.getString("app_id");
            this.f105081b = this.f105082c.getString("app_callback_id");
        }
    }

    public C41289c(CloseLeanModeView closeLeanModeView, Bundle bundle) {
        super(new C41288b(), closeLeanModeView);
        this.f105082c = bundle;
        closeLeanModeView.setViewDelegate(createViewDelegate());
    }
}
