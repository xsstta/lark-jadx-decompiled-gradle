package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.NavigationAppInfo;
import com.bytedance.lark.pb.basic.v1.NavigationInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ModifyNavigationOrderResponse extends Message<ModifyNavigationOrderResponse, C19175a> {
    public static final ProtoAdapter<ModifyNavigationOrderResponse> ADAPTER = new C19176b();
    public static final NavigationPlatform DEFAULT_PLATFORM = NavigationPlatform.NAV_PC;
    public static final Integer DEFAULT_PRIMARY_COUNT = 0;
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final List<NavigationAppInfo> app_info;
    public final NavigationPlatform platform;
    public final Integer primary_count;
    public final NavigationInfo tenant_navigation;
    public final Integer total_count;

    /* renamed from: com.bytedance.lark.pb.settings.v1.ModifyNavigationOrderResponse$b */
    private static final class C19176b extends ProtoAdapter<ModifyNavigationOrderResponse> {
        C19176b() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyNavigationOrderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ModifyNavigationOrderResponse modifyNavigationOrderResponse) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (modifyNavigationOrderResponse.tenant_navigation != null) {
                i = NavigationInfo.ADAPTER.encodedSizeWithTag(1, modifyNavigationOrderResponse.tenant_navigation);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + NavigationAppInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, modifyNavigationOrderResponse.app_info);
            if (modifyNavigationOrderResponse.primary_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, modifyNavigationOrderResponse.primary_count);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (modifyNavigationOrderResponse.total_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, modifyNavigationOrderResponse.total_count);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (modifyNavigationOrderResponse.platform != null) {
                i4 = NavigationPlatform.ADAPTER.encodedSizeWithTag(5, modifyNavigationOrderResponse.platform);
            }
            return i6 + i4 + modifyNavigationOrderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ModifyNavigationOrderResponse decode(ProtoReader protoReader) throws IOException {
            C19175a aVar = new C19175a();
            aVar.f47331c = 0;
            aVar.f47332d = 0;
            aVar.f47333e = NavigationPlatform.NAV_PC;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47329a = NavigationInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47330b.add(NavigationAppInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f47331c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f47332d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47333e = NavigationPlatform.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ModifyNavigationOrderResponse modifyNavigationOrderResponse) throws IOException {
            if (modifyNavigationOrderResponse.tenant_navigation != null) {
                NavigationInfo.ADAPTER.encodeWithTag(protoWriter, 1, modifyNavigationOrderResponse.tenant_navigation);
            }
            NavigationAppInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, modifyNavigationOrderResponse.app_info);
            if (modifyNavigationOrderResponse.primary_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, modifyNavigationOrderResponse.primary_count);
            }
            if (modifyNavigationOrderResponse.total_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, modifyNavigationOrderResponse.total_count);
            }
            if (modifyNavigationOrderResponse.platform != null) {
                NavigationPlatform.ADAPTER.encodeWithTag(protoWriter, 5, modifyNavigationOrderResponse.platform);
            }
            protoWriter.writeBytes(modifyNavigationOrderResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.ModifyNavigationOrderResponse$a */
    public static final class C19175a extends Message.Builder<ModifyNavigationOrderResponse, C19175a> {

        /* renamed from: a */
        public NavigationInfo f47329a;

        /* renamed from: b */
        public List<NavigationAppInfo> f47330b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f47331c;

        /* renamed from: d */
        public Integer f47332d;

        /* renamed from: e */
        public NavigationPlatform f47333e;

        /* renamed from: a */
        public ModifyNavigationOrderResponse build() {
            return new ModifyNavigationOrderResponse(this.f47329a, this.f47330b, this.f47331c, this.f47332d, this.f47333e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19175a newBuilder() {
        C19175a aVar = new C19175a();
        aVar.f47329a = this.tenant_navigation;
        aVar.f47330b = Internal.copyOf("app_info", this.app_info);
        aVar.f47331c = this.primary_count;
        aVar.f47332d = this.total_count;
        aVar.f47333e = this.platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "ModifyNavigationOrderResponse");
        StringBuilder sb = new StringBuilder();
        if (this.tenant_navigation != null) {
            sb.append(", tenant_navigation=");
            sb.append(this.tenant_navigation);
        }
        if (!this.app_info.isEmpty()) {
            sb.append(", app_info=");
            sb.append(this.app_info);
        }
        if (this.primary_count != null) {
            sb.append(", primary_count=");
            sb.append(this.primary_count);
        }
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        if (this.platform != null) {
            sb.append(", platform=");
            sb.append(this.platform);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyNavigationOrderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ModifyNavigationOrderResponse(NavigationInfo navigationInfo, List<NavigationAppInfo> list, Integer num, Integer num2, NavigationPlatform navigationPlatform) {
        this(navigationInfo, list, num, num2, navigationPlatform, ByteString.EMPTY);
    }

    public ModifyNavigationOrderResponse(NavigationInfo navigationInfo, List<NavigationAppInfo> list, Integer num, Integer num2, NavigationPlatform navigationPlatform, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_navigation = navigationInfo;
        this.app_info = Internal.immutableCopyOf("app_info", list);
        this.primary_count = num;
        this.total_count = num2;
        this.platform = navigationPlatform;
    }
}
