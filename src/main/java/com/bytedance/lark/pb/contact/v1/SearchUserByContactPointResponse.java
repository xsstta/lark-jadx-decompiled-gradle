package com.bytedance.lark.pb.contact.v1;

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

public final class SearchUserByContactPointResponse extends Message<SearchUserByContactPointResponse, C16366a> {
    public static final ProtoAdapter<SearchUserByContactPointResponse> ADAPTER = new C16367b();
    private static final long serialVersionUID = 0;
    public final List<GetUserProfileResponse> profiles;
    public final List<UserBriefInfo> users;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse$b */
    private static final class C16367b extends ProtoAdapter<SearchUserByContactPointResponse> {
        C16367b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchUserByContactPointResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchUserByContactPointResponse searchUserByContactPointResponse) {
            return UserBriefInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, searchUserByContactPointResponse.users) + GetUserProfileResponse.ADAPTER.asRepeated().encodedSizeWithTag(2, searchUserByContactPointResponse.profiles) + searchUserByContactPointResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SearchUserByContactPointResponse decode(ProtoReader protoReader) throws IOException {
            C16366a aVar = new C16366a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42625a.add(UserBriefInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42626b.add(GetUserProfileResponse.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchUserByContactPointResponse searchUserByContactPointResponse) throws IOException {
            UserBriefInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchUserByContactPointResponse.users);
            GetUserProfileResponse.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, searchUserByContactPointResponse.profiles);
            protoWriter.writeBytes(searchUserByContactPointResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse$a */
    public static final class C16366a extends Message.Builder<SearchUserByContactPointResponse, C16366a> {

        /* renamed from: a */
        public List<UserBriefInfo> f42625a = Internal.newMutableList();

        /* renamed from: b */
        public List<GetUserProfileResponse> f42626b = Internal.newMutableList();

        /* renamed from: a */
        public SearchUserByContactPointResponse build() {
            return new SearchUserByContactPointResponse(this.f42625a, this.f42626b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16366a newBuilder() {
        C16366a aVar = new C16366a();
        aVar.f42625a = Internal.copyOf("users", this.users);
        aVar.f42626b = Internal.copyOf("profiles", this.profiles);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SearchUserByContactPointResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (!this.profiles.isEmpty()) {
            sb.append(", profiles=");
            sb.append(this.profiles);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchUserByContactPointResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SearchUserByContactPointResponse(List<UserBriefInfo> list, List<GetUserProfileResponse> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public SearchUserByContactPointResponse(List<UserBriefInfo> list, List<GetUserProfileResponse> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = Internal.immutableCopyOf("users", list);
        this.profiles = Internal.immutableCopyOf("profiles", list2);
    }
}
