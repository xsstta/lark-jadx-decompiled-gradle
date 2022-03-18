package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetResourceEquipmentsRequest extends Message<GetResourceEquipmentsRequest, C15772a> {
    public static final ProtoAdapter<GetResourceEquipmentsRequest> ADAPTER = new C15773b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceEquipmentsRequest$b */
    private static final class C15773b extends ProtoAdapter<GetResourceEquipmentsRequest> {
        C15773b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceEquipmentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceEquipmentsRequest getResourceEquipmentsRequest) {
            return getResourceEquipmentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceEquipmentsRequest decode(ProtoReader protoReader) throws IOException {
            C15772a aVar = new C15772a();
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
        public void encode(ProtoWriter protoWriter, GetResourceEquipmentsRequest getResourceEquipmentsRequest) throws IOException {
            protoWriter.writeBytes(getResourceEquipmentsRequest.unknownFields());
        }
    }

    public GetResourceEquipmentsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceEquipmentsRequest$a */
    public static final class C15772a extends Message.Builder<GetResourceEquipmentsRequest, C15772a> {
        /* renamed from: a */
        public GetResourceEquipmentsRequest build() {
            return new GetResourceEquipmentsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15772a newBuilder() {
        C15772a aVar = new C15772a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetResourceEquipmentsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetResourceEquipmentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceEquipmentsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
