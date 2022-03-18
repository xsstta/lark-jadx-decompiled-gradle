package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetLocalRoomViewResourceDataRequest extends Message<GetLocalRoomViewResourceDataRequest, C15724a> {
    public static final ProtoAdapter<GetLocalRoomViewResourceDataRequest> ADAPTER = new C15725b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetLocalRoomViewResourceDataRequest$b */
    private static final class C15725b extends ProtoAdapter<GetLocalRoomViewResourceDataRequest> {
        C15725b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLocalRoomViewResourceDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLocalRoomViewResourceDataRequest getLocalRoomViewResourceDataRequest) {
            return getLocalRoomViewResourceDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetLocalRoomViewResourceDataRequest decode(ProtoReader protoReader) throws IOException {
            C15724a aVar = new C15724a();
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
        public void encode(ProtoWriter protoWriter, GetLocalRoomViewResourceDataRequest getLocalRoomViewResourceDataRequest) throws IOException {
            protoWriter.writeBytes(getLocalRoomViewResourceDataRequest.unknownFields());
        }
    }

    public GetLocalRoomViewResourceDataRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetLocalRoomViewResourceDataRequest$a */
    public static final class C15724a extends Message.Builder<GetLocalRoomViewResourceDataRequest, C15724a> {
        /* renamed from: a */
        public GetLocalRoomViewResourceDataRequest build() {
            return new GetLocalRoomViewResourceDataRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15724a newBuilder() {
        C15724a aVar = new C15724a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetLocalRoomViewResourceDataRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetLocalRoomViewResourceDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetLocalRoomViewResourceDataRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
