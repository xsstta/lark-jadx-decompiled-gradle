package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushChatTimeTipNotify extends Message<PushChatTimeTipNotify, C17879a> {
    public static final ProtoAdapter<PushChatTimeTipNotify> ADAPTER = new C17880b();
    public static final TimeTipStatus DEFAULT_STATUS = TimeTipStatus.START;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String copy_writing;
    public final TimeTipStatus status;

    public enum TimeTipStatus implements WireEnum {
        START(0),
        UPDATE(1),
        END(2);
        
        public static final ProtoAdapter<TimeTipStatus> ADAPTER = ProtoAdapter.newEnumAdapter(TimeTipStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TimeTipStatus fromValue(int i) {
            if (i == 0) {
                return START;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i != 2) {
                return null;
            }
            return END;
        }

        private TimeTipStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatTimeTipNotify$b */
    private static final class C17880b extends ProtoAdapter<PushChatTimeTipNotify> {
        C17880b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushChatTimeTipNotify.class);
        }

        /* renamed from: a */
        public int encodedSize(PushChatTimeTipNotify pushChatTimeTipNotify) {
            int i;
            int encodedSizeWithTag = TimeTipStatus.ADAPTER.encodedSizeWithTag(1, pushChatTimeTipNotify.status);
            if (pushChatTimeTipNotify.copy_writing != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, pushChatTimeTipNotify.copy_writing);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(3, pushChatTimeTipNotify.chat_id) + pushChatTimeTipNotify.unknownFields().size();
        }

        /* renamed from: a */
        public PushChatTimeTipNotify decode(ProtoReader protoReader) throws IOException {
            C17879a aVar = new C17879a();
            aVar.f44953a = TimeTipStatus.START;
            aVar.f44954b = "";
            aVar.f44955c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44953a = TimeTipStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44954b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44955c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushChatTimeTipNotify pushChatTimeTipNotify) throws IOException {
            TimeTipStatus.ADAPTER.encodeWithTag(protoWriter, 1, pushChatTimeTipNotify.status);
            if (pushChatTimeTipNotify.copy_writing != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushChatTimeTipNotify.copy_writing);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushChatTimeTipNotify.chat_id);
            protoWriter.writeBytes(pushChatTimeTipNotify.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17879a newBuilder() {
        C17879a aVar = new C17879a();
        aVar.f44953a = this.status;
        aVar.f44954b = this.copy_writing;
        aVar.f44955c = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatTimeTipNotify$a */
    public static final class C17879a extends Message.Builder<PushChatTimeTipNotify, C17879a> {

        /* renamed from: a */
        public TimeTipStatus f44953a;

        /* renamed from: b */
        public String f44954b;

        /* renamed from: c */
        public String f44955c;

        /* renamed from: a */
        public PushChatTimeTipNotify build() {
            String str;
            TimeTipStatus timeTipStatus = this.f44953a;
            if (timeTipStatus != null && (str = this.f44955c) != null) {
                return new PushChatTimeTipNotify(timeTipStatus, this.f44954b, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(timeTipStatus, UpdateKey.STATUS, this.f44955c, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushChatTimeTipNotify");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        if (this.copy_writing != null) {
            sb.append(", copy_writing=");
            sb.append(this.copy_writing);
        }
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "PushChatTimeTipNotify{");
        replace.append('}');
        return replace.toString();
    }

    public PushChatTimeTipNotify(TimeTipStatus timeTipStatus, String str, String str2) {
        this(timeTipStatus, str, str2, ByteString.EMPTY);
    }

    public PushChatTimeTipNotify(TimeTipStatus timeTipStatus, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = timeTipStatus;
        this.copy_writing = str;
        this.chat_id = str2;
    }
}
