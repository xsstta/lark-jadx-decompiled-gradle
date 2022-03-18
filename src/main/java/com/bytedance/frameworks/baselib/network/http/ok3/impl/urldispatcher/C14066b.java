package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.TTDelayStateManager;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import com.bytedance.frameworks.baselib.network.http.util.C14088f;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.b */
public class C14066b extends BaseDispatchAction {

    /* renamed from: i */
    private static final String f36948i = "b";

    /* renamed from: j */
    private int f36949j;

    /* renamed from: k */
    private int f36950k;

    /* renamed from: l */
    private int f36951l;

    /* renamed from: m */
    private final Map<String, Set<String>> f36952m = new HashMap();

    /* renamed from: e */
    private int m56948e() {
        int i = this.f36949j;
        if (i > 0) {
            return i;
        }
        if (this.f36950k < this.f36951l) {
            return new Random().nextInt(this.f36951l - this.f36950k) + this.f36950k;
        }
        return 0;
    }

    /* renamed from: a */
    public BaseDispatchAction.DispatchResultEnum mo51743a(String str, String str2, List<Integer> list) {
        Logger.m15167d(f36948i, "take delay action");
        if (mo51739d() && !TextUtils.isEmpty(str)) {
            return m56947b(str, str2, list);
        }
        list.set(0, 0);
        return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: java.util.Map<java.lang.String, java.util.Set<java.lang.String>>, java.util.Map */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Set, java.lang.Object] */
    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction
    /* renamed from: a */
    public boolean mo51736a(JSONObject jSONObject, String str, long j) {
        int i;
        int i2;
        JSONException e;
        mo51733a(jSONObject);
        String optString = jSONObject.optString("tag");
        int i3 = 0;
        if (!TextUtils.isEmpty(optString)) {
            String[] split = optString.split(";");
            for (String str2 : split) {
                ArrayList<Pair> arrayList = new ArrayList();
                if (C14088f.m57042a(str2, ",", ContainerUtils.KEY_VALUE_DELIMITER, arrayList)) {
                    for (Pair pair : arrayList) {
                        Set<String> set = this.f36952m.get(pair.first);
                        if (set == null) {
                            set = new HashSet<>();
                        }
                        set.add(pair.second);
                        this.f36952m.put(pair.first, set);
                    }
                }
            }
        }
        this.f36949j = jSONObject.optInt("delay");
        JSONArray optJSONArray = jSONObject.optJSONArray("random");
        if (this.f36949j > 0 || optJSONArray == null) {
            i = 0;
        } else if (optJSONArray.length() != 2) {
            return false;
        } else {
            try {
                i2 = optJSONArray.getInt(0);
                try {
                    i = optJSONArray.getInt(1);
                } catch (JSONException e2) {
                    e = e2;
                }
            } catch (JSONException e3) {
                e = e3;
                i2 = 0;
                e.printStackTrace();
                i = 0;
                if (i2 > 0) {
                }
                return false;
            }
            if (i2 > 0 || i <= 0 || i2 >= i) {
                return false;
            }
            i3 = i2;
        }
        this.f36950k = i3;
        this.f36951l = i;
        if (Logger.debug()) {
            Logger.m15167d(f36948i, "initwithparam tnc tag map is " + this.f36952m);
        }
        return true;
    }

    /* renamed from: b */
    private BaseDispatchAction.DispatchResultEnum m56947b(String str, String str2, List<Integer> list) {
        boolean z;
        Uri parse = Uri.parse(str);
        if (parse.getHost() == null || !mo51734a(parse)) {
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        if (this.f36952m.isEmpty()) {
            list.set(0, Integer.valueOf(m56948e()));
            if (Logger.debug()) {
                String str3 = f36948i;
                Logger.m15167d(str3, "tnc tag map is empty, result delay time is " + list.get(0));
            }
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY;
        } else if (!TTDelayStateManager.m56399c()) {
            if (Logger.debug()) {
                Logger.m15167d(f36948i, "this action with tag is not enabled");
            }
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        } else {
            if ("".equals(str2)) {
                str2 = "s=0;p=0";
            }
            HashMap hashMap = new HashMap();
            ArrayList<Pair> arrayList = new ArrayList();
            if (!C14088f.m57042a(str2, ";", ContainerUtils.KEY_VALUE_DELIMITER, arrayList)) {
                return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
            }
            for (Pair pair : arrayList) {
                hashMap.put(pair.first, pair.second);
            }
            String num = Integer.toString(TTDelayStateManager.AppStartState.NormalStart.getValue());
            if (TTDelayStateManager.m56398b() != TTDelayStateManager.AppStartState.NormalStart) {
                num = Integer.toString(TTDelayStateManager.m56395a().getValue());
            }
            hashMap.put("s", num);
            Context b = C14073i.m56967a().mo51754b();
            if (b != null) {
                z = C14089g.m57048b(b);
            } else {
                z = true;
            }
            hashMap.put("p", Integer.toString(!z ? 1 : 0));
            if (Logger.debug()) {
                String str4 = f36948i;
                Logger.m15167d(str4, "request tag string is " + str2);
            }
            BaseDispatchAction.DispatchResultEnum dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY;
            Iterator<Map.Entry<String, Set<String>>> it = this.f36952m.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Set<String>> next = it.next();
                String str5 = (String) hashMap.get(next.getKey());
                if (str5 != null) {
                    if (!next.getValue().contains(str5)) {
                        dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
                        break;
                    }
                } else {
                    dispatchResultEnum = BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
                    break;
                }
            }
            if (dispatchResultEnum == BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY) {
                list.set(0, Integer.valueOf(m56948e()));
            }
            if (Logger.debug()) {
                String str6 = f36948i;
                Logger.m15167d(str6, "match tag result is " + dispatchResultEnum);
                Logger.m15167d(str6, "will delay time is " + list.get(0));
                Logger.m15167d(str6, "request tag map is " + hashMap);
                Logger.m15167d(str6, "tnc tag map is " + this.f36952m);
            }
            return dispatchResultEnum;
        }
    }
}
