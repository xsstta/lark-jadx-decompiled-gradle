package com.ss.android.lark.profile.func.group_profile.mvp;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView;

/* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.c */
public interface AbstractC52331c {

    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.c$a */
    public interface AbstractC52332a extends IModel {
        /* renamed from: a */
        ProfileChat mo179175a();

        /* renamed from: a */
        void mo179177a(Context context, AbstractC44896a aVar);

        /* renamed from: a */
        void mo179178a(ProfileChat profileChat);

        /* renamed from: a */
        void mo179179a(String str);

        /* renamed from: a */
        void mo179180a(String str, IGetDataCallback<ProfileChatter> iGetDataCallback);

        /* renamed from: a */
        void mo179181a(boolean z);

        /* renamed from: b */
        void mo179182b(String str);

        /* renamed from: b */
        void mo179183b(String str, IGetDataCallback<Pair<Integer, Bundle>> iGetDataCallback);

        /* renamed from: b */
        void mo179184b(boolean z);
    }

    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.c$b */
    public interface AbstractC52333b extends IView<AbstractC52334a> {

        /* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.c$b$a */
        public interface AbstractC52334a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo179194a();

            /* renamed from: a */
            void mo179195a(Context context);
        }

        /* renamed from: a */
        void mo179164a();

        /* renamed from: a */
        void mo179165a(int i, Bundle bundle);

        /* renamed from: a */
        void mo179167a(Bundle bundle);

        /* renamed from: a */
        void mo179168a(GroupProfileView.C52321a aVar);

        /* renamed from: a */
        void mo179170a(String str);

        /* renamed from: a */
        void mo179171a(String str, String str2, String str3);

        /* renamed from: a */
        boolean mo179172a(ErrorResult errorResult);

        /* renamed from: b */
        void mo179173b(String str);

        /* renamed from: c */
        void mo179174c(String str);
    }
}
