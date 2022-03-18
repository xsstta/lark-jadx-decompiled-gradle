package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.DispatchStrategy;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.e */
public class C14069e extends AbstractC14072h {

    /* renamed from: i */
    private static final String f36963i = "e";

    /* renamed from: j */
    private DispatchStrategy f36964j;

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.AbstractC14072h
    /* renamed from: e */
    public int mo51746e() {
        return this.f36964j.mo51742b().ordinal();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.AbstractC14072h
    /* renamed from: a */
    public BaseDispatchAction.DispatchResultEnum mo51744a(String str, List<String> list) {
        String str2 = f36963i;
        Logger.m15167d(str2, "dispatch action " + this.f36964j.mo51742b());
        BaseDispatchAction.DispatchResultEnum dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        Uri parse = Uri.parse(str);
        if (!(parse.getHost() == null || !mo51734a(parse) || this.f36964j == null)) {
            dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT;
            String a = this.f36964j.mo51740a(parse);
            if (!str.equals(a)) {
                list.set(0, a);
            } else {
                list.set(0, str);
            }
        }
        return dispatchResultEnum;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.AbstractC14072h
    /* renamed from: a */
    public boolean mo51745a(JSONObject jSONObject, List<Boolean> list, String str, long j) {
        mo51733a(jSONObject);
        String optString = jSONObject.optString("service_name");
        if (!TextUtils.isEmpty(optString)) {
            this.f36938g = optString;
        }
        int optInt = jSONObject.optInt("dispatch_strategy", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("strategy_info");
        if (optInt < 0 || optInt > 5) {
            this.f36964j = null;
            return false;
        }
        DispatchStrategy a = DispatchStrategy.m56941a(DispatchStrategy.DispatchStrategyType.values()[optInt], optJSONObject, str, j, mo51732a());
        this.f36964j = a;
        list.set(0, Boolean.valueOf(a.mo51741a()));
        return true;
    }
}
