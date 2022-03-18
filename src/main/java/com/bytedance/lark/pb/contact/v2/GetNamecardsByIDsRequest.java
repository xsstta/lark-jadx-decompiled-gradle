package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetNamecardsByIDsRequest extends Message<GetNamecardsByIDsRequest, C16480a> {
    public static final ProtoAdapter<GetNamecardsByIDsRequest> ADAPTER = new C16481b();
    private static final long serialVersionUID = 0;
    public final List<String> namecard_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardsByIDsRequest$b */
    private static final class C16481b extends ProtoAdapter<GetNamecardsByIDsRequest> {
        C16481b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNamecardsByIDsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNamecardsByIDsRequest getNamecardsByIDsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getNamecardsByIDsRequest.namecard_ids) + getNamecardsByIDsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNamecardsByIDsRequest decode(ProtoReader protoReader) throws IOException {
            C16480a aVar = new C16480a();
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
                    aVar.f42790a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNamecardsByIDsRequest getNamecardsByIDsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getNamecardsByIDsRequest.namecard_ids);
            protoWriter.writeBytes(getNamecardsByIDsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardsByIDsRequest$a */
    public static final class C16480a extends Message.Builder<GetNamecardsByIDsRequest, C16480a> {

        /* renamed from: a */
        public List<String> f42790a = Internal.newMutableList();

        /* renamed from: a */
        public GetNamecardsByIDsRequest build() {
            return new GetNamecardsByIDsRequest(this.f42790a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16480a mo58750a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42790a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16480a newBuilder() {
        C16480a aVar = new C16480a();
        aVar.f42790a = Internal.copyOf("namecard_ids", this.namecard_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetNamecardsByIDsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.namecard_ids.isEmpty()) {
            sb.append(", namecard_ids=");
            sb.append(this.namecard_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNamecardsByIDsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNamecardsByIDsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetNamecardsByIDsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecard_ids = Internal.immutableCopyOf("namecard_ids", list);
    }
}
