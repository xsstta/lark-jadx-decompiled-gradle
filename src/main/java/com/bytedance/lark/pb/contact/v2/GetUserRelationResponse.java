package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserRelationResponse extends Message<GetUserRelationResponse, C16536a> {
    public static final ProtoAdapter<GetUserRelationResponse> ADAPTER = new C16537b();
    public static final Boolean DEFAULT_BE_CTRL_ADD_CONTACT = false;
    public static final Boolean DEFAULT_HAS_APPLY = false;
    public static final Boolean DEFAULT_HAS_BE_APPLIED = false;
    public static final Boolean DEFAULT_HAS_BE_BLOCK = false;
    public static final Boolean DEFAULT_HAS_BLOCK = false;
    public static final Boolean DEFAULT_IN_COLLABORATION = false;
    public static final Boolean DEFAULT_IS_FRIEND = false;
    private static final long serialVersionUID = 0;
    public final String be_applied_reason;
    public final Boolean be_ctrl_add_contact;
    public final Boolean has_apply;
    public final Boolean has_be_applied;
    public final String has_be_applied_id;
    public final Boolean has_be_block;
    public final Boolean has_block;
    public final Boolean in_collaboration;
    public final Boolean is_friend;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserRelationResponse$b */
    private static final class C16537b extends ProtoAdapter<GetUserRelationResponse> {
        C16537b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserRelationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserRelationResponse getUserRelationResponse) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getUserRelationResponse.is_friend) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getUserRelationResponse.has_block) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getUserRelationResponse.has_apply) + ProtoAdapter.BOOL.encodedSizeWithTag(4, getUserRelationResponse.has_be_applied);
            int i4 = 0;
            if (getUserRelationResponse.has_be_applied_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, getUserRelationResponse.has_be_applied_id);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (getUserRelationResponse.be_applied_reason != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, getUserRelationResponse.be_applied_reason);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i5 + i2 + ProtoAdapter.BOOL.encodedSizeWithTag(7, getUserRelationResponse.has_be_block);
            if (getUserRelationResponse.be_ctrl_add_contact != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(8, getUserRelationResponse.be_ctrl_add_contact);
            } else {
                i3 = 0;
            }
            int i6 = encodedSizeWithTag2 + i3;
            if (getUserRelationResponse.in_collaboration != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(9, getUserRelationResponse.in_collaboration);
            }
            return i6 + i4 + getUserRelationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserRelationResponse decode(ProtoReader protoReader) throws IOException {
            C16536a aVar = new C16536a();
            aVar.f42891a = false;
            aVar.f42892b = false;
            aVar.f42893c = false;
            aVar.f42894d = false;
            aVar.f42895e = "";
            aVar.f42896f = "";
            aVar.f42897g = false;
            aVar.f42898h = false;
            aVar.f42899i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42891a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42892b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42893c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42894d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42895e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42896f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42897g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f42898h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f42899i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserRelationResponse getUserRelationResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getUserRelationResponse.is_friend);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUserRelationResponse.has_block);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getUserRelationResponse.has_apply);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getUserRelationResponse.has_be_applied);
            if (getUserRelationResponse.has_be_applied_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getUserRelationResponse.has_be_applied_id);
            }
            if (getUserRelationResponse.be_applied_reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getUserRelationResponse.be_applied_reason);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, getUserRelationResponse.has_be_block);
            if (getUserRelationResponse.be_ctrl_add_contact != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, getUserRelationResponse.be_ctrl_add_contact);
            }
            if (getUserRelationResponse.in_collaboration != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, getUserRelationResponse.in_collaboration);
            }
            protoWriter.writeBytes(getUserRelationResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16536a newBuilder() {
        C16536a aVar = new C16536a();
        aVar.f42891a = this.is_friend;
        aVar.f42892b = this.has_block;
        aVar.f42893c = this.has_apply;
        aVar.f42894d = this.has_be_applied;
        aVar.f42895e = this.has_be_applied_id;
        aVar.f42896f = this.be_applied_reason;
        aVar.f42897g = this.has_be_block;
        aVar.f42898h = this.be_ctrl_add_contact;
        aVar.f42899i = this.in_collaboration;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserRelationResponse$a */
    public static final class C16536a extends Message.Builder<GetUserRelationResponse, C16536a> {

        /* renamed from: a */
        public Boolean f42891a;

        /* renamed from: b */
        public Boolean f42892b;

        /* renamed from: c */
        public Boolean f42893c;

        /* renamed from: d */
        public Boolean f42894d;

        /* renamed from: e */
        public String f42895e;

        /* renamed from: f */
        public String f42896f;

        /* renamed from: g */
        public Boolean f42897g;

        /* renamed from: h */
        public Boolean f42898h;

        /* renamed from: i */
        public Boolean f42899i;

        /* renamed from: a */
        public GetUserRelationResponse build() {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5 = this.f42891a;
            if (bool5 != null && (bool = this.f42892b) != null && (bool2 = this.f42893c) != null && (bool3 = this.f42894d) != null && (bool4 = this.f42897g) != null) {
                return new GetUserRelationResponse(bool5, bool, bool2, bool3, this.f42895e, this.f42896f, bool4, this.f42898h, this.f42899i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool5, "is_friend", this.f42892b, "has_block", this.f42893c, "has_apply", this.f42894d, "has_be_applied", this.f42897g, "has_be_block");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserRelationResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_friend=");
        sb.append(this.is_friend);
        sb.append(", has_block=");
        sb.append(this.has_block);
        sb.append(", has_apply=");
        sb.append(this.has_apply);
        sb.append(", has_be_applied=");
        sb.append(this.has_be_applied);
        if (this.has_be_applied_id != null) {
            sb.append(", has_be_applied_id=");
            sb.append(this.has_be_applied_id);
        }
        if (this.be_applied_reason != null) {
            sb.append(", be_applied_reason=");
            sb.append(this.be_applied_reason);
        }
        sb.append(", has_be_block=");
        sb.append(this.has_be_block);
        if (this.be_ctrl_add_contact != null) {
            sb.append(", be_ctrl_add_contact=");
            sb.append(this.be_ctrl_add_contact);
        }
        if (this.in_collaboration != null) {
            sb.append(", in_collaboration=");
            sb.append(this.in_collaboration);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserRelationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserRelationResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, Boolean bool5, Boolean bool6, Boolean bool7) {
        this(bool, bool2, bool3, bool4, str, str2, bool5, bool6, bool7, ByteString.EMPTY);
    }

    public GetUserRelationResponse(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, Boolean bool5, Boolean bool6, Boolean bool7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_friend = bool;
        this.has_block = bool2;
        this.has_apply = bool3;
        this.has_be_applied = bool4;
        this.has_be_applied_id = str;
        this.be_applied_reason = str2;
        this.has_be_block = bool5;
        this.be_ctrl_add_contact = bool6;
        this.in_collaboration = bool7;
    }
}
