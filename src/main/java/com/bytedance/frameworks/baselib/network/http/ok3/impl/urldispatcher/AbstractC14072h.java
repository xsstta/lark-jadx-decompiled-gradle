package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.h */
public abstract class AbstractC14072h extends BaseDispatchAction {

    /* renamed from: i */
    private static final String f36976i = "h";

    /* renamed from: j */
    private boolean f36977j;

    /* renamed from: a */
    public abstract BaseDispatchAction.DispatchResultEnum mo51744a(String str, List<String> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo51745a(JSONObject jSONObject, List<Boolean> list, String str, long j);

    /* renamed from: e */
    public abstract int mo51746e();

    /* renamed from: f */
    public boolean mo51748f() {
        return this.f36977j;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction
    /* renamed from: a */
    public boolean mo51736a(JSONObject jSONObject, String str, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, false);
        boolean a = mo51745a(jSONObject, arrayList, str, j);
        this.f36977j = arrayList.get(0).booleanValue();
        return a;
    }

    /* renamed from: a */
    public BaseDispatchAction.DispatchResultEnum mo51747a(C14075j jVar, String str, List<String> list, List<C14067c> list2) {
        if (!mo51735a(jVar) || TextUtils.isEmpty(str)) {
            list.set(0, str);
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        BaseDispatchAction.DispatchResultEnum a = mo51744a(str, list);
        C14067c cVar = new C14067c();
        if (a != BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE) {
            cVar.f36956d = true;
            cVar.f36954b = mo51737b();
            cVar.f36955c = mo51732a();
            cVar.f36957e = mo51746e();
            cVar.f36953a = mo51738c();
            if (a == BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT) {
                cVar.f36959g = list.get(0);
                cVar.f36958f = mo51748f();
            }
            jVar.mo51767a(this.f36939h);
        }
        list2.add(cVar);
        return a;
    }
}
