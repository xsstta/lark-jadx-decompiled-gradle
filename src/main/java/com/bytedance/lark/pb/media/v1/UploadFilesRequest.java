package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.File;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class UploadFilesRequest extends Message<UploadFilesRequest, C18300a> {
    public static final ProtoAdapter<UploadFilesRequest> ADAPTER = new C18301b();
    public static final Action DEFAULT_ACTION = Action.UPLOAD;
    public static final File.EntityType DEFAULT_TYPE = File.EntityType.MESSAGE;
    private static final long serialVersionUID = 0;
    public final Action action;
    public final List<String> cids;
    public final Map<String, String> key2paths;
    public final File.EntityType type;

    public enum Action implements WireEnum {
        UPLOAD(1),
        CANCEL(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 1) {
                return UPLOAD;
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

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadFilesRequest$b */
    private static final class C18301b extends ProtoAdapter<UploadFilesRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f45605a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C18301b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadFilesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadFilesRequest uploadFilesRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, uploadFilesRequest.cids) + this.f45605a.encodedSizeWithTag(2, uploadFilesRequest.key2paths) + Action.ADAPTER.encodedSizeWithTag(3, uploadFilesRequest.action) + File.EntityType.ADAPTER.encodedSizeWithTag(4, uploadFilesRequest.type) + uploadFilesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadFilesRequest decode(ProtoReader protoReader) throws IOException {
            C18300a aVar = new C18300a();
            aVar.f45603c = Action.UPLOAD;
            aVar.f45604d = File.EntityType.MESSAGE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45601a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f45602b.putAll(this.f45605a.decode(protoReader));
                } else if (nextTag == 3) {
                    try {
                        aVar.f45603c = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45604d = File.EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadFilesRequest uploadFilesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, uploadFilesRequest.cids);
            this.f45605a.encodeWithTag(protoWriter, 2, uploadFilesRequest.key2paths);
            Action.ADAPTER.encodeWithTag(protoWriter, 3, uploadFilesRequest.action);
            File.EntityType.ADAPTER.encodeWithTag(protoWriter, 4, uploadFilesRequest.type);
            protoWriter.writeBytes(uploadFilesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadFilesRequest$a */
    public static final class C18300a extends Message.Builder<UploadFilesRequest, C18300a> {

        /* renamed from: a */
        public List<String> f45601a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, String> f45602b = Internal.newMutableMap();

        /* renamed from: c */
        public Action f45603c;

        /* renamed from: d */
        public File.EntityType f45604d;

        /* renamed from: a */
        public UploadFilesRequest build() {
            File.EntityType entityType;
            Action action = this.f45603c;
            if (action != null && (entityType = this.f45604d) != null) {
                return new UploadFilesRequest(this.f45601a, this.f45602b, action, entityType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(action, "action", this.f45604d, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C18300a mo63368a(File.EntityType entityType) {
            this.f45604d = entityType;
            return this;
        }

        /* renamed from: a */
        public C18300a mo63369a(Action action) {
            this.f45603c = action;
            return this;
        }

        /* renamed from: a */
        public C18300a mo63370a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45601a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18300a newBuilder() {
        C18300a aVar = new C18300a();
        aVar.f45601a = Internal.copyOf("cids", this.cids);
        aVar.f45602b = Internal.copyOf("key2paths", this.key2paths);
        aVar.f45603c = this.action;
        aVar.f45604d = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadFilesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.cids.isEmpty()) {
            sb.append(", cids=");
            sb.append(this.cids);
        }
        if (!this.key2paths.isEmpty()) {
            sb.append(", key2paths=");
            sb.append(this.key2paths);
        }
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", type=");
        sb.append(this.type);
        StringBuilder replace = sb.replace(0, 2, "UploadFilesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadFilesRequest(List<String> list, Map<String, String> map, Action action2, File.EntityType entityType) {
        this(list, map, action2, entityType, ByteString.EMPTY);
    }

    public UploadFilesRequest(List<String> list, Map<String, String> map, Action action2, File.EntityType entityType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cids = Internal.immutableCopyOf("cids", list);
        this.key2paths = Internal.immutableCopyOf("key2paths", map);
        this.action = action2;
        this.type = entityType;
    }
}
