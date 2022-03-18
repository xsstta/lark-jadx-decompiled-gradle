package com.ss.android.lark.larkconfig.universal;

import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/larkconfig/universal/UniversalUserSettingHandler;", "", "()V", "DEFAULT_BOOL_VALUE", "", "DEFAULT_LONG_VALUE", "", "DEFAULT_STRING_VALUE", "", "LOG_TAG", "universalUserSettingMap", "", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "generateDefaultUniversalUserSetting", "key", "getUniversalUserSetting", "updateUniversalUserSetting", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "universal_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.b.c */
public final class UniversalUserSettingHandler {

    /* renamed from: a */
    public static final UniversalUserSettingHandler f104913a = new UniversalUserSettingHandler();

    /* renamed from: b */
    private static final Map<String, UniversalUserSetting> f104914b = new LinkedHashMap();

    private UniversalUserSettingHandler() {
    }

    /* renamed from: b */
    private final UniversalUserSetting m163250b(String str) {
        UniversalUserSetting a = new UniversalUserSetting.C15418a().mo55923a(str).mo55921a((Boolean) false).mo55922a((Long) 0L).mo55925b("").build();
        Intrinsics.checkExpressionValueIsNotNull(a, "UniversalUserSetting.Bui…G_VALUE)\n        .build()");
        return a;
    }

    /* renamed from: a */
    public final UniversalUserSetting mo148383a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        UniversalUserSetting universalUserSetting = f104914b.get(str);
        if (universalUserSetting != null) {
            return universalUserSetting;
        }
        Log.m165383e("UniversalUserSettingManager", "no universal user setting for " + str + ", default values are used");
        return m163250b(str);
    }

    /* renamed from: a */
    public final void mo148384a(String str, UniversalUserSetting universalUserSetting) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(universalUserSetting, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        f104914b.put(str, universalUserSetting);
    }
}
