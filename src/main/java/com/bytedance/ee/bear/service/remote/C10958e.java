package com.bytedance.ee.bear.service.remote;

import android.app.Application;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.ee.bear.binder.annotation.ServiceProcess;
import com.bytedance.ee.bear.service.AbstractC10928d;
import com.bytedance.ee.bear.service.AbstractC10933f;
import com.bytedance.ee.bear.service.base.AbstractC10913a;
import com.bytedance.ee.bear.service.base.AbstractC10914b;
import com.bytedance.ee.bear.service.base.C10916c;
import com.bytedance.ee.bear.service.remote.TokenManager;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.service.remote.e */
public class C10958e implements AbstractC10914b<Object, AbstractC10957d> {

    /* renamed from: a */
    private Application f29457a;

    /* renamed from: b */
    private TokenManager f29458b;

    /* renamed from: c */
    private C10954c f29459c;

    /* renamed from: d */
    private final Set<Class<?>> f29460d = new HashSet();

    /* renamed from: e */
    private final Map<AbstractC10913a, AbstractC10957d> f29461e = new LinkedHashMap();

    /* renamed from: f */
    private final Map<AbstractC10913a, Class<?>> f29462f = new HashMap();

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public void mo41484a() {
        String b = C10916c.m45409b(this.f29457a);
        if (TextUtils.isEmpty(b)) {
            b = "main";
        }
        try {
            C13479a.m54764b("RemoteServiceFacade", "endInit: for process " + b);
            this.f29458b.mo41581a(b);
        } catch (RemoteException e) {
            C13479a.m54759a("RemoteServiceFacade", "endInit: ", e);
        }
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public boolean mo41489a(AbstractC10913a aVar) {
        return aVar instanceof AbstractC10957d;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: c */
    public AbstractC68307f<Object> mo41493c(Class<Object> cls) {
        return this.f29459c.mo41588a(cls);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public boolean mo41490a(Class<?> cls) {
        return this.f29460d.contains(cls);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public void mo41485a(Application application) {
        this.f29457a = application;
        TokenManager tokenManager = new TokenManager(application);
        this.f29458b = tokenManager;
        this.f29459c = new C10954c(tokenManager);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: b */
    public Object mo41491b(Class<Object> cls) {
        C13479a.m54772d("RemoteServiceFacade", "proxy:  contract = " + cls);
        return this.f29459c.mo41589a(cls, (AbstractC10957d) null);
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: b */
    public void mo41492b(AbstractC10913a aVar) {
        String b = C10916c.m45409b(this.f29457a);
        AbstractC10957d dVar = this.f29461e.get(aVar);
        Class<?> cls = this.f29462f.get(aVar);
        if (dVar != null) {
            dVar.init(this.f29457a);
            try {
                this.f29458b.mo41585b(b, cls.getName());
            } catch (RemoteException e) {
                C13479a.m54773d("RemoteServiceFacade", "initService: ", e);
            }
        }
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10914b
    /* renamed from: a */
    public void mo41488a(AbstractC10914b.AbstractC10915a aVar) {
        try {
            this.f29458b.mo41582a(C10916c.m45409b(this.f29457a), aVar);
        } catch (TokenManager.NoTokenCenterException e) {
            C13479a.m54759a("RemoteServiceFacade", "registerInitCallback:", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.bytedance.ee.bear.service.remote.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo41487a(AbstractC10957d dVar, AbstractC10928d dVar2) {
        String a = dVar2.mo16985a(dVar.getClass());
        String str = "main";
        if (a != null) {
            if (!TextUtils.isEmpty(a)) {
                str = a;
            }
        } else if (dVar.getClass().isAnnotationPresent(ServiceProcess.class)) {
            ServiceProcess serviceProcess = (ServiceProcess) dVar.getClass().getAnnotation(ServiceProcess.class);
            String name = serviceProcess.name();
            if (!TextUtils.isEmpty(name)) {
                str = serviceProcess.name();
            }
            a = name;
        } else {
            a = "";
        }
        boolean c = C10916c.m45410c(this.f29457a);
        if (!TextUtils.isEmpty(a)) {
            c = C10916c.m45408a(this.f29457a, a);
        }
        C13479a.m54764b("RemoteServiceFacade", "register: service = " + dVar + "  pName = " + str + "  canBuild = " + c);
        Class<?>[] clsArr = null;
        if (dVar instanceof AbstractC10933f) {
            clsArr = ((AbstractC10933f) dVar).mo16350a();
        }
        if (clsArr == null || clsArr.length != 3) {
            C13479a.m54758a("RemoteServiceFacade", "the auto AbsRemoteService is incorrect");
            return;
        }
        Class<?> cls = clsArr[0];
        Class<?> cls2 = clsArr[1];
        Class<?> cls3 = clsArr[2];
        this.f29458b.mo41583a(cls.getName(), str);
        try {
            this.f29459c.mo41590a((Class<AbstractC10957d>) cls, (AbstractC10952a<AbstractC10957d>) ((AbstractC10952a) cls3.newInstance()));
            this.f29460d.add(cls);
            this.f29462f.put(dVar, cls);
            if (c) {
                AbstractC10957d dVar3 = (AbstractC10957d) cls2.getConstructors()[0].newInstance(dVar, this.f29457a);
                this.f29461e.put(dVar, dVar3);
                C13479a.m54764b("RemoteServiceFacade", "register: register flow.");
                try {
                    this.f29458b.mo41580a(cls, ((IInterface) dVar3).asBinder());
                } catch (RemoteException e) {
                    C13479a.m54759a("RemoteServiceFacade", "register: error", e);
                }
            }
        } catch (IllegalAccessException e2) {
            C13479a.m54759a("RemoteServiceFacade", "register: error", e2);
        } catch (InstantiationException e3) {
            C13479a.m54759a("RemoteServiceFacade", "register: error", e3);
        } catch (InvocationTargetException e4) {
            C13479a.m54759a("RemoteServiceFacade", "register: error", e4);
        }
    }
}
