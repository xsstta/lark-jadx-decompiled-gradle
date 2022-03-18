package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class PatchChatTopNoticeRequest extends Message<PatchChatTopNoticeRequest, C17821a> {
    public static final ProtoAdapter<PatchChatTopNoticeRequest> ADAPTER = new C17822b();
    public static final Long DEFAULT_CHAT_ID = 0L;
    public static final Boolean DEFAULT_IS_MESSAGE_OPERATION = false;
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    public static final ActionType DEFAULT_TYPE = ActionType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Long chat_id;
    public final Boolean is_message_operation;
    public final Long message_id;
    public final ActionType type;

    public enum ActionType implements WireEnum {
        UNKNOWN(0),
        TOP_MSG(1),
        TOP_ANNOUNCEMENT(2),
        REMOVE(3),
        CLOSE(4);
        
        public static final ProtoAdapter<ActionType> ADAPTER = ProtoAdapter.newEnumAdapter(ActionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ActionType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TOP_MSG;
            }
            if (i == 2) {
                return TOP_ANNOUNCEMENT;
            }
            if (i == 3) {
                return REMOVE;
            }
            if (i != 4) {
                return null;
            }
            return CLOSE;
        }

        private ActionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatTopNoticeRequest$b */
    private static final class C17822b extends ProtoAdapter<PatchChatTopNoticeRequest> {
        C17822b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchChatTopNoticeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchChatTopNoticeRequest patchChatTopNoticeRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (patchChatTopNoticeRequest.chat_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, patchChatTopNoticeRequest.chat_id);
            } else {
                i = 0;
            }
            if (patchChatTopNoticeRequest.type != null) {
                i2 = ActionType.ADAPTER.encodedSizeWithTag(2, patchChatTopNoticeRequest.type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (patchChatTopNoticeRequest.message_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, patchChatTopNoticeRequest.message_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (patchChatTopNoticeRequest.is_message_operation != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, patchChatTopNoticeRequest.is_message_operation);
            }
            return i6 + i4 + patchChatTopNoticeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchChatTopNoticeRequest decode(ProtoReader protoReader) throws IOException {
            C17821a aVar = new C17821a();
            aVar.f44879a = 0L;
            aVar.f44880b = ActionType.UNKNOWN;
            aVar.f44881c = 0L;
            aVar.f44882d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44879a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f44880b = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f44881c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44882d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchChatTopNoticeRequest patchChatTopNoticeRequest) throws IOException {
            if (patchChatTopNoticeRequest.chat_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, patchChatTopNoticeRequest.chat_id);
            }
            if (patchChatTopNoticeRequest.type != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 2, patchChatTopNoticeRequest.type);
            }
            if (patchChatTopNoticeRequest.message_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, patchChatTopNoticeRequest.message_id);
            }
            if (patchChatTopNoticeRequest.is_message_operation != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, patchChatTopNoticeRequest.is_message_operation);
            }
            protoWriter.writeBytes(patchChatTopNoticeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchChatTopNoticeRequest$a */
    public static final class C17821a extends Message.Builder<PatchChatTopNoticeRequest, C17821a> {

        /* renamed from: a */
        public Long f44879a;

        /* renamed from: b */
        public ActionType f44880b;

        /* renamed from: c */
        public Long f44881c;

        /* renamed from: d */
        public Boolean f44882d;

        /* renamed from: a */
        public PatchChatTopNoticeRequest build() {
            return new PatchChatTopNoticeRequest(this.f44879a, this.f44880b, this.f44881c, this.f44882d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17821a mo62124a(ActionType actionType) {
            this.f44880b = actionType;
            return this;
        }

        /* renamed from: b */
        public C17821a mo62128b(Long l) {
            this.f44881c = l;
            return this;
        }

        /* renamed from: a */
        public C17821a mo62125a(Boolean bool) {
            this.f44882d = bool;
            return this;
        }

        /* renamed from: a */
        public C17821a mo62126a(Long l) {
            this.f44879a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17821a newBuilder() {
        C17821a aVar = new C17821a();
        aVar.f44879a = this.chat_id;
        aVar.f44880b = this.type;
        aVar.f44881c = this.message_id;
        aVar.f44882d = this.is_message_operation;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchChatTopNoticeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.is_message_operation != null) {
            sb.append(", is_message_operation=");
            sb.append(this.is_message_operation);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchChatTopNoticeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchChatTopNoticeRequest(Long l, ActionType actionType, Long l2, Boolean bool) {
        this(l, actionType, l2, bool, ByteString.EMPTY);
    }

    public PatchChatTopNoticeRequest(Long l, ActionType actionType, Long l2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = l;
        this.type = actionType;
        this.message_id = l2;
        this.is_message_operation = bool;
    }
}
