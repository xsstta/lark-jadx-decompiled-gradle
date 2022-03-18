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

public final class ListUserFollowingsResponse extends Message<ListUserFollowingsResponse, C18448a> {
    public static final ProtoAdapter<ListUserFollowingsResponse> ADAPTER = new C18449b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final List<FollowingUser> following_users;
    public final String next_page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowingsResponse$b */
    private static final class C18449b extends ProtoAdapter<ListUserFollowingsResponse> {
        C18449b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserFollowingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserFollowingsResponse listUserFollowingsResponse) {
            int i;
            int encodedSizeWithTag = FollowingUser.ADAPTER.asRepeated().encodedSizeWithTag(1, listUserFollowingsResponse.following_users);
            int i2 = 0;
            if (listUserFollowingsResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(2, listUserFollowingsResponse.entities);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (listUserFollowingsResponse.next_page_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(11, listUserFollowingsResponse.next_page_token);
            }
            return i3 + i2 + listUserFollowingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserFollowingsResponse decode(ProtoReader protoReader) throws IOException {
            C18448a aVar = new C18448a();
            aVar.f45843c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45841a.add(FollowingUser.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45842b = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45843c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserFollowingsResponse listUserFollowingsResponse) throws IOException {
            FollowingUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listUserFollowingsResponse.following_users);
            if (listUserFollowingsResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, listUserFollowingsResponse.entities);
            }
            if (listUserFollowingsResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, listUserFollowingsResponse.next_page_token);
            }
            protoWriter.writeBytes(listUserFollowingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowingsResponse$a */
    public static final class C18448a extends Message.Builder<ListUserFollowingsResponse, C18448a> {

        /* renamed from: a */
        public List<FollowingUser> f45841a = Internal.newMutableList();

        /* renamed from: b */
        public Entities f45842b;

        /* renamed from: c */
        public String f45843c;

        /* renamed from: a */
        public ListUserFollowingsResponse build() {
            return new ListUserFollowingsResponse(this.f45841a, this.f45842b, this.f45843c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18448a newBuilder() {
        C18448a aVar = new C18448a();
        aVar.f45841a = Internal.copyOf("following_users", this.following_users);
        aVar.f45842b = this.entities;
        aVar.f45843c = this.next_page_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListUserFollowingsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.following_users.isEmpty()) {
            sb.append(", following_users=");
            sb.append(this.following_users);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        StringBuilder replace = sb.replace(0, 2, "ListUserFollowingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserFollowingsResponse(List<FollowingUser> list, Entities entities2, String str) {
        this(list, entities2, str, ByteString.EMPTY);
    }

    public ListUserFollowingsResponse(List<FollowingUser> list, Entities entities2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.following_users = Internal.immutableCopyOf("following_users", list);
        this.entities = entities2;
        this.next_page_token = str;
    }
}
