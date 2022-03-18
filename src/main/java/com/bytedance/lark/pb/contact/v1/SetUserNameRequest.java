package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetUserNameRequest extends Message<SetUserNameRequest, C16400a> {
    public static final ProtoAdapter<SetUserNameRequest> ADAPTER = new C16401b();
    private static final long serialVersionUID = 0;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetUserNameRequest$b */
    private static final class C16401b extends ProtoAdapter<SetUserNameRequest> {
        C16401b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetUserNameRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetUserNameRequest setUserNameRequest) {
            int i;
            if (setUserNameRequest.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setUserNameRequest.name);
            } else {
                i = 0;
            }
            return i + setUserNameRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetUserNameRequest decode(ProtoReader protoReader) throws IOException {
            C16400a aVar = new C16400a();
            aVar.f42662a = "";
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
                    aVar.f42662a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetUserNameRequest setUserNameRequest) throws IOException {
            if (setUserNameRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setUserNameRequest.name);
            }
            protoWriter.writeBytes(setUserNameRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetUserNameRequest$a */
    public static final class C16400a extends Message.Builder<SetUserNameRequest, C16400a> {

        /* renamed from: a */
        public String f42662a;

        /* renamed from: a */
        public SetUserNameRequest build() {
            return new SetUserNameRequest(this.f42662a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16400a newBuilder() {
        C16400a aVar = new C16400a();
        aVar.f42662a = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetUserNameRequest");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "SetUserNameRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetUserNameRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetUserNameRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
    }
}
