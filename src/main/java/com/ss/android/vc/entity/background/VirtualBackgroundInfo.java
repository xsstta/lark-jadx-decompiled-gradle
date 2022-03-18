package com.ss.android.vc.entity.background;

import java.io.Serializable;
import java.util.Objects;

public class VirtualBackgroundInfo implements Serializable {
    public FileStatus fileStatus;
    public boolean isBlur;
    public boolean isCustomize;
    public boolean isDisabled;
    public boolean isMiss;
    public boolean isUpload;
    public boolean isVideo;
    public String key = "";
    public MaterialSource materialSource;
    public String name;
    public String path;
    public String portraitPath;
    public String portraitThumbnail;
    public String thumbnail;
    public String trimLandscapePath;
    public String trimPath;
    public String trimPortraitPath;
    public String url;

    public String getPath() {
        return this.trimPath;
    }

    public static VirtualBackgroundInfo newBlur() {
        VirtualBackgroundInfo virtualBackgroundInfo = new VirtualBackgroundInfo();
        virtualBackgroundInfo.isBlur = true;
        virtualBackgroundInfo.name = "blur_my_background";
        return virtualBackgroundInfo;
    }

    public static VirtualBackgroundInfo newCustomized() {
        VirtualBackgroundInfo virtualBackgroundInfo = new VirtualBackgroundInfo();
        virtualBackgroundInfo.isCustomize = true;
        virtualBackgroundInfo.name = "customize_background";
        return virtualBackgroundInfo;
    }

    public static VirtualBackgroundInfo newDisabled() {
        VirtualBackgroundInfo virtualBackgroundInfo = new VirtualBackgroundInfo();
        virtualBackgroundInfo.isDisabled = true;
        virtualBackgroundInfo.name = "no_background";
        return virtualBackgroundInfo;
    }

    public static VirtualBackgroundInfo newUpload() {
        VirtualBackgroundInfo virtualBackgroundInfo = new VirtualBackgroundInfo();
        virtualBackgroundInfo.isUpload = true;
        virtualBackgroundInfo.name = "upload_background";
        return virtualBackgroundInfo;
    }

    public boolean needSelectedBorder() {
        if (this.isUpload || this.isCustomize) {
            return false;
        }
        return true;
    }

    public boolean isPreset() {
        if (this.isDisabled || this.isBlur || this.isUpload || this.isCustomize) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.url, this.path, this.name, Boolean.valueOf(this.isDisabled), Boolean.valueOf(this.isBlur), Boolean.valueOf(this.isUpload), Boolean.valueOf(this.isCustomize));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("VirtualBackgroundInfo{key='");
        sb.append(this.key);
        sb.append('\'');
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", portraitPath='");
        sb.append(this.portraitPath);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", isVideo=");
        sb.append(this.isVideo);
        sb.append(", thumbnail='");
        sb.append(this.thumbnail);
        sb.append('\'');
        sb.append(", portraitThumbnail='");
        sb.append(this.portraitThumbnail);
        sb.append('\'');
        sb.append(", isMiss=");
        sb.append(this.isMiss);
        sb.append(", isDisabled=");
        sb.append(this.isDisabled);
        sb.append(", isBlur=");
        sb.append(this.isBlur);
        sb.append(", isCustomize=");
        sb.append(this.isCustomize);
        sb.append(", isUpload=");
        sb.append(this.isUpload);
        sb.append(", trimPath='");
        sb.append(this.trimPath);
        sb.append('\'');
        sb.append(", trimLandscapePath='");
        sb.append(this.trimLandscapePath);
        sb.append('\'');
        sb.append(", trimPortraitPath='");
        sb.append(this.trimPortraitPath);
        sb.append('\'');
        sb.append(", fileStatus=");
        FileStatus fileStatus2 = this.fileStatus;
        if (fileStatus2 == null) {
            str = "null";
        } else {
            str = fileStatus2.name();
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualBackgroundInfo virtualBackgroundInfo = (VirtualBackgroundInfo) obj;
        if (!this.key.equals(virtualBackgroundInfo.key) || !this.url.equals(virtualBackgroundInfo.url) || !this.path.equals(virtualBackgroundInfo.path) || !this.name.equals(virtualBackgroundInfo.name) || this.isDisabled != virtualBackgroundInfo.isDisabled || this.isBlur != virtualBackgroundInfo.isBlur || this.isUpload != virtualBackgroundInfo.isUpload || this.isCustomize != virtualBackgroundInfo.isCustomize) {
            return false;
        }
        return true;
    }
}
