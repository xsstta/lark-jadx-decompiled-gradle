package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetNamecardListRequest extends Message<GetNamecardListRequest, C16466a> {
    public static final ProtoAdapter<GetNamecardListRequest> ADAPTER = new C16467b();
    public static final Integer DEFAULT_LIMIT = 0;
    private static final long serialVersionUID = 0;
    public final Integer limit;
    public final String namecard_id;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardListRequest$b */
    private static final class C16467b extends ProtoAdapter<GetNamecardListRequest> {
        C16467b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNamecardListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNamecardListRequest getNamecardListRequest) {
            int i;
            int i2 = 0;
            if (getNamecardListRequest.namecard_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getNamecardListRequest.namecard_id);
            } else {
                i = 0;
            }
            if (getNamecardListRequest.limit != null) {
                i2 = ProtoAdapter.UINT32.encodedSizeWithTag(2, getNamecardListRequest.limit);
            }
            return i + i2 + getNamecardListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNamecardListRequest decode(ProtoReader protoReader) throws IOException {
            C16466a aVar = new C16466a();
            aVar.f42769a = "";
            aVar.f42770b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42769a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42770b = ProtoAdapter.UINT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNamecardListRequest getNamecardListRequest) throws IOException {
            if (getNamecardListRequest.namecard_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getNamecardListRequest.namecard_id);
            }
            if (getNamecardListRequest.limit != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, getNamecardListRequest.limit);
            }
            protoWriter.writeBytes(getNamecardListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardListRequest$a */
    public static final class C16466a extends Message.Builder<GetNamecardListRequest, C16466a> {

        /* renamed from: a */
        public String f42769a;

        /* renamed from: b */
        public Integer f42770b;

        /* renamed from: a */
        public GetNamecardListRequest build() {
            return new GetNamecardListRequest(this.f42769a, this.f42770b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16466a mo58720a(Integer num) {
            this.f42770b = num;
            return this;
        }

        /* renamed from: a */
        public C16466a mo58721a(String str) {
            this.f42769a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16466a newBuilder() {
        C16466a aVar = new C16466a();
        aVar.f42769a = this.namecard_id;
        aVar.f42770b = this.limit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetNamecardListRequest");
        StringBuilder sb = new StringBuilder();
        if (this.namecard_id != null) {
            sb.append(", namecard_id=");
            sb.append(this.namecard_id);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNamecardListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNamecardListRequest(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public GetNamecardListRequest(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.namecard_id = str;
        this.limit = num;
    }
}
