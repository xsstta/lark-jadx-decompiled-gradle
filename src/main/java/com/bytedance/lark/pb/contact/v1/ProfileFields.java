package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ProfileFields extends Message<ProfileFields, C16340a> {
    public static final ProtoAdapter<ProfileFields> ADAPTER = new C16341b();
    private static final long serialVersionUID = 0;
    public final List<GetUserProfileResponse.Field> profile_fields;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ProfileFields$b */
    private static final class C16341b extends ProtoAdapter<ProfileFields> {
        C16341b() {
            super(FieldEncoding.LENGTH_DELIMITED, ProfileFields.class);
        }

        /* renamed from: a */
        public int encodedSize(ProfileFields profileFields) {
            return GetUserProfileResponse.Field.ADAPTER.asRepeated().encodedSizeWithTag(1, profileFields.profile_fields) + profileFields.unknownFields().size();
        }

        /* renamed from: a */
        public ProfileFields decode(ProtoReader protoReader) throws IOException {
            C16340a aVar = new C16340a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42584a.add(GetUserProfileResponse.Field.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ProfileFields profileFields) throws IOException {
            GetUserProfileResponse.Field.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, profileFields.profile_fields);
            protoWriter.writeBytes(profileFields.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ProfileFields$a */
    public static final class C16340a extends Message.Builder<ProfileFields, C16340a> {

        /* renamed from: a */
        public List<GetUserProfileResponse.Field> f42584a = Internal.newMutableList();

        /* renamed from: a */
        public ProfileFields build() {
            return new ProfileFields(this.f42584a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16340a newBuilder() {
        C16340a aVar = new C16340a();
        aVar.f42584a = Internal.copyOf("profile_fields", this.profile_fields);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ProfileFields");
        StringBuilder sb = new StringBuilder();
        if (!this.profile_fields.isEmpty()) {
            sb.append(", profile_fields=");
            sb.append(this.profile_fields);
        }
        StringBuilder replace = sb.replace(0, 2, "ProfileFields{");
        replace.append('}');
        return replace.toString();
    }

    public ProfileFields(List<GetUserProfileResponse.Field> list) {
        this(list, ByteString.EMPTY);
    }

    public ProfileFields(List<GetUserProfileResponse.Field> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.profile_fields = Internal.immutableCopyOf("profile_fields", list);
    }
}
