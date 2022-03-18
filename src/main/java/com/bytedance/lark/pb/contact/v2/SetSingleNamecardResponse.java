package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetSingleNamecardResponse extends Message<SetSingleNamecardResponse, C16560a> {
    public static final ProtoAdapter<SetSingleNamecardResponse> ADAPTER = new C16561b();
    private static final long serialVersionUID = 0;
    public final String namecard_id;

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetSingleNamecardResponse$b */
    private static final class C16561b extends ProtoAdapter<SetSingleNamecardResponse> {
        C16561b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSingleNamecardResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSingleNamecardResponse setSingleNamecardResponse) {
            int i;
            if (setSingleNamecardResponse.namecard_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setSingleNamecardResponse.namecard_id);
            } else {
                i = 0;
            }
            return i + setSingleNamecardResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetSingleNamecardResponse decode(ProtoReader protoReader) throws IOException {
            C16560a aVar = new C16560a();
            aVar.f42928a = "";
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
                    aVar.f42928a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetSingleNamecardResponse setSingleNamecardResponse) throws IOException {
            if (setSingleNamecardResponse.namecard_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setSingleNamecardResponse.namecard_id);
            }
            protoWriter.writeBytes(setSingleNamecardResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetSingleNamecardResponse$a */
    public static final class C16560a extends Message.Builder<SetSingleNamecardResponse, C16560a> {

        /* renamed from: a */
        public String f42928a;

        /* renamed from: a */
        public SetSingleNamecardResponse build() {
            return new SetSingleNamecardResponse(this.f42928a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16560a newBuilder() {
        C16560a aVar = new C16560a();
        aVar.f42928a = this.namecard_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetSingleNamecardResponse");
        StringBuilder sb = new StringBuilder();
        if (this.namecard_id != null) {
            sb.append(", namecard_id=");
            sb.append(this.namecard_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SetSingleNamecardResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetSingleNamecardResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetSingleNamecardResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecard_id = str;
    }
}
