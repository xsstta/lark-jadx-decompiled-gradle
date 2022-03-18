package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetUserNameResponse extends Message<SetUserNameResponse, C16402a> {
    public static final ProtoAdapter<SetUserNameResponse> ADAPTER = new C16403b();
    private static final long serialVersionUID = 0;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetUserNameResponse$b */
    private static final class C16403b extends ProtoAdapter<SetUserNameResponse> {
        C16403b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserNameResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserNameResponse setUserNameResponse) {
            int i;
            if (setUserNameResponse.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setUserNameResponse.name);
            } else {
                i = 0;
            }
            return i + setUserNameResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserNameResponse decode(ProtoReader protoReader) throws IOException {
            C16402a aVar = new C16402a();
            aVar.f42663a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42663a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetUserNameResponse setUserNameResponse) throws IOException {
            if (setUserNameResponse.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setUserNameResponse.name);
            }
            protoWriter.writeBytes(setUserNameResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetUserNameResponse$a */
    public static final class C16402a extends Message.Builder<SetUserNameResponse, C16402a> {

        /* renamed from: a */
        public String f42663a;

        /* renamed from: a */
        public SetUserNameResponse build() {
            return new SetUserNameResponse(this.f42663a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16402a newBuilder() {
        C16402a aVar = new C16402a();
        aVar.f42663a = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetUserNameResponse");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "SetUserNameResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserNameResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetUserNameResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
    }
}
