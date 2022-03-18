package com.larksuite.component.openplatform.core.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12792j;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1100a.AbstractC24362a;
import com.larksuite.component.openplatform.api.p1100a.p1101a.AbstractC24363a;
import com.larksuite.component.openplatform.api.p1100a.p1102b.AbstractC24364a;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24509c;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.core.utils.p1136a.C25526b;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;
import com.tt.miniapphost.util.DebugUtil;

/* renamed from: com.larksuite.component.openplatform.core.component.a */
public abstract class AbstractC24428a extends AbstractC25922a implements AbstractC24362a {

    /* renamed from: a */
    public Context f60283a;

    /* renamed from: b */
    public IAppContext f60284b;

    /* renamed from: c */
    public AbstractC24363a f60285c;

    /* renamed from: d */
    public FrameLayout f60286d = new FrameLayout(this.f60283a);

    /* renamed from: e */
    protected String f60287e;

    /* renamed from: f */
    public String f60288f;

    /* renamed from: g */
    private AbstractC24509c f60289g;

    @Override // com.larksuite.component.openplatform.api.p1100a.AbstractC24362a
    /* renamed from: a */
    public void mo87116a(String str) {
    }

    /* renamed from: h */
    public abstract AbstractC24364a mo87219h();

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public Context mo49749b() {
        return this.f60283a;
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.AbstractC24362a
    /* renamed from: c */
    public View mo87117c() {
        return this.f60286d;
    }

    /* renamed from: g */
    public AbstractC24363a mo87218g() {
        return this.f60285c;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public void ah_() {
        super.ah_();
        mo87160f();
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: d */
    public void mo87158d() {
        AbstractC24363a aVar = this.f60285c;
        if (aVar == null) {
            AppBrandLogger.m52830i("OP_SDK_OPBaseComponentImpl", "no render : onShow");
            return;
        }
        aVar.mo87158d();
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: e */
    public void mo87159e() {
        AbstractC24363a aVar = this.f60285c;
        if (aVar == null) {
            AppBrandLogger.m52830i("OP_SDK_OPBaseComponentImpl", "no render : onHide");
            return;
        }
        aVar.mo87159e();
    }

    @Override // com.larksuite.component.openplatform.api.lifecycle.AbstractC24378a
    /* renamed from: f */
    public void mo87160f() {
        AbstractC24363a aVar = this.f60285c;
        if (aVar == null) {
            AppBrandLogger.m52830i("OP_SDK_OPBaseComponentImpl", "no render : OnDestroy");
            return;
        }
        aVar.mo87160f();
        this.f60283a = null;
        this.f60284b = null;
    }

    /* renamed from: i */
    private void mo87228i() {
        if (this.f60285c == null) {
            AppBrandLogger.m52829e("OP_SDK_OPBaseComponentImpl", "not bind render.");
        } else if (!TextUtils.isEmpty(this.f60287e)) {
            if (C25529d.m91147a(this.f60287e)) {
                C12792j.m52871a(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.component.AbstractC24428a.RunnableC244291 */

                    public void run() {
                        AbstractC24428a.this.f60285c.mo87120a(AbstractC24428a.this.f60287e, AbstractC24428a.this.f60288f);
                    }
                });
            } else if (this.f60289g == null) {
                AppBrandLogger.m52829e("OP_SDK_OPBaseComponentImpl", "file reader is null");
                return;
            } else {
                AppBrandLogger.m52830i("OP_SDK_OPBaseComponentImpl", "start render with path : " + this.f60287e);
                final byte[] a = this.f60289g.mo87364a(this.f60287e);
                C12792j.m52871a(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.component.AbstractC24428a.RunnableC244302 */

                    public void run() {
                        AbstractC24428a.this.f60285c.mo87121a(a, AbstractC24428a.this.f60288f);
                    }
                });
            }
            C12792j.m52871a(new Runnable() {
                /* class com.larksuite.component.openplatform.core.component.AbstractC24428a.RunnableC244313 */

                public void run() {
                    AbstractC24428a.this.f60286d.addView(AbstractC24428a.this.f60285c.ag_(), new FrameLayout.LayoutParams(-1, -1));
                }
            });
        } else if (!DebugUtil.debug()) {
            AppBrandLogger.m52829e("OP_SDK_OPBaseComponentImpl", "component path is empty.");
        } else {
            throw new RuntimeException("mComponentPath error");
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1100a.AbstractC24362a
    /* renamed from: a */
    public void mo87115a(AbstractC24363a aVar) {
        C25526b.m91116a("op_render_lib_load_start", this.f60284b, null, null, null);
        this.f60285c = aVar;
        View ag_ = aVar.ag_();
        if (ag_ == null) {
            AppBrandLogger.m52830i("OP_SDK_OPBaseComponentImpl", "no render view");
        } else if (ag_.getParent() != null) {
            AppBrandLogger.m52830i("OP_SDK_OPBaseComponentImpl", "render has parent");
        } else {
            mo87228i();
        }
    }

    public AbstractC24428a(C24436d dVar, IAppContext iAppContext) {
        this.f60283a = dVar.f60298d;
        this.f60284b = iAppContext;
        this.f60289g = dVar.f60297c;
        this.f60288f = dVar.f60296b;
        this.f60287e = dVar.f60295a;
    }
}
