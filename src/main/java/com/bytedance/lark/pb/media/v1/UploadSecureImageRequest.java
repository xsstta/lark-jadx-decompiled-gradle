package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadSecureImageRequest extends Message<UploadSecureImageRequest, C18312a> {
    public static final ProtoAdapter<UploadSecureImageRequest> ADAPTER = new C18313b();
    public static final Long DEFAULT_COMPRESSED_SIZE_KB = 0L;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final ByteString DEFAULT_IMAGE = ByteString.EMPTY;
    public static final Boolean DEFAULT_IS_SECRET_CHAT_IMAGE = false;
    public static final Type DEFAULT_TYPE = Type.NORMAL;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Long compressed_size_kb;
    public final Integer height;
    public final ByteString image;
    public final Boolean is_secret_chat_image;
    public final String key;
    public final String path;
    public final Type type;
    public final Integer width;

    public enum Type implements WireEnum {
        NORMAL(1),
        POST(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return null;
            }
            return POST;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadSecureImageRequest$b */
    private static final class C18313b extends ProtoAdapter<UploadSecureImageRequest> {
        C18313b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadSecureImageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadSecureImageRequest uploadSecureImageRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, uploadSecureImageRequest.image);
            int i7 = 0;
            if (uploadSecureImageRequest.compressed_size_kb != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, uploadSecureImageRequest.compressed_size_kb);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (uploadSecureImageRequest.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, uploadSecureImageRequest.key);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (uploadSecureImageRequest.is_secret_chat_image != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, uploadSecureImageRequest.is_secret_chat_image);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (uploadSecureImageRequest.width != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, uploadSecureImageRequest.width);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (uploadSecureImageRequest.height != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, uploadSecureImageRequest.height);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (uploadSecureImageRequest.type != null) {
                i6 = Type.ADAPTER.encodedSizeWithTag(7, uploadSecureImageRequest.type);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (uploadSecureImageRequest.path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, uploadSecureImageRequest.path);
            }
            return i13 + i7 + uploadSecureImageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadSecureImageRequest decode(ProtoReader protoReader) throws IOException {
            C18312a aVar = new C18312a();
            aVar.f45613a = ByteString.EMPTY;
            aVar.f45614b = 0L;
            aVar.f45615c = "";
            aVar.f45616d = false;
            aVar.f45617e = 0;
            aVar.f45618f = 0;
            aVar.f45619g = Type.NORMAL;
            aVar.f45620h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45613a = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45614b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45615c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45616d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45617e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45618f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f45619g = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 8:
                            aVar.f45620h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UploadSecureImageRequest uploadSecureImageRequest) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, uploadSecureImageRequest.image);
            if (uploadSecureImageRequest.compressed_size_kb != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, uploadSecureImageRequest.compressed_size_kb);
            }
            if (uploadSecureImageRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uploadSecureImageRequest.key);
            }
            if (uploadSecureImageRequest.is_secret_chat_image != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, uploadSecureImageRequest.is_secret_chat_image);
            }
            if (uploadSecureImageRequest.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, uploadSecureImageRequest.width);
            }
            if (uploadSecureImageRequest.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, uploadSecureImageRequest.height);
            }
            if (uploadSecureImageRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 7, uploadSecureImageRequest.type);
            }
            if (uploadSecureImageRequest.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, uploadSecureImageRequest.path);
            }
            protoWriter.writeBytes(uploadSecureImageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadSecureImageRequest$a */
    public static final class C18312a extends Message.Builder<UploadSecureImageRequest, C18312a> {

        /* renamed from: a */
        public ByteString f45613a;

        /* renamed from: b */
        public Long f45614b;

        /* renamed from: c */
        public String f45615c;

        /* renamed from: d */
        public Boolean f45616d;

        /* renamed from: e */
        public Integer f45617e;

        /* renamed from: f */
        public Integer f45618f;

        /* renamed from: g */
        public Type f45619g;

        /* renamed from: h */
        public String f45620h;

        /* renamed from: a */
        public UploadSecureImageRequest build() {
            ByteString byteString = this.f45613a;
            if (byteString != null) {
                return new UploadSecureImageRequest(byteString, this.f45614b, this.f45615c, this.f45616d, this.f45617e, this.f45618f, this.f45619g, this.f45620h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString, "image");
        }

        /* renamed from: a */
        public C18312a mo63398a(Type type) {
            this.f45619g = type;
            return this;
        }

        /* renamed from: b */
        public C18312a mo63402b(Integer num) {
            this.f45618f = num;
            return this;
        }

        /* renamed from: a */
        public C18312a mo63399a(Integer num) {
            this.f45617e = num;
            return this;
        }

        /* renamed from: a */
        public C18312a mo63400a(ByteString byteString) {
            this.f45613a = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18312a newBuilder() {
        C18312a aVar = new C18312a();
        aVar.f45613a = this.image;
        aVar.f45614b = this.compressed_size_kb;
        aVar.f45615c = this.key;
        aVar.f45616d = this.is_secret_chat_image;
        aVar.f45617e = this.width;
        aVar.f45618f = this.height;
        aVar.f45619g = this.type;
        aVar.f45620h = this.path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadSecureImageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", image=");
        sb.append(this.image);
        if (this.compressed_size_kb != null) {
            sb.append(", compressed_size_kb=");
            sb.append(this.compressed_size_kb);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.is_secret_chat_image != null) {
            sb.append(", is_secret_chat_image=");
            sb.append(this.is_secret_chat_image);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadSecureImageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadSecureImageRequest(ByteString byteString, Long l, String str, Boolean bool, Integer num, Integer num2, Type type2, String str2) {
        this(byteString, l, str, bool, num, num2, type2, str2, ByteString.EMPTY);
    }

    public UploadSecureImageRequest(ByteString byteString, Long l, String str, Boolean bool, Integer num, Integer num2, Type type2, String str2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.image = byteString;
        this.compressed_size_kb = l;
        this.key = str;
        this.is_secret_chat_image = bool;
        this.width = num;
        this.height = num2;
        this.type = type2;
        this.path = str2;
    }
}
