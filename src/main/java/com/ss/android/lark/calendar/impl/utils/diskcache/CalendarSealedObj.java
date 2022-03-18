package com.ss.android.lark.calendar.impl.utils.diskcache;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Serializable;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SealedObject;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013XD¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/CalendarSealedObj;", "Ljava/io/Serializable;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/io/Serializable;)V", "id", "", "(Ljava/io/Serializable;Ljava/lang/String;)V", "ar", "", "baseSealedObject", "Lcom/ss/android/lark/calendar/impl/utils/diskcache/BaseSealedObj;", "e1", "isLocal", "", "kr", "modeAesGcm", "sealedObject", "Ljavax/crypto/SealedObject;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "checkInitE1", "", "genDecrypt", "Ljavax/crypto/Cipher;", "genE1", "generateCipher", "getObject", "", "initVec", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSealedObj implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final byte[] ar;
    private BaseSealedObj baseSealedObject;
    private transient byte[] e1;
    private boolean isLocal;
    private final byte[] kr;
    private final String modeAesGcm;
    private SealedObject sealedObject;
    private final int version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/CalendarSealedObj$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.CalendarSealedObj$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void checkInitE1() {
        if (this.e1 == null) {
            this.e1 = this.ar;
            if (!this.isLocal) {
                genE1();
            }
        }
    }

    private final void initVec() {
        SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
        instance.nextBytes(this.ar);
        instance.nextBytes(this.kr);
    }

    public final Object getObject() {
        BaseSealedObj baseSealedObj = this.baseSealedObject;
        if (baseSealedObj == null) {
            SealedObject sealedObject2 = this.sealedObject;
            if (sealedObject2 != null) {
                return sealedObject2.getObject(genDecrypt());
            }
            return null;
        } else if (baseSealedObj != null) {
            return baseSealedObj.getObject(genDecrypt());
        } else {
            return null;
        }
    }

    private final Cipher genDecrypt() {
        checkInitE1();
        Cipher instance = Cipher.getInstance(this.modeAesGcm);
        instance.init(2, new SecretKeySpec(this.e1, "AES"), new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, this.kr));
        Intrinsics.checkExpressionValueIsNotNull(instance, "cipher");
        return instance;
    }

    private final Cipher generateCipher() {
        Cipher instance = Cipher.getInstance(this.modeAesGcm);
        instance.init(1, new SecretKeySpec(this.e1, "AES"), new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, this.kr));
        Intrinsics.checkExpressionValueIsNotNull(instance, "cipher");
        return instance;
    }

    private final void genE1() {
        Key a = CalendarAndroidKeyStore.f83769a.mo120341a();
        if (a == null) {
            this.isLocal = true;
            return;
        }
        byte[] a2 = ArrayGenerator.f83762a.mo120335a(this.ar, this.kr);
        if (a2 == null) {
            Cipher instance = Cipher.getInstance(this.modeAesGcm);
            instance.init(1, a, new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, this.kr));
            byte[] doFinal = instance.doFinal(this.ar);
            Intrinsics.checkExpressionValueIsNotNull(doFinal, "cipher.doFinal(ar)");
            a2 = Arrays.copyOf(doFinal, this.ar.length);
            Intrinsics.checkExpressionValueIsNotNull(a2, "java.util.Arrays.copyOf(this, newSize)");
        }
        this.e1 = a2;
    }

    public CalendarSealedObj(Serializable serializable) {
        Intrinsics.checkParameterIsNotNull(serializable, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.version = 1;
        this.ar = new byte[]{9, 1, 34, 19, 8, 6, 6, 51, 33, 52, 1, 103, 122, 2, 17, 47};
        this.kr = new byte[]{25, 33, 39, 16, 15, 22, 70, 54, 35, 52, 33, 87};
        this.modeAesGcm = "AES/GCM/NoPadding";
        initVec();
        checkInitE1();
        this.baseSealedObject = new BaseSealedObj(serializable, generateCipher());
    }

    public CalendarSealedObj(Serializable serializable, String str) {
        Intrinsics.checkParameterIsNotNull(serializable, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.version = 1;
        byte[] bArr = {9, 1, 34, 19, 8, 6, 6, 51, 33, 52, 1, 103, 122, 2, 17, 47};
        this.ar = bArr;
        byte[] bArr2 = {25, 33, 39, 16, 15, 22, 70, 54, 35, 52, 33, 87};
        this.kr = bArr2;
        this.modeAesGcm = "AES/GCM/NoPadding";
        ArrayGenerator.f83762a.mo120334a(str, bArr, bArr2);
        checkInitE1();
        this.baseSealedObject = new BaseSealedObj(serializable, generateCipher());
    }
}
