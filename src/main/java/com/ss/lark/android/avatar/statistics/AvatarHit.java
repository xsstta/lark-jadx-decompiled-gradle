package com.ss.lark.android.avatar.statistics;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.IClickParam;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.ITargetParam;
import com.ss.lark.android.avatar.ui.AvatarSource;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/avatar/statistics/AvatarHit;", "", "()V", "sendAvatarProfileDecoration", "", "sendBackgroundChangeAlbumClick", ShareHitPoint.f121868c, "Lcom/ss/lark/android/avatar/ui/AvatarSource;", "sendBackgroundChangeCancelClick", "sendBackgroundChangeShotClick", "sendBackgroundChangeView", "sendBackgroundMainClick", "sendPicBrowserView", "sendProfilePicDetailClick", "sendUploadProfileAvatar", "Click", "Target", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AvatarHit {

    /* renamed from: a */
    public static final AvatarHit f162325a = new AvatarHit();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/avatar/statistics/AvatarHit$Click;", "", "Lcom/ss/android/lark/statistics/extensions/IClickParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CHANGE", "SHOT", "FROM_ALBUM", "CANCEL", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Click implements IClickParam {
        CHANGE("change"),
        SHOT("shot"),
        FROM_ALBUM("from_album"),
        CANCEL("cancel");
        
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return IClickParam.C54953a.m213210a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return IClickParam.C54953a.m213211b(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IClickParam.C54953a.m213209a(this, cVar);
        }

        private Click(String str) {
            this.value = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/avatar/statistics/AvatarHit$Target;", "", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BACKGROUND_CHANGE_VIEW", "PUBLIC_PHOTOTGRAPH_VIEW", "IM_CHAT_ALBUM_LIST_VIEW", "PROFILE_BACKGROUND_MAIN_VIEW", "NONE", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Target implements ITargetParam {
        BACKGROUND_CHANGE_VIEW("profile_background_change_view"),
        PUBLIC_PHOTOTGRAPH_VIEW("public_photograph_view"),
        IM_CHAT_ALBUM_LIST_VIEW("im_chat_album_list_view"),
        PROFILE_BACKGROUND_MAIN_VIEW("profile_background_main_view"),
        NONE("none");
        
        private final String value;

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getValue() {
            return this.value;
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public String getKey() {
            return ITargetParam.C54955a.m213215a(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public JSONObject toJson() {
            return ITargetParam.C54955a.m213216b(this);
        }

        @Override // com.ss.android.lark.statistics.extensions.IParam
        public IParam plus(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return ITargetParam.C54955a.m213214a(this, cVar);
        }

        private Target(String str) {
            this.value = str;
        }
    }

    private AvatarHit() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m252529a() {
        try {
            Statistics.sendEvent("upload_avatar");
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m252531b() {
        try {
            Statistics.sendEvent("picbrowser_view");
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m252533c() {
        try {
            Statistics.sendEvent("profile_avatar_setting");
        } catch (Throwable th) {
            Log.m165382e(th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m252530a(AvatarSource avatarSource) {
        Intrinsics.checkParameterIsNotNull(avatarSource, ShareHitPoint.f121868c);
        if (avatarSource == AvatarSource.PROFILE) {
            Statistics.sendEvent("profile_background_main_click", Click.CHANGE.plus(Target.BACKGROUND_CHANGE_VIEW).toJson());
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m252532b(AvatarSource avatarSource) {
        Intrinsics.checkParameterIsNotNull(avatarSource, ShareHitPoint.f121868c);
        if (avatarSource == AvatarSource.PROFILE) {
            Statistics.sendEvent("profile_background_change_view");
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m252534c(AvatarSource avatarSource) {
        Intrinsics.checkParameterIsNotNull(avatarSource, ShareHitPoint.f121868c);
        if (avatarSource == AvatarSource.PROFILE) {
            Statistics.sendEvent("profile_background_change_click", Click.SHOT.plus(Target.PUBLIC_PHOTOTGRAPH_VIEW).toJson());
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m252535d(AvatarSource avatarSource) {
        Intrinsics.checkParameterIsNotNull(avatarSource, ShareHitPoint.f121868c);
        if (avatarSource == AvatarSource.PROFILE) {
            Statistics.sendEvent("profile_background_change_click", Click.FROM_ALBUM.plus(Target.IM_CHAT_ALBUM_LIST_VIEW).toJson());
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m252536e(AvatarSource avatarSource) {
        Intrinsics.checkParameterIsNotNull(avatarSource, ShareHitPoint.f121868c);
        if (avatarSource == AvatarSource.PROFILE) {
            Statistics.sendEvent("profile_background_change_click", Click.CANCEL.plus(Target.PROFILE_BACKGROUND_MAIN_VIEW).toJson());
        }
    }
}
