package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ContactInfo;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetExternContactsCombineAuthInfoResponse extends Message<GetExternContactsCombineAuthInfoResponse, C16456a> {
    public static final ProtoAdapter<GetExternContactsCombineAuthInfoResponse> ADAPTER = new C16457b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<ContactInfo> contacts;
    public final C14928Entity entity;
    public final Boolean has_more;
    public final Map<String, DeniedReason> id2denied_reason;
    public final List<String> in_chat_chatter_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternContactsCombineAuthInfoResponse$b */
    private static final class C16457b extends ProtoAdapter<GetExternContactsCombineAuthInfoResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, DeniedReason>> f42759a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, DeniedReason.ADAPTER);

        C16457b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExternContactsCombineAuthInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExternContactsCombineAuthInfoResponse getExternContactsCombineAuthInfoResponse) {
            int i;
            if (getExternContactsCombineAuthInfoResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getExternContactsCombineAuthInfoResponse.entity);
            } else {
                i = 0;
            }
            return i + ContactInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, getExternContactsCombineAuthInfoResponse.contacts) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getExternContactsCombineAuthInfoResponse.has_more) + this.f42759a.encodedSizeWithTag(4, getExternContactsCombineAuthInfoResponse.id2denied_reason) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, getExternContactsCombineAuthInfoResponse.in_chat_chatter_ids) + getExternContactsCombineAuthInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetExternContactsCombineAuthInfoResponse decode(ProtoReader protoReader) throws IOException {
            C16456a aVar = new C16456a();
            aVar.f42756c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42754a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42755b.add(ContactInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f42756c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42757d.putAll(this.f42759a.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42758e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExternContactsCombineAuthInfoResponse getExternContactsCombineAuthInfoResponse) throws IOException {
            if (getExternContactsCombineAuthInfoResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getExternContactsCombineAuthInfoResponse.entity);
            }
            ContactInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getExternContactsCombineAuthInfoResponse.contacts);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getExternContactsCombineAuthInfoResponse.has_more);
            this.f42759a.encodeWithTag(protoWriter, 4, getExternContactsCombineAuthInfoResponse.id2denied_reason);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, getExternContactsCombineAuthInfoResponse.in_chat_chatter_ids);
            protoWriter.writeBytes(getExternContactsCombineAuthInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternContactsCombineAuthInfoResponse$a */
    public static final class C16456a extends Message.Builder<GetExternContactsCombineAuthInfoResponse, C16456a> {

        /* renamed from: a */
        public C14928Entity f42754a;

        /* renamed from: b */
        public List<ContactInfo> f42755b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f42756c;

        /* renamed from: d */
        public Map<String, DeniedReason> f42757d = Internal.newMutableMap();

        /* renamed from: e */
        public List<String> f42758e = Internal.newMutableList();

        /* renamed from: a */
        public GetExternContactsCombineAuthInfoResponse build() {
            Boolean bool = this.f42756c;
            if (bool != null) {
                return new GetExternContactsCombineAuthInfoResponse(this.f42754a, this.f42755b, bool, this.f42757d, this.f42758e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more");
        }
    }

    @Override // com.squareup.wire.Message
    public C16456a newBuilder() {
        C16456a aVar = new C16456a();
        aVar.f42754a = this.entity;
        aVar.f42755b = Internal.copyOf("contacts", this.contacts);
        aVar.f42756c = this.has_more;
        aVar.f42757d = Internal.copyOf("id2denied_reason", this.id2denied_reason);
        aVar.f42758e = Internal.copyOf("in_chat_chatter_ids", this.in_chat_chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetExternContactsCombineAuthInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.contacts.isEmpty()) {
            sb.append(", contacts=");
            sb.append(this.contacts);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        if (!this.id2denied_reason.isEmpty()) {
            sb.append(", id2denied_reason=");
            sb.append(this.id2denied_reason);
        }
        if (!this.in_chat_chatter_ids.isEmpty()) {
            sb.append(", in_chat_chatter_ids=");
            sb.append(this.in_chat_chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetExternContactsCombineAuthInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetExternContactsCombineAuthInfoResponse(C14928Entity entity2, List<ContactInfo> list, Boolean bool, Map<String, DeniedReason> map, List<String> list2) {
        this(entity2, list, bool, map, list2, ByteString.EMPTY);
    }

    public GetExternContactsCombineAuthInfoResponse(C14928Entity entity2, List<ContactInfo> list, Boolean bool, Map<String, DeniedReason> map, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.contacts = Internal.immutableCopyOf("contacts", list);
        this.has_more = bool;
        this.id2denied_reason = Internal.immutableCopyOf("id2denied_reason", map);
        this.in_chat_chatter_ids = Internal.immutableCopyOf("in_chat_chatter_ids", list2);
    }
}
