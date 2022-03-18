package com.ss.android.lark.dynamic_so.ipc_server;

import android.content.Context;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.dynamic_so.C36875a;
import com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a;
import com.ss.android.lark.dynamic_so.p1818b.C36879a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = AbstractC36881b.class)
/* renamed from: com.ss.android.lark.dynamic_so.ipc_server.a */
public class C36880a implements AbstractC36881b {

    /* renamed from: a */
    private Context f94805a;

    /* renamed from: a */
    private boolean m145549a() {
        AbstractC36878a a = C36875a.m145538a();
        if (a.mo133155a()) {
            Log.m165389i("DynamicSoIPCServerImpl", "isLarkEnv true");
            return false;
        } else if (a.mo133157b()) {
            Log.m165389i("DynamicSoIPCServerImpl", "isPrivateKABuildPackage true");
            return false;
        } else if (C26284k.m95185a(this.f94805a)) {
            return false;
        } else {
            return true;
        }
    }

    public C36880a(Context context) {
        this.f94805a = context;
    }

    @Override // com.ss.android.lark.dynamic_so.ipc_server.AbstractC36881b
    public boolean checkSoNeedUpdate(String str) {
        if (!m145549a()) {
            return false;
        }
        return C36879a.m145548b(this.f94805a, str);
    }
}
