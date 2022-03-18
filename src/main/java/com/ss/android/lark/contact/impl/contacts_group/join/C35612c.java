package com.ss.android.lark.contact.impl.contacts_group.join;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.dto.C35393d;
import com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.c */
public class C35612c extends BaseModel implements AbstractC35606a.AbstractC35607a {

    /* renamed from: a */
    private boolean f92100a = true;

    /* renamed from: b */
    private boolean f92101b;

    /* renamed from: c */
    private long f92102c;

    /* renamed from: d */
    private List<Chat> f92103d = new ArrayList();

    /* renamed from: e */
    private AbstractC35936a f92104e = C35906e.m140678a();

    @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35607a
    /* renamed from: a */
    public boolean mo131282a() {
        return this.f92100a;
    }

    /* renamed from: a */
    private void m139408a(long j) {
        this.f92102c = j;
    }

    /* renamed from: b */
    private void m139409b(boolean z) {
        this.f92100a = z;
    }

    /* renamed from: a */
    public void mo131289a(boolean z) {
        this.f92101b = z;
    }

    /* renamed from: a */
    public List<Chat> mo131287a(C35393d dVar) {
        mo131288a(dVar.mo130384a());
        m139409b(dVar.mo130388b());
        m139408a(dVar.mo130389c());
        return this.f92103d;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35607a
    /* renamed from: a */
    public void mo131281a(final IGetDataCallback<List<Chat>> iGetDataCallback) {
        this.f92104e.mo132138a(50, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<Chat>>() {
            /* class com.ss.android.lark.contact.impl.contacts_group.join.C35612c.C356131 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<Chat> list) {
                C35612c.this.mo131288a(list);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(list);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35607a
    /* renamed from: b */
    public void mo131283b(final IGetDataCallback<List<Chat>> iGetDataCallback) {
        if (!this.f92101b) {
            mo131289a(true);
            this.f92104e.mo132139a(this.f92102c, 50, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C35393d>() {
                /* class com.ss.android.lark.contact.impl.contacts_group.join.C35612c.C356142 */

                /* renamed from: a */
                public void onSuccess(C35393d dVar) {
                    C35612c.this.mo131289a(false);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(C35612c.this.mo131287a(dVar));
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("get joined groups failed: " + errorResult.toString());
                    C35612c.this.mo131289a(false);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    public void mo131288a(List<Chat> list) {
        if (this.f92102c == 0) {
            this.f92103d.clear();
            this.f92103d.addAll(list);
            return;
        }
        HashSet hashSet = new HashSet();
        for (Chat chat : list) {
            hashSet.add(chat.getId());
        }
        Iterator<Chat> it = this.f92103d.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(it.next().getId())) {
                it.remove();
            }
        }
        this.f92103d.addAll(list);
    }
}
