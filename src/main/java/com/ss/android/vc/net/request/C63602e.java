package com.ss.android.vc.net.request;

import com.alibaba.fastjson.JSON;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.vc.entity.VcMsgInfo;

/* renamed from: com.ss.android.vc.net.request.e */
public class C63602e {

    /* renamed from: a */
    public VcMsgInfo f160598a;

    /* renamed from: b */
    public ErrorResult f160599b;

    /* renamed from: c */
    public boolean f160600c = false;

    /* renamed from: d */
    private int f160601d;

    /* renamed from: e */
    private String f160602e;

    /* renamed from: f */
    private Exception f160603f = new Exception("unknown error");

    /* renamed from: a */
    public int mo219899a() {
        return this.f160601d;
    }

    /* renamed from: b */
    public String mo219902b() {
        return this.f160602e;
    }

    public String toString() {
        ErrorResult errorResult = this.f160599b;
        if (errorResult != null) {
            return errorResult.toString();
        }
        return "errorResult == null";
    }

    /* renamed from: a */
    public void mo219900a(int i) {
        this.f160601d = i;
    }

    /* renamed from: a */
    public void mo219901a(String str) {
        this.f160602e = str;
    }

    public C63602e(ErrorResult errorResult) {
        this.f160599b = errorResult;
        if (errorResult != null) {
            this.f160601d = errorResult.getErrorCode();
            this.f160602e = errorResult.getErrorMsg();
            this.f160603f = errorResult.getException();
            try {
                this.f160598a = (VcMsgInfo) JSON.parseObject(this.f160602e, VcMsgInfo.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
