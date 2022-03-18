package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.vc.meeting.framework.meeting.Description;

public interface SmEvents {
    @Description(desc = "Meeting auto end")
    public static final int EVENT_AUTO_END = 218;
    @Description(desc = "(Force Terminated): 收到推送vc里的force字段为true,强制结束本地会议,或者忙线响铃接通的时候强行结束宿主会议")
    public static final int EVENT_FT = 214;
    @Description(desc = "(Heart Beat Reset): 服务端下发命令告知心跳停止，客户端需关闭指定会议")
    public static final int EVENT_HBRESET = 203;
    @Description(desc = "(Heart Beat Notice Disconnect): 心跳告知断线")
    public static final int EVENT_HB_NOTICE_DISCONNECT = 205;
    @Description(desc = "发送心跳，但是服务端检测该心跳不合法（meetingid或deviceid错误）")
    public static final int EVENT_HEARTBEAT_INVALID = 215;
    @Description(desc = "本地正忙时重新发起会议，用户选择强制结束之前的会议")
    public static final int EVENT_LOCAL_BUSY_FORCE_END_LAST = 217;
    @Description(desc = "会议许可时间超时")
    public static final int EVENT_MEETING_LICENSE_TIME_OUT = 216;
    @Description(desc = "(Notice Calling):  收到推送，参会者状态为CALLING")
    public static final int EVENT_NC = 108;
    @Description(desc = "(ExtraInfo Notice Ringing Received):  主叫收到推送，被叫已经收到响铃")
    public static final int EVENT_NE_RR = 112;
    @Description(desc = "(Notice OnTheCall): 收到推送， 参会者状态为ONTHECALL")
    public static final int EVENT_NO = 110;
    @Description(desc = "(No Network): 无网络情况")
    public static final int EVENT_NONET = 206;
    @Description(desc = "(Notice Ringing): 收到推送， 参会者状态为RINGING")
    public static final int EVENT_NR = 109;
    @Description(desc = "(Notice Terminated): 收到推送， 参会者状态为TERMINATED")
    public static final int EVENT_NT = 111;
    @Description(desc = "(Notice Waiting): 收到信息， 参会者状态为Waiting")
    public static final int EVENT_NW = 120;
    @Description(desc = "(Response Error): 收到创建会议失败的返回")
    public static final int EVENT_RE = 113;
    @Description(desc = "(Response Success): 收到Create Meeting Request成功的响应. 状态机不处理此事件,1v1独有")
    public static final int EVENT_RS = 116;
    @Description(desc = "SDK异常")
    public static final int EVENT_SDK_EXCEPTION = 210;
    @Description(desc = "(Time Out): 120s超时")
    public static final int EVENT_TO = 114;
    @Description(desc = "用户点击接听按钮,收到服务端response失败")
    public static final int EVENT_UA_ERROR = 145;
    @Description(desc = "用户点击接听按钮,收到服务端response成功")
    public static final int EVENT_UA_SUCCESS = 144;
    @Description(desc = "用户点击取消按钮. 状态机不处理此事件.(处理RSUC, RSUNC),1v1独有")
    public static final int EVENT_UC = 104;
    @Description(desc = "多人会议 - 主持人结束会议")
    public static final int EVENT_UE = 99;
    @Description(desc = "用户点击挂断按钮")
    public static final int EVENT_UH = 103;
    @Description(desc = "发起创建会议的请求，即将进入calling状态")
    public static final int EVENT_UO = 100;
    @Description(desc = "用户点击拒绝按钮")
    public static final int EVENT_UR = 101;
    @Description(desc = "user logout")
    public static final int EVENT_USER_LOGOUT = 211;
}
