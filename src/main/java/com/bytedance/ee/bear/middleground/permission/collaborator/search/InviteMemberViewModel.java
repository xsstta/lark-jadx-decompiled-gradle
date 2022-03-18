package com.bytedance.ee.bear.middleground.permission.collaborator.search;

import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\u000bJ\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/InviteMemberViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "()V", "selectedUserChangeListeners", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "Lkotlin/collections/ArrayList;", "selectedUsers", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "addUser", "", "userInfo", "clearDataAndListener", "getSelected", "registerChangeListener", "listener", "removeUser", "unregisterChangeListener", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.f */
public final class InviteMemberViewModel extends AbstractC1142af implements ISelectedUserModel {
    private final ArrayList<SelectedUserChangeListener> selectedUserChangeListeners = new ArrayList<>();
    private final ArrayList<UserInfo> selectedUsers = new ArrayList<>();

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel
    public ArrayList<UserInfo> getSelected() {
        return this.selectedUsers;
    }

    public final void clearDataAndListener() {
        this.selectedUserChangeListeners.clear();
        this.selectedUsers.clear();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel
    public void registerChangeListener(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        if (!this.selectedUserChangeListeners.contains(cVar)) {
            this.selectedUserChangeListeners.add(cVar);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel
    public void unregisterChangeListener(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        if (this.selectedUserChangeListeners.contains(cVar)) {
            this.selectedUserChangeListeners.remove(cVar);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel
    public void addUser(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (!this.selectedUsers.contains(userInfo)) {
            this.selectedUsers.add(userInfo);
            Iterator<SelectedUserChangeListener> it = this.selectedUserChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().mo37126a(userInfo);
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel
    public void removeUser(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (this.selectedUsers.contains(userInfo)) {
            this.selectedUsers.remove(userInfo);
            Iterator<SelectedUserChangeListener> it = this.selectedUserChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().mo37127b(userInfo);
            }
        }
    }
}
