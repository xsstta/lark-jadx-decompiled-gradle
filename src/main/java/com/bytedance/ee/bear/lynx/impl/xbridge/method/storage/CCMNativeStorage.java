package com.bytedance.ee.bear.lynx.impl.xbridge.method.storage;

import android.text.TextUtils;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.XReadableType;
import com.bytedance.ies.xbridge.base.runtime.utils.JsonUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\tH\u0002¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/storage/CCMNativeStorage;", "Lcom/bytedance/ies/xbridge/api/INativeStorage;", "()V", "getSharedPreferencesInternal", "Lcom/ss/android/lark/sp/ISharedPreferences;", "getStorageInfo", "", "", "getStorageItem", "", "key", "removeStorageItem", "", "setStorageItem", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "unwrapValue", "value", "wrapValueWithType", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.c */
public final class CCMNativeStorage {

    /* renamed from: a */
    public static final CCMNativeStorage f23849a = new CCMNativeStorage();

    private CCMNativeStorage() {
    }

    /* renamed from: a */
    private final AbstractC54924a m37154a() {
        C57744a a = C57744a.m224104a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GlobalSP.getInstance()");
        return a;
    }

    /* renamed from: a */
    public boolean mo34015a(String str) {
        if (str == null) {
            return false;
        }
        f23849a.m37154a().remove(str);
        return true;
    }

    /* renamed from: b */
    public Object mo34017b(String str) {
        if (str == null || !m37154a().contains(str)) {
            return null;
        }
        String string = m37154a().getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string == null) {
            Intrinsics.throwNpe();
        }
        return m37156c(string);
    }

    /* renamed from: c */
    private final Object m37156c(String str) {
        StorageValue storageValue = (StorageValue) JsonUtils.f37989a.mo52933a(str, StorageValue.class);
        String value = storageValue.getValue();
        switch (C8855d.f23850a[XReadableType.valueOf(storageValue.getType()).ordinal()]) {
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean(value));
            case 2:
                return Integer.valueOf(Integer.parseInt(value));
            case 3:
                return Double.valueOf(Double.parseDouble(value));
            case 4:
                return value;
            case 5:
                return JsonUtils.f37989a.mo52933a(value, List.class);
            case 6:
                return JsonUtils.f37989a.mo52933a(value, Map.class);
            default:
                return null;
        }
    }

    /* renamed from: a */
    private final String m37155a(Object obj) {
        new LinkedHashMap();
        if (obj instanceof Boolean) {
            return JsonUtils.f37989a.mo52934a(new StorageValue(XReadableType.Boolean.name(), obj.toString()));
        }
        if (obj instanceof Integer) {
            return JsonUtils.f37989a.mo52934a(new StorageValue(XReadableType.Int.name(), obj.toString()));
        }
        if (obj instanceof Double) {
            return JsonUtils.f37989a.mo52934a(new StorageValue(XReadableType.Number.name(), obj.toString()));
        }
        if (obj instanceof String) {
            return JsonUtils.f37989a.mo52934a(new StorageValue(XReadableType.String.name(), obj.toString()));
        }
        if (obj instanceof XReadableArray) {
            return f23849a.m37155a(((XReadableArray) obj).mo53094b());
        }
        if (obj instanceof XReadableMap) {
            return f23849a.m37155a(((XReadableMap) obj).mo53102b());
        }
        if (obj instanceof List) {
            return JsonUtils.f37989a.mo52934a(new StorageValue(XReadableType.Array.name(), JsonUtils.f37989a.mo52934a(obj)));
        }
        if (obj instanceof Map) {
            return JsonUtils.f37989a.mo52934a(new StorageValue(XReadableType.Map.name(), JsonUtils.f37989a.mo52934a(obj)));
        }
        return "";
    }

    /* renamed from: a */
    public boolean mo34016a(String str, Object obj) {
        if (str == null) {
            return false;
        }
        if (obj == null) {
            return false;
        }
        CCMNativeStorage cVar = f23849a;
        cVar.m37154a().putString(str, cVar.m37155a(obj));
        return true;
    }
}
