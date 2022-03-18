package com.ss.android.lark.member_manage.impl.show_member.team_group;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberModel;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "mChatId", "", "(Ljava/lang/String;)V", "getMChatId", "()Ljava/lang/String;", "mChatService", "Lcom/ss/android/lark/member_manage/dependency/IGroupMemberManageModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "mDataManager", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/DataManager;", "addSelectedItem", "", "selectBean", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "clearSelectedData", "destroy", "getChatById", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getSelectedItems", "", "removeMembers", "removeSelectedItem", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.c */
public final class TeamGroupShowMemberModel extends BaseModel implements ITeamGroupShowMemberContract.ITeamGroupShowMemberModel {

    /* renamed from: b */
    public static final Companion f114493b = new Companion(null);

    /* renamed from: a */
    public final IGroupMemberManageModuleDependency.IChatDependency f114494a;

    /* renamed from: c */
    private final DataManager f114495c = DataManager.f114488b.mo159839a();

    /* renamed from: d */
    private final String f114496d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberModel$Companion;", "", "()V", "TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo159857c() {
        return this.f114496d;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberModel
    /* renamed from: b */
    public void mo159844b() {
        this.f114495c.mo159837c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.c$b */
    static final class C45235b<T> implements C57865c.AbstractC57873d<Chat> {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberModel f114497a;

        C45235b(TeamGroupShowMemberModel cVar) {
            this.f114497a = cVar;
        }

        /* renamed from: a */
        public final Chat produce() {
            return this.f114497a.f114494a.mo143743a(this.f114497a.mo159857c());
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberModel
    /* renamed from: a */
    public List<C45084c> mo159841a() {
        return new ArrayList(this.f114495c.mo159835b());
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f114495c.mo159838d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.c$c */
    static final class C45236c<T> implements C57865c.AbstractC57871b<Chat> {

        /* renamed from: a */
        final /* synthetic */ UIGetDataCallback f114498a;

        C45236c(UIGetDataCallback uIGetDataCallback) {
            this.f114498a = uIGetDataCallback;
        }

        /* renamed from: a */
        public final void consume(Chat chat) {
            this.f114498a.onSuccess(chat);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberModel$removeMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.c$d */
    public static final class C45237d implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ UIGetDataCallback f114499a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f114500b;

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            this.f114499a.onSuccess(this.f114500b);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f114499a.onErrored(errorResult);
        }

        C45237d(UIGetDataCallback uIGetDataCallback, ArrayList arrayList) {
            this.f114499a = uIGetDataCallback;
            this.f114500b = arrayList;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberModel
    /* renamed from: a */
    public void mo159842a(IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C57865c.m224574a(new C45235b(this), new C45236c(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback)));
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberModel
    /* renamed from: b */
    public void mo159846b(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectBean");
        if (!cVar.mo159504b()) {
            this.f114495c.mo159836b(cVar);
        }
    }

    public TeamGroupShowMemberModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        this.f114496d = str;
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        this.f114494a = a.getChatDependency();
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberModel
    /* renamed from: a */
    public void mo159843a(C45084c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectBean");
        if (cVar.mo159504b()) {
            this.f114495c.mo159834a(cVar);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberModel
    /* renamed from: b */
    public void mo159845b(IGetDataCallback<List<String>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (CollectionUtils.isEmpty(this.f114495c.mo159835b())) {
            iGetDataCallback.onError(new ErrorResult("mSelectedBeans is null"));
            Log.m165389i("TeamGroupShowMemberModel", "mSelectedBeans is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C45084c> it = this.f114495c.mo159835b().iterator();
        while (it.hasNext()) {
            C45084c next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "bean");
            arrayList.add(next.mo159513h());
        }
        this.f114494a.mo143750a(this.f114496d, (Iterable<String>) arrayList, (IGetDataCallback<Chat>) new C45237d(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), arrayList));
    }
}
