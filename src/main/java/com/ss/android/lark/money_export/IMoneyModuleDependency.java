package com.ss.android.lark.money_export;

import android.content.Context;
import android.webkit.WebView;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import java.util.Locale;

public interface IMoneyModuleDependency {

    public interface IAuditDependency {
        int getLoginUserAuthorityDeniedCode();

        int getOtherUserAuthorityDeniedCode();

        String getUserAuthorityControledTip();

        void onUserAuthorityDenied(Context context, String str);
    }

    public interface IChatDependency {
        IChatParser getChatParser();

        IChatterParser getChatterParser();

        String getDisplayNameByName(Chatter chatter);

        void getLoginChatter(IGetDataCallback<Chatter> iGetDataCallback);

        boolean isGooglePlay();

        boolean isOverseaTenant();
    }

    public interface IContactDependency {
        UserRelationResponse checkUserRelationShip(String str);

        void showApplyCollabDialog(Context context, String str, String str2, String str3, IDialogCallback iDialogCallback);
    }

    public interface IDialogCallback {
        void onCancel();

        void onConfirm(boolean z, String str);

        void onDismiss();
    }

    public interface IFeatureGatingDependency {
        boolean isEnable(String str);

        boolean isEnable(String str, boolean z);
    }

    public interface IImageDependency {
        void loadAvatarImage(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    public interface ILanguageDependency {
        Locale getCacheLanguageSetting();

        Locale getLanguageSetting();
    }

    public interface ILoginDependency {
        String getLoginUserId();

        boolean isPrimaryHost();
    }

    public interface IMoneyDependency {
        void onWebViewCreate(WebView webView);
    }

    /* renamed from: com.ss.android.lark.money_export.IMoneyModuleDependency$a */
    public interface AbstractC48197a {
    }

    /* renamed from: com.ss.android.lark.money_export.IMoneyModuleDependency$b */
    public interface AbstractC48198b {
    }

    void checkPhoneNumberValid(IGetDataCallback<Boolean> iGetDataCallback);

    AbstractC48197a getAppConfigDependency();

    String getAppId();

    IAuditDependency getAuditDependency();

    AbstractC48198b getBrowserDependency();

    String getCaijingHost();

    IChatDependency getChatDependency();

    IContactDependency getContactDependency();

    Context getContext();

    String getDeviceId();

    IFeatureGatingDependency getFeatureGatingDependency();

    IImageDependency getImageDependency();

    ILanguageDependency getLanguageDependency();

    ILoginDependency getLoginDependency();

    IMoneyDependency getMoneyDependency();

    void initBytecertSdk();

    boolean isBoe();

    void openAddPhoneNumberPage(Context context);

    void openBulletSchema(Context context, String str);
}
