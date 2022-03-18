package com.he.v8_inspect;

import android.content.Context;
import com.he.v8_inspect.server.SocketLike;
import com.he.v8_inspect.server.http.ExactPathMatcher;
import com.he.v8_inspect.server.http.HandlerRegistry;
import com.he.v8_inspect.server.http.HttpHandler;
import com.he.v8_inspect.server.http.LightHttpBody;
import com.he.v8_inspect.server.http.LightHttpRequest;
import com.he.v8_inspect.server.http.LightHttpResponse;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import ee.android.framework.manis.p3450a.C68182c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ChromeDiscoveryHandler implements HttpHandler {
    private final Context mContext;
    private final List<InspectTarget> mInspectTargets = new ArrayList();
    private LightHttpBody mVersionResponse;

    public ChromeDiscoveryHandler(Context context) {
        this.mContext = context;
    }

    public void removeInspectTarget(InspectTarget inspectTarget) {
        synchronized (this.mInspectTargets) {
            this.mInspectTargets.remove(inspectTarget);
        }
    }

    public void addInspectTarget(InspectTarget inspectTarget) {
        synchronized (this.mInspectTargets) {
            if (!this.mInspectTargets.contains(inspectTarget)) {
                this.mInspectTargets.add(inspectTarget);
            }
        }
    }

    public void register(HandlerRegistry handlerRegistry) {
        handlerRegistry.register(new ExactPathMatcher("/json"), this);
        handlerRegistry.register(new ExactPathMatcher("/json/version"), this);
    }

    private void handleVersion(LightHttpResponse lightHttpResponse) throws JSONException {
        if (this.mVersionResponse == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Browser", "JsBinding Debugger");
            jSONObject.put("Protocol-Version", "1.3");
            jSONObject.put("Android-Package", C68182c.m264834a(this.mContext));
            jSONObject.put("V8-Version", "7.2.1");
            this.mVersionResponse = LightHttpBody.create(jSONObject.toString(), "application/json");
        }
        setSuccessfulResponse(lightHttpResponse, this.mVersionResponse);
    }

    private void handlePageList(LightHttpResponse lightHttpResponse) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.mInspectTargets) {
            for (int i = 0; i < this.mInspectTargets.size(); i++) {
                InspectTarget inspectTarget = this.mInspectTargets.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ShareHitPoint.f121869d, "page");
                jSONObject.put("title", inspectTarget.getDisplayName());
                jSONObject.put("id", "" + i);
                jSONObject.put("description", "");
                jSONObject.put("webSocketDebuggerUrl", "ws://" + inspectTarget.getInspectorPath());
                jSONObject.put("devtoolsFrontendUrl", "/devtools/inspector.html?ws=" + inspectTarget.getInspectorPath());
                jSONArray.put(jSONObject);
            }
        }
        setSuccessfulResponse(lightHttpResponse, LightHttpBody.create(jSONArray.toString(), "application/json"));
    }

    private static void setSuccessfulResponse(LightHttpResponse lightHttpResponse, LightHttpBody lightHttpBody) {
        lightHttpResponse.code = LocationRequest.PRIORITY_HD_ACCURACY;
        lightHttpResponse.reasonPhrase = "OK";
        lightHttpResponse.body = lightHttpBody;
    }

    @Override // com.he.v8_inspect.server.http.HttpHandler
    public boolean handleRequest(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) throws IOException {
        String path = lightHttpRequest.uri.getPath();
        try {
            if ("/json/version".equals(path)) {
                handleVersion(lightHttpResponse);
                return true;
            } else if ("/json".equals(path)) {
                handlePageList(lightHttpResponse);
                return true;
            } else {
                lightHttpResponse.code = 501;
                lightHttpResponse.reasonPhrase = "Not implemented";
                lightHttpResponse.body = LightHttpBody.create("No support for " + path + "\n", "text/plain");
                return true;
            }
        } catch (JSONException e) {
            lightHttpResponse.code = ParticipantRepo.f117150c;
            lightHttpResponse.reasonPhrase = "Internal server error";
            lightHttpResponse.body = LightHttpBody.create(e.toString() + "\n", "text/plain");
            return true;
        }
    }
}
