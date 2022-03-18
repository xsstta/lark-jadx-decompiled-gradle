package com.ss.android.lark.invitation.v2.feat.external.main;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.settings.v1.PushWayToAddMeSetting;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.d */
public class C40276d extends BaseModel implements AbstractC40268a.AbstractC40269a {

    /* renamed from: a */
    public AbstractC40268a.AbstractC40269a.AbstractC40270a f102339a;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m159623a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m159624b();
        super.destroy();
    }

    /* renamed from: a */
    private void m159623a() {
        C53248k.m205912a().mo181697a(Command.PUSH_WAY_TO_ADD_ME_SETTING, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.C40276d.C402771 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                try {
                    PushWayToAddMeSetting decode = PushWayToAddMeSetting.ADAPTER.decode(bArr);
                    if (C40276d.this.f102339a != null) {
                        C40276d.this.f102339a.updateAddMeSetting(decode.add_me_setting.contact_token_setting.booleanValue());
                    }
                } catch (IOException e) {
                    Log.m165383e("InviteExternalModel", "push way to add me setting failed: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: b */
    private void m159624b() {
        C53248k.m205912a().mo181696a(Command.PUSH_WAY_TO_ADD_ME_SETTING);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40269a
    /* renamed from: a */
    public void mo146069a(AbstractC40268a.AbstractC40269a.AbstractC40270a aVar) {
        this.f102339a = aVar;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.p2058a.AbstractC40273a
    /* renamed from: a */
    public void mo146080a(IGetDataCallback<Boolean> iGetDataCallback) {
        C40147z.m159162b().shouldGuideExternal(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
