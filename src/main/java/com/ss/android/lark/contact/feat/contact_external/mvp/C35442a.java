package com.ss.android.lark.contact.feat.contact_external.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.feat.contact_external.data.ExternalContactViewData;
import com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c;
import com.ss.android.lark.contact.feat.entity.C35468a;
import com.ss.android.lark.contact.feat.entity.C35470c;
import com.ss.android.lark.contact.feat.entity.C35471d;
import com.ss.android.lark.contact.feat.p1745d.C35464c;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1761f.C35890d;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.a */
public class C35442a extends BaseModel implements AbstractC35453c.AbstractC35454a {

    /* renamed from: a */
    AbstractC35361b.AbstractC35367f f91645a;

    /* renamed from: b */
    AbstractC35936a f91646b = C35906e.m140678a();

    /* renamed from: c */
    AbstractC35361b.AbstractC35382u f91647c;

    /* renamed from: d */
    public AbstractC35453c.AbstractC35454a.AbstractC35455a f91648d;

    /* renamed from: e */
    private final C35890d.AbstractC35905c f91649e = new C35890d.AbstractC35905c() {
        /* class com.ss.android.lark.contact.feat.contact_external.mvp.C35442a.C354431 */

        @Override // com.ss.android.lark.contact.impl.p1761f.C35890d.AbstractC35904b
        public void onPushContact(ExternalContact externalContact) {
        }

        @Override // com.ss.android.lark.contact.impl.p1761f.C35890d.AbstractC35905c
        /* renamed from: a */
        public void mo130820a(C35468a aVar) {
            if (aVar != null && C35442a.this.f91648d != null) {
                AbstractC35453c.AbstractC35454a.AbstractC35455a aVar2 = C35442a.this.f91648d;
                ExternalContactViewData a = C35442a.this.mo130814a(aVar);
                if (a != null) {
                    aVar2.mo130834a(a);
                }
            }
        }
    };

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C35890d.m140654a().mo132126b(this.f91649e);
        this.f91648d = null;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C35890d.m140654a().mo132121a(this.f91649e);
        this.f91645a = C35358a.m138143a().mo130165j();
        this.f91647c = C35358a.m138143a().mo130156d();
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35454a
    /* renamed from: a */
    public void mo130816a(AbstractC35453c.AbstractC35454a.AbstractC35455a aVar) {
        this.f91648d = aVar;
    }

    /* renamed from: a */
    public List<ExternalContactViewData> mo130815a(List<C35468a> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (C35468a aVar : list) {
            ExternalContactViewData a = mo130814a(aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public ExternalContactViewData mo130814a(C35468a aVar) {
        C35471d a;
        boolean z;
        if (aVar == null || (a = aVar.mo130877a()) == null) {
            return null;
        }
        ExternalContactViewData aVar2 = new ExternalContactViewData();
        aVar2.mo130777d(a.mo130882a());
        aVar2.mo130769a(a.mo130883b());
        aVar2.mo130772b(a.mo130884c());
        aVar2.mo130774c(a.mo130885d());
        aVar2.mo130767a(new ChatterDescription(a.mo130889h(), ChatterDescription.Type.DEFAULT));
        aVar2.mo130782f(a.mo130887f());
        aVar2.mo130779e(a.mo130886e());
        aVar2.mo130784g(a.mo130888g());
        aVar2.mo130768a(Long.valueOf(a.mo130890i()));
        if (aVar.mo130878b() == 2) {
            z = true;
        } else {
            z = false;
        }
        aVar2.mo130770a(z);
        return aVar2;
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35454a
    /* renamed from: a */
    public void mo130818a(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        this.f91645a.mo130200a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35454a
    /* renamed from: a */
    public void mo130817a(Boolean bool, final IGetDataCallback<List<ExternalContactViewData>> iGetDataCallback) {
        InvAppreciableUtils.m158977b().mo145663a(Event.contact_opt_external_fetch);
        C35464c.m138728a(bool, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<C35470c>() {
            /* class com.ss.android.lark.contact.feat.contact_external.mvp.C35442a.C354453 */

            /* renamed from: a */
            public void onSuccess(C35470c cVar) {
                List<C35468a> list;
                if (cVar != null) {
                    list = cVar.mo130881a();
                } else {
                    list = null;
                }
                List<ExternalContactViewData> a = C35442a.this.mo130815a(list);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(a);
                }
                InvAppreciableUtils.m158977b().mo145669b(Event.contact_opt_external_fetch);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (iGetDataCallback != null) {
                    Log.m165384e("ExternalContactModel2", "getExternalContacts error", errorResult);
                    iGetDataCallback.onError(errorResult);
                }
                InvAppreciableUtils.m158977b().mo145665a(Event.contact_opt_external_fetch, errorResult);
            }
        }));
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35454a
    /* renamed from: a */
    public void mo130819a(String str, String str2, final IGetDataCallback<Boolean> iGetDataCallback) {
        InvAppreciableUtils.m158977b().mo145663a(Event.contact_opt_external_delete);
        this.f91646b.mo130288e(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.contact.feat.contact_external.mvp.C35442a.C354442 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
                InvAppreciableUtils.m158977b().mo145669b(Event.contact_opt_external_delete);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                InvAppreciableUtils.m158977b().mo145665a(Event.contact_opt_external_delete, errorResult);
            }
        }));
    }
}
