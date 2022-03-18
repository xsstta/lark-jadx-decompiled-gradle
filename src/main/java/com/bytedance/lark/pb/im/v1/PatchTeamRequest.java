package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AvatarMeta;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PatchTeamRequest extends Message<PatchTeamRequest, C17841a> {
    public static final ProtoAdapter<PatchTeamRequest> ADAPTER = new C17842b();
    public static final Boolean DEFAULT_IS_DISSOLVED = false;
    public static final Long DEFAULT_OWNER_ID = 0L;
    public static final Long DEFAULT_TEAM_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final AvatarMeta avatar_meta;
    public final String description;
    public final Boolean is_dissolved;
    public final String name;
    public final Long owner_id;
    public final Long team_id;
    public final List<UpdateField> update_fields;

    public enum UpdateField implements WireEnum {
        Unknown(0),
        Name(1),
        Owner(2),
        IsDissolved(3),
        Description(4),
        Avatar(5);
        
        public static final ProtoAdapter<UpdateField> ADAPTER = ProtoAdapter.newEnumAdapter(UpdateField.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UpdateField fromValue(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i == 1) {
                return Name;
            }
            if (i == 2) {
                return Owner;
            }
            if (i == 3) {
                return IsDissolved;
            }
            if (i == 4) {
                return Description;
            }
            if (i != 5) {
                return null;
            }
            return Avatar;
        }

        private UpdateField(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamRequest$b */
    private static final class C17842b extends ProtoAdapter<PatchTeamRequest> {
        C17842b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchTeamRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchTeamRequest patchTeamRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, patchTeamRequest.team_id) + UpdateField.ADAPTER.asRepeated().encodedSizeWithTag(2, patchTeamRequest.update_fields);
            int i6 = 0;
            if (patchTeamRequest.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, patchTeamRequest.name);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (patchTeamRequest.owner_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, patchTeamRequest.owner_id);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (patchTeamRequest.is_dissolved != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, patchTeamRequest.is_dissolved);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (patchTeamRequest.description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, patchTeamRequest.description);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (patchTeamRequest.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, patchTeamRequest.avatar_key);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (patchTeamRequest.avatar_meta != null) {
                i6 = AvatarMeta.ADAPTER.encodedSizeWithTag(8, patchTeamRequest.avatar_meta);
            }
            return i11 + i6 + patchTeamRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchTeamRequest decode(ProtoReader protoReader) throws IOException {
            C17841a aVar = new C17841a();
            aVar.f44900a = 0L;
            aVar.f44902c = "";
            aVar.f44903d = 0L;
            aVar.f44904e = false;
            aVar.f44905f = "";
            aVar.f44906g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44900a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f44901b.add(UpdateField.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44902c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44903d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44904e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44905f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44906g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44907h = AvatarMeta.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PatchTeamRequest patchTeamRequest) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, patchTeamRequest.team_id);
            UpdateField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, patchTeamRequest.update_fields);
            if (patchTeamRequest.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, patchTeamRequest.name);
            }
            if (patchTeamRequest.owner_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, patchTeamRequest.owner_id);
            }
            if (patchTeamRequest.is_dissolved != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, patchTeamRequest.is_dissolved);
            }
            if (patchTeamRequest.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, patchTeamRequest.description);
            }
            if (patchTeamRequest.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, patchTeamRequest.avatar_key);
            }
            if (patchTeamRequest.avatar_meta != null) {
                AvatarMeta.ADAPTER.encodeWithTag(protoWriter, 8, patchTeamRequest.avatar_meta);
            }
            protoWriter.writeBytes(patchTeamRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17841a newBuilder() {
        C17841a aVar = new C17841a();
        aVar.f44900a = this.team_id;
        aVar.f44901b = Internal.copyOf("update_fields", this.update_fields);
        aVar.f44902c = this.name;
        aVar.f44903d = this.owner_id;
        aVar.f44904e = this.is_dissolved;
        aVar.f44905f = this.description;
        aVar.f44906g = this.avatar_key;
        aVar.f44907h = this.avatar_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchTeamRequest$a */
    public static final class C17841a extends Message.Builder<PatchTeamRequest, C17841a> {

        /* renamed from: a */
        public Long f44900a;

        /* renamed from: b */
        public List<UpdateField> f44901b = Internal.newMutableList();

        /* renamed from: c */
        public String f44902c;

        /* renamed from: d */
        public Long f44903d;

        /* renamed from: e */
        public Boolean f44904e;

        /* renamed from: f */
        public String f44905f;

        /* renamed from: g */
        public String f44906g;

        /* renamed from: h */
        public AvatarMeta f44907h;

        /* renamed from: a */
        public PatchTeamRequest build() {
            Long l = this.f44900a;
            if (l != null) {
                return new PatchTeamRequest(l, this.f44901b, this.f44902c, this.f44903d, this.f44904e, this.f44905f, this.f44906g, this.f44907h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "team_id");
        }

        /* renamed from: a */
        public C17841a mo62175a(AvatarMeta avatarMeta) {
            this.f44907h = avatarMeta;
            return this;
        }

        /* renamed from: b */
        public C17841a mo62181b(Long l) {
            this.f44903d = l;
            return this;
        }

        /* renamed from: c */
        public C17841a mo62183c(String str) {
            this.f44906g = str;
            return this;
        }

        /* renamed from: a */
        public C17841a mo62176a(Boolean bool) {
            this.f44904e = bool;
            return this;
        }

        /* renamed from: b */
        public C17841a mo62182b(String str) {
            this.f44905f = str;
            return this;
        }

        /* renamed from: a */
        public C17841a mo62177a(Long l) {
            this.f44900a = l;
            return this;
        }

        /* renamed from: a */
        public C17841a mo62178a(String str) {
            this.f44902c = str;
            return this;
        }

        /* renamed from: a */
        public C17841a mo62179a(List<UpdateField> list) {
            Internal.checkElementsNotNull(list);
            this.f44901b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchTeamRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", team_id=");
        sb.append(this.team_id);
        if (!this.update_fields.isEmpty()) {
            sb.append(", update_fields=");
            sb.append(this.update_fields);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.owner_id != null) {
            sb.append(", owner_id=");
            sb.append(this.owner_id);
        }
        if (this.is_dissolved != null) {
            sb.append(", is_dissolved=");
            sb.append(this.is_dissolved);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_meta != null) {
            sb.append(", avatar_meta=");
            sb.append(this.avatar_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchTeamRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchTeamRequest(Long l, List<UpdateField> list, String str, Long l2, Boolean bool, String str2, String str3, AvatarMeta avatarMeta) {
        this(l, list, str, l2, bool, str2, str3, avatarMeta, ByteString.EMPTY);
    }

    public PatchTeamRequest(Long l, List<UpdateField> list, String str, Long l2, Boolean bool, String str2, String str3, AvatarMeta avatarMeta, ByteString byteString) {
        super(ADAPTER, byteString);
        this.team_id = l;
        this.update_fields = Internal.immutableCopyOf("update_fields", list);
        this.name = str;
        this.owner_id = l2;
        this.is_dissolved = bool;
        this.description = str2;
        this.avatar_key = str3;
        this.avatar_meta = avatarMeta;
    }
}
