package com.tt.miniapp.launchaction.bean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.tt.miniapp.util.MiniAppDateUtils;
import java.util.Date;

public class TopNotificationResult {
    private static int EVERY_TIME = 2;
    public static int FIRST_TIME = 1;
    private int code;
    private C66302a data;
    private String msg;

    public static class NotificationDetail {
        private String content;
        @SerializedName("display_rule")
        private int displayRule;
        @SerializedName("effective_time")
        private String effectiveTime;
        @SerializedName("failure_time")
        private String failureTime;
        private LinkInfo link;
        private String uuid;

        public static class LinkInfo {
            @SerializedName("has_link")
            public boolean hasLink;
            private String url;

            public boolean getHasLink() {
                return this.hasLink;
            }

            public String getUrl() {
                return this.url;
            }
        }

        public String getContent() {
            return this.content;
        }

        public int getDisplayRule() {
            return this.displayRule;
        }

        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public String getFailureTime() {
            return this.failureTime;
        }

        public LinkInfo getLink() {
            return this.link;
        }

        public String getUuid() {
            return this.uuid;
        }

        public boolean isJustFirstTimeShow() {
            if (this.displayRule == TopNotificationResult.FIRST_TIME) {
                return true;
            }
            return false;
        }

        public String getUrl() {
            LinkInfo linkInfo = this.link;
            if (linkInfo == null || !linkInfo.hasLink) {
                return "";
            }
            return this.link.getUrl();
        }

        public boolean isEffectiveTime() {
            Date a = MiniAppDateUtils.m261180a(getEffectiveTime(), "yyyy-MM-dd HH:mm");
            Date a2 = MiniAppDateUtils.m261180a(getFailureTime(), "yyyy-MM-dd HH:mm");
            Date date = new Date();
            if (a == null || a2 == null || !a.before(date) || !a2.after(date)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.launchaction.bean.TopNotificationResult$a */
    public static class C66302a {
        @SerializedName("notification")

        /* renamed from: a */
        public NotificationDetail f167326a;
    }

    public String getMsg() {
        return this.msg;
    }

    public NotificationDetail getNotificationDetail() {
        C66302a aVar = this.data;
        if (aVar == null) {
            return null;
        }
        return aVar.f167326a;
    }

    public boolean isSuccess() {
        if (this.code != 0 || this.data == null || getNotificationDetail() == null || TextUtils.isEmpty(getNotificationDetail().getContent())) {
            return false;
        }
        return true;
    }
}
