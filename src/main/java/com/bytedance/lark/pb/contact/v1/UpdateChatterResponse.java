package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateChatterResponse extends Message<UpdateChatterResponse, C16408a> {
    public static final ProtoAdapter<UpdateChatterResponse> ADAPTER = new C16409b();
    private static final long serialVersionUID = 0;
    public final String message;

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateChatterResponse$b */
    private static final class C16409b extends ProtoAdapter<UpdateChatterResponse> {
        C16409b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatterResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatterResponse updateChatterResponse) {
            int i;
            if (updateChatterResponse.message != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateChatterResponse.message);
            } else {
                i = 0;
            }
            return i + updateChatterResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatterResponse decode(ProtoReader protoReader) throws IOException {
            C16408a aVar = new C16408a();
            aVar.f42679a = "";
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
                    aVar.f42679a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatterResponse updateChatterResponse) throws IOException {
            if (updateChatterResponse.message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateChatterResponse.message);
            }
            protoWriter.writeBytes(updateChatterResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateChatterResponse$a */
    public static final class C16408a extends Message.Builder<UpdateChatterResponse, C16408a> {

        /* renamed from: a */
        public String f42679a;

        /* renamed from: a */
        public UpdateChatterResponse build() {
            return new UpdateChatterResponse(this.f42679a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16408a newBuilder() {
        C16408a aVar = new C16408a();
        aVar.f42679a = this.message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateChatterResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateChatterResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatterResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpdateChatterResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = str;
    }
}
