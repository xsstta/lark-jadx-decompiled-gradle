package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetConvertTokenRequest extends Message<GetConvertTokenRequest, C19247a> {
    public static final ProtoAdapter<GetConvertTokenRequest> ADAPTER = new C19248b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetConvertTokenRequest$b */
    private static final class C19248b extends ProtoAdapter<GetConvertTokenRequest> {
        C19248b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConvertTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetConvertTokenRequest getConvertTokenRequest) {
            int i;
            if (getConvertTokenRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getConvertTokenRequest.message_id);
            } else {
                i = 0;
            }
            return i + getConvertTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetConvertTokenRequest decode(ProtoReader protoReader) throws IOException {
            C19247a aVar = new C19247a();
            aVar.f47436a = "";
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
                    aVar.f47436a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetConvertTokenRequest getConvertTokenRequest) throws IOException {
            if (getConvertTokenRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getConvertTokenRequest.message_id);
            }
            protoWriter.writeBytes(getConvertTokenRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.GetConvertTokenRequest$a */
    public static final class C19247a extends Message.Builder<GetConvertTokenRequest, C19247a> {

        /* renamed from: a */
        public String f47436a;

        /* renamed from: a */
        public GetConvertTokenRequest build() {
            return new GetConvertTokenRequest(this.f47436a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19247a mo65688a(String str) {
            this.f47436a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19247a newBuilder() {
        C19247a aVar = new C19247a();
        aVar.f47436a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "GetConvertTokenRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConvertTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetConvertTokenRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetConvertTokenRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
