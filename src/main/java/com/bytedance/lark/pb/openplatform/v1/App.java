package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.OpenApp;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class App extends Message<App, C18632a> {
    public static final ProtoAdapter<App> ADAPTER = new C18633b();
    public static final AppType DEFAULT_APP_TYPE = AppType.UNKNOWN;
    public static final OpenApp.State DEFAULT_STATUS = OpenApp.State.UNKNOWN_STATE;
    public static final Integer DEFAULT_WEIGHT = 0;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final AppType app_type;
    public final String bot_id;
    public final String category_id;
    public final String description;
    public final String icon_key;
    public final String id;
    public final String image_url;
    public final String name;
    public final OpenApp.State status;
    public final List<String> tags;
    public final String url;
    public final Integer weight;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.App$b */
    private static final class C18633b extends ProtoAdapter<App> {
        C18633b() {
            super(FieldEncoding.LENGTH_DELIMITED, App.class);
        }

        /* renamed from: a */
        public int encodedSize(App app) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, app.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, app.category_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, app.icon_key) + ProtoAdapter.STRING.encodedSizeWithTag(4, app.name) + ProtoAdapter.STRING.encodedSizeWithTag(5, app.url) + ProtoAdapter.INT32.encodedSizeWithTag(6, app.weight);
            int i6 = 0;
            if (app.description != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(7, app.description);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, app.tags);
            if (app.app_type != null) {
                i2 = AppType.ADAPTER.encodedSizeWithTag(9, app.app_type);
            } else {
                i2 = 0;
            }
            int i7 = encodedSizeWithTag2 + i2;
            if (app.bot_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(10, app.bot_id);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (app.app_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(11, app.app_id);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (app.status != null) {
                i5 = OpenApp.State.ADAPTER.encodedSizeWithTag(12, app.status);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (app.image_url != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(13, app.image_url);
            }
            return i10 + i6 + app.unknownFields().size();
        }

        /* renamed from: a */
        public App decode(ProtoReader protoReader) throws IOException {
            C18632a aVar = new C18632a();
            aVar.f46140a = "";
            aVar.f46141b = "";
            aVar.f46142c = "";
            aVar.f46143d = "";
            aVar.f46144e = "";
            aVar.f46145f = 0;
            aVar.f46146g = "";
            aVar.f46148i = AppType.UNKNOWN;
            aVar.f46149j = "";
            aVar.f46150k = "";
            aVar.f46151l = OpenApp.State.UNKNOWN_STATE;
            aVar.f46152m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46140a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46141b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46142c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46143d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46144e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46145f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46146g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46147h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            try {
                                aVar.f46148i = AppType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 10:
                            aVar.f46149j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46150k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f46151l = OpenApp.State.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 13:
                            aVar.f46152m = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, App app) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, app.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, app.category_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, app.icon_key);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, app.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, app.url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, app.weight);
            if (app.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, app.description);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, app.tags);
            if (app.app_type != null) {
                AppType.ADAPTER.encodeWithTag(protoWriter, 9, app.app_type);
            }
            if (app.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, app.bot_id);
            }
            if (app.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, app.app_id);
            }
            if (app.status != null) {
                OpenApp.State.ADAPTER.encodeWithTag(protoWriter, 12, app.status);
            }
            if (app.image_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, app.image_url);
            }
            protoWriter.writeBytes(app.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.App$a */
    public static final class C18632a extends Message.Builder<App, C18632a> {

        /* renamed from: a */
        public String f46140a;

        /* renamed from: b */
        public String f46141b;

        /* renamed from: c */
        public String f46142c;

        /* renamed from: d */
        public String f46143d;

        /* renamed from: e */
        public String f46144e;

        /* renamed from: f */
        public Integer f46145f;

        /* renamed from: g */
        public String f46146g;

        /* renamed from: h */
        public List<String> f46147h = Internal.newMutableList();

        /* renamed from: i */
        public AppType f46148i;

        /* renamed from: j */
        public String f46149j;

        /* renamed from: k */
        public String f46150k;

        /* renamed from: l */
        public OpenApp.State f46151l;

        /* renamed from: m */
        public String f46152m;

        /* renamed from: a */
        public App build() {
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            String str5 = this.f46140a;
            if (str5 != null && (str = this.f46141b) != null && (str2 = this.f46142c) != null && (str3 = this.f46143d) != null && (str4 = this.f46144e) != null && (num = this.f46145f) != null) {
                return new App(str5, str, str2, str3, str4, num, this.f46146g, this.f46147h, this.f46148i, this.f46149j, this.f46150k, this.f46151l, this.f46152m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str5, "id", this.f46141b, "category_id", this.f46142c, "icon_key", this.f46143d, "name", this.f46144e, "url", this.f46145f, "weight");
        }
    }

    @Override // com.squareup.wire.Message
    public C18632a newBuilder() {
        C18632a aVar = new C18632a();
        aVar.f46140a = this.id;
        aVar.f46141b = this.category_id;
        aVar.f46142c = this.icon_key;
        aVar.f46143d = this.name;
        aVar.f46144e = this.url;
        aVar.f46145f = this.weight;
        aVar.f46146g = this.description;
        aVar.f46147h = Internal.copyOf("tags", this.tags);
        aVar.f46148i = this.app_type;
        aVar.f46149j = this.bot_id;
        aVar.f46150k = this.app_id;
        aVar.f46151l = this.status;
        aVar.f46152m = this.image_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "App");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", category_id=");
        sb.append(this.category_id);
        sb.append(", icon_key=");
        sb.append(this.icon_key);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", weight=");
        sb.append(this.weight);
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.app_type != null) {
            sb.append(", app_type=");
            sb.append(this.app_type);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        StringBuilder replace = sb.replace(0, 2, "App{");
        replace.append('}');
        return replace.toString();
    }

    public App(String str, String str2, String str3, String str4, String str5, Integer num, String str6, List<String> list, AppType appType, String str7, String str8, OpenApp.State state, String str9) {
        this(str, str2, str3, str4, str5, num, str6, list, appType, str7, str8, state, str9, ByteString.EMPTY);
    }

    public App(String str, String str2, String str3, String str4, String str5, Integer num, String str6, List<String> list, AppType appType, String str7, String str8, OpenApp.State state, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.category_id = str2;
        this.icon_key = str3;
        this.name = str4;
        this.url = str5;
        this.weight = num;
        this.description = str6;
        this.tags = Internal.immutableCopyOf("tags", list);
        this.app_type = appType;
        this.bot_id = str7;
        this.app_id = str8;
        this.status = state;
        this.image_url = str9;
    }
}
