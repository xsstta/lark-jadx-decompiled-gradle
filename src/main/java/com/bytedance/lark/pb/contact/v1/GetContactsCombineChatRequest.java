package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetContactsCombineChatRequest extends Message<GetContactsCombineChatRequest, C16220a> {
    public static final ProtoAdapter<GetContactsCombineChatRequest> ADAPTER = new C16221b();
    public static final ActionType DEFAULT_BUSINESS_SCENE = ActionType.UNKNOWN_ACTION;
    public static final Integer DEFAULT_COUNT = 20;
    private static final long serialVersionUID = 0;
    public final ActionType business_scene;
    public final String chat_id;
    public final Integer count;
    public final String cursor;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetContactsCombineChatRequest$b */
    private static final class C16221b extends ProtoAdapter<GetContactsCombineChatRequest> {
        C16221b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactsCombineChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactsCombineChatRequest getContactsCombineChatRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getContactsCombineChatRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getContactsCombineChatRequest.chat_id);
            } else {
                i = 0;
            }
            if (getContactsCombineChatRequest.cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getContactsCombineChatRequest.cursor);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getContactsCombineChatRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, getContactsCombineChatRequest.count);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getContactsCombineChatRequest.business_scene != null) {
                i4 = ActionType.ADAPTER.encodedSizeWithTag(4, getContactsCombineChatRequest.business_scene);
            }
            return i6 + i4 + getContactsCombineChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactsCombineChatRequest decode(ProtoReader protoReader) throws IOException {
            C16220a aVar = new C16220a();
            aVar.f42393a = "";
            aVar.f42394b = "0";
            aVar.f42395c = 20;
            aVar.f42396d = ActionType.UNKNOWN_ACTION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42393a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42394b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42395c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42396d = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetContactsCombineChatRequest getContactsCombineChatRequest) throws IOException {
            if (getContactsCombineChatRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getContactsCombineChatRequest.chat_id);
            }
            if (getContactsCombineChatRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getContactsCombineChatRequest.cursor);
            }
            if (getContactsCombineChatRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getContactsCombineChatRequest.count);
            }
            if (getContactsCombineChatRequest.business_scene != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 4, getContactsCombineChatRequest.business_scene);
            }
            protoWriter.writeBytes(getContactsCombineChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetContactsCombineChatRequest$a */
    public static final class C16220a extends Message.Builder<GetContactsCombineChatRequest, C16220a> {

        /* renamed from: a */
        public String f42393a;

        /* renamed from: b */
        public String f42394b;

        /* renamed from: c */
        public Integer f42395c;

        /* renamed from: d */
        public ActionType f42396d;

        /* renamed from: a */
        public GetContactsCombineChatRequest build() {
            return new GetContactsCombineChatRequest(this.f42393a, this.f42394b, this.f42395c, this.f42396d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16220a mo58129a(Integer num) {
            this.f42395c = num;
            return this;
        }

        /* renamed from: b */
        public C16220a mo58132b(String str) {
            this.f42394b = str;
            return this;
        }

        /* renamed from: a */
        public C16220a mo58130a(String str) {
            this.f42393a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16220a newBuilder() {
        C16220a aVar = new C16220a();
        aVar.f42393a = this.chat_id;
        aVar.f42394b = this.cursor;
        aVar.f42395c = this.count;
        aVar.f42396d = this.business_scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetContactsCombineChatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.business_scene != null) {
            sb.append(", business_scene=");
            sb.append(this.business_scene);
        }
        StringBuilder replace = sb.replace(0, 2, "GetContactsCombineChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactsCombineChatRequest(String str, String str2, Integer num, ActionType actionType) {
        this(str, str2, num, actionType, ByteString.EMPTY);
    }

    public GetContactsCombineChatRequest(String str, String str2, Integer num, ActionType actionType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.cursor = str2;
        this.count = num;
        this.business_scene = actionType;
    }
}
