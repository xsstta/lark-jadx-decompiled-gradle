package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPayTokenRequest extends Message<GetPayTokenRequest, Builder> {
    public static final ProtoAdapter<GetPayTokenRequest> ADAPTER = new C17661a();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetPayTokenRequest$a */
    private static final class C17661a extends ProtoAdapter<GetPayTokenRequest> {
        C17661a() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPayTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPayTokenRequest getPayTokenRequest) {
            return getPayTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPayTokenRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPayTokenRequest getPayTokenRequest) throws IOException {
            protoWriter.writeBytes(getPayTokenRequest.unknownFields());
        }
    }

    public GetPayTokenRequest() {
        this(ByteString.EMPTY);
    }

    public static final class Builder extends Message.Builder<GetPayTokenRequest, Builder> {
        @Override // com.squareup.wire.Message.Builder
        public GetPayTokenRequest build() {
            return new GetPayTokenRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetPayTokenRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetPayTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPayTokenRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
