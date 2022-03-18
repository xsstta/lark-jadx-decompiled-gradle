package com.ss.android.lark.create.groupchat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.CreateGroupScene;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.f2f.F2FCreateGroupLauncher;
import com.ss.android.lark.create.groupchat.impl.p2p.C36344a;
import com.ss.android.lark.create.groupchat.impl.p2p.C36355d;
import com.ss.android.lark.create.groupchat.impl.select_member.C36392f;
import com.ss.android.lark.create.groupchat.impl.select_member.GroupCreateActivity;
import com.ss.android.lark.create.groupchat.impl.select_member.desktop.C36387a;
import com.ss.android.lark.create.groupchat.impl.service.CreateGroupService;
import com.ss.android.lark.create.groupchat.impl.statistics.GroupHitPoint;
import com.ss.android.lark.create.groupchat.impl.util.GroupFGUtils;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.create.groupchat.p1777a.C36246a;
import com.ss.android.lark.create.groupchat.p1777a.C36247b;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;
import java.util.Map;

@ClaymoreImpl(ICreateGroupChatModule.class)
public class CreateGroupChatModule implements ICreateGroupChatModule {
    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public String getPackageName() {
        return "create_group";
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public String getSourceMyGroup() {
        return "mygroup";
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public String getSourcePlusMenu() {
        return "plus_menu";
    }

    public static Map<String, Boolean> getFeatureConfigMap() {
        return C36246a.m142738a();
    }

    public static Map<String, Boolean> getFeatureGatingMap() {
        return C36247b.m142739a();
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public List<String> getSyncKeys() {
        return C36344a.m143216a();
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public boolean isCheckSecretPermission() {
        return GroupFGUtils.m142840d();
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public boolean isSecretOpen() {
        return GroupFGUtils.m142839c();
    }

    public static AbstractC36248c getDependency() {
        return (AbstractC36248c) ClaymoreServiceLoader.loadFirst(AbstractC36248c.class);
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void setInSecretMode(boolean z) {
        GroupFGUtils.m142835a(z);
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public AbstractC44552i getTabPageSpec(Context context) {
        return new C36387a(context);
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void startCreateF2FGroup(Activity activity) {
        F2FCreateGroupLauncher.m142891a(activity, 1);
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void openCreateGroupChatModule(Context context, String str) {
        GroupHitPoint.f93889a.mo134210a("group_im_create_group");
        GroupCreateInfo groupCreateInfo = new GroupCreateInfo();
        groupCreateInfo.setShowGroupTypeSelector(!getDependency().getAccountDependency().mo133719a());
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_group_create_info", groupCreateInfo);
        bundle.putString(ShareHitPoint.f121868c, str);
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, GroupCreateActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
            return;
        }
        getDependency().getMainDependency().mo133741a(context, "create_group", bundle);
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void openCreateGroupChatModuleForForward(C36516a aVar, int i) {
        GroupHitPoint.f93889a.mo134210a("group_im_create_group_from_forward");
        GroupCreateInfo groupCreateInfo = new GroupCreateInfo();
        groupCreateInfo.setMode(CreateGroupMode.CONVERSATION_MODE);
        groupCreateInfo.setPublic(false);
        groupCreateInfo.setOpenChat(false);
        groupCreateInfo.setShowGroupTypeSelector(false);
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_group_create_info", groupCreateInfo);
        bundle.putString(ShareHitPoint.f121868c, "forward");
        if (!DesktopUtil.m144301a((Context) aVar.getActivity())) {
            Intent intent = new Intent(aVar.getActivity(), GroupCreateActivity.class);
            intent.putExtras(bundle);
            aVar.startActivityForResult(intent, i);
            return;
        }
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_WIDE_M1).mo134945a("GroupCreateActivity").mo134930b();
        C36392f fVar = new C36392f();
        fVar.setArguments(bundle);
        C36512a.m144041a().mo134760a(aVar, fVar, a, i);
    }

    public void openCreateGroupModuleForTopic(Activity activity, BaseFragment baseFragment, int i) {
        GroupCreateInfo groupCreateInfo = new GroupCreateInfo();
        groupCreateInfo.setMode(CreateGroupMode.TOPIC_MODE);
        groupCreateInfo.setCreateTopicGroup(true);
        groupCreateInfo.setShowGroupTypeSelector(false);
        if (!DesktopUtil.m144301a((Context) activity)) {
            Intent intent = new Intent(activity, GroupCreateActivity.class);
            intent.putExtra("key_group_create_info", groupCreateInfo);
            if (baseFragment != null) {
                baseFragment.startActivityForResult(intent, i);
            } else {
                activity.startActivityForResult(intent, i);
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_group_create_info", groupCreateInfo);
            getDependency().getMainDependency().mo133741a(baseFragment.getActivity(), "create_group", bundle);
        }
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void checkPickEntityMemberCountBeforeCreate(Chat.ChatMode chatMode, List<? extends PickChatEntity> list, Chat chat, IGetDataCallback<Pair<Boolean, String>> iGetDataCallback) {
        CreateGroupService.m142807a(chatMode, list, chat, iGetDataCallback);
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void createExternalGroupFromInternal(Context context, boolean z, boolean z2, List<? extends SearchBaseInfo> list, String str, IGetDataCallback<Chat> iGetDataCallback, boolean z3) {
        GroupCreateInfo groupCreateInfo = new GroupCreateInfo();
        groupCreateInfo.setOpenChat(z3);
        if (z) {
            groupCreateInfo.setMode(CreateGroupMode.SECRET_MODE);
        } else if (z2) {
            groupCreateInfo.setMode(CreateGroupMode.TOPIC_MODE);
        }
        groupCreateInfo.setFromChatId(str);
        CreateGroupService.m142804a(context, groupCreateInfo, list, iGetDataCallback, CreateGroupScene.ADD_GROUP_MEMBER);
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void startP2pBuildGroup(Activity activity, C36516a<?> aVar, String str, List<? extends PickChatEntity> list, String str2, boolean z, boolean z2, int i) {
        GroupHitPoint.f93889a.mo134210a("group_im_add_to_p2p_chat");
        C36355d.m143284a(activity, aVar, str, list, str2, z, z2, i, "p2p_config");
    }

    @Override // com.ss.android.lark.create.groupchat.ICreateGroupChatModule
    public void createGroupFromMessageList(Context context, List<? extends PickChatEntity> list, List<? extends Contact> list2, String str, List<String> list3, Map<String, ? extends Map<String, ? extends DocPermPair.PermType>> map, IGetDataCallback<Chat> iGetDataCallback, boolean z, boolean z2) {
        CreateGroupScene createGroupScene;
        if (z2) {
            createGroupScene = CreateGroupScene.P2P;
        } else {
            createGroupScene = CreateGroupScene.ADD_GROUP_MEMBER;
        }
        CreateGroupService.m142806a(context, list, list2, str, list3, map, iGetDataCallback, z, createGroupScene);
    }
}
