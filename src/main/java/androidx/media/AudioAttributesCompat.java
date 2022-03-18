package androidx.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.AbstractC1566b;
import com.huawei.hms.android.HwBuildEx;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements AbstractC1566b {

    /* renamed from: b */
    private static final SparseIntArray f4359b;

    /* renamed from: c */
    private static final int[] f4360c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a */
    AbstractC1224a f4361a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributeUsage {
    }

    AudioAttributesCompat() {
    }

    public int hashCode() {
        return this.f4361a.hashCode();
    }

    public String toString() {
        return this.f4361a.toString();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4359b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AbstractC1224a aVar = this.f4361a;
        if (aVar != null) {
            return aVar.equals(audioAttributesCompat.f4361a);
        }
        if (audioAttributesCompat.f4361a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m5528a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    /* renamed from: a */
    static int m5527a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            if (z) {
                return 1;
            }
            return 7;
        } else if ((i & 4) != 4) {
            switch (i2) {
                case 0:
                    if (z) {
                        return Integer.MIN_VALUE;
                    }
                    return 3;
                case 1:
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    if (z) {
                        return 0;
                    }
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (!z) {
                        return 3;
                    }
                    throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
            }
        } else if (z) {
            return 0;
        } else {
            return 6;
        }
    }
}
