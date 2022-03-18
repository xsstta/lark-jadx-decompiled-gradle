package com.bytedance.crash.runtime;

import android.content.Context;
import com.bytedance.crash.ICommonParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.runtime.h */
public class C3856h {
    /* renamed from: a */
    public static C3850d m15985a(Context context) {
        return new C3850d(context, new ICommonParams() {
            /* class com.bytedance.crash.runtime.C3856h.C38571 */

            @Override // com.bytedance.crash.ICommonParams
            public String getDeviceId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public List<String> getPatchInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public String getSessionId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public long getUserId() {
                return 0;
            }

            @Override // com.bytedance.crash.ICommonParams
            public Map<String, Object> getCommonParams() {
                return new HashMap();
            }
        });
    }
}
