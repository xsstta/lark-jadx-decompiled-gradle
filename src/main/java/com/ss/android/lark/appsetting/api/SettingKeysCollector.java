package com.ss.android.lark.appsetting.api;

import java.util.HashSet;
import java.util.Set;

public class SettingKeysCollector {
    private static Set<String> keySet = new HashSet();

    public static Set<String> getKeySet() {
        internalFetchKeySet();
        return keySet;
    }

    private static Set internalFetchKeySet() {
        keySet.add("drive_rust_cover_size");
        keySet.add("docx_i18n_name");
        keySet.add("preload_jsmodule_config");
        keySet.add("messageaction_plusmenu_config");
        keySet.add("ccm_lynx_config");
        keySet.add("messagecard_style");
        keySet.add("mail_articles_link_config");
        keySet.add("file_deletion_filter_config");
        keySet.add("drive_preload_config");
        keySet.add("drive_wps_domain");
        keySet.add("mail_capacity_limit_config");
        keySet.add("splash_ad_sdk_config");
        keySet.add("ttnet_tnc_config");
        keySet.add("offline_db_config");
        keySet.add("offline_res_interval");
        keySet.add("external_share_config");
        keySet.add("ve_synthesis_settings");
        keySet.add("mail_config");
        keySet.add("key_open_app_link_config");
        keySet.add("drive_sdk_config");
        keySet.add("open_doc_timeout");
        keySet.add("web_translate_config");
        keySet.add("more_new_items");
        keySet.add("wifi_timeout");
        keySet.add("loading_delay_time");
        keySet.add("drive_rust_config");
        keySet.add("carrier_timeout");
        keySet.add("suite_search_client_config");
        keySet.add("emm_config");
        keySet.add("offline_cache_config");
        keySet.add("biz_domain_config");
        keySet.add("im_video_player_config");
        keySet.add("vpn_config");
        keySet.add("privacy_detection_dynamic_config");
        keySet.add("app_config");
        keySet.add("list_push_sync_config");
        keySet.add("money_config");
        keySet.add("grayscale_package_config");
        keySet.add("todo_config");
        keySet.add("client_dynamic_link");
        keySet.add("gecko_config");
        keySet.add("drive_preview_config");
        keySet.add("manual_offline_config");
        keySet.add("smart_preload_config");
        keySet.add("policy_config");
        keySet.add("client_frontier_config");
        keySet.add("screenshot_keywords");
        keySet.add("drive_convert_file_size_limit");
        keySet.add("process_arch_config");
        keySet.add("disabled_onboardings");
        keySet.add("group_bot_config");
        keySet.add("domain_config");
        keySet.add("send_image_msg_config");
        keySet.add("drive_cache_config");
        keySet.add("doc_toolbar_android_compat");
        return keySet;
    }
}
