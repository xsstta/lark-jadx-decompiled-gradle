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

public final class H5Info extends Message<H5Info, C18675a> {
    public static final ProtoAdapter<H5Info> ADAPTER = new C18676b();
    public static final CommonUsageStatus DEFAULT_STATUS = CommonUsageStatus.USABLE;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final List<CommonSupportFeature> features;
    public final String local_name;
    public final CommonUsageStatus status;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.H5Info$b */
    private static final class C18676b extends ProtoAdapter<H5Info> {
        C18676b() {
            super(FieldEncoding.LENGTH_DELIMITED, H5Info.class);
        }

        /* renamed from: a */
        public int encodedSize(H5Info h5Info) {
            int i;
            int i2;
            int i3 = 0;
            if (h5Info.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, h5Info.app_id);
            } else {
                i = 0;
            }
            if (h5Info.local_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, h5Info.local_name);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + CommonSupportFeature.ADAPTER.asRepeated().encodedSizeWithTag(3, h5Info.features);
            if (h5Info.status != null) {
                i3 = CommonUsageStatus.ADAPTER.encodedSizeWithTag(4, h5Info.status);
            }
            return encodedSizeWithTag + i3 + h5Info.unknownFields().size();
        }

        /* renamed from: a */
        public H5Info decode(ProtoReader protoReader) throws IOException {
            C18675a aVar = new C18675a();
            aVar.f46203a = "";
            aVar.f46204b = "";
            aVar.f46206d = CommonUsageStatus.USABLE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46203a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46204b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f46205c.add(CommonSupportFeature.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46206d = CommonUsageStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, H5Info h5Info) throws IOException {
            if (h5Info.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, h5Info.app_id);
            }
            if (h5Info.local_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, h5Info.local_name);
            }
            CommonSupportFeature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, h5Info.features);
            if (h5Info.status != null) {
                CommonUsageStatus.ADAPTER.encodeWithTag(protoWriter, 4, h5Info.status);
            }
            protoWriter.writeBytes(h5Info.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.H5Info$a */
    public static final class C18675a extends Message.Builder<H5Info, C18675a> {

        /* renamed from: a */
        public String f46203a;

        /* renamed from: b */
        public String f46204b;

        /* renamed from: c */
        public List<CommonSupportFeature> f46205c = Internal.newMutableList();

        /* renamed from: d */
        public CommonUsageStatus f46206d;

        /* renamed from: a */
        public H5Info build() {
            return new H5Info(this.f46203a, this.f46204b, this.f46205c, this.f46206d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18675a newBuilder() {
        C18675a aVar = new C18675a();
        aVar.f46203a = this.app_id;
        aVar.f46204b = this.local_name;
        aVar.f46205c = Internal.copyOf("features", this.features);
        aVar.f46206d = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "H5Info");
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
        StringBuilder replace = sb.replace(0, 2, "H5Info{");
        replace.append('}');
        return replace.toString();
    }

    public H5Info(String str, String str2, List<CommonSupportFeature> list, CommonUsageStatus commonUsageStatus) {
        this(str, str2, list, commonUsageStatus, ByteString.EMPTY);
    }

    public H5Info(String str, String str2, List<CommonSupportFeature> list, CommonUsageStatus commonUsageStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.local_name = str2;
        this.features = Internal.immutableCopyOf("features", list);
        this.status = commonUsageStatus;
    }
}
