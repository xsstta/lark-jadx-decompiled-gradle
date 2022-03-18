package com.bytedance.lark.pb.search.v2;

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

public final class AppMeta extends Message<AppMeta, C18945a> {
    public static final ProtoAdapter<AppMeta> ADAPTER = new C18946b();
    public static final Boolean DEFAULT_IS_AVAILABLE = false;
    public static final OpenApp.State DEFAULT_STATE = OpenApp.State.USABLE;
    private static final long serialVersionUID = 0;
    public final List<OpenApp.Ability> app_abilities;
    public final List<AppShortcutEntity> app_shortcut_entities;
    public final String app_store_url;
    public final String app_url;
    public final String bot_id;
    public final String cli_id;
    public final String id;
    public final Boolean is_available;
    public final OpenApp.State state;

    public static final class AppShortcut extends Message<AppShortcut, C18941a> {
        public static final ProtoAdapter<AppShortcut> ADAPTER = new C18942b();
        private static final long serialVersionUID = 0;
        public final String app_link;
        public final String name;

        /* renamed from: com.bytedance.lark.pb.search.v2.AppMeta$AppShortcut$b */
        private static final class C18942b extends ProtoAdapter<AppShortcut> {
            C18942b() {
                super(FieldEncoding.LENGTH_DELIMITED, AppShortcut.class);
            }

            /* renamed from: a */
            public int encodedSize(AppShortcut appShortcut) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, appShortcut.name) + ProtoAdapter.STRING.encodedSizeWithTag(2, appShortcut.app_link) + appShortcut.unknownFields().size();
            }

