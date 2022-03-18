package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoHistoryRecordsRequest extends Message<GetTodoHistoryRecordsRequest, C19547a> {
    public static final ProtoAdapter<GetTodoHistoryRecordsRequest> ADAPTER = new C19548b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final RecordsScene DEFAULT_SCENE = RecordsScene.FIRST_SCREEN;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String cursor;
    public final String guid;
    public final RecordsScene scene;

    public enum RecordsScene implements WireEnum {
        FIRST_SCREEN(1),
        NEXT_PAGE(2);
        
        public static final ProtoAdapter<RecordsScene> ADAPTER = ProtoAdapter.newEnumAdapter(RecordsScene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecordsScene fromValue(int i) {
            if (i == 1) {
                return FIRST_SCREEN;
            }
            if (i != 2) {
                return null;
            }
            return NEXT_PAGE;
        }

        private RecordsScene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoHistoryRecordsRequest$b */
    private static final class C19548b extends ProtoAdapter<GetTodoHistoryRecordsRequest> {
        C19548b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoHistoryRecordsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoHistoryRecordsRequest getTodoHistoryRecordsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getTodoHistoryRecordsRequest.guid) + RecordsScene.ADAPTER.encodedSizeWithTag(2, getTodoHistoryRecordsRequest.scene);
            int i2 = 0;
            if (getTodoHistoryRecordsRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getTodoHistoryRecordsRequest.cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getTodoHistoryRecordsRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, getTodoHistoryRecordsRequest.count);
            }
            return i3 + i2 + getTodoHistoryRecordsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoHistoryRecordsRequest decode(ProtoReader protoReader) throws IOException {
            C19547a aVar = new C19547a();
            aVar.f47898a = "";
            aVar.f47899b = RecordsScene.FIRST_SCREEN;
            aVar.f47900c = "";
            aVar.f47901d = 10;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47898a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f47899b = RecordsScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f47900c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47901d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoHistoryRecordsRequest getTodoHistoryRecordsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTodoHistoryRecordsRequest.guid);
            RecordsScene.ADAPTER.encodeWithTag(protoWriter, 2, getTodoHistoryRecordsRequest.scene);
            if (getTodoHistoryRecordsRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getTodoHistoryRecordsRequest.cursor);
            }
            if (getTodoHistoryRecordsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getTodoHistoryRecordsRequest.count);
            }
            protoWriter.writeBytes(getTodoHistoryRecordsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19547a newBuilder() {
        C19547a aVar = new C19547a();
        aVar.f47898a = this.guid;
        aVar.f47899b = this.scene;
        aVar.f47900c = this.cursor;
        aVar.f47901d = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoHistoryRecordsRequest$a */
    public static final class C19547a extends Message.Builder<GetTodoHistoryRecordsRequest, C19547a> {

        /* renamed from: a */
        public String f47898a;

        /* renamed from: b */
        public RecordsScene f47899b;

        /* renamed from: c */
        public String f47900c;

        /* renamed from: d */
        public Integer f47901d;

        /* renamed from: a */
        public GetTodoHistoryRecordsRequest build() {
            RecordsScene recordsScene;
            String str = this.f47898a;
            if (str != null && (recordsScene = this.f47899b) != null) {
                return new GetTodoHistoryRecordsRequest(str, recordsScene, this.f47900c, this.f47901d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "guid", this.f47899b, "scene");
        }

        /* renamed from: a */
        public C19547a mo66408a(RecordsScene recordsScene) {
            this.f47899b = recordsScene;
            return this;
        }

        /* renamed from: b */
        public C19547a mo66412b(String str) {
            this.f47900c = str;
            return this;
        }

        /* renamed from: a */
        public C19547a mo66409a(Integer num) {
            this.f47901d = num;
            return this;
        }

        /* renamed from: a */
        public C19547a mo66410a(String str) {
            this.f47898a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoHistoryRecordsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", guid=");
        sb.append(this.guid);
        sb.append(", scene=");
        sb.append(this.scene);
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoHistoryRecordsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoHistoryRecordsRequest(String str, RecordsScene recordsScene, String str2, Integer num) {
        this(str, recordsScene, str2, num, ByteString.EMPTY);
    }

    public GetTodoHistoryRecordsRequest(String str, RecordsScene recordsScene, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guid = str;
        this.scene = recordsScene;
        this.cursor = str2;
        this.count = num;
    }
}
