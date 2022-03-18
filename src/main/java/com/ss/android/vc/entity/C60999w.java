package com.ss.android.vc.entity;

import android.text.TextUtils;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import java.io.File;

/* renamed from: com.ss.android.vc.entity.w */
public class C60999w {

    /* renamed from: a */
    private VirtualBackgroundInfo f152858a;

    /* renamed from: a */
    public void mo210457a() {
        if (TextUtils.isEmpty(this.f152858a.trimLandscapePath) || TextUtils.isEmpty(this.f152858a.trimPortraitPath)) {
            File file = new File(this.f152858a.path);
            File parentFile = file.getAbsoluteFile().getParentFile();
            String b = LabsUtils.m242905b(file.getName());
            VirtualBackgroundInfo virtualBackgroundInfo = this.f152858a;
            virtualBackgroundInfo.trimPath = new File(parentFile, b + ".png").getAbsolutePath();
            VirtualBackgroundInfo virtualBackgroundInfo2 = this.f152858a;
            virtualBackgroundInfo2.trimLandscapePath = new File(parentFile, b + "_landscape.png").getAbsolutePath();
            VirtualBackgroundInfo virtualBackgroundInfo3 = this.f152858a;
            virtualBackgroundInfo3.trimPortraitPath = new File(parentFile, b + "_portrait.png").getAbsolutePath();
        }
    }

    public C60999w(VirtualBackgroundInfo virtualBackgroundInfo) {
        this.f152858a = virtualBackgroundInfo;
    }
}
