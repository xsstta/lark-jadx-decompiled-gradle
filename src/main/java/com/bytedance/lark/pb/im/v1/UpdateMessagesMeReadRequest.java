package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpdateMessagesMeReadRequest extends Message<UpdateMessagesMeReadRequest, C18154a> {
    public static final ProtoAdapter<UpdateMessagesMeReadRequest> ADAPTER = new C18155b();
    public static final Integer DEFAULT_MAX_POSITION = -1;
    public static final Integer DEFAULT_MAX_POSITION_BADGE_COUNT = 0;
    public static final Integer DEFAULT_THREAD_MAX_POSITION = 0;
    public static final Integer DEFAULT_THREAD_MAX_POSITION_BADGE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final Integer max_position;
    public final Integer max_position_badge_count;
    public final List<String> message_ids;
    public final String thread_id;
    public final Integer thread_max_position;
    public final Integer thread_max_position_badge_count;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateMessagesMeReadRequest$b */
    private static final class C18155b extends ProtoAdapter<UpdateMessagesMeReadRequest> {
        C18155b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateMessagesMeReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateMessagesMeReadRequest updateMessagesMeReadRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, updateMessagesMeReadRequest.message_ids);
            int i4 = 0;
            if (updateMessagesMeReadRequest.channel != null) {
                i = Channel.ADAPTER.encodedSizeWithTag(2, updateMessagesMeReadRequest.channel);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.INT32.encodedSizeWithTag(3, updateMessagesMeReadRequest.max_position);
            if (updateMessagesMeReadRequest.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, updateMessagesMeReadRequest.thread_id);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag2 + i2;
            if (updateMessagesMeReadRequest.thread_max_position != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, updateMessagesMeReadRequest.thread_max_position);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = i5 + i3 + ProtoAdapter.INT32.encodedSizeWithTag(6, updateMessagesMeReadRequest.max_position_badge_count);
            if (updateMessagesMeReadRequest.thread_max_position_badge_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(7, updateMessagesMeReadRequest.thread_max_position_badge_count);
            }
            return encodedSizeWithTag3 + i4 + updateMessagesMeReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateMessagesMeReadRequest decode(ProtoReader protoReader) throws IOException {
            C18154a aVar = new C18154a();
            aVar.f45351c = -1;
            aVar.f45352d = "";
            aVar.f45353e = 0;
            aVar.f45354f = 0;
            aVar.f45355g = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45349a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f45350b = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45351c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45352d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45353e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45354f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45355g = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UpdateMessagesMeReadRequest updateMessagesMeReadRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, updateMessagesMeReadRequest.message_ids);
            if (updateMessagesMeReadRequest.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 2, updateMessagesMeReadRequest.channel);
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, updateMessagesMeReadRequest.max_position);
            if (updateMessagesMeReadRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, updateMessagesMeReadRequest.thread_id);
            }
            if (updateMessagesMeReadRequest.thread_max_position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, updateMessagesMeReadRequest.thread_max_position);
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, updateMessagesMeReadRequest.max_position_badge_count);
            if (updateMessagesMeReadRequest.thread_max_position_badge_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, updateMessagesMeReadRequest.thread_max_position_badge_count);
            }
            protoWriter.writeBytes(updateMessagesMeReadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateMessagesMeReadRequest$a */
    public static final class C18154a extends Message.Builder<UpdateMessagesMeReadRequest, C18154a> {

        /* renamed from: a */
        public List<String> f45349a = Internal.newMutableList();

        /* renamed from: b */
        public Channel f45350b;

        /* renamed from: c */
        public Integer f45351c;

        /* renamed from: d */
        public String f45352d;

        /* renamed from: e */
        public Integer f45353e;

        /* renamed from: f */
        public Integer f45354f;

        /* renamed from: g */
        public Integer f45355g;

        /* renamed from: a */
        public UpdateMessagesMeReadRequest build() {
            Integer num;
            Integer num2 = this.f45351c;
            if (num2 != null && (num = this.f45354f) != null) {
                return new UpdateMessagesMeReadRequest(this.f45349a, this.f45350b, num2, this.f45352d, this.f45353e, num, this.f45355g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "max_position", this.f45354f, "max_position_badge_count");
        }

        /* renamed from: a */
        public C18154a mo62970a(Channel channel) {
            this.f45350b = channel;
            return this;
        }

        /* renamed from: b */
        public C18154a mo62975b(Integer num) {
            this.f45353e = num;
            return this;
        }

        /* renamed from: c */
        public C18154a mo62976c(Integer num) {
            this.f45354f = num;
            return this;
        }

        /* renamed from: d */
        public C18154a mo62977d(Integer num) {
            this.f45355g = num;
            return this;
        }

        /* renamed from: a */
        public C18154a mo62971a(Integer num) {
            this.f45351c = num;
            return this;
        }

        /* renamed from: a */
        public C18154a mo62972a(String str) {
            this.f45352d = str;
            return this;
        }

        /* renamed from: a */
        public C18154a mo62973a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45349a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18154a newBuilder() {
        C18154a aVar = new C18154a();
        aVar.f45349a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f45350b = this.channel;
        aVar.f45351c = this.max_position;
        aVar.f45352d = this.thread_id;
        aVar.f45353e = this.thread_max_position;
        aVar.f45354f = this.max_position_badge_count;
        aVar.f45355g = this.thread_max_position_badge_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateMessagesMeReadRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        sb.append(", max_position=");
        sb.append(this.max_position);
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.thread_max_position != null) {
            sb.append(", thread_max_position=");
            sb.append(this.thread_max_position);
        }
        sb.append(", max_position_badge_count=");
        sb.append(this.max_position_badge_count);
        if (this.thread_max_position_badge_count != null) {
            sb.append(", thread_max_position_badge_count=");
            sb.append(this.thread_max_position_badge_count);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateMessagesMeReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateMessagesMeReadRequest(List<String> list, Channel channel2, Integer num, String str, Integer num2, Integer num3, Integer num4) {
        this(list, channel2, num, str, num2, num3, num4, ByteString.EMPTY);
    }

    public UpdateMessagesMeReadRequest(List<String> list, Channel channel2, Integer num, String str, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
        this.channel = channel2;
        this.max_position = num;
        this.thread_id = str;
        this.thread_max_position = num2;
        this.max_position_badge_count = num3;
        this.thread_max_position_badge_count = num4;
    }
}
