package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Media extends Message<Media, C18454a> {
    public static final ProtoAdapter<Media> ADAPTER = new C18455b();
    public static final Integer DEFAULT_DURATION_SEC = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Long DEFAULT_SIZE = 0L;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final ImageSet cover;
    public final String drive_token;
    public final String drive_url;
    public final Integer duration_sec;
    public final Integer height;
    public final String local_url;
    public final Long size;
    public final Integer width;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Media$b */
    private static final class C18455b extends ProtoAdapter<Media> {
        C18455b() {
            super(FieldEncoding.LENGTH_DELIMITED, Media.class);
        }

        /* renamed from: a */
        public int encodedSize(Media media) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (media.drive_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, media.drive_url);
            } else {
                i = 0;
            }
            if (media.local_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, media.local_url);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (media.cover != null) {
                i3 = ImageSet.ADAPTER.encodedSizeWithTag(3, media.cover);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (media.drive_token != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, media.drive_token);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (media.size != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, media.size);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (media.duration_sec != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, media.duration_sec);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (media.width != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, media.width);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (media.height != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, media.height);
            }
            return i14 + i8 + media.unknownFields().size();
        }

        /* renamed from: a */
        public Media decode(ProtoReader protoReader) throws IOException {
            C18454a aVar = new C18454a();
            aVar.f45850a = "";
            aVar.f45851b = "";
            aVar.f45853d = "";
            aVar.f45854e = 0L;
            aVar.f45855f = 0;
            aVar.f45856g = 0;
            aVar.f45857h = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45850a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45851b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45852c = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45853d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45854e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45855f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45856g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45857h = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Media media) throws IOException {
            if (media.drive_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, media.drive_url);
            }
            if (media.local_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, media.local_url);
            }
            if (media.cover != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 3, media.cover);
            }
            if (media.drive_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, media.drive_token);
            }
            if (media.size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, media.size);
            }
            if (media.duration_sec != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, media.duration_sec);
            }
            if (media.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, media.width);
            }
            if (media.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, media.height);
            }
            protoWriter.writeBytes(media.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Media$a */
    public static final class C18454a extends Message.Builder<Media, C18454a> {

        /* renamed from: a */
        public String f45850a;

        /* renamed from: b */
        public String f45851b;

        /* renamed from: c */
        public ImageSet f45852c;

        /* renamed from: d */
        public String f45853d;

        /* renamed from: e */
        public Long f45854e;

        /* renamed from: f */
        public Integer f45855f;

        /* renamed from: g */
        public Integer f45856g;

        /* renamed from: h */
        public Integer f45857h;

        /* renamed from: a */
        public Media build() {
            return new Media(this.f45850a, this.f45851b, this.f45852c, this.f45853d, this.f45854e, this.f45855f, this.f45856g, this.f45857h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18454a newBuilder() {
        C18454a aVar = new C18454a();
        aVar.f45850a = this.drive_url;
        aVar.f45851b = this.local_url;
        aVar.f45852c = this.cover;
        aVar.f45853d = this.drive_token;
        aVar.f45854e = this.size;
        aVar.f45855f = this.duration_sec;
        aVar.f45856g = this.width;
        aVar.f45857h = this.height;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Media");
        StringBuilder sb = new StringBuilder();
        if (this.drive_url != null) {
            sb.append(", drive_url=");
            sb.append(this.drive_url);
        }
        if (this.local_url != null) {
            sb.append(", local_url=");
            sb.append(this.local_url);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.drive_token != null) {
            sb.append(", drive_token=");
            sb.append(this.drive_token);
        }
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.duration_sec != null) {
            sb.append(", duration_sec=");
            sb.append(this.duration_sec);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        StringBuilder replace = sb.replace(0, 2, "Media{");
        replace.append('}');
        return replace.toString();
    }

    public Media(String str, String str2, ImageSet imageSet, String str3, Long l, Integer num, Integer num2, Integer num3) {
        this(str, str2, imageSet, str3, l, num, num2, num3, ByteString.EMPTY);
    }

    public Media(String str, String str2, ImageSet imageSet, String str3, Long l, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.drive_url = str;
        this.local_url = str2;
        this.cover = imageSet;
        this.drive_token = str3;
        this.size = l;
        this.duration_sec = num;
        this.width = num2;
        this.height = num3;
    }
}
