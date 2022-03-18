package com.ss.android.vc.meeting.module.sketch.utils;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.net.service.UserInfoService;
import java.util.concurrent.ConcurrentHashMap;

public class UsernameStore {
    private ConcurrentHashMap<String, String> nameMap = new ConcurrentHashMap<>();

    public String getUsernameById(String str, int i) {
        if (this.nameMap.containsKey(str)) {
            return this.nameMap.get(str);
        }
        String a = C60733aa.m235977a(UserInfoService.getUserInfoInCache(str, ParticipantType.forNumber(i)));
        if (TextUtils.isEmpty(a)) {
            C60700b.m235864f("UsernameStore", "[getUsernameById]", "get chatter name failed with userId:" + str);
            a = "";
        }
        this.nameMap.put(str, a);
        return a;
    }
}
