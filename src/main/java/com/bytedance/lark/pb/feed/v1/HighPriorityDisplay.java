package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class HighPriorityDisplay extends Message<HighPriorityDisplay, C17194a> {
    public static final ProtoAdapter<HighPriorityDisplay> ADAPTER = new C17195b();
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final Long DEFAULT_RANK_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String content;
    public final Long display_time;
    public final Long rank_time;

    /* renamed from: com.bytedance.lark.pb.feed.v1.HighPriorityDisplay$b */
    private static final class C17195b extends ProtoAdapter<HighPriorityDisplay> {
        C17195b() {
            super(FieldEncoding.LENGTH_DELIMITED, HighPriorityDisplay.class);
        }

        /* renamed from: a */
        public int encodedSize(HighPriorityDisplay highPriorityDisplay) {
            int i;
            int i2;
            int i3 = 0;
            if (highPriorityDisplay.content != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, highPriorityDisplay.content);
            } else {
                i = 0;
            }
            if (highPriorityDisplay.rank_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, highPriorityDisplay.rank_time);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (highPriorityDisplay.display_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, highPriorityDisplay.display_time);
            }
            return i4 + i3 + highPriorityDisplay.unknownFields().size();
        }

        /* renamed from: a */
        public HighPriorityDisplay decode(ProtoReader protoReader) throws IOException {
            C17194a aVar = new C17194a();
            aVar.f43967a = "";
            aVar.f43968b = 0L;
            aVar.f43969c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43967a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43968b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43969c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HighPriorityDisplay highPriorityDisplay) throws IOException {
            if (highPriorityDisplay.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, highPriorityDisplay.content);
            }
            if (highPriorityDisplay.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, highPriorityDisplay.rank_time);
            }
            if (highPriorityDisplay.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, highPriorityDisplay.display_time);
            }
            protoWriter.writeBytes(highPriorityDisplay.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.HighPriorityDisplay$a */
    public static final class C17194a extends Message.Builder<HighPriorityDisplay, C17194a> {

        /* renamed from: a */
        public String f43967a;

        /* renamed from: b */
        public Long f43968b;

        /* renamed from: c */
        public Long f43969c;

        /* renamed from: a */
        public HighPriorityDisplay build() {
            return new HighPriorityDisplay(this.f43967a, this.f43968b, this.f43969c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17194a newBuilder() {
        C17194a aVar = new C17194a();
        aVar.f43967a = this.content;
        aVar.f43968b = this.rank_time;
        aVar.f43969c = this.display_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "HighPriorityDisplay");
        StringBuilder sb = new StringBuilder();
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        StringBuilder replace = sb.replace(0, 2, "HighPriorityDisplay{");
        replace.append('}');
        return replace.toString();
    }

    public HighPriorityDisplay(String str, Long l, Long l2) {
        this(str, l, l2, ByteString.EMPTY);
    }

    public HighPriorityDisplay(String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content = str;
        this.rank_time = l;
        this.display_time = l2;
    }
}
