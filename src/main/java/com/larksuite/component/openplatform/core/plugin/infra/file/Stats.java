package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.json.JSONObject;

public class Stats {
    private int lastAccessedTime;
    private int lastModifiedTime;
    private int mode;
    private int size;

    public long getLastAccessedTime() {
        return (long) this.lastAccessedTime;
    }

    public long getLastModifiedTime() {
        return (long) this.lastModifiedTime;
    }

    public long getSize() {
        return (long) this.size;
    }

    public int getMode() {
        return this.mode;
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mode", this.mode);
            jSONObject.put("size", this.size);
            jSONObject.put("lastAccessedTime", this.lastAccessedTime);
            jSONObject.put("lastModifiedTime", this.lastModifiedTime);
            return jSONObject;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "Stats", e.getStackTrace());
            return null;
        }
    }

    public static Stats getFileStats(String str) {
        if (!new File(str).exists()) {
            return null;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(20);
        if (!com.he.loader.Stats.getFileStatsInfo(str, allocateDirect)) {
            return null;
        }
        Stats stats = new Stats();
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        stats.mode = allocateDirect.getInt(0);
        stats.size = allocateDirect.getInt(4);
        stats.lastAccessedTime = allocateDirect.getInt(8);
        stats.lastModifiedTime = allocateDirect.getInt(12);
        return stats;
    }
}
