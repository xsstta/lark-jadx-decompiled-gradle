package com.ss.android.lark.larkconfig.larksetting.handler.privacydetection;

import com.ss.android.lark.appsetting.api.SettingManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/privacydetection/PrivacyDetectionSetting;", "", "()V", "value", "Lcom/ss/android/lark/larkconfig/larksetting/handler/privacydetection/PrivacyDetectionSettingValue;", "value$annotations", "getValue", "()Lcom/ss/android/lark/larkconfig/larksetting/handler/privacydetection/PrivacyDetectionSettingValue;", "value$delegate", "Lkotlin/Lazy;", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.privacydetection.a */
public final class PrivacyDetectionSetting {

    /* renamed from: a */
    public static final PrivacyDetectionSetting f104988a = new PrivacyDetectionSetting();

    /* renamed from: b */
    private static final Lazy f104989b = LazyKt.lazy(C41213a.INSTANCE);

    /* renamed from: a */
    public static final PrivacyDetectionSettingValue m163449a() {
        return (PrivacyDetectionSettingValue) f104989b.getValue();
    }

    private PrivacyDetectionSetting() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/larkconfig/larksetting/handler/privacydetection/PrivacyDetectionSettingValue;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.privacydetection.a$a */
    static final class C41213a extends Lambda implements Function0<PrivacyDetectionSettingValue> {
        public static final C41213a INSTANCE = new C41213a();

        C41213a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrivacyDetectionSettingValue invoke() {
            try {
                Object obj = SettingManager.getInstance().get(PrivacyDetectionSettingValue.class);
                if (obj == null) {
                    Intrinsics.throwNpe();
                }
                return (PrivacyDetectionSettingValue) obj;
            } catch (Exception unused) {
                return new PrivacyDetectionSettingValue();
            }
        }
    }
}
