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

public final class MGetMessagesResponse extends Message<MGetMessagesResponse, C17805a> {
    public static final ProtoAdapter<MGetMessagesResponse> ADAPTER = new C17806b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetMessagesResponse$b */
    private static final class C17806b extends ProtoAdapter<MGetMessagesResponse> {
        C17806b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetMessagesResponse mGetMessagesResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, mGetMessagesResponse.entity) + mGetMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C17805a aVar = new C17805a();
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
                    aVar.f44849a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetMessagesResponse mGetMessagesResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, mGetMessagesResponse.entity);
            protoWriter.writeBytes(mGetMessagesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetMessagesResponse$a */
    public static final class C17805a extends Message.Builder<MGetMessagesResponse, C17805a> {

        /* renamed from: a */
        public C14928Entity f44849a;

        /* renamed from: a */
        public MGetMessagesResponse build() {
            C14928Entity entity = this.f44849a;
            if (entity != null) {
                return new MGetMessagesResponse(entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17805a newBuilder() {
        C17805a aVar = new C17805a();
        aVar.f44849a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MGetMessagesResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "MGetMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetMessagesResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public MGetMessagesResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
