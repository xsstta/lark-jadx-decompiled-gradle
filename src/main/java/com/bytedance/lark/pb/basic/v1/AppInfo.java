package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class AppInfo extends Message<AppInfo, C14690a> {
    public static final ProtoAdapter<AppInfo> ADAPTER = new C14691b();
    public static final Boolean DEFAULT_PRIMARYONLY = false;
    public static final Boolean DEFAULT_UNMOVABLE = false;
    private static final long serialVersionUID = 0;
    public final String ID;
    public final String appType;
    public final Map<String, String> desc;
    public final Map<String, String> extra;
    public final String key;
    public final Map<String, String> logo;
    public final Map<String, String> name;
    public final List<PlatformInfo> platforms;
    public final Boolean primaryOnly;
    public final Boolean unmovable;

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppInfo$b */
    private static final class C14691b extends ProtoAdapter<AppInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f38848a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f38849b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, String>> f38850c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, String>> f38851d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C14691b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(AppInfo appInfo) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, appInfo.ID) + ProtoAdapter.STRING.encodedSizeWithTag(2, appInfo.key) + this.f38848a.encodedSizeWithTag(3, appInfo.name) + this.f38849b.encodedSizeWithTag(4, appInfo.logo) + ProtoAdapter.STRING.encodedSizeWithTag(5, appInfo.appType) + PlatformInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, appInfo.platforms) + ProtoAdapter.BOOL.encodedSizeWithTag(7, appInfo.primaryOnly) + this.f38850c.encodedSizeWithTag(8, appInfo.desc) + this.f38851d.encodedSizeWithTag(9, appInfo.extra);
            if (appInfo.unmovable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(10, appInfo.unmovable);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + appInfo.unknownFields().size();
        }

        /* renamed from: a */
        public AppInfo decode(ProtoReader protoReader) throws IOException {
            C14690a aVar = new C14690a();
            aVar.f38838a = "";
            aVar.f38839b = "";
            aVar.f38842e = "";
            aVar.f38844g = false;
            aVar.f38847j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f38838a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f38839b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38840c.putAll(this.f38848a.decode(protoReader));
                            break;
                        case 4:
                            aVar.f38841d.putAll(this.f38849b.decode(protoReader));
                            break;
                        case 5:
                            aVar.f38842e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38843f.add(PlatformInfo.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f38844g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f38845h.putAll(this.f38850c.decode(protoReader));
                            break;
                        case 9:
                            aVar.f38846i.putAll(this.f38851d.decode(protoReader));
                            break;
                        case 10:
                            aVar.f38847j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AppInfo appInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appInfo.ID);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, appInfo.key);
            this.f38848a.encodeWithTag(protoWriter, 3, appInfo.name);
            this.f38849b.encodeWithTag(protoWriter, 4, appInfo.logo);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, appInfo.appType);
            PlatformInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, appInfo.platforms);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, appInfo.primaryOnly);
            this.f38850c.encodeWithTag(protoWriter, 8, appInfo.desc);
            this.f38851d.encodeWithTag(protoWriter, 9, appInfo.extra);
            if (appInfo.unmovable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, appInfo.unmovable);
            }
            protoWriter.writeBytes(appInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.AppInfo$a */
    public static final class C14690a extends Message.Builder<AppInfo, C14690a> {

        /* renamed from: a */
        public String f38838a;

        /* renamed from: b */
        public String f38839b;

        /* renamed from: c */
        public Map<String, String> f38840c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, String> f38841d = Internal.newMutableMap();

        /* renamed from: e */
        public String f38842e;

        /* renamed from: f */
        public List<PlatformInfo> f38843f = Internal.newMutableList();

        /* renamed from: g */
        public Boolean f38844g;

        /* renamed from: h */
        public Map<String, String> f38845h = Internal.newMutableMap();

        /* renamed from: i */
        public Map<String, String> f38846i = Internal.newMutableMap();

        /* renamed from: j */
        public Boolean f38847j;

        /* renamed from: a */
        public AppInfo build() {
            String str;
            String str2;
            Boolean bool;
            String str3 = this.f38838a;
            if (str3 != null && (str = this.f38839b) != null && (str2 = this.f38842e) != null && (bool = this.f38844g) != null) {
                return new AppInfo(str3, str, this.f38840c, this.f38841d, str2, this.f38843f, bool, this.f38845h, this.f38846i, this.f38847j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "ID", this.f38839b, "key", this.f38842e, "appType", this.f38844g, "primaryOnly");
        }
    }

    @Override // com.squareup.wire.Message
    public C14690a newBuilder() {
        C14690a aVar = new C14690a();
        aVar.f38838a = this.ID;
        aVar.f38839b = this.key;
        aVar.f38840c = Internal.copyOf("name", this.name);
        aVar.f38841d = Internal.copyOf("logo", this.logo);
        aVar.f38842e = this.appType;
        aVar.f38843f = Internal.copyOf("platforms", this.platforms);
        aVar.f38844g = this.primaryOnly;
        aVar.f38845h = Internal.copyOf("desc", this.desc);
        aVar.f38846i = Internal.copyOf("extra", this.extra);
        aVar.f38847j = this.unmovable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "AppInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", ID=");
        sb.append(this.ID);
        sb.append(", key=");
        sb.append(this.key);
        if (!this.name.isEmpty()) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.logo.isEmpty()) {
            sb.append(", logo=");
            sb.append(this.logo);
        }
        sb.append(", appType=");
        sb.append(this.appType);
        if (!this.platforms.isEmpty()) {
            sb.append(", platforms=");
            sb.append(this.platforms);
        }
        sb.append(", primaryOnly=");
        sb.append(this.primaryOnly);
        if (!this.desc.isEmpty()) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.unmovable != null) {
            sb.append(", unmovable=");
            sb.append(this.unmovable);
        }
        StringBuilder replace = sb.replace(0, 2, "AppInfo{");
        replace.append('}');
        return replace.toString();
    }

    public AppInfo(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, List<PlatformInfo> list, Boolean bool, Map<String, String> map3, Map<String, String> map4, Boolean bool2) {
        this(str, str2, map, map2, str3, list, bool, map3, map4, bool2, ByteString.EMPTY);
    }

    public AppInfo(String str, String str2, Map<String, String> map, Map<String, String> map2, String str3, List<PlatformInfo> list, Boolean bool, Map<String, String> map3, Map<String, String> map4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ID = str;
        this.key = str2;
        this.name = Internal.immutableCopyOf("name", map);
        this.logo = Internal.immutableCopyOf("logo", map2);
        this.appType = str3;
        this.platforms = Internal.immutableCopyOf("platforms", list);
        this.primaryOnly = bool;
        this.desc = Internal.immutableCopyOf("desc", map3);
        this.extra = Internal.immutableCopyOf("extra", map4);
        this.unmovable = bool2;
    }
}
