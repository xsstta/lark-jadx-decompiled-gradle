package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadImageRequest extends Message<UploadImageRequest, C18304a> {
    public static final ProtoAdapter<UploadImageRequest> ADAPTER = new C18305b();
    public static final Long DEFAULT_COMPRESSED_SIZE_KB = 0L;
    public static final ByteString DEFAULT_IMAGE = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final Long compressed_size_kb;
    public final ByteString image;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageRequest$b */
    private static final class C18305b extends ProtoAdapter<UploadImageRequest> {
        C18305b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadImageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadImageRequest uploadImageRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, uploadImageRequest.image);
            if (uploadImageRequest.compressed_size_kb != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, uploadImageRequest.compressed_size_kb);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + uploadImageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadImageRequest decode(ProtoReader protoReader) throws IOException {
            C18304a aVar = new C18304a();
            aVar.f45606a = ByteString.EMPTY;
            aVar.f45607b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45606a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45607b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadImageRequest uploadImageRequest) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, uploadImageRequest.image);
            if (uploadImageRequest.compressed_size_kb != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, uploadImageRequest.compressed_size_kb);
            }
            protoWriter.writeBytes(uploadImageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageRequest$a */
    public static final class C18304a extends Message.Builder<UploadImageRequest, C18304a> {

        /* renamed from: a */
        public ByteString f45606a;

        /* renamed from: b */
        public Long f45607b;

        /* renamed from: a */
        public UploadImageRequest build() {
            ByteString byteString = this.f45606a;
            if (byteString != null) {
                return new UploadImageRequest(byteString, this.f45607b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString, "image");
        }

        /* renamed from: a */
        public C18304a mo63379a(ByteString byteString) {
            this.f45606a = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18304a newBuilder() {
        C18304a aVar = new C18304a();
        aVar.f45606a = this.image;
        aVar.f45607b = this.compressed_size_kb;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadImageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", image=");
        sb.append(this.image);
        if (this.compressed_size_kb != null) {
            sb.append(", compressed_size_kb=");
            sb.append(this.compressed_size_kb);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadImageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadImageRequest(ByteString byteString, Long l) {
        this(byteString, l, ByteString.EMPTY);
    }

    public UploadImageRequest(ByteString byteString, Long l, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.image = byteString;
        this.compressed_size_kb = l;
    }
}
