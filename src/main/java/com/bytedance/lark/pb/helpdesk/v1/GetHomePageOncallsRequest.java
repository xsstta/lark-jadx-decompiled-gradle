package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetHomePageOncallsRequest extends Message<GetHomePageOncallsRequest, C17258a> {
    public static final ProtoAdapter<GetHomePageOncallsRequest> ADAPTER = new C17259b();
    public static final Boolean DEFAULT_FROM_LOCAL = false;
    private static final long serialVersionUID = 0;
    public final Boolean from_local;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetHomePageOncallsRequest$b */
    private static final class C17259b extends ProtoAdapter<GetHomePageOncallsRequest> {
        C17259b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHomePageOncallsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHomePageOncallsRequest getHomePageOncallsRequest) {
            int i;
            if (getHomePageOncallsRequest.from_local != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getHomePageOncallsRequest.from_local);
            } else {
                i = 0;
            }
            return i + getHomePageOncallsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetHomePageOncallsRequest decode(ProtoReader protoReader) throws IOException {
            C17258a aVar = new C17258a();
            aVar.f44090a = false;
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
                    aVar.f44090a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHomePageOncallsRequest getHomePageOncallsRequest) throws IOException {
            if (getHomePageOncallsRequest.from_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getHomePageOncallsRequest.from_local);
            }
            protoWriter.writeBytes(getHomePageOncallsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.GetHomePageOncallsRequest$a */
    public static final class C17258a extends Message.Builder<GetHomePageOncallsRequest, C17258a> {

        /* renamed from: a */
        public Boolean f44090a;

        /* renamed from: a */
        public GetHomePageOncallsRequest build() {
            return new GetHomePageOncallsRequest(this.f44090a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17258a newBuilder() {
        C17258a aVar = new C17258a();
        aVar.f44090a = this.from_local;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "GetHomePageOncallsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.from_local != null) {
            sb.append(", from_local=");
            sb.append(this.from_local);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHomePageOncallsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetHomePageOncallsRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetHomePageOncallsRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.from_local = bool;
    }
}
