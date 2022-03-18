package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user;

import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract;
import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IModel;", "selectedUserModel", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;)V", "create", "", "destroy", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "registerChangeListener", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "unregisterChangeListener", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.c */
public final class NewSearchUserModel implements INewSearchUserContract.IModel {

    /* renamed from: a */
    private final ISelectedUserModel f26774a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IModel
    /* renamed from: a */
    public ArrayList<UserInfo> mo37671a() {
        return this.f26774a.getSelected();
    }

    public NewSearchUserModel(ISelectedUserModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "selectedUserModel");
        this.f26774a = bVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IModel
    /* renamed from: a */
    public void mo37672a(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f26774a.registerChangeListener(cVar);
    }
}
