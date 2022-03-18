package com.ss.android.lark.member_manage.impl.show_member.team_group.show_member;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.MemberShowView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002&'B=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0014J\u0006\u0010\u001e\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0015J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150#J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractModel;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView$IMemberShowContractDelegate;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "currentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "condition", "", "dependency", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$ViewDependency;", "isForceNet", "", "itemClickListener", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/chat/entity/chat/Chat;ILcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$ViewDependency;ZLcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;)V", "mCurrentSearchKey", "", "changeItemSelectedStatus", "", "itemId", "isSelected", "changeSelectableStatus", "isSelectable", "create", "createViewDelegate", "loadFirstPageMembers", "onSearch", "key", "removeItems", "itemList", "", "setItemClickListener", "listener", "Companion", "Delegate", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.d */
public final class MemberShowPresenter extends BasePresenter<IMemberShowContract.IMemberShowContractModel, IMemberShowContract.IMemberShowContractView, IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate> {

    /* renamed from: b */
    public static final Companion f114553b = new Companion(null);

    /* renamed from: a */
    public String f114554a = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter$Companion;", "", "()V", "TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate createViewDelegate() {
        return new Delegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo159913a();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter$Delegate;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView$IMemberShowContractDelegate;", "(Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter;)V", "canMemberLoadMore", "", "onItemClick", "", BottomDialog.f17198f, "", "onMemberLoadMore", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.d$b */
    public final class Delegate implements IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate {
        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate
        /* renamed from: a */
        public boolean mo159909a() {
            return ((IMemberShowContract.IMemberShowContractModel) MemberShowPresenter.this.getModel()).mo159893a();
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate
        /* renamed from: b */
        public void mo159910b() {
            ((IMemberShowContract.IMemberShowContractModel) MemberShowPresenter.this.getModel()).mo159890a(new C45260b(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter$Delegate$onMemberLoadMore$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.d$b$b */
        public static final class C45260b implements IGetDataCallback<SelectBeansResult> {

            /* renamed from: a */
            final /* synthetic */ Delegate f114558a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C45260b(Delegate bVar) {
                this.f114558a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("MemberShowPresenter", errorResult.getErrorMsg());
                ((IMemberShowContract.IMemberShowContractView) MemberShowPresenter.this.getView()).mo159896a();
            }

            /* renamed from: a */
            public void onSuccess(SelectBeansResult dVar) {
                if (dVar == null) {
                    Log.m165383e("MemberShowPresenter", "onMemberLoadMore data is null");
                    ((IMemberShowContract.IMemberShowContractView) MemberShowPresenter.this.getView()).mo159896a();
                    return;
                }
                ((IMemberShowContract.IMemberShowContractView) MemberShowPresenter.this.getView()).mo159905b(dVar);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Delegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter$Delegate$onItemClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.d$b$a */
        public static final class C45259a implements IGetDataCallback<Chatter> {

            /* renamed from: a */
            final /* synthetic */ Delegate f114556a;

            /* renamed from: b */
            final /* synthetic */ String f114557b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("MemberShowPresenter", errorResult.getErrorMsg());
            }

            /* renamed from: a */
            public void onSuccess(Chatter chatter) {
                if (chatter == null) {
                    Log.m165383e("MemberShowPresenter", "getItemChatter chatter is null chatterId: " + this.f114557b);
                } else if (!chatter.isProfileEnable()) {
                    Log.m165389i("MemberShowPresenter", "unsupported click, do nothing here:" + chatter.getId());
                } else if (chatter.isUser()) {
                    String id = ((IMemberShowContract.IMemberShowContractModel) MemberShowPresenter.this.getModel()).mo159894b().getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "model.getCurrentChat().getId()");
                    String name = ((IMemberShowContract.IMemberShowContractModel) MemberShowPresenter.this.getModel()).mo159894b().getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "model.getCurrentChat().getName()");
                    ((IMemberShowContract.IMemberShowContractView) MemberShowPresenter.this.getView()).mo159897a(chatter, id, name);
                } else if (chatter.isBot()) {
                    String id2 = chatter.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id2, "data.getId()");
                    ((IMemberShowContract.IMemberShowContractView) MemberShowPresenter.this.getView()).mo159906b(id2);
                } else {
                    Log.m165383e("MemberShowPresenter", "unsupported chatter type, do nothing here:" + chatter.getId());
                }
            }

            C45259a(Delegate bVar, String str) {
                this.f114556a = bVar;
                this.f114557b = str;
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate
        /* renamed from: a */
        public void mo159908a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            ((IMemberShowContract.IMemberShowContractModel) MemberShowPresenter.this.getModel()).mo159895b(str, new C45259a(this, str));
        }
    }

    /* renamed from: a */
    public final void mo159913a() {
        ((IMemberShowContract.IMemberShowContractModel) getModel()).mo159891a(new C25975i<>(new C45261c(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter$loadFirstPageMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.d$c */
    public static final class C45261c implements IGetDataCallback<SelectBeansResult> {

        /* renamed from: a */
        final /* synthetic */ MemberShowPresenter f114559a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45261c(MemberShowPresenter dVar) {
            this.f114559a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(SelectBeansResult dVar) {
            if (dVar == null) {
                Log.m165383e("MemberShowPresenter", "SelectBeansResult is null");
                ((IMemberShowContract.IMemberShowContractView) this.f114559a.getView()).mo159899a("");
                return;
            }
            ((IMemberShowContract.IMemberShowContractView) this.f114559a.getView()).mo159898a(dVar);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MemberShowPresenter", errorResult.getMessage());
            String displayMsg = errorResult.getDisplayMsg("");
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(\"\")");
            ((IMemberShowContract.IMemberShowContractView) this.f114559a.getView()).mo159899a(displayMsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowPresenter$onSearch$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/SearchData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.d$d */
    public static final class C45262d implements IGetDataCallback<SearchData> {

        /* renamed from: a */
        final /* synthetic */ MemberShowPresenter f114560a;

        /* renamed from: b */
        final /* synthetic */ String f114561b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IMemberShowContract.IMemberShowContractView) this.f114560a.getView()).mo159904b();
        }

        /* renamed from: a */
        public void onSuccess(SearchData gVar) {
            String str;
            String str2;
            ArrayList arrayList;
            if (gVar != null) {
                str = gVar.mo159929a();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f114560a.f114554a)) {
                IMemberShowContract.IMemberShowContractView bVar = (IMemberShowContract.IMemberShowContractView) this.f114560a.getView();
                if (gVar == null || (str2 = gVar.mo159929a()) == null) {
                    str2 = this.f114561b;
                }
                if (gVar == null || (arrayList = gVar.mo159930b()) == null) {
                    arrayList = new ArrayList();
                }
                bVar.mo159900a(str2, arrayList);
            }
        }

        C45262d(MemberShowPresenter dVar, String str) {
            this.f114560a = dVar;
            this.f114561b = str;
        }
    }

    /* renamed from: a */
    public final void mo159914a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f114554a = str;
        if (TextUtils.isEmpty(str)) {
            ((IMemberShowContract.IMemberShowContractView) getView()).mo159907c();
        } else {
            ((IMemberShowContract.IMemberShowContractModel) getModel()).mo159892a(str, new C45262d(this, str));
        }
    }

    /* renamed from: a */
    public final void mo159916a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "itemList");
        ((IMemberShowContract.IMemberShowContractView) getView()).mo159902a(list);
    }

    /* renamed from: a */
    public final void mo159917a(boolean z) {
        ((IMemberShowContract.IMemberShowContractView) getView()).mo159903a(z);
    }

    /* renamed from: a */
    public final void mo159915a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "itemId");
        ((IMemberShowContract.IMemberShowContractView) getView()).mo159901a(str, z);
    }

    public MemberShowPresenter(Context context, View view, Chat chat, int i, MemberShowView.ViewDependency bVar, boolean z, IBaseFragment.ItemClickListener itemClickListener) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(chat, "currentChat");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(itemClickListener, "itemClickListener");
        MemberShowView eVar = new MemberShowView(context, chat, view, bVar);
        eVar.setViewDelegate(createViewDelegate());
        eVar.mo159923a(itemClickListener);
        MemberShowModel cVar = new MemberShowModel(chat, i, z);
        setView(eVar);
        setModel(cVar);
    }
}
