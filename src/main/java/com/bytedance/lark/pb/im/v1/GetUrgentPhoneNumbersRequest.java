package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUrgentPhoneNumbersRequest extends Message<GetUrgentPhoneNumbersRequest, C17747a> {
    public static final ProtoAdapter<GetUrgentPhoneNumbersRequest> ADAPTER = new C17748b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentPhoneNumbersRequest$b */
    private static final class C17748b extends ProtoAdapter<GetUrgentPhoneNumbersRequest> {
        C17748b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrgentPhoneNumbersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrgentPhoneNumbersRequest getUrgentPhoneNumbersRequest) {
            return getUrgentPhoneNumbersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrgentPhoneNumbersRequest decode(ProtoReader protoReader) throws IOException {
            C17747a aVar = new C17747a();
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
        public void encode(ProtoWriter protoWriter, GetUrgentPhoneNumbersRequest getUrgentPhoneNumbersRequest) throws IOException {
            protoWriter.writeBytes(getUrgentPhoneNumbersRequest.unknownFields());
        }
    }

    public GetUrgentPhoneNumbersRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentPhoneNumbersRequest$a */
    public static final class C17747a extends Message.Builder<GetUrgentPhoneNumbersRequest, C17747a> {
        /* renamed from: a */
        public GetUrgentPhoneNumbersRequest build() {
            return new GetUrgentPhoneNumbersRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17747a newBuilder() {
        C17747a aVar = new C17747a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUrgentPhoneNumbersRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUrgentPhoneNumbersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrgentPhoneNumbersRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
