package com.ss.android.lark.profile.func.manis;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.profile.dto.ErrorResultWrapper;
import com.ss.android.lark.profile.service.C52893d;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.service.IProfileManisService;

@RemoteServiceImpl(service = IProfileManisService.class)
public class ProfileManisServiceImpl implements IProfileManisService {
    private Context mContext;

    public ProfileManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.profile.service.IProfileManisService
    public void startContactsProfileActivityByChatterId(String str) {
        C52904e.m204638a().mo105573a(this.mContext, str, (String) null, new ContactSource.C29531a().mo104726a(0).mo104728a());
    }

    @Override // com.ss.android.lark.profile.service.IProfileManisService
    public void fetchUserProfile(String str, final IProfileManisService.AbstractC52889a aVar) {
        C52893d.m204612b().mo180508a(str, new IGetDataCallback<ProfileResponse>() {
            /* class com.ss.android.lark.profile.func.manis.ProfileManisServiceImpl.C523431 */

            /* renamed from: a */
            public void onSuccess(ProfileResponse profileResponse) {
                IProfileManisService.AbstractC52889a aVar = aVar;
                if (aVar != null) {
                    aVar.onSuccess(profileResponse);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IProfileManisService.AbstractC52889a aVar = aVar;
                if (aVar != null) {
                    aVar.onError(new ErrorResultWrapper(errorResult));
                }
            }
        });
    }
}
