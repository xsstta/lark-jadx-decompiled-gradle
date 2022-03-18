package com.ss.android.lark.mail.impl.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/MailStatistic;", "", "serviceName", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mail/impl/entity/MailStatistic$StatisticType;", "teaParams", "Lorg/json/JSONObject;", "slardarParams", "(Ljava/lang/String;Lcom/ss/android/lark/mail/impl/entity/MailStatistic$StatisticType;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "getServiceName", "()Ljava/lang/String;", "getSlardarParams", "()Lorg/json/JSONObject;", "getTeaParams", "getType", "()Lcom/ss/android/lark/mail/impl/entity/MailStatistic$StatisticType;", "Companion", "StatisticType", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MailStatistic {

    /* renamed from: a */
    public static final Companion f106954a = new Companion(null);

    /* renamed from: b */
    private final String f106955b;

    /* renamed from: c */
    private final StatisticType f106956c;

    /* renamed from: d */
    private final JSONObject f106957d;

    /* renamed from: e */
    private final JSONObject f106958e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/MailStatistic$StatisticType;", "", "(Ljava/lang/String;I)V", "TEA", "SLARDAR", "BOTH", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum StatisticType {
        TEA,
        SLARDAR,
        BOTH;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/MailStatistic$StatisticType$Companion;", "", "()V", "getType", "Lcom/ss/android/lark/mail/impl/entity/MailStatistic$StatisticType;", "num", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.entity.MailStatistic$StatisticType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final StatisticType mo151672a(int i) {
                if (i == 1) {
                    return StatisticType.TEA;
                }
                if (i == 2) {
                    return StatisticType.SLARDAR;
                }
                if (i != 3) {
                    return StatisticType.TEA;
                }
                return StatisticType.BOTH;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jf\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000bJ6\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/MailStatistic$Companion;", "", "()V", "TAG", "", "genStatistic", "Lcom/ss/android/lark/mail/impl/entity/MailStatistic;", "serviceName", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mail/impl/entity/MailStatistic$StatisticType;", "teaParams1", "", "teaParams2", "", "slardarParams1", "slardarParams2", "generateJsonObj", "Lorg/json/JSONObject;", "params1", "params2", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.entity.MailStatistic$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final JSONObject m167745a(Map<String, String> map, Map<String, Integer> map2) {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException e) {
                    Log.m165384e("MailPushStatistic", "generateJsonObj exeception", e);
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue().intValue());
                }
            }
            return jSONObject;
        }

        /* renamed from: a */
        public final MailStatistic mo151673a(String str, StatisticType statisticType, Map<String, String> map, Map<String, Integer> map2, Map<String, String> map3, Map<String, Integer> map4) {
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(str, "serviceName");
            Intrinsics.checkParameterIsNotNull(statisticType, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(map, "teaParams1");
            Intrinsics.checkParameterIsNotNull(map2, "teaParams2");
            Intrinsics.checkParameterIsNotNull(map3, "slardarParams1");
            Intrinsics.checkParameterIsNotNull(map4, "slardarParams2");
            JSONObject jSONObject2 = null;
            if (statisticType != StatisticType.SLARDAR) {
                jSONObject = m167745a(map, map2);
            } else {
                jSONObject = null;
            }
            if (statisticType != StatisticType.TEA) {
                jSONObject2 = m167745a(map3, map4);
            }
            return new MailStatistic(str, statisticType, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public final String mo151668a() {
        return this.f106955b;
    }

    /* renamed from: b */
    public final StatisticType mo151669b() {
        return this.f106956c;
    }

    /* renamed from: c */
    public final JSONObject mo151670c() {
        return this.f106957d;
    }

    /* renamed from: d */
    public final JSONObject mo151671d() {
        return this.f106958e;
    }

    public MailStatistic(String str, StatisticType statisticType, JSONObject jSONObject, JSONObject jSONObject2) {
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        Intrinsics.checkParameterIsNotNull(statisticType, ShareHitPoint.f121869d);
        this.f106955b = str;
        this.f106956c = statisticType;
        this.f106957d = jSONObject;
        this.f106958e = jSONObject2;
    }
}
