package com.ss.android.lark.locationmessage.ui.navigation;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.locationmessage.ui.navigation.AbstractC41632a;
import com.ss.android.lark.locationmessage.ui.navigation.NavigateView;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.lark.locationmessage.ui.navigation.f */
public class C41642f extends BasePresenter<AbstractC41632a.AbstractC41633a, AbstractC41632a.AbstractC41634b, AbstractC41632a.AbstractC41634b.AbstractC41635a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC41632a.AbstractC41634b.AbstractC41635a createViewDelegate() {
        return new C41644a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.locationmessage.ui.navigation.f$a */
    public class C41644a implements AbstractC41632a.AbstractC41634b.AbstractC41635a {
        private C41644a() {
        }

        @Override // com.ss.android.lark.locationmessage.ui.navigation.AbstractC41632a.AbstractC41634b.AbstractC41635a
        /* renamed from: a */
        public void mo149764a(final Context context, final NavigateView.AbstractC41630a aVar) {
            C51331a aVar2 = new C51331a((Activity) context);
            if (!aVar2.mo176921a("android.permission.ACCESS_FINE_LOCATION")) {
                aVar2.mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer<Boolean>() {
                    /* class com.ss.android.lark.locationmessage.ui.navigation.C41642f.C41644a.C416451 */

                    /* renamed from: a */
                    public void accept(Boolean bool) throws Exception {
                        if (bool.booleanValue()) {
                            ((AbstractC41632a.AbstractC41633a) C41642f.this.getModel()).mo149763a(context, aVar);
                        }
                    }
                });
            } else {
                ((AbstractC41632a.AbstractC41633a) C41642f.this.getModel()).mo149763a(context, aVar);
            }
        }
    }

    public C41642f(AbstractC41632a.AbstractC41634b bVar, NavigateView.AbstractC41631b bVar2) {
        super(new C41640e(), bVar);
    }
}
