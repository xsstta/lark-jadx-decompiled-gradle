package com.ss.android.ugc.effectmanager.common.p3052g;

import android.accounts.NetworkErrorException;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.ugc.effectmanager.common.C60508c;
import com.ss.android.ugc.effectmanager.common.exception.MD5Exception;
import com.ss.android.ugc.effectmanager.common.exception.NetException;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.ss.android.ugc.effectmanager.common.exception.UrlNotExistException;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.effectmanager.common.g.c */
public class C60519c {

    /* renamed from: a */
    private int f151314a;

    /* renamed from: b */
    private String f151315b;

    /* renamed from: c */
    private Exception f151316c;

    /* renamed from: d */
    private String f151317d;

    /* renamed from: e */
    private String f151318e;

    /* renamed from: f */
    private String f151319f;

    /* renamed from: a */
    public String mo207217a() {
        return this.f151315b;
    }

    /* renamed from: b */
    public Exception mo207220b() {
        return this.f151316c;
    }

    /* renamed from: c */
    public int mo207221c() {
        return this.f151314a;
    }

    public String toString() {
        if (this.f151316c != null) {
            return "ExceptionResult{errorCode=" + this.f151314a + ", msg='" + this.f151315b + '\'' + ", requestUrl='" + this.f151317d + '\'' + ", selectedHost='" + this.f151318e + '\'' + ", remoteIp='" + this.f151319f + '\'' + ", exception=" + this.f151316c.getMessage() + '}';
        }
        return "ExceptionResult{errorCode=" + this.f151314a + ", msg='" + this.f151315b + ", requestUrl='" + this.f151317d + '\'' + ", selectedHost='" + this.f151318e + '\'' + ", remoteIp='" + this.f151319f + '\'' + '}';
    }

    public C60519c(Exception exc) {
        this(exc, null, null, null);
    }

    /* renamed from: a */
    public void mo207218a(String str) {
        this.f151315b = str;
    }

    public C60519c(int i) {
        this.f151314a = -1;
        this.f151314a = i;
        this.f151315b = C60508c.m235159a(i);
        this.f151316c = null;
    }

    public C60519c(int i, Exception exc) {
        this.f151314a = -1;
        this.f151314a = i;
        this.f151315b = C60508c.m235159a(i);
        this.f151316c = exc;
    }

    /* renamed from: a */
    public void mo207219a(String str, String str2, String str3) {
        this.f151317d = str;
        this.f151318e = str2;
        this.f151319f = str3;
    }

    public C60519c(Exception exc, String str, String str2, String str3) {
        this.f151314a = -1;
        this.f151317d = str;
        this.f151318e = str2;
        this.f151319f = str3;
        this.f151316c = exc;
        if (exc instanceof NetException) {
            this.f151314a = ((NetException) exc).getStatus_code();
            this.f151315b = exc.getMessage();
        } else if (exc instanceof StatusCodeException) {
            this.f151314a = ((StatusCodeException) exc).getStatusCode();
            this.f151315b = exc.getMessage();
        } else if (exc instanceof JSONException) {
            this.f151314a = 10008;
            this.f151315b = exc.getMessage();
        } else if (exc instanceof NetworkErrorException) {
            this.f151314a = UpdateDialogStatusCode.SHOW;
            this.f151315b = exc.getMessage();
        } else if (exc instanceof UrlNotExistException) {
            this.f151314a = 10015;
            this.f151315b = exc.getMessage();
        } else if (exc instanceof UnzipException) {
            this.f151314a = 10013;
            this.f151315b = exc.getMessage();
        } else if (exc instanceof MD5Exception) {
            this.f151314a = 10010;
            this.f151315b = exc.getMessage();
        } else if (exc instanceof IOException) {
            this.f151314a = 10012;
            this.f151315b = exc.getMessage();
        } else if (exc != null) {
            if ("network unavailable".equals(exc.getMessage())) {
                this.f151314a = 10011;
            } else {
                this.f151314a = 10005;
            }
            this.f151315b = exc.getMessage();
        } else {
            this.f151314a = 1;
            this.f151315b = C60508c.m235159a(1);
        }
    }
}
