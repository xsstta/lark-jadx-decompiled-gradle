package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetKeyValueResponse extends Message<SetKeyValueResponse, C18546a> {
    public static final ProtoAdapter<SetKeyValueResponse> ADAPTER = new C18547b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.moments.v1.SetKeyValueResponse$b */
    private static final class C18547b extends ProtoAdapter<SetKeyValueResponse> {
        C18547b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetKeyValueResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetKeyValueResponse setKeyValueResponse) {
            return setKeyValueResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetKeyValueResponse decode(ProtoReader protoReader) throws IOException {
            C18546a aVar = new C18546a();
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
        public void encode(ProtoWriter protoWriter, SetKeyValueResponse setKeyValueResponse) throws IOException {
            protoWriter.writeBytes(setKeyValueResponse.unknownFields());
        }
    }

    public SetKeyValueResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.SetKeyValueResponse$a */
    public static final class C18546a extends Message.Builder<SetKeyValueResponse, C18546a> {
        /* renamed from: a */
        public SetKeyValueResponse build() {
            return new SetKeyValueResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18546a newBuilder() {
        C18546a aVar = new C18546a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "SetKeyValueResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetKeyValueResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetKeyValueResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
