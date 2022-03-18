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

public final class GetHomePageOncallsResponse extends Message<GetHomePageOncallsResponse, C17260a> {
    public static final ProtoAdapter<GetHomePageOncallsResponse> ADAPTER = new C17261b();
    private static final long serialVersionUID = 0;
    public final List<Oncall> oncalls;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetHomePageOncallsResponse$b */
    private static final class C17261b extends ProtoAdapter<GetHomePageOncallsResponse> {
        C17261b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHomePageOncallsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHomePageOncallsResponse getHomePageOncallsResponse) {
            return Oncall.ADAPTER.asRepeated().encodedSizeWithTag(1, getHomePageOncallsResponse.oncalls) + getHomePageOncallsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetHomePageOncallsResponse decode(ProtoReader protoReader) throws IOException {
            C17260a aVar = new C17260a();
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
                    aVar.f44091a.add(Oncall.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHomePageOncallsResponse getHomePageOncallsResponse) throws IOException {
            Oncall.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getHomePageOncallsResponse.oncalls);
            protoWriter.writeBytes(getHomePageOncallsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetHomePageOncallsResponse$a */
    public static final class C17260a extends Message.Builder<GetHomePageOncallsResponse, C17260a> {

        /* renamed from: a */
        public List<Oncall> f44091a = Internal.newMutableList();

        /* renamed from: a */
        public GetHomePageOncallsResponse build() {
            return new GetHomePageOncallsResponse(this.f44091a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17260a newBuilder() {
        C17260a aVar = new C17260a();
        aVar.f44091a = Internal.copyOf("oncalls", this.oncalls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "GetHomePageOncallsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.oncalls.isEmpty()) {
            sb.append(", oncalls=");
            sb.append(this.oncalls);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHomePageOncallsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetHomePageOncallsResponse(List<Oncall> list) {
        this(list, ByteString.EMPTY);
    }

    public GetHomePageOncallsResponse(List<Oncall> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.oncalls = Internal.immutableCopyOf("oncalls", list);
    }
}
