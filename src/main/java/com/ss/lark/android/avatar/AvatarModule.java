package com.ss.lark.android.avatar;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.lark.android.avatar.dependency.IAvatarModuleDependency;
import com.ss.lark.android.avatar.p3206b.C64201a;
import com.ss.lark.android.avatar.service.AvatarService;
import com.ss.lark.android.avatar.ui.AvatarSource;
import com.ss.lark.android.avatar.updateapi.ChatterAvatarUpdateAPI;
import com.ss.lark.android.avatar.updateapi.EditAliasUpdateAPI;
import com.ss.lark.android.avatar.updateapi.GroupAvatarUpdateAPI;
import com.ss.lark.android.avatar.updateapi.IUpdateAvatarAPI;
import com.ss.lark.android.avatar.updateapi.MomentsBackgroundUpdateAPI;
import com.ss.lark.android.avatar.updateapi.ProfileCoverUpdateAPI;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J.\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J0\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006JX\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J(\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fJ0\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fJ6\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013J8\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0006J&\u0010&\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020'J\u001c\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130+¨\u0006-"}, d2 = {"Lcom/ss/lark/android/avatar/AvatarModule;", "", "dependency", "Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency;", "(Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency;)V", "getUpdateAvatarResultCode", "", "openAvatarSelectFromAlias", "", "context", "Landroid/app/Activity;", "imageView", "Landroid/view/View;", "requestCode", "openGetPhotoMenu", "sourceFragment", "Landroidx/fragment/app/Fragment;", "activity", "chatId", "", "previewAliasImage", "Landroid/content/Context;", "imageKey", "userId", "previewAvatar", "url", "entityId", "toolText", "updateAPI", "Lcom/ss/lark/android/avatar/updateapi/IUpdateAvatarAPI;", "faildUploadToast", ShareHitPoint.f121868c, "Lcom/ss/lark/android/avatar/ui/AvatarSource;", "previewChatterAvatar", "previewGroupAvatar", "previewMomentsProfileBackground", "toastText", "previewSelfProfileCover", "previewTopicGroupAvatar", "Landroid/widget/ImageView;", "uploadGroupAvatar", "avatarPath", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Companion", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.a */
public final class AvatarModule {

    /* renamed from: a */
    public static IAvatarModuleDependency f162300a;

    /* renamed from: b */
    public static final Companion f162301b = new Companion(null);

    @JvmStatic
    /* renamed from: b */
    public static final IAvatarModuleDependency m252480b() {
        return f162301b.mo222601a();
    }

    /* renamed from: a */
    public final int mo222591a() {
        return 777;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/lark/android/avatar/AvatarModule$Companion;", "", "()V", "sDependency", "Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency;", "getDependency", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IAvatarModuleDependency mo222601a() {
            return AvatarModule.f162300a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo222598a(Context context, String str, String str2, String str3, View view) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        String string = UIHelper.getString(R.string.Lark_Legacy_ModifyAvatarGroupChat);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…cy_ModifyAvatarGroupChat)");
        m252479a(this, context, str2, str3, view, string, new GroupAvatarUpdateAPI(str), null, 0, null, 448, null);
    }

    /* renamed from: a */
    public final void mo222597a(Context context, String str, String str2, ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        String string = UIHelper.getString(R.string.Lark_Groups_EditChannelPhoto);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…_Groups_EditChannelPhoto)");
        m252479a(this, context, str2, str, imageView, string, new GroupAvatarUpdateAPI(str), null, 0, null, 448, null);
    }

    public AvatarModule(IAvatarModuleDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f162300a = aVar;
    }

    /* renamed from: a */
    public final void mo222600a(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "avatarPath");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AvatarService.f162321a.mo222616a(str, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo222592a(Activity activity, View view, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        C64201a.m252507a(activity, view, new EditAliasUpdateAPI(), UIHelper.getString(R.string.Lark_CommunityUnableToUploadToast), i, AvatarSource.EDIT_ALIAS);
    }

    /* renamed from: a */
    public final void mo222593a(Context context, String str, String str2, View view) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        String string = UIHelper.getString(R.string.Lark_Legacy_ChangeAvatar);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…Lark_Legacy_ChangeAvatar)");
        m252479a(this, context, str, str2, view, string, new ChatterAvatarUpdateAPI(), null, 0, null, 448, null);
    }

    /* renamed from: a */
    public final void mo222599a(Fragment fragment, Activity activity, View view, int i, String str) {
        Intrinsics.checkParameterIsNotNull(fragment, "sourceFragment");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        C64201a.m252509a(fragment, activity, view, i, new GroupAvatarUpdateAPI(str));
    }

    /* renamed from: a */
    public final void mo222594a(Context context, String str, String str2, View view, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "imageKey");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        String string = UIHelper.getString(R.string.Lark_ProfileMemo_ChangeImage_Option);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…eMemo_ChangeImage_Option)");
        String string2 = UIHelper.getString(R.string.Lark_CommunityUnableToUploadToast);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(strin…unityUnableToUploadToast)");
        m252478a(context, str, str2, view, string, new EditAliasUpdateAPI(), string2, i, AvatarSource.EDIT_ALIAS);
    }

    /* renamed from: a */
    public final void mo222595a(Context context, String str, String str2, View view, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "imageKey");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        Intrinsics.checkParameterIsNotNull(str3, "toolText");
        String string = UIHelper.getString(R.string.Lark_CommunityUnableToUploadToast);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…unityUnableToUploadToast)");
        m252478a(context, str, str2, view, str3, new ProfileCoverUpdateAPI(), string, i, AvatarSource.PROFILE);
    }

    /* renamed from: a */
    public final void mo222596a(Context context, String str, String str2, View view, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "entityId");
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        Intrinsics.checkParameterIsNotNull(str3, "toolText");
        Intrinsics.checkParameterIsNotNull(str4, "toastText");
        m252479a(this, context, str, str2, view, str3, new MomentsBackgroundUpdateAPI(), str4, 0, AvatarSource.MOMENTS, SmActions.ACTION_ONTHECALL_EXIT, null);
    }

    /* renamed from: a */
    private final void m252478a(Context context, String str, String str2, View view, String str3, IUpdateAvatarAPI iUpdateAvatarAPI, String str4, int i, AvatarSource avatarSource) {
        C64201a.m252508a(context, str, str2, view, str3, iUpdateAvatarAPI, str4, i, avatarSource);
    }

    /* renamed from: a */
    static /* synthetic */ void m252479a(AvatarModule aVar, Context context, String str, String str2, View view, String str3, IUpdateAvatarAPI iUpdateAvatarAPI, String str4, int i, AvatarSource avatarSource, int i2, Object obj) {
        String str5;
        int i3;
        AvatarSource avatarSource2;
        if ((i2 & 64) != 0) {
            str5 = "";
        } else {
            str5 = str4;
        }
        if ((i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            i3 = 667;
        } else {
            i3 = i;
        }
        if ((i2 & DynamicModule.f58006b) != 0) {
            avatarSource2 = AvatarSource.NONE;
        } else {
            avatarSource2 = avatarSource;
        }
        aVar.m252478a(context, str, str2, view, str3, iUpdateAvatarAPI, str5, i3, avatarSource2);
    }
}
