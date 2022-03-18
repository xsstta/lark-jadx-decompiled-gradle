package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.Intrinsics;

public final class VersionSpecificBehaviorKt {
    public static final boolean isVersionRequirementTableWrittenCorrectly(BinaryVersion binaryVersion) {
        Intrinsics.checkParameterIsNotNull(binaryVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        return isKotlin1Dot4OrLater(binaryVersion);
    }

    public static final boolean isKotlin1Dot4OrLater(BinaryVersion binaryVersion) {
        Intrinsics.checkParameterIsNotNull(binaryVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        if (binaryVersion.getMajor() != 1 || binaryVersion.getMinor() < 4) {
            return false;
        }
        return true;
    }
}
