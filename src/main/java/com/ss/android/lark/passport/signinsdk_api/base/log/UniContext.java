package com.ss.android.lark.passport.signinsdk_api.base.log;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class UniContext implements Serializable {
    public static final UniContext CONTEXT_DEVICES = newInstance("devices", true);
    public static final UniContext CONTEXT_EMPTY = newInstance("unknown", true);
    public static final UniContext CONTEXT_GLOBAL = newInstance("global", true);
    public static final UniContext CONTEXT_QR_CODE = newInstance("qrCode", true);
    public static final UniContext CONTEXT_START_UP = newInstance("startUp", true);
    public static final UniContext CONTEXT_SWITCH = newInstance("switch", true);
    private String curCountryCode;
    private String curLoginEmail;
    private String curLoginPhone;
    private String curUserName;
    private String mCp;
    private String mMonitorScene;
    private OPTrace mOPTraceScene;
    private final Map<String, String> mOneSceneMonitorParams;
    private final Map<String, String> mOneTimeParams;
    private final Map<String, String> mPersistParams;
    private String mSubDomain;
    private String mTraceId;
    private String mUseId;

    public String getCp() {
        return this.mCp;
    }

    public String getCurCountryCode() {
        return this.curCountryCode;
    }

    public String getCurLoginEmail() {
        return this.curLoginEmail;
    }

    public String getCurLoginPhone() {
        return this.curLoginPhone;
    }

    public String getCurUserName() {
        return this.curUserName;
    }

    public String getMonitorScene() {
        return this.mMonitorScene;
    }

    public OPTrace getOPTraceScene() {
        return this.mOPTraceScene;
    }

    public String getSubDomain() {
        return this.mSubDomain;
    }

    public String getTraceId() {
        return this.mTraceId;
    }

    public String getUseId() {
        return this.mUseId;
    }

    public synchronized void clearOneSceneMonitorParams() {
        this.mOneSceneMonitorParams.clear();
    }

    public synchronized void clearOneTimeParams() {
        this.mOneTimeParams.clear();
    }

    public synchronized void clearPersistParams() {
        this.mPersistParams.clear();
    }

    public synchronized Map<String, Object> getOneSceneMonitorParams() {
        ArrayMap arrayMap;
        arrayMap = new ArrayMap();
        arrayMap.putAll(this.mOneSceneMonitorParams);
        return arrayMap;
    }

    public synchronized Map<String, Object> getOneTimeParams() {
        ArrayMap arrayMap;
        arrayMap = new ArrayMap();
        arrayMap.putAll(this.mOneTimeParams);
        return arrayMap;
    }

    public synchronized Map<String, Object> getPersistParams() {
        ArrayMap arrayMap;
        arrayMap = new ArrayMap();
        arrayMap.putAll(this.mPersistParams);
        return arrayMap;
    }

    public static UniContext emptyIfNull(UniContext uniContext) {
        if (uniContext != null) {
            return uniContext;
        }
        return CONTEXT_EMPTY;
    }

    public synchronized UniContext setCp(String str) {
        this.mCp = str;
        return this;
    }

    public synchronized void setCurLoginEmail(String str) {
        this.curLoginEmail = str;
    }

    public synchronized UniContext setCurLoginPhone(String str) {
        this.curLoginPhone = str;
        return this;
    }

    public synchronized UniContext setCurUserName(String str) {
        this.curUserName = str;
        return this;
    }

    public synchronized UniContext setUseId(String str) {
        this.mUseId = str;
        return this;
    }

    public synchronized void setCurCountryCode(String str) {
        this.curCountryCode = str;
        if (!TextUtils.isEmpty(str) && !str.startsWith("+")) {
            this.curCountryCode = "+".concat(this.curCountryCode);
        }
    }

    public static UniContext newInstance(String str, boolean z) {
        return new UniContext(str, z);
    }

    public static UniContext newMonitorContext(String str, OPTrace oPTrace) {
        return new UniContext(str, oPTrace);
    }

    public synchronized UniContext appendOneSceneMonitorParam(String str, String str2) {
        this.mOneSceneMonitorParams.put(str, str2);
        return this;
    }

    public synchronized UniContext appendOneTimeParam(String str, String str2) {
        this.mOneTimeParams.put(str, str2);
        return this;
    }

    public synchronized UniContext appendPersistParam(String str, String str2) {
        this.mPersistParams.put(str, str2);
        return this;
    }

    private UniContext(String str, OPTrace oPTrace) {
        this.mPersistParams = new HashMap();
        this.mOneTimeParams = new HashMap();
        this.curUserName = "";
        this.curLoginPhone = "";
        this.curCountryCode = "";
        this.curLoginEmail = "";
        this.mOneSceneMonitorParams = new HashMap();
        this.mTraceId = C49356a.m194396b();
        this.mMonitorScene = str;
        this.mOPTraceScene = oPTrace;
    }

    private UniContext(String str, boolean z) {
        this.mPersistParams = new HashMap();
        this.mOneTimeParams = new HashMap();
        this.curUserName = "";
        this.curLoginPhone = "";
        this.curCountryCode = "";
        this.curLoginEmail = "";
        this.mOneSceneMonitorParams = new HashMap();
        if (z) {
            this.mTraceId = C49356a.m194396b();
        }
        this.mSubDomain = str;
    }
}
