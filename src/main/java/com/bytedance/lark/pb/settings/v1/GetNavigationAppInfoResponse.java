package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.NavigationAppInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetNavigationAppInfoResponse extends Message<GetNavigationAppInfoResponse, C19149a> {
    public static final ProtoAdapter<GetNavigationAppInfoResponse> ADAPTER = new C19150b();
    public static final NavigationPlatform DEFAULT_PLATFORM = NavigationPlatform.NAV_PC;
    public static final Integer DEFAULT_PRIMARY_COUNT = 0;
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<NavigationAppInfo> app_info;
    public final NavigationPlatform platform;
    public final Integer primary_count;
    public final Integer total_count;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoResponse$b */
    private static final class C19150b extends ProtoAdapter<GetNavigationAppInfoResponse> {
        C19150b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNavigationAppInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNavigationAppInfoResponse getNavigationAppInfoResponse) {
            int i;
            int encodedSizeWithTag = NavigationAppInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getNavigationAppInfoResponse.app_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, getNavigationAppInfoResponse.primary_count);
            int i2 = 0;
            if (getNavigationAppInfoResponse.total_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, getNavigationAppInfoResponse.total_count);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getNavigationAppInfoResponse.platform != null) {
                i2 = NavigationPlatform.ADAPTER.encodedSizeWithTag(4, getNavigationAppInfoResponse.platform);
            }
            return i3 + i2 + getNavigationAppInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNavigationAppInfoResponse decode(ProtoReader protoReader) throws IOException {
            C19149a aVar = new C19149a();
            aVar.f47289b = 0;
            aVar.f47290c = 0;
            aVar.f47291d = NavigationPlatform.NAV_PC;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47288a.add(NavigationAppInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47289b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47290c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47291d = NavigationPlatform.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNavigationAppInfoResponse getNavigationAppInfoResponse) throws IOException {
            NavigationAppInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getNavigationAppInfoResponse.app_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getNavigationAppInfoResponse.primary_count);
            if (getNavigationAppInfoResponse.total_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getNavigationAppInfoResponse.total_count);
            }
            if (getNavigationAppInfoResponse.platform != null) {
                NavigationPlatform.ADAPTER.encodeWithTag(protoWriter, 4, getNavigationAppInfoResponse.platform);
            }
            protoWriter.writeBytes(getNavigationAppInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoResponse$a */
    public static final class C19149a extends Message.Builder<GetNavigationAppInfoResponse, C19149a> {

        /* renamed from: a */
        public List<NavigationAppInfo> f47288a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f47289b;

        /* renamed from: c */
        public Integer f47290c;

        /* renamed from: d */
        public NavigationPlatform f47291d;

        /* renamed from: a */
        public GetNavigationAppInfoResponse build() {
            Integer num = this.f47289b;
            if (num != null) {
                return new GetNavigationAppInfoResponse(this.f47288a, num, this.f47290c, this.f47291d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "primary_count");
        }
    }

    @Override // com.squareup.wire.Message
    public C19149a newBuilder() {
        C19149a aVar = new C19149a();
        aVar.f47288a = Internal.copyOf("app_info", this.app_info);
        aVar.f47289b = this.primary_count;
        aVar.f47290c = this.total_count;
        aVar.f47291d = this.platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetNavigationAppInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.app_info.isEmpty()) {
            sb.append(", app_info=");
            sb.append(this.app_info);
        }
        sb.append(", primary_count=");
        sb.append(this.primary_count);
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        if (this.platform != null) {
            sb.append(", platform=");
            sb.append(this.platform);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNavigationAppInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNavigationAppInfoResponse(List<NavigationAppInfo> list, Integer num, Integer num2, NavigationPlatform navigationPlatform) {
        this(list, num, num2, navigationPlatform, ByteString.EMPTY);
    }

    public GetNavigationAppInfoResponse(List<NavigationAppInfo> list, Integer num, Integer num2, NavigationPlatform navigationPlatform, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_info = Internal.immutableCopyOf("app_info", list);
        this.primary_count = num;
        this.total_count = num2;
        this.platform = navigationPlatform;
    }
}
