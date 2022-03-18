package com.bytedance.ee.bear.drive.config.fg;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

@AppConfig(key = "drive_preview_config")
public class DrivePreviewConfig implements NonProguard {
    private long download_origin_file_max_size = 4194304;
    private int excel_tab_data_max_size = 20480;
    private int highlight_max_size = ParticipantRepo.f117150c;
    private int local_archive_max_size = 524288;
    private int render_html_file_max_size = 10240;
    private int text_preview_max_size = 6144;

    public long getDownload_origin_file_max_size() {
        return this.download_origin_file_max_size;
    }

    public int getExcel_tab_data_max_size() {
        return this.excel_tab_data_max_size;
    }

    public int getHighlight_max_size() {
        return this.highlight_max_size;
    }

    public int getLocal_archive_max_size() {
        return this.local_archive_max_size;
    }

    public int getRender_html_file_max_size() {
        return this.render_html_file_max_size;
    }

    public int getText_preview_max_size() {
        return this.text_preview_max_size;
    }

    public String toString() {
        return "DrivePreviewConfig{text_preview_max_size=" + this.text_preview_max_size + ", highlight_max_size=" + this.highlight_max_size + ", render_html_file_max_size=" + this.render_html_file_max_size + ", excel_tab_data_max_size=" + this.excel_tab_data_max_size + ", download_origin_file_max_size=" + this.download_origin_file_max_size + ", local_archive_max_size=" + this.local_archive_max_size + '}';
    }

    public void setDownload_origin_file_max_size(long j) {
        this.download_origin_file_max_size = j;
    }

    public void setExcel_tab_data_max_size(int i) {
        this.excel_tab_data_max_size = i;
    }

    public void setHighlight_max_size(int i) {
        this.highlight_max_size = i;
    }

    public void setLocal_archive_max_size(int i) {
        this.local_archive_max_size = i;
    }

    public void setRender_html_file_max_size(int i) {
        this.render_html_file_max_size = i;
    }

    public void setText_preview_max_size(int i) {
        this.text_preview_max_size = i;
    }
}
