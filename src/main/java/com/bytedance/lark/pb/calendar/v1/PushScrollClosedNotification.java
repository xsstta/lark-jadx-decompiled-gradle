package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushScrollClosedNotification extends Message<PushScrollClosedNotification, C15966a> {
    public static final ProtoAdapter<PushScrollClosedNotification> ADAPTER = new C15967b();
    public static final ScrollType DEFAULT_SCROLL_TYPE = ScrollType.EVENT_INFO;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final ScrollType scroll_type;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushScrollClosedNotification$b */
    private static final class C15967b extends ProtoAdapter<PushScrollClosedNotification> {
        C15967b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushScrollClosedNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushScrollClosedNotification pushScrollClosedNotification) {
            return ScrollType.ADAPTER.encodedSizeWithTag(1, pushScrollClosedNotification.scroll_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, pushScrollClosedNotification.chat_id) + pushScrollClosedNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushScrollClosedNotification decode(ProtoReader protoReader) throws IOException {
            C15966a aVar = new C15966a();
            aVar.f41968a = ScrollType.EVENT_INFO;
            aVar.f41969b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f41968a = ScrollType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41969b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushScrollClosedNotification pushScrollClosedNotification) throws IOException {
            ScrollType.ADAPTER.encodeWithTag(protoWriter, 1, pushScrollClosedNotification.scroll_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushScrollClosedNotification.chat_id);
            protoWriter.writeBytes(pushScrollClosedNotification.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15966a newBuilder() {
        C15966a aVar = new C15966a();
        aVar.f41968a = this.scroll_type;
        aVar.f41969b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushScrollClosedNotification$a */
    public static final class C15966a extends Message.Builder<PushScrollClosedNotification, C15966a> {

        /* renamed from: a */
        public ScrollType f41968a;

        /* renamed from: b */
        public String f41969b;

        /* renamed from: a */
        public PushScrollClosedNotification build() {
            String str;
            ScrollType scrollType = this.f41968a;
            if (scrollType != null && (str = this.f41969b) != null) {
                return new PushScrollClosedNotification(scrollType, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(scrollType, "scroll_type", this.f41969b, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushScrollClosedNotification");
        StringBuilder sb = new StringBuilder();
        sb.append(", scroll_type=");
        sb.append(this.scroll_type);
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "PushScrollClosedNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushScrollClosedNotification(ScrollType scrollType, String str) {
        this(scrollType, str, ByteString.EMPTY);
    }

    public PushScrollClosedNotification(ScrollType scrollType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scroll_type = scrollType;
        this.chat_id = str;
    }
}
