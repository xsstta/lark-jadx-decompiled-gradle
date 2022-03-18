package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetUserMedalResponse extends Message<SetUserMedalResponse, C50106a> {
    public static final ProtoAdapter<SetUserMedalResponse> ADAPTER = new C50107b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.ug.SetUserMedalResponse$b */
    private static final class C50107b extends ProtoAdapter<SetUserMedalResponse> {
        C50107b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserMedalResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserMedalResponse setUserMedalResponse) {
            return setUserMedalResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserMedalResponse decode(ProtoReader protoReader) throws IOException {
            C50106a aVar = new C50106a();
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
        public void encode(ProtoWriter protoWriter, SetUserMedalResponse setUserMedalResponse) throws IOException {
            protoWriter.writeBytes(setUserMedalResponse.unknownFields());
        }
    }

    public SetUserMedalResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.ug.SetUserMedalResponse$a */
    public static final class C50106a extends Message.Builder<SetUserMedalResponse, C50106a> {
        /* renamed from: a */
        public SetUserMedalResponse build() {
            return new SetUserMedalResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50106a newBuilder() {
        C50106a aVar = new C50106a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetUserMedalResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserMedalResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
