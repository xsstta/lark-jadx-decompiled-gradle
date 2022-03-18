package com.ss.android.lark.team.service;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.basic.v1.TeamSetting;
import com.bytedance.lark.pb.im.v1.BindTeamChatRequest;
import com.bytedance.lark.pb.im.v1.CreateTeamChatRequest;
import com.bytedance.lark.pb.im.v1.CreateTeamRequest;
import com.bytedance.lark.pb.im.v1.DeleteTeamMemberRequest;
import com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsRequest;
import com.bytedance.lark.pb.im.v1.GetItemsByEntityIdsResponse;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsRequest;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse;
import com.bytedance.lark.pb.im.v1.PatchTeamRequest;
import com.bytedance.lark.pb.im.v1.PatchTeamSettingRequest;
import com.bytedance.lark.pb.im.v1.PutTeamMemberRequest;
import com.bytedance.lark.pb.im.v1.UnbindTeamChatRequest;
import com.bytedance.lark.pb.im.v1.UpgradeToTeamRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.team.BindTeamChatPreCheckRequest;
import com.ss.android.lark.pb.team.CheckNameAvailabilityRequest;
import com.ss.android.lark.pb.team.CheckNameAvailabilityResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.api.C55357a;
import com.ss.android.lark.team.api.entity.BindTeamChatPreCheckResponse;
import com.ss.android.lark.team.api.entity.BindTeamChatResponse;
import com.ss.android.lark.team.api.entity.CreateTeamChatResponse;
import com.ss.android.lark.team.api.entity.UnbindTeamChatResponse;
import com.ss.android.lark.team.api.entity.UpgradeToTeamResponse;
import com.ss.android.lark.team.entity.CreateTeamResponse;
import com.ss.android.lark.team.entity.DeleteTeamMemberResponse;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.PatchTeamSettingResponse;
import com.ss.android.lark.team.entity.PickEntities;
import com.ss.android.lark.team.entity.PutTeamMemberResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamNameCheckType;
import com.ss.android.lark.team.entity.TeamSetting;
import com.ss.android.lark.team.p2733c.C55365a;
import com.ss.android.lark.team.p2733c.C55366b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH@ø\u0001\u0000¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J,\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J3\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012¢\u0006\u0002\u0010\u001dJD\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020$0\u0012J>\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020*0\u0012J\u001c\u0010+\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020,0\u0012J6\u0010-\u001a\u00020\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010/\u001a\u0002002\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000202010\u0012J$\u00103\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u001c2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002050\u0012J6\u00106\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u00104\u001a\u00020\u001c2\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000205010\u0012J$\u00108\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002090\u0012J)\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH@ø\u0001\u0000¢\u0006\u0002\u0010\nJ)\u0010;\u001a\u0004\u0018\u0001052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH@ø\u0001\u0000¢\u0006\u0002\u0010<J*\u0010;\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020=0\u0012J$\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020?0\u0012J$\u0010@\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020B2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020C0\u0012J$\u0010D\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020E2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020C0\u0012J$\u0010F\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020G2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020C0\u0012J,\u0010H\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020,0\u0012J$\u0010I\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020,0\u0012J$\u0010K\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020,0\u0012J#\u0010L\u001a\u0004\u0018\u0001052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010NJ$\u0010L\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020,0\u0012J$\u0010O\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020P0\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/team/service/TeamService;", "", "()V", "TAG", "", "addMemberToPrivateChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatId", "ids", "", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTeamMembers", "", "teamId", "", "list", "Lcom/ss/android/lark/team/entity/PickEntities;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PutTeamMemberResponse;", "bindChatToTeam", "teamChatType", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "Lcom/ss/android/lark/team/api/entity/BindTeamChatResponse;", "checkNameAvailability", "name", "checkType", "Lcom/ss/android/lark/team/entity/TeamNameCheckType;", "", "(Ljava/lang/String;Ljava/lang/Long;Lcom/ss/android/lark/team/entity/TeamNameCheckType;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "createTeam", "description", "avatarKey", "avatarMeta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "pickEntities", "Lcom/ss/android/lark/team/entity/CreateTeamResponse;", "createTeamChat", "groupName", "groupDescription", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "Lcom/ss/android/lark/team/api/entity/CreateTeamChatResponse;", "disbandTeam", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "getItemsByEntityIds", "entityIdList", ShareHitPoint.f121869d, "Lcom/ss/android/lark/team/entity/Item$Type;", "", "Lcom/ss/android/lark/team/entity/Item;", "getTeam", "isForceServer", "Lcom/ss/android/lark/team/entity/Team;", "getTeams", "teamIds", "preCheckBindToTeam", "Lcom/ss/android/lark/team/api/entity/BindTeamChatPreCheckResponse;", "removeMemberFromPrivateChat", "removeTeamMembers", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ss/android/lark/team/entity/DeleteTeamMemberResponse;", "unbindChatFromTeam", "Lcom/ss/android/lark/team/api/entity/UnbindTeamChatResponse;", "updateAddMemberPermission", "permission", "Lcom/ss/android/lark/team/entity/TeamSetting$AddMemberPermission;", "Lcom/ss/android/lark/team/entity/PatchTeamSettingResponse;", "updateBindTeamChatPermission", "Lcom/ss/android/lark/team/entity/TeamSetting$BindTeamChatPermission;", "updateCreateChatPermission", "Lcom/ss/android/lark/team/entity/TeamSetting$CreateTeamChatPermission;", "updateTeamAvatar", "updateTeamDesc", "desc", "updateTeamName", "updateTeamOwner", "newOwnerId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upgradeToTeam", "Lcom/ss/android/lark/team/api/entity/UpgradeToTeamResponse;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.d.b */
public final class TeamService {

