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
import java.util.List;
import okio.ByteString;

public final class NavigationInfo extends Message<NavigationInfo, C15087a> {
    public static final ProtoAdapter<NavigationInfo> ADAPTER = new C15088b();
    public static final Long DEFAULT_NEW_VERSION = 0L;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final List<AppInfo> mainNavigation;
    public final Long new_version;
    public final List<AppInfo> shortcutNavigation;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationInfo$b */
    private static final class C15088b extends ProtoAdapter<NavigationInfo> {
        C15088b() {
            super(FieldEncoding.LENGTH_DELIMITED, NavigationInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(NavigationInfo navigationInfo) {
            int i;
            int encodedSizeWithTag = AppInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, navigationInfo.mainNavigation) + AppInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, navigationInfo.shortcutNavigation) + ProtoAdapter.INT32.encodedSizeWithTag(3, navigationInfo.version);
            if (navigationInfo.new_version != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(4, navigationInfo.new_version);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + navigationInfo.unknownFields().size();
        }

        /* renamed from: a */
        public NavigationInfo decode(ProtoReader protoReader) throws IOException {
            C15087a aVar = new C15087a();
            aVar.f39971c = 0;
            aVar.f39972d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39969a.add(AppInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f39970b.add(AppInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f39971c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39972d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, NavigationInfo navigationInfo) throws IOException {
            AppInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, navigationInfo.mainNavigation);
            AppInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, navigationInfo.shortcutNavigation);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, navigationInfo.version);
            if (navigationInfo.new_version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, navigationInfo.new_version);
            }
            protoWriter.writeBytes(navigationInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.NavigationInfo$a */
    public static final class C15087a extends Message.Builder<NavigationInfo, C15087a> {

        /* renamed from: a */
        public List<AppInfo> f39969a = Internal.newMutableList();

        /* renamed from: b */
        public List<AppInfo> f39970b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f39971c;

        /* renamed from: d */
        public Long f39972d;

        /* renamed from: a */
        public NavigationInfo build() {
            Integer num = this.f39971c;
            if (num != null) {
                return new NavigationInfo(this.f39969a, this.f39970b, num, this.f39972d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        }
    }

    @Override // com.squareup.wire.Message
    public C15087a newBuilder() {
        C15087a aVar = new C15087a();
        aVar.f39969a = Internal.copyOf("mainNavigation", this.mainNavigation);
        aVar.f39970b = Internal.copyOf("shortcutNavigation", this.shortcutNavigation);
        aVar.f39971c = this.version;
        aVar.f39972d = this.new_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "NavigationInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.mainNavigation.isEmpty()) {
            sb.append(", mainNavigation=");
            sb.append(this.mainNavigation);
        }
        if (!this.shortcutNavigation.isEmpty()) {
            sb.append(", shortcutNavigation=");
            sb.append(this.shortcutNavigation);
        }
        sb.append(", version=");
        sb.append(this.version);
        if (this.new_version != null) {
            sb.append(", new_version=");
            sb.append(this.new_version);
        }
        StringBuilder replace = sb.replace(0, 2, "NavigationInfo{");
        replace.append('}');
        return replace.toString();
    }

    public NavigationInfo(List<AppInfo> list, List<AppInfo> list2, Integer num, Long l) {
        this(list, list2, num, l, ByteString.EMPTY);
    }

    public NavigationInfo(List<AppInfo> list, List<AppInfo> list2, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mainNavigation = Internal.immutableCopyOf("mainNavigation", list);
        this.shortcutNavigation = Internal.immutableCopyOf("shortcutNavigation", list2);
        this.version = num;
        this.new_version = l;
    }
}
