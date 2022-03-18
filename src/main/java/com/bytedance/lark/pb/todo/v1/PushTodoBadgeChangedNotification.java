package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushTodoBadgeChangedNotification extends Message<PushTodoBadgeChangedNotification, C19597a> {
    public static final ProtoAdapter<PushTodoBadgeChangedNotification> ADAPTER = new C19598b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoBadgeChangedNotification$b */
    private static final class C19598b extends ProtoAdapter<PushTodoBadgeChangedNotification> {
        C19598b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTodoBadgeChangedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTodoBadgeChangedNotification pushTodoBadgeChangedNotification) {
            int i;
            if (pushTodoBadgeChangedNotification.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, pushTodoBadgeChangedNotification.count);
            } else {
                i = 0;
            }
            return i + pushTodoBadgeChangedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushTodoBadgeChangedNotification decode(ProtoReader protoReader) throws IOException {
            C19597a aVar = new C19597a();
            aVar.f47946a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47946a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTodoBadgeChangedNotification pushTodoBadgeChangedNotification) throws IOException {
            if (pushTodoBadgeChangedNotification.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, pushTodoBadgeChangedNotification.count);
            }
            protoWriter.writeBytes(pushTodoBadgeChangedNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.PushTodoBadgeChangedNotification$a */
    public static final class C19597a extends Message.Builder<PushTodoBadgeChangedNotification, C19597a> {

        /* renamed from: a */
        public Integer f47946a;

        /* renamed from: a */
        public PushTodoBadgeChangedNotification build() {
            return new PushTodoBadgeChangedNotification(this.f47946a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19597a newBuilder() {
        C19597a aVar = new C19597a();
        aVar.f47946a = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "PushTodoBadgeChangedNotification");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "PushTodoBadgeChangedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushTodoBadgeChangedNotification(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public PushTodoBadgeChangedNotification(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
    }
}
