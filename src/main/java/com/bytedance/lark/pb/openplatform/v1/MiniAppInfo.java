package com.bytedance.lark.pb.openplatform.v1;

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

public final class MiniAppInfo extends Message<MiniAppInfo, C18677a> {
    public static final ProtoAdapter<MiniAppInfo> ADAPTER = new C18678b();
    public static final CommonUsageStatus DEFAULT_STATUS = CommonUsageStatus.USABLE;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final List<CommonSupportFeature> features;
    public final String local_name;
    public final CommonUsageStatus status;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.MiniAppInfo$b */
    private static final class C18678b extends ProtoAdapter<MiniAppInfo> {
        C18678b() {
            super(FieldEncoding.LENGTH_DELIMITED, MiniAppInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(MiniAppInfo miniAppInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (miniAppInfo.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, miniAppInfo.app_id);
            } else {
                i = 0;
            }
            if (miniAppInfo.local_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, miniAppInfo.local_name);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + CommonSupportFeature.ADAPTER.asRepeated().encodedSizeWithTag(3, miniAppInfo.features);
            if (miniAppInfo.status != null) {
                i3 = CommonUsageStatus.ADAPTER.encodedSizeWithTag(4, miniAppInfo.status);
            }
            return encodedSizeWithTag + i3 + miniAppInfo.unknownFields().size();
        }

        /* renamed from: a */
        public MiniAppInfo decode(ProtoReader protoReader) throws IOException {
            C18677a aVar = new C18677a();
            aVar.f46207a = "";
            aVar.f46208b = "";
            aVar.f46210d = CommonUsageStatus.USABLE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46207a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46208b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f46209c.add(CommonSupportFeature.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46210d = CommonUsageStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MiniAppInfo miniAppInfo) throws IOException {
            if (miniAppInfo.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, miniAppInfo.app_id);
            }
            if (miniAppInfo.local_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, miniAppInfo.local_name);
            }
            CommonSupportFeature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, miniAppInfo.features);
            if (miniAppInfo.status != null) {
                CommonUsageStatus.ADAPTER.encodeWithTag(protoWriter, 4, miniAppInfo.status);
            }
            protoWriter.writeBytes(miniAppInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.MiniAppInfo$a */
    public static final class C18677a extends Message.Builder<MiniAppInfo, C18677a> {

        /* renamed from: a */
        public String f46207a;

        /* renamed from: b */
        public String f46208b;

        /* renamed from: c */
        public List<CommonSupportFeature> f46209c = Internal.newMutableList();

        /* renamed from: d */
        public CommonUsageStatus f46210d;

        /* renamed from: a */
        public MiniAppInfo build() {
            return new MiniAppInfo(this.f46207a, this.f46208b, this.f46209c, this.f46210d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18677a newBuilder() {
        C18677a aVar = new C18677a();
        aVar.f46207a = this.app_id;
        aVar.f46208b = this.local_name;
        aVar.f46209c = Internal.copyOf("features", this.features);
        aVar.f46210d = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "MiniAppInfo");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.local_name != null) {
            sb.append(", local_name=");
            sb.append(this.local_name);
        }
        if (!this.features.isEmpty()) {
            sb.append(", features=");
            sb.append(this.features);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "MiniAppInfo{");
        replace.append('}');
        return replace.toString();
    }

    public MiniAppInfo(String str, String str2, List<CommonSupportFeature> list, CommonUsageStatus commonUsageStatus) {
        this(str, str2, list, commonUsageStatus, ByteString.EMPTY);
    }

    public MiniAppInfo(String str, String str2, List<CommonSupportFeature> list, CommonUsageStatus commonUsageStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.local_name = str2;
        this.features = Internal.immutableCopyOf("features", list);
        this.status = commonUsageStatus;
    }
}
