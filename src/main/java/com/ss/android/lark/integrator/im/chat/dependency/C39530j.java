package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29572q;
import com.ss.android.lark.biz.core.api.FileState;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36501o;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.p2392o.AbstractC48696b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.j */
class C39530j implements AbstractC36501o {

    /* renamed from: a */
    private static Map<AbstractC48696b, AbstractC29572q.AbstractC29573a> f100982a = new ConcurrentHashMap();

    C39530j() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36501o
    /* renamed from: a */
    public void mo134678a(final AbstractC48696b bVar) {
        C395311 r0 = new AbstractC29572q.AbstractC29573a() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39530j.C395311 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29572q.AbstractC29573a
            /* renamed from: a */
            public void mo105822a() {
                bVar.mo123074a();
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29572q.AbstractC29573a
            /* renamed from: b */
            public void mo105823b() {
                bVar.mo123075b();
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29572q.AbstractC29573a
            /* renamed from: c */
            public void mo105824c() {
                bVar.mo123076c();
            }
        };
        f100982a.put(bVar, r0);
        C39603g.m157159a().getCoreDependency().mo143475a(r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36501o
    /* renamed from: b */
    public void mo134682b(AbstractC48696b bVar) {
        AbstractC29572q.AbstractC29573a aVar = f100982a.get(bVar);
        if (aVar != null) {
            f100982a.remove(bVar);
            C39603g.m157159a().getCoreDependency().mo143545b(aVar);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36501o
    /* renamed from: a */
    public void mo134679a(String str, String str2, int i, final IGetDataCallback<Message.FileDeletedStatus> iGetDataCallback) {
        C395322 r0;
        if (iGetDataCallback != null) {
            r0 = new IGetDataCallback<FileState>() {
                /* class com.ss.android.lark.integrator.im.chat.dependency.C39530j.C395322 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(FileState fileState) {
                    iGetDataCallback.onSuccess(Message.FileDeletedStatus.fromValue(fileState.getNumber()));
                }
            };
        } else {
            r0 = null;
        }
        C39603g.m157159a().getCoreDependency().mo143491a(str, str2, i, r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36501o
    /* renamed from: a */
    public void mo134680a(String str, String str2, String str3, int i, IGetDataCallback<Boolean> iGetDataCallback) {
        C39603g.m157159a().getCoreDependency().mo143494a(str, str2, str3, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36501o
    /* renamed from: a */
    public void mo134677a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        C39603g.m157159a().getCoreDependency().mo143529b(context, str, str2, str3, i, str4, str5, iGetDataCallback, hVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36501o
    /* renamed from: b */
    public void mo134681b(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
        C39603g.m157159a().getCoreDependency().mo143448a(context, str, str2, str3, i, str4, str5, iGetDataCallback, hVar);
    }
}
