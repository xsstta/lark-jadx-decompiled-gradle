package com.ss.android.lark.mm.statistics.monitor.recording;

import com.ss.android.lark.mm.module.record.upload.model.C46974a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.monitor.MmMonitorCategory;
import com.ss.android.lark.mm.statistics.monitor.MmMonitorUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class MmAudioMonitor {

    /* renamed from: a */
    public static final MmAudioMonitor f118586a = new MmAudioMonitor();

    public enum RecordingStage {
        CLICK_BUTTON(0),
        BEGIN_RECORD_ENGINE(1),
        ENCODE(2),
        WRITE_PART(3),
        UPLOAD_PART(4),
        TRANSFER_TO_STOPPED_STATUS(5),
        TRANSFER_TO_UPLOADED_STATUS(6);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private RecordingStage(int i) {
            this.value = i;
        }
    }

    private MmAudioMonitor() {
    }

    /* renamed from: a */
    public final void mo165446a(boolean z, String str, Integer num, Integer num2) {
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.WRITE_PART.getValue());
        jSONObject.put("isSucceed", z);
        if (str != null) {
            jSONObject.put("error_msg", str);
        }
        if (num != null) {
            num.intValue();
            jSONObject.put("segment_index", num.intValue());
        }
        if (num2 != null) {
            num2.intValue();
            jSONObject.put("segment_index", num);
        }
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: a */
    public final void mo165447a(boolean z, String str, String str2, Integer num) {
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.TRANSFER_TO_STOPPED_STATUS.getValue());
        jSONObject.put("isSucceed", z);
        if (str2 != null) {
            jSONObject.put("error_msg", str2);
        }
        if (num != null) {
            jSONObject.put("error_code", num.intValue());
        }
        if (str != null) {
            jSONObject.put("object_token", str);
        }
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: a */
    public final void mo165442a() {
        C45855f.m181664c("MmAudioMonitor", "[monitorClickAudioButton]");
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.CLICK_BUTTON.getValue());
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: b */
    public final void mo165448b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "errorMessage");
        C45855f.m181664c("MmAudioMonitor", "[monitorStartAudioFailed]");
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.CLICK_BUTTON.getValue());
        jSONObject.put("isSucceed", false);
        jSONObject.put("error_msg", str);
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: a */
    public final void mo165443a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        C45855f.m181664c("MmAudioMonitor", "[monitorStartAudioSucceed]");
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.CLICK_BUTTON.getValue());
        jSONObject.put("isSucceed", true);
        jSONObject.put("object_token", str);
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: b */
    public final void mo165449b(boolean z, String str) {
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.ENCODE.getValue());
        jSONObject.put("isSucceed", z);
        if (str != null) {
            jSONObject.put("error_msg", str);
        }
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: a */
    public final void mo165445a(boolean z, String str) {
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.BEGIN_RECORD_ENGINE.getValue());
        jSONObject.put("isSucceed", z);
        if (str != null) {
            jSONObject.put("error_msg", str);
        }
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: b */
    public final void mo165450b(boolean z, String str, String str2, Integer num) {
        MmMonitorUtils aVar = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.TRANSFER_TO_UPLOADED_STATUS.getValue());
        jSONObject.put("isSucceed", z);
        if (str2 != null) {
            jSONObject.put("error_msg", str2);
        }
        if (num != null) {
            jSONObject.put("error_code", num.intValue());
        }
        if (str != null) {
            jSONObject.put("object_token", str);
        }
        aVar.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: a */
    public final void mo165444a(boolean z, C46974a aVar, String str, Integer num) {
        Intrinsics.checkParameterIsNotNull(aVar, "uploadRequest");
        MmMonitorUtils aVar2 = MmMonitorUtils.f118585a;
        MmMonitorCategory mmMonitorCategory = MmMonitorCategory.RECORDING;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", RecordingStage.UPLOAD_PART.getValue());
        jSONObject.put("isSucceed", z);
        if (str != null) {
            jSONObject.put("error_msg", str);
        }
        if (num != null) {
            jSONObject.put("error_code", num.intValue());
        }
        jSONObject.put("segment_index", aVar.mo164937d());
        jSONObject.put("duration", aVar.mo164935c());
        jSONObject.put("lang", aVar.mo164940f());
        jSONObject.put("startMs", aVar.mo164932b());
        jSONObject.put("object_token", aVar.mo164928a());
        aVar2.mo165439a(mmMonitorCategory, jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m186475a(MmAudioMonitor mmAudioMonitor, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        mmAudioMonitor.mo165445a(z, str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m186478b(MmAudioMonitor mmAudioMonitor, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        mmAudioMonitor.mo165449b(z, str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m186474a(MmAudioMonitor mmAudioMonitor, boolean z, C46974a aVar, String str, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        mmAudioMonitor.mo165444a(z, aVar, str, num);
    }

    /* renamed from: b */
    public static /* synthetic */ void m186479b(MmAudioMonitor mmAudioMonitor, boolean z, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        mmAudioMonitor.mo165450b(z, str, str2, num);
    }

    /* renamed from: a */
    public static /* synthetic */ void m186476a(MmAudioMonitor mmAudioMonitor, boolean z, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        mmAudioMonitor.mo165446a(z, str, num, num2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m186477a(MmAudioMonitor mmAudioMonitor, boolean z, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        mmAudioMonitor.mo165447a(z, str, str2, num);
    }
}