            /* renamed from: a */
            public AppShortcut decode(ProtoReader protoReader) throws IOException {
                C18941a aVar = new C18941a();
                aVar.f46828a = "";
                aVar.f46829b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46828a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46829b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AppShortcut appShortcut) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appShortcut.name);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, appShortcut.app_link);
                protoWriter.writeBytes(appShortcut.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18941a newBuilder() {
            C18941a aVar = new C18941a();
            aVar.f46828a = this.name;
            aVar.f46829b = this.app_link;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.AppMeta$AppShortcut$a */
        public static final class C18941a extends Message.Builder<AppShortcut, C18941a> {

            /* renamed from: a */
            public String f46828a;

            /* renamed from: b */
            public String f46829b;

            /* renamed from: a */
            public AppShortcut build() {
                String str;
                String str2 = this.f46828a;
                if (str2 != null && (str = this.f46829b) != null) {
                    return new AppShortcut(str2, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "name", this.f46829b, "app_link");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "AppShortcut");
            StringBuilder sb = new StringBuilder();
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", app_link=");
            sb.append(this.app_link);
            StringBuilder replace = sb.replace(0, 2, "AppShortcut{");
            replace.append('}');
            return replace.toString();
        }

        public AppShortcut(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public AppShortcut(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.app_link = str2;
        }
    }

    public static final class AppShortcutEntity extends Message<AppShortcutEntity, C18943a> {
        public static final ProtoAdapter<AppShortcutEntity> ADAPTER = new C18944b();
        private static final long serialVersionUID = 0;
        public final List<AppShortcut> android_items;
        public final List<AppShortcut> ios_items;
        public final List<AppShortcut> pc_items;

        /* renamed from: com.bytedance.lark.pb.search.v2.AppMeta$AppShortcutEntity$b */
        private static final class C18944b extends ProtoAdapter<AppShortcutEntity> {
            C18944b() {
                super(FieldEncoding.LENGTH_DELIMITED, AppShortcutEntity.class);
            }

            /* renamed from: a */
            public int encodedSize(AppShortcutEntity appShortcutEntity) {
                return AppShortcut.ADAPTER.asRepeated().encodedSizeWithTag(1, appShortcutEntity.pc_items) + AppShortcut.ADAPTER.asRepeated().encodedSizeWithTag(2, appShortcutEntity.ios_items) + AppShortcut.ADAPTER.asRepeated().encodedSizeWithTag(3, appShortcutEntity.android_items) + appShortcutEntity.unknownFields().size();
            }

            /* renamed from: a */
            public AppShortcutEntity decode(ProtoReader protoReader) throws IOException {
                C18943a aVar = new C18943a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46830a.add(AppShortcut.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f46831b.add(AppShortcut.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46832c.add(AppShortcut.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AppShortcutEntity appShortcutEntity) throws IOException {
                AppShortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, appShortcutEntity.pc_items);
                AppShortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, appShortcutEntity.ios_items);
                AppShortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, appShortcutEntity.android_items);
                protoWriter.writeBytes(appShortcutEntity.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.AppMeta$AppShortcutEntity$a */
        public static final class C18943a extends Message.Builder<AppShortcutEntity, C18943a> {

            /* renamed from: a */
            public List<AppShortcut> f46830a = Internal.newMutableList();

            /* renamed from: b */
            public List<AppShortcut> f46831b = Internal.newMutableList();

            /* renamed from: c */
            public List<AppShortcut> f46832c = Internal.newMutableList();

            /* renamed from: a */
            public AppShortcutEntity build() {
                return new AppShortcutEntity(this.f46830a, this.f46831b, this.f46832c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18943a newBuilder() {
            C18943a aVar = new C18943a();
            aVar.f46830a = Internal.copyOf("pc_items", this.pc_items);
            aVar.f46831b = Internal.copyOf("ios_items", this.ios_items);
            aVar.f46832c = Internal.copyOf("android_items", this.android_items);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "AppShortcutEntity");
            StringBuilder sb = new StringBuilder();
            if (!this.pc_items.isEmpty()) {
                sb.append(", pc_items=");
                sb.append(this.pc_items);
            }
            if (!this.ios_items.isEmpty()) {
                sb.append(", ios_items=");
                sb.append(this.ios_items);
            }
            if (!this.android_items.isEmpty()) {
                sb.append(", android_items=");
                sb.append(this.android_items);
            }
            StringBuilder replace = sb.replace(0, 2, "AppShortcutEntity{");
            replace.append('}');
            return replace.toString();
        }

        public AppShortcutEntity(List<AppShortcut> list, List<AppShortcut> list2, List<AppShortcut> list3) {
            this(list, list2, list3, ByteString.EMPTY);
        }

        public AppShortcutEntity(List<AppShortcut> list, List<AppShortcut> list2, List<AppShortcut> list3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.pc_items = Internal.immutableCopyOf("pc_items", list);
            this.ios_items = Internal.immutableCopyOf("ios_items", list2);
            this.android_items = Internal.immutableCopyOf("android_items", list3);
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.AppMeta$b */
    private static final class C18946b extends ProtoAdapter<AppMeta> {
        C18946b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(AppMeta appMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, appMeta.id);
            int i6 = 0;
            if (appMeta.app_store_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(8, appMeta.app_store_url);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (appMeta.is_available != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(10, appMeta.is_available);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (appMeta.state != null) {
                i3 = OpenApp.State.ADAPTER.encodedSizeWithTag(3, appMeta.state);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i8 + i3 + OpenApp.Ability.ADAPTER.asRepeated().encodedSizeWithTag(12, appMeta.app_abilities);
            if (appMeta.bot_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(13, appMeta.bot_id);
            } else {
                i4 = 0;
            }
            int i9 = encodedSizeWithTag2 + i4;
            if (appMeta.app_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(14, appMeta.app_url);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (appMeta.cli_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(15, appMeta.cli_id);
            }
            return i10 + i6 + AppShortcutEntity.ADAPTER.asRepeated().encodedSizeWithTag(11, appMeta.app_shortcut_entities) + appMeta.unknownFields().size();
        }

        /* renamed from: a */
        public AppMeta decode(ProtoReader protoReader) throws IOException {
            C18945a aVar = new C18945a();
            aVar.f46833a = "";
            aVar.f46834b = "";
            aVar.f46835c = false;
            aVar.f46836d = OpenApp.State.USABLE;
            aVar.f46838f = "";
            aVar.f46839g = "";
            aVar.f46840h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46833a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f46836d = OpenApp.State.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 8) {
                    switch (nextTag) {
                        case 10:
                            aVar.f46835c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 11:
                            aVar.f46841i.add(AppShortcutEntity.ADAPTER.decode(protoReader));
                            continue;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f46837e.add(OpenApp.Ability.ADAPTER.decode(protoReader));
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 13:
                            aVar.f46838f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 14:
                            aVar.f46839g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 15:
                            aVar.f46840h = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f46834b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AppMeta appMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appMeta.id);
            if (appMeta.app_store_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, appMeta.app_store_url);
            }
            if (appMeta.is_available != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, appMeta.is_available);
            }
            if (appMeta.state != null) {
                OpenApp.State.ADAPTER.encodeWithTag(protoWriter, 3, appMeta.state);
            }
            OpenApp.Ability.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, appMeta.app_abilities);
            if (appMeta.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, appMeta.bot_id);
            }
            if (appMeta.app_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, appMeta.app_url);
            }
            if (appMeta.cli_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, appMeta.cli_id);
            }
            AppShortcutEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, appMeta.app_shortcut_entities);
            protoWriter.writeBytes(appMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.AppMeta$a */
    public static final class C18945a extends Message.Builder<AppMeta, C18945a> {

        /* renamed from: a */
        public String f46833a;

        /* renamed from: b */
        public String f46834b;

        /* renamed from: c */
        public Boolean f46835c;

        /* renamed from: d */
        public OpenApp.State f46836d;

        /* renamed from: e */
        public List<OpenApp.Ability> f46837e = Internal.newMutableList();

        /* renamed from: f */
        public String f46838f;

        /* renamed from: g */
        public String f46839g;

        /* renamed from: h */
        public String f46840h;

        /* renamed from: i */
        public List<AppShortcutEntity> f46841i = Internal.newMutableList();

        /* renamed from: a */
        public AppMeta build() {
            String str = this.f46833a;
            if (str != null) {
                return new AppMeta(str, this.f46834b, this.f46835c, this.f46836d, this.f46837e, this.f46838f, this.f46839g, this.f46840h, this.f46841i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18945a newBuilder() {
        C18945a aVar = new C18945a();
        aVar.f46833a = this.id;
        aVar.f46834b = this.app_store_url;
        aVar.f46835c = this.is_available;
        aVar.f46836d = this.state;
        aVar.f46837e = Internal.copyOf("app_abilities", this.app_abilities);
        aVar.f46838f = this.bot_id;
        aVar.f46839g = this.app_url;
        aVar.f46840h = this.cli_id;
        aVar.f46841i = Internal.copyOf("app_shortcut_entities", this.app_shortcut_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "AppMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.app_store_url != null) {
            sb.append(", app_store_url=");
            sb.append(this.app_store_url);
        }
        if (this.is_available != null) {
            sb.append(", is_available=");
            sb.append(this.is_available);
        }
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (!this.app_abilities.isEmpty()) {
            sb.append(", app_abilities=");
            sb.append(this.app_abilities);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.app_url != null) {
            sb.append(", app_url=");
            sb.append(this.app_url);
        }
        if (this.cli_id != null) {
            sb.append(", cli_id=");
            sb.append(this.cli_id);
        }
        if (!this.app_shortcut_entities.isEmpty()) {
            sb.append(", app_shortcut_entities=");
            sb.append(this.app_shortcut_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "AppMeta{");
        replace.append('}');
        return replace.toString();
    }

    public AppMeta(String str, String str2, Boolean bool, OpenApp.State state2, List<OpenApp.Ability> list, String str3, String str4, String str5, List<AppShortcutEntity> list2) {
        this(str, str2, bool, state2, list, str3, str4, str5, list2, ByteString.EMPTY);
    }

    public AppMeta(String str, String str2, Boolean bool, OpenApp.State state2, List<OpenApp.Ability> list, String str3, String str4, String str5, List<AppShortcutEntity> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.app_store_url = str2;
        this.is_available = bool;
        this.state = state2;
        this.app_abilities = Internal.immutableCopyOf("app_abilities", list);
        this.bot_id = str3;
        this.app_url = str4;
        this.cli_id = str5;
        this.app_shortcut_entities = Internal.immutableCopyOf("app_shortcut_entities", list2);
    }
}
