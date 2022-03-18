package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MakeUserOfflineResponse extends Message<MakeUserOfflineResponse, C19717a> {
    public static final ProtoAdapter<MakeUserOfflineResponse> ADAPTER = new C19718b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOfflineResponse$b */
    private static final class C19718b extends ProtoAdapter<MakeUserOfflineResponse> {
        C19718b() {
            super(FieldEncoding.LENGTH_DELIMITED, MakeUserOfflineResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MakeUserOfflineResponse makeUserOfflineResponse) {
            return makeUserOfflineResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MakeUserOfflineResponse decode(ProtoReader protoReader) throws IOException {
            C19717a aVar = new C19717a();
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
        public void encode(ProtoWriter protoWriter, MakeUserOfflineResponse makeUserOfflineResponse) throws IOException {
            protoWriter.writeBytes(makeUserOfflineResponse.unknownFields());
        }
    }

    public MakeUserOfflineResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.MakeUserOfflineResponse$a */
    public static final class C19717a extends Message.Builder<MakeUserOfflineResponse, C19717a> {
        /* renamed from: a */
        public MakeUserOfflineResponse build() {
            return new MakeUserOfflineResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19717a newBuilder() {
        C19717a aVar = new C19717a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "MakeUserOfflineResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MakeUserOfflineResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MakeUserOfflineResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
