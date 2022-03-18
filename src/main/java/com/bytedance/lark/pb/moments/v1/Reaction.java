package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Reaction extends Message<Reaction, C18526a> {
    public static final ProtoAdapter<Reaction> ADAPTER = new C18527b();
    public static final Long DEFAULT_CREATE_TIME_MSEC = 0L;
    private static final long serialVersionUID = 0;
    public final Long create_time_msec;
    public final String type;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Reaction$b */
    private static final class C18527b extends ProtoAdapter<Reaction> {
        C18527b() {
            super(FieldEncoding.LENGTH_DELIMITED, Reaction.class);
        }

        /* renamed from: a */
        public int encodedSize(Reaction reaction) {
            int i;
            int i2;
            int i3 = 0;
            if (reaction.type != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, reaction.type);
            } else {
                i = 0;
            }
            if (reaction.user_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, reaction.user_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (reaction.create_time_msec != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, reaction.create_time_msec);
            }
            return i4 + i3 + reaction.unknownFields().size();
        }

        /* renamed from: a */
        public Reaction decode(ProtoReader protoReader) throws IOException {
            C18526a aVar = new C18526a();
            aVar.f46008a = "";
            aVar.f46009b = "";
            aVar.f46010c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46008a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46009b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46010c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Reaction reaction) throws IOException {
            if (reaction.type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reaction.type);
            }
            if (reaction.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, reaction.user_id);
            }
            if (reaction.create_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, reaction.create_time_msec);
            }
            protoWriter.writeBytes(reaction.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Reaction$a */
    public static final class C18526a extends Message.Builder<Reaction, C18526a> {

        /* renamed from: a */
        public String f46008a;

        /* renamed from: b */
        public String f46009b;

        /* renamed from: c */
        public Long f46010c;

        /* renamed from: a */
        public Reaction build() {
            return new Reaction(this.f46008a, this.f46009b, this.f46010c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18526a newBuilder() {
        C18526a aVar = new C18526a();
        aVar.f46008a = this.type;
        aVar.f46009b = this.user_id;
        aVar.f46010c = this.create_time_msec;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Reaction");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.create_time_msec != null) {
            sb.append(", create_time_msec=");
            sb.append(this.create_time_msec);
        }
        StringBuilder replace = sb.replace(0, 2, "Reaction{");
        replace.append('}');
        return replace.toString();
    }

    public Reaction(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public Reaction(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = str;
        this.user_id = str2;
        this.create_time_msec = l;
    }
}
