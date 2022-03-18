package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetRlimitResponse extends Message<SetRlimitResponse, C15280a> {
    public static final ProtoAdapter<SetRlimitResponse> ADAPTER = new C15281b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetRlimitResponse$b */
    private static final class C15281b extends ProtoAdapter<SetRlimitResponse> {
        C15281b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetRlimitResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetRlimitResponse setRlimitResponse) {
            return setRlimitResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetRlimitResponse decode(ProtoReader protoReader) throws IOException {
            C15280a aVar = new C15280a();
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
        public void encode(ProtoWriter protoWriter, SetRlimitResponse setRlimitResponse) throws IOException {
            protoWriter.writeBytes(setRlimitResponse.unknownFields());
        }
    }

    public SetRlimitResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetRlimitResponse$a */
    public static final class C15280a extends Message.Builder<SetRlimitResponse, C15280a> {
        /* renamed from: a */
        public SetRlimitResponse build() {
            return new SetRlimitResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15280a newBuilder() {
        C15280a aVar = new C15280a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetRlimitResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetRlimitResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetRlimitResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
