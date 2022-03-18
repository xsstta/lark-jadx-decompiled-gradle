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
import java.util.List;
import okio.ByteString;

public final class ShareTodoMessageRequest extends Message<ShareTodoMessageRequest, C19629a> {
    public static final ProtoAdapter<ShareTodoMessageRequest> ADAPTER = new C19630b();
    public static final ShareType DEFAULT_SHARE_TYPE = ShareType.UNKNOWN_SHARE_TYPE;
    private static final long serialVersionUID = 0;
    public final List<String> chat_ids;
    public final ShareType share_type;
    public final String todo_guid;

    public enum ShareType implements WireEnum {
        UNKNOWN_SHARE_TYPE(1),
        SHARE(2),
        CREATE(3);
        
        public static final ProtoAdapter<ShareType> ADAPTER = ProtoAdapter.newEnumAdapter(ShareType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareType fromValue(int i) {
            if (i == 1) {
                return UNKNOWN_SHARE_TYPE;
            }
            if (i == 2) {
                return SHARE;
            }
            if (i != 3) {
                return null;
            }
            return CREATE;
        }

        private ShareType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest$b */
    private static final class C19630b extends ProtoAdapter<ShareTodoMessageRequest> {
        C19630b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareTodoMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareTodoMessageRequest shareTodoMessageRequest) {
            int i;
            int i2 = 0;
            if (shareTodoMessageRequest.todo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareTodoMessageRequest.todo_guid);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, shareTodoMessageRequest.chat_ids);
            if (shareTodoMessageRequest.share_type != null) {
                i2 = ShareType.ADAPTER.encodedSizeWithTag(3, shareTodoMessageRequest.share_type);
            }
            return encodedSizeWithTag + i2 + shareTodoMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareTodoMessageRequest decode(ProtoReader protoReader) throws IOException {
            C19629a aVar = new C19629a();
            aVar.f48001a = "";
            aVar.f48003c = ShareType.UNKNOWN_SHARE_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48001a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48002b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f48003c = ShareType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareTodoMessageRequest shareTodoMessageRequest) throws IOException {
            if (shareTodoMessageRequest.todo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareTodoMessageRequest.todo_guid);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, shareTodoMessageRequest.chat_ids);
            if (shareTodoMessageRequest.share_type != null) {
                ShareType.ADAPTER.encodeWithTag(protoWriter, 3, shareTodoMessageRequest.share_type);
            }
            protoWriter.writeBytes(shareTodoMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageRequest$a */
    public static final class C19629a extends Message.Builder<ShareTodoMessageRequest, C19629a> {

        /* renamed from: a */
        public String f48001a;

        /* renamed from: b */
        public List<String> f48002b = Internal.newMutableList();

        /* renamed from: c */
        public ShareType f48003c;

        /* renamed from: a */
        public ShareTodoMessageRequest build() {
            return new ShareTodoMessageRequest(this.f48001a, this.f48002b, this.f48003c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19629a mo66602a(ShareType shareType) {
            this.f48003c = shareType;
            return this;
        }

        /* renamed from: a */
        public C19629a mo66603a(String str) {
            this.f48001a = str;
            return this;
        }

        /* renamed from: a */
        public C19629a mo66604a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f48002b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19629a newBuilder() {
        C19629a aVar = new C19629a();
        aVar.f48001a = this.todo_guid;
        aVar.f48002b = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f48003c = this.share_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ShareTodoMessageRequest");
        StringBuilder sb = new StringBuilder();
        if (this.todo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.todo_guid);
        }
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.share_type != null) {
            sb.append(", share_type=");
            sb.append(this.share_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareTodoMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ShareTodoMessageRequest(String str, List<String> list, ShareType shareType) {
        this(str, list, shareType, ByteString.EMPTY);
    }

    public ShareTodoMessageRequest(String str, List<String> list, ShareType shareType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.todo_guid = str;
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.share_type = shareType;
    }
}
