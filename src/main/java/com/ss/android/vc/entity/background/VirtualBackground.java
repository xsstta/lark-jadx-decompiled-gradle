package com.ss.android.vc.entity.background;

import java.io.Serializable;

public class VirtualBackground implements Serializable {
    public boolean isVideo;
    public String name;
    public String portraitUrl;
    public MaterialSource source;
    public String url;

    public VirtualBackground(String str, String str2, String str3, boolean z, MaterialSource materialSource) {
        this.url = str;
        this.portraitUrl = str2;
        this.name = str3;
        this.isVideo = z;
        this.source = materialSource;
    }
}
