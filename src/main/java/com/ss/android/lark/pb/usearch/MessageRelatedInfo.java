package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MessageRelatedInfo extends Message<MessageRelatedInfo, C50216a> {
    public static final ProtoAdapter<MessageRelatedInfo> ADAPTER = new C50217b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_CHAT_POSITION = 0;
    public static final Integer DEFAULT_THREAD_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final Long mcreate_time;
    public final String mid;
    public final Integer mposition;
    public final Integer mthread_chat_position;
    public final String mthread_id;
    public final Integer mthread_position;

    /* renamed from: com.ss.android.lark.pb.usearch.MessageRelatedInfo$b */
    private static final class C50217b extends ProtoAdapter<MessageRelatedInfo> {
        C50217b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageRelatedInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageRelatedInfo messageRelatedInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messageRelatedInfo.mid);
            int i5 = 0;
            if (messageRelatedInfo.mposition != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, messageRelatedInfo.mposition);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (messageRelatedInfo.mcreate_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, messageRelatedInfo.mcreate_time);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (messageRelatedInfo.mthread_position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, messageRelatedInfo.mthread_position);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (messageRelatedInfo.mthread_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, messageRelatedInfo.mthread_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (messageRelatedInfo.mthread_chat_position != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, messageRelatedInfo.mthread_chat_position);
            }
            return i9 + i5 + messageRelatedInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MessageRelatedInfo decode(ProtoReader protoReader) throws IOException {
            C50216a aVar = new C50216a();
            aVar.f125476a = "";
            aVar.f125477b = 0;
            aVar.f125478c = 0L;
            aVar.f125479d = 0;
            aVar.f125480e = "";
            aVar.f125481f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125476a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125477b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125478c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125479d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125480e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125481f = ProtoAdapter.INT32.decode(protoReader);
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageRelatedInfo.mid);
            if (messageRelatedInfo.mposition != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messageRelatedInfo.mposition);
            }
            if (messageRelatedInfo.mcreate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageRelatedInfo.mcreate_time);
            }
            if (messageRelatedInfo.mthread_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, messageRelatedInfo.mthread_position);
            }
            if (messageRelatedInfo.mthread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, messageRelatedInfo.mthread_id);
            }
            if (messageRelatedInfo.mthread_chat_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, messageRelatedInfo.mthread_chat_position);
            }
            protoWriter.writeBytes(messageRelatedInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.MessageRelatedInfo$a */
    public static final class C50216a extends Message.Builder<MessageRelatedInfo, C50216a> {

        /* renamed from: a */
        public String f125476a;

        /* renamed from: b */
        public Integer f125477b;

        /* renamed from: c */
        public Long f125478c;

        /* renamed from: d */
        public Integer f125479d;

        /* renamed from: e */
        public String f125480e;

        /* renamed from: f */
        public Integer f125481f;

        /* renamed from: a */
        public MessageRelatedInfo build() {
            String str = this.f125476a;
            if (str != null) {
                return new MessageRelatedInfo(str, this.f125477b, this.f125478c, this.f125479d, this.f125480e, this.f125481f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50216a newBuilder() {
        C50216a aVar = new C50216a();
        aVar.f125476a = this.mid;
        aVar.f125477b = this.mposition;
        aVar.f125478c = this.mcreate_time;
        aVar.f125479d = this.mthread_position;
        aVar.f125480e = this.mthread_id;
        aVar.f125481f = this.mthread_chat_position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mposition != null) {
            sb.append(", position=");
            sb.append(this.mposition);
        }
        if (this.mcreate_time != null) {
            sb.append(", create_time=");
            sb.append(this.mcreate_time);
        }
        if (this.mthread_position != null) {
            sb.append(", thread_position=");
            sb.append(this.mthread_position);
        }
        if (this.mthread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.mthread_id);
        }
        if (this.mthread_chat_position != null) {
            sb.append(", thread_chat_position=");
            sb.append(this.mthread_chat_position);
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
        this.mid = str;
        this.mposition = num;
        this.mcreate_time = l;
        this.mthread_position = num2;
        this.mthread_id = str2;
        this.mthread_chat_position = num3;
    }
}
