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

public final class PushEventShareToChatNotification extends Message<PushEventShareToChatNotification, C15954a> {
    public static final ProtoAdapter<PushEventShareToChatNotification> ADAPTER = new C15955b();
    public static final Boolean DEFAULT_IS_SUCCESS = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String failed_chat_name;
    public final Boolean is_success;
    public final String key;
    public final Long original_time;
    public final String share_to_chat_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushEventShareToChatNotification$b */
    private static final class C15955b extends ProtoAdapter<PushEventShareToChatNotification> {
        C15955b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushEventShareToChatNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushEventShareToChatNotification pushEventShareToChatNotification) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushEventShareToChatNotification.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, pushEventShareToChatNotification.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, pushEventShareToChatNotification.original_time) + ProtoAdapter.STRING.encodedSizeWithTag(4, pushEventShareToChatNotification.share_to_chat_id) + ProtoAdapter.BOOL.encodedSizeWithTag(5, pushEventShareToChatNotification.is_success);
            if (pushEventShareToChatNotification.failed_chat_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, pushEventShareToChatNotification.failed_chat_name);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushEventShareToChatNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushEventShareToChatNotification decode(ProtoReader protoReader) throws IOException {
            C15954a aVar = new C15954a();
            aVar.f41948a = "";
            aVar.f41949b = "";
            aVar.f41950c = 0L;
            aVar.f41951d = "";
            aVar.f41952e = false;
            aVar.f41953f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41948a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41949b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41950c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41951d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41952e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41953f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PushEventShareToChatNotification pushEventShareToChatNotification) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushEventShareToChatNotification.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushEventShareToChatNotification.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pushEventShareToChatNotification.original_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushEventShareToChatNotification.share_to_chat_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pushEventShareToChatNotification.is_success);
            if (pushEventShareToChatNotification.failed_chat_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pushEventShareToChatNotification.failed_chat_name);
            }
            protoWriter.writeBytes(pushEventShareToChatNotification.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15954a newBuilder() {
        C15954a aVar = new C15954a();
        aVar.f41948a = this.calendar_id;
        aVar.f41949b = this.key;
        aVar.f41950c = this.original_time;
        aVar.f41951d = this.share_to_chat_id;
        aVar.f41952e = this.is_success;
        aVar.f41953f = this.failed_chat_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushEventShareToChatNotification$a */
    public static final class C15954a extends Message.Builder<PushEventShareToChatNotification, C15954a> {

        /* renamed from: a */
        public String f41948a;

        /* renamed from: b */
        public String f41949b;

        /* renamed from: c */
        public Long f41950c;

        /* renamed from: d */
        public String f41951d;

        /* renamed from: e */
        public Boolean f41952e;

        /* renamed from: f */
        public String f41953f;

        /* renamed from: a */
        public PushEventShareToChatNotification build() {
            String str;
            Long l;
            String str2;
            Boolean bool;
            String str3 = this.f41948a;
            if (str3 != null && (str = this.f41949b) != null && (l = this.f41950c) != null && (str2 = this.f41951d) != null && (bool = this.f41952e) != null) {
                return new PushEventShareToChatNotification(str3, str, l, str2, bool, this.f41953f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "calendar_id", this.f41949b, "key", this.f41950c, "original_time", this.f41951d, "share_to_chat_id", this.f41952e, "is_success");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushEventShareToChatNotification");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        sb.append(", share_to_chat_id=");
        sb.append(this.share_to_chat_id);
        sb.append(", is_success=");
        sb.append(this.is_success);
        if (this.failed_chat_name != null) {
            sb.append(", failed_chat_name=");
            sb.append(this.failed_chat_name);
        }
        StringBuilder replace = sb.replace(0, 2, "PushEventShareToChatNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushEventShareToChatNotification(String str, String str2, Long l, String str3, Boolean bool, String str4) {
        this(str, str2, l, str3, bool, str4, ByteString.EMPTY);
    }

    public PushEventShareToChatNotification(String str, String str2, Long l, String str3, Boolean bool, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.share_to_chat_id = str3;
        this.is_success = bool;
        this.failed_chat_name = str4;
    }
}
