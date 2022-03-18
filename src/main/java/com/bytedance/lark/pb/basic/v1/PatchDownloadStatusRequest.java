package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PatchDownloadStatusRequest extends Message<PatchDownloadStatusRequest, C15111a> {
    public static final ProtoAdapter<PatchDownloadStatusRequest> ADAPTER = new C15112b();
    public static final AppType DEFAULT_APP = AppType.UNKOWN;
    public static final DownloadStatus DEFAULT_STATUS = DownloadStatus.DOWNLOAD_STATUS_UNKOWN;
    private static final long serialVersionUID = 0;
    public final AppType app;
    public final String ka;
    public final String platform;
    public final DownloadStatus status;
    public final String version;

    public enum AppType implements WireEnum {
        UNKOWN(0),
        LARK(1),
        DOCS(2),
        EMAIL(3),
        MEETING(4),
        CALENDER(5),
        VC(6),
        FEISHULITE(7);
        
        public static final ProtoAdapter<AppType> ADAPTER = ProtoAdapter.newEnumAdapter(AppType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AppType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKOWN;
                case 1:
                    return LARK;
                case 2:
                    return DOCS;
                case 3:
                    return EMAIL;
                case 4:
                    return MEETING;
                case 5:
                    return CALENDER;
                case 6:
                    return VC;
                case 7:
                    return FEISHULITE;
                default:
                    return null;
            }
        }

        private AppType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PatchDownloadStatusRequest$b */
    private static final class C15112b extends ProtoAdapter<PatchDownloadStatusRequest> {
        C15112b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchDownloadStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchDownloadStatusRequest patchDownloadStatusRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, patchDownloadStatusRequest.version) + ProtoAdapter.STRING.encodedSizeWithTag(2, patchDownloadStatusRequest.platform);
            int i3 = 0;
            if (patchDownloadStatusRequest.app != null) {
                i = AppType.ADAPTER.encodedSizeWithTag(3, patchDownloadStatusRequest.app);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (patchDownloadStatusRequest.ka != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, patchDownloadStatusRequest.ka);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (patchDownloadStatusRequest.status != null) {
                i3 = DownloadStatus.ADAPTER.encodedSizeWithTag(5, patchDownloadStatusRequest.status);
            }
            return i5 + i3 + patchDownloadStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchDownloadStatusRequest decode(ProtoReader protoReader) throws IOException {
            C15111a aVar = new C15111a();
            aVar.f40072a = "";
            aVar.f40073b = "";
            aVar.f40074c = AppType.UNKOWN;
            aVar.f40075d = "";
            aVar.f40076e = DownloadStatus.DOWNLOAD_STATUS_UNKOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40072a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40073b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f40074c = AppType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f40075d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f40076e = DownloadStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchDownloadStatusRequest patchDownloadStatusRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, patchDownloadStatusRequest.version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, patchDownloadStatusRequest.platform);
            if (patchDownloadStatusRequest.app != null) {
                AppType.ADAPTER.encodeWithTag(protoWriter, 3, patchDownloadStatusRequest.app);
            }
            if (patchDownloadStatusRequest.ka != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, patchDownloadStatusRequest.ka);
            }
            if (patchDownloadStatusRequest.status != null) {
                DownloadStatus.ADAPTER.encodeWithTag(protoWriter, 5, patchDownloadStatusRequest.status);
            }
            protoWriter.writeBytes(patchDownloadStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PatchDownloadStatusRequest$a */
    public static final class C15111a extends Message.Builder<PatchDownloadStatusRequest, C15111a> {

        /* renamed from: a */
        public String f40072a;

        /* renamed from: b */
        public String f40073b;

        /* renamed from: c */
        public AppType f40074c;

        /* renamed from: d */
        public String f40075d;

        /* renamed from: e */
        public DownloadStatus f40076e;

        /* renamed from: a */
        public PatchDownloadStatusRequest build() {
            String str;
            String str2 = this.f40072a;
            if (str2 != null && (str = this.f40073b) != null) {
                return new PatchDownloadStatusRequest(str2, str, this.f40074c, this.f40075d, this.f40076e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f40073b, "platform");
        }

        /* renamed from: a */
        public C15111a mo55112a(DownloadStatus downloadStatus) {
            this.f40076e = downloadStatus;
            return this;
        }

        /* renamed from: b */
        public C15111a mo55116b(String str) {
            this.f40073b = str;
            return this;
        }

        /* renamed from: c */
        public C15111a mo55117c(String str) {
            this.f40075d = str;
            return this;
        }

        /* renamed from: a */
        public C15111a mo55113a(AppType appType) {
            this.f40074c = appType;
            return this;
        }

        /* renamed from: a */
        public C15111a mo55114a(String str) {
            this.f40072a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15111a newBuilder() {
        C15111a aVar = new C15111a();
        aVar.f40072a = this.version;
        aVar.f40073b = this.platform;
        aVar.f40074c = this.app;
        aVar.f40075d = this.ka;
        aVar.f40076e = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PatchDownloadStatusRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", platform=");
        sb.append(this.platform);
        if (this.app != null) {
            sb.append(", app=");
            sb.append(this.app);
        }
        if (this.ka != null) {
            sb.append(", ka=");
            sb.append(this.ka);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchDownloadStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchDownloadStatusRequest(String str, String str2, AppType appType, String str3, DownloadStatus downloadStatus) {
        this(str, str2, appType, str3, downloadStatus, ByteString.EMPTY);
    }

    public PatchDownloadStatusRequest(String str, String str2, AppType appType, String str3, DownloadStatus downloadStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = str;
        this.platform = str2;
        this.app = appType;
        this.ka = str3;
        this.status = downloadStatus;
    }
}
