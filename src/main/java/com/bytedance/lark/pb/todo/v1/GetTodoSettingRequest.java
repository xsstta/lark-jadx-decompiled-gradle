package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoSettingRequest extends Message<GetTodoSettingRequest, C19559a> {
    public static final ProtoAdapter<GetTodoSettingRequest> ADAPTER = new C19560b();
    public static final SyncDataStrategy DEFAULT_STRATEGY = SyncDataStrategy.TRY_LOCAL;
    private static final long serialVersionUID = 0;
    public final SyncDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoSettingRequest$b */
    private static final class C19560b extends ProtoAdapter<GetTodoSettingRequest> {
        C19560b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoSettingRequest getTodoSettingRequest) {
            int i;
            if (getTodoSettingRequest.strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(1, getTodoSettingRequest.strategy);
            } else {
                i = 0;
            }
            return i + getTodoSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19559a aVar = new C19559a();
            aVar.f47909a = SyncDataStrategy.TRY_LOCAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47909a = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoSettingRequest getTodoSettingRequest) throws IOException {
            if (getTodoSettingRequest.strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 1, getTodoSettingRequest.strategy);
            }
            protoWriter.writeBytes(getTodoSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoSettingRequest$a */
    public static final class C19559a extends Message.Builder<GetTodoSettingRequest, C19559a> {

        /* renamed from: a */
        public SyncDataStrategy f47909a;

        /* renamed from: a */
        public GetTodoSettingRequest build() {
            return new GetTodoSettingRequest(this.f47909a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19559a mo66438a(SyncDataStrategy syncDataStrategy) {
            this.f47909a = syncDataStrategy;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19559a newBuilder() {
        C19559a aVar = new C19559a();
        aVar.f47909a = this.strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoSettingRequest(SyncDataStrategy syncDataStrategy) {
        this(syncDataStrategy, ByteString.EMPTY);
    }

    public GetTodoSettingRequest(SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.strategy = syncDataStrategy;
    }
}
