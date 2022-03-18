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

public final class ListDocTodosResponse extends Message<ListDocTodosResponse, C19579a> {
    public static final ProtoAdapter<ListDocTodosResponse> ADAPTER = new C19580b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_POSITION = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final List<DocTodoItem> items;
    public final Long next_position;

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListDocTodosResponse$b */
    private static final class C19580b extends ProtoAdapter<ListDocTodosResponse> {
        C19580b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListDocTodosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListDocTodosResponse listDocTodosResponse) {
            int i;
            int encodedSizeWithTag = DocTodoItem.ADAPTER.asRepeated().encodedSizeWithTag(1, listDocTodosResponse.items);
            int i2 = 0;
            if (listDocTodosResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, listDocTodosResponse.has_more);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (listDocTodosResponse.next_position != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, listDocTodosResponse.next_position);
            }
            return i3 + i2 + listDocTodosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListDocTodosResponse decode(ProtoReader protoReader) throws IOException {
            C19579a aVar = new C19579a();
            aVar.f47930b = false;
            aVar.f47931c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47929a.add(DocTodoItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47930b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47931c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListDocTodosResponse listDocTodosResponse) throws IOException {
            DocTodoItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listDocTodosResponse.items);
            if (listDocTodosResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, listDocTodosResponse.has_more);
            }
            if (listDocTodosResponse.next_position != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, listDocTodosResponse.next_position);
            }
            protoWriter.writeBytes(listDocTodosResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ListDocTodosResponse$a */
    public static final class C19579a extends Message.Builder<ListDocTodosResponse, C19579a> {

        /* renamed from: a */
        public List<DocTodoItem> f47929a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f47930b;

        /* renamed from: c */
        public Long f47931c;

        /* renamed from: a */
        public ListDocTodosResponse build() {
            return new ListDocTodosResponse(this.f47929a, this.f47930b, this.f47931c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19579a newBuilder() {
        C19579a aVar = new C19579a();
        aVar.f47929a = Internal.copyOf("items", this.items);
        aVar.f47930b = this.has_more;
        aVar.f47931c = this.next_position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ListDocTodosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_position != null) {
            sb.append(", next_position=");
            sb.append(this.next_position);
        }
        StringBuilder replace = sb.replace(0, 2, "ListDocTodosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListDocTodosResponse(List<DocTodoItem> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public ListDocTodosResponse(List<DocTodoItem> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = Internal.immutableCopyOf("items", list);
        this.has_more = bool;
        this.next_position = l;
    }
}
