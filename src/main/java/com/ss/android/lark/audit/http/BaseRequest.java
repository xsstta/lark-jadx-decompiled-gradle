package com.ss.android.lark.audit.http;

import android.util.SparseArray;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.C29304b;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;

public abstract class BaseRequest<T> implements IRequest {
    private SparseArray<Class> mCustomClasses = new SparseArray<>();
    protected AbstractC29335d mHttpExecutor = new C29337f();
    private AbstractC49347c mICancelable;
    private int reTryNum = 1;

    @Override // com.ss.android.lark.audit.http.IRequest
    public HttpHeaders buildHeaders(HttpHeaders httpHeaders) {
        return httpHeaders;
    }

    public int getReTryNum() {
        return this.reTryNum;
    }

    public void tryNumAdd() {
        this.reTryNum++;
    }

    @Override // com.ss.android.lark.audit.http.IRequest
    public HttpHeaders getHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("Content-Type", "application/json;charset=utf-8");
        AbstractC29324f d = C29304b.m107713a().mo103858d();
        if (d != null) {
            httpHeaders.put("Suite-Session-Key", d.mo103869b());
        }
        return httpHeaders;
    }

    @Override // com.ss.android.lark.audit.http.IRequest
    public void request(AbstractC29334c cVar) {
        AbstractC29335d dVar = this.mHttpExecutor;
        if (dVar != null) {
            dVar.mo103920a(this, cVar);
        }
    }
}
