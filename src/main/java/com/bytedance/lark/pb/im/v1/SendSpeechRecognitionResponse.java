package com.bytedance.lark.pb.im.v1;

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

public final class SendSpeechRecognitionResponse extends Message<SendSpeechRecognitionResponse, C18035a> {
    public static final ProtoAdapter<SendSpeechRecognitionResponse> ADAPTER = new C18036b();
    public static final Boolean DEFAULT_IS_AVAILABLE = false;
    public static final Boolean DEFAULT_IS_END = false;
    public static final Integer DEFAULT_SEQUENCE_ID = 0;
    private static final long serialVersionUID = 0;
    public final List<Integer> diff_index_slice;
    public final Boolean is_available;
    public final Boolean is_end;
    public final String result;
    public final Integer sequence_id;
    public final String source_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendSpeechRecognitionResponse$b */
    private static final class C18036b extends ProtoAdapter<SendSpeechRecognitionResponse> {
        C18036b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendSpeechRecognitionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendSpeechRecognitionResponse sendSpeechRecognitionResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (sendSpeechRecognitionResponse.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendSpeechRecognitionResponse.source_id);
            } else {
                i = 0;
            }
            if (sendSpeechRecognitionResponse.sequence_id != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, sendSpeechRecognitionResponse.sequence_id);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (sendSpeechRecognitionResponse.result != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sendSpeechRecognitionResponse.result);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (sendSpeechRecognitionResponse.is_end != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, sendSpeechRecognitionResponse.is_end);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (sendSpeechRecognitionResponse.is_available != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, sendSpeechRecognitionResponse.is_available);
            }
            return i8 + i5 + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(6, sendSpeechRecognitionResponse.diff_index_slice) + sendSpeechRecognitionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendSpeechRecognitionResponse decode(ProtoReader protoReader) throws IOException {
            C18035a aVar = new C18035a();
            aVar.f45155a = "";
            aVar.f45156b = 0;
            aVar.f45157c = "";
            aVar.f45158d = false;
            aVar.f45159e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45155a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45156b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45157c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45158d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45159e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45160f.add(ProtoAdapter.INT32.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SendSpeechRecognitionResponse sendSpeechRecognitionResponse) throws IOException {
            if (sendSpeechRecognitionResponse.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendSpeechRecognitionResponse.source_id);
            }
            if (sendSpeechRecognitionResponse.sequence_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendSpeechRecognitionResponse.sequence_id);
            }
            if (sendSpeechRecognitionResponse.result != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sendSpeechRecognitionResponse.result);
            }
            if (sendSpeechRecognitionResponse.is_end != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, sendSpeechRecognitionResponse.is_end);
            }
            if (sendSpeechRecognitionResponse.is_available != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, sendSpeechRecognitionResponse.is_available);
            }
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 6, sendSpeechRecognitionResponse.diff_index_slice);
            protoWriter.writeBytes(sendSpeechRecognitionResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendSpeechRecognitionResponse$a */
    public static final class C18035a extends Message.Builder<SendSpeechRecognitionResponse, C18035a> {

        /* renamed from: a */
        public String f45155a;

        /* renamed from: b */
        public Integer f45156b;

        /* renamed from: c */
        public String f45157c;

        /* renamed from: d */
        public Boolean f45158d;

        /* renamed from: e */
        public Boolean f45159e;

        /* renamed from: f */
        public List<Integer> f45160f = Internal.newMutableList();

        /* renamed from: a */
        public SendSpeechRecognitionResponse build() {
            return new SendSpeechRecognitionResponse(this.f45155a, this.f45156b, this.f45157c, this.f45158d, this.f45159e, this.f45160f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18035a newBuilder() {
        C18035a aVar = new C18035a();
        aVar.f45155a = this.source_id;
        aVar.f45156b = this.sequence_id;
        aVar.f45157c = this.result;
        aVar.f45158d = this.is_end;
        aVar.f45159e = this.is_available;
        aVar.f45160f = Internal.copyOf("diff_index_slice", this.diff_index_slice);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendSpeechRecognitionResponse");
        StringBuilder sb = new StringBuilder();
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.result != null) {
            sb.append(", result=");
            sb.append(this.result);
        }
        if (this.is_end != null) {
            sb.append(", is_end=");
            sb.append(this.is_end);
        }
        if (this.is_available != null) {
            sb.append(", is_available=");
            sb.append(this.is_available);
        }
        if (!this.diff_index_slice.isEmpty()) {
            sb.append(", diff_index_slice=");
            sb.append(this.diff_index_slice);
        }
        StringBuilder replace = sb.replace(0, 2, "SendSpeechRecognitionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendSpeechRecognitionResponse(String str, Integer num, String str2, Boolean bool, Boolean bool2, List<Integer> list) {
        this(str, num, str2, bool, bool2, list, ByteString.EMPTY);
    }

    public SendSpeechRecognitionResponse(String str, Integer num, String str2, Boolean bool, Boolean bool2, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_id = str;
        this.sequence_id = num;
        this.result = str2;
        this.is_end = bool;
        this.is_available = bool2;
        this.diff_index_slice = Internal.immutableCopyOf("diff_index_slice", list);
    }
}
