package com.ss.android.lark.profile.func.share_profile.p2524a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.profile.func.share_profile.a.a */
public class C52461a {

    /* renamed from: a */
    public static IProfileModuleDependency.AbstractC52246c f129927a = C52239a.m202617d().mo133586p();

    /* renamed from: a */
    public static void m203281a(final IGetDataCallback<ShareProfileQRCodeView.C52515a> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.profile.func.share_profile.p2524a.C52461a.RunnableC524621 */

            public void run() {
                ProfileChatter a = C52461a.f129927a.mo133600a();
                if (a != null) {
                    iGetDataCallback.onSuccess(C52461a.m203282b(a));
                } else {
                    iGetDataCallback.onError(new ErrorResult("profileChatter is null"));
                }
            }
        });
    }

    /* renamed from: b */
    public static void m203283b(final IGetDataCallback<ShareProfileUrlView.C52535a> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.profile.func.share_profile.p2524a.C52461a.RunnableC524632 */

            public void run() {
                ProfileChatter a = C52461a.f129927a.mo133600a();
                if (a != null) {
                    iGetDataCallback.onSuccess(C52461a.m203280a(a));
                } else {
                    iGetDataCallback.onError(new ErrorResult("profileChatter is null"));
                }
            }
        });
    }

    /* renamed from: b */
    public static ShareProfileQRCodeView.C52515a m203282b(ProfileChatter profileChatter) {
        ShareProfileQRCodeView.C52515a aVar = new ShareProfileQRCodeView.C52515a();
        aVar.f129984a = f129927a.mo133612b(profileChatter.getId());
        aVar.f129985b = profileChatter.getId();
        aVar.f129986c = profileChatter.getAvatarKey();
        return aVar;
    }

    /* renamed from: a */
    public static ShareProfileUrlView.C52535a m203280a(ProfileChatter profileChatter) {
        ShareProfileUrlView.C52535a aVar = new ShareProfileUrlView.C52535a();
        if (profileChatter == null) {
            return aVar;
        }
        aVar.f130011a = C52239a.m202617d().mo133586p().mo133612b(profileChatter.getId());
        aVar.f130013c = profileChatter.getAvatarKey();
        aVar.f130012b = profileChatter.getId();
        return aVar;
    }
}
