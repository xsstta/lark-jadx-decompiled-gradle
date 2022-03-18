package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushShareCountLocalNotification extends Message<PushShareCountLocalNotification, C18520a> {
    public static final ProtoAdapter<PushShareCountLocalNotification> ADAPTER = new C18521b();
    public static final Integer DEFAULT_SHARE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final String post_id;
    public final Integer share_count;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushShareCountLocalNotification$b */
    private static final class C18521b extends ProtoAdapter<PushShareCountLocalNotification> {
        C18521b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushShareCountLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushShareCountLocalNotification pushShareCountLocalNotification) {
            int i;
            int i2 = 0;
            if (pushShareCountLocalNotification.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushShareCountLocalNotification.post_id);
            } else {
                i = 0;
            }
            if (pushShareCountLocalNotification.share_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pushShareCountLocalNotification.share_count);
            }
            return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, pushShareCountLocalNotification.category_ids) + pushShareCountLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushShareCountLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18520a aVar = new C18520a();
            aVar.f45999a = "";
            aVar.f46000b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45999a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46000b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46001c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushShareCountLocalNotification pushShareCountLocalNotification) throws IOException {
            if (pushShareCountLocalNotification.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushShareCountLocalNotification.post_id);
            }
            if (pushShareCountLocalNotification.share_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushShareCountLocalNotification.share_count);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, pushShareCountLocalNotification.category_ids);
            protoWriter.writeBytes(pushShareCountLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushShareCountLocalNotification$a */
    public static final class C18520a extends Message.Builder<PushShareCountLocalNotification, C18520a> {

        /* renamed from: a */
        public String f45999a;

        /* renamed from: b */
        public Integer f46000b;

        /* renamed from: c */
        public List<String> f46001c = Internal.newMutableList();

        /* renamed from: a */
        public PushShareCountLocalNotification build() {
            return new PushShareCountLocalNotification(this.f45999a, this.f46000b, this.f46001c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18520a newBuilder() {
        C18520a aVar = new C18520a();
        aVar.f45999a = this.post_id;
        aVar.f46000b = this.share_count;
        aVar.f46001c = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushShareCountLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.share_count != null) {
            sb.append(", share_count=");
            sb.append(this.share_count);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushShareCountLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushShareCountLocalNotification(String str, Integer num, List<String> list) {
        this(str, num, list, ByteString.EMPTY);
    }

    public PushShareCountLocalNotification(String str, Integer num, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.share_count = num;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
    }
}
