package com.bytedance.ug.sdk.share.impl.p923g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ug.sdk.share.impl.network.model.PanelInfo;
import com.bytedance.ug.sdk.share.impl.p917a.C20820a;
import com.bytedance.ug.sdk.share.impl.p918b.AbstractC20823a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ug.sdk.share.impl.g.d */
public class C20840d {

    /* renamed from: a */
    public boolean f51012a;

    /* renamed from: b */
    public AbstractC20823a f51013b;

    /* renamed from: c */
    private Context f51014c;

    /* renamed from: d */
    private ConcurrentHashMap<String, Runnable> f51015d;

    /* renamed from: e */
    private String f51016e;

    /* renamed from: f */
    private List<PanelInfo> f51017f;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ug.sdk.share.impl.g.d$a */
    public static class C20842a {

        /* renamed from: a */
        public static C20840d f51018a = new C20840d(null);
    }

    /* renamed from: a */
    public static C20840d m75892a() {
        return C20842a.f51018a;
    }

    /* renamed from: b */
    public Context mo70319b() {
        return this.f51014c;
    }

    /* renamed from: d */
    public boolean mo70321d() {
        return this.f51012a;
    }

    /* renamed from: com.bytedance.ug.sdk.share.impl.g.d$1 */
    class RunnableC208411 implements Runnable {
        public void run() {
            C20843e.m75897a().mo70325b();
        }
    }

    private C20840d() {
        this.f51017f = new ArrayList();
        this.f51015d = new ConcurrentHashMap<>();
    }

    /* renamed from: c */
    public String mo70320c() {
        if (TextUtils.isEmpty(this.f51016e)) {
            this.f51016e = C20820a.m75834a().mo70283b();
        }
        return this.f51016e;
    }

    /* synthetic */ C20840d(RunnableC208411 r1) {
        this();
    }

    /* renamed from: a */
    public void mo70318a(AbstractC20823a aVar) {
        this.f51013b = aVar;
    }
}
