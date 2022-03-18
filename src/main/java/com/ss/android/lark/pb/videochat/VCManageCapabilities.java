package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VCManageCapabilities extends Message<VCManageCapabilities, C50417a> {
    public static final ProtoAdapter<VCManageCapabilities> ADAPTER = new C50418b();
    public static final Boolean DEFAULT_FORCE_GET_SHARE_PERMISSION = false;
    public static final Boolean DEFAULT_FORCE_MUTE_MICROPHONE = false;
    public static final Boolean DEFAULT_ONLY_PRESENTER_CAN_ANNOTATE = false;
    public static final Boolean DEFAULT_SHARE_PERMISSION = false;
    public static final Boolean DEFAULT_VC_LOBBY = false;
    private static final long serialVersionUID = 0;
    public final Boolean mforce_get_share_permission;
    public final Boolean mforce_mute_microphone;
    public final Boolean monly_presenter_can_annotate;
    public final Boolean mshare_permission;
    public final Boolean mvc_lobby;

    /* renamed from: com.ss.android.lark.pb.videochat.VCManageCapabilities$b */
    private static final class C50418b extends ProtoAdapter<VCManageCapabilities> {
        C50418b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageCapabilities.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageCapabilities vCManageCapabilities) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (vCManageCapabilities.mvc_lobby != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, vCManageCapabilities.mvc_lobby);
            } else {
                i = 0;
            }
            if (vCManageCapabilities.mforce_mute_microphone != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, vCManageCapabilities.mforce_mute_microphone);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (vCManageCapabilities.mshare_permission != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, vCManageCapabilities.mshare_permission);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (vCManageCapabilities.mforce_get_share_permission != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, vCManageCapabilities.mforce_get_share_permission);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (vCManageCapabilities.monly_presenter_can_annotate != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, vCManageCapabilities.monly_presenter_can_annotate);
            }
            return i8 + i5 + vCManageCapabilities.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageCapabilities decode(ProtoReader protoReader) throws IOException {
            C50417a aVar = new C50417a();
            aVar.f125892a = false;
            aVar.f125893b = false;
            aVar.f125894c = false;
            aVar.f125895d = false;
            aVar.f125896e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125892a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125893b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125894c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125895d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125896e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageCapabilities vCManageCapabilities) throws IOException {
            if (vCManageCapabilities.mvc_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, vCManageCapabilities.mvc_lobby);
            }
            if (vCManageCapabilities.mforce_mute_microphone != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, vCManageCapabilities.mforce_mute_microphone);
            }
            if (vCManageCapabilities.mshare_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, vCManageCapabilities.mshare_permission);
            }
            if (vCManageCapabilities.mforce_get_share_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, vCManageCapabilities.mforce_get_share_permission);
            }
            if (vCManageCapabilities.monly_presenter_can_annotate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, vCManageCapabilities.monly_presenter_can_annotate);
            }
            protoWriter.writeBytes(vCManageCapabilities.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VCManageCapabilities$a */
    public static final class C50417a extends Message.Builder<VCManageCapabilities, C50417a> {

        /* renamed from: a */
        public Boolean f125892a;

        /* renamed from: b */
        public Boolean f125893b;

        /* renamed from: c */
        public Boolean f125894c;

        /* renamed from: d */
        public Boolean f125895d;

        /* renamed from: e */
        public Boolean f125896e;

        /* renamed from: a */
        public VCManageCapabilities build() {
            return new VCManageCapabilities(this.f125892a, this.f125893b, this.f125894c, this.f125895d, this.f125896e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50417a newBuilder() {
        C50417a aVar = new C50417a();
        aVar.f125892a = this.mvc_lobby;
        aVar.f125893b = this.mforce_mute_microphone;
        aVar.f125894c = this.mshare_permission;
        aVar.f125895d = this.mforce_get_share_permission;
        aVar.f125896e = this.monly_presenter_can_annotate;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mvc_lobby != null) {
            sb.append(", vc_lobby=");
            sb.append(this.mvc_lobby);
        }
        if (this.mforce_mute_microphone != null) {
            sb.append(", force_mute_microphone=");
            sb.append(this.mforce_mute_microphone);
        }
        if (this.mshare_permission != null) {
            sb.append(", share_permission=");
            sb.append(this.mshare_permission);
        }
        if (this.mforce_get_share_permission != null) {
            sb.append(", force_get_share_permission=");
            sb.append(this.mforce_get_share_permission);
        }
        if (this.monly_presenter_can_annotate != null) {
            sb.append(", only_presenter_can_annotate=");
            sb.append(this.monly_presenter_can_annotate);
        }
        StringBuilder replace = sb.replace(0, 2, "VCManageCapabilities{");
        replace.append('}');
        return replace.toString();
    }

    public VCManageCapabilities(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(bool, bool2, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public VCManageCapabilities(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mvc_lobby = bool;
        this.mforce_mute_microphone = bool2;
        this.mshare_permission = bool3;
        this.mforce_get_share_permission = bool4;
        this.monly_presenter_can_annotate = bool5;
    }
}
