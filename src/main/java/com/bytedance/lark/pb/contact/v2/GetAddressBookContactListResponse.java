package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetAddressBookContactListResponse extends Message<GetAddressBookContactListResponse, C16434a> {
    public static final ProtoAdapter<GetAddressBookContactListResponse> ADAPTER = new C16435b();
    public static final Long DEFAULT_NEW_TIMELINE_MARK = 0L;
    private static final long serialVersionUID = 0;
    public final Map<String, ContactPointUserList> cp_user_infos;
    public final Long new_timeline_mark;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAddressBookContactListResponse$a */
    public static final class C16434a extends Message.Builder<GetAddressBookContactListResponse, C16434a> {

        /* renamed from: a */
        public Long f42733a;

        /* renamed from: b */
        public Map<String, ContactPointUserList> f42734b = Internal.newMutableMap();

        /* renamed from: a */
        public GetAddressBookContactListResponse build() {
            Long l = this.f42733a;
            if (l != null) {
                return new GetAddressBookContactListResponse(l, this.f42734b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "new_timeline_mark");
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAddressBookContactListResponse$b */
    private static final class C16435b extends ProtoAdapter<GetAddressBookContactListResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ContactPointUserList>> f42735a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ContactPointUserList.ADAPTER);

        C16435b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAddressBookContactListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAddressBookContactListResponse getAddressBookContactListResponse) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getAddressBookContactListResponse.new_timeline_mark) + this.f42735a.encodedSizeWithTag(2, getAddressBookContactListResponse.cp_user_infos) + getAddressBookContactListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAddressBookContactListResponse decode(ProtoReader protoReader) throws IOException {
            C16434a aVar = new C16434a();
            aVar.f42733a = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42733a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42734b.putAll(this.f42735a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAddressBookContactListResponse getAddressBookContactListResponse) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getAddressBookContactListResponse.new_timeline_mark);
            this.f42735a.encodeWithTag(protoWriter, 2, getAddressBookContactListResponse.cp_user_infos);
            protoWriter.writeBytes(getAddressBookContactListResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16434a newBuilder() {
        C16434a aVar = new C16434a();
        aVar.f42733a = this.new_timeline_mark;
        aVar.f42734b = Internal.copyOf("cp_user_infos", this.cp_user_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetAddressBookContactListResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", new_timeline_mark=");
        sb.append(this.new_timeline_mark);
        if (!this.cp_user_infos.isEmpty()) {
            sb.append(", cp_user_infos=");
            sb.append(this.cp_user_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAddressBookContactListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAddressBookContactListResponse(Long l, Map<String, ContactPointUserList> map) {
        this(l, map, ByteString.EMPTY);
    }

    public GetAddressBookContactListResponse(Long l, Map<String, ContactPointUserList> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.new_timeline_mark = l;
        this.cp_user_infos = Internal.immutableCopyOf("cp_user_infos", map);
    }
}
