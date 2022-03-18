package com.ss.ttvideoengine.download;

import java.util.Map;

public interface IDownloadVidTaskListener {
    String apiString(Map<String, String> map, String str, int i);

    String authString(String str, int i);
}
