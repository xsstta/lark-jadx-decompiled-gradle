package com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.d */
public class C40435d extends BasePresenter<AbstractC40429a.AbstractC40430a, AbstractC40429a.AbstractC40431b, AbstractC40429a.AbstractC40431b.AbstractC40432a> {

    /* renamed from: a */
    public String f102719a;

    /* renamed from: b */
    private String f102720b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC40429a.AbstractC40431b.AbstractC40432a createViewDelegate() {
        return new C40437a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.d$a */
    public class C40437a implements AbstractC40429a.AbstractC40431b.AbstractC40432a {
        private C40437a() {
        }

        @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40431b.AbstractC40432a
        /* renamed from: a */
        public void mo146434a(String str, String str2) {
            Log.m165389i("InvitationModule", str + ", " + str2 + ", " + C40435d.this.f102719a);
            ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146428a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(str);
            arrayList2.add(str2);
            ((AbstractC40429a.AbstractC40430a) C40435d.this.getModel()).mo146427a(new InvitationServiceApi.C40083b(arrayList, arrayList2), C40435d.this.f102719a, new IGetDataCallback<InvitationServiceApi.C40084c>() {
                /* class com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.C40435d.C40437a.C404381 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146431b();
                    Log.m165383e("InvitationModule", errorResult.toString());
                    String displayMsg = errorResult.getDisplayMsg();
                    if (!TextUtils.isEmpty(displayMsg)) {
                        ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146433c(displayMsg);
                    }
                }

                /* renamed from: a */
                public void onSuccess(InvitationServiceApi.C40084c cVar) {
                    ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146431b();
                    if (cVar.f101876a) {
                        ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146433c(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny));
                        return;
                    }
                    Map<String, InvitationServiceApi.C40082a> map = cVar.f101877b;
                    if (map.size() == 0) {
                        ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146430a(cVar.f101878c);
                        return;
                    }
                    Iterator<Map.Entry<String, InvitationServiceApi.C40082a>> it = map.entrySet().iterator();
                    if (it.hasNext()) {
                        InvitationServiceApi.C40082a value = it.next().getValue();
                        if (value.f101871a == InvitationServiceApi.InviteErrorType.FORMAT_EMAIL) {
                            ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146429a(value.f101872b);
                        } else if (value.f101871a == InvitationServiceApi.InviteErrorType.FORMAT_NAME) {
                            ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146432b(value.f101872b);
                        } else {
                            ((AbstractC40429a.AbstractC40431b) C40435d.this.getView()).mo146433c(value.f101872b);
                        }
                    }
                }
            });
        }
    }

    public C40435d(C40433b bVar, String str, String str2) {
        this.f102720b = str;
        this.f102719a = str2;
        C40439e eVar = new C40439e(bVar, str, str2);
        C40434c cVar = new C40434c();
        eVar.setViewDelegate(createViewDelegate());
        setView(eVar);
        setModel(cVar);
    }
}
