package com.bytedance.lark.pb.device.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetValidDevicesRequest extends Message<GetValidDevicesRequest, C16580a> {
    public static final ProtoAdapter<GetValidDevicesRequest> ADAPTER = new C16581b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.device.v1.GetValidDevicesRequest$b */
    private static final class C16581b extends ProtoAdapter<GetValidDevicesRequest> {
        C16581b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetValidDevicesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetValidDevicesRequest getValidDevicesRequest) {
            return getValidDevicesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetValidDevicesRequest decode(ProtoReader protoReader) throws IOException {
            C16580a aVar = new C16580a();
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
        public void encode(ProtoWriter protoWriter, GetValidDevicesRequest getValidDevicesRequest) throws IOException {
            protoWriter.writeBytes(getValidDevicesRequest.unknownFields());
        }
    }

    public GetValidDevicesRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.device.v1.GetValidDevicesRequest$a */
    public static final class C16580a extends Message.Builder<GetValidDevicesRequest, C16580a> {
        /* renamed from: a */
        public GetValidDevicesRequest build() {
            return new GetValidDevicesRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16580a newBuilder() {
        C16580a aVar = new C16580a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("device", "GetValidDevicesRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetValidDevicesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetValidDevicesRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
