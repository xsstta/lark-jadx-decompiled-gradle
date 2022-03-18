package com.bytedance.ee.bear.basesdk.apiimpl;

import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.basesdk.api.AbstractC4390n;
import com.bytedance.ee.bear.basesdk.api.AbstractC4394r;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.lark.p413a.C7962a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.AskOwnerPanel;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPermissionManager;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.share.newshare.ShareDocFragment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.o */
public class C4411o implements AbstractC4390n {
    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4390n
    /* renamed from: a */
    public DialogInterface$OnCancelListenerC1021b mo17074a(ShareParams shareParams) {
        shareParams.setSource(2);
        return ShareDocFragment.m45635a(shareParams, (Bundle) null);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4390n
    /* renamed from: a */
    public void mo17076a(C7962a aVar) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(aVar.mo30882h());
        userInfo.setName(aVar.mo30883i());
        userInfo.setCnName(aVar.mo30883i());
        userInfo.setEnName(aVar.mo30883i());
        userInfo.setAvatarUrl(aVar.mo30884j());
        userInfo.setExternal(aVar.mo30881g());
        userInfo.setOwnerType(aVar.mo30880f());
        ArrayList arrayList = new ArrayList();
        arrayList.add(userInfo);
        if (aVar.mo30874a() == null) {
            C13479a.m54758a("AskOwnerImpl", "showAskOwnerPanel()..activity is null!!!");
        } else {
            AskOwnerPanel.m40094a(aVar.mo30874a(), aVar.mo30876b(), aVar.mo30877c(), aVar.mo30878d(), aVar.mo30879e(), arrayList, 2, C8275a.m34050a(aVar.mo30877c()), "", false);
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4390n
    /* renamed from: a */
    public void mo17075a(int i, String str, int i2, String str2, int i3, final AbstractC4394r rVar) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(str2);
        userInfo.setOwnerType(i2);
        C13479a.m54764b("AskOwnerImpl", "ownerType = " + i2 + " ownerId = " + str2);
        DocPermissionManager.m41999a(i, str, userInfo, i3, new AbstractC4394r() {
            /* class com.bytedance.ee.bear.basesdk.apiimpl.C4411o.C44121 */

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17110a() {
                rVar.mo17110a();
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17111a(int i) {
                rVar.mo17111a(i);
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17112a(Throwable th) {
                rVar.mo17112a(th);
                if (C5203d.m21235a(th, 10040)) {
                    Toast.showFailureText(C13615c.f35773a, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
                }
            }
        });
    }
}
