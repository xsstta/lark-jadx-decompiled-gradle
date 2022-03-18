package com.ss.android.lark.photoeditor.impl.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a;
import com.ss.android.lark.photoeditor.impl.ui.C51456e;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import java.io.File;

/* renamed from: com.ss.android.lark.photoeditor.impl.ui.d */
public class C51451d extends BasePresenter<AbstractC51438a.AbstractC51439a, AbstractC51438a.AbstractC51441b, AbstractC51438a.AbstractC51441b.AbstractC51442a> {

    /* renamed from: a */
    public String f128009a;

    /* renamed from: b */
    public String f128010b;

    /* renamed from: c */
    public boolean f128011c;

    /* renamed from: d */
    public boolean f128012d;

    /* renamed from: e */
    public AbstractC51455a f128013e;

    /* renamed from: f */
    public String f128014f;

    /* renamed from: com.ss.android.lark.photoeditor.impl.ui.d$a */
    public interface AbstractC51455a {
        /* renamed from: a */
        void mo177122a(String str);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC51438a.AbstractC51441b.AbstractC51442a createViewDelegate() {
        return new AbstractC51438a.AbstractC51441b.AbstractC51442a() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51451d.C514521 */

            @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b.AbstractC51442a
            /* renamed from: a */
            public void mo177116a(Bitmap bitmap) {
                ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177113b();
                ((AbstractC51438a.AbstractC51439a) C51451d.this.getModel()).mo177106a(bitmap, C51451d.this.f128009a, new AbstractC51438a.AbstractC51439a.AbstractC51440a() {
                    /* class com.ss.android.lark.photoeditor.impl.ui.C51451d.C514521.C514531 */

                    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51439a.AbstractC51440a
                    /* renamed from: a */
                    public void mo177108a(String str) {
                        ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177114c();
                        ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177110a(str);
                    }

                    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51439a.AbstractC51440a
                    /* renamed from: a */
                    public void mo177107a(File file) {
                        ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177114c();
                        if ("from_preview".equals(C51451d.this.f128010b)) {
                            ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177111a(file.getAbsolutePath(), C51451d.this.f128011c, C51451d.this.f128012d, C51451d.this.f128014f);
                        } else if (C51451d.this.f128013e != null) {
                            C51451d.this.f128013e.mo177122a(file.getAbsolutePath());
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b.AbstractC51442a
            /* renamed from: a */
            public void mo177118a(String str) {
                if ("from_preview".equals(C51451d.this.f128010b)) {
                    ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177111a(str, C51451d.this.f128011c, C51451d.this.f128012d, C51451d.this.f128014f);
                } else if (C51451d.this.f128013e != null) {
                    C51451d.this.f128013e.mo177122a(str);
                }
            }

            @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b.AbstractC51442a
            /* renamed from: a */
            public void mo177117a(Bitmap bitmap, AbstractC59737a.AbstractC59738a aVar) {
                ((AbstractC51438a.AbstractC51439a) C51451d.this.getModel()).mo177105a(bitmap, aVar);
            }
        };
    }

    /* renamed from: b */
    public boolean mo177130b() {
        return ((AbstractC51438a.AbstractC51441b) getView()).mo177112a();
    }

    /* renamed from: a */
    public void mo177129a(int i, final int i2, Intent intent) {
        if (i == 16) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.photoeditor.impl.ui.C51451d.RunnableC514542 */

                public void run() {
                    if (i2 == -1) {
                        ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177109a(R.string.Lark_Legacy_Success);
                    }
                    ((AbstractC51438a.AbstractC51441b) C51451d.this.getView()).mo177115d();
                }
            });
        }
    }

    public C51451d(String str, String str2, String str3, boolean z, boolean z2, String str4, Context context, View view, C51456e.AbstractC51465a aVar, AbstractC51455a aVar2) {
        this.f128009a = str2;
        this.f128013e = aVar2;
        this.f128010b = str3;
        this.f128011c = z;
        this.f128012d = z2;
        this.f128014f = str4;
        C51456e eVar = new C51456e(context, view, str, aVar);
        C51446c cVar = new C51446c();
        eVar.setViewDelegate(createViewDelegate());
        setView(eVar);
        setModel(cVar);
    }
}
