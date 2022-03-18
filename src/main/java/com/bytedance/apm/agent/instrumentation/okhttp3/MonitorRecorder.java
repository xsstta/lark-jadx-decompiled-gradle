package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.p139e.C2922b;
import com.bytedance.apm.p139e.C2925e;
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

public class MonitorRecorder {
    public static void reportExceptionMonitor(TransactionState transactionState, Exception exc) {
    }

    public static void reportMonitorData(TransactionState transactionState, Response response) {
        if (transactionState != null && response != null) {
            reportMonitorData(transactionState, "okhttp");
        }
    }

    public static void recordResponse(Response response, TransactionState transactionState) {
        if (response != null && transactionState != null) {
            transactionState.setStatusCode(response.code());
            if (response.body() != null) {
                transactionState.setBytesReceived(response.body().contentLength());
            }
        }
    }

    public static void recordRequest(Request request, TransactionState transactionState) {
        boolean z;
        if (request != null && transactionState != null) {
            transactionState.addAssistData("NetworkLib", "OkHttp3");
            transactionState.setUrl(request.url().toString());
            transactionState.setMethod(request.method());
            transactionState.setStartTime(System.currentTimeMillis());
            transactionState.setCarrier("");
            transactionState.setWanType("");
            RequestBody body = request.body();
            if (body != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            if (body instanceof FormBody) {
                transactionState.setBytesSent(((FormBody) body).contentLength());
            } else if (body instanceof MultipartBody) {
                try {
                    transactionState.setBytesSent(body.contentLength());
                } catch (IOException e) {
                    Log.d("TransactionData:", "can not get MultipartBody content length", e);
                }
            }
        }
    }

    public static void reportMonitorData(TransactionState transactionState, String str) {
        long j;
        if (transactionState != null) {
            TransactionData end = transactionState.end();
            if (C2785b.m11769j()) {
                String str2 = C2922b.f9432g;
                C2925e.m12374c(str2, "auto plugin, reportMonitorData: " + end.toString());
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sent_bytes", end.getBytesSent());
                jSONObject2.put("received_bytes", end.getBytesReceived());
                jSONObject.put("response", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("request_log", jSONObject);
                jSONObject3.put("net_consume_type", str);
                long totalTime = end.getTotalTime();
                if (transactionState.getStartTime() == 0) {
                    j = end.getRequestStart();
                } else {
                    j = transactionState.getStartTime();
                }
                MonitorTool.monitorSLA(totalTime, j, end.getUrl(), "", "", end.getStatusCode(), jSONObject3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
