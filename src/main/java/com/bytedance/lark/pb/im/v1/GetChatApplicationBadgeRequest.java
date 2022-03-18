package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatApplicationBadgeRequest extends Message<GetChatApplicationBadgeRequest, C17486a> {
    public static final ProtoAdapter<GetChatApplicationBadgeRequest> ADAPTER = new C17487b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationBadgeRequest$b */
    private static final class C17487b extends ProtoAdapter<GetChatApplicationBadgeRequest> {
        C17487b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatApplicationBadgeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatApplicationBadgeRequest getChatApplicationBadgeRequest) {
            return getChatApplicationBadgeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatApplicationBadgeRequest decode(ProtoReader protoReader) throws IOException {
            C17486a aVar = new C17486a();
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
        public void encode(ProtoWriter protoWriter, GetChatApplicationBadgeRequest getChatApplicationBadgeRequest) throws IOException {
            protoWriter.writeBytes(getChatApplicationBadgeRequest.unknownFields());
        }
    }

    public GetChatApplicationBadgeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationBadgeRequest$a */
    public static final class C17486a extends Message.Builder<GetChatApplicationBadgeRequest, C17486a> {
        /* renamed from: a */
        public GetChatApplicationBadgeRequest build() {
            return new GetChatApplicationBadgeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17486a newBuilder() {
        C17486a aVar = new C17486a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatApplicationBadgeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetChatApplicationBadgeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatApplicationBadgeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
