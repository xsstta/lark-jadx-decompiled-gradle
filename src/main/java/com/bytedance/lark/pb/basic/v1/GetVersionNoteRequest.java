package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetVersionNoteRequest extends Message<GetVersionNoteRequest, C14989a> {
    public static final ProtoAdapter<GetVersionNoteRequest> ADAPTER = new C14990b();
    private static final long serialVersionUID = 0;
    public final String ka;
    public final String platform;
    public final String version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetVersionNoteRequest$b */
    private static final class C14990b extends ProtoAdapter<GetVersionNoteRequest> {
        C14990b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVersionNoteRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVersionNoteRequest getVersionNoteRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getVersionNoteRequest.version) + ProtoAdapter.STRING.encodedSizeWithTag(2, getVersionNoteRequest.platform);
            if (getVersionNoteRequest.ka != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getVersionNoteRequest.ka);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getVersionNoteRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVersionNoteRequest decode(ProtoReader protoReader) throws IOException {
            C14989a aVar = new C14989a();
            aVar.f39655a = "";
            aVar.f39656b = "";
            aVar.f39657c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39655a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39656b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39657c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVersionNoteRequest getVersionNoteRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getVersionNoteRequest.version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getVersionNoteRequest.platform);
            if (getVersionNoteRequest.ka != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getVersionNoteRequest.ka);
            }
            protoWriter.writeBytes(getVersionNoteRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14989a newBuilder() {
        C14989a aVar = new C14989a();
        aVar.f39655a = this.version;
        aVar.f39656b = this.platform;
        aVar.f39657c = this.ka;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetVersionNoteRequest$a */
    public static final class C14989a extends Message.Builder<GetVersionNoteRequest, C14989a> {

        /* renamed from: a */
        public String f39655a;

        /* renamed from: b */
        public String f39656b;

        /* renamed from: c */
        public String f39657c;

        /* renamed from: a */
        public GetVersionNoteRequest build() {
            String str;
            String str2 = this.f39655a;
            if (str2 != null && (str = this.f39656b) != null) {
                return new GetVersionNoteRequest(str2, str, this.f39657c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f39656b, "platform");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetVersionNoteRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", platform=");
        sb.append(this.platform);
        if (this.ka != null) {
            sb.append(", ka=");
            sb.append(this.ka);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVersionNoteRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVersionNoteRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public GetVersionNoteRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = str;
        this.platform = str2;
        this.ka = str3;
    }
}
