package com.ss.android.lark.voip.p2911a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.voip.service.IVoIpNetLevelListener;
import com.ss.android.vc.service.IVideoChatService;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.voip.a.d */
public interface AbstractC57987d {

    /* renamed from: com.ss.android.lark.voip.a.d$a */
    public interface AbstractC57988a {

        /* renamed from: com.ss.android.lark.voip.a.d$a$a */
        public interface AbstractC57989a {
            /* renamed from: a */
            void mo196618a(Bundle bundle);
        }

        /* renamed from: a */
        Bundle mo145501a(String str, String str2, AbstractC57989a aVar);

        /* renamed from: a */
        Chatter mo145502a();

        /* renamed from: a */
        Chatter mo145503a(String str);

        /* renamed from: a */
        String mo145504a(Chatter chatter);

        /* renamed from: a */
        String mo145505a(OpenChatter openChatter);

        /* renamed from: b */
        Chat mo145506b(String str);
    }

    /* renamed from: com.ss.android.lark.voip.a.d$b */
    public interface AbstractC57990b {
        /* renamed from: a */
        String mo145486a();

        /* renamed from: b */
        String mo145487b();
    }

    /* renamed from: com.ss.android.lark.voip.a.d$c */
    public interface AbstractC57991c {
        /* renamed from: a */
        Object mo145509a(String str, String str2, int i, int i2);

        /* renamed from: a */
        void mo145510a(Context context, String str, String str2, String str3, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.voip.a.d$d */
    public interface AbstractC57992d {
        /* renamed from: a */
        Intent mo145482a(Context context, String str, Bundle bundle);

        /* renamed from: a */
        Bundle mo145483a(Bundle bundle);

        /* renamed from: a */
        String mo145484a();

        /* renamed from: a */
        void mo145485a(Context context);
    }

    /* renamed from: com.ss.android.lark.voip.a.d$e */
    public interface AbstractC57993e {

        /* renamed from: com.ss.android.lark.voip.a.d$e$a */
        public interface AbstractC57994a {
            void onChanged(boolean z);
        }

        /* renamed from: a */
        void mo145472a(View view);

        /* renamed from: a */
        void mo145473a(AbstractC57994a aVar);

        /* renamed from: a */
        boolean mo145474a();

        /* renamed from: b */
        void mo145475b(View view);
    }

    /* renamed from: com.ss.android.lark.voip.a.d$f */
    public interface AbstractC57995f {
        /* renamed from: a */
        void mo145488a(String str);

        /* renamed from: a */
        void mo145489a(String str, String str2);

        /* renamed from: a */
        boolean mo145490a(int i);

        /* renamed from: b */
        void mo145491b(String str);

        /* renamed from: b */
        boolean mo145492b(int i);

        /* renamed from: c */
        String mo145493c(int i);
    }

    /* renamed from: com.ss.android.lark.voip.a.d$g */
    public interface AbstractC57996g {
        /* renamed from: a */
        long mo145507a();

        /* renamed from: a */
        boolean mo145508a(boolean z);
    }

    /* renamed from: com.ss.android.lark.voip.a.d$h */
    public interface AbstractC57997h {
        /* renamed from: a */
        void mo145476a(Context context, OpenChatter openChatter, IVideoChatService.AbstractC63627b bVar);

        /* renamed from: a */
        boolean mo145477a();

        /* renamed from: b */
        boolean mo145478b();

        /* renamed from: c */
        void mo145479c();

        /* renamed from: d */
        boolean mo145480d();

        /* renamed from: e */
        void mo145481e();
    }

    /* renamed from: com.ss.android.lark.voip.a.d$i */
    public interface AbstractC57998i {

        /* renamed from: com.ss.android.lark.voip.a.d$i$a */
        public interface AbstractC57999a {
            /* renamed from: a */
            void mo196612a(boolean z);
        }

        /* renamed from: a */
        void mo145495a(AbstractC57999a aVar);

        /* renamed from: a */
        void mo145496a(IVoIpNetLevelListener bVar);

        /* renamed from: b */
        void mo145497b(IVoIpNetLevelListener bVar);
    }

    AbstractC57981a getAppConfigurationDependency();

    AbstractC57983b getAppStateDependency();

    AbstractC57988a getChatDependency();

    Context getContext();

    String getDeviceId();

    AbstractC57990b getFeedDependency();

    AbstractC57991c getImageDependency();

    Locale getLanguageSetting();

    AbstractC57985c getLoginDependency();

    AbstractC57992d getMainDependency();

    AbstractC57993e getMultiTaskDependency();

    AbstractC57995f getNotificationDependency();

    AbstractC57996g getSettingDependency();

    String getUserId();

    AbstractC57997h getVideoChatDependency();

    Map<String, Boolean> getVoIPFeatureMap();

    AbstractC57998i getWsChannelDependency();

    void initVideoChat();

    boolean isAppRealForeground();

    boolean isGooglePlay();

    boolean isOverseaTenantBrand();

    boolean isPreReleaseenv();

    boolean isProductionEnv();
}
