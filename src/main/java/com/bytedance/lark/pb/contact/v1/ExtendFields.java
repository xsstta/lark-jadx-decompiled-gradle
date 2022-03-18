package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChattersAuthResult;
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

public final class ExtendFields extends Message<ExtendFields, C16170a> {
    public static final ProtoAdapter<ExtendFields> ADAPTER = new C16171b();
    private static final long serialVersionUID = 0;
    public final ChattersAuthResult auth_result;
    public final List<String> chatters_deny_invite_same_chat;
    public final Map<String, Boolean> dep_has_lead_perm;
    public final Map<String, String> enterprise_emails;
    public final List<String> in_chat_chatter_ids;
    public final Map<String, ProfileFields> user_profile_fields;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ExtendFields$a */
    public static final class C16170a extends Message.Builder<ExtendFields, C16170a> {

        /* renamed from: a */
        public List<String> f42294a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f42295b = Internal.newMutableList();

        /* renamed from: c */
        public ChattersAuthResult f42296c;

        /* renamed from: d */
        public Map<String, Boolean> f42297d = Internal.newMutableMap();

        /* renamed from: e */
        public Map<String, ProfileFields> f42298e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, String> f42299f = Internal.newMutableMap();

        /* renamed from: a */
        public ExtendFields build() {
            return new ExtendFields(this.f42294a, this.f42295b, this.f42296c, this.f42297d, this.f42298e, this.f42299f, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ExtendFields$b */
    private static final class C16171b extends ProtoAdapter<ExtendFields> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f42300a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, ProfileFields>> f42301b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProfileFields.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, String>> f42302c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C16171b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtendFields.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtendFields extendFields) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, extendFields.in_chat_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, extendFields.chatters_deny_invite_same_chat);
            if (extendFields.auth_result != null) {
                i = ChattersAuthResult.ADAPTER.encodedSizeWithTag(4, extendFields.auth_result);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f42300a.encodedSizeWithTag(5, extendFields.dep_has_lead_perm) + this.f42301b.encodedSizeWithTag(6, extendFields.user_profile_fields) + this.f42302c.encodedSizeWithTag(7, extendFields.enterprise_emails) + extendFields.unknownFields().size();
        }

        /* renamed from: a */
        public ExtendFields decode(ProtoReader protoReader) throws IOException {
            C16170a aVar = new C16170a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42294a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42295b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f42296c = ChattersAuthResult.ADAPTER.decode(protoReader);
                } else if (nextTag == 5) {
                    aVar.f42297d.putAll(this.f42300a.decode(protoReader));
                } else if (nextTag == 6) {
                    aVar.f42298e.putAll(this.f42301b.decode(protoReader));
                } else if (nextTag != 7) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42299f.putAll(this.f42302c.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtendFields extendFields) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, extendFields.in_chat_chatter_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, extendFields.chatters_deny_invite_same_chat);
            if (extendFields.auth_result != null) {
                ChattersAuthResult.ADAPTER.encodeWithTag(protoWriter, 4, extendFields.auth_result);
            }
            this.f42300a.encodeWithTag(protoWriter, 5, extendFields.dep_has_lead_perm);
            this.f42301b.encodeWithTag(protoWriter, 6, extendFields.user_profile_fields);
            this.f42302c.encodeWithTag(protoWriter, 7, extendFields.enterprise_emails);
            protoWriter.writeBytes(extendFields.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16170a newBuilder() {
        C16170a aVar = new C16170a();
        aVar.f42294a = Internal.copyOf("in_chat_chatter_ids", this.in_chat_chatter_ids);
        aVar.f42295b = Internal.copyOf("chatters_deny_invite_same_chat", this.chatters_deny_invite_same_chat);
        aVar.f42296c = this.auth_result;
        aVar.f42297d = Internal.copyOf("dep_has_lead_perm", this.dep_has_lead_perm);
        aVar.f42298e = Internal.copyOf("user_profile_fields", this.user_profile_fields);
        aVar.f42299f = Internal.copyOf("enterprise_emails", this.enterprise_emails);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ExtendFields");
        StringBuilder sb = new StringBuilder();
        if (!this.in_chat_chatter_ids.isEmpty()) {
            sb.append(", in_chat_chatter_ids=");
            sb.append(this.in_chat_chatter_ids);
        }
        if (!this.chatters_deny_invite_same_chat.isEmpty()) {
            sb.append(", chatters_deny_invite_same_chat=");
            sb.append(this.chatters_deny_invite_same_chat);
        }
        if (this.auth_result != null) {
            sb.append(", auth_result=");
            sb.append(this.auth_result);
        }
        if (!this.dep_has_lead_perm.isEmpty()) {
            sb.append(", dep_has_lead_perm=");
            sb.append(this.dep_has_lead_perm);
        }
        if (!this.user_profile_fields.isEmpty()) {
            sb.append(", user_profile_fields=");
            sb.append(this.user_profile_fields);
        }
        if (!this.enterprise_emails.isEmpty()) {
            sb.append(", enterprise_emails=");
            sb.append(this.enterprise_emails);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtendFields{");
        replace.append('}');
        return replace.toString();
    }

    public ExtendFields(List<String> list, List<String> list2, ChattersAuthResult chattersAuthResult, Map<String, Boolean> map, Map<String, ProfileFields> map2, Map<String, String> map3) {
        this(list, list2, chattersAuthResult, map, map2, map3, ByteString.EMPTY);
    }

    public ExtendFields(List<String> list, List<String> list2, ChattersAuthResult chattersAuthResult, Map<String, Boolean> map, Map<String, ProfileFields> map2, Map<String, String> map3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.in_chat_chatter_ids = Internal.immutableCopyOf("in_chat_chatter_ids", list);
        this.chatters_deny_invite_same_chat = Internal.immutableCopyOf("chatters_deny_invite_same_chat", list2);
        this.auth_result = chattersAuthResult;
        this.dep_has_lead_perm = Internal.immutableCopyOf("dep_has_lead_perm", map);
        this.user_profile_fields = Internal.immutableCopyOf("user_profile_fields", map2);
        this.enterprise_emails = Internal.immutableCopyOf("enterprise_emails", map3);
    }
}
