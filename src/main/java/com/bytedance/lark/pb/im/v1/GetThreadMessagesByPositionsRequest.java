package com.bytedance.lark.pb.im.v1;

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

public final class GetThreadMessagesByPositionsRequest extends Message<GetThreadMessagesByPositionsRequest, C17699a> {
    public static final ProtoAdapter<GetThreadMessagesByPositionsRequest> ADAPTER = new C17700b();
    private static final long serialVersionUID = 0;
    public final List<Integer> positions;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesByPositionsRequest$b */
    private static final class C17700b extends ProtoAdapter<GetThreadMessagesByPositionsRequest> {
        C17700b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThreadMessagesByPositionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThreadMessagesByPositionsRequest getThreadMessagesByPositionsRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getThreadMessagesByPositionsRequest.thread_id) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, getThreadMessagesByPositionsRequest.positions) + getThreadMessagesByPositionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetThreadMessagesByPositionsRequest decode(ProtoReader protoReader) throws IOException {
            C17699a aVar = new C17699a();
            aVar.f44718a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44718a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44719b.add(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetThreadMessagesByPositionsRequest getThreadMessagesByPositionsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getThreadMessagesByPositionsRequest.thread_id);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, getThreadMessagesByPositionsRequest.positions);
            protoWriter.writeBytes(getThreadMessagesByPositionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetThreadMessagesByPositionsRequest$a */
    public static final class C17699a extends Message.Builder<GetThreadMessagesByPositionsRequest, C17699a> {

        /* renamed from: a */
        public String f44718a;

        /* renamed from: b */
        public List<Integer> f44719b = Internal.newMutableList();

        /* renamed from: a */
        public GetThreadMessagesByPositionsRequest build() {
            String str = this.f44718a;
            if (str != null) {
                return new GetThreadMessagesByPositionsRequest(str, this.f44719b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "thread_id");
        }

        /* renamed from: a */
        public C17699a mo61818a(String str) {
            this.f44718a = str;
            return this;
        }

        /* renamed from: a */
        public C17699a mo61819a(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.f44719b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17699a newBuilder() {
        C17699a aVar = new C17699a();
        aVar.f44718a = this.thread_id;
        aVar.f44719b = Internal.copyOf("positions", this.positions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetThreadMessagesByPositionsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", thread_id=");
        sb.append(this.thread_id);
        if (!this.positions.isEmpty()) {
            sb.append(", positions=");
            sb.append(this.positions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetThreadMessagesByPositionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetThreadMessagesByPositionsRequest(String str, List<Integer> list) {
        this(str, list, ByteString.EMPTY);
    }

    public GetThreadMessagesByPositionsRequest(String str, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.positions = Internal.immutableCopyOf("positions", list);
    }
}
