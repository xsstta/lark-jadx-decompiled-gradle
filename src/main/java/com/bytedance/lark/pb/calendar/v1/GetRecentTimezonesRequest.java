package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRecentTimezonesRequest extends Message<GetRecentTimezonesRequest, C15758a> {
    public static final ProtoAdapter<GetRecentTimezonesRequest> ADAPTER = new C15759b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRecentTimezonesRequest$b */
    private static final class C15759b extends ProtoAdapter<GetRecentTimezonesRequest> {
        C15759b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecentTimezonesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecentTimezonesRequest getRecentTimezonesRequest) {
            return getRecentTimezonesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecentTimezonesRequest decode(ProtoReader protoReader) throws IOException {
            C15758a aVar = new C15758a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRecentTimezonesRequest getRecentTimezonesRequest) throws IOException {
            protoWriter.writeBytes(getRecentTimezonesRequest.unknownFields());
        }
    }

    public GetRecentTimezonesRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRecentTimezonesRequest$a */
    public static final class C15758a extends Message.Builder<GetRecentTimezonesRequest, C15758a> {
        /* renamed from: a */
        public GetRecentTimezonesRequest build() {
            return new GetRecentTimezonesRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15758a newBuilder() {
        C15758a aVar = new C15758a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetRecentTimezonesRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetRecentTimezonesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecentTimezonesRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
