package com.bytedance.apm.impl;

import com.bytedance.apm.p124a.p127c.C2755a;
import com.bytedance.services.apm.api.AbstractC20701f;
import com.bytedance.services.apm.api.IMonitorLogManager;
import java.util.List;
import org.json.JSONObject;

public class MonitorLogManagerImpl implements IMonitorLogManager {
    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void deleteLegacyLogByIds(String str, String str2) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void getLegacyLog(long j, long j2, String str, AbstractC20701f fVar) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public List<JSONObject> getRecentUiActionRecords() {
        return C2755a.m11711a().mo11825b();
    }
}
