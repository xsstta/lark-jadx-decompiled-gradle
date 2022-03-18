package com.bytedance.ee.bear.middleground.feed.p453a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9496i;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.middleground.feed.p457e.C9486c;
import com.bytedance.ee.bear.middleground.feed.statistics.FeedReportV2;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13604b;
import com.bytedance.ee.util.p701d.C13629i;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.feed.a.f */
public class C9423f {
    /* renamed from: c */
    public static MessageResultBean m39003c(String str) throws JSONException {
        return (MessageResultBean) JSON.parseObject(str, MessageResultBean.class);
    }

    /* renamed from: a */
    public static MessageResultBean m38997a(String str) throws JSONException {
        return (MessageResultBean) JSON.parseObject(new JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("body"), MessageResultBean.class);
    }

    /* renamed from: b */
    public static MessageResultBean m39002b(String str) throws JSONException {
        String string = new JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("body");
        MessageResultBean messageResultBean = (MessageResultBean) JSON.parseObject(string, MessageResultBean.class);
        messageResultBean.getData().setMessage(JSON.parseArray(new JSONObject(string).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("messages"), MessageBean.class));
        return messageResultBean;
    }

    /* renamed from: d */
    public static JSONObject m39004d(String str) {
        try {
            MessageResultBean messageResultBean = new MessageResultBean();
            messageResultBean.setData((MessageResultBean.Data) JSON.parseObject(str, MessageResultBean.Data.class));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("body", JSON.toJSONString(messageResultBean));
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            C13479a.m54761a("MessageDataUtils", e);
            return new JSONObject();
        }
    }

    /* renamed from: e */
    public static JSONObject m39005e(String str) {
        try {
            MessageResultBean c = m39003c(str);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("body", JSON.toJSONString(c));
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            C13479a.m54761a("MessageDataUtils", e);
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static boolean m39001a(String str, Map<String, String> map) {
        C13479a.m54764b("MessageDataUtils", "autoShowFeed");
        if (C13604b.m55237a(str)) {
            return C13604b.m55240b(map);
        }
        C13479a.m54764b("MessageDataUtils", "isLarkFeed: false");
        return false;
    }

    /* renamed from: a */
    public static void m39000a(String str, MessageResultBean messageResultBean, int[] iArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            List<MessageBean> message = messageResultBean.getData().getMessage();
            if (message != null) {
                i2 = message.size();
                try {
                    for (MessageBean messageBean : message) {
                        arrayList.add(Integer.valueOf(messageBean.getDelete()));
                        arrayList2.add(Integer.valueOf(messageBean.getFinish()));
                    }
                } catch (Exception unused) {
                    i = 0;
                    iArr[0] = i2;
                    iArr[1] = i;
                    C13479a.m54764b("MessageDataUtils", str + ": " + i2 + " un read: " + i + " deleteStatus:" + arrayList.toString() + " finishStatus:" + arrayList2.toString());
                }
            } else {
                i2 = 0;
            }
            i = messageResultBean.getData().getNewMessageNum();
        } catch (Exception unused2) {
            i2 = 0;
            i = 0;
            iArr[0] = i2;
            iArr[1] = i;
            C13479a.m54764b("MessageDataUtils", str + ": " + i2 + " un read: " + i + " deleteStatus:" + arrayList.toString() + " finishStatus:" + arrayList2.toString());
        }
        iArr[0] = i2;
        iArr[1] = i;
        C13479a.m54764b("MessageDataUtils", str + ": " + i2 + " un read: " + i + " deleteStatus:" + arrayList.toString() + " finishStatus:" + arrayList2.toString());
    }

    /* renamed from: a */
    public static void m38998a(C10917c cVar, BearUrl bearUrl, RouteBean routeBean, AbstractC9496i iVar) {
        if (bearUrl == null || TextUtils.isEmpty(bearUrl.f17450e) || routeBean == null || routeBean.mo40633s() == null) {
            C13604b.m55234a(false);
            return;
        }
        FeedInfo a = FeedInfo.f25325a.mo35915a(bearUrl, routeBean.mo40633s());
        FeedReportV2.f25356a.mo35965e();
        FeedReportV2.f25356a.mo35954a(a);
        FeedReportV2.f25356a.mo35966f();
        FeedReportV2.f25356a.mo35963c("stage_native_vc_oncreate");
        C13604b.m55234a(C13604b.m55237a(bearUrl.f17450e));
        C9422e.m38966a(cVar).mo35919a(iVar);
        boolean a2 = m39001a(bearUrl.f17450e, routeBean.mo40633s());
        C13479a.m54764b("MessageDataUtils", "startRouter()...  autoShowFeed = " + a2 + " process:" + C13629i.m55303b((Context) null));
        if (a2) {
            C9486c.f25495a = SystemClock.elapsedRealtime();
            FeedReportV2.f25356a.mo35963c("stage_native_pull_data");
            C9422e.m38966a(cVar).mo35916a(bearUrl.f17447b, C8275a.m34055d(bearUrl.f17446a).mo32555b());
        }
    }

    /* renamed from: a */
    public static void m38999a(C10917c cVar, MessageResultBean messageResultBean, String str, String str2, int i, C9419a aVar) {
        boolean z;
        Iterator<MessageBean> it = messageResultBean.getData().getMessage().iterator();
        while (it.hasNext()) {
            MessageBean next = it.next();
            boolean equals = Objects.equals(next.getUser_id(), str);
            if ("MESSAGE_DOC_COMMENT".equals(next.getType()) || "MESSAGE_DOC_MENTION".equals(next.getType()) || "MESSAGE_CARD".equals(next.getType())) {
                z = false;
            } else {
                z = true;
            }
            if (z || equals) {
                C13479a.m54764b("MessageDataUtils", "remove: " + equals);
                it.remove();
            }
            if (aVar != null && aVar.mo35901b(next.getMessageId())) {
                C13479a.m54764b("MessageDataUtils", "has read:" + next.getMessageId());
                next.setReadStatus(2);
            }
            if ("MESSAGE_DOC_SHARE".equals(next.getType()) && next.getReadStatus() == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next.getMessageId());
                C9419a.m38936a(cVar, arrayList, str2, i);
            }
        }
    }
}
