package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class DownloadFileRequest extends Message<DownloadFileRequest, C18208a> {
    public static final ProtoAdapter<DownloadFileRequest> ADAPTER = new C18209b();
    public static final Action DEFAULT_ACTION = Action.DOWNLOAD;
    public static final Boolean DEFAULT_IS_CACHE = false;
    public static final Boolean DEFAULT_IS_FOLDER = false;
    public static final DownloadFileScene DEFAULT_SCENE = DownloadFileScene.CHAT;
    public static final Message.SourceType DEFAULT_SOURCE_TYPE = Message.SourceType.TYPE_FROM_UNKONWN;
    public static final File.EntityType DEFAULT_TYPE = File.EntityType.MESSAGE;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final String channel_id;
    public final Boolean is_cache;
    public final Boolean is_folder;
    public final String key;
    public final String message_id;
    public final String path;
    public final DownloadFileScene scene;
    public final String source_id;
    public final Message.SourceType source_type;
    public final File.EntityType type;

    public enum Action implements WireEnum {
        DOWNLOAD(1),
        CANCEL(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 1) {
                return DOWNLOAD;
            }
            if (i != 2) {
                return null;
            }
            return CANCEL;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadFileRequest$b */
    private static final class C18209b extends ProtoAdapter<DownloadFileRequest> {
        C18209b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadFileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadFileRequest downloadFileRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadFileRequest.message_id) + Action.ADAPTER.encodedSizeWithTag(2, downloadFileRequest.action);
            int i8 = 0;
            if (downloadFileRequest.path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, downloadFileRequest.path);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (downloadFileRequest.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, downloadFileRequest.key);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i9 + i2 + File.EntityType.ADAPTER.encodedSizeWithTag(5, downloadFileRequest.type);
            if (downloadFileRequest.source_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, downloadFileRequest.source_id);
            } else {
                i3 = 0;
            }
            int i10 = encodedSizeWithTag2 + i3;
            if (downloadFileRequest.source_type != null) {
                i4 = Message.SourceType.ADAPTER.encodedSizeWithTag(7, downloadFileRequest.source_type);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (downloadFileRequest.is_cache != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(8, downloadFileRequest.is_cache);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (downloadFileRequest.channel_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, downloadFileRequest.channel_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (downloadFileRequest.scene != null) {
                i7 = DownloadFileScene.ADAPTER.encodedSizeWithTag(10, downloadFileRequest.scene);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (downloadFileRequest.is_folder != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(11, downloadFileRequest.is_folder);
            }
            return i14 + i8 + downloadFileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadFileRequest decode(ProtoReader protoReader) throws IOException {
            C18208a aVar = new C18208a();
            aVar.f45429a = "";
            aVar.f45430b = Action.DOWNLOAD;
            aVar.f45431c = "";
            aVar.f45432d = "";
            aVar.f45433e = File.EntityType.MESSAGE;
            aVar.f45434f = "";
            aVar.f45435g = Message.SourceType.TYPE_FROM_UNKONWN;
            aVar.f45436h = false;
            aVar.f45437i = "";
            aVar.f45438j = DownloadFileScene.CHAT;
            aVar.f45439k = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45429a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f45430b = Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f45431c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45432d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f45433e = File.EntityType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f45434f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f45435g = Message.SourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 8:
                            aVar.f45436h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f45437i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f45438j = DownloadFileScene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 11:
                            aVar.f45439k = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, DownloadFileRequest downloadFileRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadFileRequest.message_id);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, downloadFileRequest.action);
            if (downloadFileRequest.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, downloadFileRequest.path);
            }
            if (downloadFileRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, downloadFileRequest.key);
            }
            File.EntityType.ADAPTER.encodeWithTag(protoWriter, 5, downloadFileRequest.type);
            if (downloadFileRequest.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, downloadFileRequest.source_id);
            }
            if (downloadFileRequest.source_type != null) {
                Message.SourceType.ADAPTER.encodeWithTag(protoWriter, 7, downloadFileRequest.source_type);
            }
            if (downloadFileRequest.is_cache != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, downloadFileRequest.is_cache);
            }
            if (downloadFileRequest.channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, downloadFileRequest.channel_id);
            }
            if (downloadFileRequest.scene != null) {
                DownloadFileScene.ADAPTER.encodeWithTag(protoWriter, 10, downloadFileRequest.scene);
            }
            if (downloadFileRequest.is_folder != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, downloadFileRequest.is_folder);
            }
            protoWriter.writeBytes(downloadFileRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18208a newBuilder() {
        C18208a aVar = new C18208a();
        aVar.f45429a = this.message_id;
        aVar.f45430b = this.action;
        aVar.f45431c = this.path;
        aVar.f45432d = this.key;
        aVar.f45433e = this.type;
        aVar.f45434f = this.source_id;
        aVar.f45435g = this.source_type;
        aVar.f45436h = this.is_cache;
        aVar.f45437i = this.channel_id;
        aVar.f45438j = this.scene;
        aVar.f45439k = this.is_folder;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadFileRequest$a */
    public static final class C18208a extends Message.Builder<DownloadFileRequest, C18208a> {

        /* renamed from: a */
        public String f45429a;

        /* renamed from: b */
        public Action f45430b;

        /* renamed from: c */
        public String f45431c;

        /* renamed from: d */
        public String f45432d;

        /* renamed from: e */
        public File.EntityType f45433e;

        /* renamed from: f */
        public String f45434f;

        /* renamed from: g */
        public Message.SourceType f45435g;

        /* renamed from: h */
        public Boolean f45436h;

        /* renamed from: i */
        public String f45437i;

        /* renamed from: j */
        public DownloadFileScene f45438j;

        /* renamed from: k */
        public Boolean f45439k;

        /* renamed from: a */
        public DownloadFileRequest build() {
            Action action;
            File.EntityType entityType;
            String str = this.f45429a;
            if (str != null && (action = this.f45430b) != null && (entityType = this.f45433e) != null) {
                return new DownloadFileRequest(str, action, this.f45431c, this.f45432d, entityType, this.f45434f, this.f45435g, this.f45436h, this.f45437i, this.f45438j, this.f45439k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id", this.f45430b, "action", this.f45433e, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C18208a mo63116a(File.EntityType entityType) {
            this.f45433e = entityType;
            return this;
        }

        /* renamed from: b */
        public C18208a mo63123b(String str) {
            this.f45431c = str;
            return this;
        }

        /* renamed from: c */
        public C18208a mo63124c(String str) {
            this.f45432d = str;
            return this;
        }

        /* renamed from: d */
        public C18208a mo63125d(String str) {
            this.f45434f = str;
            return this;
        }

        /* renamed from: e */
        public C18208a mo63126e(String str) {
            this.f45437i = str;
            return this;
        }

        /* renamed from: a */
        public C18208a mo63117a(Message.SourceType sourceType) {
            this.f45435g = sourceType;
            return this;
        }

        /* renamed from: a */
        public C18208a mo63118a(Action action) {
            this.f45430b = action;
            return this;
        }

        /* renamed from: a */
        public C18208a mo63119a(DownloadFileScene downloadFileScene) {
            this.f45438j = downloadFileScene;
            return this;
        }

        /* renamed from: a */
        public C18208a mo63120a(Boolean bool) {
            this.f45436h = bool;
            return this;
        }

        /* renamed from: a */
        public C18208a mo63121a(String str) {
            this.f45429a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DownloadFileRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", action=");
        sb.append(this.action);
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        sb.append(", type=");
        sb.append(this.type);
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.is_cache != null) {
            sb.append(", is_cache=");
            sb.append(this.is_cache);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.is_folder != null) {
            sb.append(", is_folder=");
            sb.append(this.is_folder);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadFileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadFileRequest(String str, Action action2, String str2, String str3, File.EntityType entityType, String str4, Message.SourceType sourceType, Boolean bool, String str5, DownloadFileScene downloadFileScene, Boolean bool2) {
        this(str, action2, str2, str3, entityType, str4, sourceType, bool, str5, downloadFileScene, bool2, ByteString.EMPTY);
    }

    public DownloadFileRequest(String str, Action action2, String str2, String str3, File.EntityType entityType, String str4, Message.SourceType sourceType, Boolean bool, String str5, DownloadFileScene downloadFileScene, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.action = action2;
        this.path = str2;
        this.key = str3;
        this.type = entityType;
        this.source_id = str4;
        this.source_type = sourceType;
        this.is_cache = bool;
        this.channel_id = str5;
        this.scene = downloadFileScene;
        this.is_folder = bool2;
    }
}
