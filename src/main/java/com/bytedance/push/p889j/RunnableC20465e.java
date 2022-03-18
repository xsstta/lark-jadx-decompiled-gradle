package com.bytedance.push.p889j;

import android.util.Pair;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.push.PushBody;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.interfaze.AbstractC20439b;
import com.bytedance.push.p883e.C20409d;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.C59958a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.push.j.e */
public class RunnableC20465e implements Runnable {

    /* renamed from: a */
    private final PushBody f49948a;

    /* renamed from: b */
    private final int f49949b;

    public void run() {
        String str;
        String a;
        C20552c.m74853d("Show", "start to upload filter event");
        AbstractC20439b bVar = PushSupporter.get().getConfiguration().f49804z;
        String str2 = this.f49948a.f49738f;
        C20409d a2 = C20463c.m74473a(AppProvider.getApp(), this.f49949b);
        String str3 = "";
        if (a2 != null) {
            str = a2.f49887b;
        } else {
            str = str3;
        }
        C20552c.m74853d("Show", "token info = " + a2);
        if (!(bVar == null || (a = bVar.mo68906a()) == null)) {
            str3 = a;
        }
        String a3 = C59958a.m232686a("/cloudpush/user_push_replace/");
        C59436a.m230727a(a3, PushSupporter.get().getCommonParams());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("ttpush_sec_target_uid", str2));
        arrayList.add(new Pair("local_sec_uid", str3));
        arrayList.add(new Pair("send_sdk", String.valueOf(this.f49949b)));
        arrayList.add(new Pair("token", str));
        arrayList.add(new Pair("rid64", String.valueOf(this.f49948a.f49735c)));
        try {
            NetworkClient.ReqContext reqContext = new NetworkClient.ReqContext();
            reqContext.addCommonParams = false;
            String post = NetworkClient.getDefault().post(a3, arrayList, (Map<String, String>) null, reqContext);
            C20552c.m74852c("Show", "upload filter event. result = " + post);
        } catch (Throwable th) {
            C20552c.m74850b("Show", "upload filter event. result = " + th);
            th.printStackTrace();
        }
    }

    public RunnableC20465e(int i, PushBody pushBody) {
        this.f49949b = i;
        this.f49948a = pushBody;
    }
}
