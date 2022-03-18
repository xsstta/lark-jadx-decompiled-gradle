package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MGetThreadsResponse extends Message<MGetThreadsResponse, C17809a> {
    public static final ProtoAdapter<MGetThreadsResponse> ADAPTER = new C17810b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetThreadsResponse$b */
    private static final class C17810b extends ProtoAdapter<MGetThreadsResponse> {
        C17810b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetThreadsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetThreadsResponse mGetThreadsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, mGetThreadsResponse.entity) + mGetThreadsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetThreadsResponse decode(ProtoReader protoReader) throws IOException {
            C17809a aVar = new C17809a();
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
                    aVar.f44853a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetThreadsResponse mGetThreadsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, mGetThreadsResponse.entity);
            protoWriter.writeBytes(mGetThreadsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetThreadsResponse$a */
    public static final class C17809a extends Message.Builder<MGetThreadsResponse, C17809a> {

        /* renamed from: a */
        public C14928Entity f44853a;

        /* renamed from: a */
        public MGetThreadsResponse build() {
            C14928Entity entity = this.f44853a;
            if (entity != null) {
                return new MGetThreadsResponse(entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17809a newBuilder() {
        C17809a aVar = new C17809a();
        aVar.f44853a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MGetThreadsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "MGetThreadsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetThreadsResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public MGetThreadsResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
