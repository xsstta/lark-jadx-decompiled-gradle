package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.bytedance.lark.pb.search.v1.SearchAtInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ThreadMeta extends Message<ThreadMeta, C19045a> {
    public static final ProtoAdapter<ThreadMeta> ADAPTER = new C19046b();
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_NO_BADGED_NEW_MESSAGE_COUNT = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final SearchAtInfo at_info;
    public final Channel channel;
    public final String chat_id;
    public final String id;
    public final Integer new_message_count;
    public final Integer no_badged_new_message_count;
    public final String topic;
    public final Long update_time;

    /* renamed from: com.bytedance.lark.pb.search.v2.ThreadMeta$b */
    private static final class C19046b extends ProtoAdapter<ThreadMeta> {
        C19046b() {
            super(FieldEncoding.LENGTH_DELIMITED, ThreadMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ThreadMeta threadMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, threadMeta.id);
            int i7 = 0;
            if (threadMeta.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, threadMeta.chat_id);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (threadMeta.channel != null) {
                i2 = Channel.ADAPTER.encodedSizeWithTag(3, threadMeta.channel);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (threadMeta.topic != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, threadMeta.topic);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (threadMeta.new_message_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, threadMeta.new_message_count);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (threadMeta.no_badged_new_message_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, threadMeta.no_badged_new_message_count);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (threadMeta.update_time != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(7, threadMeta.update_time);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (threadMeta.at_info != null) {
                i7 = SearchAtInfo.ADAPTER.encodedSizeWithTag(8, threadMeta.at_info);
            }
            return i13 + i7 + threadMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ThreadMeta decode(ProtoReader protoReader) throws IOException {
            C19045a aVar = new C19045a();
            aVar.f47110a = "";
            aVar.f47111b = "";
            aVar.f47113d = "";
            aVar.f47114e = 0;
            aVar.f47115f = 0;
            aVar.f47116g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47110a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47111b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47112c = Channel.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47113d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47114e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47115f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47116g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47117h = SearchAtInfo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ThreadMeta threadMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, threadMeta.id);
            if (threadMeta.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, threadMeta.chat_id);
            }
            if (threadMeta.channel != null) {
                Channel.ADAPTER.encodeWithTag(protoWriter, 3, threadMeta.channel);
            }
            if (threadMeta.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, threadMeta.topic);
            }
            if (threadMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, threadMeta.new_message_count);
            }
            if (threadMeta.no_badged_new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, threadMeta.no_badged_new_message_count);
            }
            if (threadMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, threadMeta.update_time);
            }
            if (threadMeta.at_info != null) {
                SearchAtInfo.ADAPTER.encodeWithTag(protoWriter, 8, threadMeta.at_info);
            }
            protoWriter.writeBytes(threadMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ThreadMeta$a */
    public static final class C19045a extends Message.Builder<ThreadMeta, C19045a> {

        /* renamed from: a */
        public String f47110a;

        /* renamed from: b */
        public String f47111b;

        /* renamed from: c */
        public Channel f47112c;

        /* renamed from: d */
        public String f47113d;

        /* renamed from: e */
        public Integer f47114e;

        /* renamed from: f */
        public Integer f47115f;

        /* renamed from: g */
        public Long f47116g;

        /* renamed from: h */
        public SearchAtInfo f47117h;

        /* renamed from: a */
        public ThreadMeta build() {
            String str = this.f47110a;
            if (str != null) {
                return new ThreadMeta(str, this.f47111b, this.f47112c, this.f47113d, this.f47114e, this.f47115f, this.f47116g, this.f47117h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C19045a newBuilder() {
        C19045a aVar = new C19045a();
        aVar.f47110a = this.id;
        aVar.f47111b = this.chat_id;
        aVar.f47112c = this.channel;
        aVar.f47113d = this.topic;
        aVar.f47114e = this.new_message_count;
        aVar.f47115f = this.no_badged_new_message_count;
        aVar.f47116g = this.update_time;
        aVar.f47117h = this.at_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ThreadMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.no_badged_new_message_count != null) {
            sb.append(", no_badged_new_message_count=");
            sb.append(this.no_badged_new_message_count);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.at_info != null) {
            sb.append(", at_info=");
            sb.append(this.at_info);
        }
        StringBuilder replace = sb.replace(0, 2, "ThreadMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ThreadMeta(String str, String str2, Channel channel2, String str3, Integer num, Integer num2, Long l, SearchAtInfo searchAtInfo) {
        this(str, str2, channel2, str3, num, num2, l, searchAtInfo, ByteString.EMPTY);
    }

    public ThreadMeta(String str, String str2, Channel channel2, String str3, Integer num, Integer num2, Long l, SearchAtInfo searchAtInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.chat_id = str2;
        this.channel = channel2;
        this.topic = str3;
        this.new_message_count = num;
        this.no_badged_new_message_count = num2;
        this.update_time = l;
        this.at_info = searchAtInfo;
    }
}
