package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SetAdminInvitationRequest extends Message<SetAdminInvitationRequest, C16380a> {
    public static final ProtoAdapter<SetAdminInvitationRequest> ADAPTER = new C16381b();
    public static final InvitationPlatformType DEFAULT_INVITATION_PLATFORM = InvitationPlatformType.PlatformIPhone;
    public static final ContactPointType DEFAULT_TYPE = ContactPointType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<Long> departments;
    public final List<String> emails;
    public final InvitationPlatformType invitation_platform;
    public final List<String> mobiles;
    public final List<String> names;
    public final ContactPointType type;

    public enum ContactPointType implements WireEnum {
        UNKNOWN(0),
        MOBILE(1),
        EMAIL(2);
        
        public static final ProtoAdapter<ContactPointType> ADAPTER = ProtoAdapter.newEnumAdapter(ContactPointType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ContactPointType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MOBILE;
            }
            if (i != 2) {
                return null;
            }
            return EMAIL;
        }

        private ContactPointType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetAdminInvitationRequest$b */
    private static final class C16381b extends ProtoAdapter<SetAdminInvitationRequest> {
        C16381b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetAdminInvitationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetAdminInvitationRequest setAdminInvitationRequest) {
            return ContactPointType.ADAPTER.encodedSizeWithTag(3, setAdminInvitationRequest.type) + InvitationPlatformType.ADAPTER.encodedSizeWithTag(4, setAdminInvitationRequest.invitation_platform) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, setAdminInvitationRequest.mobiles) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, setAdminInvitationRequest.emails) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, setAdminInvitationRequest.names) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(8, setAdminInvitationRequest.departments) + setAdminInvitationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetAdminInvitationRequest decode(ProtoReader protoReader) throws IOException {
            C16380a aVar = new C16380a();
            aVar.f42638a = ContactPointType.UNKNOWN;
            aVar.f42639b = InvitationPlatformType.PlatformIPhone;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 3:
                            try {
                                aVar.f42638a = ContactPointType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f42639b = InvitationPlatformType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f42640c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            aVar.f42641d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f42642e.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            aVar.f42643f.add(ProtoAdapter.INT64.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SetAdminInvitationRequest setAdminInvitationRequest) throws IOException {
            ContactPointType.ADAPTER.encodeWithTag(protoWriter, 3, setAdminInvitationRequest.type);
            InvitationPlatformType.ADAPTER.encodeWithTag(protoWriter, 4, setAdminInvitationRequest.invitation_platform);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, setAdminInvitationRequest.mobiles);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, setAdminInvitationRequest.emails);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 7, setAdminInvitationRequest.names);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 8, setAdminInvitationRequest.departments);
            protoWriter.writeBytes(setAdminInvitationRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetAdminInvitationRequest$a */
    public static final class C16380a extends Message.Builder<SetAdminInvitationRequest, C16380a> {

        /* renamed from: a */
        public ContactPointType f42638a;

        /* renamed from: b */
        public InvitationPlatformType f42639b;

        /* renamed from: c */
        public List<String> f42640c = Internal.newMutableList();

        /* renamed from: d */
        public List<String> f42641d = Internal.newMutableList();

        /* renamed from: e */
        public List<String> f42642e = Internal.newMutableList();

        /* renamed from: f */
        public List<Long> f42643f = Internal.newMutableList();

        /* renamed from: a */
        public SetAdminInvitationRequest build() {
            InvitationPlatformType invitationPlatformType;
            ContactPointType contactPointType = this.f42638a;
            if (contactPointType != null && (invitationPlatformType = this.f42639b) != null) {
                return new SetAdminInvitationRequest(contactPointType, invitationPlatformType, this.f42640c, this.f42641d, this.f42642e, this.f42643f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(contactPointType, ShareHitPoint.f121869d, this.f42639b, "invitation_platform");
        }

        /* renamed from: a */
        public C16380a mo58501a(InvitationPlatformType invitationPlatformType) {
            this.f42639b = invitationPlatformType;
            return this;
        }

        /* renamed from: a */
        public C16380a mo58502a(ContactPointType contactPointType) {
            this.f42638a = contactPointType;
            return this;
        }

        /* renamed from: b */
        public C16380a mo58505b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42641d = list;
            return this;
        }

        /* renamed from: c */
        public C16380a mo58506c(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42642e = list;
            return this;
        }

        /* renamed from: a */
        public C16380a mo58503a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42640c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16380a newBuilder() {
        C16380a aVar = new C16380a();
        aVar.f42638a = this.type;
        aVar.f42639b = this.invitation_platform;
        aVar.f42640c = Internal.copyOf("mobiles", this.mobiles);
        aVar.f42641d = Internal.copyOf("emails", this.emails);
        aVar.f42642e = Internal.copyOf("names", this.names);
        aVar.f42643f = Internal.copyOf("departments", this.departments);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetAdminInvitationRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", invitation_platform=");
        sb.append(this.invitation_platform);
        if (!this.mobiles.isEmpty()) {
            sb.append(", mobiles=");
            sb.append(this.mobiles);
        }
        if (!this.emails.isEmpty()) {
            sb.append(", emails=");
            sb.append(this.emails);
        }
        if (!this.names.isEmpty()) {
            sb.append(", names=");
            sb.append(this.names);
        }
        if (!this.departments.isEmpty()) {
            sb.append(", departments=");
            sb.append(this.departments);
        }
        StringBuilder replace = sb.replace(0, 2, "SetAdminInvitationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetAdminInvitationRequest(ContactPointType contactPointType, InvitationPlatformType invitationPlatformType, List<String> list, List<String> list2, List<String> list3, List<Long> list4) {
        this(contactPointType, invitationPlatformType, list, list2, list3, list4, ByteString.EMPTY);
    }

    public SetAdminInvitationRequest(ContactPointType contactPointType, InvitationPlatformType invitationPlatformType, List<String> list, List<String> list2, List<String> list3, List<Long> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = contactPointType;
        this.invitation_platform = invitationPlatformType;
        this.mobiles = Internal.immutableCopyOf("mobiles", list);
        this.emails = Internal.immutableCopyOf("emails", list2);
        this.names = Internal.immutableCopyOf("names", list3);
        this.departments = Internal.immutableCopyOf("departments", list4);
    }
}
