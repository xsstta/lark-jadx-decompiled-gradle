package com.bytedance.lark.pb.contact.v1;

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

public final class SetAdminInvitationResponse extends Message<SetAdminInvitationResponse, C16382a> {
    public static final ProtoAdapter<SetAdminInvitationResponse> ADAPTER = new C16383b();
    public static final Boolean DEFAULT_NEED_APPROVAL = false;
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final Map<String, InviteInfo> email;
    public final Map<String, InviteInfo> mobile;
    public final Boolean need_approval;
    public final Boolean success;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetAdminInvitationResponse$b */
    private static final class C16383b extends ProtoAdapter<SetAdminInvitationResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, InviteInfo>> f42648a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, InviteInfo.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, InviteInfo>> f42649b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, InviteInfo.ADAPTER);

        C16383b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetAdminInvitationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SetAdminInvitationResponse setAdminInvitationResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, setAdminInvitationResponse.success) + this.f42648a.encodedSizeWithTag(2, setAdminInvitationResponse.mobile) + this.f42649b.encodedSizeWithTag(3, setAdminInvitationResponse.email);
            if (setAdminInvitationResponse.need_approval != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(4, setAdminInvitationResponse.need_approval);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setAdminInvitationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SetAdminInvitationResponse decode(ProtoReader protoReader) throws IOException {
            C16382a aVar = new C16382a();
            aVar.f42644a = false;
            aVar.f42647d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42644a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42645b.putAll(this.f42648a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f42646c.putAll(this.f42649b.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42647d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetAdminInvitationResponse setAdminInvitationResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setAdminInvitationResponse.success);
            this.f42648a.encodeWithTag(protoWriter, 2, setAdminInvitationResponse.mobile);
            this.f42649b.encodeWithTag(protoWriter, 3, setAdminInvitationResponse.email);
            if (setAdminInvitationResponse.need_approval != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, setAdminInvitationResponse.need_approval);
            }
            protoWriter.writeBytes(setAdminInvitationResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetAdminInvitationResponse$a */
    public static final class C16382a extends Message.Builder<SetAdminInvitationResponse, C16382a> {

        /* renamed from: a */
        public Boolean f42644a;

        /* renamed from: b */
        public Map<String, InviteInfo> f42645b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, InviteInfo> f42646c = Internal.newMutableMap();

        /* renamed from: d */
        public Boolean f42647d;

        /* renamed from: a */
        public SetAdminInvitationResponse build() {
            Boolean bool = this.f42644a;
            if (bool != null) {
                return new SetAdminInvitationResponse(bool, this.f42645b, this.f42646c, this.f42647d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "success");
        }
    }

    @Override // com.squareup.wire.Message
    public C16382a newBuilder() {
        C16382a aVar = new C16382a();
        aVar.f42644a = this.success;
        aVar.f42645b = Internal.copyOf("mobile", this.mobile);
        aVar.f42646c = Internal.copyOf("email", this.email);
        aVar.f42647d = this.need_approval;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetAdminInvitationResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", success=");
        sb.append(this.success);
        if (!this.mobile.isEmpty()) {
            sb.append(", mobile=");
            sb.append(this.mobile);
        }
        if (!this.email.isEmpty()) {
            sb.append(", email=");
            sb.append(this.email);
        }
        if (this.need_approval != null) {
            sb.append(", need_approval=");
            sb.append(this.need_approval);
        }
        StringBuilder replace = sb.replace(0, 2, "SetAdminInvitationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SetAdminInvitationResponse(Boolean bool, Map<String, InviteInfo> map, Map<String, InviteInfo> map2, Boolean bool2) {
        this(bool, map, map2, bool2, ByteString.EMPTY);
    }

    public SetAdminInvitationResponse(Boolean bool, Map<String, InviteInfo> map, Map<String, InviteInfo> map2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
        this.mobile = Internal.immutableCopyOf("mobile", map);
        this.email = Internal.immutableCopyOf("email", map2);
        this.need_approval = bool2;
    }
}
