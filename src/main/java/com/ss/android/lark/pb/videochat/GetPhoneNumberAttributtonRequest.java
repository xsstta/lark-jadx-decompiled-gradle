package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetPhoneNumberAttributtonRequest extends Message<GetPhoneNumberAttributtonRequest, C50326a> {
    public static final ProtoAdapter<GetPhoneNumberAttributtonRequest> ADAPTER = new C50327b();
    private static final long serialVersionUID = 0;
    public final String menterprise_phone_number;

    /* renamed from: com.ss.android.lark.pb.videochat.GetPhoneNumberAttributtonRequest$b */
    private static final class C50327b extends ProtoAdapter<GetPhoneNumberAttributtonRequest> {
        C50327b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPhoneNumberAttributtonRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPhoneNumberAttributtonRequest getPhoneNumberAttributtonRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getPhoneNumberAttributtonRequest.menterprise_phone_number) + getPhoneNumberAttributtonRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPhoneNumberAttributtonRequest decode(ProtoReader protoReader) throws IOException {
            C50326a aVar = new C50326a();
            aVar.f125705a = "";
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
                    aVar.f125705a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPhoneNumberAttributtonRequest getPhoneNumberAttributtonRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getPhoneNumberAttributtonRequest.menterprise_phone_number);
            protoWriter.writeBytes(getPhoneNumberAttributtonRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetPhoneNumberAttributtonRequest$a */
    public static final class C50326a extends Message.Builder<GetPhoneNumberAttributtonRequest, C50326a> {

        /* renamed from: a */
        public String f125705a;

        /* renamed from: a */
        public GetPhoneNumberAttributtonRequest build() {
            String str = this.f125705a;
            if (str != null) {
                return new GetPhoneNumberAttributtonRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "menterprise_phone_number");
        }

        /* renamed from: a */
        public C50326a mo174534a(String str) {
            this.f125705a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50326a newBuilder() {
        C50326a aVar = new C50326a();
        aVar.f125705a = this.menterprise_phone_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", enterprise_phone_number=");
        sb.append(this.menterprise_phone_number);
        StringBuilder replace = sb.replace(0, 2, "GetPhoneNumberAttributtonRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPhoneNumberAttributtonRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetPhoneNumberAttributtonRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.menterprise_phone_number = str;
    }
}
