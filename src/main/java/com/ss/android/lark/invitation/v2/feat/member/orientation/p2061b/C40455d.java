package com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.d */
public class C40455d extends BasePresenter<AbstractC40449a.AbstractC40450a, AbstractC40449a.AbstractC40451b, AbstractC40449a.AbstractC40451b.AbstractC40452a> {

    /* renamed from: a */
    public String f102757a;

    /* renamed from: b */
    private String f102758b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC40449a.AbstractC40451b.AbstractC40452a createViewDelegate() {
        return new C40457a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.d$a */
    public class C40457a implements AbstractC40449a.AbstractC40451b.AbstractC40452a {
        private C40457a() {
        }

        @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40451b.AbstractC40452a
        /* renamed from: a */
        public void mo146466a(String str, String str2) {
            Log.m165389i("InvitationModule", str + ", " + str2);
            ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146460a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(str);
            arrayList2.add(str2);
            ((AbstractC40449a.AbstractC40450a) C40455d.this.getModel()).mo146459a(new InvitationServiceApi.C40083b(arrayList, arrayList2), C40455d.this.f102757a, new IGetDataCallback<InvitationServiceApi.C40084c>() {
                /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.C40455d.C40457a.C404581 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146463b();
                    Log.m165383e("InvitationModule", errorResult.toString());
                    String displayMsg = errorResult.getDisplayMsg();
                    if (!TextUtils.isEmpty(displayMsg)) {
                        ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146465c(displayMsg);
                    }
                }

                /* renamed from: a */
                public void onSuccess(InvitationServiceApi.C40084c cVar) {
                    ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146463b();
                    if (cVar.f101876a) {
                        ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146465c(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny));
                        return;
                    }
                    Map<String, InvitationServiceApi.C40082a> map = cVar.f101877b;
                    if (map.size() == 0) {
                        ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146462a(cVar.f101878c);
                        return;
                    }
                    Iterator<Map.Entry<String, InvitationServiceApi.C40082a>> it = map.entrySet().iterator();
                    if (it.hasNext()) {
                        InvitationServiceApi.C40082a value = it.next().getValue();
                        if (value.f101871a == InvitationServiceApi.InviteErrorType.FORMAT_MOBILE) {
                            ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146461a(value.f101872b);
                        } else if (value.f101871a == InvitationServiceApi.InviteErrorType.FORMAT_NAME) {
                            ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146464b(value.f101872b);
                        } else {
                            ((AbstractC40449a.AbstractC40451b) C40455d.this.getView()).mo146465c(value.f101872b);
                        }
                    }
                }
            });
        }
    }

    public C40455d(C40453b bVar, String str, String str2) {
        this.f102758b = str;
        this.f102757a = str2;
        C40459e eVar = new C40459e(bVar, str, str2);
        C40454c cVar = new C40454c();
        eVar.setViewDelegate(createViewDelegate());
        setView(eVar);
        setModel(cVar);
    }
}
