package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetPinReadStatusResponse extends Message<GetPinReadStatusResponse, C17666a> {
    public static final ProtoAdapter<GetPinReadStatusResponse> ADAPTER = new C17667b();
    public static final Boolean DEFAULT_HAS_UNREAD_PIN = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_unread_pin;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetPinReadStatusResponse$b */
    private static final class C17667b extends ProtoAdapter<GetPinReadStatusResponse> {
        C17667b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPinReadStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPinReadStatusResponse getPinReadStatusResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getPinReadStatusResponse.has_unread_pin) + getPinReadStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPinReadStatusResponse decode(ProtoReader protoReader) throws IOException {
            C17666a aVar = new C17666a();
            aVar.f44671a = false;
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
                    aVar.f44671a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPinReadStatusResponse getPinReadStatusResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getPinReadStatusResponse.has_unread_pin);
            protoWriter.writeBytes(getPinReadStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetPinReadStatusResponse$a */
    public static final class C17666a extends Message.Builder<GetPinReadStatusResponse, C17666a> {

        /* renamed from: a */
        public Boolean f44671a;

        /* renamed from: a */
        public GetPinReadStatusResponse build() {
            Boolean bool = this.f44671a;
            if (bool != null) {
                return new GetPinReadStatusResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_unread_pin");
        }
    }

    @Override // com.squareup.wire.Message
    public C17666a newBuilder() {
        C17666a aVar = new C17666a();
        aVar.f44671a = this.has_unread_pin;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetPinReadStatusResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", has_unread_pin=");
        sb.append(this.has_unread_pin);
        StringBuilder replace = sb.replace(0, 2, "GetPinReadStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPinReadStatusResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetPinReadStatusResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_unread_pin = bool;
    }
}
