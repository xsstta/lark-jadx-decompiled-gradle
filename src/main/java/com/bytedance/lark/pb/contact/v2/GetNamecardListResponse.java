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

public final class GetNamecardListResponse extends Message<GetNamecardListResponse, C16468a> {
    public static final ProtoAdapter<GetNamecardListResponse> ADAPTER = new C16469b();
    public static final Boolean DEFAULT_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<NamecardMetaInfo> list;
    public final Boolean more;
    public final String namecard_id;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardListResponse$b */
    private static final class C16469b extends ProtoAdapter<GetNamecardListResponse> {
        C16469b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNamecardListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNamecardListResponse getNamecardListResponse) {
            int i;
            int i2 = 0;
            if (getNamecardListResponse.more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getNamecardListResponse.more);
            } else {
                i = 0;
            }
            if (getNamecardListResponse.namecard_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getNamecardListResponse.namecard_id);
            }
            return i + i2 + NamecardMetaInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, getNamecardListResponse.list) + getNamecardListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNamecardListResponse decode(ProtoReader protoReader) throws IOException {
            C16468a aVar = new C16468a();
            aVar.f42771a = false;
            aVar.f42772b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42771a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42772b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42773c.add(NamecardMetaInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNamecardListResponse getNamecardListResponse) throws IOException {
            if (getNamecardListResponse.more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getNamecardListResponse.more);
            }
            if (getNamecardListResponse.namecard_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getNamecardListResponse.namecard_id);
            }
            NamecardMetaInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getNamecardListResponse.list);
            protoWriter.writeBytes(getNamecardListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetNamecardListResponse$a */
    public static final class C16468a extends Message.Builder<GetNamecardListResponse, C16468a> {

        /* renamed from: a */
        public Boolean f42771a;

        /* renamed from: b */
        public String f42772b;

        /* renamed from: c */
        public List<NamecardMetaInfo> f42773c = Internal.newMutableList();

        /* renamed from: a */
        public GetNamecardListResponse build() {
            return new GetNamecardListResponse(this.f42771a, this.f42772b, this.f42773c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16468a newBuilder() {
        C16468a aVar = new C16468a();
        aVar.f42771a = this.more;
        aVar.f42772b = this.namecard_id;
        aVar.f42773c = Internal.copyOf("list", this.list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetNamecardListResponse");
        StringBuilder sb = new StringBuilder();
        if (this.more != null) {
            sb.append(", more=");
            sb.append(this.more);
        }
        if (this.namecard_id != null) {
            sb.append(", namecard_id=");
            sb.append(this.namecard_id);
        }
        if (!this.list.isEmpty()) {
            sb.append(", list=");
            sb.append(this.list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNamecardListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNamecardListResponse(Boolean bool, String str, List<NamecardMetaInfo> list2) {
        this(bool, str, list2, ByteString.EMPTY);
    }

    public GetNamecardListResponse(Boolean bool, String str, List<NamecardMetaInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.more = bool;
        this.namecard_id = str;
        this.list = Internal.immutableCopyOf("list", list2);
    }
}
