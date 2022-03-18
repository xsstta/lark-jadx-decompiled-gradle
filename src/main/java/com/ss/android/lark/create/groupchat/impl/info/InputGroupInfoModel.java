package com.ss.android.lark.create.groupchat.impl.info;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract;
import com.ss.android.lark.create.groupchat.impl.service.CreateGroupService;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IModel;", "groupCreateInfo", "Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "pickChatEntities", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "(Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;Ljava/util/List;)V", "getGroupCreateInfo", "()Lcom/ss/android/lark/create/groupchat/dto/GroupCreateInfo;", "checkGroupName", "", "name", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "createGroup", "context", "Landroid/content/Context;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.info.d */
public final class InputGroupInfoModel extends BaseModel implements IInputGroupInfoContract.IModel {

    /* renamed from: a */
    private final GroupCreateInfo f93709a;

    /* renamed from: b */
    private final List<PickChatEntity> f93710b;

    @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IModel
    /* renamed from: a */
    public GroupCreateInfo mo133980a() {
        return this.f93709a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chat.PickChatEntity> */
    /* JADX WARN: Multi-variable type inference failed */
    public InputGroupInfoModel(GroupCreateInfo groupCreateInfo, List<? extends PickChatEntity> list) {
        Intrinsics.checkParameterIsNotNull(groupCreateInfo, "groupCreateInfo");
        Intrinsics.checkParameterIsNotNull(list, "pickChatEntities");
        this.f93709a = groupCreateInfo;
        this.f93710b = list;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IModel
    /* renamed from: a */
    public void mo133981a(Context context, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CreateGroupService.m142805a(context, mo133980a(), (List<? extends PickChatEntity>) this.f93710b, iGetDataCallback, true);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IModel
    /* renamed from: a */
    public void mo133982a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
        dependency.getChatDependency().mo133731a(str, wrapAndAddGetDataCallback);
    }
}
