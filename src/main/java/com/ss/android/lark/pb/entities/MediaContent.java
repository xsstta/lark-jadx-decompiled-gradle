package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MediaContent extends Message<MediaContent, C49728a> {
    public static final ProtoAdapter<MediaContent> ADAPTER = new C49729b();
    public static final Integer DEFAULT_DURATION = 0;
    public static final Long DEFAULT_SIZE = 0L;
    private static final long serialVersionUID = 0;
    public final Integer mduration;
    public final String mfs_unit;
    public final ImageSet mimage;
    public final String mkey;
    public final String mmime;
    public final String mname;
    public final Long msize;
    public final Source msource;

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

    /* renamed from: com.ss.android.lark.pb.entities.MediaContent$b */
    private static final class C49729b extends ProtoAdapter<MediaContent> {
        C49729b() {
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
            int i8 = 0;
            if (mediaContent.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mediaContent.mkey);
            } else {
                i = 0;
            }
            if (mediaContent.mname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mediaContent.mname);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (mediaContent.msize != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mediaContent.msize);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (mediaContent.mmime != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mediaContent.mmime);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (mediaContent.msource != null) {
                i5 = Source.ADAPTER.encodedSizeWithTag(5, mediaContent.msource);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (mediaContent.mimage != null) {
                i6 = ImageSet.ADAPTER.encodedSizeWithTag(6, mediaContent.mimage);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (mediaContent.mduration != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, mediaContent.mduration);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (mediaContent.mfs_unit != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, mediaContent.mfs_unit);
            }
            return i14 + i8 + mediaContent.unknownFields().size();
        }

        /* renamed from: a */
        public MediaContent decode(ProtoReader protoReader) throws IOException {
            C49728a aVar = new C49728a();
            aVar.f124499a = "";
            aVar.f124500b = "";
            aVar.f124501c = 0L;
            aVar.f124502d = "";
            aVar.f124505g = 0;
            aVar.f124506h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124499a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124500b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f124501c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124502d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f124503e = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f124504f = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124505g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124506h = ProtoAdapter.STRING.decode(protoReader);
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
            if (mediaContent.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mediaContent.mkey);
            }
            if (mediaContent.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mediaContent.mname);
            }
            if (mediaContent.msize != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mediaContent.msize);
            }
            if (mediaContent.mmime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mediaContent.mmime);
            }
            if (mediaContent.msource != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 5, mediaContent.msource);
            }
            if (mediaContent.mimage != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 6, mediaContent.mimage);
            }
            if (mediaContent.mduration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, mediaContent.mduration);
            }
            if (mediaContent.mfs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, mediaContent.mfs_unit);
            }
            protoWriter.writeBytes(mediaContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.MediaContent$a */
    public static final class C49728a extends Message.Builder<MediaContent, C49728a> {

        /* renamed from: a */
        public String f124499a;

        /* renamed from: b */
        public String f124500b;

        /* renamed from: c */
        public Long f124501c;

        /* renamed from: d */
        public String f124502d;

        /* renamed from: e */
        public Source f124503e;

        /* renamed from: f */
        public ImageSet f124504f;

        /* renamed from: g */
        public Integer f124505g;

        /* renamed from: h */
        public String f124506h;

        /* renamed from: a */
        public MediaContent build() {
            return new MediaContent(this.f124499a, this.f124500b, this.f124501c, this.f124502d, this.f124503e, this.f124504f, this.f124505g, this.f124506h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49728a newBuilder() {
        C49728a aVar = new C49728a();
        aVar.f124499a = this.mkey;
        aVar.f124500b = this.mname;
        aVar.f124501c = this.msize;
        aVar.f124502d = this.mmime;
        aVar.f124503e = this.msource;
        aVar.f124504f = this.mimage;
        aVar.f124505g = this.mduration;
        aVar.f124506h = this.mfs_unit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.msize != null) {
            sb.append(", size=");
            sb.append(this.msize);
        }
        if (this.mmime != null) {
            sb.append(", mime=");
            sb.append(this.mmime);
        }
        if (this.msource != null) {
            sb.append(", source=");
            sb.append(this.msource);
        }
        if (this.mimage != null) {
            sb.append(", image=");
            sb.append(this.mimage);
        }
        if (this.mduration != null) {
            sb.append(", duration=");
            sb.append(this.mduration);
        }
        if (this.mfs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.mfs_unit);
        }
        StringBuilder replace = sb.replace(0, 2, "MediaContent{");
        replace.append('}');
        return replace.toString();
    }

    public MediaContent(String str, String str2, Long l, String str3, Source source, ImageSet imageSet, Integer num, String str4) {
        this(str, str2, l, str3, source, imageSet, num, str4, ByteString.EMPTY);
    }

    public MediaContent(String str, String str2, Long l, String str3, Source source, ImageSet imageSet, Integer num, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkey = str;
        this.mname = str2;
        this.msize = l;
        this.mmime = str3;
        this.msource = source;
        this.mimage = imageSet;
        this.mduration = num;
        this.mfs_unit = str4;
    }
}
