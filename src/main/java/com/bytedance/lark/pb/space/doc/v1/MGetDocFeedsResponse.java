package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MGetDocFeedsResponse extends Message<MGetDocFeedsResponse, C19271a> {
    public static final ProtoAdapter<MGetDocFeedsResponse> ADAPTER = new C19272b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsResponse$b */
    private static final class C19272b extends ProtoAdapter<MGetDocFeedsResponse> {
        C19272b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetDocFeedsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetDocFeedsResponse mGetDocFeedsResponse) {
            int i;
            if (mGetDocFeedsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, mGetDocFeedsResponse.entity);
            } else {
                i = 0;
            }
            return i + mGetDocFeedsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetDocFeedsResponse decode(ProtoReader protoReader) throws IOException {
            C19271a aVar = new C19271a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47464a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetDocFeedsResponse mGetDocFeedsResponse) throws IOException {
            if (mGetDocFeedsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, mGetDocFeedsResponse.entity);
            }
            protoWriter.writeBytes(mGetDocFeedsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsResponse$a */
    public static final class C19271a extends Message.Builder<MGetDocFeedsResponse, C19271a> {

        /* renamed from: a */
        public C14928Entity f47464a;

        /* renamed from: a */
        public MGetDocFeedsResponse build() {
            return new MGetDocFeedsResponse(this.f47464a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19271a newBuilder() {
        C19271a aVar = new C19271a();
        aVar.f47464a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "MGetDocFeedsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetDocFeedsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetDocFeedsResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public MGetDocFeedsResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
