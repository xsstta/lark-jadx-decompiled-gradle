package com.ss.android.lark.locationmessage.ui.navigation;

import android.content.Context;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.location.dto.C41580b;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.ui.navigation.AbstractC41632a;
import com.ss.android.lark.locationmessage.ui.navigation.NavigateView;

/* renamed from: com.ss.android.lark.locationmessage.ui.navigation.e */
public class C41640e extends BaseModel implements AbstractC41632a.AbstractC41633a {

    /* renamed from: b */
    private static final C41580b f105772b;

    /* renamed from: c */
    private static final C41580b f105773c;

    /* renamed from: a */
    public C41580b f105774a = f105773c;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    static {
        C41580b bVar = new C41580b(39.908823d, 116.39747d);
        f105772b = bVar;
        f105773c = bVar;
    }

    @Override // com.ss.android.lark.locationmessage.ui.navigation.AbstractC41632a.AbstractC41633a
    /* renamed from: a */
    public void mo149763a(Context context, final NavigateView.AbstractC41630a aVar) {
        C41597c.m165069a().mo143916i().mo143928a(context, new C41597c.AbstractC41601a() {
            /* class com.ss.android.lark.locationmessage.ui.navigation.C41640e.C416411 */

            @Override // com.ss.android.lark.locationmessage.C41597c.AbstractC41601a
            /* renamed from: a */
            public void mo149722a(LarkLocation larkLocation) {
                if (larkLocation != null) {
                    C41640e.this.f105774a = new C41580b(larkLocation.getLatitude(), larkLocation.getLongitude());
                    aVar.mo149754a(C41640e.this.f105774a.mo149687a(), C41640e.this.f105774a.mo149688b());
                    return;
                }
                aVar.mo149753a();
            }
        });
    }
}
