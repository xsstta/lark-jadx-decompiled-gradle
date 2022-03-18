package com.ss.android.lark.contact.impl.contacts_group.manage;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.dto.C35393d;
import com.ss.android.lark.contact.impl.contacts_group.hitpoint.ContactsMyGroupHitPoint;
import com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.c */
public class C35628c extends BaseModel implements AbstractC35623a.AbstractC35624a {

    /* renamed from: a */
    private boolean f92130a = true;

    /* renamed from: b */
    private boolean f92131b;

    /* renamed from: c */
    private long f92132c;

    /* renamed from: d */
    private List<Chat> f92133d = new ArrayList();

    /* renamed from: e */
    private AbstractC35936a f92134e = C35906e.m140678a();

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35624a
    /* renamed from: a */
    public boolean mo131306a() {
        return this.f92130a;
    }

    /* renamed from: a */
    private void m139456a(long j) {
        this.f92132c = j;
    }

    /* renamed from: b */
    private void m139457b(boolean z) {
        this.f92130a = z;
    }

    /* renamed from: a */
    public void mo131316a(boolean z) {
        this.f92131b = z;
    }

    /* renamed from: a */
    public List<Chat> mo131314a(C35393d dVar) {
        mo131315a(dVar.mo130384a());
        m139457b(dVar.mo130388b());
        m139456a(dVar.mo130389c());
        return this.f92133d;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35624a
    /* renamed from: a */
    public void mo131305a(final IGetDataCallback<List<Chat>> iGetDataCallback) {
        if (!this.f92131b) {
            mo131316a(true);
            this.f92134e.mo132150b(this.f92132c, 50, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C35393d>() {
                /* class com.ss.android.lark.contact.impl.contacts_group.manage.C35628c.C356291 */

                /* renamed from: a */
                public void onSuccess(C35393d dVar) {
                    C35628c.this.mo131316a(false);
                    if (iGetDataCallback != null) {
                        List<Chat> a = C35628c.this.mo131314a(dVar);
                        iGetDataCallback.onSuccess(a);
                        ContactsMyGroupHitPoint.f92084a.mo131271a(a.size());
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("get managed groups failed: " + errorResult.toString());
                    C35628c.this.mo131316a(false);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                        ContactsMyGroupHitPoint.f92084a.mo131270a();
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    public void mo131315a(List<Chat> list) {
        if (this.f92132c == 0) {
            this.f92133d.clear();
            this.f92133d.addAll(list);
            return;
        }
        HashSet hashSet = new HashSet();
        for (Chat chat : list) {
            hashSet.add(chat.getId());
        }
        Iterator<Chat> it = this.f92133d.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().getId())) {
                it.remove();
            }
        }
        this.f92133d.addAll(list);
    }
}
