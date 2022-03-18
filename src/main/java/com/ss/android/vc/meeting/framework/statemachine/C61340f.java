package com.ss.android.vc.meeting.framework.statemachine;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.f */
public class C61340f {

    /* renamed from: a */
    private static Map<Integer, String> f153696a;

    static {
        HashMap hashMap = new HashMap();
        f153696a = hashMap;
        hashMap.put(99, "EVENT_UE|99|多人会议,主持人结束会议");
        f153696a.put(100, "EVENT_UO|100|发起创建会议的请求，即将进入calling状态");
        f153696a.put(101, "EVENT_UR|101|用户点击拒绝按钮");
        f153696a.put(103, "EVENT_UH|103|用户点击挂断按钮");
        f153696a.put(104, "EVENT_UC|104|用户点击取消按钮");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_AUTO_END), "EVENT_AUTO_END|218|Meeting Auto End");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_UA_SUCCESS), "EVENT_UA_SUCCESS|144|用户点击接听按钮,收到服务端response成功");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_UA_ERROR), "EVENT_UA_ERROR|145|用户点击接听按钮,收到服务端response失败");
        f153696a.put(108, "EVENT_NC|108|收到推送,参会者状态为CALLING");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_NR), "EVENT_NR|109|收到推送,参会者状态为RINGING");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_NO), "EVENT_NO|110|收到推送,参会者状态为ONTHECALL");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_NT), "EVENT_NT|111|收到推送,参会者状态为TERMINATED");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_NW), "EVENT_NW|120|收到信息,参会者状态为WAITING");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_NE_RR), "EVENT_NE_RR|112|主叫收到推送，被叫已经收到响铃");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_RE), "EVENT_RE|113|收到创建会议失败的返回");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_TO), "EVENT_TO|114|120s超时");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_RS), "EVENT_RS|116|收到创建会议成功的响应");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_HBRESET), "EVENT_HBRESET|203|服务端下发命令告知心跳停止,客户端需关闭指定会议");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_HB_NOTICE_DISCONNECT), "EVENT_HB_NOTICE_DISCONNECT|205|心跳告知断线");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_NONET), "EVENT_NONET|206|无网络情况");
        f153696a.put(210, "EVENT_SDK_EXCEPTION|210|SDK异常");
        f153696a.put(211, "EVENT_USER_LOGOUT|211|登出");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_FT), "EVENT_FT|214|收到推送vc里的force字段为true,强制结束本地会议,或者忙线响铃接通的时候强行结束宿主会议");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_HEARTBEAT_INVALID), "EVENT_HEARTBEAT_INVALID|215|发送心跳，但是服务端检测该心跳不合法（meetingid或deviceid错误）");
        f153696a.put(Integer.valueOf((int) SmEvents.EVENT_MEETING_LICENSE_TIME_OUT), "EVENT_MEETING_LICENSE_TIME_OUT|216|会议许可时间超时");
    }

    /* renamed from: a */
    public static String m238968a(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }

    /* renamed from: a */
    public static String m238967a(int i) {
        if (f153696a.containsKey(Integer.valueOf(i))) {
            return f153696a.get(Integer.valueOf(i));
        }
        return String.valueOf(i);
    }

    /* renamed from: a */
    public static String m238969a(Map<String, String> map) {
        if (map == null) {
            return "null";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), (Object) entry.getValue());
        }
        return jSONObject.toJSONString();
    }
}
