package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CoverDownloadInfo extends Message<CoverDownloadInfo, C19327a> {
    public static final ProtoAdapter<CoverDownloadInfo> ADAPTER = new C19328b();
    public static final Integer DEFAULT_HEIGHT = 1280;
    public static final Integer DEFAULT_WIDTH = 1280;
    private static final long serialVersionUID = 0;
    public final Integer height;
    public final String policy;
    public final Integer width;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CoverDownloadInfo$b */
    private static final class C19328b extends ProtoAdapter<CoverDownloadInfo> {
        C19328b() {
            super(FieldEncoding.LENGTH_DELIMITED, CoverDownloadInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CoverDownloadInfo coverDownloadInfo) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, coverDownloadInfo.width) + ProtoAdapter.INT32.encodedSizeWithTag(2, coverDownloadInfo.height) + ProtoAdapter.STRING.encodedSizeWithTag(3, coverDownloadInfo.policy) + coverDownloadInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CoverDownloadInfo decode(ProtoReader protoReader) throws IOException {
            C19327a aVar = new C19327a();
            aVar.f47520a = 1280;
            aVar.f47521b = 1280;
            aVar.f47522c = "equal";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47520a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47521b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47522c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CoverDownloadInfo coverDownloadInfo) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, coverDownloadInfo.width);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, coverDownloadInfo.height);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, coverDownloadInfo.policy);
            protoWriter.writeBytes(coverDownloadInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19327a newBuilder() {
        C19327a aVar = new C19327a();
        aVar.f47520a = this.width;
        aVar.f47521b = this.height;
        aVar.f47522c = this.policy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CoverDownloadInfo$a */
    public static final class C19327a extends Message.Builder<CoverDownloadInfo, C19327a> {

        /* renamed from: a */
        public Integer f47520a;

        /* renamed from: b */
        public Integer f47521b;

        /* renamed from: c */
        public String f47522c;

        /* renamed from: a */
        public CoverDownloadInfo build() {
            Integer num;
            String str;
            Integer num2 = this.f47520a;
            if (num2 != null && (num = this.f47521b) != null && (str = this.f47522c) != null) {
                return new CoverDownloadInfo(num2, num, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "width", this.f47521b, "height", this.f47522c, "policy");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CoverDownloadInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", policy=");
        sb.append(this.policy);
        StringBuilder replace = sb.replace(0, 2, "CoverDownloadInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CoverDownloadInfo(Integer num, Integer num2, String str) {
        this(num, num2, str, ByteString.EMPTY);
    }

    public CoverDownloadInfo(Integer num, Integer num2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = num;
        this.height = num2;
        this.policy = str;
    }
}
