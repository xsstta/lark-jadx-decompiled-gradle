package com.ss.android.lark.mail.impl.service.p2215a.p2216a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.v1.MailMetricsResponse;
import com.bytedance.lark.pb.email.v1.MailSlardar;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mail.impl.service.a.a.c */
public class C43290c extends AbstractC43286a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_METRIC_PUSH;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            List<MailSlardar> list = MailMetricsResponse.ADAPTER.decode(bArr).slardar;
            if (list != null) {
                for (MailSlardar mailSlardar : list) {
                    if (!(mailSlardar == null || mailSlardar.metric == null)) {
                        if (mailSlardar.category != null) {
                            MailSlardar.Metric metric = mailSlardar.metric;
                            MailSlardar.Category category = mailSlardar.category;
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            if (category.int_extra != null) {
                                concurrentHashMap.putAll(category.int_extra);
                                concurrentHashMap.putAll(category.str_extra);
                            }
                            int i = 0;
                            if (metric.latency != null) {
                                new ConcurrentHashMap().putAll(metric.latency.detail);
                                AppreciableKit b = AppreciableKit.m107394b();
                                Biz biz = Biz.values()[category.biz.intValue() > 0 ? category.biz.intValue() - 1 : 0];
                                Scene[] values = Scene.values();
                                if (category.scene.intValue() > 0) {
                                    i = category.scene.intValue() - 1;
                                }
                                AppreciableKit.m107394b().mo103516a(b.mo103510a(biz, values[i], Event.valueOf(metric.event), category.page, category.is_need_net.booleanValue(), (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null), metric.latency.time_cost.longValue(), metric.latency.detail, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, concurrentHashMap);
                            } else if (metric.error != null) {
                                Biz biz2 = Biz.values()[category.biz.intValue() > 0 ? category.biz.intValue() - 1 : 0];
                                Scene scene = Scene.values()[category.scene.intValue() > 0 ? category.scene.intValue() - 1 : 0];
                                Event valueOf = Event.valueOf(metric.event);
                                ErrorType errorType = ErrorType.values()[metric.error.error_type.intValue()];
                                ErrorLevel[] values2 = ErrorLevel.values();
                                if (metric.error.level.intValue() > 0) {
                                    i = metric.error.level.intValue() - 1;
                                }
                                AppreciableKit.m107394b().mo103514a(new ErrorParams(biz2, scene, valueOf, errorType, values2[i], metric.error.error_code.intValue(), "", category.page, "", category.is_need_net, null, null, concurrentHashMap));
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
