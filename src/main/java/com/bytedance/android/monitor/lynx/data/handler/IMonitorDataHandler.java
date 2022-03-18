package com.bytedance.android.monitor.lynx.data.handler;

import android.view.View;
import com.bytedance.android.monitor.p104a.AbstractC2629a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/handler/IMonitorDataHandler;", "V", "Landroid/view/View;", "C", "Lcom/bytedance/android/monitor/base/BaseMonitorData;", "", "createNewDataWithView", "view", "(Landroid/view/View;)Lcom/bytedance/android/monitor/base/BaseMonitorData;", "findLastDataWithView", "getNewData", "putDataWithView", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Landroid/view/View;Lcom/bytedance/android/monitor/base/BaseMonitorData;)V", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.b.b */
public interface IMonitorDataHandler<V extends View, C extends AbstractC2629a> {
    /* renamed from: a */
    C mo11536a(V v);
}
