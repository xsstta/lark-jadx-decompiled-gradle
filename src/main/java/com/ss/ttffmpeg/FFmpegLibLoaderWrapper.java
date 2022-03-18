package com.ss.ttffmpeg;

import java.util.ArrayList;
import java.util.List;

public final class FFmpegLibLoaderWrapper {
    public static synchronized String getFFmpegVersion() {
        synchronized (FFmpegLibLoaderWrapper.class) {
        }
        return "1.1.56.10-lark";
    }

    /* renamed from: a */
    public static List<String> m256493a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ttcrypto");
        arrayList.add("ttboringssl");
        arrayList.add("ttffmpeg");
        return arrayList;
    }
}
