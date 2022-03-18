package com.ss.android.lark.preload;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.preload.moment.AbstractC52236a;
import com.ss.android.lark.preload.moment.PreloadMoment;
import com.ss.android.lark.preload.p2518a.C52221a;
import com.ss.android.lark.preload.p2519b.AbstractC52229a;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.preload.b */
public class C52224b {

    /* renamed from: a */
    private C52221a f129563a;

    /* renamed from: com.ss.android.lark.preload.b$a */
    public static class C52226a {

        /* renamed from: a */
        public Float f129567a;

        /* renamed from: b */
        public AbstractC52236a f129568b;

        /* renamed from: c */
        public ExecutorService f129569c;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.preload.b$c */
    public static class C52228c {

        /* renamed from: a */
        static C52224b f129573a = new C52224b();
    }

    /* renamed from: a */
    public static C52224b m202589a() {
        return C52228c.f129573a;
    }

    private C52224b() {
        this.f129563a = new C52221a();
    }

    /* renamed from: com.ss.android.lark.preload.b$b */
    public static class C52227b {

        /* renamed from: a */
        private Float f129570a;

        /* renamed from: b */
        private AbstractC52236a f129571b;

        /* renamed from: c */
        private ExecutorService f129572c;

        /* renamed from: a */
        public C52226a mo178808a() {
            C52226a aVar = new C52226a();
            aVar.f129569c = this.f129572c;
            aVar.f129568b = this.f129571b;
            aVar.f129567a = this.f129570a;
            return aVar;
        }

        /* renamed from: a */
        public C52227b mo178809a(AbstractC52236a aVar) {
            this.f129571b = aVar;
            return this;
        }

        /* renamed from: a */
        public C52227b mo178810a(ExecutorService executorService) {
            this.f129572c = executorService;
            return this;
        }
    }

    /* renamed from: a */
    public void mo178806a(List<AbstractC52220a> list) {
        for (AbstractC52220a aVar : list) {
            C52230c.m202604a().mo178811a(aVar, PreloadType.IDLE);
        }
    }

    /* renamed from: a */
    public void mo178803a(C52226a aVar) {
        if (aVar.f129567a != null) {
            this.f129563a.mo178796a(aVar.f129567a.floatValue());
        }
        C52230c.m202604a().mo178812a(aVar.f129568b, aVar.f129569c);
        C52235d.m202608a();
        this.f129563a.mo178795a();
    }

    /* renamed from: a */
    public <T> void mo178802a(PreloadTarget preloadTarget, IGetDataCallback<T> iGetDataCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f129563a.mo178797a(preloadTarget, currentTimeMillis);
        C52235d.m202609a(preloadTarget, currentTimeMillis);
    }

    /* renamed from: b */
    public <T> void mo178807b(AbstractC52229a<T> aVar, PreloadMoment preloadMoment) {
        this.f129563a.mo178800b(aVar.mo144980b());
        C52235d.m202610a(aVar.mo144980b(), preloadMoment);
    }

    /* renamed from: a */
    public <T> void mo178804a(final AbstractC52229a<T> aVar, final PreloadMoment preloadMoment) {
        if (aVar != null) {
            Log.m165389i("PreloadEngine", "TaskName=" + aVar.mo144978a() + ", do preload when " + preloadMoment);
            if (!this.f129563a.mo178799a(aVar, preloadMoment)) {
                Log.m165389i("PreloadEngine", "TaskName=" + aVar.mo144978a() + ", decisionMaker = " + false);
                return;
            }
            mo178807b(aVar, preloadMoment);
            if (aVar.mo144982d()) {
                aVar.mo144979a(new IGetDataCallback<T>() {
                    /* class com.ss.android.lark.preload.C52224b.C522251 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C52224b.this.mo178805a(aVar, null, preloadMoment);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                    public void onSuccess(T t) {
                        C52224b.this.mo178805a(aVar, t, preloadMoment);
                    }
                });
            } else {
                mo178805a(aVar, aVar.mo144983e(), preloadMoment);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo178805a(AbstractC52229a aVar, T t, PreloadMoment preloadMoment) {
        C52235d.m202611b(aVar.mo144980b(), preloadMoment);
    }
}
