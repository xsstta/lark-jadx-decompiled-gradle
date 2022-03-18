package com.ss.ttvideoengine.log;

import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class NoAVRenderEvent {
    private long duration;
    private boolean isStopped = true;
    private long startTime;
    private final int type;

    public boolean isStopped() {
        return this.isStopped;
    }

    public boolean isVideo() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public void start() {
        this.isStopped = false;
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        if (!this.isStopped) {
            this.isStopped = true;
            this.duration = System.currentTimeMillis() - this.startTime;
        }
    }

    public String toJsonString() {
        if (!isStopped()) {
            TTVideoEngineLog.m256500d("NoAVRenderEvent", "stop before generate json");
            stop();
        }
        return toString();
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("st", Long.valueOf(this.startTime));
        hashMap.put(C60375c.f150914a, Long.valueOf(this.duration));
        return new JSONObject(hashMap).toString();
    }

    public NoAVRenderEvent(int i) {
        this.type = i;
    }

    public static void addToCorrespondList(NoAVRenderEvent noAVRenderEvent, List<String> list, List<String> list2) {
        if (noAVRenderEvent != null) {
            String jsonString = noAVRenderEvent.toJsonString();
            if (noAVRenderEvent.isVideo()) {
                if (list2 != null) {
                    list2.add(jsonString);
                }
            } else if (list != null) {
                list.add(jsonString);
            }
            TTVideoEngineLog.m256500d("NoAVRenderEvent", jsonString);
        }
    }
}
