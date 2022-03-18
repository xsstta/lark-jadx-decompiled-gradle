package com.ss.android.vc.entity.follow;

import java.io.Serializable;
import java.util.List;

public class GDriveJavaBean implements Serializable {
    private Google_drive_credentials google_drive_credentials;
    private List<String> google_drive_urls;
    private List<String> navigate_in_page_whitelist;

    public Google_drive_credentials getGoogle_drive_credentials() {
        return this.google_drive_credentials;
    }

    public List<String> getGoogle_drive_urls() {
        return this.google_drive_urls;
    }

    public List<String> getNavigate_in_page_whitelist() {
        return this.navigate_in_page_whitelist;
    }

    public void setGoogle_drive_credentials(Google_drive_credentials google_drive_credentials2) {
        this.google_drive_credentials = google_drive_credentials2;
    }

    public void setGoogle_drive_urls(List<String> list) {
        this.google_drive_urls = list;
    }

    public void setNavigate_in_page_whitelist(List<String> list) {
        this.navigate_in_page_whitelist = list;
    }
}
