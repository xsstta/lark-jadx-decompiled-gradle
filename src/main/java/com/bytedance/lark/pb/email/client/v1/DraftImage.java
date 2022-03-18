package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DraftImage extends Message<DraftImage, C16610a> {
    public static final ProtoAdapter<DraftImage> ADAPTER = new C16611b();
    public static final Long DEFAULT_IMAGE_SIZE = 0L;
    private static final long serialVersionUID = 0;
    public final String cid;
    public final String file_path;
    public final String file_token;
    public final String image_name;
    public final Long image_size;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.DraftImage$b */
    private static final class C16611b extends ProtoAdapter<DraftImage> {
        C16611b() {
            super(FieldEncoding.LENGTH_DELIMITED, DraftImage.class);
        }

        /* renamed from: a */
        public int encodedSize(DraftImage draftImage) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (draftImage.image_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, draftImage.image_name);
            } else {
                i = 0;
            }
            if (draftImage.file_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, draftImage.file_token);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (draftImage.cid != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, draftImage.cid);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (draftImage.image_size != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, draftImage.image_size);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (draftImage.file_path != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, draftImage.file_path);
            }
            return i8 + i5 + draftImage.unknownFields().size();
        }

        /* renamed from: a */
        public DraftImage decode(ProtoReader protoReader) throws IOException {
            C16610a aVar = new C16610a();
            aVar.f43017a = "";
            aVar.f43018b = "";
            aVar.f43019c = "";
            aVar.f43020d = 0L;
            aVar.f43021e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43017a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43018b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43019c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f43020d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43021e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DraftImage draftImage) throws IOException {
            if (draftImage.image_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, draftImage.image_name);
            }
            if (draftImage.file_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, draftImage.file_token);
            }
            if (draftImage.cid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, draftImage.cid);
            }
            if (draftImage.image_size != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, draftImage.image_size);
            }
            if (draftImage.file_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, draftImage.file_path);
            }
            protoWriter.writeBytes(draftImage.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.DraftImage$a */
    public static final class C16610a extends Message.Builder<DraftImage, C16610a> {

        /* renamed from: a */
        public String f43017a;

        /* renamed from: b */
        public String f43018b;

        /* renamed from: c */
        public String f43019c;

        /* renamed from: d */
        public Long f43020d;

        /* renamed from: e */
        public String f43021e;

        /* renamed from: a */
        public DraftImage build() {
            return new DraftImage(this.f43017a, this.f43018b, this.f43019c, this.f43020d, this.f43021e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16610a newBuilder() {
        C16610a aVar = new C16610a();
        aVar.f43017a = this.image_name;
        aVar.f43018b = this.file_token;
        aVar.f43019c = this.cid;
        aVar.f43020d = this.image_size;
        aVar.f43021e = this.file_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "DraftImage");
        StringBuilder sb = new StringBuilder();
        if (this.image_name != null) {
            sb.append(", image_name=");
            sb.append(this.image_name);
        }
        if (this.file_token != null) {
            sb.append(", file_token=");
            sb.append(this.file_token);
        }
        if (this.cid != null) {
            sb.append(", cid=");
            sb.append(this.cid);
        }
        if (this.image_size != null) {
            sb.append(", image_size=");
            sb.append(this.image_size);
        }
        if (this.file_path != null) {
            sb.append(", file_path=");
            sb.append(this.file_path);
        }
        StringBuilder replace = sb.replace(0, 2, "DraftImage{");
        replace.append('}');
        return replace.toString();
    }

    public DraftImage(String str, String str2, String str3, Long l, String str4) {
        this(str, str2, str3, l, str4, ByteString.EMPTY);
    }

    public DraftImage(String str, String str2, String str3, Long l, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_name = str;
        this.file_token = str2;
        this.cid = str3;
        this.image_size = l;
        this.file_path = str4;
    }
}
