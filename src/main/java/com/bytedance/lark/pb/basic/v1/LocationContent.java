package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class LocationContent extends Message<LocationContent, C15039a> {
    public static final ProtoAdapter<LocationContent> ADAPTER = new C15040b();
    public static final Boolean DEFAULT_IS_INTERNAL = false;
    public static final Integer DEFAULT_ZOOM_LEVEL = 0;
    private static final long serialVersionUID = 0;
    public final ImageSet image;
    public final Boolean is_internal;
    public final String latitude;
    public final Location location;
    public final String longitude;
    public final String vendor;
    public final Integer zoom_level;

    /* renamed from: com.bytedance.lark.pb.basic.v1.LocationContent$b */
    private static final class C15040b extends ProtoAdapter<LocationContent> {
        C15040b() {
            super(FieldEncoding.LENGTH_DELIMITED, LocationContent.class);
        }

        /* renamed from: a */
        public int encodedSize(LocationContent locationContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, locationContent.longitude) + ProtoAdapter.STRING.encodedSizeWithTag(2, locationContent.latitude);
            int i5 = 0;
            if (locationContent.zoom_level != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, locationContent.zoom_level);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (locationContent.image != null) {
                i2 = ImageSet.ADAPTER.encodedSizeWithTag(4, locationContent.image);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (locationContent.vendor != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, locationContent.vendor);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (locationContent.location != null) {
                i4 = Location.ADAPTER.encodedSizeWithTag(6, locationContent.location);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (locationContent.is_internal != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, locationContent.is_internal);
            }
            return i9 + i5 + locationContent.unknownFields().size();
        }

        /* renamed from: a */
        public LocationContent decode(ProtoReader protoReader) throws IOException {
            C15039a aVar = new C15039a();
            aVar.f39786a = "";
            aVar.f39787b = "";
            aVar.f39788c = 0;
            aVar.f39790e = "";
            aVar.f39792g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39786a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39787b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39788c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39789d = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39790e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39791f = Location.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39792g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LocationContent locationContent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, locationContent.longitude);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, locationContent.latitude);
            if (locationContent.zoom_level != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, locationContent.zoom_level);
            }
            if (locationContent.image != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 4, locationContent.image);
            }
            if (locationContent.vendor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, locationContent.vendor);
            }
            if (locationContent.location != null) {
                Location.ADAPTER.encodeWithTag(protoWriter, 6, locationContent.location);
            }
            if (locationContent.is_internal != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, locationContent.is_internal);
            }
            protoWriter.writeBytes(locationContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.LocationContent$a */
    public static final class C15039a extends Message.Builder<LocationContent, C15039a> {

        /* renamed from: a */
        public String f39786a;

        /* renamed from: b */
        public String f39787b;

        /* renamed from: c */
        public Integer f39788c;

        /* renamed from: d */
        public ImageSet f39789d;

        /* renamed from: e */
        public String f39790e;

        /* renamed from: f */
        public Location f39791f;

        /* renamed from: g */
        public Boolean f39792g;

        /* renamed from: a */
        public LocationContent build() {
            String str;
            String str2 = this.f39786a;
            if (str2 != null && (str = this.f39787b) != null) {
                return new LocationContent(str2, str, this.f39788c, this.f39789d, this.f39790e, this.f39791f, this.f39792g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "longitude", this.f39787b, "latitude");
        }

        /* renamed from: a */
        public C15039a mo54950a(Location location) {
            this.f39791f = location;
            return this;
        }

        /* renamed from: b */
        public C15039a mo54955b(String str) {
            this.f39787b = str;
            return this;
        }

        /* renamed from: c */
        public C15039a mo54956c(String str) {
            this.f39790e = str;
            return this;
        }

        /* renamed from: a */
        public C15039a mo54951a(Boolean bool) {
            this.f39792g = bool;
            return this;
        }

        /* renamed from: a */
        public C15039a mo54952a(Integer num) {
            this.f39788c = num;
            return this;
        }

        /* renamed from: a */
        public C15039a mo54953a(String str) {
            this.f39786a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15039a newBuilder() {
        C15039a aVar = new C15039a();
        aVar.f39786a = this.longitude;
        aVar.f39787b = this.latitude;
        aVar.f39788c = this.zoom_level;
        aVar.f39789d = this.image;
        aVar.f39790e = this.vendor;
        aVar.f39791f = this.location;
        aVar.f39792g = this.is_internal;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "LocationContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        if (this.zoom_level != null) {
            sb.append(", zoom_level=");
            sb.append(this.zoom_level);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.vendor != null) {
            sb.append(", vendor=");
            sb.append(this.vendor);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.is_internal != null) {
            sb.append(", is_internal=");
            sb.append(this.is_internal);
        }
        StringBuilder replace = sb.replace(0, 2, "LocationContent{");
        replace.append('}');
        return replace.toString();
    }

    public LocationContent(String str, String str2, Integer num, ImageSet imageSet, String str3, Location location2, Boolean bool) {
        this(str, str2, num, imageSet, str3, location2, bool, ByteString.EMPTY);
    }

    public LocationContent(String str, String str2, Integer num, ImageSet imageSet, String str3, Location location2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.longitude = str;
        this.latitude = str2;
        this.zoom_level = num;
        this.image = imageSet;
        this.vendor = str3;
        this.location = location2;
        this.is_internal = bool;
    }
}
