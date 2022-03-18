package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MediaContent extends Message<MediaContent, C15049a> {
    public static final ProtoAdapter<MediaContent> ADAPTER = new C15050b();
    public static final Integer DEFAULT_DURATION = 0;
    public static final Long DEFAULT_SIZE = 0L;
    public static final Source DEFAULT_SOURCE = Source.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String compress_path;
    public final Integer duration;
    public final ImageSet image;
    public final String key;
    public final String mime;
    public final String name;
    public final String origin_path;
    public final Long size;
    public final Source source;
    public final String url;

    public enum Source implements WireEnum {
        UNKNOWN(0),
        LARK(1);
        
        public static final ProtoAdapter<Source> ADAPTER = ProtoAdapter.newEnumAdapter(Source.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Source fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return LARK;
        }

        private Source(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MediaContent$b */
    private static final class C15050b extends ProtoAdapter<MediaContent> {
        C15050b() {
            super(FieldEncoding.LENGTH_DELIMITED, MediaContent.class);
        }

        /* renamed from: a */
        public int encodedSize(MediaContent mediaContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (mediaContent.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mediaContent.key);
            } else {
                i = 0;
            }
            if (mediaContent.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mediaContent.name);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (mediaContent.size != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mediaContent.size);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (mediaContent.mime != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mediaContent.mime);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (mediaContent.source != null) {
                i5 = Source.ADAPTER.encodedSizeWithTag(5, mediaContent.source);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (mediaContent.image != null) {
                i6 = ImageSet.ADAPTER.encodedSizeWithTag(6, mediaContent.image);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (mediaContent.duration != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, mediaContent.duration);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (mediaContent.url != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, mediaContent.url);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (mediaContent.compress_path != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, mediaContent.compress_path);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (mediaContent.origin_path != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, mediaContent.origin_path);
            }
            return i18 + i10 + mediaContent.unknownFields().size();
        }

        /* renamed from: a */
        public MediaContent decode(ProtoReader protoReader) throws IOException {
            C15049a aVar = new C15049a();
            aVar.f39808a = "";
            aVar.f39809b = "";
            aVar.f39810c = 0L;
            aVar.f39811d = "";
            aVar.f39812e = Source.UNKNOWN;
            aVar.f39814g = 0;
            aVar.f39815h = "";
            aVar.f39816i = "";
            aVar.f39817j = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39808a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39809b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39810c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39811d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f39812e = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f39813f = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39814g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39815h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f39816i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f39817j = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MediaContent mediaContent) throws IOException {
            if (mediaContent.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mediaContent.key);
            }
            if (mediaContent.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mediaContent.name);
            }
            if (mediaContent.size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mediaContent.size);
            }
            if (mediaContent.mime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mediaContent.mime);
            }
            if (mediaContent.source != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 5, mediaContent.source);
            }
            if (mediaContent.image != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 6, mediaContent.image);
            }
            if (mediaContent.duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, mediaContent.duration);
            }
            if (mediaContent.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, mediaContent.url);
            }
            if (mediaContent.compress_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, mediaContent.compress_path);
            }
            if (mediaContent.origin_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, mediaContent.origin_path);
            }
            protoWriter.writeBytes(mediaContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MediaContent$a */
    public static final class C15049a extends Message.Builder<MediaContent, C15049a> {

        /* renamed from: a */
        public String f39808a;

        /* renamed from: b */
        public String f39809b;

        /* renamed from: c */
        public Long f39810c;

        /* renamed from: d */
        public String f39811d;

        /* renamed from: e */
        public Source f39812e;

        /* renamed from: f */
        public ImageSet f39813f;

        /* renamed from: g */
        public Integer f39814g;

        /* renamed from: h */
        public String f39815h;

        /* renamed from: i */
        public String f39816i;

        /* renamed from: j */
        public String f39817j;

        /* renamed from: a */
        public MediaContent build() {
            return new MediaContent(this.f39808a, this.f39809b, this.f39810c, this.f39811d, this.f39812e, this.f39813f, this.f39814g, this.f39815h, this.f39816i, this.f39817j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15049a newBuilder() {
        C15049a aVar = new C15049a();
        aVar.f39808a = this.key;
        aVar.f39809b = this.name;
        aVar.f39810c = this.size;
        aVar.f39811d = this.mime;
        aVar.f39812e = this.source;
        aVar.f39813f = this.image;
        aVar.f39814g = this.duration;
        aVar.f39815h = this.url;
        aVar.f39816i = this.compress_path;
        aVar.f39817j = this.origin_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MediaContent");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.mime != null) {
            sb.append(", mime=");
            sb.append(this.mime);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.compress_path != null) {
            sb.append(", compress_path=");
            sb.append(this.compress_path);
        }
        if (this.origin_path != null) {
            sb.append(", origin_path=");
            sb.append(this.origin_path);
        }
        StringBuilder replace = sb.replace(0, 2, "MediaContent{");
        replace.append('}');
        return replace.toString();
    }

    public MediaContent(String str, String str2, Long l, String str3, Source source2, ImageSet imageSet, Integer num, String str4, String str5, String str6) {
        this(str, str2, l, str3, source2, imageSet, num, str4, str5, str6, ByteString.EMPTY);
    }

    public MediaContent(String str, String str2, Long l, String str3, Source source2, ImageSet imageSet, Integer num, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.name = str2;
        this.size = l;
        this.mime = str3;
        this.source = source2;
        this.image = imageSet;
        this.duration = num;
        this.url = str4;
        this.compress_path = str5;
        this.origin_path = str6;
    }
}
