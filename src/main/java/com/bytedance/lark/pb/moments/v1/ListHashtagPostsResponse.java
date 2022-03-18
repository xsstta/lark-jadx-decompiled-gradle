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

public final class ListHashtagPostsResponse extends Message<ListHashtagPostsResponse, C18428a> {
    public static final ProtoAdapter<ListHashtagPostsResponse> ADAPTER = new C18429b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final List<FeedEntry> entry_list;
    public final String next_page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListHashtagPostsResponse$b */
    private static final class C18429b extends ProtoAdapter<ListHashtagPostsResponse> {
        C18429b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListHashtagPostsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListHashtagPostsResponse listHashtagPostsResponse) {
            int i;
            int i2 = 0;
            if (listHashtagPostsResponse.next_page_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, listHashtagPostsResponse.next_page_token);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + FeedEntry.ADAPTER.asRepeated().encodedSizeWithTag(2, listHashtagPostsResponse.entry_list);
            if (listHashtagPostsResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(3, listHashtagPostsResponse.entities);
            }
            return encodedSizeWithTag + i2 + listHashtagPostsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListHashtagPostsResponse decode(ProtoReader protoReader) throws IOException {
            C18428a aVar = new C18428a();
            aVar.f45815a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45815a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45816b.add(FeedEntry.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45817c = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListHashtagPostsResponse listHashtagPostsResponse) throws IOException {
            if (listHashtagPostsResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listHashtagPostsResponse.next_page_token);
            }
            FeedEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, listHashtagPostsResponse.entry_list);
            if (listHashtagPostsResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 3, listHashtagPostsResponse.entities);
            }
            protoWriter.writeBytes(listHashtagPostsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListHashtagPostsResponse$a */
    public static final class C18428a extends Message.Builder<ListHashtagPostsResponse, C18428a> {

        /* renamed from: a */
        public String f45815a;

        /* renamed from: b */
        public List<FeedEntry> f45816b = Internal.newMutableList();

        /* renamed from: c */
        public Entities f45817c;

        /* renamed from: a */
        public ListHashtagPostsResponse build() {
            return new ListHashtagPostsResponse(this.f45815a, this.f45816b, this.f45817c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18428a newBuilder() {
        C18428a aVar = new C18428a();
        aVar.f45815a = this.next_page_token;
        aVar.f45816b = Internal.copyOf("entry_list", this.entry_list);
        aVar.f45817c = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListHashtagPostsResponse");
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
        StringBuilder replace = sb.replace(0, 2, "ListHashtagPostsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListHashtagPostsResponse(String str, List<FeedEntry> list, Entities entities2) {
        this(str, list, entities2, ByteString.EMPTY);
    }

    public ListHashtagPostsResponse(String str, List<FeedEntry> list, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_page_token = str;
        this.entry_list = Internal.immutableCopyOf("entry_list", list);
        this.entities = entities2;
    }
}
