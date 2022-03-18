package com.ss.android.lark.chatsetting.impl.group.info.time;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chatsetting.impl.group.info.time.IView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IModel;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/chatsetting/impl/group/info/time/IModel;Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView;)V", "mContext", "Landroid/content/Context;", "create", "", "createViewDelegate", "init", "onBackPressed", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.e */
public final class GroupShareTimePresenter extends BasePresenter<IModel, IView, IView.Delegate> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IView.Delegate createViewDelegate() {
        return new C34682a(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m134790c();
    }

    /* renamed from: b */
    public final void mo128063b() {
        ((IView) getView()).mo128065a();
    }

    /* renamed from: c */
    private final void m134790c() {
        ((IView) getView()).mo128067a(((IModel) getModel()).mo128058a(), ((IModel) getModel()).mo128061c());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimePresenter$createViewDelegate$1", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IView$Delegate;", "onTimeItemSelected", "", "chatId", "", "bean", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.e$a */
    public static final class C34682a implements IView.Delegate {

        /* renamed from: a */
        final /* synthetic */ GroupShareTimePresenter f89523a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34682a(GroupShareTimePresenter eVar) {
            this.f89523a = eVar;
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.info.time.IView.Delegate
        /* renamed from: a */
        public void mo128064a(String str, GroupShareTimeBean bVar) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(bVar, "bean");
            ((IModel) this.f89523a.getModel()).mo128059a(str, bVar.mo128049b());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupShareTimePresenter(IModel gVar, IView hVar) {
        super(gVar, hVar);
        Intrinsics.checkParameterIsNotNull(gVar, "model");
        Intrinsics.checkParameterIsNotNull(hVar, "view");
    }
}
