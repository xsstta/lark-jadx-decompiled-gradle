package com.bytedance.ee.bear.document.statistics;

import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/document/statistics/SendEventCallback;", "", "onReceiveFrontEvent", "", "eventType", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "(Ljava/lang/Integer;Ljava/util/Map;)V", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.statistics.c */
public interface SendEventCallback {
    /* renamed from: a */
    void mo22330a(Integer num, Map<String, String> map);
}