    /* renamed from: a */
    public static final TeamService f136826a = new TeamService();

    private TeamService() {
    }

    /* renamed from: a */
    public final void mo189073a(String str, String str2, String str3, AvatarMeta avatarMeta, List<? extends PickEntities> list, IGetDataCallback<CreateTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "description");
        Intrinsics.checkParameterIsNotNull(str3, "avatarKey");
        Intrinsics.checkParameterIsNotNull(list, "pickEntities");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ArrayList arrayList = new ArrayList();
        for (PickEntities pickEntities : list) {
            com.bytedance.lark.pb.basic.v1.PickEntities a = C55366b.m214899a(pickEntities);
            Intrinsics.checkExpressionValueIsNotNull(a, "TeamModelParser.parsePickEntities(entities)");
            arrayList.add(a);
        }
        com.bytedance.lark.pb.basic.v1.AvatarMeta avatarMeta2 = null;
        if (avatarMeta != null) {
            avatarMeta2 = C55366b.m214898a(avatarMeta);
        }
        SdkSender.asynSendRequestNonWrap(Command.CREATE_TEAM, new CreateTeamRequest.C17384a().mo61019a(str).mo61022b(str2).mo61023c(str3).mo61017a(avatarMeta2).mo61018a(Chat.ChatMode.THREAD_V2).mo61020a(arrayList), iGetDataCallback, C55421f.f136832a);
    }

    /* renamed from: a */
    public final void mo189071a(String str, Long l, TeamNameCheckType teamNameCheckType, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(teamNameCheckType, "checkType");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.CHECK_NAME_AVAILABILITY, new CheckNameAvailabilityRequest.C50062a().mo173929a(str).mo173931b(String.valueOf(l)).mo173928a(CheckNameAvailabilityRequest.CheckType.fromValue(teamNameCheckType.getValue())), iGetDataCallback, C55420e.f136831a);
    }

    /* renamed from: a */
    public final void mo189068a(long j, String str, String str2, Chat.ChatMode chatMode, TeamChatType teamChatType, IGetDataCallback<CreateTeamChatResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "groupName");
        Intrinsics.checkParameterIsNotNull(chatMode, "chatMode");
        Intrinsics.checkParameterIsNotNull(teamChatType, "teamChatType");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Chat.ChatMode fromValue = Chat.ChatMode.fromValue(chatMode.getNumber());
        SdkSender.asynSendRequestNonWrap(Command.CREATE_TEAM_CHAT, new CreateTeamChatRequest.C17380a().mo61006a(Long.valueOf(j)).mo61004a(fromValue).mo61007a(str).mo61009b(str2).mo61005a(com.bytedance.lark.pb.basic.v1.TeamChatType.fromValue(teamChatType.getValue())), iGetDataCallback, C55422g.f136833a);
    }

    /* renamed from: a */
    public final void mo189069a(long j, List<String> list, IGetDataCallback<DeleteTeamMemberResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Long longOrNull = StringsKt.toLongOrNull(str);
            if (longOrNull != null) {
                arrayList.add(Long.valueOf(longOrNull.longValue()));
            }
        }
        SdkSender.asynSendRequestNonWrap(Command.DELETE_TEAM_MEMBER, new DeleteTeamMemberRequest.C17430a().mo61138a(Long.valueOf(j)).mo61139a(arrayList), iGetDataCallback, C55432q.f136843a);
    }

    /* renamed from: a */
    public final void mo189065a(long j, String str, IGetDataCallback<PatchTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM, new PatchTeamRequest.C17841a().mo62177a(Long.valueOf(j)).mo62178a(str).mo62179a(CollectionsKt.listOf(PatchTeamRequest.UpdateField.Name)), iGetDataCallback, C55439x.f136850a);
    }

    /* renamed from: a */
    public final void mo189066a(long j, String str, AvatarMeta avatarMeta, IGetDataCallback<PatchTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        com.bytedance.lark.pb.basic.v1.AvatarMeta a = C55366b.m214898a(avatarMeta);
        PatchTeamRequest.C17841a a2 = new PatchTeamRequest.C17841a().mo62177a(Long.valueOf(j)).mo62183c(str).mo62179a(CollectionsKt.listOf(PatchTeamRequest.UpdateField.Avatar));
        if (a != null) {
            a2.mo62175a(a);
        }
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM, a2, iGetDataCallback, C55437v.f136848a);
    }

    /* renamed from: a */
    public final void mo189063a(long j, TeamSetting.BindTeamChatPermission bindTeamChatPermission, IGetDataCallback<PatchTeamSettingResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(bindTeamChatPermission, "permission");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM_SETTING, new PatchTeamSettingRequest.C17845a().mo62194a(Long.valueOf(j)).mo62195a(CollectionsKt.listOf(PatchTeamSettingRequest.UpdateField.UPDATE_FIELD_BIND_TEAM_CHAT_PERMISSION)).mo62192a(TeamSetting.BindTeamChatPermission.Type.fromValue(bindTeamChatPermission.getValue())), iGetDataCallback, C55435t.f136846a);
    }

    /* renamed from: a */
    public final void mo189064a(long j, TeamSetting.CreateTeamChatPermission createTeamChatPermission, IGetDataCallback<PatchTeamSettingResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(createTeamChatPermission, "permission");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM_SETTING, new PatchTeamSettingRequest.C17845a().mo62194a(Long.valueOf(j)).mo62195a(CollectionsKt.listOf(PatchTeamSettingRequest.UpdateField.CREATE_TEAM_CHAT_PERMISSION)).mo62193a(TeamSetting.CreateTeamChatPermission.Type.fromValue(createTeamChatPermission.getValue())), iGetDataCallback, C55436u.f136847a);
    }

    /* renamed from: a */
    public final void mo189072a(String str, String str2, IGetDataCallback<UpgradeToTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.UPGRADE_TO_TEAM, new UpgradeToTeamRequest.C18170a().mo63020a(str).mo63019a(StringsKt.toLongOrNull(str2)), iGetDataCallback, C55416aa.f136827a);
    }

    /* renamed from: a */
    public final void mo189067a(long j, String str, TeamChatType teamChatType, IGetDataCallback<BindTeamChatResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(teamChatType, "teamChatType");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.BIND_TEAM_CHAT, new BindTeamChatRequest.C17300a().mo60781a(Long.valueOf(j)).mo60783b(StringsKt.toLongOrNull(str)).mo60780a(com.bytedance.lark.pb.basic.v1.TeamChatType.fromValue(teamChatType.getValue())), iGetDataCallback, C55419d.f136830a);
    }

    /* renamed from: a */
    public final void mo189075a(List<Long> list, boolean z, IGetDataCallback<Map<Long, Team>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "teamIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetTeamsByIdsRequest.C17695a a = new GetTeamsByIdsRequest.C17695a().mo61809a(list);
        if (z) {
            a.mo61808a(SyncDataStrategy.FORCE_SERVER);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_TEAMS_BY_IDS, a, iGetDataCallback, C55427l.f136839a);
    }

    /* renamed from: a */
    public final void mo189074a(List<String> list, Item.Type type, IGetDataCallback<Map<String, Item>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "entityIdList");
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            GetItemsByEntityIdsRequest.ItemUniqId a = new GetItemsByEntityIdsRequest.ItemUniqId.C17599a().mo61575a((String) it.next()).mo61574a(Item.Type.fromValue(type.getValue())).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "itemUniqId");
            arrayList.add(a);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_ITEMS_BY_ENTITY_IDS, new GetItemsByEntityIdsRequest.C17601a().mo61580a(arrayList), new C55425j(iGetDataCallback), C55424i.f136835a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$a */
    static final class C55415a extends Lambda implements Function1<Throwable, Unit> {
        public static final C55415a INSTANCE = new C55415a();

        C55415a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Log.m165379d("addMemberToPrivate", String.valueOf(th));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/service/TeamService$addMemberToPrivateChat$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$b */
    public static final class C55417b implements IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f136828a;

        C55417b(CancellableContinuation kVar) {
            this.f136828a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(com.ss.android.lark.chat.entity.chat.Chat chat) {
            CancellableContinuation kVar = this.f136828a;
            Result.Companion aVar = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(chat));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Result.Companion aVar = Result.Companion;
            this.f136828a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/service/TeamService$getItemsByEntityIds$rawCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/GetItemsByEntityIdsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$j */
    public static final class C55425j implements IGetDataCallback<GetItemsByEntityIdsResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f136836a;

        C55425j(IGetDataCallback iGetDataCallback) {
            this.f136836a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f136836a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(GetItemsByEntityIdsResponse getItemsByEntityIdsResponse) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (getItemsByEntityIdsResponse != null) {
                Map<Long, com.bytedance.lark.pb.basic.v1.Item> map = getItemsByEntityIdsResponse.items;
                Intrinsics.checkExpressionValueIsNotNull(map, "response.items");
                for (Map.Entry<Long, com.bytedance.lark.pb.basic.v1.Item> entry : map.entrySet()) {
                    String valueOf = String.valueOf(entry.getKey().longValue());
                    com.ss.android.lark.team.entity.Item a = C55366b.m214900a(entry.getValue());
                    Intrinsics.checkExpressionValueIsNotNull(a, "TeamModelParser.parseItem(it.value)");
                    linkedHashMap.put(valueOf, a);
                }
            }
            this.f136836a.onSuccess(linkedHashMap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$n */
    static final class C55429n extends Lambda implements Function1<Throwable, Unit> {
        public static final C55429n INSTANCE = new C55429n();

        C55429n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Log.m165379d("removeMemberFromPrivate", String.valueOf(th));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/service/TeamService$removeMemberFromPrivateChat$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$o */
    public static final class C55430o implements IGetDataCallback<com.ss.android.lark.chat.entity.chat.Chat> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f136841a;

        C55430o(CancellableContinuation kVar) {
            this.f136841a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(com.ss.android.lark.chat.entity.chat.Chat chat) {
            CancellableContinuation kVar = this.f136841a;
            Result.Companion aVar = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(chat));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Result.Companion aVar = Result.Companion;
            this.f136841a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/service/TeamService$removeTeamMembers$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/DeleteTeamMemberResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$p */
    public static final class C55431p implements IGetDataCallback<DeleteTeamMemberResponse> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f136842a;

        C55431p(CancellableContinuation kVar) {
            this.f136842a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(DeleteTeamMemberResponse deleteTeamMemberResponse) {
            Team team;
            CancellableContinuation kVar = this.f136842a;
            Result.Companion aVar = Result.Companion;
            if (deleteTeamMemberResponse != null) {
                team = deleteTeamMemberResponse.getTeam();
            } else {
                team = null;
            }
            kVar.resumeWith(Result.m271569constructorimpl(team));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Result.Companion aVar = Result.Companion;
            this.f136842a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/service/TeamService$updateTeamOwner$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$y */
    public static final class C55440y implements IGetDataCallback<PatchTeamResponse> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f136851a;

        C55440y(CancellableContinuation kVar) {
            this.f136851a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(PatchTeamResponse patchTeamResponse) {
            Team team;
            CancellableContinuation kVar = this.f136851a;
            Result.Companion aVar = Result.Companion;
            if (patchTeamResponse != null) {
                team = patchTeamResponse.getTeam();
            } else {
                team = null;
            }
            kVar.resumeWith(Result.m271569constructorimpl(team));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Result.Companion aVar = Result.Companion;
            this.f136851a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/api/entity/UpgradeToTeamResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$aa */
    static final class C55416aa<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55416aa f136827a = new C55416aa();

        C55416aa() {
        }

        /* renamed from: a */
        public final UpgradeToTeamResponse parse(byte[] bArr) {
            return C55357a.m214867a(com.bytedance.lark.pb.im.v1.UpgradeToTeamResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PutTeamMemberResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$c */
    static final class C55418c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55418c f136829a = new C55418c();

        C55418c() {
        }

        /* renamed from: a */
        public final PutTeamMemberResponse parse(byte[] bArr) {
            return C55365a.m214897a(com.bytedance.lark.pb.im.v1.PutTeamMemberResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/api/entity/BindTeamChatResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$d */
    static final class C55419d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55419d f136830a = new C55419d();

        C55419d() {
        }

        /* renamed from: a */
        public final BindTeamChatResponse parse(byte[] bArr) {
            return C55357a.m214864a(com.bytedance.lark.pb.im.v1.BindTeamChatResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse", "([B)Ljava/lang/Boolean;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$e */
    static final class C55420e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55420e f136831a = new C55420e();

        C55420e() {
        }

        /* renamed from: a */
        public final Boolean parse(byte[] bArr) {
            return CheckNameAvailabilityResponse.ADAPTER.decode(bArr).mavailable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/CreateTeamResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$f */
    static final class C55421f<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55421f f136832a = new C55421f();

        C55421f() {
        }

        /* renamed from: a */
        public final CreateTeamResponse parse(byte[] bArr) {
            return C55365a.m214893a(com.bytedance.lark.pb.im.v1.CreateTeamResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/api/entity/CreateTeamChatResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$g */
    static final class C55422g<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55422g f136833a = new C55422g();

        C55422g() {
        }

        /* renamed from: a */
        public final CreateTeamChatResponse parse(byte[] bArr) {
            return C55357a.m214865a(com.bytedance.lark.pb.im.v1.CreateTeamChatResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$h */
    static final class C55423h<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55423h f136834a = new C55423h();

        C55423h() {
        }

        /* renamed from: a */
        public final PatchTeamResponse parse(byte[] bArr) {
            return C55365a.m214895a(com.bytedance.lark.pb.im.v1.PatchTeamResponse.ADAPTER.decode(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/GetItemsByEntityIdsResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$i */
    public static final class C55424i<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55424i f136835a = new C55424i();

        C55424i() {
        }

        /* renamed from: a */
        public final GetItemsByEntityIdsResponse parse(byte[] bArr) {
            return GetItemsByEntityIdsResponse.ADAPTER.decode(bArr);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/team/entity/Team;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$l */
    public static final class C55427l<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55427l f136839a = new C55427l();

        C55427l() {
        }

        /* renamed from: a */
        public final Map<Long, Team> parse(byte[] bArr) {
            return C55357a.m214868a(GetTeamsByIdsResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/api/entity/BindTeamChatPreCheckResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$m */
    static final class C55428m<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55428m f136840a = new C55428m();

        C55428m() {
        }

        /* renamed from: a */
        public final BindTeamChatPreCheckResponse parse(byte[] bArr) {
            return C55357a.m214863a(com.ss.android.lark.pb.team.BindTeamChatPreCheckResponse.ADAPTER.decode(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/DeleteTeamMemberResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$q */
    public static final class C55432q<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55432q f136843a = new C55432q();

        C55432q() {
        }

        /* renamed from: a */
        public final DeleteTeamMemberResponse parse(byte[] bArr) {
            return C55365a.m214894a(com.bytedance.lark.pb.im.v1.DeleteTeamMemberResponse.ADAPTER.decode(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/api/entity/UnbindTeamChatResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$r */
    public static final class C55433r<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55433r f136844a = new C55433r();

        C55433r() {
        }

        /* renamed from: a */
        public final UnbindTeamChatResponse parse(byte[] bArr) {
            return C55357a.m214866a(com.bytedance.lark.pb.im.v1.UnbindTeamChatResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamSettingResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$s */
    static final class C55434s<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55434s f136845a = new C55434s();

        C55434s() {
        }

        /* renamed from: a */
        public final PatchTeamSettingResponse parse(byte[] bArr) {
            return C55365a.m214896a(com.bytedance.lark.pb.im.v1.PatchTeamSettingResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamSettingResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$t */
    static final class C55435t<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55435t f136846a = new C55435t();

        C55435t() {
        }

        /* renamed from: a */
        public final PatchTeamSettingResponse parse(byte[] bArr) {
            return C55365a.m214896a(com.bytedance.lark.pb.im.v1.PatchTeamSettingResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamSettingResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$u */
    static final class C55436u<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55436u f136847a = new C55436u();

        C55436u() {
        }

        /* renamed from: a */
        public final PatchTeamSettingResponse parse(byte[] bArr) {
            return C55365a.m214896a(com.bytedance.lark.pb.im.v1.PatchTeamSettingResponse.ADAPTER.decode(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$v */
    public static final class C55437v<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55437v f136848a = new C55437v();

        C55437v() {
        }

        /* renamed from: a */
        public final PatchTeamResponse parse(byte[] bArr) {
            return C55365a.m214895a(com.bytedance.lark.pb.im.v1.PatchTeamResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$w */
    static final class C55438w<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55438w f136849a = new C55438w();

        C55438w() {
        }

        /* renamed from: a */
        public final PatchTeamResponse parse(byte[] bArr) {
            return C55365a.m214895a(com.bytedance.lark.pb.im.v1.PatchTeamResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$x */
    static final class C55439x<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55439x f136850a = new C55439x();

        C55439x() {
        }

        /* renamed from: a */
        public final PatchTeamResponse parse(byte[] bArr) {
            return C55365a.m214895a(com.bytedance.lark.pb.im.v1.PatchTeamResponse.ADAPTER.decode(bArr));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$z */
    public static final class C55441z<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C55441z f136852a = new C55441z();

        C55441z() {
        }

        /* renamed from: a */
        public final PatchTeamResponse parse(byte[] bArr) {
            return C55365a.m214895a(com.bytedance.lark.pb.im.v1.PatchTeamResponse.ADAPTER.decode(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/team/service/TeamService$getTeam$secondCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/team/entity/Team;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.d.b$k */
    public static final class C55426k implements IGetDataCallback<Map<Long, ? extends Team>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f136837a;

        /* renamed from: b */
        final /* synthetic */ long f136838b;

        /* renamed from: a */
        public void onSuccess(Map<Long, ? extends Team> map) {
            Team team;
            IGetDataCallback iGetDataCallback = this.f136837a;
            if (map != null) {
                team = (Team) map.get(Long.valueOf(this.f136838b));
            } else {
                team = null;
            }
            iGetDataCallback.onSuccess(team);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("TeamService", "getTeam err teamId:" + this.f136838b, errorResult);
            this.f136837a.onError(errorResult);
        }

        C55426k(IGetDataCallback iGetDataCallback, long j) {
            this.f136837a = iGetDataCallback;
            this.f136838b = j;
        }
    }

    /* renamed from: a */
    public final void mo189061a(long j, IGetDataCallback<PatchTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM, new PatchTeamRequest.C17841a().mo62177a(Long.valueOf(j)).mo62176a((Boolean) true).mo62179a(CollectionsKt.listOf(PatchTeamRequest.UpdateField.IsDissolved)), iGetDataCallback, C55423h.f136834a);
    }

    /* renamed from: a */
    public final void mo189070a(long j, boolean z, IGetDataCallback<Team> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C55426k kVar = new C55426k(iGetDataCallback, j);
        List<Long> singletonList = Collections.singletonList(Long.valueOf(j));
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonList(teamId)");
        mo189075a(singletonList, z, kVar);
    }

    /* renamed from: a */
    public final Object mo189057a(long j, long j2, Continuation<? super Team> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        f136826a.mo189060a(j, j2, new C55440y(lVar));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: b */
    public final Object mo189076b(String str, List<String> list, Continuation<? super com.ss.android.lark.chat.entity.chat.Chat> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CancellableContinuationImpl lVar2 = lVar;
        lVar2.mo243064a((Function1<? super Throwable, Unit>) C55429n.INSTANCE);
        C55356a.m214819a().mo144124c().mo144146b(str, list, new C55430o(lVar2));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: c */
    public final void mo189079c(long j, String str, IGetDataCallback<UnbindTeamChatResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.UNBIND_TEAM_CHAT, new UnbindTeamChatRequest.C18125a().mo62861a(Long.valueOf(j)).mo62863b(StringsKt.toLongOrNull(str)), iGetDataCallback, C55433r.f136844a);
    }

    /* renamed from: d */
    public final void mo189080d(long j, String str, IGetDataCallback<BindTeamChatPreCheckResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.BIND_TEAM_CHAT_PRE_CHECK, new BindTeamChatPreCheckRequest.C50058a().mo173918a(Long.valueOf(j)).mo173920b(StringsKt.toLongOrNull(str)), iGetDataCallback, C55428m.f136840a);
    }

    /* renamed from: a */
    public final Object mo189058a(long j, List<String> list, Continuation<? super Team> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        f136826a.mo189069a(j, list, new C55431p(lVar));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: b */
    public final void mo189077b(long j, String str, IGetDataCallback<PatchTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM, new PatchTeamRequest.C17841a().mo62177a(Long.valueOf(j)).mo62182b(str).mo62179a(CollectionsKt.listOf(PatchTeamRequest.UpdateField.Description)), iGetDataCallback, C55438w.f136849a);
    }

    /* renamed from: a */
    public final Object mo189059a(String str, List<String> list, Continuation<? super com.ss.android.lark.chat.entity.chat.Chat> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CancellableContinuationImpl lVar2 = lVar;
        lVar2.mo243064a((Function1<? super Throwable, Unit>) C55415a.INSTANCE);
        C55356a.m214819a().mo144124c().mo144142a(str, list, new C55417b(lVar2));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: b */
    public final void mo189078b(long j, List<? extends PickEntities> list, IGetDataCallback<PutTeamMemberResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ArrayList arrayList = new ArrayList();
        for (PickEntities pickEntities : list) {
            com.bytedance.lark.pb.basic.v1.PickEntities a = C55366b.m214899a(pickEntities);
            Intrinsics.checkExpressionValueIsNotNull(a, "TeamModelParser.parsePickEntities(pickEntities)");
            arrayList.add(a);
        }
        SdkSender.asynSendRequestNonWrap(Command.PUT_TEAM_MEMBER, new PutTeamMemberRequest.C17983a().mo62491a(Long.valueOf(j)).mo62492a(arrayList), iGetDataCallback, C55418c.f136829a);
    }

    /* renamed from: a */
    public final void mo189060a(long j, long j2, IGetDataCallback<PatchTeamResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM, new PatchTeamRequest.C17841a().mo62177a(Long.valueOf(j)).mo62181b(Long.valueOf(j2)).mo62179a(CollectionsKt.listOf(PatchTeamRequest.UpdateField.Owner)), iGetDataCallback, C55441z.f136852a);
    }

    /* renamed from: a */
    public final void mo189062a(long j, TeamSetting.AddMemberPermission addMemberPermission, IGetDataCallback<PatchTeamSettingResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(addMemberPermission, "permission");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.PATCH_TEAM_SETTING, new PatchTeamSettingRequest.C17845a().mo62194a(Long.valueOf(j)).mo62195a(CollectionsKt.listOf(PatchTeamSettingRequest.UpdateField.ADD_MEMBER_PERMISSION)).mo62191a(TeamSetting.AddMemberPermission.Type.fromValue(addMemberPermission.getValue())), iGetDataCallback, C55434s.f136845a);
    }
}
