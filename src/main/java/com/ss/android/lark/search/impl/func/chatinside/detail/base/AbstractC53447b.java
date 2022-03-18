package com.ss.android.lark.search.impl.func.chatinside.detail.base;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.C57782ag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.b */
public abstract class AbstractC53447b<T extends SearchBaseInfo> implements AbstractC53452d.AbstractC53455b.AbstractC53456a<T> {

    /* renamed from: a */
    public final AbstractC53443a f132079a;

    /* renamed from: b */
    public final BaseChatInsideSearchView f132080b;

    /* renamed from: c */
    private int f132081c = 1;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo182472b(T t, int i);

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: c */
    public int mo182541c() {
        return this.f132081c;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: a */
    public void mo182533a() {
        mo182538b(false);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: b */
    public boolean mo182539b() {
        return this.f132079a.mo182519e();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: d */
    public void mo182542d() {
        this.f132079a.mo182523i();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: e */
    public boolean mo182543e() {
        return this.f132079a.mo182525k();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: f */
    public String mo182544f() {
        return this.f132079a.mo182528o();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: g */
    public String mo182545g() {
        return this.f132079a.mo182463n();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: h */
    public int mo182546h() {
        return this.f132079a.mo182529p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo182538b(final boolean z) {
        this.f132079a.mo182503a(new IGetDataCallback<List<SearchBaseInfo>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b.C534503 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!z) {
                    AbstractC53447b.this.f132080b.mo182470d();
                }
            }

            /* renamed from: a */
            public void onSuccess(List<SearchBaseInfo> list) {
                AbstractC53447b.this.f132080b.mo182485a(list, z);
                AbstractC53447b.this.f132079a.mo182512a(list, z);
            }
        }, z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: a */
    public void mo182535a(String str) {
        this.f132081c++;
        if (!mo182540b(str)) {
            mo182538b(true);
        } else {
            mo182536a(str, true);
        }
    }

    /* renamed from: b */
    public boolean mo182540b(String str) {
        if (!C57782ag.m224241a(str)) {
            return true;
        }
        return !this.f132079a.mo182525k();
    }

    /* renamed from: a */
    public void mo182537a(boolean z) {
        if (z) {
            this.f132079a.mo182518d();
            this.f132079a.mo182464q();
            this.f132079a.mo182507a("");
            this.f132079a.mo182517c();
        }
        mo182538b(!z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: a */
    public void mo182534a(T t, int i) {
        mo182472b(t, i);
    }

    public AbstractC53447b(AbstractC53443a aVar, BaseChatInsideSearchView baseChatInsideSearchView) {
        this.f132079a = aVar;
        this.f132080b = baseChatInsideSearchView;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: a */
    public void mo182536a(String str, final boolean z) {
        if (!mo182540b(str)) {
            this.f132079a.mo182518d();
            this.f132079a.mo182507a("");
            this.f132079a.mo182517c();
            this.f132079a.mo182464q();
            this.f132080b.mo182488c();
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b.RunnableC534481 */

                public void run() {
                    AbstractC53447b.this.mo182533a();
                }
            });
            return;
        }
        if (!z) {
            this.f132080b.mo182486b();
        }
        this.f132079a.mo182508a(str, new IGetDataCallback<List<SearchBaseInfo>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b.C534492 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC53447b.this.f132080b.mo182485a(new ArrayList(), z);
            }

            /* renamed from: a */
            public void onSuccess(List<SearchBaseInfo> list) {
                AbstractC53447b.this.f132080b.mo182485a(list, z);
                AbstractC53447b.this.f132079a.mo182512a(list, z);
            }
        }, z);
    }
}
