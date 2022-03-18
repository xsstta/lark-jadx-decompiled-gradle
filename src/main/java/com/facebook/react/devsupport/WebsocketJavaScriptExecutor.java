package com.facebook.react.devsupport;

import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.devsupport.C21124c;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class WebsocketJavaScriptExecutor implements JavaJSExecutor {

    /* renamed from: a */
    public C21124c f51503a;

    /* renamed from: b */
    private final HashMap<String, String> f51504b;

    /* renamed from: com.facebook.react.devsupport.WebsocketJavaScriptExecutor$1 */
    class C211171 {
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void close() {
        C21124c cVar = this.f51503a;
        if (cVar != null) {
            cVar.mo71814a();
        }
    }

    /* renamed from: com.facebook.react.devsupport.WebsocketJavaScriptExecutor$a */
    private static class C21118a implements C21124c.AbstractC21125a {

        /* renamed from: a */
        private final Semaphore f51505a;

        /* renamed from: b */
        private Throwable f51506b;

        /* renamed from: c */
        private String f51507c;

        private C21118a() {
            this.f51505a = new Semaphore(0);
        }

        /* renamed from: a */
        public String mo71793a() throws Throwable {
            this.f51505a.acquire();
            Throwable th = this.f51506b;
            if (th == null) {
                return this.f51507c;
            }
            throw th;
        }

        /* synthetic */ C21118a(C211171 r1) {
            this();
        }

        @Override // com.facebook.react.devsupport.C21124c.AbstractC21125a
        /* renamed from: a */
        public void mo71794a(String str) {
            this.f51507c = str;
            this.f51505a.release();
        }

        @Override // com.facebook.react.devsupport.C21124c.AbstractC21125a
        /* renamed from: a */
        public void mo71795a(Throwable th) {
            this.f51506b = th;
            this.f51505a.release();
        }
    }

    public static class WebsocketExecutorTimeoutException extends Exception {
        public WebsocketExecutorTimeoutException(String str) {
            super(str);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void loadApplicationScript(String str) throws JavaJSExecutor.ProxyExecutorException {
        C21118a aVar = new C21118a(null);
        ((C21124c) C21045a.m76676a(this.f51503a)).mo71816a(str, this.f51504b, aVar);
        try {
            aVar.mo71793a();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void setGlobalVariable(String str, String str2) {
        this.f51504b.put(str, str2);
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public String executeJSCall(String str, String str2) throws JavaJSExecutor.ProxyExecutorException {
        C21118a aVar = new C21118a(null);
        ((C21124c) C21045a.m76676a(this.f51503a)).mo71815a(str, str2, aVar);
        try {
            return aVar.mo71793a();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }
}
