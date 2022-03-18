package com.bytedance.bdturing.p210f;

import com.bytedance.bdturing.AbstractC3526b;
import com.bytedance.bdturing.twiceverify.C3582c;
import com.bytedance.bdturing.verify.request.AbstractRequest;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.bytedance.bdturing.f.c */
public class C3548c implements AbstractC3544a {
    @Override // com.bytedance.bdturing.p210f.AbstractC3544a
    /* renamed from: a */
    public boolean mo14336a(int i) {
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                return true;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
            default:
                return false;
        }
    }

    @Override // com.bytedance.bdturing.p210f.AbstractC3544a
    /* renamed from: a */
    public boolean mo14337a(AbstractRequest aVar, final AbstractC3526b bVar) {
        if (!C3582c.m15126a().mo14434b()) {
            return false;
        }
        C3582c.m15126a().mo14432a(aVar, null, new C3582c.AbstractC3584a() {
            /* class com.bytedance.bdturing.p210f.C3548c.C35491 */

            @Override // com.bytedance.bdturing.twiceverify.C3582c.AbstractC3584a
            /* renamed from: a */
            public void mo14356a() {
                bVar.mo14294b(0, null);
            }

            @Override // com.bytedance.bdturing.twiceverify.C3582c.AbstractC3584a
            /* renamed from: a */
            public void mo14357a(int i, String str) {
                bVar.mo14293a(i, null);
            }
        });
        return true;
    }
}
