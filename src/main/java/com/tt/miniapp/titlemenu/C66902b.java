package com.tt.miniapp.titlemenu;

import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.titlemenu.b */
public class C66902b extends AbstractC67550j {

    /* renamed from: a */
    public static final List<String> f168764a = new ArrayList();

    /* renamed from: b */
    private static C66467o.AbstractC66469a f168765b = new C66467o.AbstractC66469a() {
        /* class com.tt.miniapp.titlemenu.C66902b.C669031 */

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: e */
        public void mo230319e() {
            AppBrandLogger.m52828d("tma_AppbrandTitleMenuDialog", "onLoginWhenBackground");
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: f */
        public void mo230320f() {
            AppBrandLogger.m52828d("tma_AppbrandTitleMenuDialog", "onLoginUnSupport");
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: c */
        public void mo230317c() {
            AppBrandLogger.m52828d("tma_AppbrandTitleMenuDialog", "onTriggerHostClientLogin");
            C66902b.m260912b().f168766a = true;
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: b */
        public void mo230316b() {
            AppBrandLogger.m52828d("tma_AppbrandTitleMenuDialog", "onLoginSuccess");
            for (AbstractC66906c cVar : C66902b.m260912b().f168767b) {
                cVar.mo232927a();
            }
        }

        @Override // com.tt.miniapp.manager.C66467o.AbstractC66469a
        /* renamed from: d */
        public void mo230318d() {
            AppBrandLogger.m52828d("tma_AppbrandTitleMenuDialog", "onLoginFail");
            for (AbstractC66905b bVar : C66902b.m260912b().f168768c) {
                bVar.mo232926a();
            }
        }
    };

    /* renamed from: com.tt.miniapp.titlemenu.b$a */
    public static class C66904a {

        /* renamed from: a */
        public boolean f168766a;

        /* renamed from: b */
        public List<AbstractC66906c> f168767b = new ArrayList();

        /* renamed from: c */
        public List<AbstractC66905b> f168768c = new ArrayList();
    }

    /* renamed from: com.tt.miniapp.titlemenu.b$b */
    interface AbstractC66905b {
        /* renamed from: a */
        void mo232926a();
    }

    /* renamed from: com.tt.miniapp.titlemenu.b$c */
    interface AbstractC66906c {
        /* renamed from: a */
        void mo232927a();
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return null;
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public <T> String mo49104a(String str, AbstractC67550j.AbstractC67551a<T> aVar) {
        return null;
    }

    /* renamed from: b */
    public static C66904a m260912b() {
        return ContextSingletonInstance.getInstance().menuDialogDataInstance;
    }

    public C66902b(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public boolean mo49465a(int i, int i2, Intent intent) {
        C66467o.AbstractC66469a aVar;
        if (!m260912b().f168766a || (aVar = f168765b) == null) {
            return false;
        }
        return C66467o.m259791a(i, i2, intent, aVar, this.f170359f);
    }
}
