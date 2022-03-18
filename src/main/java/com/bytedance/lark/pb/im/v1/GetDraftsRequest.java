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

public final class GetDraftsRequest extends Message<GetDraftsRequest, C17570a> {
    public static final ProtoAdapter<GetDraftsRequest> ADAPTER = new C17571b();
    private static final long serialVersionUID = 0;
    public final List<String> draft_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDraftsRequest$b */
    private static final class C17571b extends ProtoAdapter<GetDraftsRequest> {
        C17571b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDraftsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDraftsRequest getDraftsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getDraftsRequest.draft_ids) + getDraftsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDraftsRequest decode(ProtoReader protoReader) throws IOException {
            C17570a aVar = new C17570a();
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
                    aVar.f44530a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDraftsRequest getDraftsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getDraftsRequest.draft_ids);
            protoWriter.writeBytes(getDraftsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDraftsRequest$a */
    public static final class C17570a extends Message.Builder<GetDraftsRequest, C17570a> {

        /* renamed from: a */
        public List<String> f44530a = Internal.newMutableList();

        /* renamed from: a */
        public GetDraftsRequest build() {
            return new GetDraftsRequest(this.f44530a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17570a mo61491a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44530a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17570a newBuilder() {
        C17570a aVar = new C17570a();
        aVar.f44530a = Internal.copyOf("draft_ids", this.draft_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetDraftsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.draft_ids.isEmpty()) {
            sb.append(", draft_ids=");
            sb.append(this.draft_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDraftsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDraftsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetDraftsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft_ids = Internal.immutableCopyOf("draft_ids", list);
    }
}
