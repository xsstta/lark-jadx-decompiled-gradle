package com.bytedance.lark.pb.im.v1;

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

public final class GetUrgentPhoneNumbersResponse extends Message<GetUrgentPhoneNumbersResponse, C17749a> {
    public static final ProtoAdapter<GetUrgentPhoneNumbersResponse> ADAPTER = new C17750b();
    private static final long serialVersionUID = 0;
    public final List<String> phone_numbers;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentPhoneNumbersResponse$b */
    private static final class C17750b extends ProtoAdapter<GetUrgentPhoneNumbersResponse> {
        C17750b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrgentPhoneNumbersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrgentPhoneNumbersResponse getUrgentPhoneNumbersResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getUrgentPhoneNumbersResponse.phone_numbers) + getUrgentPhoneNumbersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrgentPhoneNumbersResponse decode(ProtoReader protoReader) throws IOException {
            C17749a aVar = new C17749a();
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
                    aVar.f44797a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUrgentPhoneNumbersResponse getUrgentPhoneNumbersResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getUrgentPhoneNumbersResponse.phone_numbers);
            protoWriter.writeBytes(getUrgentPhoneNumbersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUrgentPhoneNumbersResponse$a */
    public static final class C17749a extends Message.Builder<GetUrgentPhoneNumbersResponse, C17749a> {

        /* renamed from: a */
        public List<String> f44797a = Internal.newMutableList();

        /* renamed from: a */
        public GetUrgentPhoneNumbersResponse build() {
            return new GetUrgentPhoneNumbersResponse(this.f44797a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17749a newBuilder() {
        C17749a aVar = new C17749a();
        aVar.f44797a = Internal.copyOf("phone_numbers", this.phone_numbers);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUrgentPhoneNumbersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.phone_numbers.isEmpty()) {
            sb.append(", phone_numbers=");
            sb.append(this.phone_numbers);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUrgentPhoneNumbersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrgentPhoneNumbersResponse(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetUrgentPhoneNumbersResponse(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.phone_numbers = Internal.immutableCopyOf("phone_numbers", list);
    }
}
