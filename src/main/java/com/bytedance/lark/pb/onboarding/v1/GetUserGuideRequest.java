package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserGuideRequest extends Message<GetUserGuideRequest, C18598a> {
    public static final ProtoAdapter<GetUserGuideRequest> ADAPTER = new C18599b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetUserGuideRequest$b */
    private static final class C18599b extends ProtoAdapter<GetUserGuideRequest> {
        C18599b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserGuideRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserGuideRequest getUserGuideRequest) {
            return getUserGuideRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserGuideRequest decode(ProtoReader protoReader) throws IOException {
            C18598a aVar = new C18598a();
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
        public void encode(ProtoWriter protoWriter, GetUserGuideRequest getUserGuideRequest) throws IOException {
            protoWriter.writeBytes(getUserGuideRequest.unknownFields());
        }
    }

    public GetUserGuideRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetUserGuideRequest$a */
    public static final class C18598a extends Message.Builder<GetUserGuideRequest, C18598a> {
        /* renamed from: a */
        public GetUserGuideRequest build() {
            return new GetUserGuideRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18598a newBuilder() {
        C18598a aVar = new C18598a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetUserGuideRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetUserGuideRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserGuideRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
