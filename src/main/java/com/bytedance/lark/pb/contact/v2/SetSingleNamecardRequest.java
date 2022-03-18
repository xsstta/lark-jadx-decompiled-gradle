package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetSingleNamecardRequest extends Message<SetSingleNamecardRequest, C16558a> {
    public static final ProtoAdapter<SetSingleNamecardRequest> ADAPTER = new C16559b();
    private static final long serialVersionUID = 0;
    public final NamecardMetaInfo namecard_info;

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetSingleNamecardRequest$b */
    private static final class C16559b extends ProtoAdapter<SetSingleNamecardRequest> {
        C16559b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSingleNamecardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSingleNamecardRequest setSingleNamecardRequest) {
            int i;
            if (setSingleNamecardRequest.namecard_info != null) {
                i = NamecardMetaInfo.ADAPTER.encodedSizeWithTag(1, setSingleNamecardRequest.namecard_info);
            } else {
                i = 0;
            }
            return i + setSingleNamecardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetSingleNamecardRequest decode(ProtoReader protoReader) throws IOException {
            C16558a aVar = new C16558a();
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
                    aVar.f42927a = NamecardMetaInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetSingleNamecardRequest setSingleNamecardRequest) throws IOException {
            if (setSingleNamecardRequest.namecard_info != null) {
                NamecardMetaInfo.ADAPTER.encodeWithTag(protoWriter, 1, setSingleNamecardRequest.namecard_info);
            }
            protoWriter.writeBytes(setSingleNamecardRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetSingleNamecardRequest$a */
    public static final class C16558a extends Message.Builder<SetSingleNamecardRequest, C16558a> {

        /* renamed from: a */
        public NamecardMetaInfo f42927a;

        /* renamed from: a */
        public SetSingleNamecardRequest build() {
            return new SetSingleNamecardRequest(this.f42927a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16558a mo58940a(NamecardMetaInfo namecardMetaInfo) {
            this.f42927a = namecardMetaInfo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16558a newBuilder() {
        C16558a aVar = new C16558a();
        aVar.f42927a = this.namecard_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetSingleNamecardRequest");
        StringBuilder sb = new StringBuilder();
        if (this.namecard_info != null) {
            sb.append(", namecard_info=");
            sb.append(this.namecard_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SetSingleNamecardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetSingleNamecardRequest(NamecardMetaInfo namecardMetaInfo) {
        this(namecardMetaInfo, ByteString.EMPTY);
    }

    public SetSingleNamecardRequest(NamecardMetaInfo namecardMetaInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecard_info = namecardMetaInfo;
    }
}
