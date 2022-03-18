package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Urgent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUnackUrgentsResponse extends Message<GetUnackUrgentsResponse, C17739a> {
    public static final ProtoAdapter<GetUnackUrgentsResponse> ADAPTER = new C17740b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<Urgent> urgents;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnackUrgentsResponse$b */
    private static final class C17740b extends ProtoAdapter<GetUnackUrgentsResponse> {
        C17740b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUnackUrgentsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUnackUrgentsResponse getUnackUrgentsResponse) {
            return Urgent.ADAPTER.asRepeated().encodedSizeWithTag(1, getUnackUrgentsResponse.urgents) + C14928Entity.ADAPTER.encodedSizeWithTag(2, getUnackUrgentsResponse.entity) + getUnackUrgentsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUnackUrgentsResponse decode(ProtoReader protoReader) throws IOException {
            C17739a aVar = new C17739a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44786a.add(Urgent.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44787b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUnackUrgentsResponse getUnackUrgentsResponse) throws IOException {
            Urgent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUnackUrgentsResponse.urgents);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getUnackUrgentsResponse.entity);
            protoWriter.writeBytes(getUnackUrgentsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnackUrgentsResponse$a */
    public static final class C17739a extends Message.Builder<GetUnackUrgentsResponse, C17739a> {

        /* renamed from: a */
        public List<Urgent> f44786a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f44787b;

        /* renamed from: a */
        public GetUnackUrgentsResponse build() {
            C14928Entity entity = this.f44787b;
            if (entity != null) {
                return new GetUnackUrgentsResponse(this.f44786a, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17739a newBuilder() {
        C17739a aVar = new C17739a();
        aVar.f44786a = Internal.copyOf("urgents", this.urgents);
        aVar.f44787b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUnackUrgentsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.urgents.isEmpty()) {
            sb.append(", urgents=");
            sb.append(this.urgents);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "GetUnackUrgentsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUnackUrgentsResponse(List<Urgent> list, C14928Entity entity2) {
        this(list, entity2, ByteString.EMPTY);
    }

    public GetUnackUrgentsResponse(List<Urgent> list, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urgents = Internal.immutableCopyOf("urgents", list);
        this.entity = entity2;
    }
}
