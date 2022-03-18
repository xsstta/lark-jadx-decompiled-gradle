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

public final class ListUserFollowersResponse extends Message<ListUserFollowersResponse, C18444a> {
    public static final ProtoAdapter<ListUserFollowersResponse> ADAPTER = new C18445b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final List<Follower> followers;
    public final String next_page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowersResponse$b */
    private static final class C18445b extends ProtoAdapter<ListUserFollowersResponse> {
        C18445b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserFollowersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserFollowersResponse listUserFollowersResponse) {
            int i;
            int encodedSizeWithTag = Follower.ADAPTER.asRepeated().encodedSizeWithTag(1, listUserFollowersResponse.followers);
            int i2 = 0;
            if (listUserFollowersResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(2, listUserFollowersResponse.entities);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (listUserFollowersResponse.next_page_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(11, listUserFollowersResponse.next_page_token);
            }
            return i3 + i2 + listUserFollowersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserFollowersResponse decode(ProtoReader protoReader) throws IOException {
            C18444a aVar = new C18444a();
            aVar.f45837c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45835a.add(Follower.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45836b = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45837c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserFollowersResponse listUserFollowersResponse) throws IOException {
            Follower.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listUserFollowersResponse.followers);
            if (listUserFollowersResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, listUserFollowersResponse.entities);
            }
            if (listUserFollowersResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, listUserFollowersResponse.next_page_token);
            }
            protoWriter.writeBytes(listUserFollowersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserFollowersResponse$a */
    public static final class C18444a extends Message.Builder<ListUserFollowersResponse, C18444a> {

        /* renamed from: a */
        public List<Follower> f45835a = Internal.newMutableList();

        /* renamed from: b */
        public Entities f45836b;

        /* renamed from: c */
        public String f45837c;

        /* renamed from: a */
        public ListUserFollowersResponse build() {
            return new ListUserFollowersResponse(this.f45835a, this.f45836b, this.f45837c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18444a newBuilder() {
        C18444a aVar = new C18444a();
        aVar.f45835a = Internal.copyOf("followers", this.followers);
        aVar.f45836b = this.entities;
        aVar.f45837c = this.next_page_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListUserFollowersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.followers.isEmpty()) {
            sb.append(", followers=");
            sb.append(this.followers);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        StringBuilder replace = sb.replace(0, 2, "ListUserFollowersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserFollowersResponse(List<Follower> list, Entities entities2, String str) {
        this(list, entities2, str, ByteString.EMPTY);
    }

    public ListUserFollowersResponse(List<Follower> list, Entities entities2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.followers = Internal.immutableCopyOf("followers", list);
        this.entities = entities2;
        this.next_page_token = str;
    }
}
