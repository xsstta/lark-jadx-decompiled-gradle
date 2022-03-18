package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShareVideoChatResponse extends Message<ShareVideoChatResponse, C51056a> {
    public static final ProtoAdapter<ShareVideoChatResponse> ADAPTER = new C51057b();
    public static final TargetUserPermissions DEFAULT_TARGET_USER_PERMISSIONS = TargetUserPermissions.ALL;
    private static final long serialVersionUID = 0;
    public final List<String> banned_group_ids;
    public final TargetUserPermissions target_user_permissions;

    public enum TargetUserPermissions implements WireEnum {
        ALL(0),
        PARTIAL(1),
        NONE(2);
        
        public static final ProtoAdapter<TargetUserPermissions> ADAPTER = ProtoAdapter.newEnumAdapter(TargetUserPermissions.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TargetUserPermissions fromValue(int i) {
            if (i == 0) {
                return ALL;
            }
            if (i == 1) {
                return PARTIAL;
            }
            if (i != 2) {
                return null;
            }
            return NONE;
        }

        private TargetUserPermissions(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareVideoChatResponse$b */
    private static final class C51057b extends ProtoAdapter<ShareVideoChatResponse> {
        C51057b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareVideoChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareVideoChatResponse shareVideoChatResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, shareVideoChatResponse.banned_group_ids);
            if (shareVideoChatResponse.target_user_permissions != null) {
                i = TargetUserPermissions.ADAPTER.encodedSizeWithTag(2, shareVideoChatResponse.target_user_permissions);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + shareVideoChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareVideoChatResponse decode(ProtoReader protoReader) throws IOException {
            C51056a aVar = new C51056a();
            aVar.f127140b = TargetUserPermissions.ALL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127139a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f127140b = TargetUserPermissions.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareVideoChatResponse shareVideoChatResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, shareVideoChatResponse.banned_group_ids);
            if (shareVideoChatResponse.target_user_permissions != null) {
                TargetUserPermissions.ADAPTER.encodeWithTag(protoWriter, 2, shareVideoChatResponse.target_user_permissions);
            }
            protoWriter.writeBytes(shareVideoChatResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareVideoChatResponse$a */
    public static final class C51056a extends Message.Builder<ShareVideoChatResponse, C51056a> {

        /* renamed from: a */
        public List<String> f127139a = Internal.newMutableList();

        /* renamed from: b */
        public TargetUserPermissions f127140b;

        /* renamed from: a */
        public ShareVideoChatResponse build() {
            return new ShareVideoChatResponse(this.f127139a, this.f127140b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51056a newBuilder() {
        C51056a aVar = new C51056a();
        aVar.f127139a = Internal.copyOf("banned_group_ids", this.banned_group_ids);
        aVar.f127140b = this.target_user_permissions;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareVideoChatResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.banned_group_ids.isEmpty()) {
            sb.append(", banned_group_ids=");
            sb.append(this.banned_group_ids);
        }
        if (this.target_user_permissions != null) {
            sb.append(", target_user_permissions=");
            sb.append(this.target_user_permissions);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareVideoChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareVideoChatResponse(List<String> list, TargetUserPermissions targetUserPermissions) {
        this(list, targetUserPermissions, ByteString.EMPTY);
    }

    public ShareVideoChatResponse(List<String> list, TargetUserPermissions targetUserPermissions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.banned_group_ids = Internal.immutableCopyOf("banned_group_ids", list);
        this.target_user_permissions = targetUserPermissions;
    }
}
