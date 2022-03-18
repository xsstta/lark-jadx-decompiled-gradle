package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UrgentInfo extends Message<UrgentInfo, C17250a> {
    public static final ProtoAdapter<UrgentInfo> ADAPTER = new C17251b();
    public static final Long DEFAULT_DISPLAY_TIME = 0L;
    public static final Long DEFAULT_RANK_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long display_time;
    public final Long rank_time;
    public final String urgent_content;

    /* renamed from: com.bytedance.lark.pb.feed.v1.UrgentInfo$b */
    private static final class C17251b extends ProtoAdapter<UrgentInfo> {
        C17251b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrgentInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UrgentInfo urgentInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (urgentInfo.rank_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, urgentInfo.rank_time);
            } else {
                i = 0;
            }
            if (urgentInfo.display_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, urgentInfo.display_time);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (urgentInfo.urgent_content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, urgentInfo.urgent_content);
            }
            return i4 + i3 + urgentInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UrgentInfo decode(ProtoReader protoReader) throws IOException {
            C17250a aVar = new C17250a();
            aVar.f44075a = 0L;
            aVar.f44076b = 0L;
            aVar.f44077c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44075a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44076b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44077c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UrgentInfo urgentInfo) throws IOException {
            if (urgentInfo.rank_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, urgentInfo.rank_time);
            }
            if (urgentInfo.display_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, urgentInfo.display_time);
            }
            if (urgentInfo.urgent_content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, urgentInfo.urgent_content);
            }
            protoWriter.writeBytes(urgentInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.UrgentInfo$a */
    public static final class C17250a extends Message.Builder<UrgentInfo, C17250a> {

        /* renamed from: a */
        public Long f44075a;

        /* renamed from: b */
        public Long f44076b;

        /* renamed from: c */
        public String f44077c;

        /* renamed from: a */
        public UrgentInfo build() {
            return new UrgentInfo(this.f44075a, this.f44076b, this.f44077c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17250a newBuilder() {
        C17250a aVar = new C17250a();
        aVar.f44075a = this.rank_time;
        aVar.f44076b = this.display_time;
        aVar.f44077c = this.urgent_content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "UrgentInfo");
        StringBuilder sb = new StringBuilder();
        if (this.rank_time != null) {
            sb.append(", rank_time=");
            sb.append(this.rank_time);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        if (this.urgent_content != null) {
            sb.append(", urgent_content=");
            sb.append(this.urgent_content);
        }
        StringBuilder replace = sb.replace(0, 2, "UrgentInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UrgentInfo(Long l, Long l2, String str) {
        this(l, l2, str, ByteString.EMPTY);
    }

    public UrgentInfo(Long l, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rank_time = l;
        this.display_time = l2;
        this.urgent_content = str;
    }
}
