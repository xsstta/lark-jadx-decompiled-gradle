package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class GetDepartmentInvitationUrlRequest extends Message<GetDepartmentInvitationUrlRequest, C16232a> {
    public static final ProtoAdapter<GetDepartmentInvitationUrlRequest> ADAPTER = new C16233b();
    public static final InvitationSource DEFAULT_SOURCE = InvitationSource.HOME_SCHOOL_CONTACT;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String department_id;
    public final String inviter_id;
    public final InvitationSource source;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest$b */
    private static final class C16233b extends ProtoAdapter<GetDepartmentInvitationUrlRequest> {
        C16233b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDepartmentInvitationUrlRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDepartmentInvitationUrlRequest getDepartmentInvitationUrlRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getDepartmentInvitationUrlRequest.department_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getDepartmentInvitationUrlRequest.department_id);
            } else {
                i = 0;
            }
            if (getDepartmentInvitationUrlRequest.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getDepartmentInvitationUrlRequest.chat_id);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + InvitationSource.ADAPTER.encodedSizeWithTag(3, getDepartmentInvitationUrlRequest.source);
            if (getDepartmentInvitationUrlRequest.inviter_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getDepartmentInvitationUrlRequest.inviter_id);
            }
            return encodedSizeWithTag + i3 + getDepartmentInvitationUrlRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDepartmentInvitationUrlRequest decode(ProtoReader protoReader) throws IOException {
            C16232a aVar = new C16232a();
            aVar.f42421a = "";
            aVar.f42422b = "";
            aVar.f42423c = InvitationSource.HOME_SCHOOL_CONTACT;
            aVar.f42424d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42421a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42422b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f42423c = InvitationSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42424d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDepartmentInvitationUrlRequest getDepartmentInvitationUrlRequest) throws IOException {
            if (getDepartmentInvitationUrlRequest.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getDepartmentInvitationUrlRequest.department_id);
            }
            if (getDepartmentInvitationUrlRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getDepartmentInvitationUrlRequest.chat_id);
            }
            InvitationSource.ADAPTER.encodeWithTag(protoWriter, 3, getDepartmentInvitationUrlRequest.source);
            if (getDepartmentInvitationUrlRequest.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getDepartmentInvitationUrlRequest.inviter_id);
            }
            protoWriter.writeBytes(getDepartmentInvitationUrlRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16232a newBuilder() {
        C16232a aVar = new C16232a();
        aVar.f42421a = this.department_id;
        aVar.f42422b = this.chat_id;
        aVar.f42423c = this.source;
        aVar.f42424d = this.inviter_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetDepartmentInvitationUrlRequest$a */
    public static final class C16232a extends Message.Builder<GetDepartmentInvitationUrlRequest, C16232a> {

        /* renamed from: a */
        public String f42421a;

        /* renamed from: b */
        public String f42422b;

        /* renamed from: c */
        public InvitationSource f42423c;

        /* renamed from: d */
        public String f42424d;

        /* renamed from: a */
        public GetDepartmentInvitationUrlRequest build() {
            InvitationSource invitationSource = this.f42423c;
            if (invitationSource != null) {
                return new GetDepartmentInvitationUrlRequest(this.f42421a, this.f42422b, invitationSource, this.f42424d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(invitationSource, ShareHitPoint.f121868c);
        }

        /* renamed from: a */
        public C16232a mo58164a(InvitationSource invitationSource) {
            this.f42423c = invitationSource;
            return this;
        }

        /* renamed from: b */
        public C16232a mo58167b(String str) {
            this.f42422b = str;
            return this;
        }

        /* renamed from: c */
        public C16232a mo58168c(String str) {
            this.f42424d = str;
            return this;
        }

        /* renamed from: a */
        public C16232a mo58165a(String str) {
            this.f42421a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetDepartmentInvitationUrlRequest");
        StringBuilder sb = new StringBuilder();
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        sb.append(", source=");
        sb.append(this.source);
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDepartmentInvitationUrlRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDepartmentInvitationUrlRequest(String str, String str2, InvitationSource invitationSource, String str3) {
        this(str, str2, invitationSource, str3, ByteString.EMPTY);
    }

    public GetDepartmentInvitationUrlRequest(String str, String str2, InvitationSource invitationSource, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_id = str;
        this.chat_id = str2;
        this.source = invitationSource;
        this.inviter_id = str3;
    }
}
