package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001&J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\tH&J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000eH&J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u000eH&J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\tH&J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0004H&J\u001c\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060!H&J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0004H&¨\u0006'"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IUserListStorageService;", "", "addOrUpdateUsers", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "index", "", "addedUsers", "op", "Lcom/ss/android/lark/passport/infra/service/IUserListStorageService$BlockListOp;", "clean", "", "cleanAllBlockUsers", "getLastUserId", "", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "userId", "getUser", "moveUser", "toIndex", "readUsers", "removeUsers", "removedUsers", "removeUsersById", "userIds", "", "setLastUserId", "updateUser", "updatedUser", "updateUserStatus", "", "statusByUser", "", "updateUsers", "updatedUsers", "userMigrated", "user", "BlockListOp", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IUserListStorageService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IUserListStorageService$BlockListOp;", "", "(Ljava/lang/String;I)V", "Filter", "RemoveFromBlockList", "AddIntoBlockList", "Noop", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum BlockListOp {
        Filter,
        RemoveFromBlockList,
        AddIntoBlockList,
        Noop
    }

    List<User> addOrUpdateUsers(int i, List<? extends User> list, BlockListOp blockListOp);

    List<User> addOrUpdateUsers(List<? extends User> list, BlockListOp blockListOp);

    void clean();

    String getLastUserId();

    LoginInfo getLoginInfo(String str);

    User getUser(String str);

    List<User> moveUser(String str, int i);

    List<User> readUsers();

    List<User> removeUsersById(Collection<String> collection, BlockListOp blockListOp);

    void setLastUserId(String str);

    boolean updateUserStatus(Map<String, Integer> map);

    void updateUsers(List<? extends User> list);

    void userMigrated(User user);
}
