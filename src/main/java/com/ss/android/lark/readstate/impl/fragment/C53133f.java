package com.ss.android.lark.readstate.impl.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import com.ss.android.lark.readstate.impl.fragment.C53127b;
import com.ss.android.lark.readstate.impl.fragment.IReadStateLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.readstate.impl.fragment.f */
public class C53133f extends BaseModel implements C53127b.AbstractC53128a {

    /* renamed from: a */
    private final String f131403a;

    /* renamed from: b */
    private int f131404b;

    /* renamed from: c */
    private Set<Integer> f131405c;

    /* renamed from: d */
    private int f131406d;

    /* renamed from: e */
    private boolean f131407e;

    /* renamed from: f */
    private List<C53123f> f131408f = new ArrayList();

    /* renamed from: g */
    private String f131409g;

    /* renamed from: h */
    private IReadStateLoader f131410h;

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53128a
    /* renamed from: b */
    public int mo181459b() {
        return this.f131404b;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53128a
    /* renamed from: d */
    public boolean mo181461d() {
        return this.f131407e;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53128a
    /* renamed from: a */
    public int mo181455a() {
        return this.f131406d;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53128a
    /* renamed from: c */
    public boolean mo181460c() {
        return !TextUtils.isEmpty(this.f131409g);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205671a(String str) {
        this.f131409g = str;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53128a
    /* renamed from: a */
    public void mo181458a(IGetDataCallback<List<C53123f>> iGetDataCallback) {
        if (!TextUtils.isEmpty(this.f131409g)) {
            this.f131410h.mo181454a(this.f131403a, this.f131409g, iGetDataCallback);
        } else {
            iGetDataCallback.onError(new ErrorResult("cursor is empty"));
        }
    }

    public C53133f(Bundle bundle) {
        this.f131404b = bundle.getInt("read_type");
        this.f131403a = bundle.getString("message_id");
        this.f131405c = (Set) bundle.getSerializable("show_search_type");
        this.f131406d = bundle.getInt("msg_type");
        this.f131407e = bundle.getBoolean("is_urgent", false);
        m205670a(this.f131404b);
    }

    /* renamed from: a */
    private void m205670a(int i) {
        $$Lambda$f$X6GQAs38_rwbcLcmh0_Tlry0EU r0 = new IReadStateLoader.OnLoadNextPageListener() {
            /* class com.ss.android.lark.readstate.impl.fragment.$$Lambda$f$X6GQAs38_rwbcLcmh0_Tlry0EU */

            @Override // com.ss.android.lark.readstate.impl.fragment.IReadStateLoader.OnLoadNextPageListener
            public final void onGetNextPage(String str) {
                C53133f.this.m205671a((C53133f) str);
            }
        };
        if (i == 2) {
            this.f131410h = new UnReadLoader(r0);
        } else if (i == 4) {
            this.f131410h = new ReadLoader(r0);
        } else if (i == 7) {
            this.f131410h = new BothReadLoader(r0);
        }
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53128a
    /* renamed from: a */
    public List<C53123f> mo181456a(List<C53123f> list) {
        if (CollectionUtils.isEmpty(list)) {
            return this.f131408f;
        }
        for (C53123f fVar : list) {
            if (this.f131405c.contains(Integer.valueOf(fVar.f131382g))) {
                this.f131408f.add(fVar);
            }
        }
        return this.f131408f;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53128a
    /* renamed from: a */
    public List<C53123f> mo181457a(List<C53123f> list, String str) {
        this.f131409g = str;
        if (CollectionUtils.isNotEmpty(list)) {
            this.f131408f.addAll(list);
        }
        return this.f131408f;
    }
}
