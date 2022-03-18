package com.bytedance.ee.bear.drive.view.preview.wps;

import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class WpsMainOptions implements NonProguard {
    public WpsCommonOptions commonOptions;
    public String mode;
    public WpsPDFOptions pdfOptions;
    public WpsPPTOptions pptOptions;
    public WpsWordOptions wordOptions;

    @Retention(RetentionPolicy.SOURCE)
    public @interface WpsOpenMode {
    }
}
