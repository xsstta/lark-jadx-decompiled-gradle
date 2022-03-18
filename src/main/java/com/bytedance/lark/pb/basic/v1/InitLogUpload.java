package com.bytedance.lark.pb.basic.v1;

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

public final class InitLogUpload extends Message<InitLogUpload, C15019a> {
    public static final ProtoAdapter<InitLogUpload> ADAPTER = new C15020b();
    public static final Boolean DEFAULT_ENABLE_STREAM_UPLOAD = false;
    private static final long serialVersionUID = 0;
    public final Boolean enable_stream_upload;
    public final List<LogPathWithType> extra_log_path;
    public final String log_path;

    /* renamed from: com.bytedance.lark.pb.basic.v1.InitLogUpload$b */
    private static final class C15020b extends ProtoAdapter<InitLogUpload> {
        C15020b() {
            super(FieldEncoding.LENGTH_DELIMITED, InitLogUpload.class);
        }

        /* renamed from: a */
        public int encodedSize(InitLogUpload initLogUpload) {
            int i;
            int i2 = 0;
            if (initLogUpload.log_path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, initLogUpload.log_path);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + LogPathWithType.ADAPTER.asRepeated().encodedSizeWithTag(2, initLogUpload.extra_log_path);
            if (initLogUpload.enable_stream_upload != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, initLogUpload.enable_stream_upload);
            }
            return encodedSizeWithTag + i2 + initLogUpload.unknownFields().size();
        }

        /* renamed from: a */
        public InitLogUpload decode(ProtoReader protoReader) throws IOException {
            C15019a aVar = new C15019a();
            aVar.f39713a = "";
            aVar.f39715c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39713a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39714b.add(LogPathWithType.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39715c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InitLogUpload initLogUpload) throws IOException {
            if (initLogUpload.log_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, initLogUpload.log_path);
            }
            LogPathWithType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, initLogUpload.extra_log_path);
            if (initLogUpload.enable_stream_upload != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, initLogUpload.enable_stream_upload);
            }
            protoWriter.writeBytes(initLogUpload.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.InitLogUpload$a */
    public static final class C15019a extends Message.Builder<InitLogUpload, C15019a> {

        /* renamed from: a */
        public String f39713a;

        /* renamed from: b */
        public List<LogPathWithType> f39714b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f39715c;

        /* renamed from: a */
        public InitLogUpload build() {
            return new InitLogUpload(this.f39713a, this.f39714b, this.f39715c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15019a mo54879a(Boolean bool) {
            this.f39715c = bool;
            return this;
        }

        /* renamed from: a */
        public C15019a mo54880a(String str) {
            this.f39713a = str;
            return this;
        }

        /* renamed from: a */
        public C15019a mo54881a(List<LogPathWithType> list) {
            Internal.checkElementsNotNull(list);
            this.f39714b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15019a newBuilder() {
        C15019a aVar = new C15019a();
        aVar.f39713a = this.log_path;
        aVar.f39714b = Internal.copyOf("extra_log_path", this.extra_log_path);
        aVar.f39715c = this.enable_stream_upload;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "InitLogUpload");
        StringBuilder sb = new StringBuilder();
        if (this.log_path != null) {
            sb.append(", log_path=");
            sb.append(this.log_path);
        }
        if (!this.extra_log_path.isEmpty()) {
            sb.append(", extra_log_path=");
            sb.append(this.extra_log_path);
        }
        if (this.enable_stream_upload != null) {
            sb.append(", enable_stream_upload=");
            sb.append(this.enable_stream_upload);
        }
        StringBuilder replace = sb.replace(0, 2, "InitLogUpload{");
        replace.append('}');
        return replace.toString();
    }

    public InitLogUpload(String str, List<LogPathWithType> list, Boolean bool) {
        this(str, list, bool, ByteString.EMPTY);
    }

    public InitLogUpload(String str, List<LogPathWithType> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.log_path = str;
        this.extra_log_path = Internal.immutableCopyOf("extra_log_path", list);
        this.enable_stream_upload = bool;
    }
}
