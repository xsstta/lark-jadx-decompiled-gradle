package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MediaInfo extends Message<MediaInfo, C18456a> {
    public static final ProtoAdapter<MediaInfo> ADAPTER = new C18457b();
    public static final Integer DEFAULT_DURATION_SEC = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Long DEFAULT_SIZE = 0L;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final ImageInfo cover;
    public final String drive_token;
    public final Integer duration_sec;
    public final Integer height;
    public final String local_path;
    public final Long size;
    public final Integer width;

    /* renamed from: com.bytedance.lark.pb.moments.v1.MediaInfo$b */
    private static final class C18457b extends ProtoAdapter<MediaInfo> {
        C18457b() {
            super(FieldEncoding.LENGTH_DELIMITED, MediaInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MediaInfo mediaInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (mediaInfo.cover != null) {
                i = ImageInfo.ADAPTER.encodedSizeWithTag(1, mediaInfo.cover);
            } else {
                i = 0;
            }
            if (mediaInfo.drive_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mediaInfo.drive_token);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (mediaInfo.size != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, mediaInfo.size);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (mediaInfo.duration_sec != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, mediaInfo.duration_sec);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (mediaInfo.width != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, mediaInfo.width);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (mediaInfo.height != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, mediaInfo.height);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (mediaInfo.local_path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, mediaInfo.local_path);
            }
            return i12 + i7 + mediaInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MediaInfo decode(ProtoReader protoReader) throws IOException {
            C18456a aVar = new C18456a();
            aVar.f45859b = "";
            aVar.f45860c = 0L;
            aVar.f45861d = 0;
            aVar.f45862e = 0;
            aVar.f45863f = 0;
            aVar.f45864g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45858a = ImageInfo.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45859b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45860c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45861d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45862e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45863f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45864g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MediaInfo mediaInfo) throws IOException {
            if (mediaInfo.cover != null) {
                ImageInfo.ADAPTER.encodeWithTag(protoWriter, 1, mediaInfo.cover);
            }
            if (mediaInfo.drive_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mediaInfo.drive_token);
            }
            if (mediaInfo.size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mediaInfo.size);
            }
            if (mediaInfo.duration_sec != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, mediaInfo.duration_sec);
            }
            if (mediaInfo.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, mediaInfo.width);
            }
            if (mediaInfo.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, mediaInfo.height);
            }
            if (mediaInfo.local_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mediaInfo.local_path);
            }
            protoWriter.writeBytes(mediaInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.MediaInfo$a */
    public static final class C18456a extends Message.Builder<MediaInfo, C18456a> {

        /* renamed from: a */
        public ImageInfo f45858a;

        /* renamed from: b */
        public String f45859b;

        /* renamed from: c */
        public Long f45860c;

        /* renamed from: d */
        public Integer f45861d;

        /* renamed from: e */
        public Integer f45862e;

        /* renamed from: f */
        public Integer f45863f;

        /* renamed from: g */
        public String f45864g;

        /* renamed from: a */
        public MediaInfo build() {
            return new MediaInfo(this.f45858a, this.f45859b, this.f45860c, this.f45861d, this.f45862e, this.f45863f, this.f45864g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18456a mo63763a(ImageInfo imageInfo) {
            this.f45858a = imageInfo;
            return this;
        }

        /* renamed from: b */
        public C18456a mo63768b(Integer num) {
            this.f45862e = num;
            return this;
        }

        /* renamed from: c */
        public C18456a mo63770c(Integer num) {
            this.f45863f = num;
            return this;
        }

        /* renamed from: a */
        public C18456a mo63764a(Integer num) {
            this.f45861d = num;
            return this;
        }

        /* renamed from: b */
        public C18456a mo63769b(String str) {
            this.f45864g = str;
            return this;
        }

        /* renamed from: a */
        public C18456a mo63765a(Long l) {
            this.f45860c = l;
            return this;
        }

        /* renamed from: a */
        public C18456a mo63766a(String str) {
            this.f45859b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18456a newBuilder() {
        C18456a aVar = new C18456a();
        aVar.f45858a = this.cover;
        aVar.f45859b = this.drive_token;
        aVar.f45860c = this.size;
        aVar.f45861d = this.duration_sec;
        aVar.f45862e = this.width;
        aVar.f45863f = this.height;
        aVar.f45864g = this.local_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "MediaInfo");
        StringBuilder sb = new StringBuilder();
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
        if (this.local_path != null) {
            sb.append(", local_path=");
            sb.append(this.local_path);
        }
        StringBuilder replace = sb.replace(0, 2, "MediaInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MediaInfo(ImageInfo imageInfo, String str, Long l, Integer num, Integer num2, Integer num3, String str2) {
        this(imageInfo, str, l, num, num2, num3, str2, ByteString.EMPTY);
    }

    public MediaInfo(ImageInfo imageInfo, String str, Long l, Integer num, Integer num2, Integer num3, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cover = imageInfo;
        this.drive_token = str;
        this.size = l;
        this.duration_sec = num;
        this.width = num2;
        this.height = num3;
        this.local_path = str2;
    }
}
