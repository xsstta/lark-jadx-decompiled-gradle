package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetCurrentUserResponse extends Message<SetCurrentUserResponse, C19751a> {
    public static final ProtoAdapter<SetCurrentUserResponse> ADAPTER = new C19752b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetCurrentUserResponse$b */
    private static final class C19752b extends ProtoAdapter<SetCurrentUserResponse> {
        C19752b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCurrentUserResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCurrentUserResponse setCurrentUserResponse) {
            return setCurrentUserResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetCurrentUserResponse decode(ProtoReader protoReader) throws IOException {
            C19751a aVar = new C19751a();
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
        public void encode(ProtoWriter protoWriter, SetCurrentUserResponse setCurrentUserResponse) throws IOException {
            protoWriter.writeBytes(setCurrentUserResponse.unknownFields());
        }
    }

    public SetCurrentUserResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetCurrentUserResponse$a */
    public static final class C19751a extends Message.Builder<SetCurrentUserResponse, C19751a> {
        /* renamed from: a */
        public SetCurrentUserResponse build() {
            return new SetCurrentUserResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19751a newBuilder() {
        C19751a aVar = new C19751a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "SetCurrentUserResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetCurrentUserResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetCurrentUserResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
