package com.ss.android.lark.inno.network.model;

import com.ss.android.lark.inno.network.VcLiveResponse;
import java.io.Serializable;
import java.util.List;

public class LiveStreamInfoData implements Serializable {
    public List<C38934a> channelList;

    public static class LiveStreamInfoDataResp extends VcLiveResponse<LiveStreamInfoData> {
    }

    public static class StreamInfoLineListDTO implements Serializable {
        public int defaultResolution;
        public boolean isBackup;
        public List<C38936c> pullURLList;
    }

    /* renamed from: com.ss.android.lark.inno.network.model.LiveStreamInfoData$a */
    public static class C38934a {

        /* renamed from: a */
        public boolean f100025a;

        /* renamed from: b */
        public boolean f100026b;

        /* renamed from: c */
        public int f100027c;

        /* renamed from: d */
        public List<StreamInfoLineListDTO> f100028d;
    }

    /* renamed from: com.ss.android.lark.inno.network.model.LiveStreamInfoData$b */
    public static class C38935b {

        /* renamed from: a */
        public String f100029a;

        /* renamed from: b */
        public String f100030b;

        /* renamed from: c */
        public String f100031c;

        /* renamed from: d */
        public String f100032d;

        /* renamed from: e */
        public String f100033e;
    }

    /* renamed from: com.ss.android.lark.inno.network.model.LiveStreamInfoData$c */
    public static class C38936c {

        /* renamed from: a */
        public C38935b f100034a;

        /* renamed from: b */
        public int f100035b;

        /* renamed from: c */
        public int f100036c;
    }
}
