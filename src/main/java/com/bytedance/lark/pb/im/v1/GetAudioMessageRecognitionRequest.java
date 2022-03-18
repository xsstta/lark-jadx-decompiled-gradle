package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAudioMessageRecognitionRequest extends Message<GetAudioMessageRecognitionRequest, C17474a> {
    public static final ProtoAdapter<GetAudioMessageRecognitionRequest> ADAPTER = new C17475b();
    public static final Integer DEFAULT_AUDIO_RATE = 0;
    public static final Integer DEFAULT_START_TIME = 0;
    private static final long serialVersionUID = 0;
    public final String audio_format;
    public final Integer audio_rate;
    public final String device_locale;
    public final String message_id;
    public final Integer start_time;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAudioMessageRecognitionRequest$b */
    private static final class C17475b extends ProtoAdapter<GetAudioMessageRecognitionRequest> {
        C17475b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAudioMessageRecognitionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAudioMessageRecognitionRequest getAudioMessageRecognitionRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getAudioMessageRecognitionRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAudioMessageRecognitionRequest.message_id);
            } else {
                i = 0;
            }
            if (getAudioMessageRecognitionRequest.audio_rate != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getAudioMessageRecognitionRequest.audio_rate);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getAudioMessageRecognitionRequest.audio_format != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getAudioMessageRecognitionRequest.audio_format);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getAudioMessageRecognitionRequest.device_locale != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, getAudioMessageRecognitionRequest.device_locale);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getAudioMessageRecognitionRequest.start_time != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, getAudioMessageRecognitionRequest.start_time);
            }
            return i8 + i5 + getAudioMessageRecognitionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAudioMessageRecognitionRequest decode(ProtoReader protoReader) throws IOException {
            C17474a aVar = new C17474a();
            aVar.f44362a = "";
            aVar.f44363b = 0;
            aVar.f44364c = "";
            aVar.f44365d = "";
            aVar.f44366e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44362a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44363b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44364c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f44365d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44366e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAudioMessageRecognitionRequest getAudioMessageRecognitionRequest) throws IOException {
            if (getAudioMessageRecognitionRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAudioMessageRecognitionRequest.message_id);
            }
            if (getAudioMessageRecognitionRequest.audio_rate != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getAudioMessageRecognitionRequest.audio_rate);
            }
            if (getAudioMessageRecognitionRequest.audio_format != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getAudioMessageRecognitionRequest.audio_format);
            }
            if (getAudioMessageRecognitionRequest.device_locale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getAudioMessageRecognitionRequest.device_locale);
            }
            if (getAudioMessageRecognitionRequest.start_time != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, getAudioMessageRecognitionRequest.start_time);
            }
            protoWriter.writeBytes(getAudioMessageRecognitionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAudioMessageRecognitionRequest$a */
    public static final class C17474a extends Message.Builder<GetAudioMessageRecognitionRequest, C17474a> {

        /* renamed from: a */
        public String f44362a;

        /* renamed from: b */
        public Integer f44363b;

        /* renamed from: c */
        public String f44364c;

        /* renamed from: d */
        public String f44365d;

        /* renamed from: e */
        public Integer f44366e;

        /* renamed from: a */
        public GetAudioMessageRecognitionRequest build() {
            return new GetAudioMessageRecognitionRequest(this.f44362a, this.f44363b, this.f44364c, this.f44365d, this.f44366e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17474a mo61237a(Integer num) {
            this.f44363b = num;
            return this;
        }

        /* renamed from: b */
        public C17474a mo61240b(String str) {
            this.f44364c = str;
            return this;
        }

        /* renamed from: c */
        public C17474a mo61241c(String str) {
            this.f44365d = str;
            return this;
        }

        /* renamed from: a */
        public C17474a mo61238a(String str) {
            this.f44362a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17474a newBuilder() {
        C17474a aVar = new C17474a();
        aVar.f44362a = this.message_id;
        aVar.f44363b = this.audio_rate;
        aVar.f44364c = this.audio_format;
        aVar.f44365d = this.device_locale;
        aVar.f44366e = this.start_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetAudioMessageRecognitionRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.audio_rate != null) {
            sb.append(", audio_rate=");
            sb.append(this.audio_rate);
        }
        if (this.audio_format != null) {
            sb.append(", audio_format=");
            sb.append(this.audio_format);
        }
        if (this.device_locale != null) {
            sb.append(", device_locale=");
            sb.append(this.device_locale);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAudioMessageRecognitionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAudioMessageRecognitionRequest(String str, Integer num, String str2, String str3, Integer num2) {
        this(str, num, str2, str3, num2, ByteString.EMPTY);
    }

    public GetAudioMessageRecognitionRequest(String str, Integer num, String str2, String str3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.audio_rate = num;
        this.audio_format = str2;
        this.device_locale = str3;
        this.start_time = num2;
    }
}
