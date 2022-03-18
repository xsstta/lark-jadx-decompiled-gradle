package com.ss.android.lark.integrator.minutes;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.ss.android.lark.mm.module.share.model.C47008a;

/* renamed from: com.ss.android.lark.integrator.minutes.b */
public final class C39877b {
    /* renamed from: a */
    public static ShareParams m158361a(FragmentActivity fragmentActivity, C47008a aVar) {
        ShareParams shareParams = new ShareParams(fragmentActivity);
        shareParams.setToken(aVar.f118311a);
        shareParams.setType(aVar.f118312b);
        shareParams.setOwner(aVar.f118313c);
        shareParams.setUrl(aVar.f118314d);
        shareParams.setModule(aVar.f118315e);
        shareParams.setWiki(aVar.f118316f);
        shareParams.setPasswordSharingEnable(false);
        shareParams.setTransferOwnerEnable(aVar.f118317g);
        return shareParams;
    }
}
