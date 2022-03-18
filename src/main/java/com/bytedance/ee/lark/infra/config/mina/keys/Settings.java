package com.bytedance.ee.lark.infra.config.mina.keys;

public enum Settings {
    TMA_SDK_CONFIG("tt_tma_sdk_config"),
    TMA_REGION_CONFIG("tt_tma_region_config"),
    BDP_META_CONFIG("bdp_meta_config"),
    BDP_REENTER_TIPS("bdp_reenter_tips"),
    TT_TMA_SWITCH("tt_tma_switch"),
    BDP_FAVORITES("bdp_favorites"),
    TT_TMA_BLACKLIST("tt_tma_blacklist"),
    BDP_OFFLINE_ZIP("bdp_offline_zip"),
    TT_TMA_ABTEST("tt_tma_abtest"),
    BDP_TTPKG_CONFIG("bdp_ttpkg_config"),
    BDP_MORE_GAME_CENTER("bdp_more_game_center"),
    BDP_LAUNCH_APP_SCENE_LIST("bdp_launch_app_scene_list"),
    BDP_TTREQUEST_CONFIG("bdp_ttrequest_config"),
    BDP_STARTPAGE_PREFETCH("bdp_startpage_prefetch"),
    BDP_HELIUM_CONFIG("bdp_helium_config"),
    TT_TMA_NATIVE_UI("tma_native_ui_test"),
    TMA_VDOM_TEST("tma_vdom_test"),
    BDP_ANTI_ADDICTION("bdp_anti_addiction"),
    SNAPSHOT("snapshot_config"),
    PRE_RENDER("pre_render_config");
    
    private String name;

    public enum TmaABTest {
        AUTHORIZE_LIST("authorize_list");
        
        private String name;

        public enum AuthorizeList {
            ON("on"),
            MP_ID("mpid"),
            DID("did");
            
            private String name;

            public String toString() {
                return this.name;
            }

            private AuthorizeList(String str) {
                this.name = str;
            }
        }

        public String toString() {
            return this.name;
        }

        private TmaABTest(String str) {
            this.name = str;
        }
    }

    public enum TmaBlackList {
        DEVICE("device");
        
        private String name;

        public enum DeviceBlackList {
            TMA("tma"),
            TMG("tmg");
            
            private String name;

            public String toString() {
                return this.name;
            }

            private DeviceBlackList(String str) {
                this.name = str;
            }
        }

        public String toString() {
            return this.name;
        }

        private TmaBlackList(String str) {
            this.name = str;
        }
    }

    public enum TmaSwitch {
        PRELOAD_WEBVIEW("preloadWebview"),
        MMKV_SWITCH("mkSwitch"),
        LAUNCH_FLAG("launchFlag"),
        FAVORITES("favorites"),
        WEBVIEW_STREAM_DOWNGRADE("webviewStreamDowngrade"),
        TT_RENDER_IN_BROWSER("tt_render_in_browser"),
        MORE_PANEL("morePanel"),
        VIDEO_EFFECT_SWITCH("videoEffectSwitch"),
        PAGE_BLOCK("pageBlock"),
        BLOCK_JS_BRIDGE("blockJSBridge"),
        BLOCK_JS_BRIDGE_API_LIST("blockJSBridgeAPIList"),
        BLOCK_WEB_BRIDGE("blockWebBridge"),
        BLOCK_WEB_BRIDGE_API_LIST("blockWebBridgeAPIList"),
        JS_RUNTIME_ERROR_REPORT_MAX_TIMES("jsRuntimeErrorReportMaxTimes"),
        DISABLE_META_READY("disableMetaReady"),
        ENABLE_CODE_CACHE("enableCodeCache");
        
        private String name;

        public enum Favorites {
            TMA("tma"),
            TMG("tmg");
            
            private String name;

            public String toString() {
                return this.name;
            }

            private Favorites(String str) {
                this.name = str;
            }
        }

        public String toString() {
            return this.name;
        }

        private TmaSwitch(String str) {
            this.name = str;
        }
    }

    public enum BdpLaunchSceneList {
        WHITE_LIST("white_list"),
        GRAY_LIST("gray_list");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private BdpLaunchSceneList(String str) {
            this.name = str;
        }
    }

    public enum BdpMetaConfig {
        MAIN_PROCESS_PREFETCH_KEY("main_process_prefetch"),
        URLS("urls");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private BdpMetaConfig(String str) {
            this.name = str;
        }
    }

    public enum BdpReenterTips {
        TMA("tma"),
        TMG("tmg");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private BdpReenterTips(String str) {
            this.name = str;
        }
    }

    public enum BdpStartpagePrefetchConfig {
        ENABLE("enable"),
        MAX_CONCURRENT_COUNT("max_concurrent_count");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private BdpStartpagePrefetchConfig(String str) {
            this.name = str;
        }
    }

    public enum BdpTtPkgConfig {
        PRELOAD_MODE("preload_mode"),
        HOSTS_ADD_GZIP("hosts_add_gzip"),
        PRELOAD_REAL_CONTENT_LENGTH("preload_real_content_length"),
        PKG_COMPRESS_DOWNGRADE("compress_downgrade"),
        PRELOAD_PKG_LIMIT("predownload_pkg_limit"),
        NORMAL_LAUNCH_PKG_LIMIT("normal_launch_pkg_limit");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private BdpTtPkgConfig(String str) {
            this.name = str;
        }
    }

    public enum BdpTtRequestConfig {
        REQUEST_TYPE("request_type");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private BdpTtRequestConfig(String str) {
            this.name = str;
        }
    }

    public enum TmaNativeUI {
        ENABLE("enable");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private TmaNativeUI(String str) {
            this.name = str;
        }
    }

    public enum TmaSdkConfig {
        SDK_UPDATE_VERSION("sdkUpdateVersion"),
        SDK_VERSION("sdkVersion"),
        LATEST_SDK_URL("latestSDKUrl"),
        TMA_SWITCH("tmaSwitch");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private TmaSdkConfig(String str) {
            this.name = str;
        }
    }

    public enum TmaVdomTest {
        ENABLE("enable");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private TmaVdomTest(String str) {
            this.name = str;
        }
    }

    public String toString() {
        return this.name;
    }

    private Settings(String str) {
        this.name = str;
    }
}
