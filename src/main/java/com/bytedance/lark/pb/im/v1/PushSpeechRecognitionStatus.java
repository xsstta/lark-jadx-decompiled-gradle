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

public final class PushSpeechRecognitionStatus extends Message<PushSpeechRecognitionStatus, C17945a> {
    public static final ProtoAdapter<PushSpeechRecognitionStatus> ADAPTER = new C17946b();
    public static final Status DEFAULT_STATUS = Status.Timeout;
    private static final long serialVersionUID = 0;
    public final String source_id;
    public final Status status;

    public enum Status implements WireEnum {
        Timeout(1);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i != 1) {
                return null;
            }
            return Timeout;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus$b */
    private static final class C17946b extends ProtoAdapter<PushSpeechRecognitionStatus> {
        C17946b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushSpeechRecognitionStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(PushSpeechRecognitionStatus pushSpeechRecognitionStatus) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushSpeechRecognitionStatus.source_id) + Status.ADAPTER.encodedSizeWithTag(2, pushSpeechRecognitionStatus.status) + pushSpeechRecognitionStatus.unknownFields().size();
        }

        /* renamed from: a */
        public PushSpeechRecognitionStatus decode(ProtoReader protoReader) throws IOException {
            C17945a aVar = new C17945a();
            aVar.f45035a = "";
            aVar.f45036b = Status.Timeout;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45035a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45036b = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushSpeechRecognitionStatus pushSpeechRecognitionStatus) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushSpeechRecognitionStatus.source_id);
            Status.ADAPTER.encodeWithTag(protoWriter, 2, pushSpeechRecognitionStatus.status);
            protoWriter.writeBytes(pushSpeechRecognitionStatus.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17945a newBuilder() {
        C17945a aVar = new C17945a();
        aVar.f45035a = this.source_id;
        aVar.f45036b = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus$a */
    public static final class C17945a extends Message.Builder<PushSpeechRecognitionStatus, C17945a> {

        /* renamed from: a */
        public String f45035a;

        /* renamed from: b */
        public Status f45036b;

        /* renamed from: a */
        public PushSpeechRecognitionStatus build() {
            Status status;
            String str = this.f45035a;
            if (str != null && (status = this.f45036b) != null) {
                return new PushSpeechRecognitionStatus(str, status, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "source_id", this.f45036b, UpdateKey.STATUS);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushSpeechRecognitionStatus");
        StringBuilder sb = new StringBuilder();
        sb.append(", source_id=");
        sb.append(this.source_id);
        sb.append(", status=");
        sb.append(this.status);
        StringBuilder replace = sb.replace(0, 2, "PushSpeechRecognitionStatus{");
        replace.append('}');
        return replace.toString();
    }

    public PushSpeechRecognitionStatus(String str, Status status2) {
        this(str, status2, ByteString.EMPTY);
    }

    public PushSpeechRecognitionStatus(String str, Status status2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_id = str;
        this.status = status2;
    }
}
