package com.ss.android.lark.mail.impl.service.p2215a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.v1.MailStatisticsAggregationResponse;
import com.ss.android.lark.mail.impl.entity.MailStatistic;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.mail.impl.service.a.f */
public class C43301f extends AbstractC43286a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: d */
    public boolean mo154972d() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: b */
    public Command mo154970b() {
        return Command.MAIL_STATISTICS_AGGREGATION;
    }

    @Override // com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a
    /* renamed from: a */
    public void mo154969a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            MailStatisticsAggregationResponse decode = MailStatisticsAggregationResponse.ADAPTER.decode(bArr);
            if (!(decode == null || decode.statistics == null)) {
                ArrayList<MailStatistic> arrayList = new ArrayList();
                for (com.bytedance.lark.pb.email.v1.MailStatistic mailStatistic : decode.statistics) {
                    if (mailStatistic != null) {
                        if (!TextUtils.isEmpty(mailStatistic.key)) {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            if (!(mailStatistic.tea_param == null || mailStatistic.tea_param.params == null)) {
                                hashMap.putAll(mailStatistic.tea_param.params.string_param);
                                hashMap2.putAll(mailStatistic.tea_param.params.int_param);
                            }
                            HashMap hashMap3 = new HashMap();
                            HashMap hashMap4 = new HashMap();
                            if (!(mailStatistic.slardar_param == null || mailStatistic.slardar_param.params == null)) {
                                hashMap.putAll(mailStatistic.slardar_param.params.string_param);
                                hashMap2.putAll(mailStatistic.slardar_param.params.int_param);
                            }
                            arrayList.add(MailStatistic.f106954a.mo151673a(mailStatistic.key, MailStatistic.StatisticType.Companion.mo151672a(mailStatistic.type.getValue()), hashMap, hashMap2, hashMap3, hashMap4));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (MailStatistic mailStatistic2 : arrayList) {
                        if (mailStatistic2.mo151669b() != MailStatistic.StatisticType.SLARDAR) {
                            C42187a.m168522d(mailStatistic2.mo151668a(), mailStatistic2.mo151670c());
                        }
                        if (mailStatistic2.mo151669b() != MailStatistic.StatisticType.TEA) {
                            C42187a.m168516c(mailStatistic2.mo151668a(), mailStatistic2.mo151671d());
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
