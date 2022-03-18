package com.ss.android.lark.locationmessage.message;

import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.Location;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.location.LocationDescription;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency;

/* renamed from: com.ss.android.lark.locationmessage.message.e */
public class C41619e {

    /* renamed from: a */
    private static IMessageLocationDependency.AbstractC41604c f105733a = C41597c.m165069a().mo143913f();

    /* renamed from: a */
    private static LocationDescription m165164a(Location location) {
        if (location == null) {
            return null;
        }
        LocationDescription locationDescription = new LocationDescription();
        locationDescription.setName(location.name);
        locationDescription.setDescription(location.description);
        return locationDescription;
    }

    /* renamed from: a */
    private static ImageSet m165163a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        ImageSet imageSet2 = new ImageSet();
        imageSet2.setKey(imageSet.key);
        imageSet2.setOrigin(f105733a.mo143920a(imageSet.origin));
        imageSet2.setThumbnail(f105733a.mo143921a(imageSet));
        imageSet2.setMiddle(f105733a.mo143923b(imageSet));
        return imageSet2;
    }

    /* renamed from: a */
    public static LocationContent m165165a(Content content) {
        LocationContent locationContent = new LocationContent();
        com.bytedance.lark.pb.basic.v1.LocationContent locationContent2 = content.location_content;
        if (locationContent2 == null) {
            return locationContent;
        }
        locationContent.setLongitude(locationContent2.longitude);
        locationContent.setLatitude(locationContent2.latitude);
        locationContent.setZoomLevel(locationContent2.zoom_level.intValue());
        locationContent.setVendor(locationContent2.vendor);
        locationContent.setInternal(locationContent2.is_internal.booleanValue());
        Location location = locationContent2.location;
        locationContent.setImage(m165163a(locationContent2.image));
        locationContent.setLocationDescription(m165164a(location));
        return locationContent;
    }
}
