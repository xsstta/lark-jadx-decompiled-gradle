package com.ss.android.lark.inno.network.p1971a;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.http.response.ErrorResult;
import com.ss.android.lark.inno.network.VcLiveResponse;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.lark.inno.network.a.a */
public abstract class AbstractC38929a<T extends VcLiveResponse> extends AbstractC26011b<BaseResponse> {

    /* renamed from: a */
    private ParameterizedType f100019a;

    /* renamed from: a */
    public abstract void m153636c(T t);

    /* renamed from: a */
    public abstract void m153637c(C38930b bVar);

    public AbstractC38929a() {
        ParameterizedType parameterizedType;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) genericSuperclass;
        } else {
            parameterizedType = null;
        }
        this.f100019a = parameterizedType;
    }

    /* renamed from: a */
    public boolean mo142523a() {
        ParameterizedType parameterizedType = this.f100019a;
        if (parameterizedType != null && parameterizedType.getActualTypeArguments().length == 1) {
            try {
                if (((Class) this.f100019a.getActualTypeArguments()[0]).getName().equals(String.class.getName())) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                C45855f.m181666e("LiveDataCallback", "error:" + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m153634b(T t) {
        new Handler(Looper.getMainLooper()).post(new Runnable(t) {
            /* class com.ss.android.lark.inno.network.p1971a.$$Lambda$a$b5yhyM5yKBO8uBTefNlVcKNtq3k */
            public final /* synthetic */ VcLiveResponse f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC38929a.lambda$b5yhyM5yKBO8uBTefNlVcKNtq3k(AbstractC38929a.this, this.f$1);
            }
        });
    }

    @Override // com.larksuite.framework.http.request.AbstractC26011b
    /* renamed from: a */
    public void mo86433a(ErrorResult errorResult) {
        m153635b(new C38930b(errorResult.getErrorType(), errorResult.getErrorMessage(), errorResult.getHttpStatusCode()));
    }

    /* renamed from: b */
    private void m153635b(C38930b bVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable(bVar) {
            /* class com.ss.android.lark.inno.network.p1971a.$$Lambda$a$GOG3NffWmChb_c7TgyXgiJUS0O4 */
            public final /* synthetic */ C38930b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AbstractC38929a.lambda$GOG3NffWmChb_c7TgyXgiJUS0O4(AbstractC38929a.this, this.f$1);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T mo142519a(String str) {
        ParameterizedType parameterizedType;
        if (!(str == 0 || (parameterizedType = this.f100019a) == null || parameterizedType.getActualTypeArguments().length != 1)) {
            try {
                if (((Class) this.f100019a.getActualTypeArguments()[0]).getName().equals(String.class.getName())) {
                    return str;
                }
            } catch (Exception e) {
                e.printStackTrace();
                C45855f.m181666e("LiveDataCallback", "error:" + e.getMessage());
            }
            try {
                return (T) JSON.parseObject(str, this.f100019a.getActualTypeArguments()[0], new Feature[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
                C45855f.m181666e("LiveDataCallback", "error:" + e2.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo86434a(BaseResponse baseResponse) {
        C45855f.m181663b("LiveDataCallback", "onSuccess");
        try {
            T a = mo142519a(baseResponse.body().mo92409a());
            if (a == null) {
                m153635b(new C38930b(-100002, "ERROR_CONVERT_FAILED", -1));
            } else if (!(a instanceof VcLiveResponse)) {
                m153635b(new C38930b(-100002, "ERROR_CONVERT_FAILED", -1));
            } else if (a.code != 0) {
                m153635b(new C38930b(-10006, "ERROR_HTTP_RESP_DATA_ERROR", a.code));
            } else if (a.data != null) {
                m153634b(a);
            } else if (mo142523a()) {
                m153634b(a);
            } else {
                m153635b(new C38930b(-10005, "ERROR_HTTP_RESP_ERROR", a.code));
            }
        } catch (IOException e) {
            e.printStackTrace();
            m153637c(new C38930b(-100004, "ERROR_EXECEPTION", -1));
        }
    }
}
