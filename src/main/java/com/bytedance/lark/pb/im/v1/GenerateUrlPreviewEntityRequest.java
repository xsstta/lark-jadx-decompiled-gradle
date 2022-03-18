package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GenerateUrlPreviewEntityRequest extends Message<GenerateUrlPreviewEntityRequest, C17458a> {
    public static final ProtoAdapter<GenerateUrlPreviewEntityRequest> ADAPTER = new C17459b();
    private static final long serialVersionUID = 0;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.im.v1.GenerateUrlPreviewEntityRequest$b */
    private static final class C17459b extends ProtoAdapter<GenerateUrlPreviewEntityRequest> {
        C17459b() {
            super(FieldEncoding.LENGTH_DELIMITED, GenerateUrlPreviewEntityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GenerateUrlPreviewEntityRequest generateUrlPreviewEntityRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, generateUrlPreviewEntityRequest.url) + generateUrlPreviewEntityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GenerateUrlPreviewEntityRequest decode(ProtoReader protoReader) throws IOException {
            C17458a aVar = new C17458a();
            aVar.f44351a = "";
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
                    aVar.f44351a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GenerateUrlPreviewEntityRequest generateUrlPreviewEntityRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, generateUrlPreviewEntityRequest.url);
            protoWriter.writeBytes(generateUrlPreviewEntityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GenerateUrlPreviewEntityRequest$a */
    public static final class C17458a extends Message.Builder<GenerateUrlPreviewEntityRequest, C17458a> {

        /* renamed from: a */
        public String f44351a;

        /* renamed from: a */
        public GenerateUrlPreviewEntityRequest build() {
            String str = this.f44351a;
            if (str != null) {
                return new GenerateUrlPreviewEntityRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url");
        }

        /* renamed from: a */
        public C17458a mo61202a(String str) {
            this.f44351a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17458a newBuilder() {
        C17458a aVar = new C17458a();
        aVar.f44351a = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GenerateUrlPreviewEntityRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        StringBuilder replace = sb.replace(0, 2, "GenerateUrlPreviewEntityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GenerateUrlPreviewEntityRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GenerateUrlPreviewEntityRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
    }
}
