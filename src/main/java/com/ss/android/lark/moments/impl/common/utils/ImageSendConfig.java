package com.ss.android.lark.moments.impl.common.utils;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@AppConfig(key = "send_image_msg_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/ImageSendConfig;", "", "baseConfig", "Lcom/ss/android/lark/moments/impl/common/utils/FormatConfig;", "pngConfig", "jpegConfig", "gifConfig", "(Lcom/ss/android/lark/moments/impl/common/utils/FormatConfig;Lcom/ss/android/lark/moments/impl/common/utils/FormatConfig;Lcom/ss/android/lark/moments/impl/common/utils/FormatConfig;Lcom/ss/android/lark/moments/impl/common/utils/FormatConfig;)V", "getBaseConfig", "()Lcom/ss/android/lark/moments/impl/common/utils/FormatConfig;", "getGifConfig", "getJpegConfig", "getPngConfig", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getConfigByType", "mimeType", "", "hashCode", "", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImageSendConfig {
    @SerializedName("base_config")
    private final FormatConfig baseConfig;
    @SerializedName("gif_config")
    private final FormatConfig gifConfig;
    @SerializedName("jpg_config")
    private final FormatConfig jpegConfig;
    @SerializedName("png_config")
    private final FormatConfig pngConfig;

    public ImageSendConfig() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ImageSendConfig copy$default(ImageSendConfig imageSendConfig, FormatConfig formatConfig, FormatConfig formatConfig2, FormatConfig formatConfig3, FormatConfig formatConfig4, int i, Object obj) {
        if ((i & 1) != 0) {
            formatConfig = imageSendConfig.baseConfig;
        }
        if ((i & 2) != 0) {
            formatConfig2 = imageSendConfig.pngConfig;
        }
        if ((i & 4) != 0) {
            formatConfig3 = imageSendConfig.jpegConfig;
        }
        if ((i & 8) != 0) {
            formatConfig4 = imageSendConfig.gifConfig;
        }
        return imageSendConfig.copy(formatConfig, formatConfig2, formatConfig3, formatConfig4);
    }

    public final FormatConfig component1() {
        return this.baseConfig;
    }

    public final FormatConfig component2() {
        return this.pngConfig;
    }

    public final FormatConfig component3() {
        return this.jpegConfig;
    }

    public final FormatConfig component4() {
        return this.gifConfig;
    }

    public final ImageSendConfig copy(FormatConfig formatConfig, FormatConfig formatConfig2, FormatConfig formatConfig3, FormatConfig formatConfig4) {
        Intrinsics.checkParameterIsNotNull(formatConfig, "baseConfig");
        Intrinsics.checkParameterIsNotNull(formatConfig2, "pngConfig");
        Intrinsics.checkParameterIsNotNull(formatConfig3, "jpegConfig");
        Intrinsics.checkParameterIsNotNull(formatConfig4, "gifConfig");
        return new ImageSendConfig(formatConfig, formatConfig2, formatConfig3, formatConfig4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSendConfig)) {
            return false;
        }
        ImageSendConfig imageSendConfig = (ImageSendConfig) obj;
        return Intrinsics.areEqual(this.baseConfig, imageSendConfig.baseConfig) && Intrinsics.areEqual(this.pngConfig, imageSendConfig.pngConfig) && Intrinsics.areEqual(this.jpegConfig, imageSendConfig.jpegConfig) && Intrinsics.areEqual(this.gifConfig, imageSendConfig.gifConfig);
    }

    public int hashCode() {
        FormatConfig formatConfig = this.baseConfig;
        int i = 0;
        int hashCode = (formatConfig != null ? formatConfig.hashCode() : 0) * 31;
        FormatConfig formatConfig2 = this.pngConfig;
        int hashCode2 = (hashCode + (formatConfig2 != null ? formatConfig2.hashCode() : 0)) * 31;
        FormatConfig formatConfig3 = this.jpegConfig;
        int hashCode3 = (hashCode2 + (formatConfig3 != null ? formatConfig3.hashCode() : 0)) * 31;
        FormatConfig formatConfig4 = this.gifConfig;
        if (formatConfig4 != null) {
            i = formatConfig4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ImageSendConfig(baseConfig=" + this.baseConfig + ", pngConfig=" + this.pngConfig + ", jpegConfig=" + this.jpegConfig + ", gifConfig=" + this.gifConfig + ")";
    }

    public final FormatConfig getBaseConfig() {
        return this.baseConfig;
    }

    public final FormatConfig getGifConfig() {
        return this.gifConfig;
    }

    public final FormatConfig getJpegConfig() {
        return this.jpegConfig;
    }

    public final FormatConfig getPngConfig() {
        return this.pngConfig;
    }

    public final FormatConfig getConfigByType(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -879267568) {
                if (hashCode != -879264467) {
                    if (hashCode == -879258763 && str.equals("image/png")) {
                        return this.pngConfig;
                    }
                } else if (str.equals("image/jpg")) {
                    return this.jpegConfig;
                }
            } else if (str.equals("image/gif")) {
                return this.gifConfig;
            }
        }
        return this.baseConfig;
    }

    public ImageSendConfig(FormatConfig formatConfig, FormatConfig formatConfig2, FormatConfig formatConfig3, FormatConfig formatConfig4) {
        Intrinsics.checkParameterIsNotNull(formatConfig, "baseConfig");
        Intrinsics.checkParameterIsNotNull(formatConfig2, "pngConfig");
        Intrinsics.checkParameterIsNotNull(formatConfig3, "jpegConfig");
        Intrinsics.checkParameterIsNotNull(formatConfig4, "gifConfig");
        this.baseConfig = formatConfig;
        this.pngConfig = formatConfig2;
        this.jpegConfig = formatConfig3;
        this.gifConfig = formatConfig4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageSendConfig(FormatConfig formatConfig, FormatConfig formatConfig2, FormatConfig formatConfig3, FormatConfig formatConfig4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new FormatConfig(0, null, 3, null) : formatConfig, (i & 2) != 0 ? new FormatConfig(0, new ResolutionSize(JosStatusCodes.RTN_CODE_COMMON_ERROR, JosStatusCodes.RTN_CODE_COMMON_ERROR), 1, null) : formatConfig2, (i & 4) != 0 ? new FormatConfig(0, new ResolutionSize(12000, 12000), 1, null) : formatConfig3, (i & 8) != 0 ? new FormatConfig(0, new ResolutionSize(7000, 7000), 1, null) : formatConfig4);
    }
}
