package com.tt.option.p3394o;

import android.app.Activity;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.tt.miniapp.p3301m.C66335f;
import com.tt.miniapp.permission.C66578b;
import com.tt.option.AbstractC67593a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.option.o.a */
public class C67661a extends AbstractC67593a<AbstractC67662b> implements AbstractC67662b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67662b mo232057b() {
        return new C66335f();
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).syncPermissionToService(iAppContext);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C67663c getPermissionCustomDialogMsgEntity(IAppContext iAppContext) {
        if (mo234790c()) {
            return ((AbstractC67662b) this.f170423a).getPermissionCustomDialogMsgEntity(iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public List<C66578b.C66579a> getUserDefinableHostPermissionList(IAppContext iAppContext) {
        if (mo234790c()) {
            return ((AbstractC67662b) this.f170423a).getUserDefinableHostPermissionList(iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void getLocalScope(JSONObject jSONObject, IAppContext iAppContext) throws JSONException {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).getLocalScope(jSONObject, iAppContext);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void setPermissionTime(int i, IAppContext iAppContext) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).setPermissionTime(i, iAppContext);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a permissionTypeToPermission(int i, IAppContext iAppContext) {
        if (mo234790c()) {
            return ((AbstractC67662b) this.f170423a).permissionTypeToPermission(i, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a scopeToBrandPermission(String str, IAppContext iAppContext) {
        if (mo234790c()) {
            return ((AbstractC67662b) this.f170423a).scopeToBrandPermission(str, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public boolean shouldFilterPermission(int i, IAppContext iAppContext) {
        if (mo234790c()) {
            return ((AbstractC67662b) this.f170423a).shouldFilterPermission(i, iAppContext);
        }
        return ((AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class)).mo50184b(i);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext, String str) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).syncPermissionToService(iAppContext, str);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void handleCustomizePermissionResult(JSONObject jSONObject, int i, boolean z) throws JSONException {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).handleCustomizePermissionResult(jSONObject, i, z);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void metaExtraNotify(String str, String str2, IAppContext iAppContext) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).metaExtraNotify(str, str2, iAppContext);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void onDeniedWhenHasRequested(Activity activity, String str, IAppContext iAppContext) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).onDeniedWhenHasRequested(activity, str, iAppContext);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void savePermissionGrant(int i, boolean z, IAppContext iAppContext) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).savePermissionGrant(i, z, iAppContext);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncAuth(String str, IAppContext iAppContext, AbstractC13298i iVar) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).syncAuth(str, iAppContext, iVar);
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public Set<C66578b.C66579a> filterNeedRequestPermission(String str, Set<C66578b.C66579a> set, IAppContext iAppContext) {
        if (mo234790c()) {
            return ((AbstractC67662b) this.f170423a).filterNeedRequestPermission(str, set, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext, String str, AbstractC13298i iVar) {
        if (mo234790c()) {
            ((AbstractC67662b) this.f170423a).syncPermissionToService(iAppContext, str, iVar);
        }
    }
}
