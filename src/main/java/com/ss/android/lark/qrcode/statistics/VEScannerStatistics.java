package com.ss.android.lark.qrcode.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.qrcode.QRCodeModule;
import com.ss.android.lark.qrcode.ui.QRCodeScanActivity;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\f\u0010\r\u001a\u00020\u000e*\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/qrcode/statistics/VEScannerStatistics;", "", "()V", "sendFirstFrameCost", "", "cost", "", "sendOnOpen", "sendSuccessFrameCount", "frameCount", "", "sendSuccessScanTimeConsuming", "time", "appendVESDKEnabled", "Lorg/json/JSONObject;", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.qrcode.b.b */
public final class VEScannerStatistics {
    /* renamed from: a */
    public final void mo180853a() {
        Statistics.sendEvent("qrcode_open_scan_dev", m204974a(new JSONObject()));
    }

    /* renamed from: a */
    private final JSONObject m204974a(JSONObject jSONObject) {
        JSONObject put = jSONObject.put("vesdk_enabled", "true");
        Intrinsics.checkExpressionValueIsNotNull(put, "put(Conf.Param.VESDK_ENABLED, \"true\")");
        return put;
    }

    /* renamed from: a */
    public final void mo180854a(int i) {
        String a = QRCodeModule.f130791c.mo180846a();
        Log.m165389i(a, "scan success need frame count: " + i);
        JSONObject put = new JSONObject().put("frames", i);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Conf.Param.FRAMES, frameCount)");
        Statistics.sendEvent("scan_qrcode_frame", m204974a(put));
    }

    /* renamed from: b */
    public final void mo180856b(long j) {
        String a = QRCodeModule.f130791c.mo180846a();
        Log.m165389i(a, "get first frame at time: " + System.currentTimeMillis());
        JSONObject put = new JSONObject().put("cost_time_int", j);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Conf.Param.COST_TIME_INT, cost)");
        Statistics.sendEvent("scan_qrcode_first_frame_time", m204974a(put));
        QRCodeScanActivity.m204982a(j);
    }

    /* renamed from: a */
    public final void mo180855a(long j) {
        String a = QRCodeModule.f130791c.mo180846a();
        Log.m165389i(a, "scan success at time: " + System.currentTimeMillis());
        JSONObject put = new JSONObject().put("time_consuming", j);
        Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(Conf.Param.TIME_CONSUMING, time)");
        Statistics.sendEvent("qrcode_success_scan", m204974a(put));
    }
}
