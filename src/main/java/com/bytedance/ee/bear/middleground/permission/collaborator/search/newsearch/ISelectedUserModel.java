package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch;

import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "", "addUser", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "getSelected", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "registerChangeListener", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "removeUser", "unregisterChangeListener", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b */
public interface ISelectedUserModel {
    void addUser(UserInfo userInfo);

    ArrayList<UserInfo> getSelected();

    void registerChangeListener(SelectedUserChangeListener cVar);

    void removeUser(UserInfo userInfo);

    void unregisterChangeListener(SelectedUserChangeListener cVar);
}
