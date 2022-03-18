package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.AppStatusInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AppMeta extends Message<AppMeta, C50186a> {
    public static final ProtoAdapter<AppMeta> ADAPTER = new C50187b();
    public static final Boolean DEFAULT_IS_AVAILABLE = false;
    private static final long serialVersionUID = 0;
    public final List<AppStatusInfo.FeatureAbility> mapp_ability;
    public final List<AppShortcutEntity> mapp_shortcut_entities;
    public final String mapp_store_url;
    public final String mapp_url;
    public final String mbot_id;
    public final String mcli_id;
    public final String mid;
    public final Boolean mis_available;
    public final AppStatusInfo.AppUsageStatus mstatus;

    public static final class AppShortcutEntity extends Message<AppShortcutEntity, C50182a> {
        public static final ProtoAdapter<AppShortcutEntity> ADAPTER = new C50183b();
        private static final long serialVersionUID = 0;
        public final List<AppShortcutItem> mAndroidShortcutItems;
        public final List<AppShortcutItem> mIOSShortcutItems;
        public final List<AppShortcutItem> mPCShortcutItems;

        /* renamed from: com.ss.android.lark.pb.usearch.AppMeta$AppShortcutEntity$b */
        private static final class C50183b extends ProtoAdapter<AppShortcutEntity> {
            C50183b() {
                super(FieldEncoding.LENGTH_DELIMITED, AppShortcutEntity.class);
            }

            /* renamed from: a */
            public int encodedSize(AppShortcutEntity appShortcutEntity) {
                return AppShortcutItem.ADAPTER.asRepeated().encodedSizeWithTag(1, appShortcutEntity.mPCShortcutItems) + AppShortcutItem.ADAPTER.asRepeated().encodedSizeWithTag(2, appShortcutEntity.mIOSShortcutItems) + AppShortcutItem.ADAPTER.asRepeated().encodedSizeWithTag(3, appShortcutEntity.mAndroidShortcutItems) + appShortcutEntity.unknownFields().size();
            }

            /* renamed from: a */
            public AppShortcutEntity decode(ProtoReader protoReader) throws IOException {
                C50182a aVar = new C50182a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125381a.add(AppShortcutItem.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f125382b.add(AppShortcutItem.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125383c.add(AppShortcutItem.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AppShortcutEntity appShortcutEntity) throws IOException {
                AppShortcutItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, appShortcutEntity.mPCShortcutItems);
                AppShortcutItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, appShortcutEntity.mIOSShortcutItems);
                AppShortcutItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, appShortcutEntity.mAndroidShortcutItems);
                protoWriter.writeBytes(appShortcutEntity.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.AppMeta$AppShortcutEntity$a */
        public static final class C50182a extends Message.Builder<AppShortcutEntity, C50182a> {

            /* renamed from: a */
            public List<AppShortcutItem> f125381a = Internal.newMutableList();

            /* renamed from: b */
            public List<AppShortcutItem> f125382b = Internal.newMutableList();

            /* renamed from: c */
            public List<AppShortcutItem> f125383c = Internal.newMutableList();

            /* renamed from: a */
            public AppShortcutEntity build() {
                return new AppShortcutEntity(this.f125381a, this.f125382b, this.f125383c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50182a newBuilder() {
            C50182a aVar = new C50182a();
            aVar.f125381a = Internal.copyOf("mPCShortcutItems", this.mPCShortcutItems);
            aVar.f125382b = Internal.copyOf("mIOSShortcutItems", this.mIOSShortcutItems);
            aVar.f125383c = Internal.copyOf("mAndroidShortcutItems", this.mAndroidShortcutItems);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.mPCShortcutItems.isEmpty()) {
                sb.append(", PCShortcutItems=");
                sb.append(this.mPCShortcutItems);
            }
            if (!this.mIOSShortcutItems.isEmpty()) {
                sb.append(", IOSShortcutItems=");
                sb.append(this.mIOSShortcutItems);
            }
            if (!this.mAndroidShortcutItems.isEmpty()) {
                sb.append(", AndroidShortcutItems=");
                sb.append(this.mAndroidShortcutItems);
            }
            StringBuilder replace = sb.replace(0, 2, "AppShortcutEntity{");
            replace.append('}');
            return replace.toString();
        }

        public AppShortcutEntity(List<AppShortcutItem> list, List<AppShortcutItem> list2, List<AppShortcutItem> list3) {
            this(list, list2, list3, ByteString.EMPTY);
        }

        public AppShortcutEntity(List<AppShortcutItem> list, List<AppShortcutItem> list2, List<AppShortcutItem> list3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mPCShortcutItems = Internal.immutableCopyOf("mPCShortcutItems", list);
            this.mIOSShortcutItems = Internal.immutableCopyOf("mIOSShortcutItems", list2);
            this.mAndroidShortcutItems = Internal.immutableCopyOf("mAndroidShortcutItems", list3);
        }
    }

    public static final class AppShortcutItem extends Message<AppShortcutItem, C50184a> {
        public static final ProtoAdapter<AppShortcutItem> ADAPTER = new C50185b();
        private static final long serialVersionUID = 0;
        public final String mapp_link;
        public final String mname;

        /* renamed from: com.ss.android.lark.pb.usearch.AppMeta$AppShortcutItem$b */
        private static final class C50185b extends ProtoAdapter<AppShortcutItem> {
            C50185b() {
                super(FieldEncoding.LENGTH_DELIMITED, AppShortcutItem.class);
            }

            /* renamed from: a */
            public int encodedSize(AppShortcutItem appShortcutItem) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, appShortcutItem.mname) + ProtoAdapter.STRING.encodedSizeWithTag(2, appShortcutItem.mapp_link) + appShortcutItem.unknownFields().size();
            }

            /* renamed from: a */
            public AppShortcutItem decode(ProtoReader protoReader) throws IOException {
                C50184a aVar = new C50184a();
                aVar.f125384a = "";
                aVar.f125385b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125384a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125385b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AppShortcutItem appShortcutItem) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appShortcutItem.mname);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, appShortcutItem.mapp_link);
                protoWriter.writeBytes(appShortcutItem.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50184a newBuilder() {
            C50184a aVar = new C50184a();
            aVar.f125384a = this.mname;
            aVar.f125385b = this.mapp_link;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.usearch.AppMeta$AppShortcutItem$a */
        public static final class C50184a extends Message.Builder<AppShortcutItem, C50184a> {

            /* renamed from: a */
            public String f125384a;

            /* renamed from: b */
            public String f125385b;

            /* renamed from: a */
            public AppShortcutItem build() {
                String str;
                String str2 = this.f125384a;
                if (str2 != null && (str = this.f125385b) != null) {
                    return new AppShortcutItem(str2, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "mname", this.f125385b, "mapp_link");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", name=");
            sb.append(this.mname);
            sb.append(", app_link=");
            sb.append(this.mapp_link);
            StringBuilder replace = sb.replace(0, 2, "AppShortcutItem{");
            replace.append('}');
            return replace.toString();
        }

        public AppShortcutItem(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public AppShortcutItem(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mname = str;
            this.mapp_link = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.AppMeta$b */
    private static final class C50187b extends ProtoAdapter<AppMeta> {
        C50187b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(AppMeta appMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, appMeta.mid);
            int i6 = 0;
            if (appMeta.mapp_store_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, appMeta.mapp_store_url);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (appMeta.mis_available != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, appMeta.mis_available);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (appMeta.mstatus != null) {
                i3 = AppStatusInfo.AppUsageStatus.ADAPTER.encodedSizeWithTag(4, appMeta.mstatus);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i8 + i3 + AppStatusInfo.FeatureAbility.ADAPTER.asRepeated().encodedSizeWithTag(5, appMeta.mapp_ability);
            if (appMeta.mbot_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, appMeta.mbot_id);
            } else {
                i4 = 0;
            }
            int i9 = encodedSizeWithTag2 + i4;
            if (appMeta.mapp_url != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, appMeta.mapp_url);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (appMeta.mcli_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, appMeta.mcli_id);
            }
            return i10 + i6 + AppShortcutEntity.ADAPTER.asRepeated().encodedSizeWithTag(9, appMeta.mapp_shortcut_entities) + appMeta.unknownFields().size();
        }

        /* renamed from: a */
        public AppMeta decode(ProtoReader protoReader) throws IOException {
            C50186a aVar = new C50186a();
            aVar.f125386a = "";
            aVar.f125387b = "";
            aVar.f125388c = false;
            aVar.f125391f = "";
            aVar.f125392g = "";
            aVar.f125393h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125386a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125387b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125388c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f125389d = AppStatusInfo.AppUsageStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f125390e.add(AppStatusInfo.FeatureAbility.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f125391f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125392g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125393h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125394i.add(AppShortcutEntity.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, AppMeta appMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appMeta.mid);
            if (appMeta.mapp_store_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, appMeta.mapp_store_url);
            }
            if (appMeta.mis_available != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, appMeta.mis_available);
            }
            if (appMeta.mstatus != null) {
                AppStatusInfo.AppUsageStatus.ADAPTER.encodeWithTag(protoWriter, 4, appMeta.mstatus);
            }
            AppStatusInfo.FeatureAbility.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, appMeta.mapp_ability);
            if (appMeta.mbot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, appMeta.mbot_id);
            }
            if (appMeta.mapp_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, appMeta.mapp_url);
            }
            if (appMeta.mcli_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, appMeta.mcli_id);
            }
            AppShortcutEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, appMeta.mapp_shortcut_entities);
            protoWriter.writeBytes(appMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.AppMeta$a */
    public static final class C50186a extends Message.Builder<AppMeta, C50186a> {

        /* renamed from: a */
        public String f125386a;

        /* renamed from: b */
        public String f125387b;

        /* renamed from: c */
        public Boolean f125388c;

        /* renamed from: d */
        public AppStatusInfo.AppUsageStatus f125389d;

        /* renamed from: e */
        public List<AppStatusInfo.FeatureAbility> f125390e = Internal.newMutableList();

        /* renamed from: f */
        public String f125391f;

        /* renamed from: g */
        public String f125392g;

        /* renamed from: h */
        public String f125393h;

        /* renamed from: i */
        public List<AppShortcutEntity> f125394i = Internal.newMutableList();

        /* renamed from: a */
        public AppMeta build() {
            String str = this.f125386a;
            if (str != null) {
                return new AppMeta(str, this.f125387b, this.f125388c, this.f125389d, this.f125390e, this.f125391f, this.f125392g, this.f125393h, this.f125394i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public C50186a newBuilder() {
        C50186a aVar = new C50186a();
        aVar.f125386a = this.mid;
        aVar.f125387b = this.mapp_store_url;
        aVar.f125388c = this.mis_available;
        aVar.f125389d = this.mstatus;
        aVar.f125390e = Internal.copyOf("mapp_ability", this.mapp_ability);
        aVar.f125391f = this.mbot_id;
        aVar.f125392g = this.mapp_url;
        aVar.f125393h = this.mcli_id;
        aVar.f125394i = Internal.copyOf("mapp_shortcut_entities", this.mapp_shortcut_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mapp_store_url != null) {
            sb.append(", app_store_url=");
            sb.append(this.mapp_store_url);
        }
        if (this.mis_available != null) {
            sb.append(", is_available=");
            sb.append(this.mis_available);
        }
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (!this.mapp_ability.isEmpty()) {
            sb.append(", app_ability=");
            sb.append(this.mapp_ability);
        }
        if (this.mbot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.mbot_id);
        }
        if (this.mapp_url != null) {
            sb.append(", app_url=");
            sb.append(this.mapp_url);
        }
        if (this.mcli_id != null) {
            sb.append(", cli_id=");
            sb.append(this.mcli_id);
        }
        if (!this.mapp_shortcut_entities.isEmpty()) {
            sb.append(", app_shortcut_entities=");
            sb.append(this.mapp_shortcut_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "AppMeta{");
        replace.append('}');
        return replace.toString();
    }

    public AppMeta(String str, String str2, Boolean bool, AppStatusInfo.AppUsageStatus appUsageStatus, List<AppStatusInfo.FeatureAbility> list, String str3, String str4, String str5, List<AppShortcutEntity> list2) {
        this(str, str2, bool, appUsageStatus, list, str3, str4, str5, list2, ByteString.EMPTY);
    }

    public AppMeta(String str, String str2, Boolean bool, AppStatusInfo.AppUsageStatus appUsageStatus, List<AppStatusInfo.FeatureAbility> list, String str3, String str4, String str5, List<AppShortcutEntity> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mapp_store_url = str2;
        this.mis_available = bool;
        this.mstatus = appUsageStatus;
        this.mapp_ability = Internal.immutableCopyOf("mapp_ability", list);
        this.mbot_id = str3;
        this.mapp_url = str4;
        this.mcli_id = str5;
        this.mapp_shortcut_entities = Internal.immutableCopyOf("mapp_shortcut_entities", list2);
    }
}
