package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.g */
public class CallableC14047g implements Callable<Void> {

    /* renamed from: a */
    private final String f36821a = CallableC14047g.class.getSimpleName();

    /* renamed from: b */
    private final String f36822b;

    /* renamed from: c */
    private final C14032a f36823c;

    /* renamed from: d */
    private final WeakHandler f36824d;

    /* renamed from: a */
    public Void call() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f36822b);
            for (InetAddress inetAddress : allByName) {
                if (inetAddress instanceof Inet4Address) {
                    arrayList.add(inetAddress.getHostAddress());
                } else if (inetAddress instanceof Inet6Address) {
                    arrayList2.add(inetAddress.getHostAddress());
                } else {
                    Logger.m15167d(this.f36821a, "local dns server returned a invalid address: " + inetAddress.getHostAddress());
                }
            }
            Logger.m15167d(this.f36821a, "local dns resolved success for host: " + this.f36822b);
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                this.f36823c.mo51655b(this.f36822b, new DnsRecord(this.f36822b, System.currentTimeMillis(), arrayList, arrayList2, C14041b.m56829a().mo51694c().get()));
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if (!C14041b.m56829a().mo51702h().get()) {
            Message obtain = Message.obtain();
            obtain.obj = this;
            obtain.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("localdns_completed_host", this.f36822b);
            obtain.setData(bundle);
            this.f36824d.sendMessage(obtain);
            Logger.m15167d(this.f36821a, "send message to collect result handler for host : " + this.f36822b);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", this.f36822b);
                if (arrayList.size() == 0 && arrayList2.size() == 0) {
                    jSONObject.put(UpdateKey.STATUS, "failed");
                    jSONObject.put("result", "");
                } else {
                    jSONObject.put(UpdateKey.STATUS, "succeed");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(arrayList);
                    jSONObject.put("result", arrayList3);
                }
                jSONObject.put("rtt", currentTimeMillis2);
                Logger.m15167d(this.f36821a, jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.f36823c.mo51667h(this.f36822b);
        return null;
    }

    public CallableC14047g(String str, C14032a aVar, WeakHandler weakHandler) {
        this.f36822b = str;
        this.f36823c = aVar;
        this.f36824d = weakHandler;
    }
}
