package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.NavigationUniqueId;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ModifyNavigationOrderRequest extends Message<ModifyNavigationOrderRequest, C19173a> {
    public static final ProtoAdapter<ModifyNavigationOrderRequest> ADAPTER = new C19174b();
    public static final NavigationPlatform DEFAULT_PLATFORM = NavigationPlatform.NAV_PC;
    private static final long serialVersionUID = 0;
    public final List<NavigationUniqueId> main_navigation;
    public final NavigationPlatform platform;
    public final List<NavigationUniqueId> shortcut_navigation;

    /* renamed from: com.bytedance.lark.pb.settings.v1.ModifyNavigationOrderRequest$b */
    private static final class C19174b extends ProtoAdapter<ModifyNavigationOrderRequest> {
        C19174b() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyNavigationOrderRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ModifyNavigationOrderRequest modifyNavigationOrderRequest) {
            int i;
            int encodedSizeWithTag = NavigationUniqueId.ADAPTER.asRepeated().encodedSizeWithTag(1, modifyNavigationOrderRequest.main_navigation) + NavigationUniqueId.ADAPTER.asRepeated().encodedSizeWithTag(2, modifyNavigationOrderRequest.shortcut_navigation);
            if (modifyNavigationOrderRequest.platform != null) {
                i = NavigationPlatform.ADAPTER.encodedSizeWithTag(3, modifyNavigationOrderRequest.platform);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + modifyNavigationOrderRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ModifyNavigationOrderRequest decode(ProtoReader protoReader) throws IOException {
            C19173a aVar = new C19173a();
            aVar.f47328c = NavigationPlatform.NAV_PC;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47326a.add(NavigationUniqueId.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47327b.add(NavigationUniqueId.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47328c = NavigationPlatform.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ModifyNavigationOrderRequest modifyNavigationOrderRequest) throws IOException {
            NavigationUniqueId.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, modifyNavigationOrderRequest.main_navigation);
            NavigationUniqueId.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, modifyNavigationOrderRequest.shortcut_navigation);
            if (modifyNavigationOrderRequest.platform != null) {
                NavigationPlatform.ADAPTER.encodeWithTag(protoWriter, 3, modifyNavigationOrderRequest.platform);
            }
            protoWriter.writeBytes(modifyNavigationOrderRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.ModifyNavigationOrderRequest$a */
    public static final class C19173a extends Message.Builder<ModifyNavigationOrderRequest, C19173a> {

        /* renamed from: a */
        public List<NavigationUniqueId> f47326a = Internal.newMutableList();

        /* renamed from: b */
        public List<NavigationUniqueId> f47327b = Internal.newMutableList();

        /* renamed from: c */
        public NavigationPlatform f47328c;

        /* renamed from: a */
        public ModifyNavigationOrderRequest build() {
            return new ModifyNavigationOrderRequest(this.f47326a, this.f47327b, this.f47328c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19173a mo65504a(NavigationPlatform navigationPlatform) {
            this.f47328c = navigationPlatform;
            return this;
        }

        /* renamed from: a */
        public C19173a mo65505a(List<NavigationUniqueId> list) {
            Internal.checkElementsNotNull(list);
            this.f47326a = list;
            return this;
        }

        /* renamed from: b */
        public C19173a mo65507b(List<NavigationUniqueId> list) {
            Internal.checkElementsNotNull(list);
            this.f47327b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19173a newBuilder() {
        C19173a aVar = new C19173a();
        aVar.f47326a = Internal.copyOf("main_navigation", this.main_navigation);
        aVar.f47327b = Internal.copyOf("shortcut_navigation", this.shortcut_navigation);
        aVar.f47328c = this.platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "ModifyNavigationOrderRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.main_navigation.isEmpty()) {
            sb.append(", main_navigation=");
            sb.append(this.main_navigation);
        }
        if (!this.shortcut_navigation.isEmpty()) {
            sb.append(", shortcut_navigation=");
            sb.append(this.shortcut_navigation);
        }
        if (this.platform != null) {
            sb.append(", platform=");
            sb.append(this.platform);
        }
        StringBuilder replace = sb.replace(0, 2, "ModifyNavigationOrderRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ModifyNavigationOrderRequest(List<NavigationUniqueId> list, List<NavigationUniqueId> list2, NavigationPlatform navigationPlatform) {
        this(list, list2, navigationPlatform, ByteString.EMPTY);
    }

    public ModifyNavigationOrderRequest(List<NavigationUniqueId> list, List<NavigationUniqueId> list2, NavigationPlatform navigationPlatform, ByteString byteString) {
        super(ADAPTER, byteString);
        this.main_navigation = Internal.immutableCopyOf("main_navigation", list);
        this.shortcut_navigation = Internal.immutableCopyOf("shortcut_navigation", list2);
        this.platform = navigationPlatform;
    }
}
