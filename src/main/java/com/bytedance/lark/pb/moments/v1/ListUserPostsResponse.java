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

public final class ListUserPostsResponse extends Message<ListUserPostsResponse, C18452a> {
    public static final ProtoAdapter<ListUserPostsResponse> ADAPTER = new C18453b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final List<FeedEntry> entry_list;
    public final String next_page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserPostsResponse$b */
    private static final class C18453b extends ProtoAdapter<ListUserPostsResponse> {
        C18453b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserPostsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserPostsResponse listUserPostsResponse) {
            int i;
            int i2 = 0;
            if (listUserPostsResponse.next_page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listUserPostsResponse.next_page_token);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + FeedEntry.ADAPTER.asRepeated().encodedSizeWithTag(2, listUserPostsResponse.entry_list);
            if (listUserPostsResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(3, listUserPostsResponse.entities);
            }
            return encodedSizeWithTag + i2 + listUserPostsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserPostsResponse decode(ProtoReader protoReader) throws IOException {
            C18452a aVar = new C18452a();
            aVar.f45847a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45847a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45848b.add(FeedEntry.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45849c = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserPostsResponse listUserPostsResponse) throws IOException {
            if (listUserPostsResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listUserPostsResponse.next_page_token);
            }
            FeedEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, listUserPostsResponse.entry_list);
            if (listUserPostsResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 3, listUserPostsResponse.entities);
            }
            protoWriter.writeBytes(listUserPostsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListUserPostsResponse$a */
    public static final class C18452a extends Message.Builder<ListUserPostsResponse, C18452a> {

        /* renamed from: a */
        public String f45847a;

        /* renamed from: b */
        public List<FeedEntry> f45848b = Internal.newMutableList();

        /* renamed from: c */
        public Entities f45849c;

        /* renamed from: a */
        public ListUserPostsResponse build() {
            return new ListUserPostsResponse(this.f45847a, this.f45848b, this.f45849c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18452a newBuilder() {
        C18452a aVar = new C18452a();
        aVar.f45847a = this.next_page_token;
        aVar.f45848b = Internal.copyOf("entry_list", this.entry_list);
        aVar.f45849c = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListUserPostsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        if (!this.entry_list.isEmpty()) {
            sb.append(", entry_list=");
            sb.append(this.entry_list);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "ListUserPostsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserPostsResponse(String str, List<FeedEntry> list, Entities entities2) {
        this(str, list, entities2, ByteString.EMPTY);
    }

    public ListUserPostsResponse(String str, List<FeedEntry> list, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_page_token = str;
        this.entry_list = Internal.immutableCopyOf("entry_list", list);
        this.entities = entities2;
    }
}
