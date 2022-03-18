package com.ss.android.lark.team.dependency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.team.entity.Team;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001aJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency;", "", "chatDependency", "Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IChatDependency;", "chatSettingDependency", "Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IChatSettingDependency;", "coreDependency", "Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$ICoreDependency;", "feedDependency", "Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IFeedDependency;", "imageDependency", "Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IImageDependency;", "isFeatureGatingEnable", "", "featureName", "", "loginDependency", "Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$ILoginDependency;", "profileDependency", "Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IProfileDependency;", "IChatDependency", "IChatSettingDependency", "ICoreDependency", "IFeedDependency", "IImageDependency", "ILoginDependency", "IProfileDependency", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.a.a */
public interface ITeamModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J8\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f0\tH&J@\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u0017\u001a\u00020\u0014H&J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u0005H&J\u001e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u0005H&J \u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H&J,\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J.\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00160\tH&J:\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\tH&J \u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0010H&¨\u00060"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IChatDependency;", "", "addMemberToChat", "", "chatId", "", "ids", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "changeGroupOwner", "newOwnerId", "checkChattersInChat", "chatterIds", "", "", "fetchChatChatters", "cursor", "limit", "", "userFullData", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "offset", "getChatById", "id", "getChatParser", "Lcom/ss/android/lark/chat/api/IChatParser;", "getDisplayNameForNickNameWithAliasRule", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getLocalChat", "openChat", "context", "Landroid/content/Context;", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "removeMemberFromChat", "searchChatChatters", "key", "condition", "updateChatAdmin", "toAddUserIds", "toDeleteUserIds", "viewChatMemberList", "activity", "Landroid/app/Activity;", "isThread", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.a.a$a */
    public interface IChatDependency {
        /* renamed from: a */
        IChatParser mo144134a();

        /* renamed from: a */
        Chat mo144135a(String str);

        /* renamed from: a */
        String mo144136a(Chatter chatter);

        /* renamed from: a */
        void mo144137a(Activity activity, String str, boolean z);

        /* renamed from: a */
        void mo144138a(Context context, String str, Chat.ChatMode chatMode);

        /* renamed from: a */
        void mo144139a(String str, String str2, int i, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

        /* renamed from: a */
        void mo144140a(String str, String str2, int i, boolean z, IGetDataCallback<ChatChatterResponse> iGetDataCallback, int i2);

        /* renamed from: a */
        void mo144141a(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo144142a(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo144143a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo144144a(List<String> list, String str, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

        /* renamed from: b */
        Chat mo144145b(String str);

        /* renamed from: b */
        void mo144146b(String str, List<String> list, IGetDataCallback<Chat> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IChatSettingDependency;", "", "getAvatarEditIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "avatarKey", "", "teamName", "team", "Lcom/ss/android/lark/team/entity/Team;", "meta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "isCreateTeam", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.a.a$b */
    public interface IChatSettingDependency {
        /* renamed from: a */
        Intent mo144151a(Context context, String str, String str2, Team team, AvatarMeta avatarMeta, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$ICoreDependency;", "", "isInZenMode", "", "time", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.a.a$c */
    public interface ICoreDependency {
        /* renamed from: a */
        boolean mo144152a(long j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IFeedDependency;", "", "showTeamTab", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.a.a$d */
    public interface IFeedDependency {
        /* renamed from: a */
        void mo144150a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IImageDependency;", "", "loadImage", "", "context", "Landroid/content/Context;", "avatarKey", "", "entityId", "imageView", "Landroid/widget/ImageView;", "imageWidth", "", "imageHeight", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.a.a$e */
    public interface IImageDependency {
        /* renamed from: a */
        void mo144129a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$ILoginDependency;", "", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "getLoginUserId", "", "getLoginUserTenantId", "isLoginCustomer", "", "isSimpleTenant", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.a.a$f */
    public interface ILoginDependency {
        /* renamed from: a */
        String mo144130a();

        /* renamed from: b */
        String mo144131b();

        /* renamed from: c */
        LoginInfo mo144132c();

        /* renamed from: d */
        boolean mo144133d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/dependency/ITeamModuleDependency$IProfileDependency;", "", "openBotProfile", "", "context", "Landroid/content/Context;", "botId", "", "openUserProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "fromChatId", "chatName", "userId", "sourceName", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.a.a$g */
    public interface IProfileDependency {
        /* renamed from: a */
        void mo144147a(Context context, Chatter chatter);

        /* renamed from: a */
        void mo144148a(Context context, String str);

        /* renamed from: a */
        void mo144149a(Context context, String str, String str2);
    }

    /* renamed from: a */
    IImageDependency mo144121a();

    /* renamed from: a */
    boolean mo144122a(String str);

    /* renamed from: b */
    ILoginDependency mo144123b();

    /* renamed from: c */
    IChatDependency mo144124c();

    /* renamed from: d */
    IProfileDependency mo144125d();

    /* renamed from: e */
    IFeedDependency mo144126e();

    /* renamed from: f */
    IChatSettingDependency mo144127f();

    /* renamed from: g */
    ICoreDependency mo144128g();
}
