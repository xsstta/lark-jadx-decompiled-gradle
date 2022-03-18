package com.ss.android.lark.profile.func.user_profile.mvp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingInitData;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import com.ss.android.lark.profile.func.user_profile.infos.alias.AliasItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.phone_number.PhoneNumberItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.status.StatusItemViewData;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract;", "", "IModel", "IView", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.b.a */
public interface IUserProfileContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u0001MJ\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH&J\n\u0010\u0014\u001a\u0004\u0018\u00010\tH&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\tH&J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001c\u001a\u00020\tH&J\b\u0010\u001d\u001a\u00020\u001eH&J\n\u0010\u001f\u001a\u0004\u0018\u00010 H&J\b\u0010!\u001a\u00020\u0006H&J\n\u0010\"\u001a\u0004\u0018\u00010#H&J\n\u0010$\u001a\u0004\u0018\u00010%H&J\u0016\u0010&\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020'0\u0005H&J\n\u0010(\u001a\u0004\u0018\u00010'H&J\n\u0010)\u001a\u0004\u0018\u00010*H&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020-H&J\n\u0010.\u001a\u0004\u0018\u00010\tH&J\n\u0010/\u001a\u0004\u0018\u00010\tH&J\n\u00100\u001a\u0004\u0018\u00010\tH&J\n\u00101\u001a\u0004\u0018\u00010\tH&J\b\u00102\u001a\u00020\tH&J\b\u00103\u001a\u00020\u0006H&J\b\u00104\u001a\u00020\u0006H&J\b\u00105\u001a\u00020\u0006H&J\b\u00106\u001a\u00020\u0006H&J\b\u00107\u001a\u00020\u0006H&J\b\u00108\u001a\u00020\u0006H&J\b\u00109\u001a\u00020\u0006H&J\b\u0010:\u001a\u00020\u0006H&J\b\u0010;\u001a\u00020\u0006H&J\u001e\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&J\u001e\u0010>\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020'0\u0005H&J\b\u0010?\u001a\u00020\u0003H&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020BH&J\b\u0010C\u001a\u00020\u0006H&J\b\u0010D\u001a\u00020\u0006H&J\b\u0010E\u001a\u00020\u0006H&J\b\u0010F\u001a\u00020\u0006H&J\b\u0010G\u001a\u00020\u0006H&J\u0012\u0010H\u001a\u00020\u00032\b\u0010I\u001a\u0004\u0018\u00010\tH&J\u0010\u0010J\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u001eH&J\u0010\u0010L\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006N"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "acceptAddFriendRequest", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "completeGuide", "key", "", "createP2pSecretChat", "createSingleNameCard", "context", "Landroid/app/Activity;", "deleteSingleNameCard", "getActionBtnViewData", "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "getAliasItemViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/alias/AliasItemViewData;", "getAvatarKey", "getChatId", "getContactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "getContactType", "getDescreptionItem", "Lcom/ss/android/lark/profile/func/user_profile/infos/status/StatusItemViewData;", "spansResult", "Lcom/ss/android/lark/widget/span/RecogniseSpansResult;", "getEncryptUserId", "getFriendStatus", "", "getHeaderViewData", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "getIsFirstStartSecretChat", "getPhoneNumberItem", "Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/PhoneNumberItemViewData;", "getProfileFinishResult", "Lcom/ss/android/lark/profile/dto/ProfileFinishResult;", "getProfileInfo", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "getProfileInfoFromLocal", "getProfileSettingInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "getRecogniseSpansResult", "description", "Lcom/ss/android/lark/WidgetModuleDependency$GetRecognizeSpanResultCallBack;", "getReportUrl", "getTenantName", "getToken", "getUserId", "getUserName", "isBlocked", "isExternal", "isLoginUser", "isNameCard", "isResigned", "isShowPhoneCallTimeSet", "isShowReportMenu", "isShowTenantCertification", "isTenantCertification", "queryPhoneNumber", "activity", "setBlock", "setIsFirstStartSecretChat", "setModelDelegate", "delegate", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel$IModelDelegate;", "showEmergencyCall", "showEnterprisePhoneCall", "showPhoneCall", "showShareProfileMenu", "showVoiceCall", "updateAlias", "alias", "updateFriendStatus", "friendStatus", "updateSingleNameCard", "IModelDelegate", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel$IModelDelegate;", "", "onMineAvatarUpdate", "", "profileChatter", "Lcom/ss/android/lark/profile/dto/ProfileChatter;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.a$a$a */
        public interface IModelDelegate {
            /* renamed from: a */
            void mo179660a(ProfileChatter profileChatter);
        }

        /* renamed from: A */
        ProfileFinishResult mo179613A();

        /* renamed from: B */
        String mo179614B();

        /* renamed from: C */
        String mo179615C();

        /* renamed from: D */
        boolean mo179616D();

        /* renamed from: E */
        boolean mo179617E();

        /* renamed from: F */
        int mo179618F();

        /* renamed from: G */
        boolean mo179619G();

        /* renamed from: a */
        UserProfileViewData mo179620a();

        /* renamed from: a */
        StatusItemViewData mo179621a(RecogniseSpansResult recogniseSpansResult);

        /* renamed from: a */
        void mo179622a(int i);

        /* renamed from: a */
        void mo179623a(Activity activity);

        /* renamed from: a */
        void mo179624a(Activity activity, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo179625a(IGetDataCallback<UserProfileViewData> iGetDataCallback);

        /* renamed from: a */
        void mo179626a(IModelDelegate aVar);

        /* renamed from: a */
        void mo179627a(String str);

        /* renamed from: a */
        void mo179628a(String str, C37030f.AbstractC37031a aVar);

        /* renamed from: a */
        void mo179629a(boolean z, IGetDataCallback<UserProfileViewData> iGetDataCallback);

        /* renamed from: b */
        String mo179630b();

        /* renamed from: b */
        void mo179631b(Activity activity);

        /* renamed from: b */
        void mo179632b(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo179633b(String str);

        /* renamed from: c */
        void mo179634c(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        boolean mo179635c();

        /* renamed from: d */
        AliasItemViewData mo179636d();

        /* renamed from: d */
        void mo179637d(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: e */
        String mo179638e();

        /* renamed from: f */
        String mo179639f();

        /* renamed from: g */
        boolean mo179640g();

        /* renamed from: h */
        boolean mo179641h();

        /* renamed from: i */
        void mo179642i();

        /* renamed from: j */
        boolean mo179643j();

        /* renamed from: k */
        boolean mo179644k();

        /* renamed from: l */
        boolean mo179645l();

        /* renamed from: m */
        boolean mo179646m();

        /* renamed from: n */
        boolean mo179647n();

        /* renamed from: o */
        boolean mo179648o();

        /* renamed from: p */
        boolean mo179649p();

        /* renamed from: q */
        ProfileSettingInitData mo179650q();

        /* renamed from: r */
        PhoneNumberItemViewData mo179651r();

        /* renamed from: s */
        String mo179652s();

        /* renamed from: t */
        ContactSource mo179653t();

        /* renamed from: u */
        String mo179654u();

        /* renamed from: v */
        String mo179655v();

        /* renamed from: w */
        boolean mo179656w();

        /* renamed from: x */
        boolean mo179657x();

        /* renamed from: y */
        String mo179658y();

        /* renamed from: z */
        ActionBtnViewData mo179659z();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H&J\"\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0017H&J\"\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006H&J\b\u0010\u001e\u001a\u00020\u0004H&J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020\u0004H&J\b\u0010(\u001a\u00020\u0004H&J\b\u0010)\u001a\u00020\u0004H&J(\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020&H&J(\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&H&J\u0012\u00104\u001a\u00020\u00042\b\b\u0001\u00105\u001a\u000206H&J\u0010\u00104\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0006H&J\u0010\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020:H&JF\u0010;\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010<\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020&H&J0\u0010@\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010<\u001a\u0004\u0018\u00010\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&J$\u0010E\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010G\u001a\u0004\u0018\u00010\u00062\u0006\u0010=\u001a\u00020\u0013H&J\u0010\u0010H\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010I\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020LH&J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020OH&J\u0010\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020RH&¨\u0006T"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView$IDelegate;", "callUser", "", "phoneNumber", "", "finish", "go2ProfileSetting", "profileSettingInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "go2ProfileShare", "content", "Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "onMineAvatarUpdate", "avatarKey", "userId", "openChat", "contactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "openCommonAvatar", "entityId", "view", "Landroid/view/View;", "openLoginUserAvatar", "openPhoneQueryAmountEditPage", "openSecretChat", "chatId", "openUrl", "url", "showAddedToast", "showApplyCollabDialog", "contact", "Lcom/ss/android/lark/contact/entity/Contact;", "showCallConfirmDialog", "userName", "showCreateSecretConfirmDialog", "isExternal", "", "showEmptyPage", "showLoadDataError", "showNameCardEditorMenu", "showPhoneCallSelectMenu", "showEnterprisePhoneCall", "showPhoneCall", "showEmergencyCall", "showVoiceCall", "showTitleBarRightClickMenu", "anchorView", "isShowPhoneCallTimeSet", "isShowReport", "isShowShareProfile", "showToast", "msgId", "", "msg", "showUserInfo", "viewData", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "startAddContactPage", "token", ShareHitPoint.f121868c, "isHasTenantCertification", "isTenantCertification", "startAliasEditorActivity", "alias", "startEmergencyCall", "startEnterprisePhoneCall", "startQueryPhoneNumber", "startReasonRequestEditActivity", "friendRequestToken", "fromChatId", "startVideoChat", "startVoiceCall", "updateActionBtn", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "updateHeader", "headerViewData", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "updateInfo", "baseViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "IDelegate", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0006H&J \u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0013H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0013H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H&J\u0012\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0006H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0017H&J\b\u0010)\u001a\u00020\u0003H&J\b\u0010*\u001a\u00020\u0003H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0010H&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&¨\u00060"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "doDeleteNameCard", "", "getRecogniseSpansResult", "description", "", "onAcceptBtnClick", "context", "Landroid/content/Context;", "onAddContactBtnClick", "onAliasItemClick", "alias", "onAvatarClick", "avatarKey", "view", "Landroid/view/View;", "onCallBtnClick", "activity", "Landroid/app/Activity;", "onCreateNameCard", "onCreateP2pSecretChat", "isFirst", "", "onCtaChatClick", "onCtaCryptoChatClick", "onCtaPhoneClick", "onCtaVideoClick", "onEditNameCardClick", "onEmergencyCallClick", "onEnterprisePhoneCallClick", "onGuideClick", "key", "onLinkItemClicked", ShareHitPoint.f121869d, "onMessageClickHitPoint", "onPhoneCallClick", "onPhoneCallTimeSetMenuClick", "onPhoneNumberItemClick", "phoneNumber", "isCompleted", "onReportMenuClick", "onShareProfileClick", "onShowPhoneNumberClick", "onTitleBarRightClick", "anchorView", "onVcNoRightsError", "onVoiceCallClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.user_profile.b.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo179693a();

            /* renamed from: a */
            void mo179694a(Activity activity);

            /* renamed from: a */
            void mo179695a(Context context);

            /* renamed from: a */
            void mo179696a(Context context, String str, View view);

            /* renamed from: a */
            void mo179697a(View view);

            /* renamed from: a */
            void mo179698a(String str);

            /* renamed from: a */
            void mo179699a(String str, boolean z);

            /* renamed from: a */
            void mo179700a(boolean z);

            /* renamed from: b */
            void mo179701b();

            /* renamed from: b */
            void mo179702b(Activity activity);

            /* renamed from: b */
            void mo179703b(String str);

            /* renamed from: c */
            void mo179704c();

            /* renamed from: c */
            void mo179705c(Activity activity);

            /* renamed from: c */
            void mo179706c(String str);

            /* renamed from: d */
            void mo179707d();

            /* renamed from: d */
            void mo179708d(String str);

            /* renamed from: e */
            void mo179709e();

            /* renamed from: f */
            void mo179710f();

            /* renamed from: g */
            void mo179711g();

            /* renamed from: h */
            void mo179712h();

            /* renamed from: i */
            void mo179713i();

            /* renamed from: j */
            void mo179714j();

            /* renamed from: k */
            void mo179715k();

            /* renamed from: l */
            void mo179716l();

            /* renamed from: m */
            void mo179717m();

            /* renamed from: n */
            void mo179718n();

            /* renamed from: o */
            void mo179719o();
        }

        /* renamed from: a */
        void mo179661a();

        /* renamed from: a */
        void mo179662a(int i);

        /* renamed from: a */
        void mo179663a(View view, boolean z, boolean z2, boolean z3);

        /* renamed from: a */
        void mo179664a(ProfileContent profileContent);

        /* renamed from: a */
        void mo179665a(Contact contact, ContactSource contactSource);

        /* renamed from: a */
        void mo179666a(ProfileSettingInitData profileSettingInitData);

        /* renamed from: a */
        void mo179667a(ActionBtnViewData actionBtnViewData);

        /* renamed from: a */
        void mo179668a(UserProfileViewData eVar);

        /* renamed from: a */
        void mo179669a(BaseInfoViewData bVar);

        /* renamed from: a */
        void mo179670a(String str);

        /* renamed from: a */
        void mo179671a(String str, ContactSource contactSource);

        /* renamed from: a */
        void mo179672a(String str, String str2);

        /* renamed from: a */
        void mo179673a(String str, String str2, View view);

        /* renamed from: a */
        void mo179674a(String str, String str2, ContactSource contactSource);

        /* renamed from: a */
        void mo179675a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        void mo179676a(String str, String str2, String str3, String str4, ContactSource contactSource, boolean z, boolean z2);

        /* renamed from: a */
        void mo179677a(String str, boolean z);

        /* renamed from: a */
        void mo179678a(boolean z, boolean z2, boolean z3, boolean z4);

        /* renamed from: b */
        void mo179679b();

        /* renamed from: b */
        void mo179680b(String str);

        /* renamed from: b */
        void mo179681b(String str, String str2);

        /* renamed from: b */
        void mo179682b(String str, String str2, View view);

        /* renamed from: c */
        void mo179683c();

        /* renamed from: c */
        void mo179684c(String str);

        /* renamed from: d */
        void mo179685d();

        /* renamed from: d */
        void mo179686d(String str);

        /* renamed from: e */
        void mo179687e();

        /* renamed from: e */
        void mo179688e(String str);

        /* renamed from: f */
        void mo179689f(String str);

        /* renamed from: g */
        void mo179690g(String str);

        /* renamed from: h */
        void mo179691h(String str);

        /* renamed from: i */
        void mo179692i(String str);
    }
}
