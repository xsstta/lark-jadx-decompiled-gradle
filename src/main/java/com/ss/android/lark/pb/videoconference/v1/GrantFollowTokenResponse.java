package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GrantFollowTokenResponse extends Message<GrantFollowTokenResponse, C50733a> {
    public static final ProtoAdapter<GrantFollowTokenResponse> ADAPTER = new C50734b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GrantFollowTokenResponse$b */
    private static final class C50734b extends ProtoAdapter<GrantFollowTokenResponse> {
        C50734b() {
            super(FieldEncoding.LENGTH_DELIMITED, GrantFollowTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GrantFollowTokenResponse grantFollowTokenResponse) {
            return grantFollowTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GrantFollowTokenResponse decode(ProtoReader protoReader) throws IOException {
            C50733a aVar = new C50733a();
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
        public void encode(ProtoWriter protoWriter, GrantFollowTokenResponse grantFollowTokenResponse) throws IOException {
            protoWriter.writeBytes(grantFollowTokenResponse.unknownFields());
        }
    }

    public GrantFollowTokenResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GrantFollowTokenResponse$a */
    public static final class C50733a extends Message.Builder<GrantFollowTokenResponse, C50733a> {
        /* renamed from: a */
        public GrantFollowTokenResponse build() {
            return new GrantFollowTokenResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50733a newBuilder() {
        C50733a aVar = new C50733a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GrantFollowTokenResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GrantFollowTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GrantFollowTokenResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
