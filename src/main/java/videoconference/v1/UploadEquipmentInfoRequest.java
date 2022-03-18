package videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.videoconference.v1.ByteviewUser;
import java.io.IOException;
import okio.ByteString;

public final class UploadEquipmentInfoRequest extends Message<UploadEquipmentInfoRequest, C70216a> {
    public static final ProtoAdapter<UploadEquipmentInfoRequest> ADAPTER = new C70217b();
    private static final long serialVersionUID = 0;
    public final String camera_name;
    public final String meeting_id;
    public final String microphone_name;
    public final String speaker_name;
    public final ByteviewUser user;

    /* renamed from: videoconference.v1.UploadEquipmentInfoRequest$b */
    private static final class C70217b extends ProtoAdapter<UploadEquipmentInfoRequest> {
        C70217b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadEquipmentInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadEquipmentInfoRequest uploadEquipmentInfoRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (uploadEquipmentInfoRequest.user != null) {
                i = ByteviewUser.ADAPTER.encodedSizeWithTag(1, uploadEquipmentInfoRequest.user);
            } else {
                i = 0;
            }
            if (uploadEquipmentInfoRequest.meeting_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, uploadEquipmentInfoRequest.meeting_id);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (uploadEquipmentInfoRequest.microphone_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, uploadEquipmentInfoRequest.microphone_name);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (uploadEquipmentInfoRequest.speaker_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, uploadEquipmentInfoRequest.speaker_name);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (uploadEquipmentInfoRequest.camera_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, uploadEquipmentInfoRequest.camera_name);
            }
            return i8 + i5 + uploadEquipmentInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadEquipmentInfoRequest decode(ProtoReader protoReader) throws IOException {
            C70216a aVar = new C70216a();
            aVar.f175364b = "";
            aVar.f175365c = "";
            aVar.f175366d = "";
            aVar.f175367e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f175363a = ByteviewUser.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f175364b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f175365c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f175366d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f175367e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadEquipmentInfoRequest uploadEquipmentInfoRequest) throws IOException {
            if (uploadEquipmentInfoRequest.user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, uploadEquipmentInfoRequest.user);
            }
            if (uploadEquipmentInfoRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, uploadEquipmentInfoRequest.meeting_id);
            }
            if (uploadEquipmentInfoRequest.microphone_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, uploadEquipmentInfoRequest.microphone_name);
            }
            if (uploadEquipmentInfoRequest.speaker_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, uploadEquipmentInfoRequest.speaker_name);
            }
            if (uploadEquipmentInfoRequest.camera_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, uploadEquipmentInfoRequest.camera_name);
            }
            protoWriter.writeBytes(uploadEquipmentInfoRequest.unknownFields());
        }
    }

    /* renamed from: videoconference.v1.UploadEquipmentInfoRequest$a */
    public static final class C70216a extends Message.Builder<UploadEquipmentInfoRequest, C70216a> {

        /* renamed from: a */
        public ByteviewUser f175363a;

        /* renamed from: b */
        public String f175364b;

        /* renamed from: c */
        public String f175365c;

        /* renamed from: d */
        public String f175366d;

        /* renamed from: e */
        public String f175367e;

        /* renamed from: a */
        public UploadEquipmentInfoRequest build() {
            return new UploadEquipmentInfoRequest(this.f175363a, this.f175364b, this.f175365c, this.f175366d, this.f175367e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C70216a mo247415a(ByteviewUser byteviewUser) {
            this.f175363a = byteviewUser;
            return this;
        }

        /* renamed from: b */
        public C70216a mo247418b(String str) {
            this.f175365c = str;
            return this;
        }

        /* renamed from: c */
        public C70216a mo247419c(String str) {
            this.f175366d = str;
            return this;
        }

        /* renamed from: d */
        public C70216a mo247420d(String str) {
            this.f175367e = str;
            return this;
        }

        /* renamed from: a */
        public C70216a mo247416a(String str) {
            this.f175364b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C70216a newBuilder() {
        C70216a aVar = new C70216a();
        aVar.f175363a = this.user;
        aVar.f175364b = this.meeting_id;
        aVar.f175365c = this.microphone_name;
        aVar.f175366d = this.speaker_name;
        aVar.f175367e = this.camera_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UploadEquipmentInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.microphone_name != null) {
            sb.append(", microphone_name=");
            sb.append(this.microphone_name);
        }
        if (this.speaker_name != null) {
            sb.append(", speaker_name=");
            sb.append(this.speaker_name);
        }
        if (this.camera_name != null) {
            sb.append(", camera_name=");
            sb.append(this.camera_name);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadEquipmentInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadEquipmentInfoRequest(ByteviewUser byteviewUser, String str, String str2, String str3, String str4) {
        this(byteviewUser, str, str2, str3, str4, ByteString.EMPTY);
    }

    public UploadEquipmentInfoRequest(ByteviewUser byteviewUser, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = byteviewUser;
        this.meeting_id = str;
        this.microphone_name = str2;
        this.speaker_name = str3;
        this.camera_name = str4;
    }
}
