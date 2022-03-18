package com.ss.ugc.effectplatform.model;

import bytekn.foundation.io.file.IOException;
import com.ss.ugc.effectplatform.ErrorConstants;
import com.ss.ugc.effectplatform.exception.JsonException;
import com.ss.ugc.effectplatform.exception.MD5Exception;
import com.ss.ugc.effectplatform.exception.NetException;
import com.ss.ugc.effectplatform.exception.StatusCodeException;
import com.ss.ugc.effectplatform.exception.UnzipException;
import com.ss.ugc.effectplatform.exception.UrlNotExistException;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\tB;\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0017\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J\u0016\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006J$\u0010\u001a\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\bR\u0016\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "", "errorCode", "", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ILjava/lang/Exception;)V", "(I)V", "(Ljava/lang/Exception;)V", "requestUrl", "", "selectedHost", "remoteIp", "(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()I", "setErrorCode", "msg", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getException", "setException", "", "setTrackParams", "toString", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.c */
public final class ExceptionResult {

    /* renamed from: a */
    private int f164939a;

    /* renamed from: b */
    private String f164940b;

    /* renamed from: c */
    private Exception f164941c;

    /* renamed from: d */
    private String f164942d;

    /* renamed from: e */
    private String f164943e;

    /* renamed from: f */
    private String f164944f;

    /* renamed from: a */
    public final int mo227908a() {
        return this.f164939a;
    }

    /* renamed from: b */
    public final String mo227911b() {
        return this.f164940b;
    }

    /* renamed from: c */
    public final Exception mo227912c() {
        return this.f164941c;
    }

    public String toString() {
        if (this.f164941c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("ExceptionResult{errorCode=");
            sb.append(this.f164939a);
            sb.append(", msg='");
            sb.append(this.f164940b);
            sb.append('\'');
            sb.append(", requestUrl='");
            sb.append(this.f164942d);
            sb.append('\'');
            sb.append(", selectedHost='");
            sb.append(this.f164943e);
            sb.append('\'');
            sb.append(", remoteIp='");
            sb.append(this.f164944f);
            sb.append('\'');
            sb.append(", exception=");
            Exception exc = this.f164941c;
            if (exc == null) {
                Intrinsics.throwNpe();
            }
            sb.append(exc.getMessage());
            sb.append('}');
            return sb.toString();
        }
        return "ExceptionResult{errorCode=" + this.f164939a + ", msg='" + this.f164940b + ", requestUrl='" + this.f164942d + '\'' + ", selectedHost='" + this.f164943e + '\'' + ", remoteIp='" + this.f164944f + '\'' + '}';
    }

    public ExceptionResult(Exception exc) {
        this(exc, null, null, null);
    }

    /* renamed from: a */
    public final void mo227909a(String str) {
        this.f164940b = str;
    }

    public ExceptionResult(int i) {
        this.f164939a = -1;
        this.f164939a = i;
        this.f164940b = ErrorConstants.f164880a.mo227752a(i);
        this.f164941c = null;
    }

    public ExceptionResult(int i, Exception exc) {
        this.f164939a = -1;
        this.f164939a = i;
        this.f164940b = ErrorConstants.f164880a.mo227752a(i);
        this.f164941c = exc;
    }

    /* renamed from: a */
    public final void mo227910a(String str, String str2, String str3) {
        this.f164942d = str;
        this.f164943e = str2;
        this.f164944f = str3;
    }

    public ExceptionResult(Exception exc, String str, String str2, String str3) {
        int i;
        this.f164939a = -1;
        this.f164942d = str;
        this.f164943e = str2;
        this.f164944f = str3;
        this.f164941c = exc;
        if (exc instanceof NetException) {
            this.f164939a = ((NetException) exc).getStatus_code();
            this.f164940b = exc.getMessage();
        } else if (exc instanceof StatusCodeException) {
            this.f164939a = ((StatusCodeException) exc).getStatusCode();
            this.f164940b = exc.getMessage();
        } else if (exc instanceof JsonException) {
            this.f164939a = 10008;
            this.f164940b = exc.getMessage();
        } else if (exc instanceof UrlNotExistException) {
            this.f164939a = 10015;
            this.f164940b = exc.getMessage();
        } else if (exc instanceof UnzipException) {
            this.f164939a = 10013;
            this.f164940b = exc.getMessage();
        } else if (exc instanceof MD5Exception) {
            this.f164939a = 10010;
            this.f164940b = exc.getMessage();
        } else if (exc instanceof IOException) {
            this.f164939a = 10012;
            this.f164940b = exc.getMessage();
        } else {
            boolean z = true;
            if (exc != null) {
                if (Intrinsics.areEqual("network unavailable", exc.getMessage())) {
                    i = 10011;
                } else {
                    i = 10005;
                }
                this.f164939a = i;
                String message = exc.getMessage();
                this.f164940b = message;
                String str4 = message;
                if (!(str4 == null || str4.length() == 0)) {
                    z = false;
                }
                if (z) {
                    this.f164940b = exc.toString();
                    return;
                }
                return;
            }
            this.f164939a = 1;
            this.f164940b = ErrorConstants.f164880a.mo227752a(this.f164939a);
        }
    }
}
