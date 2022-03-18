package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import android.content.Context;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.middleground_permission_export.model.C10165f;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.c */
public class C9706c {
    /* renamed from: a */
    public static UserInfo m40177a() {
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f == null) {
            C13479a.m54758a("CollaboratorUtils", "getDefaultFolderOwner account is null!");
            return null;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setId(f.f14584a);
        userInfo.setAvatarUrl(f.f14589f);
        userInfo.setTenantId(f.f14592i);
        userInfo.setTenantName(f.f14593j);
        userInfo.setCnName(f.f14595l);
        userInfo.setEnName(f.f14596m);
        userInfo.setName(f.f14585b);
        userInfo.setOwner(true);
        userInfo.setOwnerType(0);
        userInfo.setLabel(f.f14586c);
        userInfo.setPermission(C10165f.m42295a());
        return userInfo;
    }

    /* renamed from: a */
    public static String m40178a(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 0) {
            return context.getString(R.string.Doc_Share_Collaborators);
        }
        return context.getResources().getQuantityString(R.plurals.Doc_Share_CollaboratorNum, i, Integer.valueOf(i));
    }
}
