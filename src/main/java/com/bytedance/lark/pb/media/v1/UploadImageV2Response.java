package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadImageV2Response extends Message<UploadImageV2Response, C18310a> {
    public static final ProtoAdapter<UploadImageV2Response> ADAPTER = new C18311b();
    private static final long serialVersionUID = 0;
    public final String image_key;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageV2Response$b */
    private static final class C18311b extends ProtoAdapter<UploadImageV2Response> {
        C18311b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadImageV2Response.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadImageV2Response uploadImageV2Response) {
            int i;
            if (uploadImageV2Response.image_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadImageV2Response.image_key);
            } else {
                i = 0;
            }
            return i + uploadImageV2Response.unknownFields().size();
        }

        /* renamed from: a */
        public UploadImageV2Response decode(ProtoReader protoReader) throws IOException {
            C18310a aVar = new C18310a();
            aVar.f45612a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45612a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadImageV2Response uploadImageV2Response) throws IOException {
            if (uploadImageV2Response.image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadImageV2Response.image_key);
            }
            protoWriter.writeBytes(uploadImageV2Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageV2Response$a */
    public static final class C18310a extends Message.Builder<UploadImageV2Response, C18310a> {

        /* renamed from: a */
        public String f45612a;

        /* renamed from: a */
        public UploadImageV2Response build() {
            return new UploadImageV2Response(this.f45612a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18310a newBuilder() {
        C18310a aVar = new C18310a();
        aVar.f45612a = this.image_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadImageV2Response");
        StringBuilder sb = new StringBuilder();
        if (this.image_key != null) {
            sb.append(", image_key=");
            sb.append(this.image_key);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadImageV2Response{");
        replace.append('}');
        return replace.toString();
    }

    public UploadImageV2Response(String str) {
        this(str, ByteString.EMPTY);
    }

    public UploadImageV2Response(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_key = str;
    }
}
