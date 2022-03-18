package com.ss.android.lark.profile.func.user_profile.mvp;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.contact.v2.QueryCondition;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingInitData;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewDataParser;
import com.ss.android.lark.profile.func.user_profile.header.HeaderViewData;
import com.ss.android.lark.profile.func.user_profile.header.HeaderViewDataParser;
import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import com.ss.android.lark.profile.func.user_profile.infos.InfoViewDataParser;
import com.ss.android.lark.profile.func.user_profile.infos.alias.AliasItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.phone_number.PhoneNumberItemViewData;
import com.ss.android.lark.profile.func.user_profile.infos.status.StatusItemViewData;
import com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract;
import com.ss.android.lark.profile.func.user_profile.mvp.UserProfileViewData;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52241b;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.profile.v2.entity.PhoneNumberField;
import com.ss.android.lark.profile.v2.entity.Profile;
import com.ss.android.lark.profile.v2.entity.UserInfo;
import com.ss.android.lark.profile.v2.service.UserProfileService;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uBG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010!\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010)\u001a\u00020\bH\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\u0014\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\b\u00100\u001a\u000201H\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\nH\u0016J\u0016\u00105\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002060\u0019H\u0002J\n\u00107\u001a\u0004\u0018\u000106H\u0002J\n\u00108\u001a\u0004\u0018\u000109H\u0016J\n\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001e\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002060\u0019H\u0002J\u001e\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002060\u0019H\u0002J\u0016\u0010@\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002060\u0019H\u0016J\n\u0010A\u001a\u0004\u0018\u000106H\u0016J\n\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u00020EH\u0002J\u0018\u0010F\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020HH\u0016J\n\u0010I\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010J\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010K\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010L\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010M\u001a\u00020\u0004H\u0016J\b\u0010N\u001a\u00020\nH\u0016J\b\u0010O\u001a\u00020\nH\u0016J\b\u0010P\u001a\u00020\nH\u0002J\b\u0010Q\u001a\u00020\nH\u0016J\b\u0010R\u001a\u00020\nH\u0016J\b\u0010S\u001a\u00020\nH\u0016J\b\u0010T\u001a\u00020\nH\u0016J\b\u0010U\u001a\u00020\nH\u0016J\b\u0010V\u001a\u00020\nH\u0016J\b\u0010W\u001a\u00020\nH\u0016J\u0012\u0010X\u001a\u00020\u00172\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\u0010\u0010[\u001a\u0002062\u0006\u0010\\\u001a\u00020\u0011H\u0002J\u0010\u0010]\u001a\u0002062\u0006\u0010\\\u001a\u00020\u0011H\u0002J\u001e\u0010^\u001a\u00020\u00172\u0006\u0010_\u001a\u00020 2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0016J\b\u0010`\u001a\u00020\u0017H\u0002J\u001e\u0010a\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002060\u0019H\u0016J\b\u0010b\u001a\u00020\u0017H\u0016J\u0010\u0010c\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u000fH\u0016J\b\u0010e\u001a\u00020\nH\u0002J\b\u0010f\u001a\u00020\nH\u0002J\b\u0010g\u001a\u00020\nH\u0002J\b\u0010h\u001a\u00020\nH\u0016J\b\u0010i\u001a\u00020\nH\u0016J\b\u0010j\u001a\u00020\nH\u0016J\b\u0010k\u001a\u00020\nH\u0016J\b\u0010l\u001a\u00020\nH\u0002J\b\u0010m\u001a\u00020\nH\u0002J\b\u0010n\u001a\u00020\nH\u0016J\b\u0010o\u001a\u00020\u0017H\u0002J\u0012\u0010p\u001a\u00020\u00172\b\u0010q\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010r\u001a\u00020\u00172\u0006\u0010s\u001a\u000201H\u0016J\u0010\u0010t\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel;", "mUserId", "", "mChatId", "mToken", "mSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "mShowAtLastPlace", "", "nameCardId", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/biz/core/api/ContactSource;ZLjava/lang/String;Ljava/lang/String;)V", "mModelDelegate", "Lcom/ss/android/lark/profile/func/user_profile/mvp/IUserProfileContract$IModel$IModelDelegate;", "mProfile", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "mProfileService", "Lcom/ss/android/lark/profile/v2/service/UserProfileService;", "pushMineChatterListener", "Lcom/ss/android/lark/profile/common/listeners/IPushMineChatterListener;", "acceptAddFriendRequest", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "completeGuide", "key", "create", "createP2pSecretChat", "createSingleNameCard", "context", "Landroid/app/Activity;", "deleteSingleNameCard", "destroy", "getActionBtnViewData", "Lcom/ss/android/lark/profile/func/user_profile/action/ActionBtnViewData;", "getAliasItemViewData", "Lcom/ss/android/lark/profile/func/user_profile/infos/alias/AliasItemViewData;", "getAvatarKey", "getChatId", "getContactSource", "getContactType", "getDescreptionItem", "Lcom/ss/android/lark/profile/func/user_profile/infos/status/StatusItemViewData;", "spansResult", "Lcom/ss/android/lark/widget/span/RecogniseSpansResult;", "getEncryptUserId", "getFriendStatus", "", "getHeaderViewData", "Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "getIsFirstStartSecretChat", "getNameCardProfileInfo", "Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileViewData;", "getNameCardProfileInfoFromLocal", "getPhoneNumberItem", "Lcom/ss/android/lark/profile/func/user_profile/infos/phone_number/PhoneNumberItemViewData;", "getProfileFinishResult", "Lcom/ss/android/lark/profile/dto/ProfileFinishResult;", "getProfileFromNetByToken", "token", "getProfileFromNetByUserId", "userId", "getProfileInfo", "getProfileInfoFromLocal", "getProfileSettingInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "getQueryCondition", "Lcom/bytedance/lark/pb/contact/v2/QueryCondition;", "getRecogniseSpansResult", "description", "Lcom/ss/android/lark/WidgetModuleDependency$GetRecognizeSpanResultCallBack;", "getReportUrl", "getTenantName", "getToken", "getUserId", "getUserName", "isBlocked", "isExternal", "isFriend", "isLoginUser", "isNameCard", "isResigned", "isShowPhoneCallTimeSet", "isShowReportMenu", "isShowTenantCertification", "isTenantCertification", "onPushMineChatterChanged", "profileChatter", "Lcom/ss/android/lark/profile/dto/ProfileChatter;", "parseNameCardProfile2ViewData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "parseProfile2ViewData", "queryPhoneNumber", "activity", "registerPush", "setBlock", "setIsFirstStartSecretChat", "setModelDelegate", "delegate", "showAliasItem", "showBlockedItem", "showDeleteItem", "showEmergencyCall", "showEnterprisePhoneCall", "showPhoneCall", "showShareProfileMenu", "showTitleBarLeftBtn", "showTitleBarRightBtn", "showVoiceCall", "unRegisterPush", "updateAlias", "alias", "updateFriendStatus", "friendStatus", "updateSingleNameCard", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.b.b */
public final class UserProfileModel extends BaseModel implements IUserProfileContract.IModel {

    /* renamed from: b */
    public static final Companion f130050b = new Companion(null);

    /* renamed from: a */
    public Profile f130051a;

    /* renamed from: c */
    private final UserProfileService f130052c = UserProfileService.f130763b.mo180813a();

    /* renamed from: d */
    private IUserProfileContract.IModel.IModelDelegate f130053d;

    /* renamed from: e */
    private final AbstractC52241b f130054e = new C52563h(this);

    /* renamed from: f */
    private final String f130055f;

    /* renamed from: g */
    private final String f130056g;

    /* renamed from: h */
    private final String f130057h;

    /* renamed from: i */
    private final ContactSource f130058i;

    /* renamed from: j */
    private final boolean f130059j;

    /* renamed from: k */
    private String f130060k;

    /* renamed from: l */
    private final String f130061l;

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: o */
    public boolean mo179648o() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/mvp/UserProfileModel$Companion;", "", "()V", "SP_KEY_SECRET_CHAT_HAD_BEEN_STARTED", "", "TAG", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: s */
    public String mo179652s() {
        return this.f130056g;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: t */
    public ContactSource mo179653t() {
        return this.f130058i;
    }

    /* renamed from: a */
    public final void mo179721a(ProfileChatter profileChatter) {
        UserInfo userInfo;
        UserInfo userInfo2;
        UserInfo userInfo3;
        if (profileChatter != null) {
            String id = profileChatter.getId();
            Profile profile = this.f130051a;
            String str = null;
            if (TextUtils.equals(id, (profile == null || (userInfo3 = profile.getUserInfo()) == null) ? null : userInfo3.getUserId())) {
                Profile profile2 = this.f130051a;
                if (!(profile2 == null || (userInfo2 = profile2.getUserInfo()) == null)) {
                    str = userInfo2.getAvatarKey();
                }
                if (!TextUtils.equals(str, profileChatter.getAvatarKey())) {
                    Profile profile3 = this.f130051a;
                    if (!(profile3 == null || (userInfo = profile3.getUserInfo()) == null)) {
                        userInfo.setAvatarKey(profileChatter.getAvatarKey());
                    }
                    IUserProfileContract.IModel.IModelDelegate aVar = this.f130053d;
                    if (aVar != null) {
                        aVar.mo179660a(profileChatter);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179627a(String str) {
        ArrayList<BaseField> fields;
        Profile profile = this.f130051a;
        if (!(profile == null || (fields = profile.getFields()) == null)) {
            for (T t : fields) {
                if (t.getFieldType() == 50) {
                    if (t != null) {
                        t.setText(str);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179629a(boolean z, IGetDataCallback<UserProfileViewData> iGetDataCallback) {
        UserInfo userInfo;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Profile profile = this.f130051a;
        if (!(profile == null || (userInfo = profile.getUserInfo()) == null)) {
            userInfo.setBlocked(z);
        }
        String str = this.f130055f;
        if (str == null || TextUtils.isEmpty(str)) {
            String str2 = this.f130057h;
            if (str2 != null) {
                m203618b(str2, iGetDataCallback);
            } else {
                iGetDataCallback.onError(new ErrorResult("The token is null!"));
            }
        } else {
            m203617a(this.f130055f, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179628a(String str, C37030f.AbstractC37031a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "description");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        C37030f.m146093a().mo103025a(str, this.f130055f, true, aVar);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m203608H();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m203609I();
        super.destroy();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: i */
    public void mo179642i() {
        C57865c.m224576a(RunnableC52565j.f130076a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$j */
    static final class RunnableC52565j implements Runnable {

        /* renamed from: a */
        public static final RunnableC52565j f130076a = new RunnableC52565j();

        RunnableC52565j() {
        }

        public final void run() {
            UserSP.getInstance().putBoolean("secret_chat_had_been_started", false);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: D */
    public boolean mo179616D() {
        Profile profile = this.f130051a;
        if (profile != null) {
            return profile.getUserInfo().isTenantCertification();
        }
        return false;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: E */
    public boolean mo179617E() {
        Profile profile = this.f130051a;
        if (profile != null) {
            return profile.getUserInfo().isHasTenantCertification();
        }
        return false;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: F */
    public int mo179618F() {
        Profile profile = this.f130051a;
        if (profile != null) {
            return profile.getUserInfo().getFriendStatus();
        }
        return 0;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: e */
    public String mo179638e() {
        Profile profile = this.f130051a;
        if (profile != null) {
            return profile.getUserInfo().getTenantName();
        }
        return null;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: g */
    public boolean mo179640g() {
        return UserSP.getInstance().getBoolean("secret_chat_had_been_started", true);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: l */
    public boolean mo179645l() {
        return C52239a.m202617d().mo133561a("byteview.call.voice.android");
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: z */
    public ActionBtnViewData mo179659z() {
        Profile profile = this.f130051a;
        if (profile != null) {
            return ActionBtnViewDataParser.f130049a.mo179609a(profile);
        }
        return null;
    }

    /* renamed from: H */
    private final void m203608H() {
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133588r().mo133631a(this.f130054e);
    }

    /* renamed from: I */
    private final void m203609I() {
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133588r().mo133634b(this.f130054e);
    }

    /* renamed from: J */
    private final boolean m203610J() {
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        if (!DesktopUtil.m144301a(d.mo133562b()) || this.f130059j) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private final boolean m203616P() {
        Profile profile = this.f130051a;
        if (profile == null || profile.getUserInfo().getFriendStatus() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: f */
    public String mo179639f() {
        UserInfo userInfo;
        String userName;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null || (userName = userInfo.getUserName()) == null) {
            return "";
        }
        return userName;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: m */
    public boolean mo179646m() {
        if (!mo179643j() || !C52239a.m202617d().mo133561a("lark.call.sos")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: u */
    public String mo179654u() {
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            return null;
        }
        return userInfo.getContactToken();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: v */
    public String mo179655v() {
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            return null;
        }
        return userInfo.getAvatarKey();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: w */
    public boolean mo179656w() {
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            return false;
        }
        return userInfo.isResigned();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: x */
    public boolean mo179657x() {
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            return false;
        }
        return userInfo.isBlocked();
    }

    /* renamed from: K */
    private final boolean m203611K() {
        if (C52239a.m202617d().mo133561a("lark.client.contact.opt")) {
            if (mo179635c()) {
                return false;
            }
            if (mo179647n() || mo179649p() || m203614N()) {
                return true;
            }
            return false;
        } else if (mo179647n() || mo179649p() || mo179648o()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: L */
    private final UserProfileViewData m203612L() {
        Profile profile;
        UserProfileViewData b;
        if (mo179619G()) {
            profile = this.f130052c.mo180804a(m203613M());
        } else {
            profile = null;
        }
        this.f130051a = profile;
        if (profile != null && (b = mo179722b(profile)) != null) {
            return b;
        }
        Log.m165383e("UserProfileModel", "name card local data is null");
        return null;
    }

    /* renamed from: M */
    private final QueryCondition m203613M() {
        QueryCondition.C16556a aVar = new QueryCondition.C16556a();
        if (!TextUtils.isEmpty(this.f130060k)) {
            aVar.f42924a = this.f130060k;
        } else if (!TextUtils.isEmpty(this.f130061l)) {
            aVar.f42925b = this.f130061l;
        }
        QueryCondition a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "queryConditionBuilder.build()");
        return a;
    }

    /* renamed from: N */
    private final boolean m203614N() {
        String str;
        UserInfo userInfo;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        String c = q.mo133624c();
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            str = null;
        } else {
            str = userInfo.getTenantId();
        }
        return !TextUtils.equals(c, str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: A */
    public ProfileFinishResult mo179613A() {
        boolean z;
        boolean z2;
        Profile profile = this.f130051a;
        if (profile == null) {
            return null;
        }
        int friendStatus = profile.getUserInfo().getFriendStatus();
        String userId = profile.getUserInfo().getUserId();
        boolean isBlocked = profile.getUserInfo().isBlocked();
        boolean P = m203616P();
        if (friendStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        if (friendStatus == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new ProfileFinishResult(userId, isBlocked, P, z, z2);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: B */
    public String mo179614B() {
        if (this.f130051a == null) {
            return "";
        }
        if (mo179619G()) {
            return "name_card";
        }
        if (!mo179641h()) {
            return "internal";
        }
        if (m203616P()) {
            return "external_friend";
        }
        return "external_nonfriend";
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: C */
    public String mo179615C() {
        Profile profile = this.f130051a;
        if (profile != null) {
            String a = C57859q.m224565a(profile.getUserInfo().getUserId());
            Intrinsics.checkExpressionValueIsNotNull(a, "EncryptUtils.uidEncryptor(it.userInfo.userId)");
            return a;
        }
        String a2 = C57859q.m224565a(this.f130057h);
        Intrinsics.checkExpressionValueIsNotNull(a2, "EncryptUtils.uidEncryptor(mToken)");
        return a2;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: G */
    public boolean mo179619G() {
        boolean z;
        if (!TextUtils.isEmpty(this.f130060k) || !TextUtils.isEmpty(this.f130061l)) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !TextUtils.isEmpty(this.f130055f) || !TextUtils.isEmpty(this.f130057h)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: b */
    public String mo179630b() {
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            return null;
        }
        return userInfo.getUserId();
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: d */
    public AliasItemViewData mo179636d() {
        ArrayList<BaseField> fields;
        Profile profile = this.f130051a;
        if (profile == null || (fields = profile.getFields()) == null) {
            return null;
        }
        for (T t : fields) {
            if (t.getFieldType() == 50) {
                InfoViewDataParser.Companion aVar = InfoViewDataParser.f130305a;
                if (t != null) {
                    return aVar.mo179902b(t);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
            }
        }
        return null;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: h */
    public boolean mo179641h() {
        String str;
        UserInfo userInfo;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        String c = q.mo133624c();
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            str = null;
        } else {
            str = userInfo.getTenantId();
        }
        return !TextUtils.equals(c, str);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: p */
    public boolean mo179649p() {
        String str;
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            str = null;
        } else {
            str = userInfo.getLeaderId();
        }
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        return TextUtils.equals(str, q.mo133622a());
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: q */
    public ProfileSettingInitData mo179650q() {
        Profile profile = this.f130051a;
        if (profile == null) {
            return null;
        }
        String userId = profile.getUserInfo().getUserId();
        boolean p = mo179649p();
        boolean isBlocked = profile.getUserInfo().isBlocked();
        boolean N = m203614N();
        boolean n = mo179647n();
        String tenantId = profile.getUserInfo().getTenantId();
        if (tenantId == null) {
            tenantId = "";
        }
        return new ProfileSettingInitData(userId, p, isBlocked, N, n, m203615O(), tenantId);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: r */
    public PhoneNumberItemViewData mo179651r() {
        ArrayList<BaseField> fields;
        Profile profile = this.f130051a;
        if (profile == null || (fields = profile.getFields()) == null) {
            return null;
        }
        for (T t : fields) {
            if (t.getFieldType() == 101) {
                InfoViewDataParser.Companion aVar = InfoViewDataParser.f130305a;
                if (t != null) {
                    return aVar.mo179898a((PhoneNumberField) t);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.PhoneNumberField");
            }
        }
        return null;
    }

    /* renamed from: O */
    private final boolean m203615O() {
        String str;
        Profile profile;
        UserInfo userInfo;
        UserInfo userInfo2;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        String c = q.mo133624c();
        Profile profile2 = this.f130051a;
        if (profile2 == null || (userInfo2 = profile2.getUserInfo()) == null) {
            str = null;
        } else {
            str = userInfo2.getTenantId();
        }
        if (TextUtils.equals(c, str) || (profile = this.f130051a) == null || (userInfo = profile.getUserInfo()) == null || 1 != userInfo.getFriendStatus()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public UserProfileViewData mo179620a() {
        Profile profile;
        String str = this.f130060k;
        if (str != null && !TextUtils.isEmpty(str)) {
            return m203612L();
        }
        String str2 = this.f130055f;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            String str3 = this.f130057h;
            if (str3 != null) {
                profile = this.f130052c.mo180805a(str3, this.f130058i);
            } else {
                profile = null;
            }
        } else {
            profile = this.f130052c.mo180806a(this.f130055f, this.f130056g, this.f130058i);
        }
        this.f130051a = profile;
        if (profile != null) {
            return mo179720a(profile);
        }
        Log.m165383e("UserProfileModel", "local data is null");
        return null;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: c */
    public boolean mo179635c() {
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        return TextUtils.equals(mo179630b(), q.mo133622a());
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: j */
    public boolean mo179643j() {
        String str;
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            str = null;
        } else {
            str = userInfo.getTenantId();
        }
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        if (TextUtils.equals(str, q.mo133624c())) {
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52253g q2 = d2.mo133587q();
            Intrinsics.checkExpressionValueIsNotNull(q2, "ProfileModule.getDependency().loginDependency");
            if (!q2.mo133623b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: k */
    public boolean mo179644k() {
        String str;
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            str = null;
        } else {
            str = userInfo.getTenantId();
        }
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        if (TextUtils.equals(str, q.mo133624c())) {
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52253g q2 = d2.mo133587q();
            Intrinsics.checkExpressionValueIsNotNull(q2, "ProfileModule.getDependency().loginDependency");
            if (!q2.mo133623b() && C52239a.m202617d().mo133561a("byteview.meeting.businessphone")) {
                IProfileModuleDependency d3 = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d3, "ProfileModule.getDependency()");
                if (d3.mo133569d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: n */
    public boolean mo179647n() {
        String str;
        UserInfo userInfo;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        if (d.mo133572e()) {
            return false;
        }
        Profile profile = this.f130051a;
        if (profile == null || (userInfo = profile.getUserInfo()) == null) {
            str = null;
        } else {
            str = userInfo.getUserId();
        }
        IProfileModuleDependency d2 = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d2.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        if (TextUtils.equals(str, q.mo133622a())) {
            return false;
        }
        IProfileModuleDependency d3 = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d3, "ProfileModule.getDependency()");
        if (d3.mo133575g()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: y */
    public String mo179658y() {
        Profile profile = this.f130051a;
        if (profile == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String userId = profile.getUserInfo().getUserId();
        if (userId != null) {
            linkedHashMap.put("chatter_id", userId);
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
            Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
            linkedHashMap.put("is_cross_tenant", Integer.valueOf(!TextUtils.equals(profile.getUserInfo().getTenantId(), q.mo133624c()) ? 1 : 0));
            StringBuilder sb = new StringBuilder();
            sb.append("https://");
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            sb.append(d2.mo133545a());
            sb.append("/report/?type=chatter&params=");
            sb.append(Uri.encode(JSONObject.toJSONString(linkedHashMap)));
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "profileChatter", "Lcom/ss/android/lark/profile/dto/ProfileChatter;", "kotlin.jvm.PlatformType", "onPushMineChatter"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$h */
    static final class C52563h implements AbstractC52241b {

        /* renamed from: a */
        final /* synthetic */ UserProfileModel f130072a;

        C52563h(UserProfileModel bVar) {
            this.f130072a = bVar;
        }

        @Override // com.ss.android.lark.profile.p2520a.p2521a.AbstractC52241b
        /* renamed from: a */
        public final void mo178827a(ProfileChatter profileChatter) {
            this.f130072a.mo179721a(profileChatter);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179626a(IUserProfileContract.IModel.IModelDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f130053d = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileModel$acceptAddFriendRequest$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$b */
    public static final class C52557b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ UserProfileModel f130062a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f130063b;

        /* renamed from: a */
        public void mo179723a(boolean z) {
            this.f130063b.onSuccess(true);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo179723a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UserProfileModel", errorResult.getDebugMsg());
            this.f130063b.onError(errorResult);
        }

        C52557b(UserProfileModel bVar, IGetDataCallback iGetDataCallback) {
            this.f130062a = bVar;
            this.f130063b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileModel$queryPhoneNumber$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$i */
    public static final class C52564i implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ UserProfileModel f130073a;

        /* renamed from: b */
        final /* synthetic */ Activity f130074b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f130075c;

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f130075c.onSuccess(str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UserProfileModel", errorResult.getDebugMsg());
            this.f130075c.onError(errorResult);
        }

        C52564i(UserProfileModel bVar, Activity activity, IGetDataCallback iGetDataCallback) {
            this.f130073a = bVar;
            this.f130074b = activity;
            this.f130075c = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179622a(int i) {
        UserInfo userInfo;
        Profile profile = this.f130051a;
        if (profile != null && (userInfo = profile.getUserInfo()) != null) {
            userInfo.setFriendStatus(i);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: b */
    public void mo179633b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C52239a.m202617d().mo133567c(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "profileChat", "Lcom/ss/android/lark/profile/dto/ProfileChat;", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$c */
    static final class C52558c<T> implements Consumer<ProfileChat> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f130064a;

        C52558c(IGetDataCallback iGetDataCallback) {
            this.f130064a = iGetDataCallback;
        }

        /* renamed from: a */
        public final void accept(ProfileChat profileChat) {
            if (profileChat == null) {
                Log.m165383e("UserProfileModel", "chat is null");
                this.f130064a.onError(new ErrorResult("chat is null"));
                return;
            }
            this.f130064a.onSuccess(profileChat.mo178838a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileModel$getNameCardProfileInfo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$e */
    public static final class C52560e implements IGetDataCallback<Profile> {

        /* renamed from: a */
        final /* synthetic */ UserProfileModel f130066a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f130067b;

        /* renamed from: a */
        public void onSuccess(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("UserProfileModel", "get name card info from net success");
            this.f130066a.f130051a = profile;
            this.f130067b.onSuccess(this.f130066a.mo179722b(profile));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("UserProfileModel", "get name card info from net failed : " + errorResult.getDebugMsg());
            this.f130067b.onError(errorResult);
        }

        C52560e(UserProfileModel bVar, IGetDataCallback iGetDataCallback) {
            this.f130066a = bVar;
            this.f130067b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileModel$getProfileFromNetByToken$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$f */
    public static final class C52561f implements IGetDataCallback<Profile> {

        /* renamed from: a */
        final /* synthetic */ UserProfileModel f130068a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f130069b;

        /* renamed from: a */
        public void onSuccess(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f130068a.f130051a = profile;
            this.f130069b.onSuccess(this.f130068a.mo179720a(profile));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UserProfileModel", errorResult.getDebugMsg());
            this.f130069b.onError(errorResult);
        }

        C52561f(UserProfileModel bVar, IGetDataCallback iGetDataCallback) {
            this.f130068a = bVar;
            this.f130069b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/user_profile/mvp/UserProfileModel$getProfileFromNetByUserId$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$g */
    public static final class C52562g implements IGetDataCallback<Profile> {

        /* renamed from: a */
        final /* synthetic */ UserProfileModel f130070a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f130071b;

        /* renamed from: a */
        public void onSuccess(Profile profile) {
            Intrinsics.checkParameterIsNotNull(profile, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f130070a.f130051a = profile;
            this.f130071b.onSuccess(this.f130070a.mo179720a(profile));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("UserProfileModel", errorResult.getDebugMsg());
            this.f130071b.onError(errorResult);
        }

        C52562g(UserProfileModel bVar, IGetDataCallback iGetDataCallback) {
            this.f130070a = bVar;
            this.f130071b = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: d */
    public void mo179637d(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String str = this.f130060k;
        if (str != null && !TextUtils.isEmpty(str)) {
            this.f130052c.mo180810a(str, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.b.b$d */
    static final class C52559d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f130065a;

        C52559d(IGetDataCallback iGetDataCallback) {
            this.f130065a = iGetDataCallback;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ErrorResult errorResult;
            Intrinsics.checkParameterIsNotNull(th, "error");
            if (th instanceof ErrorResult) {
                errorResult = (ErrorResult) th;
                Log.m165383e("UserProfileModel", errorResult.getDebugMsg());
            } else {
                Log.m165386e("UserProfileModel", th);
                errorResult = new ErrorResult(th.getMessage());
            }
            this.f130065a.onError(errorResult);
        }
    }

    /* renamed from: e */
    private final void m203619e(IGetDataCallback<UserProfileViewData> iGetDataCallback) {
        if (mo179619G()) {
            UserProfileService bVar = this.f130052c;
            QueryCondition M = m203613M();
            UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C52560e(this, iGetDataCallback));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…     }\n                })");
            bVar.mo180809a(M, wrapAndAddGetDataCallback);
            return;
        }
        iGetDataCallback.onError(new ErrorResult("The name card id is null or empty!"));
    }

    /* renamed from: a */
    public final UserProfileViewData mo179720a(Profile profile) {
        return new UserProfileViewData(HeaderViewDataParser.f130195a.mo179818a(profile), InfoViewDataParser.f130305a.mo179901a(profile), ActionBtnViewDataParser.f130049a.mo179609a(profile), new UserProfileViewData.TitleBarViewData(m203611K(), m203610J()), false, 16, null);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: c */
    public void mo179634c(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Profile profile = this.f130051a;
        if (profile != null) {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133582l().mo133655a(profile.getUserInfo().getContactApplicationId(), getCallbackManager().wrapAndAddGetDataCallback(new C52557b(this, iGetDataCallback)));
            return;
        }
        Log.m165383e("UserProfileModel", "profile is null");
    }

    /* renamed from: b */
    public final UserProfileViewData mo179722b(Profile profile) {
        UserInfo userInfo = profile.getUserInfo();
        boolean z = true;
        if ((!Intrinsics.areEqual("0", userInfo.getNameCardId())) && TextUtils.isEmpty(this.f130060k)) {
            this.f130060k = userInfo.getNameCardId();
        }
        HeaderViewData a = HeaderViewDataParser.f130195a.mo179818a(profile);
        List<BaseInfoViewData> a2 = InfoViewDataParser.f130305a.mo179901a(profile);
        ActionBtnViewData a3 = ActionBtnViewDataParser.f130049a.mo179609a(profile);
        if (profile.getUserInfo().getFriendStatus() == 4) {
            z = false;
        }
        return new UserProfileViewData(a, a2, a3, new UserProfileViewData.TitleBarViewData(z, m203610J()), true);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public StatusItemViewData mo179621a(RecogniseSpansResult recogniseSpansResult) {
        ArrayList<BaseField> fields;
        Profile profile = this.f130051a;
        if (profile == null || (fields = profile.getFields()) == null) {
            return null;
        }
        for (T t : fields) {
            if (t.getFieldType() == 51) {
                InfoViewDataParser.Companion aVar = InfoViewDataParser.f130305a;
                if (t != null) {
                    return aVar.mo179899a(t, recogniseSpansResult);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.DescriptionField");
            }
        }
        return null;
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: b */
    public void mo179631b(Activity activity) {
        String str;
        Intrinsics.checkParameterIsNotNull(activity, "context");
        if (this.f130061l != null) {
            Profile profile = this.f130051a;
            if (profile == null || (str = profile.getUserInfo().getUserName()) == null) {
                str = null;
            }
            this.f130052c.mo180808a(activity, this.f130061l, str);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179623a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        String str = this.f130060k;
        if (str != null) {
            this.f130052c.mo180807a(activity, str);
        }
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: b */
    public void mo179632b(IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (TextUtils.isEmpty(mo179630b())) {
            Log.m165383e("UserProfileModel", "profile is null or userId is null");
            iGetDataCallback.onError(new ErrorResult("profile is null"));
            return;
        }
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133586p().mo133601a(true, mo179630b(), this.f130058i).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C52558c(iGetDataCallback), new C52559d(iGetDataCallback));
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179625a(IGetDataCallback<UserProfileViewData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String str = this.f130055f;
        if (str != null && !TextUtils.isEmpty(str)) {
            m203617a(this.f130055f, iGetDataCallback);
        } else if (mo179619G()) {
            m203619e(iGetDataCallback);
        } else {
            String str2 = this.f130057h;
            if (str2 != null) {
                m203618b(str2, iGetDataCallback);
            } else {
                iGetDataCallback.onError(new ErrorResult("The token is null!"));
            }
        }
    }

    /* renamed from: a */
    private final void m203617a(String str, IGetDataCallback<UserProfileViewData> iGetDataCallback) {
        UserProfileService bVar = this.f130052c;
        String str2 = this.f130056g;
        ContactSource contactSource = this.f130058i;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C52562g(this, iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…        }\n\n            })");
        bVar.mo180812a(str, str2, contactSource, wrapAndAddGetDataCallback);
    }

    /* renamed from: b */
    private final void m203618b(String str, IGetDataCallback<UserProfileViewData> iGetDataCallback) {
        UserProfileService bVar = this.f130052c;
        ContactSource contactSource = this.f130058i;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C52561f(this, iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…        }\n\n            })");
        bVar.mo180811a(str, contactSource, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.profile.func.user_profile.mvp.IUserProfileContract.IModel
    /* renamed from: a */
    public void mo179624a(Activity activity, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Profile profile = this.f130051a;
        if (profile != null) {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133584n().mo133663a(activity, profile.getUserInfo().getUserId(), getCallbackManager().wrapAndAddGetDataCallback(new C52564i(this, activity, iGetDataCallback)));
        }
    }

    public UserProfileModel(String str, String str2, String str3, ContactSource contactSource, boolean z, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(contactSource, "mSource");
        this.f130055f = str;
        this.f130056g = str2;
        this.f130057h = str3;
        this.f130058i = contactSource;
        this.f130059j = z;
        this.f130060k = str4;
        this.f130061l = str5;
    }
}
