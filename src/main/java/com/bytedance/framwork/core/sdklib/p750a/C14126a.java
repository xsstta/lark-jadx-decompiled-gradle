package com.bytedance.framwork.core.sdklib.p750a;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdklib.a.a */
public class C14126a implements AbstractC14127b {
    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public boolean getRemoveSwitch() {
        return false;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportCount() {
        return 100;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportFailRepeatBaseTime() {
        return 15;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportFailRepeatCount() {
        return 4;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportInterval() {
        return SmEvents.EVENT_NW;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public JSONObject reportJsonHeaderInfo() {
        return null;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public List<String> reportUrl(String str) {
        return null;
    }
}
