package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.titlemenu.C66913e;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.tt.miniapp.titlemenu.item.a */
public class C66914a extends C66937e {

    /* renamed from: a */
    public C66899a f168783a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "about";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f168783a;
    }

    public C66914a(final Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168783a = aVar;
        aVar.setIcon(activity.getDrawable(2131234573));
        this.f168783a.setLabel(activity.getString(R.string.microapp_m_about));
        this.f168783a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66914a.View$OnClickListenerC669151 */

            public void onClick(View view) {
                C66913e.m260951a("mp_about_btn_click", iAppContext);
                DialogC66908d.m260930a(iAppContext).dismiss();
                if (!HostDependManager.getInst().startAboutActivity(activity, iAppContext)) {
                    Log.m165379d("AboutMenuItem", "can not start about");
                }
            }
        });
        this.f168783a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66914a.View$OnLongClickListenerC669162 */

            public boolean onLongClick(View view) {
                ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(iAppContext).getService(SnapshotServiceImpl.class);
                AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
                if (appInfo != null && iSnapshotService.enableSnapshot(appInfo.version, appInfo.isPreview()) && iSnapshotService.checkSnapshotExist(appInfo.version)) {
                    C66899a aVar = C66914a.this.f168783a;
                    aVar.setLabel(activity.getString(R.string.microapp_m_about) + "(snapshot)");
                }
                return true;
            }
        });
    }
}
