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

public final class GetTodoHistoryRecordsResponse extends Message<GetTodoHistoryRecordsResponse, C19549a> {
    public static final ProtoAdapter<GetTodoHistoryRecordsResponse> ADAPTER = new C19550b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final String next_cursor;
    public final List<Record> records;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoHistoryRecordsResponse$b */
    private static final class C19550b extends ProtoAdapter<GetTodoHistoryRecordsResponse> {
        C19550b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoHistoryRecordsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoHistoryRecordsResponse getTodoHistoryRecordsResponse) {
            int i;
            int encodedSizeWithTag = Record.ADAPTER.asRepeated().encodedSizeWithTag(1, getTodoHistoryRecordsResponse.records);
            int i2 = 0;
            if (getTodoHistoryRecordsResponse.next_cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getTodoHistoryRecordsResponse.next_cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getTodoHistoryRecordsResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getTodoHistoryRecordsResponse.has_more);
            }
            return i3 + i2 + getTodoHistoryRecordsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoHistoryRecordsResponse decode(ProtoReader protoReader) throws IOException {
            C19549a aVar = new C19549a();
            aVar.f47903b = "";
            aVar.f47904c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47902a.add(Record.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47903b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47904c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoHistoryRecordsResponse getTodoHistoryRecordsResponse) throws IOException {
            Record.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getTodoHistoryRecordsResponse.records);
            if (getTodoHistoryRecordsResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getTodoHistoryRecordsResponse.next_cursor);
            }
            if (getTodoHistoryRecordsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getTodoHistoryRecordsResponse.has_more);
            }
            protoWriter.writeBytes(getTodoHistoryRecordsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoHistoryRecordsResponse$a */
    public static final class C19549a extends Message.Builder<GetTodoHistoryRecordsResponse, C19549a> {

        /* renamed from: a */
        public List<Record> f47902a = Internal.newMutableList();

        /* renamed from: b */
        public String f47903b;

        /* renamed from: c */
        public Boolean f47904c;

        /* renamed from: a */
        public GetTodoHistoryRecordsResponse build() {
            return new GetTodoHistoryRecordsResponse(this.f47902a, this.f47903b, this.f47904c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19549a newBuilder() {
        C19549a aVar = new C19549a();
        aVar.f47902a = Internal.copyOf("records", this.records);
        aVar.f47903b = this.next_cursor;
        aVar.f47904c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoHistoryRecordsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.records.isEmpty()) {
            sb.append(", records=");
            sb.append(this.records);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoHistoryRecordsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoHistoryRecordsResponse(List<Record> list, String str, Boolean bool) {
        this(list, str, bool, ByteString.EMPTY);
    }

    public GetTodoHistoryRecordsResponse(List<Record> list, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.records = Internal.immutableCopyOf("records", list);
        this.next_cursor = str;
        this.has_more = bool;
    }
}
