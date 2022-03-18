package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.firebase.messaging.Constants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadAudioDataRequest extends Message<UploadAudioDataRequest, C18292a> {
    public static final ProtoAdapter<UploadAudioDataRequest> ADAPTER = new C18293b();
    public static final Boolean DEFAULT_CANCEL = false;
    public static final ByteString DEFAULT_DATA = ByteString.EMPTY;
    public static final Boolean DEFAULT_DELETE_AUDIO_RESOURCE = false;
    public static final Boolean DEFAULT_FINISH = false;
    public static final Boolean DEFAULT_NEED_RECOGNIZE = false;
    public static final Integer DEFAULT_SEQUENCE_ID = 0;
    private static final long serialVersionUID = 0;
    public final String audio_type;
    public final Boolean cancel;
    public final ByteString data;
    public final Boolean delete_audio_resource;
    public final Boolean finish;
    public final Boolean need_recognize;
    public final Integer sequence_id;
    public final String upload_id;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAudioDataRequest$b */
    private static final class C18293b extends ProtoAdapter<UploadAudioDataRequest> {
        C18293b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadAudioDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadAudioDataRequest uploadAudioDataRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadAudioDataRequest.upload_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, uploadAudioDataRequest.sequence_id) + ProtoAdapter.BYTES.encodedSizeWithTag(3, uploadAudioDataRequest.data);
            int i5 = 0;
            if (uploadAudioDataRequest.audio_type != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, uploadAudioDataRequest.audio_type);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (uploadAudioDataRequest.need_recognize != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, uploadAudioDataRequest.need_recognize);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (uploadAudioDataRequest.finish != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, uploadAudioDataRequest.finish);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (uploadAudioDataRequest.cancel != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, uploadAudioDataRequest.cancel);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (uploadAudioDataRequest.delete_audio_resource != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(8, uploadAudioDataRequest.delete_audio_resource);
            }
            return i9 + i5 + uploadAudioDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadAudioDataRequest decode(ProtoReader protoReader) throws IOException {
            C18292a aVar = new C18292a();
            aVar.f45585a = "";
            aVar.f45586b = 0;
            aVar.f45587c = ByteString.EMPTY;
            aVar.f45588d = "";
            aVar.f45589e = false;
            aVar.f45590f = false;
            aVar.f45591g = false;
            aVar.f45592h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45585a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45586b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45587c = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45588d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45589e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45590f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45591g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45592h = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UploadAudioDataRequest uploadAudioDataRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadAudioDataRequest.upload_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, uploadAudioDataRequest.sequence_id);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, uploadAudioDataRequest.data);
            if (uploadAudioDataRequest.audio_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, uploadAudioDataRequest.audio_type);
            }
            if (uploadAudioDataRequest.need_recognize != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, uploadAudioDataRequest.need_recognize);
            }
            if (uploadAudioDataRequest.finish != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, uploadAudioDataRequest.finish);
            }
            if (uploadAudioDataRequest.cancel != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, uploadAudioDataRequest.cancel);
            }
            if (uploadAudioDataRequest.delete_audio_resource != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, uploadAudioDataRequest.delete_audio_resource);
            }
            protoWriter.writeBytes(uploadAudioDataRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18292a newBuilder() {
        C18292a aVar = new C18292a();
        aVar.f45585a = this.upload_id;
        aVar.f45586b = this.sequence_id;
        aVar.f45587c = this.data;
        aVar.f45588d = this.audio_type;
        aVar.f45589e = this.need_recognize;
        aVar.f45590f = this.finish;
        aVar.f45591g = this.cancel;
        aVar.f45592h = this.delete_audio_resource;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAudioDataRequest$a */
    public static final class C18292a extends Message.Builder<UploadAudioDataRequest, C18292a> {

        /* renamed from: a */
        public String f45585a;

        /* renamed from: b */
        public Integer f45586b;

        /* renamed from: c */
        public ByteString f45587c;

        /* renamed from: d */
        public String f45588d;

        /* renamed from: e */
        public Boolean f45589e;

        /* renamed from: f */
        public Boolean f45590f;

        /* renamed from: g */
        public Boolean f45591g;

        /* renamed from: h */
        public Boolean f45592h;

        /* renamed from: a */
        public UploadAudioDataRequest build() {
            Integer num;
            ByteString byteString;
            String str = this.f45585a;
            if (str != null && (num = this.f45586b) != null && (byteString = this.f45587c) != null) {
                return new UploadAudioDataRequest(str, num, byteString, this.f45588d, this.f45589e, this.f45590f, this.f45591g, this.f45592h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "upload_id", this.f45586b, "sequence_id", this.f45587c, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }

        /* renamed from: a */
        public C18292a mo63345a(Boolean bool) {
            this.f45589e = bool;
            return this;
        }

        /* renamed from: b */
        public C18292a mo63350b(Boolean bool) {
            this.f45590f = bool;
            return this;
        }

        /* renamed from: a */
        public C18292a mo63346a(Integer num) {
            this.f45586b = num;
            return this;
        }

        /* renamed from: a */
        public C18292a mo63347a(String str) {
            this.f45585a = str;
            return this;
        }

        /* renamed from: a */
        public C18292a mo63348a(ByteString byteString) {
            this.f45587c = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadAudioDataRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", upload_id=");
        sb.append(this.upload_id);
        sb.append(", sequence_id=");
        sb.append(this.sequence_id);
        sb.append(", data=");
        sb.append(this.data);
        if (this.audio_type != null) {
            sb.append(", audio_type=");
            sb.append(this.audio_type);
        }
        if (this.need_recognize != null) {
            sb.append(", need_recognize=");
            sb.append(this.need_recognize);
        }
        if (this.finish != null) {
            sb.append(", finish=");
            sb.append(this.finish);
        }
        if (this.cancel != null) {
            sb.append(", cancel=");
            sb.append(this.cancel);
        }
        if (this.delete_audio_resource != null) {
            sb.append(", delete_audio_resource=");
            sb.append(this.delete_audio_resource);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadAudioDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadAudioDataRequest(String str, Integer num, ByteString byteString, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(str, num, byteString, str2, bool, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public UploadAudioDataRequest(String str, Integer num, ByteString byteString, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.upload_id = str;
        this.sequence_id = num;
        this.data = byteString;
        this.audio_type = str2;
        this.need_recognize = bool;
        this.finish = bool2;
        this.cancel = bool3;
        this.delete_audio_resource = bool4;
    }
}
