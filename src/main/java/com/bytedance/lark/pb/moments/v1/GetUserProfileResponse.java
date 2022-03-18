package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUserProfileResponse extends Message<GetUserProfileResponse, C18402a> {
    public static final ProtoAdapter<GetUserProfileResponse> ADAPTER = new C18403b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final List<FollowingUser> following_users;
    public final UserProfile profile;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserProfileResponse$b */
    private static final class C18403b extends ProtoAdapter<GetUserProfileResponse> {
        C18403b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserProfileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserProfileResponse getUserProfileResponse) {
            int i;
            int i2 = 0;
            if (getUserProfileResponse.profile != null) {
                i = UserProfile.ADAPTER.encodedSizeWithTag(1, getUserProfileResponse.profile);
            } else {
                i = 0;
            }
            if (getUserProfileResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, getUserProfileResponse.entities);
            }
            return i + i2 + FollowingUser.ADAPTER.asRepeated().encodedSizeWithTag(3, getUserProfileResponse.following_users) + getUserProfileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserProfileResponse decode(ProtoReader protoReader) throws IOException {
            C18402a aVar = new C18402a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45783a = UserProfile.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45784b = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45785c.add(FollowingUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserProfileResponse getUserProfileResponse) throws IOException {
            if (getUserProfileResponse.profile != null) {
                UserProfile.ADAPTER.encodeWithTag(protoWriter, 1, getUserProfileResponse.profile);
            }
            if (getUserProfileResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, getUserProfileResponse.entities);
            }
            FollowingUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getUserProfileResponse.following_users);
            protoWriter.writeBytes(getUserProfileResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserProfileResponse$a */
    public static final class C18402a extends Message.Builder<GetUserProfileResponse, C18402a> {

        /* renamed from: a */
        public UserProfile f45783a;

        /* renamed from: b */
        public Entities f45784b;

        /* renamed from: c */
        public List<FollowingUser> f45785c = Internal.newMutableList();

        /* renamed from: a */
        public GetUserProfileResponse build() {
            return new GetUserProfileResponse(this.f45783a, this.f45784b, this.f45785c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18402a newBuilder() {
        C18402a aVar = new C18402a();
        aVar.f45783a = this.profile;
        aVar.f45784b = this.entities;
        aVar.f45785c = Internal.copyOf("following_users", this.following_users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetUserProfileResponse");
        StringBuilder sb = new StringBuilder();
        if (this.profile != null) {
            sb.append(", profile=");
            sb.append(this.profile);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (!this.following_users.isEmpty()) {
            sb.append(", following_users=");
            sb.append(this.following_users);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserProfileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserProfileResponse(UserProfile userProfile, Entities entities2, List<FollowingUser> list) {
        this(userProfile, entities2, list, ByteString.EMPTY);
    }

    public GetUserProfileResponse(UserProfile userProfile, Entities entities2, List<FollowingUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.profile = userProfile;
        this.entities = entities2;
        this.following_users = Internal.immutableCopyOf("following_users", list);
    }
}
