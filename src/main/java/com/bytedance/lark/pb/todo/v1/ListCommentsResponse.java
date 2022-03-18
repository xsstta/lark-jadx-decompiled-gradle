package com.bytedance.lark.pb.todo.v1;

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

public final class ListCommentsResponse extends Message<ListCommentsResponse, C19573a> {
    public static final ProtoAdapter<ListCommentsResponse> ADAPTER = new C19574b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<TodoComment> comments;
    public final Boolean has_more;

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListCommentsResponse$b */
    private static final class C19574b extends ProtoAdapter<ListCommentsResponse> {
        C19574b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListCommentsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListCommentsResponse listCommentsResponse) {
            int i;
            int encodedSizeWithTag = TodoComment.ADAPTER.asRepeated().encodedSizeWithTag(1, listCommentsResponse.comments);
            if (listCommentsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, listCommentsResponse.has_more);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + listCommentsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListCommentsResponse decode(ProtoReader protoReader) throws IOException {
            C19573a aVar = new C19573a();
            aVar.f47922b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47921a.add(TodoComment.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47922b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListCommentsResponse listCommentsResponse) throws IOException {
            TodoComment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listCommentsResponse.comments);
            if (listCommentsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, listCommentsResponse.has_more);
            }
            protoWriter.writeBytes(listCommentsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListCommentsResponse$a */
    public static final class C19573a extends Message.Builder<ListCommentsResponse, C19573a> {

        /* renamed from: a */
        public List<TodoComment> f47921a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f47922b;

        /* renamed from: a */
        public ListCommentsResponse build() {
            return new ListCommentsResponse(this.f47921a, this.f47922b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19573a newBuilder() {
        C19573a aVar = new C19573a();
        aVar.f47921a = Internal.copyOf("comments", this.comments);
        aVar.f47922b = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ListCommentsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.comments.isEmpty()) {
            sb.append(", comments=");
            sb.append(this.comments);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "ListCommentsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListCommentsResponse(List<TodoComment> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public ListCommentsResponse(List<TodoComment> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comments = Internal.immutableCopyOf("comments", list);
        this.has_more = bool;
    }
}
