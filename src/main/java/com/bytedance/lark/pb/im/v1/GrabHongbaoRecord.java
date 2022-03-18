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

public final class GrabHongbaoRecord extends Message<GrabHongbaoRecord, C17775a> {
    public static final ProtoAdapter<GrabHongbaoRecord> ADAPTER = new C17776b();
    public static final Long DEFAULT_GRAB_AMOUNT = 0L;
    public static final Long DEFAULT_GRAB_TIME = 0L;
    public static final Boolean DEFAULT_IS_P2P = false;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long grab_amount;
    public final Long grab_time;
    public final String id;
    public final Boolean is_p2p;
    public final String sender_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GrabHongbaoRecord$b */
    private static final class C17776b extends ProtoAdapter<GrabHongbaoRecord> {
        C17776b() {
            super(FieldEncoding.LENGTH_DELIMITED, GrabHongbaoRecord.class);
        }

        /* renamed from: a */
        public int encodedSize(GrabHongbaoRecord grabHongbaoRecord) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, grabHongbaoRecord.id) + ProtoAdapter.INT64.encodedSizeWithTag(2, grabHongbaoRecord.grab_amount) + ProtoAdapter.INT64.encodedSizeWithTag(3, grabHongbaoRecord.grab_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, grabHongbaoRecord.sender_id) + ProtoAdapter.BOOL.encodedSizeWithTag(5, grabHongbaoRecord.is_p2p);
            if (grabHongbaoRecord.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, grabHongbaoRecord.chat_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + grabHongbaoRecord.unknownFields().size();
        }

        /* renamed from: a */
        public GrabHongbaoRecord decode(ProtoReader protoReader) throws IOException {
            C17775a aVar = new C17775a();
            aVar.f44815a = "";
            aVar.f44816b = 0L;
            aVar.f44817c = 0L;
            aVar.f44818d = "";
            aVar.f44819e = false;
            aVar.f44820f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44815a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44816b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44817c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44818d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44819e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44820f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GrabHongbaoRecord grabHongbaoRecord) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, grabHongbaoRecord.id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, grabHongbaoRecord.grab_amount);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, grabHongbaoRecord.grab_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, grabHongbaoRecord.sender_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, grabHongbaoRecord.is_p2p);
            if (grabHongbaoRecord.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, grabHongbaoRecord.chat_id);
            }
            protoWriter.writeBytes(grabHongbaoRecord.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17775a newBuilder() {
        C17775a aVar = new C17775a();
        aVar.f44815a = this.id;
        aVar.f44816b = this.grab_amount;
        aVar.f44817c = this.grab_time;
        aVar.f44818d = this.sender_id;
        aVar.f44819e = this.is_p2p;
        aVar.f44820f = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GrabHongbaoRecord$a */
    public static final class C17775a extends Message.Builder<GrabHongbaoRecord, C17775a> {

        /* renamed from: a */
        public String f44815a;

        /* renamed from: b */
        public Long f44816b;

        /* renamed from: c */
        public Long f44817c;

        /* renamed from: d */
        public String f44818d;

        /* renamed from: e */
        public Boolean f44819e;

        /* renamed from: f */
        public String f44820f;

        /* renamed from: a */
        public GrabHongbaoRecord build() {
            Long l;
            Long l2;
            String str;
            Boolean bool;
            String str2 = this.f44815a;
            if (str2 != null && (l = this.f44816b) != null && (l2 = this.f44817c) != null && (str = this.f44818d) != null && (bool = this.f44819e) != null) {
                return new GrabHongbaoRecord(str2, l, l2, str, bool, this.f44820f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f44816b, "grab_amount", this.f44817c, "grab_time", this.f44818d, "sender_id", this.f44819e, "is_p2p");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GrabHongbaoRecord");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", grab_amount=");
        sb.append(this.grab_amount);
        sb.append(", grab_time=");
        sb.append(this.grab_time);
        sb.append(", sender_id=");
        sb.append(this.sender_id);
        sb.append(", is_p2p=");
        sb.append(this.is_p2p);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GrabHongbaoRecord{");
        replace.append('}');
        return replace.toString();
    }

    public GrabHongbaoRecord(String str, Long l, Long l2, String str2, Boolean bool, String str3) {
        this(str, l, l2, str2, bool, str3, ByteString.EMPTY);
    }

    public GrabHongbaoRecord(String str, Long l, Long l2, String str2, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.grab_amount = l;
        this.grab_time = l2;
        this.sender_id = str2;
        this.is_p2p = bool;
        this.chat_id = str3;
    }
}
