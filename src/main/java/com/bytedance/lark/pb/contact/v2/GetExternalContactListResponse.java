package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ContactInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetExternalContactListResponse extends Message<GetExternalContactListResponse, C16460a> {
    public static final ProtoAdapter<GetExternalContactListResponse> ADAPTER = new C16461b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<ContactInfo> contacts;
    public final Boolean has_more;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactListResponse$b */
    private static final class C16461b extends ProtoAdapter<GetExternalContactListResponse> {
        C16461b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExternalContactListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExternalContactListResponse getExternalContactListResponse) {
            return ContactInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getExternalContactListResponse.contacts) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getExternalContactListResponse.has_more) + getExternalContactListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetExternalContactListResponse decode(ProtoReader protoReader) throws IOException {
            C16460a aVar = new C16460a();
            aVar.f42764b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42763a.add(ContactInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42764b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExternalContactListResponse getExternalContactListResponse) throws IOException {
            ContactInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getExternalContactListResponse.contacts);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getExternalContactListResponse.has_more);
            protoWriter.writeBytes(getExternalContactListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactListResponse$a */
    public static final class C16460a extends Message.Builder<GetExternalContactListResponse, C16460a> {

        /* renamed from: a */
        public List<ContactInfo> f42763a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f42764b;

        /* renamed from: a */
        public GetExternalContactListResponse build() {
            Boolean bool = this.f42764b;
            if (bool != null) {
                return new GetExternalContactListResponse(this.f42763a, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more");
        }
    }

    @Override // com.squareup.wire.Message
    public C16460a newBuilder() {
        C16460a aVar = new C16460a();
        aVar.f42763a = Internal.copyOf("contacts", this.contacts);
        aVar.f42764b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetExternalContactListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.contacts.isEmpty()) {
            sb.append(", contacts=");
            sb.append(this.contacts);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        StringBuilder replace = sb.replace(0, 2, "GetExternalContactListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetExternalContactListResponse(List<ContactInfo> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetExternalContactListResponse(List<ContactInfo> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.contacts = Internal.immutableCopyOf("contacts", list);
        this.has_more = bool;
    }
}
