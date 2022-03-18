package com.ss.android.lark.invite_new_tenant.service;

import com.ss.android.lark.invite_new_tenant.invite.single.mobile.entity.MobileCode;
import java.util.ArrayList;

public interface IInviteNewTenantService {

    public enum ContactType {
        MOBILE,
        EMAIL
    }

    /* renamed from: com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService$a */
    public static class C40630a {

        /* renamed from: a */
        public ArrayList<MobileCode> f103056a = new ArrayList<>();

        /* renamed from: b */
        public ArrayList<MobileCode> f103057b = new ArrayList<>();
    }

    /* renamed from: com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService$b */
    public static class C40631b {

        /* renamed from: a */
        public boolean f103058a = true;
    }
}
