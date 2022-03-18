package com.ss.android.lark.locationmessage.message;

import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.location.LocationDescription;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010,\u001a\u00020\u0012H\u0016R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\nR\u001d\u0010$\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b%\u0010\nR\u001b\u0010'\u001a\u00020(8FX\u0002¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/ss/android/lark/locationmessage/message/LocationContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/LocationContent;", "content", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "(Lcom/ss/android/lark/chat/entity/message/content/LocationContent;Lcom/ss/android/lark/chat/entity/message/Message;)V", "description", "", "getDescription", "()Ljava/lang/String;", "image", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "getImage", "()Lcom/ss/android/lark/chat/entity/image/ImageSet;", "image$delegate", "Lkotlin/Lazy;", "isInternal", "", "()Z", "isInternal$delegate", "latitude", "getLatitude", "latitude$delegate", "locationDescription", "Lcom/ss/android/lark/chat/entity/location/LocationDescription;", "getLocationDescription", "()Lcom/ss/android/lark/chat/entity/location/LocationDescription;", "locationDescription$delegate", "longitude", "getLongitude", "longitude$delegate", "getMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "name", "getName", "vendor", "getVendor", "vendor$delegate", "zoomLevel", "", "getZoomLevel", "()I", "zoomLevel$delegate", "canReply", "im_messages_location-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.locationmessage.message.a */
public final class LocationContentVO extends ContentVO<LocationContent> {

    /* renamed from: a */
    private final Lazy f105722a;

    /* renamed from: b */
    private final Lazy f105723b;

    /* renamed from: c */
    private final Lazy f105724c;

    /* renamed from: d */
    private final Lazy f105725d;

    /* renamed from: e */
    private final Lazy f105726e;

    /* renamed from: f */
    private final Lazy f105727f;

    /* renamed from: g */
    private final Lazy f105728g;

    /* renamed from: h */
    private final Message f105729h;

    /* renamed from: a */
    public final Message mo149732a() {
        return this.f105729h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.locationmessage.message.a$a */
    static final class C41610a extends Lambda implements Function0<ImageSet> {
        final /* synthetic */ LocationContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41610a(LocationContent locationContent) {
            super(0);
            this.$content = locationContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageSet invoke() {
            return this.$content.getImage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.locationmessage.message.a$b */
    static final class C41611b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ LocationContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41611b(LocationContent locationContent) {
            super(0);
            this.$content = locationContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isInternal();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/location/LocationDescription;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.locationmessage.message.a$d */
    static final class C41613d extends Lambda implements Function0<LocationDescription> {
        final /* synthetic */ LocationContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41613d(LocationContent locationContent) {
            super(0);
            this.$content = locationContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LocationDescription invoke() {
            return this.$content.getLocationDescription();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.locationmessage.message.a$g */
    static final class C41616g extends Lambda implements Function0<Integer> {
        final /* synthetic */ LocationContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41616g(LocationContent locationContent) {
            super(0);
            this.$content = locationContent;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return this.$content.getZoomLevel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.locationmessage.message.a$c */
    static final class C41612c extends Lambda implements Function0<String> {
        final /* synthetic */ LocationContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41612c(LocationContent locationContent) {
            super(0);
            this.$content = locationContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getLatitude();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.locationmessage.message.a$e */
    static final class C41614e extends Lambda implements Function0<String> {
        final /* synthetic */ LocationContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41614e(LocationContent locationContent) {
            super(0);
            this.$content = locationContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getLongitude();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.locationmessage.message.a$f */
    static final class C41615f extends Lambda implements Function0<String> {
        final /* synthetic */ LocationContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41615f(LocationContent locationContent) {
            super(0);
            this.$content = locationContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getVendor();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationContentVO(LocationContent locationContent, Message message) {
        super(locationContent);
        Intrinsics.checkParameterIsNotNull(locationContent, "content");
        Intrinsics.checkParameterIsNotNull(message, "message");
        this.f105729h = message;
        this.f105722a = LazyKt.lazy(new C41613d(locationContent));
        this.f105723b = LazyKt.lazy(new C41614e(locationContent));
        this.f105724c = LazyKt.lazy(new C41612c(locationContent));
        this.f105725d = LazyKt.lazy(new C41616g(locationContent));
        this.f105726e = LazyKt.lazy(new C41610a(locationContent));
        this.f105727f = LazyKt.lazy(new C41615f(locationContent));
        this.f105728g = LazyKt.lazy(new C41611b(locationContent));
    }
}
