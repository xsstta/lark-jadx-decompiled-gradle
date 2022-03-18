package com.ss.android.lark.pb.videochat;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class FeatureConfig extends Message<FeatureConfig, C50304a> {
    public static final ProtoAdapter<FeatureConfig> ADAPTER = new C50305b();
    public static final Boolean DEFAULT_HOST_CONTROL_ENABLE = false;
    public static final Boolean DEFAULT_INTERPRETATION_ENABLE = false;
    public static final Boolean DEFAULT_LIVE_ENABLE = false;
    public static final Boolean DEFAULT_RECORD_ENABLE = false;
    private static final long serialVersionUID = 0;
    public final LayoutType mdefault_layout;
    public final Boolean mhost_control_enable;
    public final Boolean minterpretation_enable;
    public final Boolean mlive_enable;
    public final MagicShare mmagic_share;
    public final Pstn mpstn;
    public final Boolean mrecord_enable;
    public final RelationChain mrelation_chain;
    public final ShareMeeting mshare_meeting;
    public final Sip msip;

    public enum LayoutType implements WireEnum {
        UNKNOWN(0),
        Squared(1),
        Sidebar(2),
        Float(3);
        
        public static final ProtoAdapter<LayoutType> ADAPTER = ProtoAdapter.newEnumAdapter(LayoutType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LayoutType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return Squared;
            }
            if (i == 2) {
                return Sidebar;
            }
            if (i != 3) {
                return null;
            }
            return Float;
        }

        private LayoutType(int i) {
            this.value = i;
        }
    }

    public static final class MagicShare extends Message<MagicShare, C50294a> {
        public static final ProtoAdapter<MagicShare> ADAPTER = new C50295b();
        public static final Boolean DEFAULT_NEW_CCM_ENABLE = false;
        public static final Boolean DEFAULT_START_CCM_ENABLE = false;
        public static final Boolean DEFAULT_START_GOOGLE_DRIVE_ENABLE = false;
        public static final Boolean DEFAULT_START_UNIVERSAL_ENABLE = false;
        public static final Boolean DEFAULT_UPLOAD_FILE_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean mnew_ccm_enable;
        public final Boolean mstart_ccm_enable;
        public final Boolean mstart_google_drive_enable;
        public final Boolean mstart_universal_enable;
        public final Boolean mupload_file_enable;

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$MagicShare$b */
        private static final class C50295b extends ProtoAdapter<MagicShare> {
            C50295b() {
                super(FieldEncoding.LENGTH_DELIMITED, MagicShare.class);
            }

            /* renamed from: a */
            public int encodedSize(MagicShare magicShare) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (magicShare.mstart_ccm_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(10, magicShare.mstart_ccm_enable);
                } else {
                    i = 0;
                }
                if (magicShare.mstart_universal_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(11, magicShare.mstart_universal_enable);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (magicShare.mupload_file_enable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(12, magicShare.mupload_file_enable);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (magicShare.mstart_google_drive_enable != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(13, magicShare.mstart_google_drive_enable);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (magicShare.mnew_ccm_enable != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(14, magicShare.mnew_ccm_enable);
                }
                return i8 + i5 + magicShare.unknownFields().size();
            }

            /* renamed from: a */
            public MagicShare decode(ProtoReader protoReader) throws IOException {
                C50294a aVar = new C50294a();
                aVar.f125656a = false;
                aVar.f125657b = false;
                aVar.f125658c = false;
                aVar.f125659d = false;
                aVar.f125660e = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 10:
                                aVar.f125656a = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f125657b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                aVar.f125658c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 13:
                                aVar.f125659d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 14:
                                aVar.f125660e = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, MagicShare magicShare) throws IOException {
                if (magicShare.mstart_ccm_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, magicShare.mstart_ccm_enable);
                }
                if (magicShare.mstart_universal_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, magicShare.mstart_universal_enable);
                }
                if (magicShare.mupload_file_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, magicShare.mupload_file_enable);
                }
                if (magicShare.mstart_google_drive_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, magicShare.mstart_google_drive_enable);
                }
                if (magicShare.mnew_ccm_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, magicShare.mnew_ccm_enable);
                }
                protoWriter.writeBytes(magicShare.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$MagicShare$a */
        public static final class C50294a extends Message.Builder<MagicShare, C50294a> {

            /* renamed from: a */
            public Boolean f125656a;

            /* renamed from: b */
            public Boolean f125657b;

            /* renamed from: c */
            public Boolean f125658c;

            /* renamed from: d */
            public Boolean f125659d;

            /* renamed from: e */
            public Boolean f125660e;

            /* renamed from: a */
            public MagicShare build() {
                return new MagicShare(this.f125656a, this.f125657b, this.f125658c, this.f125659d, this.f125660e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50294a newBuilder() {
            C50294a aVar = new C50294a();
            aVar.f125656a = this.mstart_ccm_enable;
            aVar.f125657b = this.mstart_universal_enable;
            aVar.f125658c = this.mupload_file_enable;
            aVar.f125659d = this.mstart_google_drive_enable;
            aVar.f125660e = this.mnew_ccm_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mstart_ccm_enable != null) {
                sb.append(", start_ccm_enable=");
                sb.append(this.mstart_ccm_enable);
            }
            if (this.mstart_universal_enable != null) {
                sb.append(", start_universal_enable=");
                sb.append(this.mstart_universal_enable);
            }
            if (this.mupload_file_enable != null) {
                sb.append(", upload_file_enable=");
                sb.append(this.mupload_file_enable);
            }
            if (this.mstart_google_drive_enable != null) {
                sb.append(", start_google_drive_enable=");
                sb.append(this.mstart_google_drive_enable);
            }
            if (this.mnew_ccm_enable != null) {
                sb.append(", new_ccm_enable=");
                sb.append(this.mnew_ccm_enable);
            }
            StringBuilder replace = sb.replace(0, 2, "MagicShare{");
            replace.append('}');
            return replace.toString();
        }

        public MagicShare(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
            this(bool, bool2, bool3, bool4, bool5, ByteString.EMPTY);
        }

        public MagicShare(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mstart_ccm_enable = bool;
            this.mstart_universal_enable = bool2;
            this.mupload_file_enable = bool3;
            this.mstart_google_drive_enable = bool4;
            this.mnew_ccm_enable = bool5;
        }
    }

    public static final class Pstn extends Message<Pstn, C50296a> {
        public static final ProtoAdapter<Pstn> ADAPTER = new C50297b();
        public static final Boolean DEFAULT_INCOMING_CALL_ENABLE = false;
        public static final Boolean DEFAULT_OUT_GOING_CALL_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean mincoming_call_enable;
        public final Boolean mout_going_call_enable;

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$Pstn$b */
        private static final class C50297b extends ProtoAdapter<Pstn> {
            C50297b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pstn.class);
            }

            /* renamed from: a */
            public int encodedSize(Pstn pstn) {
                int i;
                int i2 = 0;
                if (pstn.mout_going_call_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pstn.mout_going_call_enable);
                } else {
                    i = 0;
                }
                if (pstn.mincoming_call_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pstn.mincoming_call_enable);
                }
                return i + i2 + pstn.unknownFields().size();
            }

            /* renamed from: a */
            public Pstn decode(ProtoReader protoReader) throws IOException {
                C50296a aVar = new C50296a();
                aVar.f125661a = false;
                aVar.f125662b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125661a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125662b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pstn pstn) throws IOException {
                if (pstn.mout_going_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pstn.mout_going_call_enable);
                }
                if (pstn.mincoming_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pstn.mincoming_call_enable);
                }
                protoWriter.writeBytes(pstn.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$Pstn$a */
        public static final class C50296a extends Message.Builder<Pstn, C50296a> {

            /* renamed from: a */
            public Boolean f125661a;

            /* renamed from: b */
            public Boolean f125662b;

            /* renamed from: a */
            public Pstn build() {
                return new Pstn(this.f125661a, this.f125662b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50296a newBuilder() {
            C50296a aVar = new C50296a();
            aVar.f125661a = this.mout_going_call_enable;
            aVar.f125662b = this.mincoming_call_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mout_going_call_enable != null) {
                sb.append(", out_going_call_enable=");
                sb.append(this.mout_going_call_enable);
            }
            if (this.mincoming_call_enable != null) {
                sb.append(", incoming_call_enable=");
                sb.append(this.mincoming_call_enable);
            }
            StringBuilder replace = sb.replace(0, 2, "Pstn{");
            replace.append('}');
            return replace.toString();
        }

        public Pstn(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public Pstn(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mout_going_call_enable = bool;
            this.mincoming_call_enable = bool2;
        }
    }

    public static final class RelationChain extends Message<RelationChain, C50298a> {
        public static final ProtoAdapter<RelationChain> ADAPTER = new C50299b();
        public static final Boolean DEFAULT_BROWSE_USER_PROFILE_ENABLE = false;
        public static final Boolean DEFAULT_ENTER_GROUP_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean mbrowse_user_profile_enable;
        public final Boolean menter_group_enable;

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$RelationChain$b */
        private static final class C50299b extends ProtoAdapter<RelationChain> {
            C50299b() {
                super(FieldEncoding.LENGTH_DELIMITED, RelationChain.class);
            }

            /* renamed from: a */
            public int encodedSize(RelationChain relationChain) {
                int i;
                int i2 = 0;
                if (relationChain.mbrowse_user_profile_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(8, relationChain.mbrowse_user_profile_enable);
                } else {
                    i = 0;
                }
                if (relationChain.menter_group_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(9, relationChain.menter_group_enable);
                }
                return i + i2 + relationChain.unknownFields().size();
            }

            /* renamed from: a */
            public RelationChain decode(ProtoReader protoReader) throws IOException {
                C50298a aVar = new C50298a();
                aVar.f125663a = false;
                aVar.f125664b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 8) {
                        aVar.f125663a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 9) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125664b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RelationChain relationChain) throws IOException {
                if (relationChain.mbrowse_user_profile_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, relationChain.mbrowse_user_profile_enable);
                }
                if (relationChain.menter_group_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, relationChain.menter_group_enable);
                }
                protoWriter.writeBytes(relationChain.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$RelationChain$a */
        public static final class C50298a extends Message.Builder<RelationChain, C50298a> {

            /* renamed from: a */
            public Boolean f125663a;

            /* renamed from: b */
            public Boolean f125664b;

            /* renamed from: a */
            public RelationChain build() {
                return new RelationChain(this.f125663a, this.f125664b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50298a newBuilder() {
            C50298a aVar = new C50298a();
            aVar.f125663a = this.mbrowse_user_profile_enable;
            aVar.f125664b = this.menter_group_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mbrowse_user_profile_enable != null) {
                sb.append(", browse_user_profile_enable=");
                sb.append(this.mbrowse_user_profile_enable);
            }
            if (this.menter_group_enable != null) {
                sb.append(", enter_group_enable=");
                sb.append(this.menter_group_enable);
            }
            StringBuilder replace = sb.replace(0, 2, "RelationChain{");
            replace.append('}');
            return replace.toString();
        }

        public RelationChain(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public RelationChain(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mbrowse_user_profile_enable = bool;
            this.menter_group_enable = bool2;
        }
    }

    public static final class ShareMeeting extends Message<ShareMeeting, C50300a> {
        public static final ProtoAdapter<ShareMeeting> ADAPTER = new C50301b();
        public static final Boolean DEFAULT_COPY_MEETING_LINK_ENABLE = false;
        public static final Boolean DEFAULT_INVITE_ENABLE = false;
        public static final Boolean DEFAULT_SHARE_CARD_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean mcopy_meeting_link_enable;
        public final Boolean minvite_enable;
        public final Boolean mshare_card_enable;

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$ShareMeeting$b */
        private static final class C50301b extends ProtoAdapter<ShareMeeting> {
            C50301b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareMeeting.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareMeeting shareMeeting) {
                int i;
                int i2;
                int i3 = 0;
                if (shareMeeting.minvite_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, shareMeeting.minvite_enable);
                } else {
                    i = 0;
                }
                if (shareMeeting.mcopy_meeting_link_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, shareMeeting.mcopy_meeting_link_enable);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (shareMeeting.mshare_card_enable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, shareMeeting.mshare_card_enable);
                }
                return i4 + i3 + shareMeeting.unknownFields().size();
            }

            /* renamed from: a */
            public ShareMeeting decode(ProtoReader protoReader) throws IOException {
                C50300a aVar = new C50300a();
                aVar.f125665a = false;
                aVar.f125666b = false;
                aVar.f125667c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125665a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125666b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125667c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareMeeting shareMeeting) throws IOException {
                if (shareMeeting.minvite_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, shareMeeting.minvite_enable);
                }
                if (shareMeeting.mcopy_meeting_link_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, shareMeeting.mcopy_meeting_link_enable);
                }
                if (shareMeeting.mshare_card_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, shareMeeting.mshare_card_enable);
                }
                protoWriter.writeBytes(shareMeeting.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$ShareMeeting$a */
        public static final class C50300a extends Message.Builder<ShareMeeting, C50300a> {

            /* renamed from: a */
            public Boolean f125665a;

            /* renamed from: b */
            public Boolean f125666b;

            /* renamed from: c */
            public Boolean f125667c;

            /* renamed from: a */
            public ShareMeeting build() {
                return new ShareMeeting(this.f125665a, this.f125666b, this.f125667c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50300a newBuilder() {
            C50300a aVar = new C50300a();
            aVar.f125665a = this.minvite_enable;
            aVar.f125666b = this.mcopy_meeting_link_enable;
            aVar.f125667c = this.mshare_card_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.minvite_enable != null) {
                sb.append(", invite_enable=");
                sb.append(this.minvite_enable);
            }
            if (this.mcopy_meeting_link_enable != null) {
                sb.append(", copy_meeting_link_enable=");
                sb.append(this.mcopy_meeting_link_enable);
            }
            if (this.mshare_card_enable != null) {
                sb.append(", share_card_enable=");
                sb.append(this.mshare_card_enable);
            }
            StringBuilder replace = sb.replace(0, 2, "ShareMeeting{");
            replace.append('}');
            return replace.toString();
        }

        public ShareMeeting(Boolean bool, Boolean bool2, Boolean bool3) {
            this(bool, bool2, bool3, ByteString.EMPTY);
        }

        public ShareMeeting(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.minvite_enable = bool;
            this.mcopy_meeting_link_enable = bool2;
            this.mshare_card_enable = bool3;
        }
    }

    public static final class Sip extends Message<Sip, C50302a> {
        public static final ProtoAdapter<Sip> ADAPTER = new C50303b();
        public static final Boolean DEFAULT_INCOMING_CALL_ENABLE = false;
        public static final Boolean DEFAULT_OUT_GOING_CALL_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean mincoming_call_enable;
        public final Boolean mout_going_call_enable;

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$Sip$b */
        private static final class C50303b extends ProtoAdapter<Sip> {
            C50303b() {
                super(FieldEncoding.LENGTH_DELIMITED, Sip.class);
            }

            /* renamed from: a */
            public int encodedSize(Sip sip) {
                int i;
                int i2 = 0;
                if (sip.mout_going_call_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, sip.mout_going_call_enable);
                } else {
                    i = 0;
                }
                if (sip.mincoming_call_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, sip.mincoming_call_enable);
                }
                return i + i2 + sip.unknownFields().size();
            }

            /* renamed from: a */
            public Sip decode(ProtoReader protoReader) throws IOException {
                C50302a aVar = new C50302a();
                aVar.f125668a = false;
                aVar.f125669b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125668a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125669b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Sip sip) throws IOException {
                if (sip.mout_going_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sip.mout_going_call_enable);
                }
                if (sip.mincoming_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, sip.mincoming_call_enable);
                }
                protoWriter.writeBytes(sip.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$Sip$a */
        public static final class C50302a extends Message.Builder<Sip, C50302a> {

            /* renamed from: a */
            public Boolean f125668a;

            /* renamed from: b */
            public Boolean f125669b;

            /* renamed from: a */
            public Sip build() {
                return new Sip(this.f125668a, this.f125669b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50302a newBuilder() {
            C50302a aVar = new C50302a();
            aVar.f125668a = this.mout_going_call_enable;
            aVar.f125669b = this.mincoming_call_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mout_going_call_enable != null) {
                sb.append(", out_going_call_enable=");
                sb.append(this.mout_going_call_enable);
            }
            if (this.mincoming_call_enable != null) {
                sb.append(", incoming_call_enable=");
                sb.append(this.mincoming_call_enable);
            }
            StringBuilder replace = sb.replace(0, 2, "Sip{");
            replace.append('}');
            return replace.toString();
        }

        public Sip(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public Sip(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mout_going_call_enable = bool;
            this.mincoming_call_enable = bool2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$b */
    private static final class C50305b extends ProtoAdapter<FeatureConfig> {
        C50305b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeatureConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(FeatureConfig featureConfig) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (featureConfig.mlive_enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, featureConfig.mlive_enable);
            } else {
                i = 0;
            }
            if (featureConfig.mdefault_layout != null) {
                i2 = LayoutType.ADAPTER.encodedSizeWithTag(2, featureConfig.mdefault_layout);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (featureConfig.mrecord_enable != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, featureConfig.mrecord_enable);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (featureConfig.mhost_control_enable != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, featureConfig.mhost_control_enable);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (featureConfig.mpstn != null) {
                i5 = Pstn.ADAPTER.encodedSizeWithTag(5, featureConfig.mpstn);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (featureConfig.mshare_meeting != null) {
                i6 = ShareMeeting.ADAPTER.encodedSizeWithTag(6, featureConfig.mshare_meeting);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (featureConfig.msip != null) {
                i7 = Sip.ADAPTER.encodedSizeWithTag(7, featureConfig.msip);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (featureConfig.mmagic_share != null) {
                i8 = MagicShare.ADAPTER.encodedSizeWithTag(8, featureConfig.mmagic_share);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (featureConfig.mrelation_chain != null) {
                i9 = RelationChain.ADAPTER.encodedSizeWithTag(9, featureConfig.mrelation_chain);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (featureConfig.minterpretation_enable != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, featureConfig.minterpretation_enable);
            }
            return i18 + i10 + featureConfig.unknownFields().size();
        }

        /* renamed from: a */
        public FeatureConfig decode(ProtoReader protoReader) throws IOException {
            C50304a aVar = new C50304a();
            aVar.f125670a = false;
            aVar.f125672c = false;
            aVar.f125673d = false;
            aVar.f125679j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125670a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125671b = LayoutType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f125672c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125673d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125674e = Pstn.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125675f = ShareMeeting.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125676g = Sip.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125677h = MagicShare.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125678i = RelationChain.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125679j = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, FeatureConfig featureConfig) throws IOException {
            if (featureConfig.mlive_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, featureConfig.mlive_enable);
            }
            if (featureConfig.mdefault_layout != null) {
                LayoutType.ADAPTER.encodeWithTag(protoWriter, 2, featureConfig.mdefault_layout);
            }
            if (featureConfig.mrecord_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, featureConfig.mrecord_enable);
            }
            if (featureConfig.mhost_control_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, featureConfig.mhost_control_enable);
            }
            if (featureConfig.mpstn != null) {
                Pstn.ADAPTER.encodeWithTag(protoWriter, 5, featureConfig.mpstn);
            }
            if (featureConfig.mshare_meeting != null) {
                ShareMeeting.ADAPTER.encodeWithTag(protoWriter, 6, featureConfig.mshare_meeting);
            }
            if (featureConfig.msip != null) {
                Sip.ADAPTER.encodeWithTag(protoWriter, 7, featureConfig.msip);
            }
            if (featureConfig.mmagic_share != null) {
                MagicShare.ADAPTER.encodeWithTag(protoWriter, 8, featureConfig.mmagic_share);
            }
            if (featureConfig.mrelation_chain != null) {
                RelationChain.ADAPTER.encodeWithTag(protoWriter, 9, featureConfig.mrelation_chain);
            }
            if (featureConfig.minterpretation_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, featureConfig.minterpretation_enable);
            }
            protoWriter.writeBytes(featureConfig.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.FeatureConfig$a */
    public static final class C50304a extends Message.Builder<FeatureConfig, C50304a> {

        /* renamed from: a */
        public Boolean f125670a;

        /* renamed from: b */
        public LayoutType f125671b;

        /* renamed from: c */
        public Boolean f125672c;

        /* renamed from: d */
        public Boolean f125673d;

        /* renamed from: e */
        public Pstn f125674e;

        /* renamed from: f */
        public ShareMeeting f125675f;

        /* renamed from: g */
        public Sip f125676g;

        /* renamed from: h */
        public MagicShare f125677h;

        /* renamed from: i */
        public RelationChain f125678i;

        /* renamed from: j */
        public Boolean f125679j;

        /* renamed from: a */
        public FeatureConfig build() {
            return new FeatureConfig(this.f125670a, this.f125671b, this.f125672c, this.f125673d, this.f125674e, this.f125675f, this.f125676g, this.f125677h, this.f125678i, this.f125679j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50304a newBuilder() {
        C50304a aVar = new C50304a();
        aVar.f125670a = this.mlive_enable;
        aVar.f125671b = this.mdefault_layout;
        aVar.f125672c = this.mrecord_enable;
        aVar.f125673d = this.mhost_control_enable;
        aVar.f125674e = this.mpstn;
        aVar.f125675f = this.mshare_meeting;
        aVar.f125676g = this.msip;
        aVar.f125677h = this.mmagic_share;
        aVar.f125678i = this.mrelation_chain;
        aVar.f125679j = this.minterpretation_enable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mlive_enable != null) {
            sb.append(", live_enable=");
            sb.append(this.mlive_enable);
        }
        if (this.mdefault_layout != null) {
            sb.append(", default_layout=");
            sb.append(this.mdefault_layout);
        }
        if (this.mrecord_enable != null) {
            sb.append(", record_enable=");
            sb.append(this.mrecord_enable);
        }
        if (this.mhost_control_enable != null) {
            sb.append(", host_control_enable=");
            sb.append(this.mhost_control_enable);
        }
        if (this.mpstn != null) {
            sb.append(", pstn=");
            sb.append(this.mpstn);
        }
        if (this.mshare_meeting != null) {
            sb.append(", share_meeting=");
            sb.append(this.mshare_meeting);
        }
        if (this.msip != null) {
            sb.append(", sip=");
            sb.append(this.msip);
        }
        if (this.mmagic_share != null) {
            sb.append(", magic_share=");
            sb.append(this.mmagic_share);
        }
        if (this.mrelation_chain != null) {
            sb.append(", relation_chain=");
            sb.append(this.mrelation_chain);
        }
        if (this.minterpretation_enable != null) {
            sb.append(", interpretation_enable=");
            sb.append(this.minterpretation_enable);
        }
        StringBuilder replace = sb.replace(0, 2, "FeatureConfig{");
        replace.append('}');
        return replace.toString();
    }

    public FeatureConfig(Boolean bool, LayoutType layoutType, Boolean bool2, Boolean bool3, Pstn pstn, ShareMeeting shareMeeting, Sip sip, MagicShare magicShare, RelationChain relationChain, Boolean bool4) {
        this(bool, layoutType, bool2, bool3, pstn, shareMeeting, sip, magicShare, relationChain, bool4, ByteString.EMPTY);
    }

    public FeatureConfig(Boolean bool, LayoutType layoutType, Boolean bool2, Boolean bool3, Pstn pstn, ShareMeeting shareMeeting, Sip sip, MagicShare magicShare, RelationChain relationChain, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlive_enable = bool;
        this.mdefault_layout = layoutType;
        this.mrecord_enable = bool2;
        this.mhost_control_enable = bool3;
        this.mpstn = pstn;
        this.mshare_meeting = shareMeeting;
        this.msip = sip;
        this.mmagic_share = magicShare;
        this.mrelation_chain = relationChain;
        this.minterpretation_enable = bool4;
    }
}
