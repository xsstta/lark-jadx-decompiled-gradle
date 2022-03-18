package com.bytedance.lark.pb.settings.v1;

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

public final class GetNavigationAppInfoBatchResponse extends Message<GetNavigationAppInfoBatchResponse, C19145a> {
    public static final ProtoAdapter<GetNavigationAppInfoBatchResponse> ADAPTER = new C19146b();
    private static final long serialVersionUID = 0;
    public final List<GetNavigationAppInfoResponse> responses;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoBatchResponse$b */
    private static final class C19146b extends ProtoAdapter<GetNavigationAppInfoBatchResponse> {
        C19146b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNavigationAppInfoBatchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNavigationAppInfoBatchResponse getNavigationAppInfoBatchResponse) {
            return GetNavigationAppInfoResponse.ADAPTER.asRepeated().encodedSizeWithTag(1, getNavigationAppInfoBatchResponse.responses) + getNavigationAppInfoBatchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNavigationAppInfoBatchResponse decode(ProtoReader protoReader) throws IOException {
            C19145a aVar = new C19145a();
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
                    aVar.f47284a.add(GetNavigationAppInfoResponse.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNavigationAppInfoBatchResponse getNavigationAppInfoBatchResponse) throws IOException {
            GetNavigationAppInfoResponse.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getNavigationAppInfoBatchResponse.responses);
            protoWriter.writeBytes(getNavigationAppInfoBatchResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoBatchResponse$a */
    public static final class C19145a extends Message.Builder<GetNavigationAppInfoBatchResponse, C19145a> {

        /* renamed from: a */
        public List<GetNavigationAppInfoResponse> f47284a = Internal.newMutableList();

        /* renamed from: a */
        public GetNavigationAppInfoBatchResponse build() {
            return new GetNavigationAppInfoBatchResponse(this.f47284a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19145a newBuilder() {
        C19145a aVar = new C19145a();
        aVar.f47284a = Internal.copyOf("responses", this.responses);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetNavigationAppInfoBatchResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.responses.isEmpty()) {
            sb.append(", responses=");
            sb.append(this.responses);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNavigationAppInfoBatchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNavigationAppInfoBatchResponse(List<GetNavigationAppInfoResponse> list) {
        this(list, ByteString.EMPTY);
    }

    public GetNavigationAppInfoBatchResponse(List<GetNavigationAppInfoResponse> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.responses = Internal.immutableCopyOf("responses", list);
    }
}
