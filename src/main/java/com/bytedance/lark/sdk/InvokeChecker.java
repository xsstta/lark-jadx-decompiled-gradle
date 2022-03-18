package com.bytedance.lark.sdk;

import com.bytedance.lark.pb.basic.v1.Command;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;

public class InvokeChecker {

    /* renamed from: a */
    private static Set<Command> f48315a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    static {
        HashSet hashSet = new HashSet();
        f48315a = hashSet;
        hashSet.add(Command.GET_INIT_SETTINGS);
        f48315a.add(Command.GET_UUID);
        f48315a.add(Command.GET_PARSED_RRULE_TEXT);
        f48315a.add(Command.GET_CALENDAR_EVENT_MAPPING_COLORS);
    }
}
