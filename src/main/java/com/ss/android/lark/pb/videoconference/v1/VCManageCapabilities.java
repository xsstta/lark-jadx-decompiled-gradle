package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VCManageCapabilities extends Message<VCManageCapabilities, C51152a> {
    public static final ProtoAdapter<VCManageCapabilities> ADAPTER = new C51153b();
    public static final Boolean DEFAULT_FORCE_GET_SHARE_PERMISSION = false;
    public static final Boolean DEFAULT_FORCE_MUTE_MICROPHONE = false;
    public static final Boolean DEFAULT_ONLY_PRESENTER_CAN_ANNOTATE = false;
    public static final Boolean DEFAULT_SHARE_PERMISSION = false;
    public static final Boolean DEFAULT_VC_LOBBY = false;
    private static final long serialVersionUID = 0;
    public final Boolean force_get_share_permission;
    public final Boolean force_mute_microphone;
    public final Boolean only_presenter_can_annotate;
    public final Boolean share_permission;
    public final Boolean vc_lobby;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageCapabilities$b */
    private static final class C51153b extends ProtoAdapter<VCManageCapabilities> {
        C51153b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageCapabilities.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageCapabilities vCManageCapabilities) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (vCManageCapabilities.vc_lobby != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, vCManageCapabilities.vc_lobby);
            } else {
                i = 0;
            }
            if (vCManageCapabilities.force_mute_microphone != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, vCManageCapabilities.force_mute_microphone);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (vCManageCapabilities.share_permission != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, vCManageCapabilities.share_permission);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (vCManageCapabilities.force_get_share_permission != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, vCManageCapabilities.force_get_share_permission);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (vCManageCapabilities.only_presenter_can_annotate != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, vCManageCapabilities.only_presenter_can_annotate);
            }
            return i8 + i5 + vCManageCapabilities.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageCapabilities decode(ProtoReader protoReader) throws IOException {
            C51152a aVar = new C51152a();
            aVar.f127295a = false;
            aVar.f127296b = false;
            aVar.f127297c = false;
            aVar.f127298d = false;
            aVar.f127299e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127295a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127296b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127297c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f127298d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127299e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageCapabilities vCManageCapabilities) throws IOException {
            if (vCManageCapabilities.vc_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, vCManageCapabilities.vc_lobby);
            }
            if (vCManageCapabilities.force_mute_microphone != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, vCManageCapabilities.force_mute_microphone);
            }
            if (vCManageCapabilities.share_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, vCManageCapabilities.share_permission);
            }
            if (vCManageCapabilities.force_get_share_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, vCManageCapabilities.force_get_share_permission);
            }
            if (vCManageCapabilities.only_presenter_can_annotate != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, vCManageCapabilities.only_presenter_can_annotate);
            }
            protoWriter.writeBytes(vCManageCapabilities.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageCapabilities$a */
    public static final class C51152a extends Message.Builder<VCManageCapabilities, C51152a> {

        /* renamed from: a */
        public Boolean f127295a;

        /* renamed from: b */
        public Boolean f127296b;

        /* renamed from: c */
        public Boolean f127297c;

        /* renamed from: d */
        public Boolean f127298d;

        /* renamed from: e */
        public Boolean f127299e;

        /* renamed from: a */
        public VCManageCapabilities build() {
            return new VCManageCapabilities(this.f127295a, this.f127296b, this.f127297c, this.f127298d, this.f127299e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51152a newBuilder() {
        C51152a aVar = new C51152a();
        aVar.f127295a = this.vc_lobby;
        aVar.f127296b = this.force_mute_microphone;
        aVar.f127297c = this.share_permission;
        aVar.f127298d = this.force_get_share_permission;
        aVar.f127299e = this.only_presenter_can_annotate;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCManageCapabilities");
        StringBuilder sb = new StringBuilder();
        if (this.vc_lobby != null) {
            sb.append(", vc_lobby=");
            sb.append(this.vc_lobby);
        }
        if (this.force_mute_microphone != null) {
            sb.append(", force_mute_microphone=");
            sb.append(this.force_mute_microphone);
        }
        if (this.share_permission != null) {
            sb.append(", share_permission=");
            sb.append(this.share_permission);
        }
        if (this.force_get_share_permission != null) {
            sb.append(", force_get_share_permission=");
            sb.append(this.force_get_share_permission);
        }
        if (this.only_presenter_can_annotate != null) {
            sb.append(", only_presenter_can_annotate=");
            sb.append(this.only_presenter_can_annotate);
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
        this.vc_lobby = bool;
        this.force_mute_microphone = bool2;
        this.share_permission = bool3;
        this.force_get_share_permission = bool4;
        this.only_presenter_can_annotate = bool5;
    }
}
