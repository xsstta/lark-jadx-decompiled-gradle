package com.ss.android.lark.member_manage.impl.show_member.team_group;

import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract;
import com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0015\u0016B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u0006\u0010\u0014\u001a\u00020\u0012¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberModel;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView$ITeamGroupShowMemberDelegate;", "context", "Landroid/content/Context;", "chatId", "", "isThread", "", "rootView", "Landroid/view/View;", "dependecy", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Dependency;", "isRemove", "(Landroid/content/Context;Ljava/lang/String;ZLandroid/view/View;Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Dependency;Z)V", "create", "", "createViewDelegate", "reloadData", "Companion", "Delegate", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.d */
public final class TeamGroupShowMemberPresenter extends BasePresenter<ITeamGroupShowMemberContract.ITeamGroupShowMemberModel, ITeamGroupShowMemberContract.ITeamGroupShowMemberView, ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate> {

    /* renamed from: a */
    public static final Companion f114501a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter$Companion;", "", "()V", "TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter$Delegate;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView$ITeamGroupShowMemberDelegate;", "(Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter;)V", "changeSelectableStatus", "", "isSelectable", "", "onConfirmBtnClick", "onItemClick", "item", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "onRemoveBtnClick", "onTitleLeftBtnClick", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.d$b */
    public final class Delegate implements ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate {
        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate
        /* renamed from: a */
        public void mo159853a() {
            mo159863a(true);
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate
        /* renamed from: b */
        public void mo159855b() {
            mo159863a(false);
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate
        /* renamed from: c */
        public void mo159856c() {
            ((ITeamGroupShowMemberContract.ITeamGroupShowMemberModel) TeamGroupShowMemberPresenter.this.getModel()).mo159845b(new C45238a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter$Delegate$onConfirmBtnClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.d$b$a */
        public static final class C45238a implements IGetDataCallback<List<? extends String>> {

            /* renamed from: a */
            final /* synthetic */ Delegate f114503a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C45238a(Delegate bVar) {
                this.f114503a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("TeamGroupShowMemberPresenter", errorResult.getErrorMsg());
            }

            /* renamed from: a */
            public void onSuccess(List<String> list) {
                this.f114503a.mo159863a(false);
                ITeamGroupShowMemberContract.ITeamGroupShowMemberView bVar = (ITeamGroupShowMemberContract.ITeamGroupShowMemberView) TeamGroupShowMemberPresenter.this.getView();
                if (list == null) {
                    list = new ArrayList();
                }
                bVar.mo159852b(list);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        /* renamed from: a */
        public final void mo159863a(boolean z) {
            ((ITeamGroupShowMemberContract.ITeamGroupShowMemberModel) TeamGroupShowMemberPresenter.this.getModel()).mo159844b();
            ((ITeamGroupShowMemberContract.ITeamGroupShowMemberView) TeamGroupShowMemberPresenter.this.getView()).mo159850a(z);
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate
        /* renamed from: a */
        public void mo159854a(C45084c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "item");
            if (cVar.mo159504b()) {
                ((ITeamGroupShowMemberContract.ITeamGroupShowMemberModel) TeamGroupShowMemberPresenter.this.getModel()).mo159843a(cVar);
            } else {
                ((ITeamGroupShowMemberContract.ITeamGroupShowMemberModel) TeamGroupShowMemberPresenter.this.getModel()).mo159846b(cVar);
            }
            ((ITeamGroupShowMemberContract.ITeamGroupShowMemberView) TeamGroupShowMemberPresenter.this.getView()).mo159849a(((ITeamGroupShowMemberContract.ITeamGroupShowMemberModel) TeamGroupShowMemberPresenter.this.getModel()).mo159841a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ITeamGroupShowMemberContract.ITeamGroupShowMemberView.ITeamGroupShowMemberDelegate createViewDelegate() {
        return new Delegate();
    }

    /* renamed from: b */
    public final void mo159862b() {
        ((ITeamGroupShowMemberContract.ITeamGroupShowMemberModel) getModel()).mo159842a(new C45240d(this));
        ((ITeamGroupShowMemberContract.ITeamGroupShowMemberView) getView()).mo159847a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((ITeamGroupShowMemberContract.ITeamGroupShowMemberModel) getModel()).mo159842a(new C45239c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.d$c */
    public static final class C45239c implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberPresenter f114504a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45239c(TeamGroupShowMemberPresenter dVar) {
            this.f114504a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat == null) {
                Log.m165383e("TeamGroupShowMemberPresenter", "chat is null");
            } else {
                ((ITeamGroupShowMemberContract.ITeamGroupShowMemberView) this.f114504a.getView()).mo159848a(chat);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String errorMsg = errorResult.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = "unknown error";
            }
            Log.m165383e("TeamGroupShowMemberPresenter", errorMsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter$reloadData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.d$d */
    public static final class C45240d implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberPresenter f114505a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45240d(TeamGroupShowMemberPresenter dVar) {
            this.f114505a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat == null) {
                Log.m165383e("TeamGroupShowMemberPresenter", "chat is null");
            } else {
                ((ITeamGroupShowMemberContract.ITeamGroupShowMemberView) this.f114505a.getView()).mo159851b(chat);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String errorMsg = errorResult.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = "unknown error";
            }
            Log.m165383e("TeamGroupShowMemberPresenter", errorMsg);
        }
    }

    public TeamGroupShowMemberPresenter(Context context, String str, boolean z, View view, TeamGroupShowMemberView.Dependency bVar, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependecy");
        TeamGroupShowMemberModel cVar = new TeamGroupShowMemberModel(str);
        TeamGroupShowMemberView eVar = new TeamGroupShowMemberView(context, view, bVar, z, z2);
        eVar.setViewDelegate(createViewDelegate());
        setModel(cVar);
        setView(eVar);
    }
}
