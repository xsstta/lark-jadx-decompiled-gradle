package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatterMobileRequest extends Message<GetChatterMobileRequest, C16194a> {
    public static final ProtoAdapter<GetChatterMobileRequest> ADAPTER = new C16195b();
    private static final long serialVersionUID = 0;
    public final String chatter_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterMobileRequest$b */
    private static final class C16195b extends ProtoAdapter<GetChatterMobileRequest> {
        C16195b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterMobileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterMobileRequest getChatterMobileRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatterMobileRequest.chatter_id) + getChatterMobileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterMobileRequest decode(ProtoReader protoReader) throws IOException {
            C16194a aVar = new C16194a();
            aVar.f42352a = "";
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
                    aVar.f42352a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterMobileRequest getChatterMobileRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatterMobileRequest.chatter_id);
            protoWriter.writeBytes(getChatterMobileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterMobileRequest$a */
    public static final class C16194a extends Message.Builder<GetChatterMobileRequest, C16194a> {

        /* renamed from: a */
        public String f42352a;

        /* renamed from: a */
        public GetChatterMobileRequest build() {
            String str = this.f42352a;
            if (str != null) {
                return new GetChatterMobileRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chatter_id");
        }

        /* renamed from: a */
        public C16194a mo58067a(String str) {
            this.f42352a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16194a newBuilder() {
        C16194a aVar = new C16194a();
        aVar.f42352a = this.chatter_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterMobileRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chatter_id=");
        sb.append(this.chatter_id);
        StringBuilder replace = sb.replace(0, 2, "GetChatterMobileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterMobileRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatterMobileRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_id = str;
    }
}
