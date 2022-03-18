package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailOutboxStateChangeResponse extends Message<MailOutboxStateChangeResponse, C16852a> {
    public static final ProtoAdapter<MailOutboxStateChangeResponse> ADAPTER = new C16853b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Message.DeliveryState DEFAULT_DELIVERY_STATE = Message.DeliveryState.UNKNOWN_DELIVERY_STATE;
    public static final Long DEFAULT_LAST_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Message.DeliveryState delivery_state;
    public final Long last_update_time;
    public final String message_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailOutboxStateChangeResponse$b */
    private static final class C16853b extends ProtoAdapter<MailOutboxStateChangeResponse> {
        C16853b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailOutboxStateChangeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailOutboxStateChangeResponse mailOutboxStateChangeResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (mailOutboxStateChangeResponse.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailOutboxStateChangeResponse.thread_id);
            } else {
                i = 0;
            }
            if (mailOutboxStateChangeResponse.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailOutboxStateChangeResponse.message_id);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (mailOutboxStateChangeResponse.delivery_state != null) {
                i3 = Message.DeliveryState.ADAPTER.encodedSizeWithTag(3, mailOutboxStateChangeResponse.delivery_state);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (mailOutboxStateChangeResponse.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, mailOutboxStateChangeResponse.count);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (mailOutboxStateChangeResponse.last_update_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, mailOutboxStateChangeResponse.last_update_time);
            }
            return i8 + i5 + mailOutboxStateChangeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailOutboxStateChangeResponse decode(ProtoReader protoReader) throws IOException {
            C16852a aVar = new C16852a();
            aVar.f43316a = "";
            aVar.f43317b = "";
            aVar.f43318c = Message.DeliveryState.UNKNOWN_DELIVERY_STATE;
            aVar.f43319d = 0;
            aVar.f43320e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43316a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43317b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f43318c = Message.DeliveryState.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f43319d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43320e = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailOutboxStateChangeResponse mailOutboxStateChangeResponse) throws IOException {
            if (mailOutboxStateChangeResponse.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailOutboxStateChangeResponse.thread_id);
            }
            if (mailOutboxStateChangeResponse.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailOutboxStateChangeResponse.message_id);
            }
            if (mailOutboxStateChangeResponse.delivery_state != null) {
                Message.DeliveryState.ADAPTER.encodeWithTag(protoWriter, 3, mailOutboxStateChangeResponse.delivery_state);
            }
            if (mailOutboxStateChangeResponse.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, mailOutboxStateChangeResponse.count);
            }
            if (mailOutboxStateChangeResponse.last_update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, mailOutboxStateChangeResponse.last_update_time);
            }
            protoWriter.writeBytes(mailOutboxStateChangeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailOutboxStateChangeResponse$a */
    public static final class C16852a extends Message.Builder<MailOutboxStateChangeResponse, C16852a> {

        /* renamed from: a */
        public String f43316a;

        /* renamed from: b */
        public String f43317b;

        /* renamed from: c */
        public Message.DeliveryState f43318c;

        /* renamed from: d */
        public Integer f43319d;

        /* renamed from: e */
        public Long f43320e;

        /* renamed from: a */
        public MailOutboxStateChangeResponse build() {
            return new MailOutboxStateChangeResponse(this.f43316a, this.f43317b, this.f43318c, this.f43319d, this.f43320e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16852a newBuilder() {
        C16852a aVar = new C16852a();
        aVar.f43316a = this.thread_id;
        aVar.f43317b = this.message_id;
        aVar.f43318c = this.delivery_state;
        aVar.f43319d = this.count;
        aVar.f43320e = this.last_update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailOutboxStateChangeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.delivery_state != null) {
            sb.append(", delivery_state=");
            sb.append(this.delivery_state);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.last_update_time != null) {
            sb.append(", last_update_time=");
            sb.append(this.last_update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "MailOutboxStateChangeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailOutboxStateChangeResponse(String str, String str2, Message.DeliveryState deliveryState, Integer num, Long l) {
        this(str, str2, deliveryState, num, l, ByteString.EMPTY);
    }

    public MailOutboxStateChangeResponse(String str, String str2, Message.DeliveryState deliveryState, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.message_id = str2;
        this.delivery_state = deliveryState;
        this.count = num;
        this.last_update_time = l;
    }
}
