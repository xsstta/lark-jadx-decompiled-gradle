package com.ss.android.lark.calendar.impl.utils.diskcache;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0003J\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/CalendarAndroidKeyStore;", "", "()V", "ANDROID_KEY_STORE_NAME", "", "KEY_ALIAS", "key", "Ljava/security/Key;", "keyStore", "Ljava/security/KeyStore;", "checkInit", "", "generateKeysForAPIMOrGreater", "getSecretKeyAPIMorGreater", "initValidKeys", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.b */
public final class CalendarAndroidKeyStore {

    /* renamed from: a */
    public static final CalendarAndroidKeyStore f83769a;

    /* renamed from: b */
    private static KeyStore f83770b;

    /* renamed from: c */
    private static Key f83771c;

    private CalendarAndroidKeyStore() {
    }

    /* renamed from: a */
    public final Key mo120341a() {
        return f83771c;
    }

    /* renamed from: c */
    private final void m125298c() {
        if (Build.VERSION.SDK_INT >= 23) {
            m125299d();
        }
    }

    static {
        CalendarAndroidKeyStore bVar = new CalendarAndroidKeyStore();
        f83769a = bVar;
        try {
            f83770b = KeyStore.getInstance("AndroidKeyStore");
            bVar.m125297b();
            KeyStore keyStore = f83770b;
            Key key = null;
            if (keyStore != null) {
                key = keyStore.getKey("lark.calendarModule.secureKey.v1", null);
            }
            f83771c = key;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private final void m125297b() {
        KeyStore keyStore = f83770b;
        if (keyStore != null) {
            keyStore.load(null);
            if (!keyStore.containsAlias("lark.calendarModule.secureKey.v1")) {
                f83769a.m125298c();
                return;
            }
            boolean z = false;
            try {
                if (keyStore.getEntry("lark.calendarModule.secureKey.v1", null) instanceof KeyStore.SecretKeyEntry) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            if (!z) {
                keyStore.deleteEntry("lark.calendarModule.secureKey.v1");
                f83769a.m125298c();
            }
        }
    }

    /* renamed from: d */
    private final void m125299d() {
        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        Intrinsics.checkExpressionValueIsNotNull(instance, "KeyGenerator.getInstance…  ANDROID_KEY_STORE_NAME)");
        instance.init(new KeyGenParameterSpec.Builder("lark.calendarModule.secureKey.v1", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
        instance.generateKey();
    }
}
