package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetClientStatusResponse extends Message<SetClientStatusResponse, C15266a> {
    public static final ProtoAdapter<SetClientStatusResponse> ADAPTER = new C15267b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetClientStatusResponse$b */
    private static final class C15267b extends ProtoAdapter<SetClientStatusResponse> {
        C15267b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetClientStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetClientStatusResponse setClientStatusResponse) {
            return setClientStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetClientStatusResponse decode(ProtoReader protoReader) throws IOException {
            C15266a aVar = new C15266a();
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
        public void encode(ProtoWriter protoWriter, SetClientStatusResponse setClientStatusResponse) throws IOException {
            protoWriter.writeBytes(setClientStatusResponse.unknownFields());
        }
    }

    public SetClientStatusResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetClientStatusResponse$a */
    public static final class C15266a extends Message.Builder<SetClientStatusResponse, C15266a> {
        /* renamed from: a */
        public SetClientStatusResponse build() {
            return new SetClientStatusResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15266a newBuilder() {
        C15266a aVar = new C15266a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetClientStatusResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetClientStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetClientStatusResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
