package com.ss.android.appcenter.business.net.pupups;

import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.tab.business.popups.content.PopupsContentType;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\nH\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/appcenter/business/net/pupups/PopupsData;", "Ljava/io/Serializable;", "()V", "notification", "Lcom/ss/android/appcenter/business/net/pupups/PopupsNotification;", "getNotification", "()Lcom/ss/android/appcenter/business/net/pupups/PopupsNotification;", "setNotification", "(Lcom/ss/android/appcenter/business/net/pupups/PopupsNotification;)V", "schemaVersion", "", "getSchemaVersion", "()Ljava/lang/String;", "setSchemaVersion", "(Ljava/lang/String;)V", "contentType", "Lcom/ss/android/appcenter/business/tab/business/popups/content/PopupsContentType;", "toString", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PopupsData implements Serializable {
    @SerializedName("notification")
    private PopupsNotification notification;
    @SerializedName("schemaVersion")
    private String schemaVersion;

    public final PopupsNotification getNotification() {
        return this.notification;
    }

    public final String getSchemaVersion() {
        return this.schemaVersion;
    }

    public final PopupsContentType contentType() {
        PopupsContentType contentType;
        PopupsNotification popupsNotification = this.notification;
        if (popupsNotification == null || (contentType = popupsNotification.contentType()) == null) {
            return PopupsContentType.Unknown;
        }
        return contentType;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("schemaVersion=");
        sb.append(this.schemaVersion);
        sb.append(",notification=");
        PopupsNotification popupsNotification = this.notification;
        String str2 = null;
        if (popupsNotification != null) {
            str = popupsNotification.getId();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",content=");
        PopupsNotification popupsNotification2 = this.notification;
        if (popupsNotification2 != null) {
            str2 = popupsNotification2.getContent();
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void setNotification(PopupsNotification popupsNotification) {
        this.notification = popupsNotification;
    }

    public final void setSchemaVersion(String str) {
        this.schemaVersion = str;
    }
}
