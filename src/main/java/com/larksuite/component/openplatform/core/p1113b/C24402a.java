package com.larksuite.component.openplatform.core.p1113b;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.apiplugin.AbstractC25915c;
import com.larksuite.framework.apiplugin.AbstractC25932d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.b.a */
public class C24402a implements AbstractC25915c {

    /* renamed from: a */
    private IAppContext f60223a;

    public C24402a(IAppContext iAppContext) {
        this.f60223a = iAppContext;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25915c
    /* renamed from: a */
    public boolean mo87198a(LKEvent lKEvent, final AbstractC25932d dVar) {
        String m = lKEvent.mo92146m();
        JSONObject n = lKEvent.mo92147n();
        final ILogger b = lKEvent.mo92134c().mo92190b();
        C66578b.C66579a a = m89061a(m, n, this.f60223a);
        if (a != null) {
            if (b != null) {
                b.mo92224i("OPCheckPermissionImpl", "event:" + m + " brandPermission" + a.f168120b);
            } else {
                Log.m165389i("OPCheckPermissionImpl", "event:" + m + " brandPermission" + a.f168120b);
            }
            AbstractC67733a aVar = (AbstractC67733a) this.f60223a.findServiceByInterface(AbstractC67733a.class);
            if (aVar != null) {
                if (b != null) {
                    b.mo92224i("OPCheckPermissionImpl", "request permission");
                } else {
                    Log.m165389i("OPCheckPermissionImpl", "request permission");
                }
                aVar.mo235103a(this.f60223a.getCurrentActivity(), m, a, new AbstractC67540b() {
                    /* class com.larksuite.component.openplatform.core.p1113b.C24402a.C244031 */

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87199a() {
                        AbstractC25932d dVar = dVar;
                        if (dVar != null) {
                            dVar.mo92251a();
                            return;
                        }
                        ILogger aVar = b;
                        if (aVar != null) {
                            aVar.mo92224i("OPCheckPermissionImpl", "check permission callback is null");
                            return;
                        }
                        Log.m165389i("OPCheckPermissionImpl", "check permission callback is null");
                    }

                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                    /* renamed from: a */
                    public void mo87200a(String str) {
                        ILogger aVar = b;
                        if (aVar != null) {
                            aVar.mo92224i("OPCheckPermissionImpl", "denied permission:" + str);
                        } else {
                            Log.m165389i("OPCheckPermissionImpl", "denied permission:" + str);
                        }
                        AbstractC25932d dVar = dVar;
                        if (dVar != null) {
                            dVar.mo92252a(str);
                            return;
                        }
                        ILogger aVar2 = b;
                        if (aVar2 != null) {
                            aVar2.mo92224i("OPCheckPermissionImpl", "check permission callback is null");
                            return;
                        }
                        Log.m165389i("OPCheckPermissionImpl", "check permission callback is null");
                    }
                });
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C66578b.C66579a m89061a(String str, JSONObject jSONObject, IAppContext iAppContext) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1925380643:
                if (str.equals("chooseAddress")) {
                    c = 0;
                    break;
                }
                break;
            case -1701611132:
                if (str.equals("chooseImage")) {
                    c = 1;
                    break;
                }
                break;
            case -1689721692:
                if (str.equals("chooseVideo")) {
                    c = 2;
                    break;
                }
                break;
            case -1330493515:
                if (str.equals("saveImageToPhotosAlbum")) {
                    c = 3;
                    break;
                }
                break;
            case -1122086302:
                if (str.equals("operateRecorder")) {
                    c = 4;
                    break;
                }
                break;
            case -886619478:
                if (str.equals("getClipboardData")) {
                    c = 5;
                    break;
                }
                break;
            case -732466452:
                if (str.equals("chooseLocation")) {
                    c = 6;
                    break;
                }
                break;
            case -316023509:
                if (str.equals("getLocation")) {
                    c = 7;
                    break;
                }
                break;
            case 94388255:
                if (str.equals("openLocation")) {
                    c = '\b';
                    break;
                }
                break;
            case 737050313:
                if (str.equals("getWifiList")) {
                    c = '\t';
                    break;
                }
                break;
            case 1576904990:
                if (str.equals("setClipboardData")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C66578b.C66579a.m260122g(iAppContext);
            case 1:
            case 2:
                JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
                if (optJSONArray != null) {
                    HashSet hashSet = new HashSet();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(optJSONArray.optString(i));
                    }
                    if (hashSet.contains("camera")) {
                        return C66578b.C66579a.m260120e(iAppContext);
                    }
                    if (hashSet.contains("album")) {
                        return C66578b.C66579a.m260121f(iAppContext);
                    }
                }
                return C66578b.C66579a.m260120e(iAppContext);
            case 3:
                return C66578b.C66579a.m260121f(iAppContext);
            case 4:
                return C66578b.C66579a.m260118d(iAppContext);
            case 5:
            case '\n':
                return C66578b.C66579a.m260125j(iAppContext);
            case 6:
            case 7:
            case '\b':
            case '\t':
                return C66578b.C66579a.m260113b(iAppContext);
            default:
                return null;
        }
    }
}
