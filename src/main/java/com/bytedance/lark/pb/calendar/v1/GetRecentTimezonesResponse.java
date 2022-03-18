package com.bytedance.lark.pb.calendar.v1;

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

public final class GetRecentTimezonesResponse extends Message<GetRecentTimezonesResponse, C15760a> {
    public static final ProtoAdapter<GetRecentTimezonesResponse> ADAPTER = new C15761b();
    private static final long serialVersionUID = 0;
    public final List<String> timezone_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRecentTimezonesResponse$b */
    private static final class C15761b extends ProtoAdapter<GetRecentTimezonesResponse> {
        C15761b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecentTimezonesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecentTimezonesResponse getRecentTimezonesResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getRecentTimezonesResponse.timezone_ids) + getRecentTimezonesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecentTimezonesResponse decode(ProtoReader protoReader) throws IOException {
            C15760a aVar = new C15760a();
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
                    aVar.f41525a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRecentTimezonesResponse getRecentTimezonesResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getRecentTimezonesResponse.timezone_ids);
            protoWriter.writeBytes(getRecentTimezonesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRecentTimezonesResponse$a */
    public static final class C15760a extends Message.Builder<GetRecentTimezonesResponse, C15760a> {

        /* renamed from: a */
        public List<String> f41525a = Internal.newMutableList();

        /* renamed from: a */
        public GetRecentTimezonesResponse build() {
            return new GetRecentTimezonesResponse(this.f41525a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15760a newBuilder() {
        C15760a aVar = new C15760a();
        aVar.f41525a = Internal.copyOf("timezone_ids", this.timezone_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetRecentTimezonesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.timezone_ids.isEmpty()) {
            sb.append(", timezone_ids=");
            sb.append(this.timezone_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRecentTimezonesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecentTimezonesResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetRecentTimezonesResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timezone_ids = Internal.immutableCopyOf("timezone_ids", list);
    }
}
