package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MGetServerTodosRequest extends Message<MGetServerTodosRequest, C19581a> {
    public static final ProtoAdapter<MGetServerTodosRequest> ADAPTER = new C19582b();
    private static final long serialVersionUID = 0;
    public final List<String> guids;

    /* renamed from: com.bytedance.lark.pb.todo.v1.MGetServerTodosRequest$b */
    private static final class C19582b extends ProtoAdapter<MGetServerTodosRequest> {
        C19582b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerTodosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerTodosRequest mGetServerTodosRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetServerTodosRequest.guids) + mGetServerTodosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerTodosRequest decode(ProtoReader protoReader) throws IOException {
            C19581a aVar = new C19581a();
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
                    aVar.f47932a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerTodosRequest mGetServerTodosRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetServerTodosRequest.guids);
            protoWriter.writeBytes(mGetServerTodosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.MGetServerTodosRequest$a */
    public static final class C19581a extends Message.Builder<MGetServerTodosRequest, C19581a> {

        /* renamed from: a */
        public List<String> f47932a = Internal.newMutableList();

        /* renamed from: a */
        public MGetServerTodosRequest build() {
            return new MGetServerTodosRequest(this.f47932a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19581a mo66492a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f47932a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19581a newBuilder() {
        C19581a aVar = new C19581a();
        aVar.f47932a = Internal.copyOf("guids", this.guids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "MGetServerTodosRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.guids.isEmpty()) {
            sb.append(", guids=");
            sb.append(this.guids);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerTodosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerTodosRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetServerTodosRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guids = Internal.immutableCopyOf("guids", list);
    }
}
