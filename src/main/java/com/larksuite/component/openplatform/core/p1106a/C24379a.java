package com.larksuite.component.openplatform.core.p1106a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.plugin_annotation.bean.Scope;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.AbstractC24365b;
import com.larksuite.component.openplatform.api.AbstractC24367c;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24372a;
import com.larksuite.component.openplatform.core.p1121d.C24498b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.p1142a.AbstractC25556c;
import com.larksuite.component.openplatform.plugins.p1142a.C25552a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.core.AbstractC25922a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.ss.android.lark.log.Log;
import com.tt.refer.common.base.AppType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.core.a.a */
public class C24379a extends AbstractC25922a implements AbstractC24365b {

    /* renamed from: a */
    private String f60163a;

    /* renamed from: b */
    private final List<AbstractC24361a> f60164b = new ArrayList();

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b, com.larksuite.framework.apiplugin.core.AbstractC25922a
    public void ah_() {
        super.ah_();
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public Context mo49749b() {
        AbstractC24367c c = C24401b.m89051c();
        if (!(c instanceof AbstractC25891b)) {
            return null;
        }
        Log.m165389i("OP_SDK_OPApplicationImpl", "getContext");
        return ((AbstractC25891b) c).mo49749b();
    }

    /* renamed from: c */
    private void m88972c() {
        AbstractC25937e a;
        AbstractC25904o u = mo92183u();
        AbstractC25556c cVar = (AbstractC25556c) C24498b.m89361a().mo87139a(AbstractC25556c.class);
        if (cVar != null && (a = cVar.mo88696a(new C25552a.C25554a().mo88691a(Scope.APPLICATION).mo88693a(u).mo88694a())) != null) {
            Log.m165389i("OP_SDK_OPApplicationImpl", "register plugin :" + a.getClass().getName());
            u.mo92199a(a);
        }
    }

    public C24379a(String str) {
        this.f60163a = str;
        m88972c();
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24365b
    /* renamed from: a */
    public AbstractC24361a mo87126a(OPContainerBundle oPContainerBundle) {
        if (!m88971b(oPContainerBundle)) {
            return null;
        }
        synchronized (this.f60164b) {
            AbstractC24372a aVar = (AbstractC24372a) C24498b.m89361a().mo87139a(AbstractC24372a.class);
            if (aVar == null) {
                AppBrandLogger.m52830i("OP_SDK_OPApplicationImpl", "not support any AppContainer.");
                m88970a(oPContainerBundle, "20009", "CONTAINER_STATUS_MSG_NO_APP_NO_CONTAINER_PROVIDER");
                return null;
            }
            AbstractC24361a a = aVar.mo87138a(oPContainerBundle, this.f60163a);
            if (a == null) {
                return null;
            }
            a.mo92177a(this);
            this.f60164b.add(a);
            AppBrandLogger.m52830i("OP_SDK_OPApplicationImpl", "containers`s size:" + this.f60164b.size());
            return a;
        }
    }

    /* renamed from: b */
    private boolean m88971b(OPContainerBundle oPContainerBundle) {
        if (oPContainerBundle == null) {
            AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "invalid params.");
            return false;
        } else if (oPContainerBundle.mo87154e() == null) {
            AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "no container state listener");
            return false;
        } else if (!(oPContainerBundle.mo87153d() instanceof Activity)) {
            AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "init context only support activity context");
            m88970a(oPContainerBundle, "20011", "CONTAINER_STATUS_MSG_NO_APP_NO_SUPPORT_CONTEXT");
            return false;
        } else if (TextUtils.isEmpty(this.f60163a)) {
            AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "no app id");
            m88970a(oPContainerBundle, "20005", "CONTAINER_STATUS_MSG_NO_APP_NO_APP_ID");
            return false;
        } else {
            Bundle c = oPContainerBundle.mo87152c();
            if (c == null) {
                AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "invalid params. startParams is null");
                m88970a(oPContainerBundle, "20008", "CONTAINER_STATUS_MSG_NO_APP_NO_APP_PARAMS");
                return false;
            }
            Serializable b = C25529d.m91149b(c, C24377a.f60160e);
            if (b == null) {
                AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "invalid params. not set AppType to Bundle");
                m88970a(oPContainerBundle, "20006", "CONTAINER_STATUS_MSG_NO_APP_NO_APP_TYPE");
                return false;
            }
            AppType appType = null;
            if (b instanceof AppType) {
                appType = (AppType) b;
            }
            if (appType != AppType.GadgetAPP || (oPContainerBundle.mo87153d() instanceof FragmentActivity)) {
                String a = C25529d.m91139a(c, C24377a.f60157b);
                String a2 = C25529d.m91139a(c, C24377a.f60159d);
                if (!TextUtils.isEmpty(a) || !TextUtils.isEmpty(a2)) {
                    return true;
                }
                AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "invalid params. not set AppIdentify/Url to Bundle");
                m88970a(oPContainerBundle, "20007", "CONTAINER_STATUS_MSG_NO_APP_NO_APP_IDENTIFY");
                return false;
            }
            AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "init context only support fragment activity for gadget");
            m88970a(oPContainerBundle, "20012", "CONTAINER_STATUS_MSG_NEED_FRAGMENT_ACTIVITY");
            return false;
        }
    }

    @Override // com.larksuite.component.openplatform.api.AbstractC24365b
    /* renamed from: a */
    public boolean mo87127a(AbstractC24361a aVar) {
        if (aVar == null) {
            AppBrandLogger.m52829e("OP_SDK_OPApplicationImpl", "container is null");
            return false;
        }
        synchronized (this.f60164b) {
            if (!this.f60164b.remove(aVar)) {
                AppBrandLogger.m52831w("OP_SDK_OPApplicationImpl", "Current Application not contains this container.");
                return false;
            }
            aVar.ah_();
            aVar.mo92177a((AbstractC25891b) null);
            if (this.f60164b.isEmpty()) {
                C24401b.m89051c().mo87133b(this.f60163a);
            }
            return true;
        }
    }

    /* renamed from: a */
    private void m88970a(OPContainerBundle oPContainerBundle, String str, String str2) {
        AbstractC24370c e;
        if (oPContainerBundle != null && (e = oPContainerBundle.mo87154e()) != null) {
            e.mo49119a(str, str2);
        }
    }
}
