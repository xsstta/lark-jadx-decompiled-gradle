package com.larksuite.component.dybrid.h5core.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.larksuite.component.dybrid.h5api.api.AbstractC24161d;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.H5TranslateProxyActivity;
import com.larksuite.component.dybrid.h5core.core.impl.C24205b;
import com.larksuite.framework.utils.C26320t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class H5MainProcessMessenger extends Service {

    /* renamed from: a */
    public static Map<String, StringBuilder> f59899a = new HashMap();

    /* renamed from: b */
    private final Messenger f59900b = new Messenger(new HandlerC24248a());

    /* renamed from: com.larksuite.component.dybrid.h5core.ipc.H5MainProcessMessenger$a */
    private static class HandlerC24248a extends Handler {

        /* renamed from: a */
        private Map<Integer, AbstractC24168k> f59901a;

        private HandlerC24248a() {
            this.f59901a = new HashMap();
        }

        public void handleMessage(Message message) {
            final int i = message.getData().getInt("nodeId");
            final String string = message.getData().getString("eventId");
            final Messenger messenger = message.replyTo;
            int i2 = message.what;
            if (i2 == 100) {
                C24174b.m88296a("H5MainProcessMessenger", "主线程生成了一个 H5Page.");
                for (String str : message.getData().keySet()) {
                    C24174b.m88296a("H5MainProcessMessenger", "key:" + str + " value:" + message.getData().get(str));
                }
                C24205b bVar = new C24205b(message.getData());
                bVar.mo86751a(messenger);
                this.f59901a.put(Integer.valueOf(i), bVar);
            } else if (i2 == 101) {
                AbstractC24168k kVar = this.f59901a.get(Integer.valueOf(i));
                if (kVar != null) {
                    C24174b.m88296a("H5MainProcessMessenger", "清理H5Page, NodeId = " + i);
                    kVar.mo86756i();
                    this.f59901a.remove(Integer.valueOf(i));
                }
                if (this.f59901a.isEmpty()) {
                    H5TranslateProxyActivity.m88362a();
                }
            } else if (i2 != 200) {
                super.handleMessage(message);
            } else {
                String string2 = message.getData().getString("eventName");
                String string3 = message.getData().getString("ipcParams");
                int i3 = message.getData().getInt("ipcParamsSegmentTotal");
                if (i3 > 0) {
                    StringBuilder sb = H5MainProcessMessenger.f59899a.get(string);
                    if (sb == null) {
                        sb = new StringBuilder();
                        H5MainProcessMessenger.f59899a.put(string, sb);
                    }
                    sb.append(string3);
                    if (message.getData().getInt("ipcParamsSegmentIndex") == i3) {
                        String string4 = message.getData().getString("ipcParamsMd5");
                        H5MainProcessMessenger.f59899a.remove(string);
                        string3 = sb.toString();
                        if (!C26320t.m95318a(string3).equals(string4)) {
                            C24174b.m88296a("H5MainProcessMessenger", "segment data not match source data.");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C24174b.m88296a("H5MainProcessMessenger", "event:" + string2 + " params:" + string3);
                AbstractC24168k kVar2 = this.f59901a.get(Integer.valueOf(i));
                if (kVar2 != null) {
                    C24174b.m88296a("H5MainProcessMessenger", "H5Page 存在，在主进程分发事件:" + string2);
                    try {
                        kVar2.mo86737a(string2, new JSONObject(string3), new AbstractC24161d() {
                            /* class com.larksuite.component.dybrid.h5core.ipc.H5MainProcessMessenger.HandlerC24248a.C242491 */

                            @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24161d
                            /* renamed from: a */
                            public void mo86730a(JSONObject jSONObject) {
                                if (messenger != null && jSONObject != null) {
                                    Message obtain = Message.obtain((Handler) null, 201);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("nodeId", i);
                                    bundle.putString("eventId", string);
                                    bundle.putString("ipcParams", jSONObject.toString());
                                    C24174b.m88296a("H5MainProcessMessenger", "onCallback:" + jSONObject.toString());
                                    obtain.setData(bundle);
                                    try {
                                        messenger.send(obtain);
                                    } catch (RemoteException e) {
                                        C24174b.m88297a("H5MainProcessMessenger", "RemoteException", e);
                                    }
                                }
                            }
                        });
                    } catch (JSONException e) {
                        C24174b.m88297a("H5MainProcessMessenger", "JSONException", e);
                    }
                } else {
                    C24174b.m88296a("H5MainProcessMessenger", "H5Page 生成错误，无法分发事件");
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f59900b.getBinder();
    }
}
