package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadExtraInfo extends Message<UploadExtraInfo, C19397a> {
    public static final ProtoAdapter<UploadExtraInfo> ADAPTER = new C19398b();
    private static final long serialVersionUID = 0;
    public final String file_name;
    public final String node_token;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadExtraInfo$b */
    private static final class C19398b extends ProtoAdapter<UploadExtraInfo> {
        C19398b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadExtraInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadExtraInfo uploadExtraInfo) {
            int i;
            int i2 = 0;
            if (uploadExtraInfo.node_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadExtraInfo.node_token);
            } else {
                i = 0;
            }
            if (uploadExtraInfo.file_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, uploadExtraInfo.file_name);
            }
            return i + i2 + uploadExtraInfo.unknownFields().size();
        }

        /* renamed from: a */
        public UploadExtraInfo decode(ProtoReader protoReader) throws IOException {
            C19397a aVar = new C19397a();
            aVar.f47695a = "";
            aVar.f47696b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47695a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47696b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadExtraInfo uploadExtraInfo) throws IOException {
            if (uploadExtraInfo.node_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadExtraInfo.node_token);
            }
            if (uploadExtraInfo.file_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, uploadExtraInfo.file_name);
            }
            protoWriter.writeBytes(uploadExtraInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadExtraInfo$a */
    public static final class C19397a extends Message.Builder<UploadExtraInfo, C19397a> {

        /* renamed from: a */
        public String f47695a;

        /* renamed from: b */
        public String f47696b;

        /* renamed from: a */
        public UploadExtraInfo build() {
            return new UploadExtraInfo(this.f47695a, this.f47696b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19397a newBuilder() {
        C19397a aVar = new C19397a();
        aVar.f47695a = this.node_token;
        aVar.f47696b = this.file_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UploadExtraInfo");
        StringBuilder sb = new StringBuilder();
        if (this.node_token != null) {
            sb.append(", node_token=");
            sb.append(this.node_token);
        }
        if (this.file_name != null) {
            sb.append(", file_name=");
            sb.append(this.file_name);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadExtraInfo{");
        replace.append('}');
        return replace.toString();
    }

    public UploadExtraInfo(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public UploadExtraInfo(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.node_token = str;
        this.file_name = str2;
    }
}
