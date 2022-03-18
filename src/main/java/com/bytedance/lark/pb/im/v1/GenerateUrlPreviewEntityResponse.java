package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GenerateUrlPreviewEntityResponse extends Message<GenerateUrlPreviewEntityResponse, C17460a> {
    public static final ProtoAdapter<GenerateUrlPreviewEntityResponse> ADAPTER = new C17461b();
    private static final long serialVersionUID = 0;
    public final UrlPreviewEntity preview_entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.GenerateUrlPreviewEntityResponse$b */
    private static final class C17461b extends ProtoAdapter<GenerateUrlPreviewEntityResponse> {
        C17461b() {
            super(FieldEncoding.LENGTH_DELIMITED, GenerateUrlPreviewEntityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GenerateUrlPreviewEntityResponse generateUrlPreviewEntityResponse) {
            int i;
            if (generateUrlPreviewEntityResponse.preview_entity != null) {
                i = UrlPreviewEntity.ADAPTER.encodedSizeWithTag(1, generateUrlPreviewEntityResponse.preview_entity);
            } else {
                i = 0;
            }
            return i + generateUrlPreviewEntityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GenerateUrlPreviewEntityResponse decode(ProtoReader protoReader) throws IOException {
            C17460a aVar = new C17460a();
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
                    aVar.f44352a = UrlPreviewEntity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GenerateUrlPreviewEntityResponse generateUrlPreviewEntityResponse) throws IOException {
            if (generateUrlPreviewEntityResponse.preview_entity != null) {
                UrlPreviewEntity.ADAPTER.encodeWithTag(protoWriter, 1, generateUrlPreviewEntityResponse.preview_entity);
            }
            protoWriter.writeBytes(generateUrlPreviewEntityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GenerateUrlPreviewEntityResponse$a */
    public static final class C17460a extends Message.Builder<GenerateUrlPreviewEntityResponse, C17460a> {

        /* renamed from: a */
        public UrlPreviewEntity f44352a;

        /* renamed from: a */
        public GenerateUrlPreviewEntityResponse build() {
            return new GenerateUrlPreviewEntityResponse(this.f44352a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17460a newBuilder() {
        C17460a aVar = new C17460a();
        aVar.f44352a = this.preview_entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GenerateUrlPreviewEntityResponse");
        StringBuilder sb = new StringBuilder();
        if (this.preview_entity != null) {
            sb.append(", preview_entity=");
            sb.append(this.preview_entity);
        }
        StringBuilder replace = sb.replace(0, 2, "GenerateUrlPreviewEntityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GenerateUrlPreviewEntityResponse(UrlPreviewEntity urlPreviewEntity) {
        this(urlPreviewEntity, ByteString.EMPTY);
    }

    public GenerateUrlPreviewEntityResponse(UrlPreviewEntity urlPreviewEntity, ByteString byteString) {
        super(ADAPTER, byteString);
        this.preview_entity = urlPreviewEntity;
    }
}
