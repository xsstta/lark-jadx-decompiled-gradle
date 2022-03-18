package com.ss.android.lark.chat.entity.message.content;

import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.location.LocationDescription;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\u0015R\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\u0015R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/LocationContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "image", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "getImage", "()Lcom/ss/android/lark/chat/entity/image/ImageSet;", "setImage", "(Lcom/ss/android/lark/chat/entity/image/ImageSet;)V", "isInternal", "", "()Z", "setInternal", "(Z)V", "latitude", "getLatitude", "setLatitude", "(Ljava/lang/String;)V", "locationDescription", "Lcom/ss/android/lark/chat/entity/location/LocationDescription;", "getLocationDescription", "()Lcom/ss/android/lark/chat/entity/location/LocationDescription;", "setLocationDescription", "(Lcom/ss/android/lark/chat/entity/location/LocationDescription;)V", "longitude", "getLongitude", "setLongitude", "name", "getName", "vendor", "getVendor", "setVendor", "zoomLevel", "", "getZoomLevel", "()I", "setZoomLevel", "(I)V", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LocationContent extends Content {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = serialVersionUID;
    private ImageSet image;
    private boolean isInternal;
    private String latitude;
    private LocationDescription locationDescription;
    private String longitude;
    private String vendor;
    private int zoomLevel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/LocationContent$Companion;", "", "()V", "serialVersionUID", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.LocationContent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ImageSet getImage() {
        return this.image;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final LocationDescription getLocationDescription() {
        return this.locationDescription;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final int getZoomLevel() {
        return this.zoomLevel;
    }

    public final boolean isInternal() {
        return this.isInternal;
    }

    public final String getDescription() {
        String description;
        LocationDescription locationDescription2 = this.locationDescription;
        if (locationDescription2 == null || (description = locationDescription2.getDescription()) == null) {
            return "";
        }
        return description;
    }

    public final String getName() {
        String name;
        LocationDescription locationDescription2 = this.locationDescription;
        if (locationDescription2 == null || (name = locationDescription2.getName()) == null) {
            return "";
        }
        return name;
    }

    public final void setImage(ImageSet imageSet) {
        this.image = imageSet;
    }

    public final void setInternal(boolean z) {
        this.isInternal = z;
    }

    public final void setLatitude(String str) {
        this.latitude = str;
    }

    public final void setLocationDescription(LocationDescription locationDescription2) {
        this.locationDescription = locationDescription2;
    }

    public final void setLongitude(String str) {
        this.longitude = str;
    }

    public final void setVendor(String str) {
        this.vendor = str;
    }

    public final void setZoomLevel(int i) {
        this.zoomLevel = i;
    }
}
