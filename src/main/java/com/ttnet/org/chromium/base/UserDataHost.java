package com.ttnet.org.chromium.base;

import android.os.Process;
import java.util.HashMap;

public final class UserDataHost {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mThreadId = ((long) Process.myTid());
    private HashMap<Class<? extends UserData>, UserData> mUserDataMap = new HashMap<>();

    private void checkThreadAndState() {
    }

    public void destroy() {
        checkThreadAndState();
        HashMap<Class<? extends UserData>, UserData> hashMap = this.mUserDataMap;
        this.mUserDataMap = null;
        for (UserData userData : hashMap.values()) {
            userData.destroy();
        }
    }

    public <T extends UserData> T getUserData(Class<T> cls) {
        checkThreadAndState();
        return cls.cast(this.mUserDataMap.get(cls));
    }

    public <T extends UserData> T removeUserData(Class<T> cls) {
        checkThreadAndState();
        return cls.cast(this.mUserDataMap.remove(cls));
    }

    public <T extends UserData> T setUserData(Class<T> cls, T t) {
        checkThreadAndState();
        this.mUserDataMap.put(cls, t);
        return (T) getUserData(cls);
    }
}
