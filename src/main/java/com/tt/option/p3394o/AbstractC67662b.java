package com.tt.option.p3394o;

import android.app.Activity;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.tt.miniapp.permission.C66578b;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.option.o.b */
public interface AbstractC67662b {
    Set<C66578b.C66579a> filterNeedRequestPermission(String str, Set<C66578b.C66579a> set, IAppContext iAppContext);

    void getLocalScope(JSONObject jSONObject, IAppContext iAppContext) throws JSONException;

    C67663c getPermissionCustomDialogMsgEntity(IAppContext iAppContext);

    List<C66578b.C66579a> getUserDefinableHostPermissionList(IAppContext iAppContext);

    void handleCustomizePermissionResult(JSONObject jSONObject, int i, boolean z) throws JSONException;

    void metaExtraNotify(String str, String str2, IAppContext iAppContext);

    void onDeniedWhenHasRequested(Activity activity, String str, IAppContext iAppContext);

    C66578b.C66579a permissionTypeToPermission(int i, IAppContext iAppContext);

    void savePermissionGrant(int i, boolean z, IAppContext iAppContext);

    C66578b.C66579a scopeToBrandPermission(String str, IAppContext iAppContext);

    void setPermissionTime(int i, IAppContext iAppContext);

    boolean shouldFilterPermission(int i, IAppContext iAppContext);

    void syncAuth(String str, IAppContext iAppContext, AbstractC13298i iVar);

    void syncPermissionToService(IAppContext iAppContext);

    void syncPermissionToService(IAppContext iAppContext, String str);

    void syncPermissionToService(IAppContext iAppContext, String str, AbstractC13298i iVar);
}
