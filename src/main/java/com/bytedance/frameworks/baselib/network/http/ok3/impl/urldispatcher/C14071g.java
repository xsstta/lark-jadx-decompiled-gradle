package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.g */
public class C14071g extends AbstractC14072h {

    /* renamed from: i */
    private static final String f36967i = "g";

    /* renamed from: j */
    private String f36968j;

    /* renamed from: k */
    private String f36969k;

    /* renamed from: l */
    private String f36970l;

    /* renamed from: m */
    private String f36971m;

    /* renamed from: n */
    private String f36972n;

    /* renamed from: o */
    private boolean f36973o;

    /* renamed from: p */
    private int f36974p = 100;

    /* renamed from: q */
    private boolean f36975q;

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.AbstractC14072h
    /* renamed from: e */
    public int mo51746e() {
        return -1;
    }

    /* renamed from: g */
    private boolean m56957g() {
        int i = this.f36974p;
        if (i >= 100) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        if (new Random().nextInt(100) < this.f36974p) {
            return true;
        }
        Logger.m15167d(f36967i, "tc drop action was probabilistic discard");
        return false;
    }

    /* renamed from: a */
    private boolean m56956a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (((str.equals("http") || str.equals("https")) && (str2.equals("http") || str2.equals("https"))) || ((str.equals("ws") || str.equals("wss")) && (str2.equals("ws") || str2.equals("wss")))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.AbstractC14072h
    /* renamed from: a */
    public BaseDispatchAction.DispatchResultEnum mo51744a(String str, List<String> list) {
        String str2;
        String str3 = f36967i;
        Logger.m15167d(str3, "tc action");
        if (this.f36975q) {
            list.set(0, str);
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        }
        list.set(0, str);
        Uri parse = Uri.parse(str);
        if (this.f36973o) {
            Logger.m15167d(str3, "drop action");
            if (!m56957g() || !mo51734a(parse)) {
                return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
            }
            list.set(0, "");
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_DROP;
        } else if (this.f36969k.isEmpty() && this.f36968j.isEmpty() && this.f36970l.isEmpty()) {
            Logger.m15167d(str3, "tc full url change");
            if (this.f36937f.size() != 1) {
                return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
            }
            if (!this.f36972n.isEmpty() && parse.getPath() != null && !parse.getPath().contains(this.f36972n)) {
                return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
            }
            if (!TextUtils.isEmpty(this.f36971m)) {
                str2 = str.replaceAll((String) this.f36937f.get(0), this.f36971m);
            } else {
                str2 = str;
            }
            if (str2.equals(str)) {
                return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
            }
            list.set(0, str2);
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT;
        } else if (!mo51734a(parse)) {
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_NONE;
        } else {
            if (parse.getScheme() != null && m56956a(parse.getScheme(), this.f36968j)) {
                str = str.replaceFirst(parse.getScheme(), this.f36968j);
            }
            if (parse.getHost() != null && !TextUtils.isEmpty(this.f36969k)) {
                str = str.replaceFirst(parse.getHost(), this.f36969k);
            }
            if (parse.getPath() != null && !TextUtils.isEmpty(this.f36970l)) {
                str = str.replaceFirst(parse.getPath(), this.f36970l);
            }
            list.set(0, str);
            return BaseDispatchAction.DispatchResultEnum.DISPATCH_HIT;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.AbstractC14072h
    /* renamed from: a */
    public boolean mo51745a(JSONObject jSONObject, List<Boolean> list, String str, long j) {
        boolean z;
        mo51733a(jSONObject);
        this.f36938g = jSONObject.optString("service_name");
        this.f36968j = jSONObject.optString("scheme_replace");
        this.f36969k = jSONObject.optString("host_replace");
        this.f36970l = jSONObject.optString("path_replace");
        this.f36972n = jSONObject.optString("url_contain");
        this.f36971m = jSONObject.optString("replace");
        if (jSONObject.optInt("drop") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f36973o = z;
        int optInt = jSONObject.optInt("possibility", 100);
        if (optInt >= 0 && optInt <= 100) {
            this.f36974p = optInt;
        }
        if ((this.f36933b.isEmpty() && this.f36934c.isEmpty() && this.f36935d.isEmpty() && this.f36936e.isEmpty() && this.f36937f.isEmpty()) || (!this.f36973o && this.f36968j.isEmpty() && this.f36969k.isEmpty() && this.f36970l.isEmpty() && this.f36971m.isEmpty())) {
            this.f36975q = true;
        }
        list.set(0, false);
        return true;
    }
}
