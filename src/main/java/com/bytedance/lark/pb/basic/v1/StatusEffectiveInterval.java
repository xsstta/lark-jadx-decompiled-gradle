package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class StatusEffectiveInterval extends Message<StatusEffectiveInterval, C15294a> {
    public static final ProtoAdapter<StatusEffectiveInterval> ADAPTER = new C15295b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_SHOW_END_TIME = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final Boolean is_show_end_time;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval$b */
    private static final class C15295b extends ProtoAdapter<StatusEffectiveInterval> {
        C15295b() {
            super(FieldEncoding.LENGTH_DELIMITED, StatusEffectiveInterval.class);
        }

        /* renamed from: a */
        public int encodedSize(StatusEffectiveInterval statusEffectiveInterval) {
            int i;
            int i2;
            int i3 = 0;
            if (statusEffectiveInterval.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, statusEffectiveInterval.start_time);
            } else {
                i = 0;
            }
            if (statusEffectiveInterval.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, statusEffectiveInterval.end_time);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (statusEffectiveInterval.is_show_end_time != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, statusEffectiveInterval.is_show_end_time);
            }
            return i4 + i3 + statusEffectiveInterval.unknownFields().size();
        }

        /* renamed from: a */
        public StatusEffectiveInterval decode(ProtoReader protoReader) throws IOException {
            C15294a aVar = new C15294a();
            aVar.f40498a = 0L;
            aVar.f40499b = 0L;
            aVar.f40500c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40498a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40499b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40500c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, StatusEffectiveInterval statusEffectiveInterval) throws IOException {
            if (statusEffectiveInterval.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, statusEffectiveInterval.start_time);
            }
            if (statusEffectiveInterval.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, statusEffectiveInterval.end_time);
            }
            if (statusEffectiveInterval.is_show_end_time != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, statusEffectiveInterval.is_show_end_time);
            }
            protoWriter.writeBytes(statusEffectiveInterval.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval$a */
    public static final class C15294a extends Message.Builder<StatusEffectiveInterval, C15294a> {

        /* renamed from: a */
        public Long f40498a;

        /* renamed from: b */
        public Long f40499b;

        /* renamed from: c */
        public Boolean f40500c;

        /* renamed from: a */
        public StatusEffectiveInterval build() {
            return new StatusEffectiveInterval(this.f40498a, this.f40499b, this.f40500c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15294a mo55637a(Boolean bool) {
            this.f40500c = bool;
            return this;
        }

        /* renamed from: b */
        public C15294a mo55640b(Long l) {
            this.f40499b = l;
            return this;
        }

        /* renamed from: a */
        public C15294a mo55638a(Long l) {
            this.f40498a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15294a newBuilder() {
        C15294a aVar = new C15294a();
        aVar.f40498a = this.start_time;
        aVar.f40499b = this.end_time;
        aVar.f40500c = this.is_show_end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "StatusEffectiveInterval");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.is_show_end_time != null) {
            sb.append(", is_show_end_time=");
            sb.append(this.is_show_end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "StatusEffectiveInterval{");
        replace.append('}');
        return replace.toString();
    }

    public StatusEffectiveInterval(Long l, Long l2, Boolean bool) {
        this(l, l2, bool, ByteString.EMPTY);
    }

    public StatusEffectiveInterval(Long l, Long l2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.is_show_end_time = bool;
    }
}
