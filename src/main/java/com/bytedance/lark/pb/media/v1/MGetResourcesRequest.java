package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MGetResourcesRequest extends Message<MGetResourcesRequest, C18272a> {
    public static final ProtoAdapter<MGetResourcesRequest> ADAPTER = new C18273b();
    public static final Boolean DEFAULT_FROM_LOCAL = false;
    public static final Boolean DEFAULT_IS_EMOJIS = false;
    public static final Boolean DEFAULT_IS_REACTION = false;
    public static final DownloadFileScene DEFAULT_SCENE = DownloadFileScene.CHAT;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    private static final long serialVersionUID = 0;
    public final Boolean from_local;
    public final List<ImageSetPassThrough> image_set_pass_through;
    public final Boolean is_emojis;
    public final Boolean is_reaction;
    public final DownloadFileScene scene;
    public final List<Set> sets;
    public final SyncDataStrategy sync_data_strategy;

    public static final class Set extends Message<Set, C18270a> {
        public static final ProtoAdapter<Set> ADAPTER = new C18271b();
        private static final long serialVersionUID = 0;
        public final AvatarResourceParams avatarParams;
        public final AvatarFsUnitParams avatar_fs_unit_params;
        public final String fs_unit;
        public final String key;
        public final String path;

        /* renamed from: com.bytedance.lark.pb.media.v1.MGetResourcesRequest$Set$b */
        private static final class C18271b extends ProtoAdapter<Set> {
            C18271b() {
                super(FieldEncoding.LENGTH_DELIMITED, Set.class);
            }

            /* renamed from: a */
            public int encodedSize(Set set) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, set.key);
                int i4 = 0;
                if (set.path != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, set.path);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (set.avatarParams != null) {
                    i2 = AvatarResourceParams.ADAPTER.encodedSizeWithTag(3, set.avatarParams);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (set.avatar_fs_unit_params != null) {
                    i3 = AvatarFsUnitParams.ADAPTER.encodedSizeWithTag(4, set.avatar_fs_unit_params);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (set.fs_unit != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, set.fs_unit);
                }
                return i7 + i4 + set.unknownFields().size();
            }

            /* renamed from: a */
            public Set decode(ProtoReader protoReader) throws IOException {
                C18270a aVar = new C18270a();
                aVar.f45519a = "";
                aVar.f45520b = "";
                aVar.f45523e = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45519a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45520b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f45521c = AvatarResourceParams.ADAPTER.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f45522d = AvatarFsUnitParams.ADAPTER.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45523e = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Set set) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, set.key);
                if (set.path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, set.path);
                }
                if (set.avatarParams != null) {
                    AvatarResourceParams.ADAPTER.encodeWithTag(protoWriter, 3, set.avatarParams);
                }
                if (set.avatar_fs_unit_params != null) {
                    AvatarFsUnitParams.ADAPTER.encodeWithTag(protoWriter, 4, set.avatar_fs_unit_params);
                }
                if (set.fs_unit != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, set.fs_unit);
                }
                protoWriter.writeBytes(set.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.media.v1.MGetResourcesRequest$Set$a */
        public static final class C18270a extends Message.Builder<Set, C18270a> {

            /* renamed from: a */
            public String f45519a;

            /* renamed from: b */
            public String f45520b;

            /* renamed from: c */
            public AvatarResourceParams f45521c;

            /* renamed from: d */
            public AvatarFsUnitParams f45522d;

            /* renamed from: e */
            public String f45523e;

            /* renamed from: a */
            public Set build() {
                String str = this.f45519a;
                if (str != null) {
                    return new Set(str, this.f45520b, this.f45521c, this.f45522d, this.f45523e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "key");
            }

            /* renamed from: a */
            public C18270a mo63288a(AvatarFsUnitParams avatarFsUnitParams) {
                this.f45522d = avatarFsUnitParams;
                return this;
            }

            /* renamed from: b */
            public C18270a mo63292b(String str) {
                this.f45520b = str;
                return this;
            }

            /* renamed from: a */
            public C18270a mo63289a(AvatarResourceParams avatarResourceParams) {
                this.f45521c = avatarResourceParams;
                return this;
            }

            /* renamed from: a */
            public C18270a mo63290a(String str) {
                this.f45519a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18270a newBuilder() {
            C18270a aVar = new C18270a();
            aVar.f45519a = this.key;
            aVar.f45520b = this.path;
            aVar.f45521c = this.avatarParams;
            aVar.f45522d = this.avatar_fs_unit_params;
            aVar.f45523e = this.fs_unit;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("media", "Set");
            StringBuilder sb = new StringBuilder();
            sb.append(", key=");
            sb.append(this.key);
            if (this.path != null) {
                sb.append(", path=");
                sb.append(this.path);
            }
            if (this.avatarParams != null) {
                sb.append(", avatarParams=");
                sb.append(this.avatarParams);
            }
            if (this.avatar_fs_unit_params != null) {
                sb.append(", avatar_fs_unit_params=");
                sb.append(this.avatar_fs_unit_params);
            }
            if (this.fs_unit != null) {
                sb.append(", fs_unit=");
                sb.append(this.fs_unit);
            }
            StringBuilder replace = sb.replace(0, 2, "Set{");
            replace.append('}');
            return replace.toString();
        }

        public Set(String str, String str2, AvatarResourceParams avatarResourceParams, AvatarFsUnitParams avatarFsUnitParams, String str3) {
            this(str, str2, avatarResourceParams, avatarFsUnitParams, str3, ByteString.EMPTY);
        }

        public Set(String str, String str2, AvatarResourceParams avatarResourceParams, AvatarFsUnitParams avatarFsUnitParams, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.key = str;
            this.path = str2;
            this.avatarParams = avatarResourceParams;
            this.avatar_fs_unit_params = avatarFsUnitParams;
            this.fs_unit = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.MGetResourcesRequest$b */
    private static final class C18273b extends ProtoAdapter<MGetResourcesRequest> {
        C18273b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetResourcesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetResourcesRequest mGetResourcesRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = Set.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetResourcesRequest.sets);
            int i5 = 0;
            if (mGetResourcesRequest.from_local != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mGetResourcesRequest.from_local);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (mGetResourcesRequest.is_reaction != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mGetResourcesRequest.is_reaction);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (mGetResourcesRequest.sync_data_strategy != null) {
                i3 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(4, mGetResourcesRequest.sync_data_strategy);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (mGetResourcesRequest.scene != null) {
                i4 = DownloadFileScene.ADAPTER.encodedSizeWithTag(5, mGetResourcesRequest.scene);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (mGetResourcesRequest.is_emojis != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, mGetResourcesRequest.is_emojis);
            }
            return i9 + i5 + ImageSetPassThrough.ADAPTER.asRepeated().encodedSizeWithTag(20, mGetResourcesRequest.image_set_pass_through) + mGetResourcesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetResourcesRequest decode(ProtoReader protoReader) throws IOException {
            C18272a aVar = new C18272a();
            aVar.f45525b = false;
            aVar.f45526c = false;
            aVar.f45527d = SyncDataStrategy.LOCAL;
            aVar.f45528e = DownloadFileScene.CHAT;
            aVar.f45529f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 20) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45524a.add(Set.ADAPTER.decode(protoReader));
                            continue;
                        case 2:
                            aVar.f45525b = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f45526c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 4:
                            try {
                                aVar.f45527d = SyncDataStrategy.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f45528e = DownloadFileScene.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f45529f = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f45530g.add(ImageSetPassThrough.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetResourcesRequest mGetResourcesRequest) throws IOException {
            Set.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetResourcesRequest.sets);
            if (mGetResourcesRequest.from_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mGetResourcesRequest.from_local);
            }
            if (mGetResourcesRequest.is_reaction != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mGetResourcesRequest.is_reaction);
            }
            if (mGetResourcesRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 4, mGetResourcesRequest.sync_data_strategy);
            }
            if (mGetResourcesRequest.scene != null) {
                DownloadFileScene.ADAPTER.encodeWithTag(protoWriter, 5, mGetResourcesRequest.scene);
            }
            if (mGetResourcesRequest.is_emojis != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, mGetResourcesRequest.is_emojis);
            }
            ImageSetPassThrough.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, mGetResourcesRequest.image_set_pass_through);
            protoWriter.writeBytes(mGetResourcesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.MGetResourcesRequest$a */
    public static final class C18272a extends Message.Builder<MGetResourcesRequest, C18272a> {

        /* renamed from: a */
        public List<Set> f45524a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f45525b;

        /* renamed from: c */
        public Boolean f45526c;

        /* renamed from: d */
        public SyncDataStrategy f45527d;

        /* renamed from: e */
        public DownloadFileScene f45528e;

        /* renamed from: f */
        public Boolean f45529f;

        /* renamed from: g */
        public List<ImageSetPassThrough> f45530g = Internal.newMutableList();

        /* renamed from: a */
        public MGetResourcesRequest build() {
            return new MGetResourcesRequest(this.f45524a, this.f45525b, this.f45526c, this.f45527d, this.f45528e, this.f45529f, this.f45530g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18272a mo63296a(DownloadFileScene downloadFileScene) {
            this.f45528e = downloadFileScene;
            return this;
        }

        /* renamed from: b */
        public C18272a mo63300b(Boolean bool) {
            this.f45529f = bool;
            return this;
        }

        /* renamed from: a */
        public C18272a mo63297a(Boolean bool) {
            this.f45526c = bool;
            return this;
        }

        /* renamed from: b */
        public C18272a mo63301b(List<ImageSetPassThrough> list) {
            Internal.checkElementsNotNull(list);
            this.f45530g = list;
            return this;
        }

        /* renamed from: a */
        public C18272a mo63298a(List<Set> list) {
            Internal.checkElementsNotNull(list);
            this.f45524a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18272a newBuilder() {
        C18272a aVar = new C18272a();
        aVar.f45524a = Internal.copyOf("sets", this.sets);
        aVar.f45525b = this.from_local;
        aVar.f45526c = this.is_reaction;
        aVar.f45527d = this.sync_data_strategy;
        aVar.f45528e = this.scene;
        aVar.f45529f = this.is_emojis;
        aVar.f45530g = Internal.copyOf("image_set_pass_through", this.image_set_pass_through);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "MGetResourcesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.sets.isEmpty()) {
            sb.append(", sets=");
            sb.append(this.sets);
        }
        if (this.from_local != null) {
            sb.append(", from_local=");
            sb.append(this.from_local);
        }
        if (this.is_reaction != null) {
            sb.append(", is_reaction=");
            sb.append(this.is_reaction);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.is_emojis != null) {
            sb.append(", is_emojis=");
            sb.append(this.is_emojis);
        }
        if (!this.image_set_pass_through.isEmpty()) {
            sb.append(", image_set_pass_through=");
            sb.append(this.image_set_pass_through);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetResourcesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetResourcesRequest(List<Set> list, Boolean bool, Boolean bool2, SyncDataStrategy syncDataStrategy, DownloadFileScene downloadFileScene, Boolean bool3, List<ImageSetPassThrough> list2) {
        this(list, bool, bool2, syncDataStrategy, downloadFileScene, bool3, list2, ByteString.EMPTY);
    }

    public MGetResourcesRequest(List<Set> list, Boolean bool, Boolean bool2, SyncDataStrategy syncDataStrategy, DownloadFileScene downloadFileScene, Boolean bool3, List<ImageSetPassThrough> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sets = Internal.immutableCopyOf("sets", list);
        this.from_local = bool;
        this.is_reaction = bool2;
        this.sync_data_strategy = syncDataStrategy;
        this.scene = downloadFileScene;
        this.is_emojis = bool3;
        this.image_set_pass_through = Internal.immutableCopyOf("image_set_pass_through", list2);
    }
}
