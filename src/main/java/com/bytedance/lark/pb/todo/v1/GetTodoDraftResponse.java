package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoDraftResponse extends Message<GetTodoDraftResponse, C19545a> {
    public static final ProtoAdapter<GetTodoDraftResponse> ADAPTER = new C19546b();
    public static final Boolean DEFAULT_FOUND = false;
    private static final long serialVersionUID = 0;
    public final Boolean found;
    public final Todo todo;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoDraftResponse$b */
    private static final class C19546b extends ProtoAdapter<GetTodoDraftResponse> {
        C19546b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoDraftResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoDraftResponse getTodoDraftResponse) {
            int i;
            int i2 = 0;
            if (getTodoDraftResponse.todo != null) {
                i = Todo.ADAPTER.encodedSizeWithTag(1, getTodoDraftResponse.todo);
            } else {
                i = 0;
            }
            if (getTodoDraftResponse.found != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getTodoDraftResponse.found);
            }
            return i + i2 + getTodoDraftResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoDraftResponse decode(ProtoReader protoReader) throws IOException {
            C19545a aVar = new C19545a();
            aVar.f47897b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47896a = Todo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47897b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoDraftResponse getTodoDraftResponse) throws IOException {
            if (getTodoDraftResponse.todo != null) {
                Todo.ADAPTER.encodeWithTag(protoWriter, 1, getTodoDraftResponse.todo);
            }
            if (getTodoDraftResponse.found != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getTodoDraftResponse.found);
            }
            protoWriter.writeBytes(getTodoDraftResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoDraftResponse$a */
    public static final class C19545a extends Message.Builder<GetTodoDraftResponse, C19545a> {

        /* renamed from: a */
        public Todo f47896a;

        /* renamed from: b */
        public Boolean f47897b;

        /* renamed from: a */
        public GetTodoDraftResponse build() {
            return new GetTodoDraftResponse(this.f47896a, this.f47897b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19545a newBuilder() {
        C19545a aVar = new C19545a();
        aVar.f47896a = this.todo;
        aVar.f47897b = this.found;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoDraftResponse");
        StringBuilder sb = new StringBuilder();
        if (this.todo != null) {
            sb.append(", todo=");
            sb.append(this.todo);
        }
        if (this.found != null) {
            sb.append(", found=");
            sb.append(this.found);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoDraftResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoDraftResponse(Todo todo2, Boolean bool) {
        this(todo2, bool, ByteString.EMPTY);
    }

    public GetTodoDraftResponse(Todo todo2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo = todo2;
        this.found = bool;
    }
}
