package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ReportRequest extends Message<ReportRequest, C49950a> {
    public static final ProtoAdapter<ReportRequest> ADAPTER = new C49951b();
    private static final long serialVersionUID = 0;
    public final String mcomment_id;
    public final String mpost_id;
    public final String mreason;

    /* renamed from: com.ss.android.lark.pb.moments.ReportRequest$b */
    private static final class C49951b extends ProtoAdapter<ReportRequest> {
        C49951b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ReportRequest reportRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (reportRequest.mpost_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, reportRequest.mpost_id);
            } else {
                i = 0;
            }
            if (reportRequest.mcomment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, reportRequest.mcomment_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (reportRequest.mreason != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, reportRequest.mreason);
            }
            return i4 + i3 + reportRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ReportRequest decode(ProtoReader protoReader) throws IOException {
            C49950a aVar = new C49950a();
            aVar.f124954a = "";
            aVar.f124955b = "";
            aVar.f124956c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124954a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124955b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124956c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReportRequest reportRequest) throws IOException {
            if (reportRequest.mpost_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reportRequest.mpost_id);
            }
            if (reportRequest.mcomment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, reportRequest.mcomment_id);
            }
            if (reportRequest.mreason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, reportRequest.mreason);
            }
            protoWriter.writeBytes(reportRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.ReportRequest$a */
    public static final class C49950a extends Message.Builder<ReportRequest, C49950a> {

        /* renamed from: a */
        public String f124954a;

        /* renamed from: b */
        public String f124955b;

        /* renamed from: c */
        public String f124956c;

        /* renamed from: a */
        public ReportRequest build() {
            return new ReportRequest(this.f124954a, this.f124955b, this.f124956c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49950a mo173680a(String str) {
            this.f124954a = str;
            return this;
        }

        /* renamed from: b */
        public C49950a mo173682b(String str) {
            this.f124955b = str;
            return this;
        }

        /* renamed from: c */
        public C49950a mo173683c(String str) {
            this.f124956c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49950a newBuilder() {
        C49950a aVar = new C49950a();
        aVar.f124954a = this.mpost_id;
        aVar.f124955b = this.mcomment_id;
        aVar.f124956c = this.mreason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mpost_id != null) {
            sb.append(", post_id=");
            sb.append(this.mpost_id);
        }
        if (this.mcomment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.mcomment_id);
        }
        if (this.mreason != null) {
            sb.append(", reason=");
            sb.append(this.mreason);
        }
        StringBuilder replace = sb.replace(0, 2, "ReportRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ReportRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public ReportRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpost_id = str;
        this.mcomment_id = str2;
        this.mreason = str3;
    }
}
