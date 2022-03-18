package com.bytedance.lark.pb.search.resource;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MessageRelatedInfo extends Message<MessageRelatedInfo, C18779a> {
    public static final ProtoAdapter<MessageRelatedInfo> ADAPTER = new C18780b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final Long create_time;
    public final String id;
    public final Integer position;
    public final Integer thread_chat_position;
    public final String thread_id;
    public final Integer thread_position;

    /* renamed from: com.bytedance.lark.pb.search.resource.MessageRelatedInfo$b */
    private static final class C18780b extends ProtoAdapter<MessageRelatedInfo> {
        C18780b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageRelatedInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageRelatedInfo messageRelatedInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messageRelatedInfo.id);
            int i5 = 0;
            if (messageRelatedInfo.position != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, messageRelatedInfo.position);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (messageRelatedInfo.create_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, messageRelatedInfo.create_time);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (messageRelatedInfo.thread_position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, messageRelatedInfo.thread_position);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (messageRelatedInfo.thread_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, messageRelatedInfo.thread_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (messageRelatedInfo.thread_chat_position != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, messageRelatedInfo.thread_chat_position);
            }
            return i9 + i5 + messageRelatedInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MessageRelatedInfo decode(ProtoReader protoReader) throws IOException {
            C18779a aVar = new C18779a();
            aVar.f46334a = "";
            aVar.f46335b = 0;
            aVar.f46336c = 0L;
            aVar.f46337d = 0;
            aVar.f46338e = "";
            aVar.f46339f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46334a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46335b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46336c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46337d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46338e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46339f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MessageRelatedInfo messageRelatedInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageRelatedInfo.id);
            if (messageRelatedInfo.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messageRelatedInfo.position);
            }
            if (messageRelatedInfo.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageRelatedInfo.create_time);
            }
            if (messageRelatedInfo.thread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, messageRelatedInfo.thread_position);
            }
            if (messageRelatedInfo.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, messageRelatedInfo.thread_id);
            }
            if (messageRelatedInfo.thread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, messageRelatedInfo.thread_chat_position);
            }
            protoWriter.writeBytes(messageRelatedInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.resource.MessageRelatedInfo$a */
    public static final class C18779a extends Message.Builder<MessageRelatedInfo, C18779a> {

        /* renamed from: a */
        public String f46334a;

        /* renamed from: b */
        public Integer f46335b;

        /* renamed from: c */
        public Long f46336c;

        /* renamed from: d */
        public Integer f46337d;

        /* renamed from: e */
        public String f46338e;

        /* renamed from: f */
        public Integer f46339f;

        /* renamed from: a */
        public MessageRelatedInfo build() {
            String str = this.f46334a;
            if (str != null) {
                return new MessageRelatedInfo(str, this.f46335b, this.f46336c, this.f46337d, this.f46338e, this.f46339f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18779a newBuilder() {
        C18779a aVar = new C18779a();
        aVar.f46334a = this.id;
        aVar.f46335b = this.position;
        aVar.f46336c = this.create_time;
        aVar.f46337d = this.thread_position;
        aVar.f46338e = this.thread_id;
        aVar.f46339f = this.thread_chat_position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "MessageRelatedInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.thread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.thread_position);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.thread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.thread_chat_position);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageRelatedInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MessageRelatedInfo(String str, Integer num, Long l, Integer num2, String str2, Integer num3) {
        this(str, num, l, num2, str2, num3, ByteString.EMPTY);
    }

    public MessageRelatedInfo(String str, Integer num, Long l, Integer num2, String str2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.position = num;
        this.create_time = l;
        this.thread_position = num2;
        this.thread_id = str2;
        this.thread_chat_position = num3;
    }
}
