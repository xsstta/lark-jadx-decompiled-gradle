package com.ss.android.lark.p2851u.p2852a;

import com.bytedance.lark.pb.basic.v1.Channel;
import com.ss.android.lark.chat.entity.Channel;

/* renamed from: com.ss.android.lark.u.a.d */
public class C57309d {
    /* renamed from: a */
    public static Channel m222073a(com.bytedance.lark.pb.basic.v1.Channel channel) {
        if (channel == null) {
            return null;
        }
        return new Channel(channel.type.getValue(), channel.id);
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.basic.v1.Channel m222072a(Channel channel) {
        if (channel == null) {
            return null;
        }
        return new Channel.Builder().id(channel.getId()).type(Channel.Type.fromValue(channel.getType().getNumber())).build();
    }
}
