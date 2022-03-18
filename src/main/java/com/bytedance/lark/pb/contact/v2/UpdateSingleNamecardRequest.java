package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateSingleNamecardRequest extends Message<UpdateSingleNamecardRequest, C16568a> {
    public static final ProtoAdapter<UpdateSingleNamecardRequest> ADAPTER = new C16569b();
    private static final long serialVersionUID = 0;
    public final NamecardMetaInfo namecard;

    /* renamed from: com.bytedance.lark.pb.contact.v2.UpdateSingleNamecardRequest$b */
    private static final class C16569b extends ProtoAdapter<UpdateSingleNamecardRequest> {
        C16569b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateSingleNamecardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateSingleNamecardRequest updateSingleNamecardRequest) {
            int i;
            if (updateSingleNamecardRequest.namecard != null) {
                i = NamecardMetaInfo.ADAPTER.encodedSizeWithTag(2, updateSingleNamecardRequest.namecard);
            } else {
                i = 0;
            }
            return i + updateSingleNamecardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateSingleNamecardRequest decode(ProtoReader protoReader) throws IOException {
            C16568a aVar = new C16568a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42938a = NamecardMetaInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateSingleNamecardRequest updateSingleNamecardRequest) throws IOException {
            if (updateSingleNamecardRequest.namecard != null) {
                NamecardMetaInfo.ADAPTER.encodeWithTag(protoWriter, 2, updateSingleNamecardRequest.namecard);
            }
            protoWriter.writeBytes(updateSingleNamecardRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.UpdateSingleNamecardRequest$a */
    public static final class C16568a extends Message.Builder<UpdateSingleNamecardRequest, C16568a> {

        /* renamed from: a */
        public NamecardMetaInfo f42938a;

        /* renamed from: a */
        public UpdateSingleNamecardRequest build() {
            return new UpdateSingleNamecardRequest(this.f42938a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16568a mo58970a(NamecardMetaInfo namecardMetaInfo) {
            this.f42938a = namecardMetaInfo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16568a newBuilder() {
        C16568a aVar = new C16568a();
        aVar.f42938a = this.namecard;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateSingleNamecardRequest");
        StringBuilder sb = new StringBuilder();
        if (this.namecard != null) {
            sb.append(", namecard=");
            sb.append(this.namecard);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateSingleNamecardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateSingleNamecardRequest(NamecardMetaInfo namecardMetaInfo) {
        this(namecardMetaInfo, ByteString.EMPTY);
    }

    public UpdateSingleNamecardRequest(NamecardMetaInfo namecardMetaInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecard = namecardMetaInfo;
    }
}
