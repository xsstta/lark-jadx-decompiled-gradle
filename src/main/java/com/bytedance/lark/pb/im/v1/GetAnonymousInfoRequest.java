package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAnonymousInfoRequest extends Message<GetAnonymousInfoRequest, C17470a> {
    public static final ProtoAdapter<GetAnonymousInfoRequest> ADAPTER = new C17471b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAnonymousInfoRequest$b */
    private static final class C17471b extends ProtoAdapter<GetAnonymousInfoRequest> {
        C17471b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAnonymousInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAnonymousInfoRequest getAnonymousInfoRequest) {
            return getAnonymousInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAnonymousInfoRequest decode(ProtoReader protoReader) throws IOException {
            C17470a aVar = new C17470a();
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
        public void encode(ProtoWriter protoWriter, GetAnonymousInfoRequest getAnonymousInfoRequest) throws IOException {
            protoWriter.writeBytes(getAnonymousInfoRequest.unknownFields());
        }
    }

    public GetAnonymousInfoRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAnonymousInfoRequest$a */
    public static final class C17470a extends Message.Builder<GetAnonymousInfoRequest, C17470a> {
        /* renamed from: a */
        public GetAnonymousInfoRequest build() {
            return new GetAnonymousInfoRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17470a newBuilder() {
        C17470a aVar = new C17470a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetAnonymousInfoRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAnonymousInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAnonymousInfoRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
