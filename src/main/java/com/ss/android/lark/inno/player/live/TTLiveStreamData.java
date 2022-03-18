package com.ss.android.lark.inno.player.live;

import android.util.ArrayMap;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.inno.network.model.C38938a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TTLiveStreamData implements Serializable {
    public C39020a common = new C39020a();
    public Map<String, PullURLS> data = new ArrayMap();

    public static class LiveCommonAuto implements Serializable {
        @JSONField(name = "default")
        public String default_resolution = "hd";
        public LiveCommonAutoDemotion demotion = new LiveCommonAutoDemotion();
        public int enable;
        public List<String> list = new ArrayList();
        public String strategy = "rad";
    }

    public static class LiveCommonAutoDemotion implements Serializable {
        public int stall_count;
    }

    public static class PullURLS implements Serializable {
        public URLData backup;
        public URLData main;
    }

    public static class URLData implements Serializable {
        public String cmaf;
        public String dash;
        public String flv;
        public String hls;
        public URLDataSdkParams sdk_params = new URLDataSdkParams();
    }

    public static class URLDataSdkParams implements Serializable {
        public long GopDuration;
        public String VCodec = "h264";
        public long vbitrate;
    }

    /* renamed from: com.ss.android.lark.inno.player.live.TTLiveStreamData$a */
    public static class C39020a {

        /* renamed from: a */
        public LiveCommonAuto f100218a;
    }

    public static String mapResolution(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "sd" : "ld" : "hd" : "uhd" : "origin";
    }

    public static URLData toURLData(C38938a.C38939a aVar) {
        if (aVar == null) {
            return null;
        }
        URLData uRLData = new URLData();
        uRLData.flv = aVar.f100044c;
        uRLData.hls = aVar.f100045d;
        return uRLData;
    }

    public PullURLS getPullURLSAndCreate(String str) {
        if (this.data.get(str) == null) {
            this.data.put(str, new PullURLS());
        }
        return this.data.get(str);
    }

    public static TTLiveStreamData toLiveStreamData(C38938a aVar) {
        if (aVar == null) {
            return null;
        }
        TTLiveStreamData tTLiveStreamData = new TTLiveStreamData();
        if (aVar.f100041e != null) {
            for (C38938a.C38939a aVar2 : aVar.f100041e.f100051c) {
                tTLiveStreamData.getPullURLSAndCreate(mapResolution(aVar2.f100042a)).main = toURLData(aVar2);
                tTLiveStreamData.getPullURLSAndCreate(mapResolution(aVar2.f100042a)).main.sdk_params.vbitrate = (long) aVar2.f100043b;
            }
        }
        if (aVar.f100040d != null) {
            for (C38938a.C38939a aVar3 : aVar.f100040d.f100051c) {
                tTLiveStreamData.getPullURLSAndCreate(mapResolution(aVar3.f100042a)).backup = toURLData(aVar3);
            }
        }
        tTLiveStreamData.common.f100218a = new LiveCommonAuto();
        tTLiveStreamData.common.f100218a.enable = 0;
        tTLiveStreamData.common.f100218a.default_resolution = mapResolution(aVar.f100037a);
        tTLiveStreamData.common.f100218a.list = Arrays.asList("hd", "ld", "uhd");
        tTLiveStreamData.common.f100218a.demotion.stall_count = 5;
        return tTLiveStreamData;
    }

    public URLData getURLDataAndCreate(String str, boolean z) {
        PullURLS pullURLS = this.data.get(str);
        if (pullURLS == null) {
            return null;
        }
        if (z) {
            if (pullURLS.main == null) {
                pullURLS.main = new URLData();
            }
            return pullURLS.main;
        }
        if (pullURLS.backup == null) {
            pullURLS.backup = new URLData();
        }
        return pullURLS.backup;
    }
}
