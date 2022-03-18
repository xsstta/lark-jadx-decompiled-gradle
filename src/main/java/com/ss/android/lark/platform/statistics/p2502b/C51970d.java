package com.ss.android.lark.platform.statistics.p2502b;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendMetricsRequest;
import com.bytedance.lark.pb.basic.v1.SendMetricsResponse;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.LarkContext;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.lark.platform.statistics.b.d */
public class C51970d {

    /* renamed from: a */
    private static final ReentrantLock f129039a = new ReentrantLock();

    /* renamed from: b */
    private static Context f129040b = LarkContext.getApplication();

    /* renamed from: c */
    private static AtomicBoolean f129041c = new AtomicBoolean(false);

    /* renamed from: d */
    private static Map<String, String> f129042d = new ConcurrentHashMap();

    /* renamed from: a */
    private static void m201579a() {
        f129042d.put("android_app_version", C26246a.m94977a(f129040b).trim().toLowerCase());
        f129042d.put("android_model", DeviceUtils.getModel().trim().toLowerCase());
        f129042d.put("android_os_version", DeviceUtils.getOSVersion().trim().toLowerCase());
    }

    /* renamed from: a */
    public static void m201580a(final String str, Map<String, Float> map, Map<String, String> map2, Map<String, String> map3, boolean z) {
        if (!f129041c.get()) {
            try {
                ReentrantLock reentrantLock = f129039a;
                reentrantLock.lock();
                if (!f129041c.get()) {
                    m201579a();
                }
                f129041c.set(true);
                reentrantLock.unlock();
            } catch (Throwable th) {
                f129039a.unlock();
                throw th;
            }
        }
        String replace = str.replace("_", ".");
        if (z) {
            replace = replace + ".table";
        }
        map.put(replace, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        map3.putAll(f129042d);
        final String a = C53234a.m205877a();
        SendMetricsRequest.C15259a c = new SendMetricsRequest.C15259a().mo55549b(map).mo55550c(map3);
        if (CollectionUtils.isNotEmpty(map2)) {
            c.mo55547a(map2);
        }
        SdkSender.asynSendRequestNonWrap(Command.SEND_METRICS, c, a, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.platform.statistics.p2502b.C51970d.C519711 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("GrafanaTracer", "report: table=" + str + " contextId = " + a);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("GrafanaTracer", "report table=" + str + " contextId = " + a + "Error: " + errorResult.toString());
            }
        }, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.platform.statistics.p2502b.C51970d.C519722 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                SendMetricsResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
