package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetExternalContactsAuthResponse extends Message<GetExternalContactsAuthResponse, C16464a> {
    public static final ProtoAdapter<GetExternalContactsAuthResponse> ADAPTER = new C16465b();
    private static final long serialVersionUID = 0;
    public final Map<String, DeniedReason> id2denied_reason;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactsAuthResponse$a */
    public static final class C16464a extends Message.Builder<GetExternalContactsAuthResponse, C16464a> {

        /* renamed from: a */
        public Map<String, DeniedReason> f42767a = Internal.newMutableMap();

        /* renamed from: a */
        public GetExternalContactsAuthResponse build() {
            return new GetExternalContactsAuthResponse(this.f42767a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactsAuthResponse$b */
    private static final class C16465b extends ProtoAdapter<GetExternalContactsAuthResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, DeniedReason>> f42768a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DeniedReason.ADAPTER);

        C16465b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExternalContactsAuthResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExternalContactsAuthResponse getExternalContactsAuthResponse) {
            return this.f42768a.encodedSizeWithTag(1, getExternalContactsAuthResponse.id2denied_reason) + getExternalContactsAuthResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetExternalContactsAuthResponse decode(ProtoReader protoReader) throws IOException {
            C16464a aVar = new C16464a();
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
                    aVar.f42767a.putAll(this.f42768a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExternalContactsAuthResponse getExternalContactsAuthResponse) throws IOException {
            this.f42768a.encodeWithTag(protoWriter, 1, getExternalContactsAuthResponse.id2denied_reason);
            protoWriter.writeBytes(getExternalContactsAuthResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16464a newBuilder() {
        C16464a aVar = new C16464a();
        aVar.f42767a = Internal.copyOf("id2denied_reason", this.id2denied_reason);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetExternalContactsAuthResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.id2denied_reason.isEmpty()) {
            sb.append(", id2denied_reason=");
            sb.append(this.id2denied_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "GetExternalContactsAuthResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetExternalContactsAuthResponse(Map<String, DeniedReason> map) {
        this(map, ByteString.EMPTY);
    }

    public GetExternalContactsAuthResponse(Map<String, DeniedReason> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id2denied_reason = Internal.immutableCopyOf("id2denied_reason", map);
    }
}
