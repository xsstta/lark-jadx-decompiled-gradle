package com.ss.android.vc.meeting.framework.meeting;

public interface IByteRtcError {
    @Description(desc = "音频设备初始化失败")
    public static final int BRERR_ADM_INIT_FAILE = -1020;
    @Description(desc = "BRERR_ADM_NO_MODIFY_PERMISSION")
    public static final int BRERR_ADM_NO_MODIFY_PERMISSION = 1023;
    @Description(desc = "没有音频权限")
    public static final int BRERR_ADM_NO_PERMISSION = -1022;
    @Description(desc = "从服务端获取房间信息失败")
    public static final int BRERR_GET_ROOM_INVALID_RESPONSE = -1005;
    @Description(desc = "没有网络权限")
    public static final int BRERR_INM_NO_PERMISSON = -1050;
    @Description(desc = "SDK内部生成SDP失败")
    public static final int BRERR_INVALID_SDP = -1010;
    @Description(desc = "token无效")
    public static final int BRERR_INVALID_TOKEN = -1000;
    @Description(desc = "由于RTC服务端错误，导致加入房间失败")
    public static final int BRERR_JOIN_ROOM_ERROR = -1001;
    @Description(desc = "没有发布流的权限，如果业务方没有添加权限管理，则不会出发该错误")
    public static final int BRERR_NO_PUBLISH_PERMISSION = -1002;
    @Description(desc = "没有订阅流的权限，如果业务方没有添加权限管理，则不会出发该错误")
    public static final int BRERR_NO_SUBSCRIBE_PERMISSION = -1003;
    @Description(desc = "视频渲染失败")
    public static final int BRERR_RENDER_FAILED = -1030;
    @Description(desc = "音频设备启动失败")
    public static final int BRERR_START_CALL = -1021;
    @Description(desc = "相机启动失败")
    public static final int BRERR_START_CAMERA = -1041;
    @Description(desc = "没有相机权限")
    public static final int BRERR_VDM_CAMERA_NOT_AUTHORIZED = -1040;
    @Description(desc = "用户在其它设备上重复登录")
    public static final int BRRERR_DUPLICATE_LOGIN = -1004;
}
