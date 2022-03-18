package com.ss.android.lark.create.groupchat.impl.f2f;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.create.groupchat.dto.ApplicantInfo;
import com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupExtraParams;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0004B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\u0016\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/F2FCreateGroupPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDelegate;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel$ModelDelegate;", "view", "model", "(Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView;Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IModel;)V", "<set-?>", "", "isCreated", "()Z", "create", "", "createViewDelegate", "onApplicants", "applicants", "", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "onError", "errCode", "", "errorMsg", "", "onJoinGroupButtonClicked", "onNumberCodeFilled", "code", "requestFinish", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c */
public final class F2FCreateGroupPresenter extends BasePresenter<IF2FCreateGroupContract.IModel, IF2FCreateGroupContract.IView, IF2FCreateGroupContract.IView.ViewDelegate> implements IF2FCreateGroupContract.IModel.ModelDelegate, IF2FCreateGroupContract.IView.ViewDelegate {

    /* renamed from: a */
    private boolean f93623a;

    /* renamed from: b */
    private final IF2FCreateGroupContract.IView f93624b;

    /* renamed from: c */
    private final IF2FCreateGroupContract.IModel f93625c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IF2FCreateGroupContract.IView.ViewDelegate createViewDelegate() {
        return this;
    }

    /* renamed from: a */
    public final boolean mo133901a() {
        return this.f93623a;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f93623a = true;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IModel.ModelDelegate
    /* renamed from: c */
    public void mo133903c() {
        ((IF2FCreateGroupContract.IView) getView()).mo133925c();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView.ViewDelegate
    /* renamed from: d */
    public void mo133904d() {
        ((IF2FCreateGroupContract.IModel) getModel()).mo133857a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView.ViewDelegate
    /* renamed from: a */
    public void mo133899a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        ((IF2FCreateGroupContract.IModel) getModel()).mo133862a(str);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IModel.ModelDelegate
    /* renamed from: a */
    public void mo133900a(List<ApplicantInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "applicants");
        this.f93624b.mo133923a(list);
    }

    public F2FCreateGroupPresenter(IF2FCreateGroupContract.IView cVar, IF2FCreateGroupContract.IModel bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        this.f93624b = cVar;
        this.f93625c = bVar;
        cVar.setViewDelegate(createViewDelegate());
        bVar.mo133861a(this);
        setView(cVar);
        setModel(bVar);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IModel.ModelDelegate
    /* renamed from: a */
    public void mo133898a(int i, String str) {
        if (i == 2) {
            ((IF2FCreateGroupContract.IView) getView()).mo133924b();
        } else if (i != 6002) {
            ((IF2FCreateGroupContract.IView) getView()).mo133922a(str);
        } else {
            ((IF2FCreateGroupContract.IView) getView()).mo133920a();
        }
        if (i == 4013) {
            CreateGroupHitPointNew.f93887a.mo134200b(CreateGroupExtraParams.TextType.NEARBY);
        }
    }
}
