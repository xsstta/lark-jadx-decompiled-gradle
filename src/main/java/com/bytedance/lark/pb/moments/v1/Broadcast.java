package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Broadcast extends Message<Broadcast, C18326a> {
    public static final ProtoAdapter<Broadcast> ADAPTER = new C18327b();
    public static final Long DEFAULT_END_TIME_SEC = 0L;
    public static final Boolean DEFAULT_HAS_MEDIA = false;
    private static final long serialVersionUID = 0;
    public final ImageSet content_image;
    public final Long end_time_sec;
    public final Boolean has_media;
    public final RichText post_content;
    public final String post_id;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Broadcast$b */
    private static final class C18327b extends ProtoAdapter<Broadcast> {
        C18327b() {
            super(FieldEncoding.LENGTH_DELIMITED, Broadcast.class);
        }

        /* renamed from: a */
        public int encodedSize(Broadcast broadcast) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (broadcast.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, broadcast.post_id);
            } else {
                i = 0;
            }
            if (broadcast.end_time_sec != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, broadcast.end_time_sec);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (broadcast.title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, broadcast.title);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (broadcast.content_image != null) {
                i4 = ImageSet.ADAPTER.encodedSizeWithTag(4, broadcast.content_image);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (broadcast.has_media != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, broadcast.has_media);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (broadcast.post_content != null) {
                i6 = RichText.ADAPTER.encodedSizeWithTag(6, broadcast.post_content);
            }
            return i10 + i6 + broadcast.unknownFields().size();
        }

        /* renamed from: a */
        public Broadcast decode(ProtoReader protoReader) throws IOException {
            C18326a aVar = new C18326a();
            aVar.f45639a = "";
            aVar.f45640b = 0L;
            aVar.f45641c = "";
            aVar.f45643e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45639a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45640b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45641c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45642d = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45643e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45644f = RichText.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Broadcast broadcast) throws IOException {
            if (broadcast.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, broadcast.post_id);
            }
            if (broadcast.end_time_sec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, broadcast.end_time_sec);
            }
            if (broadcast.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, broadcast.title);
            }
            if (broadcast.content_image != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 4, broadcast.content_image);
            }
            if (broadcast.has_media != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, broadcast.has_media);
            }
            if (broadcast.post_content != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 6, broadcast.post_content);
            }
            protoWriter.writeBytes(broadcast.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Broadcast$a */
    public static final class C18326a extends Message.Builder<Broadcast, C18326a> {

        /* renamed from: a */
        public String f45639a;

        /* renamed from: b */
        public Long f45640b;

        /* renamed from: c */
        public String f45641c;

        /* renamed from: d */
        public ImageSet f45642d;

        /* renamed from: e */
        public Boolean f45643e;

        /* renamed from: f */
        public RichText f45644f;

        /* renamed from: a */
        public Broadcast build() {
            return new Broadcast(this.f45639a, this.f45640b, this.f45641c, this.f45642d, this.f45643e, this.f45644f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18326a mo63430a(Long l) {
            this.f45640b = l;
            return this;
        }

        /* renamed from: b */
        public C18326a mo63433b(String str) {
            this.f45641c = str;
            return this;
        }

        /* renamed from: a */
        public C18326a mo63431a(String str) {
            this.f45639a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18326a newBuilder() {
        C18326a aVar = new C18326a();
        aVar.f45639a = this.post_id;
        aVar.f45640b = this.end_time_sec;
        aVar.f45641c = this.title;
        aVar.f45642d = this.content_image;
        aVar.f45643e = this.has_media;
        aVar.f45644f = this.post_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Broadcast");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.end_time_sec != null) {
            sb.append(", end_time_sec=");
            sb.append(this.end_time_sec);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content_image != null) {
            sb.append(", content_image=");
            sb.append(this.content_image);
        }
        if (this.has_media != null) {
            sb.append(", has_media=");
            sb.append(this.has_media);
        }
        if (this.post_content != null) {
            sb.append(", post_content=");
            sb.append(this.post_content);
        }
        StringBuilder replace = sb.replace(0, 2, "Broadcast{");
        replace.append('}');
        return replace.toString();
    }

    public Broadcast(String str, Long l, String str2, ImageSet imageSet, Boolean bool, RichText richText) {
        this(str, l, str2, imageSet, bool, richText, ByteString.EMPTY);
    }

    public Broadcast(String str, Long l, String str2, ImageSet imageSet, Boolean bool, RichText richText, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.end_time_sec = l;
        this.title = str2;
        this.content_image = imageSet;
        this.has_media = bool;
        this.post_content = richText;
    }
}
