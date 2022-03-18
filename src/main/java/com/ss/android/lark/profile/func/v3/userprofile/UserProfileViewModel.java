package com.ss.android.lark.profile.func.v3.userprofile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1143ag;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.AvatarMedal;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v2.UserContactStatus;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.Success;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.chat.entity.chatter.AvatarMedal;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import com.ss.android.lark.profile.func.add_friend.UserAuthorityUtils;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingFinishResult;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileState;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.service.UserProfileService;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52241b;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.profile.statistics.UserProfilePerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0001B\u0013\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0007J\u0016\u0010;\u001a\u0002072\u0006\u00103\u001a\u00020\u00072\u0006\u0010+\u001a\u00020,J\b\u0010<\u001a\u00020\u0002H\u0014J\u0006\u0010=\u001a\u000207J\u0006\u0010>\u001a\u000207J\u0010\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020AH\u0002J\u001e\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002070FH\u0002J\u0012\u0010G\u001a\u00020\u00072\b\u0010H\u001a\u0004\u0018\u00010IH\u0002J$\u0010J\u001a\u00020\u00072\f\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0LH\u0002J\u0012\u0010P\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\u000e\u0010S\u001a\u0002072\u0006\u0010T\u001a\u00020\u0007J\b\u0010U\u001a\u000207H\u0002J\u0006\u0010V\u001a\u00020\u0015J\u0006\u0010W\u001a\u000207J\u0006\u0010X\u001a\u000207J\u000e\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020[J \u0010\\\u001a\u0002072\u0006\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020D2\b\u0010_\u001a\u0004\u0018\u00010[J\u000e\u0010`\u001a\u0002072\u0006\u00108\u001a\u00020aJ\u0016\u0010b\u001a\u0002072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020eJ\u001e\u0010f\u001a\u0002072\f\u0010g\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010j\u001a\u00020\u0015H\u0002J\u0006\u0010k\u001a\u000207J\u0016\u0010l\u001a\u0002072\u0006\u0010m\u001a\u00020\u00152\u0006\u0010n\u001a\u00020oJ\u0010\u0010p\u001a\u0002072\u0006\u0010q\u001a\u00020\u0007H\u0002J\b\u0010r\u001a\u000207H\u0002J\u0006\u0010s\u001a\u000207J\u0006\u0010t\u001a\u000207J\u0006\u0010u\u001a\u000207J\b\u0010v\u001a\u000207H\u0002J\u000e\u0010w\u001a\u0002072\u0006\u0010x\u001a\u00020\u0007J\u000e\u0010y\u001a\u0002072\u0006\u0010z\u001a\u00020RJ\u0012\u0010{\u001a\u0002072\b\u0010|\u001a\u0004\u0018\u00010}H\u0002J\u0010\u0010~\u001a\u0002072\u0006\u0010\u001a\u00020\u0015H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020\r8FX\u0002¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b \u0010\u000fR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b#\u0010\tR\u000e\u0010%\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001b\u0010+\u001a\u00020,8FX\u0002¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b-\u0010.R\u001d\u00100\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b1\u0010\tR\u001d\u00103\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b4\u0010\t¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "enterParams", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "chatId", "", "getChatId", "()Ljava/lang/String;", "chatId$delegate", "Lkotlin/Lazy;", "commonTabSelectListener", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "getCommonTabSelectListener", "()Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "commonTabSelectListener$delegate", "email", "getEmail", "email$delegate", "getLocalDataFailed", "", "getNetDataFailed", "isLoadedFormNet", "localInfoDataEmpty", "model", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3;", "getModel", "()Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3;", "setModel", "(Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileModelV3;)V", "momentsTabSelectListener", "getMomentsTabSelectListener", "momentsTabSelectListener$delegate", "nameCardId", "getNameCardId", "nameCardId$delegate", "needRefreshNameCardDataResult", "netInfoDataEmpty", "pushMineChatterListener", "Lcom/ss/android/lark/profile/common/listeners/IPushMineChatterListener;", "getPushMineChatterListener", "()Lcom/ss/android/lark/profile/common/listeners/IPushMineChatterListener;", ShareHitPoint.f121868c, "Lcom/ss/android/lark/biz/core/api/ContactSource;", "getSource", "()Lcom/ss/android/lark/biz/core/api/ContactSource;", "source$delegate", "token", "getToken", "token$delegate", "userId", "getUserId", "userId$delegate", "acceptAddFriendRequest", "", "context", "Landroid/content/Context;", "contactApplicationId", "createP2pSecretChat", "defaultState", "deleteNameCard", "finish", "generateGenderStr", "gender", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$UserInfo$Gender;", "generateTabSelectListener", "targetTagVal", "", "onSelected", "Lkotlin/Function0;", "getAccountTag", "nameTag", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$NameTagInfo;", "getContainModules", "ctas", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$CtaInfo;", "fieldViewDataList", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "getFriendConversion", "friendStatus", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$UserInfo$FriendStatus;", "getRecogniseSpansResult", "userStatus", "initState", "isFirstStartSecretChat", "loadProfileFormLocal", "loadProfileFromNet", "onActivityFinish", "intent", "Landroid/content/Intent;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreateNameCard", "Landroid/app/Activity;", "onDescriptionChanged", "descriptionText", "descriptionType", "Lcom/bytedance/lark/pb/basic/v1/Chatter$Description$Type;", "onLoadDataSuccess", "response", "Lcom/ss/android/lark/profile/func/v3/userprofile/service/UserProfileService$Response$Success;", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse;", "isFromNet", "onNameCardUpdated", "onSpecialFocusViewClick", "isSpecialFocus", BottomDialog.f17198f, "", "postToast", "text", "registerPush", "sendHitPointProfileMainView", "setFirstStartSecretChat", "start", "unRegisterPush", "updateCoverKey", "coverKey", "updateFriendStatus", "state", "updateMedal", "avatarMedal", "Lcom/ss/android/lark/chat/entity/chatter/AvatarMedal;", "updateSpecialFocusView", "IsConcerned", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba */
public final class UserProfileViewModel extends JackViewModel<UserProfileState> {
    public static final Companion Companion = new Companion(null);
    private final Lazy chatId$delegate = LazyKt.lazy(new C52708c(this));
    private final Lazy commonTabSelectListener$delegate = LazyKt.lazy(new C52709d(this));
    private final Lazy email$delegate = LazyKt.lazy(new C52714g(this));
    public final Bundle enterParams;
    public boolean getLocalDataFailed;
    public boolean getNetDataFailed;
    public boolean isLoadedFormNet;
    public boolean localInfoDataEmpty;
    @Inject
    public UserProfileModelV3 model;
    private final Lazy momentsTabSelectListener$delegate = LazyKt.lazy(new C52725m(this));
    private final Lazy nameCardId$delegate = LazyKt.lazy(new C52727n(this));
    private boolean needRefreshNameCardDataResult;
    public boolean netInfoDataEmpty;
    private final AbstractC52241b pushMineChatterListener = new C52694aa(this);
    private final Lazy source$delegate = LazyKt.lazy(new C52698ac(this));
    private final Lazy token$delegate = LazyKt.lazy(new C52699ad(this));
    private final Lazy userId$delegate = LazyKt.lazy(new C52704ai(this));

    public final String getChatId() {
        return (String) this.chatId$delegate.getValue();
    }

    public final UDTabLayout.OnTabSelectedListener getCommonTabSelectListener() {
        return (UDTabLayout.OnTabSelectedListener) this.commonTabSelectListener$delegate.getValue();
    }

    public final String getEmail() {
        return (String) this.email$delegate.getValue();
    }

    public final UDTabLayout.OnTabSelectedListener getMomentsTabSelectListener() {
        return (UDTabLayout.OnTabSelectedListener) this.momentsTabSelectListener$delegate.getValue();
    }

    public final String getNameCardId() {
        return (String) this.nameCardId$delegate.getValue();
    }

    public final ContactSource getSource() {
        return (ContactSource) this.source$delegate.getValue();
    }

    public final String getToken() {
        return (String) this.token$delegate.getValue();
    }

    public final String getUserId() {
        return (String) this.userId$delegate.getValue();
    }

    public final void onNameCardUpdated() {
        this.needRefreshNameCardDataResult = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel$Companion;", "", "()V", "ERROR_CODE_FOCUSED_CHATTER_MAX", "", "ERROR_CODE_KA_NOT_READY", "ERROR_CODE_NET_ERROR", "INVALID_DEVICE", "PROFILE_COVER_KEY", "", "SECRET_DISABLED", "TAG", "VERSION_PROFILE_NEW", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC52241b getPushMineChatterListener() {
        return this.pushMineChatterListener;
    }

    public final void finish() {
        setState(C52715h.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ad */
    static final class C52699ad extends Lambda implements Function0<String> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52699ad(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle bundle = this.this$0.enterParams;
            if (bundle != null) {
                return bundle.getString("param_key_token");
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ai */
    static final class C52704ai extends Lambda implements Function0<String> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52704ai(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle bundle = this.this$0.enterParams;
            if (bundle != null) {
                return bundle.getString("param_key_user_id");
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$c */
    static final class C52708c extends Lambda implements Function0<String> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52708c(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle bundle = this.this$0.enterParams;
            if (bundle != null) {
                return bundle.getString("param_key_chat_id");
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$g */
    static final class C52714g extends Lambda implements Function0<String> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52714g(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle bundle = this.this$0.enterParams;
            if (bundle != null) {
                return bundle.getString("param_key_email");
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$n */
    static final class C52727n extends Lambda implements Function0<String> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52727n(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Bundle bundle = this.this$0.enterParams;
            if (bundle != null) {
                return bundle.getString("param_key_name_card_id");
            }
            return null;
        }
    }

    private final void initState() {
        this.getLocalDataFailed = false;
        this.getNetDataFailed = false;
        this.localInfoDataEmpty = false;
        this.netInfoDataEmpty = false;
    }

    public final UserProfileModelV3 getModel() {
        UserProfileModelV3 awVar = this.model;
        if (awVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        return awVar;
    }

    public final boolean isFirstStartSecretChat() {
        return UserSP.getInstance().getBoolean("secret_chat_had_been_started", true);
    }

    public final void sendHitPointProfileMainView() {
        withState(new C52696ab(this));
    }

    public final void setFirstStartSecretChat() {
        UserSP.getInstance().putBoolean("secret_chat_had_been_started", false);
    }

    public final void start() {
        initState();
        loadProfileFormLocal();
        loadProfileFromNet();
        registerPush();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$d */
    static final class C52709d extends Lambda implements Function0<UDTabLayout.OnTabSelectedListener> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52709d(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDTabLayout.OnTabSelectedListener invoke() {
            return this.this$0.generateTabSelectListener(GetUserProfileResponse.TabInfo.TabType.F_COMMON_INFO.getValue(), C527101.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$m */
    static final class C52725m extends Lambda implements Function0<UDTabLayout.OnTabSelectedListener> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52725m(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UDTabLayout.OnTabSelectedListener invoke() {
            return this.this$0.generateTabSelectListener(GetUserProfileResponse.TabInfo.TabType.F_COMMUNITY.getValue(), C527261.INSTANCE);
        }
    }

    private final void registerPush() {
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133588r().mo133631a(this.pushMineChatterListener);
    }

    private final void unRegisterPush() {
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133588r().mo133634b(this.pushMineChatterListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public UserProfileState defaultState() {
        return new UserProfileState(null, null, null, null, getNameCardId(), getEmail(), null, false, false, false, null, null, null, null, 16335, null);
    }

    public final void deleteNameCard() {
        String nameCardId = getNameCardId();
        if (nameCardId != null) {
            Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52713f(nameCardId, null, this), 3, null);
        }
    }

    public final void loadProfileFormLocal() {
        UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180608a();
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52719k(this, null), 3, null);
    }

    public final void loadProfileFromNet() {
        this.isLoadedFormNet = false;
        UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180613c();
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52722l(this, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ac */
    static final class C52698ac extends Lambda implements Function0<ContactSource> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52698ac(UserProfileViewModel baVar) {
            super(0);
            this.this$0 = baVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ContactSource invoke() {
            ContactSource contactSource;
            Bundle bundle = this.this$0.enterParams;
            if (bundle != null) {
                Serializable serializable = bundle.getSerializable("param_key_source");
                if (serializable == null || !(serializable instanceof ContactSource)) {
                    contactSource = null;
                } else {
                    contactSource = (ContactSource) serializable;
                }
                if (contactSource != null) {
                    return contactSource;
                }
            }
            return new ContactSource.C29531a().mo104726a(0).mo104728a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ab */
    public static final class C52696ab extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52696ab(UserProfileViewModel baVar) {
            super(1);
            this.this$0 = baVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel$sendHitPointProfileMainView$1$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ab$a */
        public static final class C52697a extends Lambda implements Function1<JSONObject, JSONObject> {
            final /* synthetic */ UserProfileState $it$inlined;
            final /* synthetic */ C52696ab this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52697a(C52696ab abVar, UserProfileState azVar) {
                super(1);
                this.this$0 = abVar;
                this.$it$inlined = azVar;
            }

            public final JSONObject invoke(JSONObject jSONObject) {
                Intrinsics.checkParameterIsNotNull(jSONObject, "$receiver");
                jSONObject.put("contain_module", this.this$0.this$0.getContainModules(this.$it$inlined.mo180042h(), this.$it$inlined.mo180047l()));
                return jSONObject;
            }
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            boolean z2;
            GetUserProfileResponse a;
            boolean z3;
            GetUserProfileResponse.Permission permission;
            Boolean bool;
            boolean z4;
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            UserProfileState.NameTagInfo t = azVar.mo180055t();
            if (t != null) {
                UserProfileHitPointV3.Companion aVar = UserProfileHitPointV3.f130746c;
                String generateGenderStr = this.this$0.generateGenderStr(t.mo180079a());
                if (t.mo180082d() != null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean c = t.mo180081c();
                String accountTag = this.this$0.getAccountTag(t);
                boolean z5 = !azVar.mo180008N().isEmpty();
                List<UserProfileState.TabInfo> i = azVar.mo180044i();
                if (!(i instanceof Collection) || !i.isEmpty()) {
                    Iterator<T> it = i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().mo180094b() == GetUserProfileResponse.TabInfo.TabType.F_COMMUNITY) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            z2 = true;
                            break;
                        }
                    }
                    String friendConversion = this.this$0.getFriendConversion(azVar.mo180060x());
                    String value = azVar.mo180011Q().getValue();
                    a = azVar.mo180020Z().mo86206a();
                    if (a != null || (permission = a.permission) == null || (bool = permission.can_not_find) == null) {
                        z3 = false;
                    } else {
                        z3 = bool.booleanValue();
                    }
                    aVar.mo180566a(generateGenderStr, z, c, accountTag, z5, z2, friendConversion, value, z3, azVar.mo180049n(), azVar.mo180010P(), azVar.mo180050o(), azVar.mo180035b().length(), azVar.mo180014T(), azVar.mo180015U(), new C52697a(this, azVar));
                }
                z2 = false;
                String friendConversion2 = this.this$0.getFriendConversion(azVar.mo180060x());
                String value2 = azVar.mo180011Q().getValue();
                a = azVar.mo180020Z().mo86206a();
                if (a != null) {
                }
                z3 = false;
                aVar.mo180566a(generateGenderStr, z, c, accountTag, z5, z2, friendConversion2, value2, z3, azVar.mo180049n(), azVar.mo180010P(), azVar.mo180050o(), azVar.mo180035b().length(), azVar.mo180014T(), azVar.mo180015U(), new C52697a(this, azVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$o */
    public static final class C52728o extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ Intent $intent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52728o(Intent intent) {
            super(1);
            this.$intent = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            if (azVar.mo180020Z() instanceof Success) {
                GetUserProfileResponse.UserInfo.FriendStatus x = azVar.mo180060x();
                String j = azVar.mo180045j();
                boolean y = azVar.mo180061y();
                if (x == GetUserProfileResponse.UserInfo.FriendStatus.DOUBLE) {
                    z = true;
                } else {
                    z = false;
                }
                if (x == GetUserProfileResponse.UserInfo.FriendStatus.FORWARD) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x == GetUserProfileResponse.UserInfo.FriendStatus.REVERSE) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.$intent.putExtra("params_key_profile", new ProfileFinishResult(j, y, z, z2, z3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$p */
    public static final class C52729p extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52729p(UserProfileViewModel baVar) {
            super(1);
            this.this$0 = baVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            azVar.mo180051p().mo179600a(2);
            this.this$0.updateFriendStatus(GetUserProfileResponse.UserInfo.FriendStatus.FORWARD);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$q */
    public static final class C52730q extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ Serializable $settings;
        final /* synthetic */ UserProfileViewModel $this_run;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52730q(UserProfileViewModel baVar, Serializable serializable) {
            super(1);
            this.$this_run = baVar;
            this.$settings = serializable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            if (azVar.mo180061y() != ((ProfileSettingFinishResult) this.$settings).isBlocked()) {
                this.$this_run.loadProfileFromNet();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$t */
    static final class C52733t extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ Activity $context;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52733t(UserProfileViewModel baVar, Activity activity) {
            super(1);
            this.this$0 = baVar;
            this.$context = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            String ad = azVar.ad();
            if (ad != null) {
                this.this$0.getModel().mo179985a(this.$context, ad, azVar.mo180022a());
            }
        }
    }

    public final void setModel(UserProfileModelV3 awVar) {
        Intrinsics.checkParameterIsNotNull(awVar, "<set-?>");
        this.model = awVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "profileChatter", "Lcom/ss/android/lark/profile/dto/ProfileChatter;", "kotlin.jvm.PlatformType", "onPushMineChatter"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$aa */
    public static final class C52694aa implements AbstractC52241b {

        /* renamed from: a */
        final /* synthetic */ UserProfileViewModel f130440a;

        C52694aa(UserProfileViewModel baVar) {
            this.f130440a = baVar;
        }

        @Override // com.ss.android.lark.profile.p2520a.p2521a.AbstractC52241b
        /* renamed from: a */
        public final void mo178827a(final ProfileChatter profileChatter) {
            this.f130440a.withState(new Function1<UserProfileState, Unit>(this) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52694aa.C526951 */
                final /* synthetic */ C52694aa this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                    invoke(azVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(UserProfileState azVar) {
                    Intrinsics.checkParameterIsNotNull(azVar, "state");
                    ProfileChatter profileChatter = profileChatter;
                    Intrinsics.checkExpressionValueIsNotNull(profileChatter, "it");
                    if (!Intrinsics.areEqual(profileChatter.getId(), azVar.mo180045j())) {
                        profileChatter = null;
                    }
                    if (profileChatter != null) {
                        this.this$0.f130440a.updateMedal(profileChatter.getAvatarMedal());
                    }
                }
            });
        }
    }

    public final void onCreateNameCard(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        withState(new C52733t(this, activity));
    }

    public final void postToast(String str) {
        setState(new C52741z(str));
    }

    public final void updateFriendStatus(GetUserProfileResponse.UserInfo.FriendStatus friendStatus) {
        Intrinsics.checkParameterIsNotNull(friendStatus, "state");
        setState(new C52701af(friendStatus));
    }

    public final void updateMedal(AvatarMedal avatarMedal) {
        setState(new C52702ag(avatarMedal));
    }

    public final void updateSpecialFocusView(boolean z) {
        setState(new C52703ah(z));
    }

    public final String generateGenderStr(GetUserProfileResponse.UserInfo.Gender gender) {
        int value = gender.getValue();
        if (value == GetUserProfileResponse.UserInfo.Gender.MAN.getValue()) {
            return "male";
        }
        if (value == GetUserProfileResponse.UserInfo.Gender.WOMAN.getValue()) {
            return "female";
        }
        return "none";
    }

    public final void getRecogniseSpansResult(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userStatus");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52717j(this, str, null), 3, null);
    }

    public final void onActivityFinish(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        unRegisterPush();
        withState(new C52728o(intent));
        if (this.needRefreshNameCardDataResult) {
            intent.putExtra("card_edited", true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$h */
    public static final class C52715h extends Lambda implements Function1<UserProfileState, UserProfileState> {
        public static final C52715h INSTANCE = new C52715h();

        C52715h() {
            super(1);
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            return UserProfileState.m204146a(azVar, null, null, null, null, null, null, new Event(Unit.INSTANCE), false, false, false, null, null, null, null, 16319, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel$generateTabSelectListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$i */
    public static final class C52716i implements UDTabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ int f130441a;

        /* renamed from: b */
        final /* synthetic */ Function0 f130442b;

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: a */
        public void mo53906a(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: b */
        public void mo53907b(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: c */
        public void mo53908c(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            if (bVar.mo91329a() != null) {
                Object a = bVar.mo91329a();
                if (a == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.lark.pb.contact.v2.GetUserProfileResponse.TabInfo.TabType");
                } else if (((GetUserProfileResponse.TabInfo.TabType) a).getValue() == this.f130441a) {
                    this.f130442b.invoke();
                }
            }
        }

        C52716i(int i, Function0 function0) {
            this.f130441a = i;
            this.f130442b = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$r */
    public static final class C52731r extends Lambda implements Function1<UserProfileState, UserProfileState> {
        public static final C52731r INSTANCE = new C52731r();

        C52731r() {
            super(1);
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            return UserProfileState.m204146a(azVar, null, null, null, null, null, null, null, false, false, false, null, new Event(new Chatter.ChatterCustomStatus.C14817a().mo54397a("").build()), null, null, 14335, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$s */
    public static final class C52732s extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ Chatter.ChatterCustomStatus $chatterStatus;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52732s(Chatter.ChatterCustomStatus chatterCustomStatus) {
            super(1);
            this.$chatterStatus = chatterCustomStatus;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            return UserProfileState.m204146a(azVar, null, null, null, null, null, null, null, false, false, false, null, new Event(this.$chatterStatus), null, null, 14335, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$v */
    public static final class C52735v extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ boolean $isFromNet;
        final /* synthetic */ UserProfileService.Response.Success $response;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52735v(UserProfileService.Response.Success bVar, boolean z) {
            super(1);
            this.$response = bVar;
            this.$isFromNet = z;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            return UserProfileState.m204146a(azVar, new Success(this.$response.mo180113a()), null, null, null, null, null, null, false, false, true, null, null, new Event(Boolean.valueOf(this.$isFromNet)), null, 11774, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$w */
    public static final class C52736w extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ boolean $isFromNet;
        final /* synthetic */ UserProfileService.Response.Success $response;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52736w(UserProfileService.Response.Success bVar, boolean z) {
            super(1);
            this.$response = bVar;
            this.$isFromNet = z;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            return UserProfileState.m204146a(azVar, new Success(this.$response.mo180113a()), null, null, null, null, null, null, false, true, false, null, null, new Event(Boolean.valueOf(this.$isFromNet)), null, 12030, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$x */
    public static final class C52737x extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ boolean $isFromNet;
        final /* synthetic */ UserProfileService.Response.Success $response;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52737x(UserProfileService.Response.Success bVar, boolean z) {
            super(1);
            this.$response = bVar;
            this.$isFromNet = z;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            return UserProfileState.m204146a(azVar, new Success(this.$response.mo180113a()), null, null, null, null, null, null, false, false, false, null, null, new Event(Boolean.valueOf(this.$isFromNet)), null, 12158, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$z */
    public static final class C52741z extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ String $text;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52741z(String str) {
            super(1);
            this.$text = str;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            return UserProfileState.m204146a(azVar, null, null, null, new Event(this.$text), null, null, null, false, false, false, null, null, null, null, 16375, null);
        }
    }

    public final String getAccountTag(UserProfileState.NameTagInfo cVar) {
        if (cVar == null) {
            return "";
        }
        if (cVar.mo180085f()) {
            return "resigned";
        }
        if (cVar.mo180083e()) {
            return "use_suspend";
        }
        if (cVar.mo180080b()) {
            return "blocked";
        }
        return "none";
    }

    public final String getFriendConversion(GetUserProfileResponse.UserInfo.FriendStatus friendStatus) {
        if (friendStatus == null) {
            return "none";
        }
        int i = bb.f130443a[friendStatus.ordinal()];
        if (i == 1) {
            return "send";
        }
        if (i == 2) {
            return "none";
        }
        if (i == 3) {
            return "invite";
        }
        if (i != 4) {
            return "none";
        }
        return "agree";
    }

    public final void updateCoverKey(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "coverKey");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165397w("UserProfileViewModel", "coverKey is empty");
        } else {
            setState(new C52700ae(str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel$deleteNameCard$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$f */
    public static final class C52713f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $it;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52713f(String str, Continuation cVar, UserProfileViewModel baVar) {
            super(2, cVar);
            this.$it = str;
            this.this$0 = baVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52713f fVar = new C52713f(this.$it, cVar, this.this$0);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52713f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UserProfileModelV3 model = this.this$0.getModel();
                String str = this.$it;
                this.L$0 = ahVar;
                this.label = 1;
                obj = model.mo179983a(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserProfileService.Response aVar = (UserProfileService.Response) obj;
            if (aVar instanceof UserProfileService.Response.Success) {
                this.this$0.setState(bc.INSTANCE);
                this.this$0.onNameCardUpdated();
            } else if (aVar instanceof UserProfileService.Response.Error) {
                UserProfileViewModel baVar = this.this$0;
                String string = UIHelper.getString(R.string.Lark_Contacts_UnableToDeleteToast);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…acts_UnableToDeleteToast)");
                baVar.postToast(string);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel$getRecogniseSpansResult$1", mo239173f = "UserProfileViewModel.kt", mo239174i = {0}, mo239175l = {674}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$j */
    public static final class C52717j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userStatus;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52717j(UserProfileViewModel baVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = baVar;
            this.$userStatus = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52717j jVar = new C52717j(this.this$0, this.$userStatus, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52717j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (this.this$0.getUserId() != null) {
                    UserProfileModelV3 model = this.this$0.getModel();
                    String str = this.$userStatus;
                    String userId = this.this$0.getUserId();
                    if (userId == null) {
                        Intrinsics.throwNpe();
                    }
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = model.mo179982a(str, userId, this);
                    if (obj == a) {
                        return a;
                    }
                }
                return Unit.INSTANCE;
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final UserProfileService.Response aVar = (UserProfileService.Response) obj;
            if (aVar instanceof UserProfileService.Response.Success) {
                this.this$0.setState(new Function1<UserProfileState, UserProfileState>() {
                    /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52717j.C527181 */

                    public final UserProfileState invoke(UserProfileState azVar) {
                        Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
                        return UserProfileState.m204146a(azVar, null, null, null, null, null, null, null, false, false, false, (RecogniseSpansResult) ((UserProfileService.Response.Success) aVar).mo180113a(), null, null, null, 15359, null);
                    }
                });
            } else if (aVar instanceof UserProfileService.Response.Error) {
                Log.m165389i("UserProfileViewModel", "user sign span info is null");
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$u */
    public static final class C52734u extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ String $descriptionText;
        final /* synthetic */ Chatter.Description.Type $descriptionType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52734u(String str, Chatter.Description.Type type) {
            super(1);
            this.$descriptionText = str;
            this.$descriptionType = type;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            GetUserProfileResponse a = azVar.mo180020Z().mo86206a();
            if (a == null) {
                return azVar;
            }
            return UserProfileState.m204146a(azVar, new Success(a.newBuilder().mo58864a(a.user_info.newBuilder().mo58856a(new Chatter.Description(this.$descriptionText, this.$descriptionType)).build()).build()), null, null, null, null, null, null, false, false, false, null, null, null, null, 16382, null);
        }
    }

    @Inject
    public UserProfileViewModel(Bundle bundle) {
        this.enterParams = bundle;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ae */
    public static final class C52700ae extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ String $coverKey;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52700ae(String str) {
            super(1);
            this.$coverKey = str;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            ImageSetPassThrough imageSetPassThrough;
            ImageSetPassThrough.C15013a newBuilder;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Async<GetUserProfileResponse> Z = azVar.mo180020Z();
            if (!(Z instanceof Success)) {
                return azVar;
            }
            Success wVar = (Success) Z;
            GetUserProfileResponse.UserInfo.C16530a newBuilder2 = ((GetUserProfileResponse) wVar.mo86206a()).user_info.newBuilder();
            ImageSetPassThrough imageSetPassThrough2 = ((GetUserProfileResponse) wVar.mo86206a()).user_info.top_image;
            if (imageSetPassThrough2 != null && (newBuilder = imageSetPassThrough2.newBuilder()) != null) {
                ImageSetPassThrough.C15013a a = newBuilder.mo54865a(this.$coverKey);
                if (a != null) {
                    imageSetPassThrough = a.build();
                    GetUserProfileResponse a2 = ((GetUserProfileResponse) wVar.mo86206a()).newBuilder().mo58864a(newBuilder2.mo58857a(imageSetPassThrough).build()).build();
                    List<GetUserProfileResponse.TabInfo> list = a2.tab_orders;
                    if (list != null && list.isEmpty()) {
                        Log.m165389i("UserProfileViewModel", "updateCoverKey, hashcode:" + a2.tab_orders.hashCode());
                    }
                    return UserProfileState.m204146a(azVar, new Success(a2), null, null, null, null, null, null, false, false, false, null, null, null, null, 16382, null);
                }
            }
            imageSetPassThrough = null;
            GetUserProfileResponse a22 = ((GetUserProfileResponse) wVar.mo86206a()).newBuilder().mo58864a(newBuilder2.mo58857a(imageSetPassThrough).build()).build();
            List<GetUserProfileResponse.TabInfo> list2 = a22.tab_orders;
            Log.m165389i("UserProfileViewModel", "updateCoverKey, hashcode:" + a22.tab_orders.hashCode());
            return UserProfileState.m204146a(azVar, new Success(a22), null, null, null, null, null, null, false, false, false, null, null, null, null, 16382, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$af */
    public static final class C52701af extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ GetUserProfileResponse.UserInfo.FriendStatus $state;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52701af(GetUserProfileResponse.UserInfo.FriendStatus friendStatus) {
            super(1);
            this.$state = friendStatus;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Async<GetUserProfileResponse> Z = azVar.mo180020Z();
            if (!(Z instanceof Success)) {
                return azVar;
            }
            Success wVar = (Success) Z;
            GetUserProfileResponse a = ((GetUserProfileResponse) wVar.mo86206a()).newBuilder().mo58864a(((GetUserProfileResponse) wVar.mo86206a()).user_info.newBuilder().mo58858a(this.$state).build()).build();
            List<GetUserProfileResponse.TabInfo> list = a.tab_orders;
            if (list != null) {
                List<GetUserProfileResponse.TabInfo> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Log.m165389i("UserProfileViewModel", "updateFriendStatus, hashcode:" + a.tab_orders.hashCode());
                }
            }
            return UserProfileState.m204146a(azVar, new Success(a), null, null, null, null, null, null, false, false, false, null, null, null, null, 16382, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ag */
    public static final class C52702ag extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ AvatarMedal $avatarMedal;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52702ag(AvatarMedal avatarMedal) {
            super(1);
            this.$avatarMedal = avatarMedal;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            com.bytedance.lark.pb.basic.v1.AvatarMedal avatarMedal;
            GetUserProfileResponse.UserInfo.C16530a newBuilder;
            GetUserProfileResponse.UserInfo.C16530a a;
            AvatarMedal.C14694a newBuilder2;
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Async<GetUserProfileResponse> Z = azVar.mo180020Z();
            if (!(Z instanceof Success)) {
                return azVar;
            }
            Success wVar = (Success) Z;
            com.bytedance.lark.pb.basic.v1.AvatarMedal avatarMedal2 = ((GetUserProfileResponse) wVar.mo86206a()).user_info.avatar_medal;
            GetUserProfileResponse.UserInfo userInfo = null;
            if (!(avatarMedal2 == null || (newBuilder2 = avatarMedal2.newBuilder()) == null)) {
                com.ss.android.lark.chat.entity.chatter.AvatarMedal avatarMedal3 = this.$avatarMedal;
                if (avatarMedal3 != null) {
                    str = avatarMedal3.getKey();
                } else {
                    str = null;
                }
                AvatarMedal.C14694a a2 = newBuilder2.mo54109a(str);
                if (a2 != null) {
                    com.ss.android.lark.chat.entity.chatter.AvatarMedal avatarMedal4 = this.$avatarMedal;
                    if (avatarMedal4 != null) {
                        str2 = avatarMedal4.getName();
                    } else {
                        str2 = null;
                    }
                    AvatarMedal.C14694a b = a2.mo54111b(str2);
                    if (b != null) {
                        avatarMedal = b.build();
                        GetUserProfileResponse.UserInfo userInfo2 = ((GetUserProfileResponse) wVar.mo86206a()).user_info;
                        if (!(userInfo2 == null || (newBuilder = userInfo2.newBuilder()) == null || (a = newBuilder.mo58855a(avatarMedal)) == null)) {
                            userInfo = a.build();
                        }
                        return UserProfileState.m204146a(azVar, new Success(((GetUserProfileResponse) wVar.mo86206a()).newBuilder().mo58864a(userInfo).build()), null, null, null, null, null, null, false, false, false, null, null, null, null, 16382, null);
                    }
                }
            }
            avatarMedal = null;
            GetUserProfileResponse.UserInfo userInfo22 = ((GetUserProfileResponse) wVar.mo86206a()).user_info;
            userInfo = a.build();
            return UserProfileState.m204146a(azVar, new Success(((GetUserProfileResponse) wVar.mo86206a()).newBuilder().mo58864a(userInfo).build()), null, null, null, null, null, null, false, false, false, null, null, null, null, 16382, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$ah */
    public static final class C52703ah extends Lambda implements Function1<UserProfileState, UserProfileState> {
        final /* synthetic */ boolean $IsConcerned;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52703ah(boolean z) {
            super(1);
            this.$IsConcerned = z;
        }

        public final UserProfileState invoke(UserProfileState azVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Async<GetUserProfileResponse> Z = azVar.mo180020Z();
            if (!(Z instanceof Success)) {
                return azVar;
            }
            Success wVar = (Success) Z;
            GetUserProfileResponse a = ((GetUserProfileResponse) wVar.mo86206a()).newBuilder().mo58864a(((GetUserProfileResponse) wVar.mo86206a()).user_info.newBuilder().mo58859a(Boolean.valueOf(this.$IsConcerned)).build()).build();
            if (this.$IsConcerned) {
                str = UIHelper.getString(R.string.Legacy_Legacy_DoneSetAsSpecialRemind_Toast);
            } else {
                str = UIHelper.getString(R.string.Legacy_Legacy_RemovedFromSpecialRemind_Toast);
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "tip");
            return UserProfileState.m204146a(azVar, new Success(a), null, null, null, null, null, null, false, false, false, null, null, null, new Event(new IconToast(str, R.drawable.ud_icon_yes_outlined)), 8190, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel$acceptAddFriendRequest$1", mo239173f = "UserProfileViewModel.kt", mo239174i = {0}, mo239175l = {MediaPlayer.MEDIA_PLAYER_OPTION_APPID}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$b */
    static final class C52705b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $contactApplicationId;
        final /* synthetic */ Context $context;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52705b(UserProfileViewModel baVar, String str, Context context, Continuation cVar) {
            super(2, cVar);
            this.this$0 = baVar;
            this.$contactApplicationId = str;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52705b bVar = new C52705b(this.this$0, this.$contactApplicationId, this.$context, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52705b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UserProfileModelV3 model = this.this$0.getModel();
                String str = this.$contactApplicationId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = model.mo179988b(str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final UserProfileService.Response aVar = (UserProfileService.Response) obj;
            if (aVar instanceof UserProfileService.Response.Success) {
                new ActionBtnViewData(0, false, false, 7, null).mo179600a(1);
                this.this$0.updateFriendStatus(GetUserProfileResponse.UserInfo.FriendStatus.DOUBLE);
                this.this$0.setState(C527061.INSTANCE);
                this.this$0.loadProfileFromNet();
                C57783ah.m224245a().mo196093a(R.id.UiMessageExternalContactUsingItem, UserContactStatus.CONTACT_STATUS_RECEIVE);
            } else if (aVar instanceof UserProfileService.Response.Error) {
                UserProfileService.Response.Error aVar2 = (UserProfileService.Response.Error) aVar;
                Log.m165383e("UserProfileViewModel", aVar2.mo180109a().getDebugMsg());
                if (aVar2.mo180109a().getErrorCode() == UserAuthorityUtils.f129641a.mo179073a()) {
                    UserAuthorityUtils.f129641a.mo179074a(this.$context, aVar2.mo180109a());
                } else {
                    this.this$0.setState(new Function1<UserProfileState, UserProfileState>() {
                        /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52705b.C527072 */

                        public final UserProfileState invoke(UserProfileState azVar) {
                            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
                            return UserProfileState.m204146a(azVar, null, null, null, new Event(((UserProfileService.Response.Error) aVar).mo180109a().getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ProfileAcceptVerificationFailed))), null, null, null, false, false, false, null, null, null, null, 16375, null);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel$createP2pSecretChat$1", mo239173f = "UserProfileViewModel.kt", mo239174i = {0}, mo239175l = {408}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$e */
    public static final class C52711e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ContactSource $source;
        final /* synthetic */ String $userId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52711e(UserProfileViewModel baVar, String str, ContactSource contactSource, Continuation cVar) {
            super(2, cVar);
            this.this$0 = baVar;
            this.$userId = str;
            this.$source = contactSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52711e eVar = new C52711e(this.this$0, this.$userId, this.$source, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52711e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UserProfileModelV3 model = this.this$0.getModel();
                String str = this.$userId;
                ContactSource contactSource = this.$source;
                this.L$0 = ahVar;
                this.label = 1;
                obj = model.mo179989c(str, contactSource, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final UserProfileService.Response aVar = (UserProfileService.Response) obj;
            if (aVar instanceof UserProfileService.Response.Success) {
                this.this$0.setState(new Function1<UserProfileState, UserProfileState>() {
                    /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52711e.C527121 */

                    public final UserProfileState invoke(UserProfileState azVar) {
                        Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
                        return UserProfileState.m204146a(azVar, null, new Event(((UserProfileService.Response.Success) aVar).mo180113a()), null, null, null, null, null, false, false, false, null, null, null, null, 16381, null);
                    }
                });
            } else if (aVar instanceof UserProfileService.Response.Error) {
                ErrorResult a2 = ((UserProfileService.Response.Error) aVar).mo180109a();
                if (a2.getErrorCode() == 4051) {
                    IProfileModuleDependency d = C52239a.m202617d();
                    Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                    d.mo133586p().mo133615e(a2.getDisplayMsg());
                } else if (a2.getErrorCode() == 5101) {
                    UserProfileViewModel baVar = this.this$0;
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Chat_CantStaretSecretChatLongTimeNoLoggin);
                    Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…cretChatLongTimeNoLoggin)");
                    baVar.postToast(mustacheFormat);
                } else {
                    if (a2.getErrorCode() == 6003) {
                        String displayMsg = a2.getDisplayMsg();
                        if (!(displayMsg == null || displayMsg.length() == 0)) {
                            z = false;
                        }
                        if (!z) {
                            String displayMsg2 = a2.getDisplayMsg();
                            if (displayMsg2 != null) {
                                UserProfileViewModel baVar2 = this.this$0;
                                Intrinsics.checkExpressionValueIsNotNull(displayMsg2, "it");
                                baVar2.postToast(displayMsg2);
                            }
                        }
                    }
                    UserProfileViewModel baVar3 = this.this$0;
                    String displayMsg3 = a2.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ProfileDetailCreateSecretChatFailed));
                    Intrinsics.checkExpressionValueIsNotNull(displayMsg3, "error.getDisplayMsg(UIHe…lCreateSecretChatFailed))");
                    baVar3.postToast(displayMsg3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel$onSpecialFocusViewClick$1", mo239173f = "UserProfileViewModel.kt", mo239174i = {0}, mo239175l = {277}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$y */
    public static final class C52738y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $chatterId;
        final /* synthetic */ boolean $isSpecialFocus;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52738y(UserProfileViewModel baVar, boolean z, long j, Continuation cVar) {
            super(2, cVar);
            this.this$0 = baVar;
            this.$isSpecialFocus = z;
            this.$chatterId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52738y yVar = new C52738y(this.this$0, this.$isSpecialFocus, this.$chatterId, cVar);
            yVar.p$ = (CoroutineScope) obj;
            return yVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52738y) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UserProfileModelV3 model = this.this$0.getModel();
                boolean z = this.$isSpecialFocus;
                long j = this.$chatterId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = model.mo179984a(z, j, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final RucketResult bVar = (RucketResult) obj;
            if (bVar instanceof RucketResult.Success) {
                this.this$0.updateSpecialFocusView(!this.$isSpecialFocus);
            } else if (bVar instanceof RucketResult.Error) {
                int errorCode = ((RucketResult.Error) bVar).mo93493c().getErrorCode();
                if (errorCode == 5066) {
                    final String string = UIHelper.getString(R.string.Lark_Legacy_UnableToAddImportantContactsMax100_Toast);
                    this.this$0.setState(new Function1<UserProfileState, UserProfileState>() {
                        /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52738y.C527391 */

                        public final UserProfileState invoke(UserProfileState azVar) {
                            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
                            return UserProfileState.m204146a(azVar, null, null, null, new Event(((RucketResult.Error) bVar).mo93493c().getDisplayMsg(string)), null, null, null, false, false, false, null, null, null, null, 16375, null);
                        }
                    });
                } else if (errorCode == 10008 || errorCode == 340000) {
                    this.this$0.setState(new Function1<UserProfileState, UserProfileState>() {
                        /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52738y.C527402 */

                        public final UserProfileState invoke(UserProfileState azVar) {
                            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
                            String displayMsg = ((RucketResult.Error) bVar).mo93493c().getDisplayMsg();
                            if (displayMsg == null) {
                                displayMsg = "";
                            }
                            return UserProfileState.m204146a(azVar, null, null, null, new Event(displayMsg), null, null, null, false, false, false, null, null, null, null, 16375, null);
                        }
                    });
                }
                Log.m165389i("UserProfileViewModel", "udpate status of special focus faild, current isSpecislFocus: " + this.$isSpecialFocus);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel$loadProfileFormLocal$1", mo239173f = "UserProfileViewModel.kt", mo239174i = {0, 1}, mo239175l = {181, 184}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$k */
    public static final class C52719k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52719k(UserProfileViewModel baVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = baVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52719k kVar = new C52719k(this.this$0, cVar);
            kVar.p$ = (CoroutineScope) obj;
            return kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52719k) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 300
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52719k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel$loadProfileFromNet$1", mo239173f = "UserProfileViewModel.kt", mo239174i = {0, 1}, mo239175l = {224, 227}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.ba$l */
    public static final class C52722l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52722l(UserProfileViewModel baVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = baVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52722l lVar = new C52722l(this.this$0, cVar);
            lVar.p$ = (CoroutineScope) obj;
            return lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52722l) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 278
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel.C52722l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final UDTabLayout.OnTabSelectedListener generateTabSelectListener(int i, Function0<Unit> function0) {
        return new C52716i(i, function0);
    }

    public final void acceptAddFriendRequest(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52705b(this, str, context, null), 3, null);
    }

    public final void createP2pSecretChat(String str, ContactSource contactSource) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52711e(this, str, contactSource, null), 3, null);
    }

    public final void onDescriptionChanged(String str, Chatter.Description.Type type) {
        Intrinsics.checkParameterIsNotNull(str, "descriptionText");
        Intrinsics.checkParameterIsNotNull(type, "descriptionType");
        setState(new C52734u(str, type));
    }

    public final void onSpecialFocusViewClick(boolean z, long j) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52738y(this, z, j, null), 3, null);
    }

    public final void onLoadDataSuccess(UserProfileService.Response.Success<GetUserProfileResponse> bVar, boolean z) {
        boolean z2;
        GetUserProfileResponse.Permission permission;
        Boolean bool;
        GetUserProfileResponse a = bVar.mo180113a();
        if (a == null || (permission = a.permission) == null || (bool = permission.can_not_find) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        if (z2) {
            setState(new C52735v(bVar, z));
        } else if (!this.netInfoDataEmpty || !this.localInfoDataEmpty) {
            setState(new C52737x(bVar, z));
        } else {
            setState(new C52736w(bVar, z));
        }
    }

    public final String getContainModules(List<UserProfileState.CtaInfo> list, List<? extends BaseInfoViewDataV3> list2) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            List<UserProfileState.CtaInfo> list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().mo180063a());
            }
            arrayList.addAll(arrayList2);
        }
        if (!list2.isEmpty()) {
            List<? extends BaseInfoViewDataV3> list4 = list2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().mo180256d());
            }
            arrayList.addAll(arrayList3);
        }
        if (!arrayList.isEmpty()) {
            return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        }
        return "none";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Serializable serializable;
        Serializable serializableExtra;
        String str;
        if (i2 == -1) {
            Boolean bool = null;
            Serializable serializable2 = null;
            UserCustomStatus userCustomStatus = null;
            if (i == 1) {
                if (intent != null) {
                    bool = Boolean.valueOf(intent.getBooleanExtra("card_edited", false));
                }
                if (bool != null && bool.booleanValue()) {
                    loadProfileFromNet();
                }
            } else if (i == 2) {
                if (intent != null) {
                    serializable = intent.getSerializableExtra(UpdateKey.STATUS);
                } else {
                    serializable = null;
                }
                if (serializable instanceof UserCustomStatus) {
                    userCustomStatus = serializable;
                }
                UserCustomStatus userCustomStatus2 = userCustomStatus;
                if (userCustomStatus2 == null) {
                    setState(C52731r.INSTANCE);
                    return;
                }
                Chatter.ChatterCustomStatus a = new Chatter.ChatterCustomStatus.C14817a().mo54399b(userCustomStatus2.icon_key).mo54397a(userCustomStatus2.title).mo54395a(userCustomStatus2.effective_interval).build();
                Intrinsics.checkExpressionValueIsNotNull(a, "Chatter.ChatterCustomSta…fective_interval).build()");
                setState(new C52732s(a));
            } else if (i == 255) {
                if (intent != null) {
                    serializable2 = intent.getSerializableExtra("user_status");
                }
                if (serializable2 != null && (serializable2 instanceof ChatterDescription)) {
                    ChatterDescription chatterDescription = (ChatterDescription) serializable2;
                    String str2 = chatterDescription.description;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.description");
                    ChatterDescription.Type type = chatterDescription.type;
                    Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
                    Chatter.Description.Type fromValue = Chatter.Description.Type.fromValue(type.getNumber());
                    Intrinsics.checkExpressionValueIsNotNull(fromValue, "Description.Type.fromValue(it.type.number)");
                    onDescriptionChanged(str2, fromValue);
                }
            } else if (i == 4842) {
                updateFriendStatus(GetUserProfileResponse.UserInfo.FriendStatus.FORWARD);
                finish();
            } else if (i == 7914) {
                UserProfileViewModel baVar = this;
                if (intent != null && (serializableExtra = intent.getSerializableExtra("params_key_profile_setting")) != null) {
                    Intrinsics.checkExpressionValueIsNotNull(serializableExtra, "data?.getSerializableExt…LE_SETTING) ?: return@run");
                    if (serializableExtra == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.func.profile_setting.ProfileSettingFinishResult");
                    } else if (((ProfileSettingFinishResult) serializableExtra).isDeleted()) {
                        baVar.finish();
                    } else {
                        baVar.withState(new C52730q(baVar, serializableExtra));
                    }
                }
            } else if (i == 8941) {
                withState(new C52729p(this));
            } else if (i == 528) {
                if (intent == null || (str = intent.getStringExtra("image_key")) == null) {
                    str = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "data?.getStringExtra(PROFILE_COVER_KEY) ?: \"\"");
                updateCoverKey(str);
            } else if (i == 529) {
                loadProfileFromNet();
            }
        }
    }
}
