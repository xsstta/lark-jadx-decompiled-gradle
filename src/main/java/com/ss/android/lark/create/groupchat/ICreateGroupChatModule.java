package com.ss.android.lark.create.groupchat;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fH&JP\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\u0017\u001a\u00020\u000f2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u000eH&J\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u000f2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072 \u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u001f\u0018\u00010\u001f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH&J\n\u0010\"\u001a\u0004\u0018\u00010\u000fH&J\n\u0010#\u001a\u0004\u0018\u00010\u000fH&J\n\u0010$\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0007H&J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010(\u001a\u00020\u000eH&J\b\u0010)\u001a\u00020\u000eH&J\u001a\u0010*\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u000fH&J\u001c\u0010,\u001a\u00020\u00032\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.2\u0006\u0010/\u001a\u000200H&J\"\u00101\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u0002022\b\u0010-\u001a\u0004\u0018\u0001032\u0006\u0010/\u001a\u000200H&J\u0010\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u000eH&J\u0012\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u000102H&J\\\u00108\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u0001022\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010.2\b\u00109\u001a\u0004\u0018\u00010\u000f2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010;\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010/\u001a\u000200H\u0016¨\u0006="}, d2 = {"Lcom/ss/android/lark/create/groupchat/ICreateGroupChatModule;", "", "checkPickEntityMemberCountBeforeCreate", "", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "pickChatEntity", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "fromChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/util/Pair;", "", "", "createExternalGroupFromInternal", "context", "Landroid/content/Context;", "isSecret", "isThreadGroup", "pickInfos", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "fromChatId", "needOpenChat", "createGroupFromMessageList", "selectEntities", "contactsToApply", "Lcom/ss/android/lark/contact/entity/Contact;", "initMessageIds", "docsPermissions", "", "Lcom/ss/android/lark/doc/entity/DocPermPair$PermType;", "fromP2PBuildChat", "getPackageName", "getSourceMyGroup", "getSourcePlusMenu", "getSyncKeys", "getTabPageSpec", "Lcom/ss/android/lark/maincore/TabPageSpec;", "isCheckSecretPermission", "isSecretOpen", "openCreateGroupChatModule", ShareHitPoint.f121868c, "openCreateGroupChatModuleForForward", "sourceFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "requestCode", "", "openCreateGroupModuleForTopic", "Landroid/app/Activity;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "setInSecretMode", "isInSecretMode", "startCreateF2FGroup", "activity", "startP2pBuildGroup", "chatId", "pickChatEntities", "showDepartmentId", "isCrossTenant", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.a */
public interface ICreateGroupChatModule {
    void checkPickEntityMemberCountBeforeCreate(Chat.ChatMode chatMode, List<? extends PickChatEntity> list, Chat chat, IGetDataCallback<Pair<Boolean, String>> iGetDataCallback);

    void createExternalGroupFromInternal(Context context, boolean z, boolean z2, List<? extends SearchBaseInfo> list, String str, IGetDataCallback<Chat> iGetDataCallback, boolean z3);

    void createGroupFromMessageList(Context context, List<? extends PickChatEntity> list, List<? extends Contact> list2, String str, List<String> list3, Map<String, ? extends Map<String, ? extends DocPermPair.PermType>> map, IGetDataCallback<Chat> iGetDataCallback, boolean z, boolean z2);

    String getPackageName();

    String getSourceMyGroup();

    String getSourcePlusMenu();

    List<String> getSyncKeys();

    AbstractC44552i getTabPageSpec(Context context);

    boolean isCheckSecretPermission();

    boolean isSecretOpen();

    void openCreateGroupChatModule(Context context, String str);

    void openCreateGroupChatModuleForForward(C36516a<?> aVar, int i);

    void setInSecretMode(boolean z);

    void startCreateF2FGroup(Activity activity);

    void startP2pBuildGroup(Activity activity, C36516a<?> aVar, String str, List<? extends PickChatEntity> list, String str2, boolean z, boolean z2, int i);
}
