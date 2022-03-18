package com.bytedance.ee.bear.document.upload;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class TransmitPicsReq implements NonProguard {
    @JSONField(name = "infos")
    private ImageInfo[] imgs;
    @JSONField(name = "session_data")
    private String sessionData;
    private String token;
    private String uuid;

    public static class Data implements NonProguard {
        public String height;
        public String image_src;
        public String image_type;
        public long size;
        public String width;
    }

    public static class ImageInfo implements NonProguard {
        public String data;
        public String type = "IMAGE";
    }

    @JSONField(name = "infos")
    public ImageInfo[] getImgs() {
        return this.imgs;
    }

    @JSONField(name = "session_data")
    public String getSessionData() {
        return this.sessionData;
    }

    public String getToken() {
        return this.token;
    }

    public String getUuid() {
        return this.uuid;
    }

    @JSONField(name = "infos")
    public void setImgs(ImageInfo[] imageInfoArr) {
        this.imgs = imageInfoArr;
    }

    @JSONField(name = "session_data")
    public void setSessionData(String str) {
        this.sessionData = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public static String build(String str, String str2, String str3, List<C6278a> list) {
        TransmitPicsReq transmitPicsReq = new TransmitPicsReq();
        transmitPicsReq.token = str3;
        transmitPicsReq.uuid = str;
        transmitPicsReq.sessionData = str2;
        transmitPicsReq.imgs = new ImageInfo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C6278a aVar = list.get(i);
            ImageInfo imageInfo = new ImageInfo();
            Data data = new Data();
            data.image_src = aVar.f17402b;
            data.width = aVar.f17401a.getWidth() + "px";
            data.height = aVar.f17401a.getHeight() + "px";
            data.size = aVar.f17401a.getSize();
            data.image_type = aVar.mo25260a();
            imageInfo.data = JSON.toJSONString(data);
            transmitPicsReq.imgs[i] = imageInfo;
        }
        return JSON.toJSONString(transmitPicsReq);
    }
}
