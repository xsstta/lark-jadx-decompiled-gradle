package com.bytedance.ee.bear.document.statistics;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/document/statistics/ReportEventHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerRunOnNotUIThread;", "Lcom/bytedance/ee/bear/document/statistics/ReportEventData;", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "(Lcom/bytedance/ee/bear/contract/AnalyticService;)V", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.statistics.a */
public final class ReportEventHandler implements AbstractC7944c<ReportEventData> {

    /* renamed from: a */
    public static final Companion f17160a = new Companion(null);

    /* renamed from: b */
    private final AbstractC5233x f17161b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/statistics/ReportEventHandler$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.statistics.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReportEventHandler(AbstractC5233x xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        this.f17161b = xVar;
    }

    /* renamed from: a */
    public void handle(ReportEventData reportEventData, AbstractC7947h hVar) {
        if (reportEventData != null) {
            if (!TextUtils.isEmpty(reportEventData.event_name)) {
                String str = reportEventData.event_name;
                Intrinsics.checkExpressionValueIsNotNull(str, "data.event_name");
                if (StringsKt.startsWith$default(str, "dev_performance_feed_open", false, 2, (Object) null)) {
                    ((AbstractC9493f) KoinJavaComponent.m268613a(AbstractC9493f.class, null, null, 6, null)).mo35936a(reportEventData.data);
                    C13479a.m54772d("ReportEventHandler", reportEventData.toString());
                }
            }
            if (reportEventData.noPrefix) {
                this.f17161b.mo21084b(reportEventData.event_name, reportEventData.data);
            } else {
                this.f17161b.mo21079a(reportEventData.event_name, reportEventData.data);
            }
            C13479a.m54772d("ReportEventHandler", reportEventData.toString());
        }
    }
}
