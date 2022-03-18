package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MGetTenantsResponse extends Message<MGetTenantsResponse, C16330a> {
    public static final ProtoAdapter<MGetTenantsResponse> ADAPTER = new C16331b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetTenantsResponse$b */
    private static final class C16331b extends ProtoAdapter<MGetTenantsResponse> {
        C16331b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetTenantsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetTenantsResponse mGetTenantsResponse) {
            int i;
            if (mGetTenantsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, mGetTenantsResponse.entity);
            } else {
                i = 0;
            }
            return i + mGetTenantsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetTenantsResponse decode(ProtoReader protoReader) throws IOException {
            C16330a aVar = new C16330a();
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
                    aVar.f42577a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetTenantsResponse mGetTenantsResponse) throws IOException {
            if (mGetTenantsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, mGetTenantsResponse.entity);
            }
            protoWriter.writeBytes(mGetTenantsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetTenantsResponse$a */
    public static final class C16330a extends Message.Builder<MGetTenantsResponse, C16330a> {

        /* renamed from: a */
        public C14928Entity f42577a;

        /* renamed from: a */
        public MGetTenantsResponse build() {
            return new MGetTenantsResponse(this.f42577a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16330a newBuilder() {
        C16330a aVar = new C16330a();
        aVar.f42577a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "MGetTenantsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetTenantsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetTenantsResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public MGetTenantsResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
