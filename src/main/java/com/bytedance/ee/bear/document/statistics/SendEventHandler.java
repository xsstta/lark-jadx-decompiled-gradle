package com.bytedance.ee.bear.document.statistics;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/document/statistics/SendEventHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerRunOnNotUIThread;", "Lcom/bytedance/ee/bear/document/statistics/SendEventData;", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "versionType", "", "sendEventCallback", "Lcom/bytedance/ee/bear/document/statistics/SendEventCallback;", "(Lcom/bytedance/ee/bear/contract/AnalyticService;Ljava/lang/String;Lcom/bytedance/ee/bear/document/statistics/SendEventCallback;)V", "mStageReport", "Lcom/bytedance/ee/bear/document/statistics/StageReport;", "Ljava/lang/ref/WeakReference;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.statistics.d */
public final class SendEventHandler implements AbstractC7944c<SendEventData> {

    /* renamed from: a */
    public static final Companion f17162a = new Companion(null);

    /* renamed from: b */
    private WeakReference<SendEventCallback> f17163b;

    /* renamed from: c */
    private StageReport f17164c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/statistics/SendEventHandler$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.statistics.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void handle(SendEventData sendEventData, AbstractC7947h hVar) {
        Integer num;
        Integer num2;
        Integer num3;
        StringBuilder sb = new StringBuilder();
        sb.append("send event = ");
        Map<String, String> map = null;
        if (sendEventData != null) {
            num = Integer.valueOf(sendEventData.event_type);
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(", data = ");
        sb.append(sendEventData);
        C13479a.m54764b("SendEventHandler", sb.toString());
        if (sendEventData != null) {
            num2 = Integer.valueOf(sendEventData.event_type);
        } else {
            num2 = null;
        }
        if (num2 != null && num2.intValue() == 2) {
            this.f17164c.mo24869a(sendEventData);
        } else if (num2 != null && num2.intValue() == 3) {
            this.f17164c.mo24870b(sendEventData);
        }
        SendEventCallback cVar = this.f17163b.get();
        if (cVar != null) {
            if (sendEventData != null) {
                num3 = Integer.valueOf(sendEventData.event_type);
            } else {
                num3 = null;
            }
            if (sendEventData != null) {
                map = sendEventData.data;
            }
            cVar.mo22330a(num3, map);
        }
    }

    public SendEventHandler(AbstractC5233x xVar, String str, SendEventCallback cVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        Intrinsics.checkParameterIsNotNull(str, "versionType");
        Intrinsics.checkParameterIsNotNull(cVar, "sendEventCallback");
        this.f17163b = new WeakReference<>(cVar);
        this.f17164c = new StageReport(xVar, str);
    }
}
