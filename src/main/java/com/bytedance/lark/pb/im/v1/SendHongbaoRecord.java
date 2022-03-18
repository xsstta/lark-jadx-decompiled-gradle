package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SendHongbaoRecord extends Message<SendHongbaoRecord, C18017a> {
    public static final ProtoAdapter<SendHongbaoRecord> ADAPTER = new C18018b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_GRAB_NUM = 0;
    public static final Boolean DEFAULT_IS_EXPIRED = false;
    public static final Boolean DEFAULT_IS_P2P = false;
    public static final Long DEFAULT_TOTAL_AMOUNT = 0L;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long create_time;
    public final Integer grab_num;
    public final String id;
    public final Boolean is_expired;
    public final Boolean is_p2p;
    public final String receiver_id;
    public final Long total_amount;
    public final Integer total_num;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendHongbaoRecord$b */
    private static final class C18018b extends ProtoAdapter<SendHongbaoRecord> {
        C18018b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendHongbaoRecord.class);
        }

        /* renamed from: a */
        public int encodedSize(SendHongbaoRecord sendHongbaoRecord) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, sendHongbaoRecord.id) + ProtoAdapter.INT64.encodedSizeWithTag(2, sendHongbaoRecord.total_amount) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendHongbaoRecord.create_time) + ProtoAdapter.INT32.encodedSizeWithTag(4, sendHongbaoRecord.total_num) + ProtoAdapter.INT32.encodedSizeWithTag(5, sendHongbaoRecord.grab_num) + ProtoAdapter.BOOL.encodedSizeWithTag(6, sendHongbaoRecord.is_expired) + ProtoAdapter.BOOL.encodedSizeWithTag(7, sendHongbaoRecord.is_p2p);
            int i2 = 0;
            if (sendHongbaoRecord.receiver_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(8, sendHongbaoRecord.receiver_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (sendHongbaoRecord.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(9, sendHongbaoRecord.chat_id);
            }
            return i3 + i2 + sendHongbaoRecord.unknownFields().size();
        }

        /* renamed from: a */
        public SendHongbaoRecord decode(ProtoReader protoReader) throws IOException {
            C18017a aVar = new C18017a();
            aVar.f45122a = "";
            aVar.f45123b = 0L;
            aVar.f45124c = 0L;
            aVar.f45125d = 0;
            aVar.f45126e = 0;
            aVar.f45127f = false;
            aVar.f45128g = false;
            aVar.f45129h = "";
            aVar.f45130i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45122a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45123b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45124c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45125d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45126e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45127f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45128g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45129h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f45130i = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SendHongbaoRecord sendHongbaoRecord) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendHongbaoRecord.id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, sendHongbaoRecord.total_amount);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendHongbaoRecord.create_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, sendHongbaoRecord.total_num);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, sendHongbaoRecord.grab_num);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, sendHongbaoRecord.is_expired);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, sendHongbaoRecord.is_p2p);
            if (sendHongbaoRecord.receiver_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, sendHongbaoRecord.receiver_id);
            }
            if (sendHongbaoRecord.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, sendHongbaoRecord.chat_id);
            }
            protoWriter.writeBytes(sendHongbaoRecord.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18017a newBuilder() {
        C18017a aVar = new C18017a();
        aVar.f45122a = this.id;
        aVar.f45123b = this.total_amount;
        aVar.f45124c = this.create_time;
        aVar.f45125d = this.total_num;
        aVar.f45126e = this.grab_num;
        aVar.f45127f = this.is_expired;
        aVar.f45128g = this.is_p2p;
        aVar.f45129h = this.receiver_id;
        aVar.f45130i = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendHongbaoRecord$a */
    public static final class C18017a extends Message.Builder<SendHongbaoRecord, C18017a> {

        /* renamed from: a */
        public String f45122a;

        /* renamed from: b */
        public Long f45123b;

        /* renamed from: c */
        public Long f45124c;

        /* renamed from: d */
        public Integer f45125d;

        /* renamed from: e */
        public Integer f45126e;

        /* renamed from: f */
        public Boolean f45127f;

        /* renamed from: g */
        public Boolean f45128g;

        /* renamed from: h */
        public String f45129h;

        /* renamed from: i */
        public String f45130i;

        /* renamed from: a */
        public SendHongbaoRecord build() {
            Long l;
            Long l2;
            Integer num;
            Integer num2;
            Boolean bool;
            Boolean bool2;
            String str = this.f45122a;
            if (str != null && (l = this.f45123b) != null && (l2 = this.f45124c) != null && (num = this.f45125d) != null && (num2 = this.f45126e) != null && (bool = this.f45127f) != null && (bool2 = this.f45128g) != null) {
                return new SendHongbaoRecord(str, l, l2, num, num2, bool, bool2, this.f45129h, this.f45130i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f45123b, "total_amount", this.f45124c, "create_time", this.f45125d, "total_num", this.f45126e, "grab_num", this.f45127f, "is_expired", this.f45128g, "is_p2p");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendHongbaoRecord");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", total_amount=");
        sb.append(this.total_amount);
        sb.append(", create_time=");
        sb.append(this.create_time);
        sb.append(", total_num=");
        sb.append(this.total_num);
        sb.append(", grab_num=");
        sb.append(this.grab_num);
        sb.append(", is_expired=");
        sb.append(this.is_expired);
        sb.append(", is_p2p=");
        sb.append(this.is_p2p);
        if (this.receiver_id != null) {
            sb.append(", receiver_id=");
            sb.append(this.receiver_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SendHongbaoRecord{");
        replace.append('}');
        return replace.toString();
    }

    public SendHongbaoRecord(String str, Long l, Long l2, Integer num, Integer num2, Boolean bool, Boolean bool2, String str2, String str3) {
        this(str, l, l2, num, num2, bool, bool2, str2, str3, ByteString.EMPTY);
    }

    public SendHongbaoRecord(String str, Long l, Long l2, Integer num, Integer num2, Boolean bool, Boolean bool2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.total_amount = l;
        this.create_time = l2;
        this.total_num = num;
        this.grab_num = num2;
        this.is_expired = bool;
        this.is_p2p = bool2;
        this.receiver_id = str2;
        this.chat_id = str3;
    }
}
