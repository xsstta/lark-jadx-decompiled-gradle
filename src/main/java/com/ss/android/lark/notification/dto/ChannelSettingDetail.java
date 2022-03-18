package com.ss.android.lark.notification.dto;

import com.ss.android.lark.biz.core.api.NotificationSettingDetail;

public class ChannelSettingDetail extends NotificationSettingDetail {
    private boolean byPassDnd;
    private String channelDesc;
    private String channelName;
    private String id;
    private int importance;
    private int lockscreenVisibility;
    private boolean shouldlight;
    private boolean showBadge;

    public String getChannelDesc() {
        return this.channelDesc;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getId() {
        return this.id;
    }

    public int getImportance() {
        return this.importance;
    }

    public int getLockscreenVisibility() {
        return this.lockscreenVisibility;
    }

    public boolean isByPassDnd() {
        return this.byPassDnd;
    }

    public boolean isShouldlight() {
        return this.shouldlight;
    }

    public boolean isShowBadge() {
        return this.showBadge;
    }

    private String getLockScreenVisibility() {
        int i = this.lockscreenVisibility;
        if (i == -1) {
            return "Invisible";
        }
        if (i != 0) {
            return "Visible";
        }
        return "Unlock screen";
    }

    private String getImportanceLabel() {
        int i = this.importance;
        if (i == 0) {
            return "none";
        }
        if (i == 1) {
            return "min";
        }
        if (i == 2) {
            return "low";
        }
        if (i == 3) {
            return "default";
        }
        if (i == 4) {
            return "high";
        }
        if (i != 5) {
            return "unknown";
        }
        return "max";
    }

    @Override // com.ss.android.lark.biz.core.api.NotificationSettingDetail
    public String toString() {
        return "ChannelSettingDetail{id ='" + this.id + '\'' + ", channelName = '" + this.channelName + '\'' + ", channelDesc = '" + this.channelDesc + '\'' + ", importance = " + getImportanceLabel() + ", byPassDnd=" + this.byPassDnd + ", shouldlight = " + this.shouldlight + ", lockscreenVisibility = " + getLockScreenVisibility() + ", showBadge = " + this.showBadge + '}' + "\n" + super.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChannelSettingDetail(android.app.NotificationChannel r6) {
        /*
            r5 = this;
            int r0 = r6.getImportance()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            boolean r3 = r6.shouldVibrate()
            android.net.Uri r4 = r6.getSound()
            if (r4 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r5.<init>(r0, r3, r1)
            int r0 = r6.getImportance()
            r5.importance = r0
            java.lang.String r0 = r6.getId()
            r5.id = r0
            java.lang.CharSequence r0 = r6.getName()
            java.lang.String r0 = r0.toString()
            r5.channelName = r0
            java.lang.String r0 = r6.getDescription()
            r5.channelDesc = r0
            boolean r0 = r6.canBypassDnd()
            r5.byPassDnd = r0
            boolean r0 = r6.shouldShowLights()
            r5.shouldlight = r0
            int r0 = r6.getLockscreenVisibility()
            r5.lockscreenVisibility = r0
            boolean r6 = r6.canShowBadge()
            r5.showBadge = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.notification.dto.ChannelSettingDetail.<init>(android.app.NotificationChannel):void");
    }
}
