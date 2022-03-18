package com.ss.android.lark.openapi.permission.http;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.http.model.BaseResponseModel;
import com.ss.android.lark.http.model.ErrorResult;
import com.ss.android.lark.http.okhttp.AbstractC38775a;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.ss.android.lark.openapi.permission.http.a */
public class C48769a implements AbstractC38775a {

    /* renamed from: a */
    private static int f122535a = 200;

    /* renamed from: b */
    private static int f122536b = 204;

    /* renamed from: c */
    private static int f122537c = 205;

    /* renamed from: d */
    private static int f122538d = 300;

    /* renamed from: e */
    private static int f122539e = 400;

    /* renamed from: f */
    private static int f122540f = 401;

    /* renamed from: g */
    private static int f122541g = 500;

    /* renamed from: h */
    private static int f122542h = 600;

    /* renamed from: i */
    private static int f122543i = 900;

    /* renamed from: j */
    private static AbstractC48770a f122544j;

    /* renamed from: com.ss.android.lark.openapi.permission.http.a$a */
    public interface AbstractC48770a {
        /* renamed from: a */
        void mo170346a(String str);
    }

    /* renamed from: a */
    private BaseResponseModel m192109a(Response response) {
        try {
            String string = response.body().string();
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return (BaseResponseModel) JSONObject.parseObject(string, BaseResponseModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.lark.http.okhttp.AbstractC38775a
    /* renamed from: a */
    public ErrorResult mo142134a(Request request, Response response, String str) {
        int code = response.code();
        if (code == f122540f) {
            AbstractC48770a aVar = f122544j;
            if (aVar != null) {
                aVar.mo170346a(str);
            }
            return new ErrorResult(-2, code, String.format("session expired，need login", new Object[0]));
        } else if (code < f122541g || code >= f122542h) {
            return null;
        } else {
            BaseResponseModel a = m192109a(response);
            if (a != null) {
                return new ErrorResult(-3, code, a.getErrorMessage());
            }
            return new ErrorResult(-2, code, "http status code:" + code + " " + "server error");
        }
    }
}
