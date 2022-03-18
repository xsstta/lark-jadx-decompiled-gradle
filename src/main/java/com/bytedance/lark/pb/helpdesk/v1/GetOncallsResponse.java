package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Oncall;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetOncallsResponse extends Message<GetOncallsResponse, C17264a> {
    public static final ProtoAdapter<GetOncallsResponse> ADAPTER = new C17265b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<Oncall> oncalls;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetOncallsResponse$b */
    private static final class C17265b extends ProtoAdapter<GetOncallsResponse> {
        C17265b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetOncallsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetOncallsResponse getOncallsResponse) {
            int i;
            int encodedSizeWithTag = Oncall.ADAPTER.asRepeated().encodedSizeWithTag(1, getOncallsResponse.oncalls);
            if (getOncallsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getOncallsResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getOncallsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetOncallsResponse decode(ProtoReader protoReader) throws IOException {
            C17264a aVar = new C17264a();
            aVar.f44096b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44095a.add(Oncall.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44096b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetOncallsResponse getOncallsResponse) throws IOException {
            Oncall.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getOncallsResponse.oncalls);
            if (getOncallsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getOncallsResponse.has_more);
            }
            protoWriter.writeBytes(getOncallsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetOncallsResponse$a */
    public static final class C17264a extends Message.Builder<GetOncallsResponse, C17264a> {

        /* renamed from: a */
        public List<Oncall> f44095a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44096b;

        /* renamed from: a */
        public GetOncallsResponse build() {
            return new GetOncallsResponse(this.f44095a, this.f44096b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17264a newBuilder() {
        C17264a aVar = new C17264a();
        aVar.f44095a = Internal.copyOf("oncalls", this.oncalls);
        aVar.f44096b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "GetOncallsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.oncalls.isEmpty()) {
            sb.append(", oncalls=");
            sb.append(this.oncalls);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetOncallsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetOncallsResponse(List<Oncall> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetOncallsResponse(List<Oncall> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.oncalls = Internal.immutableCopyOf("oncalls", list);
        this.has_more = bool;
    }
}
