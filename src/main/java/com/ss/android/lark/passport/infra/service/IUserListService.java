package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.passport.signinsdk_api.account.User;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public interface IUserListService {

    public enum UserLoginSource {
        ByPull,
        ByOnPushFetch,
        ByLogin
    }

    List<User> addOrUpdateUsers(List<User> list, String str, UserLoginSource userLoginSource);

    List<String> getAllSessions();

    List<User> getAllUserList();

    List<User> getAllValidUserList();

    User getForegroundUser();

    IUserService getForegroundUserService();

    IUserService getUserService(String str);

    LinkedHashMap<User, String> getValidUserSessionMap();

    boolean isUserHasValidSession(String str);

    void onUserMigrationCompleted(User user);

    void onUserSessionInvalid(List<User> list);

    void removeAllUsers();

    List<User> removeUsersById(Collection<String> collection);

    void switchUser(String str);

    void updateUser(User user);

    void updateUser(String str, String str2, Function1<User, Unit> function1);

    void updateUserStatus(Map<String, Integer> map);

    void updateUsers(List<User> list);
}
