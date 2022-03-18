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

public final class ListCommentsResponse extends Message<ListCommentsResponse, C18424a> {
    public static final ProtoAdapter<ListCommentsResponse> ADAPTER = new C18425b();
    private static final long serialVersionUID = 0;
    public final List<Comment> comments;
    public final Entities entities;
    public final String next_page_token;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCommentsResponse$b */
    private static final class C18425b extends ProtoAdapter<ListCommentsResponse> {
        C18425b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListCommentsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListCommentsResponse listCommentsResponse) {
            int i;
            int encodedSizeWithTag = Comment.ADAPTER.asRepeated().encodedSizeWithTag(1, listCommentsResponse.comments);
            int i2 = 0;
            if (listCommentsResponse.entities != null) {
                i = Entities.ADAPTER.encodedSizeWithTag(2, listCommentsResponse.entities);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (listCommentsResponse.next_page_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(11, listCommentsResponse.next_page_token);
            }
            return i3 + i2 + listCommentsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListCommentsResponse decode(ProtoReader protoReader) throws IOException {
            C18424a aVar = new C18424a();
            aVar.f45810c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45808a.add(Comment.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45809b = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 11) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45810c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListCommentsResponse listCommentsResponse) throws IOException {
            Comment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listCommentsResponse.comments);
            if (listCommentsResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, listCommentsResponse.entities);
            }
            if (listCommentsResponse.next_page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, listCommentsResponse.next_page_token);
            }
            protoWriter.writeBytes(listCommentsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ListCommentsResponse$a */
    public static final class C18424a extends Message.Builder<ListCommentsResponse, C18424a> {

        /* renamed from: a */
        public List<Comment> f45808a = Internal.newMutableList();

        /* renamed from: b */
        public Entities f45809b;

        /* renamed from: c */
        public String f45810c;

        /* renamed from: a */
        public ListCommentsResponse build() {
            return new ListCommentsResponse(this.f45808a, this.f45809b, this.f45810c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18424a newBuilder() {
        C18424a aVar = new C18424a();
        aVar.f45808a = Internal.copyOf("comments", this.comments);
        aVar.f45809b = this.entities;
        aVar.f45810c = this.next_page_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ListCommentsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.comments.isEmpty()) {
            sb.append(", comments=");
            sb.append(this.comments);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (this.next_page_token != null) {
            sb.append(", next_page_token=");
            sb.append(this.next_page_token);
        }
        StringBuilder replace = sb.replace(0, 2, "ListCommentsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListCommentsResponse(List<Comment> list, Entities entities2, String str) {
        this(list, entities2, str, ByteString.EMPTY);
    }

    public ListCommentsResponse(List<Comment> list, Entities entities2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comments = Internal.immutableCopyOf("comments", list);
        this.entities = entities2;
        this.next_page_token = str;
    }
}
