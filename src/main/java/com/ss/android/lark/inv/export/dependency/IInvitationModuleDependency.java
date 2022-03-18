package com.ss.android.lark.inv.export.dependency;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import java.util.List;
import java.util.Locale;

public interface IInvitationModuleDependency {

    /* renamed from: com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency$a */
    public interface AbstractC40085a {
        /* renamed from: a */
        String mo145575a(String str, String str2, String str3, String str4);
    }

    /* renamed from: com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency$b */
    public interface AbstractC40086b {
        /* renamed from: a */
        Fragment mo145576a(Object obj, Object obj2, String str);

        /* renamed from: a */
        void mo145577a(Context context);

        /* renamed from: a */
        void mo145578a(Context context, String str, String str2, C36516a aVar);

        /* renamed from: a */
        void mo145579a(boolean z, IGetDataCallback<?> iGetDataCallback);

        /* renamed from: a */
        boolean mo145580a();

        /* renamed from: b */
        boolean mo145581b();
    }

    /* renamed from: com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency$c */
    public interface AbstractC40087c {
        /* renamed from: a */
        String mo145582a();

        /* renamed from: a */
        void mo145583a(Activity activity, int i, int i2, int i3);

        /* renamed from: a */
        void mo145584a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo145585a(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        String mo145586b();

        /* renamed from: c */
        String mo145587c();

        /* renamed from: d */
        String mo145588d();

        /* renamed from: e */
        boolean mo145589e();

        /* renamed from: f */
        String mo145590f();

        /* renamed from: g */
        String mo145591g();
    }

    /* renamed from: com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency$d */
    public interface AbstractC40088d {
        /* renamed from: a */
        void mo145592a(Context context, ShareEntity shareEntity);
    }

    void bizReport(List<String> list);

    Bitmap encodeQRCode(String str, int i, int i2, int i3);

    AbstractC40085a getChatDependency();

    AbstractC40086b getContactDependency();

    Context getContext();

    C24258a getDynamicRouter();

    AbstractC24152a getH5Service();

    Locale getLocale();

    AbstractC40087c getLoginDependency();

    AbstractC40088d getThirdShareDependency();

    Activity getTopActivity();

    boolean isEnLanguage();

    boolean isFgEnable(String str);

    boolean isGooglePlay();

    boolean isLarkEnv();

    void openF2fGroupPage(Activity activity);

    void openInviteInactiveParentListActivity(Context context, String str, String str2, int i);

    void openLdrGuidePage(Context context, boolean z, String str);

    void openProfile(Context context, Object obj, int i);

    void openProfileForResult(Context context, Object obj, int i, int i2);

    void openTeamSettingsPage(Context context, String str);

    void openUrl(String str);

    void startScanQRCodeActivity(Activity activity);
}
