package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class FeatureConfig extends Message<FeatureConfig, C50551a> {
    public static final ProtoAdapter<FeatureConfig> ADAPTER = new C50552b();
    public static final LayoutType DEFAULT_DEFAULT_LAYOUT = LayoutType.UNKNOWN;
    public static final Boolean DEFAULT_HOST_CONTROL_ENABLE = false;
    public static final Boolean DEFAULT_INTERPRETATION_ENABLE = false;
    public static final Boolean DEFAULT_LIVE_ENABLE = false;
    public static final Boolean DEFAULT_RECORD_ENABLE = false;
    private static final long serialVersionUID = 0;
    public final LayoutType default_layout;
    public final Boolean host_control_enable;
    public final Boolean interpretation_enable;
    public final Boolean live_enable;
    public final MagicShare magic_share;
    public final Pstn pstn;
    public final Boolean record_enable;
    public final RelationChain relation_chain;
    public final ShareMeeting share_meeting;
    public final Sip sip;

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

    public static final class MagicShare extends Message<MagicShare, C50541a> {
        public static final ProtoAdapter<MagicShare> ADAPTER = new C50542b();
        public static final Boolean DEFAULT_NEW_CCM_ENABLE = false;
        public static final Boolean DEFAULT_START_CCM_ENABLE = false;
        public static final Boolean DEFAULT_START_GOOGLE_DRIVE_ENABLE = false;
        public static final Boolean DEFAULT_START_UNIVERSAL_ENABLE = false;
        public static final Boolean DEFAULT_UPLOAD_FILE_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean new_ccm_enable;
        public final Boolean start_ccm_enable;
        public final Boolean start_google_drive_enable;
        public final Boolean start_universal_enable;
        public final Boolean upload_file_enable;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$MagicShare$b */
        private static final class C50542b extends ProtoAdapter<MagicShare> {
            C50542b() {
                super(FieldEncoding.LENGTH_DELIMITED, MagicShare.class);
            }

            /* renamed from: a */
            public int encodedSize(MagicShare magicShare) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (magicShare.start_ccm_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(10, magicShare.start_ccm_enable);
                } else {
                    i = 0;
                }
                if (magicShare.start_universal_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(11, magicShare.start_universal_enable);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (magicShare.upload_file_enable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(12, magicShare.upload_file_enable);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (magicShare.start_google_drive_enable != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(13, magicShare.start_google_drive_enable);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (magicShare.new_ccm_enable != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(14, magicShare.new_ccm_enable);
                }
                return i8 + i5 + magicShare.unknownFields().size();
            }

            /* renamed from: a */
            public MagicShare decode(ProtoReader protoReader) throws IOException {
                C50541a aVar = new C50541a();
                aVar.f126171a = false;
                aVar.f126172b = false;
                aVar.f126173c = false;
                aVar.f126174d = false;
                aVar.f126175e = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 10:
                                aVar.f126171a = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f126172b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                aVar.f126173c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 13:
                                aVar.f126174d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 14:
                                aVar.f126175e = ProtoAdapter.BOOL.decode(protoReader);
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
                if (magicShare.start_ccm_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, magicShare.start_ccm_enable);
                }
                if (magicShare.start_universal_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, magicShare.start_universal_enable);
                }
                if (magicShare.upload_file_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, magicShare.upload_file_enable);
                }
                if (magicShare.start_google_drive_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, magicShare.start_google_drive_enable);
                }
                if (magicShare.new_ccm_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, magicShare.new_ccm_enable);
                }
                protoWriter.writeBytes(magicShare.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$MagicShare$a */
        public static final class C50541a extends Message.Builder<MagicShare, C50541a> {

            /* renamed from: a */
            public Boolean f126171a;

            /* renamed from: b */
            public Boolean f126172b;

            /* renamed from: c */
            public Boolean f126173c;

            /* renamed from: d */
            public Boolean f126174d;

            /* renamed from: e */
            public Boolean f126175e;

            /* renamed from: a */
            public MagicShare build() {
                return new MagicShare(this.f126171a, this.f126172b, this.f126173c, this.f126174d, this.f126175e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50541a newBuilder() {
            C50541a aVar = new C50541a();
            aVar.f126171a = this.start_ccm_enable;
            aVar.f126172b = this.start_universal_enable;
            aVar.f126173c = this.upload_file_enable;
            aVar.f126174d = this.start_google_drive_enable;
            aVar.f126175e = this.new_ccm_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MagicShare");
            StringBuilder sb = new StringBuilder();
            if (this.start_ccm_enable != null) {
                sb.append(", start_ccm_enable=");
                sb.append(this.start_ccm_enable);
            }
            if (this.start_universal_enable != null) {
                sb.append(", start_universal_enable=");
                sb.append(this.start_universal_enable);
            }
            if (this.upload_file_enable != null) {
                sb.append(", upload_file_enable=");
                sb.append(this.upload_file_enable);
            }
            if (this.start_google_drive_enable != null) {
                sb.append(", start_google_drive_enable=");
                sb.append(this.start_google_drive_enable);
            }
            if (this.new_ccm_enable != null) {
                sb.append(", new_ccm_enable=");
                sb.append(this.new_ccm_enable);
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
            this.start_ccm_enable = bool;
            this.start_universal_enable = bool2;
            this.upload_file_enable = bool3;
            this.start_google_drive_enable = bool4;
            this.new_ccm_enable = bool5;
        }
    }

    public static final class Pstn extends Message<Pstn, C50543a> {
        public static final ProtoAdapter<Pstn> ADAPTER = new C50544b();
        public static final Boolean DEFAULT_INCOMING_CALL_ENABLE = false;
        public static final Boolean DEFAULT_OUT_GOING_CALL_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean incoming_call_enable;
        public final Boolean out_going_call_enable;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$Pstn$b */
        private static final class C50544b extends ProtoAdapter<Pstn> {
            C50544b() {
                super(FieldEncoding.LENGTH_DELIMITED, Pstn.class);
            }

            /* renamed from: a */
            public int encodedSize(Pstn pstn) {
                int i;
                int i2 = 0;
                if (pstn.out_going_call_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pstn.out_going_call_enable);
                } else {
                    i = 0;
                }
                if (pstn.incoming_call_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pstn.incoming_call_enable);
                }
                return i + i2 + pstn.unknownFields().size();
            }

            /* renamed from: a */
            public Pstn decode(ProtoReader protoReader) throws IOException {
                C50543a aVar = new C50543a();
                aVar.f126176a = false;
                aVar.f126177b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126176a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126177b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Pstn pstn) throws IOException {
                if (pstn.out_going_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pstn.out_going_call_enable);
                }
                if (pstn.incoming_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pstn.incoming_call_enable);
                }
                protoWriter.writeBytes(pstn.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$Pstn$a */
        public static final class C50543a extends Message.Builder<Pstn, C50543a> {

            /* renamed from: a */
            public Boolean f126176a;

            /* renamed from: b */
            public Boolean f126177b;

            /* renamed from: a */
            public Pstn build() {
                return new Pstn(this.f126176a, this.f126177b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50543a newBuilder() {
            C50543a aVar = new C50543a();
            aVar.f126176a = this.out_going_call_enable;
            aVar.f126177b = this.incoming_call_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Pstn");
            StringBuilder sb = new StringBuilder();
            if (this.out_going_call_enable != null) {
                sb.append(", out_going_call_enable=");
                sb.append(this.out_going_call_enable);
            }
            if (this.incoming_call_enable != null) {
                sb.append(", incoming_call_enable=");
                sb.append(this.incoming_call_enable);
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
            this.out_going_call_enable = bool;
            this.incoming_call_enable = bool2;
        }
    }

    public static final class RelationChain extends Message<RelationChain, C50545a> {
        public static final ProtoAdapter<RelationChain> ADAPTER = new C50546b();
        public static final Boolean DEFAULT_BROWSE_USER_PROFILE_ENABLE = false;
        public static final Boolean DEFAULT_ENTER_GROUP_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean browse_user_profile_enable;
        public final Boolean enter_group_enable;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$RelationChain$b */
        private static final class C50546b extends ProtoAdapter<RelationChain> {
            C50546b() {
                super(FieldEncoding.LENGTH_DELIMITED, RelationChain.class);
            }

            /* renamed from: a */
            public int encodedSize(RelationChain relationChain) {
                int i;
                int i2 = 0;
                if (relationChain.browse_user_profile_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(8, relationChain.browse_user_profile_enable);
                } else {
                    i = 0;
                }
                if (relationChain.enter_group_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(9, relationChain.enter_group_enable);
                }
                return i + i2 + relationChain.unknownFields().size();
            }

            /* renamed from: a */
            public RelationChain decode(ProtoReader protoReader) throws IOException {
                C50545a aVar = new C50545a();
                aVar.f126178a = false;
                aVar.f126179b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 8) {
                        aVar.f126178a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 9) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126179b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RelationChain relationChain) throws IOException {
                if (relationChain.browse_user_profile_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, relationChain.browse_user_profile_enable);
                }
                if (relationChain.enter_group_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, relationChain.enter_group_enable);
                }
                protoWriter.writeBytes(relationChain.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$RelationChain$a */
        public static final class C50545a extends Message.Builder<RelationChain, C50545a> {

            /* renamed from: a */
            public Boolean f126178a;

            /* renamed from: b */
            public Boolean f126179b;

            /* renamed from: a */
            public RelationChain build() {
                return new RelationChain(this.f126178a, this.f126179b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50545a newBuilder() {
            C50545a aVar = new C50545a();
            aVar.f126178a = this.browse_user_profile_enable;
            aVar.f126179b = this.enter_group_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "RelationChain");
            StringBuilder sb = new StringBuilder();
            if (this.browse_user_profile_enable != null) {
                sb.append(", browse_user_profile_enable=");
                sb.append(this.browse_user_profile_enable);
            }
            if (this.enter_group_enable != null) {
                sb.append(", enter_group_enable=");
                sb.append(this.enter_group_enable);
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
            this.browse_user_profile_enable = bool;
            this.enter_group_enable = bool2;
        }
    }

    public static final class ShareMeeting extends Message<ShareMeeting, C50547a> {
        public static final ProtoAdapter<ShareMeeting> ADAPTER = new C50548b();
        public static final Boolean DEFAULT_COPY_MEETING_LINK_ENABLE = false;
        public static final Boolean DEFAULT_INVITE_ENABLE = false;
        public static final Boolean DEFAULT_SHARE_CARD_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean copy_meeting_link_enable;
        public final Boolean invite_enable;
        public final Boolean share_card_enable;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$ShareMeeting$b */
        private static final class C50548b extends ProtoAdapter<ShareMeeting> {
            C50548b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareMeeting.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareMeeting shareMeeting) {
                int i;
                int i2;
                int i3 = 0;
                if (shareMeeting.invite_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, shareMeeting.invite_enable);
                } else {
                    i = 0;
                }
                if (shareMeeting.copy_meeting_link_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, shareMeeting.copy_meeting_link_enable);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (shareMeeting.share_card_enable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, shareMeeting.share_card_enable);
                }
                return i4 + i3 + shareMeeting.unknownFields().size();
            }

            /* renamed from: a */
            public ShareMeeting decode(ProtoReader protoReader) throws IOException {
                C50547a aVar = new C50547a();
                aVar.f126180a = false;
                aVar.f126181b = false;
                aVar.f126182c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126180a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126181b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126182c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareMeeting shareMeeting) throws IOException {
                if (shareMeeting.invite_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, shareMeeting.invite_enable);
                }
                if (shareMeeting.copy_meeting_link_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, shareMeeting.copy_meeting_link_enable);
                }
                if (shareMeeting.share_card_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, shareMeeting.share_card_enable);
                }
                protoWriter.writeBytes(shareMeeting.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$ShareMeeting$a */
        public static final class C50547a extends Message.Builder<ShareMeeting, C50547a> {

            /* renamed from: a */
            public Boolean f126180a;

            /* renamed from: b */
            public Boolean f126181b;

            /* renamed from: c */
            public Boolean f126182c;

            /* renamed from: a */
            public ShareMeeting build() {
                return new ShareMeeting(this.f126180a, this.f126181b, this.f126182c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50547a newBuilder() {
            C50547a aVar = new C50547a();
            aVar.f126180a = this.invite_enable;
            aVar.f126181b = this.copy_meeting_link_enable;
            aVar.f126182c = this.share_card_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ShareMeeting");
            StringBuilder sb = new StringBuilder();
            if (this.invite_enable != null) {
                sb.append(", invite_enable=");
                sb.append(this.invite_enable);
            }
            if (this.copy_meeting_link_enable != null) {
                sb.append(", copy_meeting_link_enable=");
                sb.append(this.copy_meeting_link_enable);
            }
            if (this.share_card_enable != null) {
                sb.append(", share_card_enable=");
                sb.append(this.share_card_enable);
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
            this.invite_enable = bool;
            this.copy_meeting_link_enable = bool2;
            this.share_card_enable = bool3;
        }
    }

    public static final class Sip extends Message<Sip, C50549a> {
        public static final ProtoAdapter<Sip> ADAPTER = new C50550b();
        public static final Boolean DEFAULT_INCOMING_CALL_ENABLE = false;
        public static final Boolean DEFAULT_OUT_GOING_CALL_ENABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean incoming_call_enable;
        public final Boolean out_going_call_enable;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$Sip$b */
        private static final class C50550b extends ProtoAdapter<Sip> {
            C50550b() {
                super(FieldEncoding.LENGTH_DELIMITED, Sip.class);
            }

            /* renamed from: a */
            public int encodedSize(Sip sip) {
                int i;
                int i2 = 0;
                if (sip.out_going_call_enable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, sip.out_going_call_enable);
                } else {
                    i = 0;
                }
                if (sip.incoming_call_enable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, sip.incoming_call_enable);
                }
                return i + i2 + sip.unknownFields().size();
            }

            /* renamed from: a */
            public Sip decode(ProtoReader protoReader) throws IOException {
                C50549a aVar = new C50549a();
                aVar.f126183a = false;
                aVar.f126184b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126183a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126184b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Sip sip) throws IOException {
                if (sip.out_going_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, sip.out_going_call_enable);
                }
                if (sip.incoming_call_enable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, sip.incoming_call_enable);
                }
                protoWriter.writeBytes(sip.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$Sip$a */
        public static final class C50549a extends Message.Builder<Sip, C50549a> {

            /* renamed from: a */
            public Boolean f126183a;

            /* renamed from: b */
            public Boolean f126184b;

            /* renamed from: a */
            public Sip build() {
                return new Sip(this.f126183a, this.f126184b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50549a newBuilder() {
            C50549a aVar = new C50549a();
            aVar.f126183a = this.out_going_call_enable;
            aVar.f126184b = this.incoming_call_enable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Sip");
            StringBuilder sb = new StringBuilder();
            if (this.out_going_call_enable != null) {
                sb.append(", out_going_call_enable=");
                sb.append(this.out_going_call_enable);
            }
            if (this.incoming_call_enable != null) {
                sb.append(", incoming_call_enable=");
                sb.append(this.incoming_call_enable);
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
            this.out_going_call_enable = bool;
            this.incoming_call_enable = bool2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$b */
    private static final class C50552b extends ProtoAdapter<FeatureConfig> {
        C50552b() {
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
            if (featureConfig.live_enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, featureConfig.live_enable);
            } else {
                i = 0;
            }
            if (featureConfig.default_layout != null) {
                i2 = LayoutType.ADAPTER.encodedSizeWithTag(2, featureConfig.default_layout);
            } else {
                i2 = 0;
            }
            int i11 = i + i2;
            if (featureConfig.record_enable != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, featureConfig.record_enable);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (featureConfig.host_control_enable != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, featureConfig.host_control_enable);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (featureConfig.pstn != null) {
                i5 = Pstn.ADAPTER.encodedSizeWithTag(5, featureConfig.pstn);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (featureConfig.share_meeting != null) {
                i6 = ShareMeeting.ADAPTER.encodedSizeWithTag(6, featureConfig.share_meeting);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (featureConfig.sip != null) {
                i7 = Sip.ADAPTER.encodedSizeWithTag(7, featureConfig.sip);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (featureConfig.magic_share != null) {
                i8 = MagicShare.ADAPTER.encodedSizeWithTag(8, featureConfig.magic_share);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (featureConfig.relation_chain != null) {
                i9 = RelationChain.ADAPTER.encodedSizeWithTag(9, featureConfig.relation_chain);
            } else {
                i9 = 0;
            }
            int i18 = i17 + i9;
            if (featureConfig.interpretation_enable != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, featureConfig.interpretation_enable);
            }
            return i18 + i10 + featureConfig.unknownFields().size();
        }

        /* renamed from: a */
        public FeatureConfig decode(ProtoReader protoReader) throws IOException {
            C50551a aVar = new C50551a();
            aVar.f126185a = false;
            aVar.f126186b = LayoutType.UNKNOWN;
            aVar.f126187c = false;
            aVar.f126188d = false;
            aVar.f126194j = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126185a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f126186b = LayoutType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f126187c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126188d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126189e = Pstn.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126190f = ShareMeeting.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126191g = Sip.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126192h = MagicShare.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126193i = RelationChain.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126194j = ProtoAdapter.BOOL.decode(protoReader);
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
            if (featureConfig.live_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, featureConfig.live_enable);
            }
            if (featureConfig.default_layout != null) {
                LayoutType.ADAPTER.encodeWithTag(protoWriter, 2, featureConfig.default_layout);
            }
            if (featureConfig.record_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, featureConfig.record_enable);
            }
            if (featureConfig.host_control_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, featureConfig.host_control_enable);
            }
            if (featureConfig.pstn != null) {
                Pstn.ADAPTER.encodeWithTag(protoWriter, 5, featureConfig.pstn);
            }
            if (featureConfig.share_meeting != null) {
                ShareMeeting.ADAPTER.encodeWithTag(protoWriter, 6, featureConfig.share_meeting);
            }
            if (featureConfig.sip != null) {
                Sip.ADAPTER.encodeWithTag(protoWriter, 7, featureConfig.sip);
            }
            if (featureConfig.magic_share != null) {
                MagicShare.ADAPTER.encodeWithTag(protoWriter, 8, featureConfig.magic_share);
            }
            if (featureConfig.relation_chain != null) {
                RelationChain.ADAPTER.encodeWithTag(protoWriter, 9, featureConfig.relation_chain);
            }
            if (featureConfig.interpretation_enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, featureConfig.interpretation_enable);
            }
            protoWriter.writeBytes(featureConfig.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FeatureConfig$a */
    public static final class C50551a extends Message.Builder<FeatureConfig, C50551a> {

        /* renamed from: a */
        public Boolean f126185a;

        /* renamed from: b */
        public LayoutType f126186b;

        /* renamed from: c */
        public Boolean f126187c;

        /* renamed from: d */
        public Boolean f126188d;

        /* renamed from: e */
        public Pstn f126189e;

        /* renamed from: f */
        public ShareMeeting f126190f;

        /* renamed from: g */
        public Sip f126191g;

        /* renamed from: h */
        public MagicShare f126192h;

        /* renamed from: i */
        public RelationChain f126193i;

        /* renamed from: j */
        public Boolean f126194j;

        /* renamed from: a */
        public FeatureConfig build() {
            return new FeatureConfig(this.f126185a, this.f126186b, this.f126187c, this.f126188d, this.f126189e, this.f126190f, this.f126191g, this.f126192h, this.f126193i, this.f126194j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50551a newBuilder() {
        C50551a aVar = new C50551a();
        aVar.f126185a = this.live_enable;
        aVar.f126186b = this.default_layout;
        aVar.f126187c = this.record_enable;
        aVar.f126188d = this.host_control_enable;
        aVar.f126189e = this.pstn;
        aVar.f126190f = this.share_meeting;
        aVar.f126191g = this.sip;
        aVar.f126192h = this.magic_share;
        aVar.f126193i = this.relation_chain;
        aVar.f126194j = this.interpretation_enable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FeatureConfig");
        StringBuilder sb = new StringBuilder();
        if (this.live_enable != null) {
            sb.append(", live_enable=");
            sb.append(this.live_enable);
        }
        if (this.default_layout != null) {
            sb.append(", default_layout=");
            sb.append(this.default_layout);
        }
        if (this.record_enable != null) {
            sb.append(", record_enable=");
            sb.append(this.record_enable);
        }
        if (this.host_control_enable != null) {
            sb.append(", host_control_enable=");
            sb.append(this.host_control_enable);
        }
        if (this.pstn != null) {
            sb.append(", pstn=");
            sb.append(this.pstn);
        }
        if (this.share_meeting != null) {
            sb.append(", share_meeting=");
            sb.append(this.share_meeting);
        }
        if (this.sip != null) {
            sb.append(", sip=");
            sb.append(this.sip);
        }
        if (this.magic_share != null) {
            sb.append(", magic_share=");
            sb.append(this.magic_share);
        }
        if (this.relation_chain != null) {
            sb.append(", relation_chain=");
            sb.append(this.relation_chain);
        }
        if (this.interpretation_enable != null) {
            sb.append(", interpretation_enable=");
            sb.append(this.interpretation_enable);
        }
        StringBuilder replace = sb.replace(0, 2, "FeatureConfig{");
        replace.append('}');
        return replace.toString();
    }

    public FeatureConfig(Boolean bool, LayoutType layoutType, Boolean bool2, Boolean bool3, Pstn pstn2, ShareMeeting shareMeeting, Sip sip2, MagicShare magicShare, RelationChain relationChain, Boolean bool4) {
        this(bool, layoutType, bool2, bool3, pstn2, shareMeeting, sip2, magicShare, relationChain, bool4, ByteString.EMPTY);
    }

    public FeatureConfig(Boolean bool, LayoutType layoutType, Boolean bool2, Boolean bool3, Pstn pstn2, ShareMeeting shareMeeting, Sip sip2, MagicShare magicShare, RelationChain relationChain, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.live_enable = bool;
        this.default_layout = layoutType;
        this.record_enable = bool2;
        this.host_control_enable = bool3;
        this.pstn = pstn2;
        this.share_meeting = shareMeeting;
        this.sip = sip2;
        this.magic_share = magicShare;
        this.relation_chain = relationChain;
        this.interpretation_enable = bool4;
    }
}
