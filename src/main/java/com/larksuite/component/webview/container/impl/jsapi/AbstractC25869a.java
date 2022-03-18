package com.larksuite.component.webview.container.impl.jsapi;

import android.os.Bundle;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.impl.inject.C25862a;
import com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.openapi.p2397a.C48758b;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.larksuite.component.webview.container.impl.jsapi.a */
public abstract class AbstractC25869a<Param extends Serializable> extends C25862a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo91860a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo91861a(Param param, AbstractC25832c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo91862a();

    /* renamed from: a */
    public <T> Class<T> mo92022a(Object obj) {
        Type[] typeArr;
        if (obj == null) {
            return null;
        }
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            typeArr = null;
        } else {
            typeArr = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        if (typeArr == null || typeArr.length <= 0) {
            return null;
        }
        return (Class) typeArr[0];
    }

    /* renamed from: b */
    public <T> Class<T> mo92024b(Object obj) {
        Type[] typeArr;
        if (obj == null) {
            return null;
        }
        Type[] genericInterfaces = obj.getClass().getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length <= 0) {
            typeArr = null;
        } else {
            typeArr = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
        }
        if (typeArr == null || typeArr.length <= 0) {
            return null;
        }
        return (Class) typeArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo92023a(final String str, final AbstractC25832c cVar) {
        CoreThreadPool.getDefault().getScheduleThreadPool().execute(new Runnable() {
            /* class com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a.RunnableC258701 */

            public void run() {
                Serializable serializable;
                AbstractC25869a aVar = AbstractC25869a.this;
                Class a = aVar.mo92022a(aVar);
                if (a == null) {
                    AbstractC25869a aVar2 = AbstractC25869a.this;
                    a = aVar2.mo92024b(aVar2);
                }
                if (a == null) {
                    serializable = null;
                } else if (a == String.class) {
                    serializable = str;
                } else {
                    serializable = (Serializable) C48758b.m192084a(str, a);
                }
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(serializable, cVar) {
                    /* class com.larksuite.component.webview.container.impl.jsapi.$$Lambda$a$1$mDrq2XKfc7xC7yfgvERKFxE_Vc */
                    public final /* synthetic */ Serializable f$1;
                    public final /* synthetic */ AbstractC25832c f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        AbstractC25869a.RunnableC258701.this.m93636a(this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m93636a(Serializable serializable, AbstractC25832c cVar) {
                AbstractC25869a.this.mo91861a(serializable, cVar);
            }
        });
    }
}
