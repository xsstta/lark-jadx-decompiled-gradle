package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailData extends Message<MailData, C15047a> {
    public static final ProtoAdapter<MailData> ADAPTER = new C15048b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final Long create_time;
    public final String from_chatter_id;
    public final String label_id;
    public final String mail_account_id;
    public final String message_id;
    public final Integer new_message_count;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.basic.v1.MailData$b */
    private static final class C15048b extends ProtoAdapter<MailData> {
        C15048b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailData.class);
        }

        /* renamed from: a */
        public int encodedSize(MailData mailData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (mailData.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailData.message_id);
            } else {
                i = 0;
            }
            if (mailData.create_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, mailData.create_time);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (mailData.channel != null) {
                i3 = Channel.ADAPTER.encodedSizeWithTag(3, mailData.channel);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (mailData.thread_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailData.thread_id);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (mailData.new_message_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, mailData.new_message_count);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (mailData.from_chatter_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, mailData.from_chatter_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (mailData.label_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, mailData.label_id);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (mailData.mail_account_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, mailData.mail_account_id);
            }
            return i14 + i8 + mailData.unknownFields().size();
        }

        /* renamed from: a */
        public MailData decode(ProtoReader protoReader) throws IOException {
            C15047a aVar = new C15047a();
            aVar.f39800a = "";
            aVar.f39801b = 0L;
            aVar.f39803d = "";
            aVar.f39804e = 0;
            aVar.f39805f = "";
            aVar.f39806g = "";
            aVar.f39807h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39800a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39801b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39802c = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39803d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39804e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39805f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39806g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f39807h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MailData mailData) throws IOException {
            if (mailData.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailData.message_id);
            }
            if (mailData.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mailData.create_time);
            }
            if (mailData.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 3, mailData.channel);
            }
            if (mailData.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailData.thread_id);
            }
            if (mailData.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, mailData.new_message_count);
            }
            if (mailData.from_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, mailData.from_chatter_id);
            }
            if (mailData.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mailData.label_id);
            }
            if (mailData.mail_account_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, mailData.mail_account_id);
            }
            protoWriter.writeBytes(mailData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MailData$a */
    public static final class C15047a extends Message.Builder<MailData, C15047a> {

        /* renamed from: a */
        public String f39800a;

        /* renamed from: b */
        public Long f39801b;

        /* renamed from: c */
        public Channel f39802c;

        /* renamed from: d */
        public String f39803d;

        /* renamed from: e */
        public Integer f39804e;

        /* renamed from: f */
        public String f39805f;

        /* renamed from: g */
        public String f39806g;

        /* renamed from: h */
        public String f39807h;

        /* renamed from: a */
        public MailData build() {
            return new MailData(this.f39800a, this.f39801b, this.f39802c, this.f39803d, this.f39804e, this.f39805f, this.f39806g, this.f39807h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15047a newBuilder() {
        C15047a aVar = new C15047a();
        aVar.f39800a = this.message_id;
        aVar.f39801b = this.create_time;
        aVar.f39802c = this.channel;
        aVar.f39803d = this.thread_id;
        aVar.f39804e = this.new_message_count;
        aVar.f39805f = this.from_chatter_id;
        aVar.f39806g = this.label_id;
        aVar.f39807h = this.mail_account_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MailData");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.from_chatter_id != null) {
            sb.append(", from_chatter_id=");
            sb.append(this.from_chatter_id);
        }
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (this.mail_account_id != null) {
            sb.append(", mail_account_id=");
            sb.append(this.mail_account_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailData{");
        replace.append('}');
        return replace.toString();
    }

    public MailData(String str, Long l, Channel channel2, String str2, Integer num, String str3, String str4, String str5) {
        this(str, l, channel2, str2, num, str3, str4, str5, ByteString.EMPTY);
    }

    public MailData(String str, Long l, Channel channel2, String str2, Integer num, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.create_time = l;
        this.channel = channel2;
        this.thread_id = str2;
        this.new_message_count = num;
        this.from_chatter_id = str3;
        this.label_id = str4;
        this.mail_account_id = str5;
    }
}
