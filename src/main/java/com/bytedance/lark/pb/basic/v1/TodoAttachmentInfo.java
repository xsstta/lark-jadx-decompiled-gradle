package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class TodoAttachmentInfo extends Message<TodoAttachmentInfo, C15330a> {
    public static final ProtoAdapter<TodoAttachmentInfo> ADAPTER = new C15331b();
    public static final TodoAttachmentType DEFAULT_TYPE = TodoAttachmentType.UNKNOWN_ATTACHMENT_TYPE;
    private static final long serialVersionUID = 0;
    public final TodoAttachmentType type;

    public enum TodoAttachmentType implements WireEnum {
        UNKNOWN_ATTACHMENT_TYPE(0),
        IMAGE(1);
        
        public static final ProtoAdapter<TodoAttachmentType> ADAPTER = ProtoAdapter.newEnumAdapter(TodoAttachmentType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TodoAttachmentType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_ATTACHMENT_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return IMAGE;
        }

        private TodoAttachmentType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoAttachmentInfo$b */
    private static final class C15331b extends ProtoAdapter<TodoAttachmentInfo> {
        C15331b() {
            super(FieldEncoding.LENGTH_DELIMITED, TodoAttachmentInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(TodoAttachmentInfo todoAttachmentInfo) {
            int i;
            if (todoAttachmentInfo.type != null) {
                i = TodoAttachmentType.ADAPTER.encodedSizeWithTag(1, todoAttachmentInfo.type);
            } else {
                i = 0;
            }
            return i + todoAttachmentInfo.unknownFields().size();
        }

        /* renamed from: a */
        public TodoAttachmentInfo decode(ProtoReader protoReader) throws IOException {
            C15330a aVar = new C15330a();
            aVar.f40608a = TodoAttachmentType.UNKNOWN_ATTACHMENT_TYPE;
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
                        aVar.f40608a = TodoAttachmentType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TodoAttachmentInfo todoAttachmentInfo) throws IOException {
            if (todoAttachmentInfo.type != null) {
                TodoAttachmentType.ADAPTER.encodeWithTag(protoWriter, 1, todoAttachmentInfo.type);
            }
            protoWriter.writeBytes(todoAttachmentInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TodoAttachmentInfo$a */
    public static final class C15330a extends Message.Builder<TodoAttachmentInfo, C15330a> {

        /* renamed from: a */
        public TodoAttachmentType f40608a;

        /* renamed from: a */
        public TodoAttachmentInfo build() {
            return new TodoAttachmentInfo(this.f40608a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15330a newBuilder() {
        C15330a aVar = new C15330a();
        aVar.f40608a = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TodoAttachmentInfo");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "TodoAttachmentInfo{");
        replace.append('}');
        return replace.toString();
    }

    public TodoAttachmentInfo(TodoAttachmentType todoAttachmentType) {
        this(todoAttachmentType, ByteString.EMPTY);
    }

    public TodoAttachmentInfo(TodoAttachmentType todoAttachmentType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = todoAttachmentType;
    }
}
