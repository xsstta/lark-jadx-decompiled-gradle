package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DocFeedData extends Message<DocFeedData, C14876a> {
    public static final ProtoAdapter<DocFeedData> ADAPTER = new C14877b();
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final Channel channel;
    public final Long create_time;
    public final String from_chatter_id;
    public final String message_id;
    public final Integer new_message_count;

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocFeedData$b */
    private static final class C14877b extends ProtoAdapter<DocFeedData> {
        C14877b() {
            super(FieldEncoding.LENGTH_DELIMITED, DocFeedData.class);
        }

        /* renamed from: a */
        public int encodedSize(DocFeedData docFeedData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (docFeedData.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, docFeedData.message_id);
            } else {
                i = 0;
            }
            if (docFeedData.create_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, docFeedData.create_time);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (docFeedData.channel != null) {
                i3 = Channel.ADAPTER.encodedSizeWithTag(3, docFeedData.channel);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (docFeedData.from_chatter_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, docFeedData.from_chatter_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (docFeedData.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, docFeedData.avatar_key);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (docFeedData.new_message_count != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, docFeedData.new_message_count);
            }
            return i10 + i6 + docFeedData.unknownFields().size();
        }

        /* renamed from: a */
        public DocFeedData decode(ProtoReader protoReader) throws IOException {
            C14876a aVar = new C14876a();
            aVar.f39350a = "";
            aVar.f39351b = 0L;
            aVar.f39353d = "";
            aVar.f39354e = "";
            aVar.f39355f = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39350a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39351b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39352c = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39353d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39354e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39355f = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DocFeedData docFeedData) throws IOException {
            if (docFeedData.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docFeedData.message_id);
            }
            if (docFeedData.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, docFeedData.create_time);
            }
            if (docFeedData.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 3, docFeedData.channel);
            }
            if (docFeedData.from_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, docFeedData.from_chatter_id);
            }
            if (docFeedData.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, docFeedData.avatar_key);
            }
            if (docFeedData.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, docFeedData.new_message_count);
            }
            protoWriter.writeBytes(docFeedData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DocFeedData$a */
    public static final class C14876a extends Message.Builder<DocFeedData, C14876a> {

        /* renamed from: a */
        public String f39350a;

        /* renamed from: b */
        public Long f39351b;

        /* renamed from: c */
        public Channel f39352c;

        /* renamed from: d */
        public String f39353d;

        /* renamed from: e */
        public String f39354e;

        /* renamed from: f */
        public Integer f39355f;

        /* renamed from: a */
        public DocFeedData build() {
            return new DocFeedData(this.f39350a, this.f39351b, this.f39352c, this.f39353d, this.f39354e, this.f39355f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14876a newBuilder() {
        C14876a aVar = new C14876a();
        aVar.f39350a = this.message_id;
        aVar.f39351b = this.create_time;
        aVar.f39352c = this.channel;
        aVar.f39353d = this.from_chatter_id;
        aVar.f39354e = this.avatar_key;
        aVar.f39355f = this.new_message_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DocFeedData");
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
        if (this.from_chatter_id != null) {
            sb.append(", from_chatter_id=");
            sb.append(this.from_chatter_id);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        StringBuilder replace = sb.replace(0, 2, "DocFeedData{");
        replace.append('}');
        return replace.toString();
    }

    public DocFeedData(String str, Long l, Channel channel2, String str2, String str3, Integer num) {
        this(str, l, channel2, str2, str3, num, ByteString.EMPTY);
    }

    public DocFeedData(String str, Long l, Channel channel2, String str2, String str3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.create_time = l;
        this.channel = channel2;
        this.from_chatter_id = str2;
        this.avatar_key = str3;
        this.new_message_count = num;
    }
}
