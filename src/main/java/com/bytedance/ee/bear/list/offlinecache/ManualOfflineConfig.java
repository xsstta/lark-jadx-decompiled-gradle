package com.bytedance.ee.bear.list.offlinecache;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.leanmode.CCMConfig;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import org.koin.java.KoinJavaComponent;

@AppConfig(key = "manual_offline_config")
public class ManualOfflineConfig implements NonProguard {
    private static volatile CCMConfig sCcmConfig;
    private static volatile boolean sIsSetChanged;
    private static volatile ManualOfflineConfig sManualOfflineConfig;
    private boolean bitable_enabled;
    private boolean doc_enabled = true;
    private boolean docx_enabled = true;
    private boolean drive_enabled = true;
    private boolean guide_enabled;
    private boolean manual_offline_enabled = true;
    private long manual_offline_suspend_time = 3600000;
    private int manual_offline_watch_max_num = 100;
    private boolean mindnote_enabled;
    private boolean sheet_enabled = true;
    private boolean slide_enabled;

    public long getManual_offline_suspend_time() {
        return this.manual_offline_suspend_time;
    }

    public int getManual_offline_watch_max_num() {
        return this.manual_offline_watch_max_num;
    }

    public boolean isBitable_enabled() {
        return this.bitable_enabled;
    }

    public boolean isDoc_enabled() {
        return this.doc_enabled;
    }

    public boolean isGuide_enabled() {
        return this.guide_enabled;
    }

    public boolean isMindnote_enabled() {
        return this.mindnote_enabled;
    }

    public boolean isSheet_enabled() {
        return this.sheet_enabled;
    }

    public boolean isSlide_enabled() {
        return this.slide_enabled;
    }

    public boolean isDrive_enabled() {
        if (!((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a() || !this.drive_enabled) {
            return false;
        }
        return true;
    }

    public boolean isManual_offline_enabled() {
        boolean z;
        if (sCcmConfig != null) {
            z = sCcmConfig.mo20780e().f14914a;
        } else {
            z = true;
        }
        if (!this.manual_offline_enabled || !z) {
            return false;
        }
        return true;
    }

    public static ManualOfflineConfig getConfig() {
        if (sManualOfflineConfig == null) {
            synchronized (ManualOfflineConfig.class) {
                if (sManualOfflineConfig == null) {
                    sManualOfflineConfig = (ManualOfflineConfig) C4211a.m17514a().mo16532a("manual_offline_config", ManualOfflineConfig.class, new ManualOfflineConfig());
                }
            }
        }
        sCcmConfig = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b();
        return sManualOfflineConfig;
    }

    public void setBitable_enabled(boolean z) {
        this.bitable_enabled = z;
    }

    public void setDoc_enabled(boolean z) {
        this.doc_enabled = z;
    }

    public void setDrive_enabled(boolean z) {
        this.drive_enabled = z;
    }

    public void setGuide_enabled(boolean z) {
        this.guide_enabled = z;
    }

    public void setManual_offline_enabled(boolean z) {
        this.manual_offline_enabled = z;
    }

    public void setManual_offline_suspend_time(long j) {
        this.manual_offline_suspend_time = j;
    }

    public void setManual_offline_watch_max_num(int i) {
        this.manual_offline_watch_max_num = i;
    }

    public void setMindnote_enabled(boolean z) {
        this.mindnote_enabled = z;
    }

    public void setSheet_enabled(boolean z) {
        this.sheet_enabled = z;
    }

    public void setSlide_enabled(boolean z) {
        this.slide_enabled = z;
    }

    public static boolean isEnable(int i) {
        if (!((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20780e().f14914a) {
            return false;
        }
        ManualOfflineConfig config = getConfig();
        if (!config.isManual_offline_enabled()) {
            return false;
        }
        if (i == C8275a.f22371d.mo32555b()) {
            return config.doc_enabled;
        }
        if (i == C8275a.f22372e.mo32555b()) {
            return config.sheet_enabled;
        }
        if (i == C8275a.f22374g.mo32555b()) {
            return config.mindnote_enabled;
        }
        if (i == C8275a.f22375h.mo32555b()) {
            if (!((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a() || !config.drive_enabled) {
                return false;
            }
            return true;
        } else if (i == C8275a.f22373f.mo32555b() || i == C8275a.f22377j.mo32555b()) {
            return false;
        } else {
            if (i == C8275a.f22376i.mo32555b()) {
                return config.slide_enabled;
            }
            if (i != C8275a.f22378k.mo32555b() || !config.docx_enabled || !C4211a.m17514a().mo16536a("spacekit.mobile.docx_manual_offline_enabled", false)) {
                return false;
            }
            return true;
        }
    }
}
