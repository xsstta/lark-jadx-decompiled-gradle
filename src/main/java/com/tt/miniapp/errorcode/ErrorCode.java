package com.tt.miniapp.errorcode;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public interface ErrorCode {

    public enum DOWNLOAD {
        FILE_NOT_FOUND(100, "文件不存在"),
        NETWORK_ERROR(101, "网络错误"),
        MAGIC_STRING_ERROR(102, "ttpkg包头中不包含TTPKG"),
        INVALID_URL(103, "下载地址不合法"),
        PKG_FILE_OFFSET_WRONG(104, "文件偏移量错误"),
        APP_ID_NULL(LocationRequest.PRIORITY_NO_POWER, "AppInfo中的appId字段为空"),
        APP_VERSION_NULL(106, "AppInfo中的version字段为空"),
        PKG_MD5_ERROR(ActivityIdentificationData.WALKING, "ttpkg校验MD5失败"),
        UNKNOWN(108, "出现未知异常"),
        UNSUPPORT_TTAPKG_VERSION(SmEvents.EVENT_NR, "不支持的小程序包版本"),
        APP_INFO_NULL(SmEvents.EVENT_NO, "appInfo is null"),
        PARSE_CONFIG_FAIL(SmEvents.EVENT_NT, "parse config fail");
        
        private int code;
        private String desc;

        public String getDesc() {
            return this.desc;
        }

        public String getCode() {
            return Flow.Download.getCode() + this.code;
        }

        private DOWNLOAD(int i, String str) {
            this.code = i;
            this.desc = str;
        }
    }

    public enum JSCORE {
        TMA_CORE_NOT_FOUND(100, "tma-core.js不存在"),
        TMA_CORE_EXECUTE_ERROR(101, "tma-core.js执行失败"),
        TMA_CONFIG_EXECUTE_ERROR(102, "执行TMAConfig时出现异常"),
        MAIN_JS_NOT_FOUND(103, "main.js不存在"),
        MAIN_JS_EXECUTE_ERROR(104, "main.js执行失败"),
        TMG_CORE_NOT_FOUND(LocationRequest.PRIORITY_NO_POWER, "tmg-core不存在"),
        TMG_CORE_EXECUTE_ERROR(106, "tmg-core执行失败"),
        TMG_GAME_JS_NOT_FOUND(ActivityIdentificationData.WALKING, "game.js不存在"),
        TMG_GAME_JS_EXECUTE_ERROR(108, "game.js执行失败");
        
        private int code;
        private String desc;

        public String getDesc() {
            return this.desc;
        }

        public String getCode() {
            return Flow.JsCore.getCode() + this.code;
        }

        private JSCORE(int i, String str) {
            this.code = i;
            this.desc = str;
        }
    }

    public enum MAIN {
        SDK_INIT_ERROR(100, "SDK初始化失败"),
        SCHEME_NULL_ERROR(101, "scheme为null"),
        SCHEME_NOT_MATCH(102, "scheme的host不为microgame/microapp"),
        SCHEME_APPID_NULL(103, "scheme中的AppId字段为null"),
        PLUGIN_NOT_INSTALL(104, "小程序插件未安装"),
        DEVICE_BLACK_LIST(LocationRequest.PRIORITY_NO_POWER, "设备黑名单"),
        START_MINI_APP_ERROR(106, "启动小程序/游戏Activity失败"),
        PARSE_APPCONFIG_ERROR(ActivityIdentificationData.WALKING, "解析AppConfig失败"),
        OPEN_APP_ERROR(108, "打开小程序/游戏失败"),
        HELIUM_HANDLE_NULL(SmEvents.EVENT_NR, "游戏引擎的handler为null"),
        HELIUM_INIT_ERROR(SmEvents.EVENT_NO, "小游戏引擎初始化失败");
        
        private int code;
        private String desc;

        public String getDesc() {
            return this.desc;
        }

        public String getCode() {
            return Flow.Main.getCode() + this.code;
        }

        private MAIN(int i, String str) {
            this.code = i;
            this.desc = str;
        }
    }

    public enum META {
        NULL(100, "获取的meta结果为null"),
        PARSE_ERROR(101, "meta解析异常"),
        CODE_ERROR(102, "meta返回结果中error字段不为0"),
        INVALID_APP_ID(103, " meta返回结果中appId为空"),
        INVALID_VERSION(104, "meta返回结果中appVersion为空"),
        JSON_ERROR(LocationRequest.PRIORITY_NO_POWER, "解析meta返回的JSONString异常"),
        OFFLINE(106, "小程序/游戏已下线"),
        HOST_MISMATCH(ActivityIdentificationData.WALKING, "小程序/游戏不支持当前宿主环境"),
        PERMISSION_DENY(108, "无权访问小程序/游戏"),
        INVALID_JS_SDK(SmEvents.EVENT_NR, "jsSDK低于小程序/游戏最低限制"),
        UNKNOWN(SmEvents.EVENT_NO, "出现未知异常"),
        EXPIRED(SmEvents.EVENT_NT, "预览二维码过期"),
        INVALID_TT_CODE(SmEvents.EVENT_NE_RR, "meta请求的ttcode为空"),
        PARSER_NULL(SmEvents.EVENT_RE, "为设置meta parser"),
        META_INVALID(SmEvents.EVENT_TO, "meta info invalid!"),
        META_RESPONSE_NULL(115, "服务端的response为空 "),
        META_REQUEST_INFO_ERROR(SmEvents.EVENT_RS, "meta request info error!");
        
        private int code;
        private String desc;

        public String getDesc() {
            return this.desc;
        }

        public String getCode() {
            return Flow.Meta.getCode() + this.code;
        }

        private META(int i, String str) {
            this.code = i;
            this.desc = str;
        }
    }

    public enum NETWORK {
        SUCCESS(0, "执行成功"),
        NETWORK_NOT_AVAILABLE(100, "网络不可用"),
        NETWORK_CHANGED_ERROR(101, "网络状态变化"),
        NETWORK_DNS_ERROR(102, "DNS解析失败"),
        NETWORK_CONNECT_ERROR(103, "网络链接过程的失败(timeout+aborted+refused+reset)"),
        NETWORK_UNKNOWN_ERROR(104, "SDK没有匹配的网络错误");
        
        private int code;
        private String desc;

        public int getCode() {
            return this.code;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getCodeStr() {
            return String.valueOf(this.code);
        }

        private NETWORK(int i, String str) {
            this.code = i;
            this.desc = str;
        }
    }

    public enum WEBVIEW {
        TEMPLATE_NOT_FOUND(100, "template.html不存在"),
        FRAME_JS_NOT_FOUND(101, " page-frame.js不存在"),
        FRAME_JS_INVALIDATE(102, "page-frame.js中内容不合法"),
        FRAME_HTML_NOT_FOUND(103, "page-frame.html不存在"),
        FRAME_HTML_INVALIDATE(104, "page-frame.html不合法"),
        INVALIDATE_TTPKG_VERSION(LocationRequest.PRIORITY_NO_POWER, "不合法的ttpkg版本"),
        LOAD_TASK_ERROR(106, "loadTask为null"),
        ENTRY_PAGE_NOT_FOUND(ActivityIdentificationData.WALKING, "entryPage在appConfig中找不到"),
        EXECUTE_PAGE_FRAME_ERROR(108, "执行page-frame.js出现异常"),
        EXECUTE_PATH_FRAME_ERROR(SmEvents.EVENT_NR, "执行path-frame.js出现异常"),
        RECEIVE_WEBVIEW_ERROR(SmEvents.EVENT_NT, "收到webView执行js异常的事件"),
        ON_RENDER_PROCESS_GONE(SmEvents.EVENT_NE_RR, "收到onRenderProcessGone事件"),
        EXECUTE_APP_SERVICE_ERROR(SmEvents.EVENT_RE, "执行app-service.js出现异常"),
        EVALUATE_JAVA_SCRIPT_ERROR(SmEvents.EVENT_TO, "evaluate javascript error");
        
        private int code;
        private String desc;

        public String getDesc() {
            return this.desc;
        }

        public String getCode() {
            return Flow.WebView.getCode() + this.code;
        }

        private WEBVIEW(int i, String str) {
            this.code = i;
            this.desc = str;
        }
    }
}
