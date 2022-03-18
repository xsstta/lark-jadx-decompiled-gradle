package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatFetchLivePolicyResponse extends Message<VideoChatFetchLivePolicyResponse, C51238a> {
    public static final ProtoAdapter<VideoChatFetchLivePolicyResponse> ADAPTER = new C51239b();
    private static final long serialVersionUID = 0;
    public final MegaI18n CertificationCheckbox;
    public final MegaI18n CertificationPopup;
    public final MegaI18n PolicyOverseaForCallPC;
    public final MegaI18n PolicyOverseaForFollowAndParticipantRequestMobile;
    public final MegaI18n PolicyOverseaForFollowAndParticipantRequestPC;
    public final MegaI18n PolicyOverseaForFollowAndStartVoting;
    public final MegaI18n PolicyOverseaForJoinLiveMeeting;
    public final MegaI18n PolicyOverseaForMeetingPC;
    public final MegaI18n PolicyOverseaForParticipantRequestMobile;
    public final MegaI18n PolicyOverseaForParticipantRequestPC;
    public final MegaI18n PolicyOverseaForStartVoting;
    public final MegaI18n PolicyOverseaForVotingPopup;
    public final MegaI18n PolicyOverseaWithSettingForCall;
    public final MegaI18n PolicyOverseaWithSettingForMeeting;
    public final MegaI18n PolicyOverseaWithoutSettingForCall;
    public final MegaI18n PolicyOverseaWithoutSettingForMeeting;
    public final MegaI18n PolicyWithSetting;
    public final MegaI18n PolicyWithoutSetting;
    public final MegaI18n ThirdPlatformStreamGuide;
    public final MegaI18n ThirdPlatformStreamLegalTips;
    public final MegaI18n data;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFetchLivePolicyResponse$b */
    private static final class C51239b extends ProtoAdapter<VideoChatFetchLivePolicyResponse> {
        C51239b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatFetchLivePolicyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatFetchLivePolicyResponse videoChatFetchLivePolicyResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int encodedSizeWithTag = MegaI18n.ADAPTER.encodedSizeWithTag(1, videoChatFetchLivePolicyResponse.data);
            int i20 = 0;
            if (videoChatFetchLivePolicyResponse.PolicyWithSetting != null) {
                i = MegaI18n.ADAPTER.encodedSizeWithTag(2, videoChatFetchLivePolicyResponse.PolicyWithSetting);
            } else {
                i = 0;
            }
            int i21 = encodedSizeWithTag + i;
            if (videoChatFetchLivePolicyResponse.PolicyWithoutSetting != null) {
                i2 = MegaI18n.ADAPTER.encodedSizeWithTag(3, videoChatFetchLivePolicyResponse.PolicyWithoutSetting);
            } else {
                i2 = 0;
            }
            int i22 = i21 + i2;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForCall != null) {
                i3 = MegaI18n.ADAPTER.encodedSizeWithTag(4, videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForCall);
            } else {
                i3 = 0;
            }
            int i23 = i22 + i3;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForCall != null) {
                i4 = MegaI18n.ADAPTER.encodedSizeWithTag(5, videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForCall);
            } else {
                i4 = 0;
            }
            int i24 = i23 + i4;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForMeeting != null) {
                i5 = MegaI18n.ADAPTER.encodedSizeWithTag(6, videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForMeeting);
            } else {
                i5 = 0;
            }
            int i25 = i24 + i5;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForMeeting != null) {
                i6 = MegaI18n.ADAPTER.encodedSizeWithTag(7, videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForMeeting);
            } else {
                i6 = 0;
            }
            int i26 = i25 + i6;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForCallPC != null) {
                i7 = MegaI18n.ADAPTER.encodedSizeWithTag(8, videoChatFetchLivePolicyResponse.PolicyOverseaForCallPC);
            } else {
                i7 = 0;
            }
            int i27 = i26 + i7;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForMeetingPC != null) {
                i8 = MegaI18n.ADAPTER.encodedSizeWithTag(9, videoChatFetchLivePolicyResponse.PolicyOverseaForMeetingPC);
            } else {
                i8 = 0;
            }
            int i28 = i27 + i8;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForStartVoting != null) {
                i9 = MegaI18n.ADAPTER.encodedSizeWithTag(10, videoChatFetchLivePolicyResponse.PolicyOverseaForStartVoting);
            } else {
                i9 = 0;
            }
            int i29 = i28 + i9;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndStartVoting != null) {
                i10 = MegaI18n.ADAPTER.encodedSizeWithTag(11, videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndStartVoting);
            } else {
                i10 = 0;
            }
            int i30 = i29 + i10;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForVotingPopup != null) {
                i11 = MegaI18n.ADAPTER.encodedSizeWithTag(12, videoChatFetchLivePolicyResponse.PolicyOverseaForVotingPopup);
            } else {
                i11 = 0;
            }
            int i31 = i30 + i11;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestPC != null) {
                i12 = MegaI18n.ADAPTER.encodedSizeWithTag(13, videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestPC);
            } else {
                i12 = 0;
            }
            int i32 = i31 + i12;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestMobile != null) {
                i13 = MegaI18n.ADAPTER.encodedSizeWithTag(14, videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestMobile);
            } else {
                i13 = 0;
            }
            int i33 = i32 + i13;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestPC != null) {
                i14 = MegaI18n.ADAPTER.encodedSizeWithTag(15, videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestPC);
            } else {
                i14 = 0;
            }
            int i34 = i33 + i14;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestMobile != null) {
                i15 = MegaI18n.ADAPTER.encodedSizeWithTag(16, videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestMobile);
            } else {
                i15 = 0;
            }
            int i35 = i34 + i15;
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForJoinLiveMeeting != null) {
                i16 = MegaI18n.ADAPTER.encodedSizeWithTag(17, videoChatFetchLivePolicyResponse.PolicyOverseaForJoinLiveMeeting);
            } else {
                i16 = 0;
            }
            int i36 = i35 + i16;
            if (videoChatFetchLivePolicyResponse.ThirdPlatformStreamGuide != null) {
                i17 = MegaI18n.ADAPTER.encodedSizeWithTag(18, videoChatFetchLivePolicyResponse.ThirdPlatformStreamGuide);
            } else {
                i17 = 0;
            }
            int i37 = i36 + i17;
            if (videoChatFetchLivePolicyResponse.ThirdPlatformStreamLegalTips != null) {
                i18 = MegaI18n.ADAPTER.encodedSizeWithTag(19, videoChatFetchLivePolicyResponse.ThirdPlatformStreamLegalTips);
            } else {
                i18 = 0;
            }
            int i38 = i37 + i18;
            if (videoChatFetchLivePolicyResponse.CertificationPopup != null) {
                i19 = MegaI18n.ADAPTER.encodedSizeWithTag(20, videoChatFetchLivePolicyResponse.CertificationPopup);
            } else {
                i19 = 0;
            }
            int i39 = i38 + i19;
            if (videoChatFetchLivePolicyResponse.CertificationCheckbox != null) {
                i20 = MegaI18n.ADAPTER.encodedSizeWithTag(21, videoChatFetchLivePolicyResponse.CertificationCheckbox);
            }
            return i39 + i20 + videoChatFetchLivePolicyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatFetchLivePolicyResponse decode(ProtoReader protoReader) throws IOException {
            C51238a aVar = new C51238a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127538a = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127539b = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127540c = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127541d = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127542e = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127543f = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127544g = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127545h = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f127546i = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127547j = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f127548k = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127549l = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f127550m = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            aVar.f127551n = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            aVar.f127552o = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f127553p = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 17:
                            aVar.f127554q = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                            aVar.f127555r = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            aVar.f127556s = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 20:
                            aVar.f127557t = MegaI18n.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            aVar.f127558u = MegaI18n.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VideoChatFetchLivePolicyResponse videoChatFetchLivePolicyResponse) throws IOException {
            MegaI18n.ADAPTER.encodeWithTag(protoWriter, 1, videoChatFetchLivePolicyResponse.data);
            if (videoChatFetchLivePolicyResponse.PolicyWithSetting != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 2, videoChatFetchLivePolicyResponse.PolicyWithSetting);
            }
            if (videoChatFetchLivePolicyResponse.PolicyWithoutSetting != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 3, videoChatFetchLivePolicyResponse.PolicyWithoutSetting);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForCall != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 4, videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForCall);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForCall != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 5, videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForCall);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForMeeting != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 6, videoChatFetchLivePolicyResponse.PolicyOverseaWithSettingForMeeting);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForMeeting != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 7, videoChatFetchLivePolicyResponse.PolicyOverseaWithoutSettingForMeeting);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForCallPC != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 8, videoChatFetchLivePolicyResponse.PolicyOverseaForCallPC);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForMeetingPC != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 9, videoChatFetchLivePolicyResponse.PolicyOverseaForMeetingPC);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForStartVoting != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 10, videoChatFetchLivePolicyResponse.PolicyOverseaForStartVoting);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndStartVoting != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 11, videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndStartVoting);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForVotingPopup != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 12, videoChatFetchLivePolicyResponse.PolicyOverseaForVotingPopup);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestPC != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 13, videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestPC);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestMobile != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 14, videoChatFetchLivePolicyResponse.PolicyOverseaForParticipantRequestMobile);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestPC != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 15, videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestPC);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestMobile != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 16, videoChatFetchLivePolicyResponse.PolicyOverseaForFollowAndParticipantRequestMobile);
            }
            if (videoChatFetchLivePolicyResponse.PolicyOverseaForJoinLiveMeeting != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 17, videoChatFetchLivePolicyResponse.PolicyOverseaForJoinLiveMeeting);
            }
            if (videoChatFetchLivePolicyResponse.ThirdPlatformStreamGuide != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 18, videoChatFetchLivePolicyResponse.ThirdPlatformStreamGuide);
            }
            if (videoChatFetchLivePolicyResponse.ThirdPlatformStreamLegalTips != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 19, videoChatFetchLivePolicyResponse.ThirdPlatformStreamLegalTips);
            }
            if (videoChatFetchLivePolicyResponse.CertificationPopup != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 20, videoChatFetchLivePolicyResponse.CertificationPopup);
            }
            if (videoChatFetchLivePolicyResponse.CertificationCheckbox != null) {
                MegaI18n.ADAPTER.encodeWithTag(protoWriter, 21, videoChatFetchLivePolicyResponse.CertificationCheckbox);
            }
            protoWriter.writeBytes(videoChatFetchLivePolicyResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFetchLivePolicyResponse$a */
    public static final class C51238a extends Message.Builder<VideoChatFetchLivePolicyResponse, C51238a> {

        /* renamed from: a */
        public MegaI18n f127538a;

        /* renamed from: b */
        public MegaI18n f127539b;

        /* renamed from: c */
        public MegaI18n f127540c;

        /* renamed from: d */
        public MegaI18n f127541d;

        /* renamed from: e */
        public MegaI18n f127542e;

        /* renamed from: f */
        public MegaI18n f127543f;

        /* renamed from: g */
        public MegaI18n f127544g;

        /* renamed from: h */
        public MegaI18n f127545h;

        /* renamed from: i */
        public MegaI18n f127546i;

        /* renamed from: j */
        public MegaI18n f127547j;

        /* renamed from: k */
        public MegaI18n f127548k;

        /* renamed from: l */
        public MegaI18n f127549l;

        /* renamed from: m */
        public MegaI18n f127550m;

        /* renamed from: n */
        public MegaI18n f127551n;

        /* renamed from: o */
        public MegaI18n f127552o;

        /* renamed from: p */
        public MegaI18n f127553p;

        /* renamed from: q */
        public MegaI18n f127554q;

        /* renamed from: r */
        public MegaI18n f127555r;

        /* renamed from: s */
        public MegaI18n f127556s;

        /* renamed from: t */
        public MegaI18n f127557t;

        /* renamed from: u */
        public MegaI18n f127558u;

        /* renamed from: a */
        public VideoChatFetchLivePolicyResponse build() {
            MegaI18n megaI18n = this.f127538a;
            if (megaI18n != null) {
                return new VideoChatFetchLivePolicyResponse(megaI18n, this.f127539b, this.f127540c, this.f127541d, this.f127542e, this.f127543f, this.f127544g, this.f127545h, this.f127546i, this.f127547j, this.f127548k, this.f127549l, this.f127550m, this.f127551n, this.f127552o, this.f127553p, this.f127554q, this.f127555r, this.f127556s, this.f127557t, this.f127558u, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(megaI18n, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
    }

    @Override // com.squareup.wire.Message
    public C51238a newBuilder() {
        C51238a aVar = new C51238a();
        aVar.f127538a = this.data;
        aVar.f127539b = this.PolicyWithSetting;
        aVar.f127540c = this.PolicyWithoutSetting;
        aVar.f127541d = this.PolicyOverseaWithSettingForCall;
        aVar.f127542e = this.PolicyOverseaWithoutSettingForCall;
        aVar.f127543f = this.PolicyOverseaWithSettingForMeeting;
        aVar.f127544g = this.PolicyOverseaWithoutSettingForMeeting;
        aVar.f127545h = this.PolicyOverseaForCallPC;
        aVar.f127546i = this.PolicyOverseaForMeetingPC;
        aVar.f127547j = this.PolicyOverseaForStartVoting;
        aVar.f127548k = this.PolicyOverseaForFollowAndStartVoting;
        aVar.f127549l = this.PolicyOverseaForVotingPopup;
        aVar.f127550m = this.PolicyOverseaForParticipantRequestPC;
        aVar.f127551n = this.PolicyOverseaForParticipantRequestMobile;
        aVar.f127552o = this.PolicyOverseaForFollowAndParticipantRequestPC;
        aVar.f127553p = this.PolicyOverseaForFollowAndParticipantRequestMobile;
        aVar.f127554q = this.PolicyOverseaForJoinLiveMeeting;
        aVar.f127555r = this.ThirdPlatformStreamGuide;
        aVar.f127556s = this.ThirdPlatformStreamLegalTips;
        aVar.f127557t = this.CertificationPopup;
        aVar.f127558u = this.CertificationCheckbox;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatFetchLivePolicyResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", data=");
        sb.append(this.data);
        if (this.PolicyWithSetting != null) {
            sb.append(", PolicyWithSetting=");
            sb.append(this.PolicyWithSetting);
        }
        if (this.PolicyWithoutSetting != null) {
            sb.append(", PolicyWithoutSetting=");
            sb.append(this.PolicyWithoutSetting);
        }
        if (this.PolicyOverseaWithSettingForCall != null) {
            sb.append(", PolicyOverseaWithSettingForCall=");
            sb.append(this.PolicyOverseaWithSettingForCall);
        }
        if (this.PolicyOverseaWithoutSettingForCall != null) {
            sb.append(", PolicyOverseaWithoutSettingForCall=");
            sb.append(this.PolicyOverseaWithoutSettingForCall);
        }
        if (this.PolicyOverseaWithSettingForMeeting != null) {
            sb.append(", PolicyOverseaWithSettingForMeeting=");
            sb.append(this.PolicyOverseaWithSettingForMeeting);
        }
        if (this.PolicyOverseaWithoutSettingForMeeting != null) {
            sb.append(", PolicyOverseaWithoutSettingForMeeting=");
            sb.append(this.PolicyOverseaWithoutSettingForMeeting);
        }
        if (this.PolicyOverseaForCallPC != null) {
            sb.append(", PolicyOverseaForCallPC=");
            sb.append(this.PolicyOverseaForCallPC);
        }
        if (this.PolicyOverseaForMeetingPC != null) {
            sb.append(", PolicyOverseaForMeetingPC=");
            sb.append(this.PolicyOverseaForMeetingPC);
        }
        if (this.PolicyOverseaForStartVoting != null) {
            sb.append(", PolicyOverseaForStartVoting=");
            sb.append(this.PolicyOverseaForStartVoting);
        }
        if (this.PolicyOverseaForFollowAndStartVoting != null) {
            sb.append(", PolicyOverseaForFollowAndStartVoting=");
            sb.append(this.PolicyOverseaForFollowAndStartVoting);
        }
        if (this.PolicyOverseaForVotingPopup != null) {
            sb.append(", PolicyOverseaForVotingPopup=");
            sb.append(this.PolicyOverseaForVotingPopup);
        }
        if (this.PolicyOverseaForParticipantRequestPC != null) {
            sb.append(", PolicyOverseaForParticipantRequestPC=");
            sb.append(this.PolicyOverseaForParticipantRequestPC);
        }
        if (this.PolicyOverseaForParticipantRequestMobile != null) {
            sb.append(", PolicyOverseaForParticipantRequestMobile=");
            sb.append(this.PolicyOverseaForParticipantRequestMobile);
        }
        if (this.PolicyOverseaForFollowAndParticipantRequestPC != null) {
            sb.append(", PolicyOverseaForFollowAndParticipantRequestPC=");
            sb.append(this.PolicyOverseaForFollowAndParticipantRequestPC);
        }
        if (this.PolicyOverseaForFollowAndParticipantRequestMobile != null) {
            sb.append(", PolicyOverseaForFollowAndParticipantRequestMobile=");
            sb.append(this.PolicyOverseaForFollowAndParticipantRequestMobile);
        }
        if (this.PolicyOverseaForJoinLiveMeeting != null) {
            sb.append(", PolicyOverseaForJoinLiveMeeting=");
            sb.append(this.PolicyOverseaForJoinLiveMeeting);
        }
        if (this.ThirdPlatformStreamGuide != null) {
            sb.append(", ThirdPlatformStreamGuide=");
            sb.append(this.ThirdPlatformStreamGuide);
        }
        if (this.ThirdPlatformStreamLegalTips != null) {
            sb.append(", ThirdPlatformStreamLegalTips=");
            sb.append(this.ThirdPlatformStreamLegalTips);
        }
        if (this.CertificationPopup != null) {
            sb.append(", CertificationPopup=");
            sb.append(this.CertificationPopup);
        }
        if (this.CertificationCheckbox != null) {
            sb.append(", CertificationCheckbox=");
            sb.append(this.CertificationCheckbox);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatFetchLivePolicyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatFetchLivePolicyResponse(MegaI18n megaI18n, MegaI18n megaI18n2, MegaI18n megaI18n3, MegaI18n megaI18n4, MegaI18n megaI18n5, MegaI18n megaI18n6, MegaI18n megaI18n7, MegaI18n megaI18n8, MegaI18n megaI18n9, MegaI18n megaI18n10, MegaI18n megaI18n11, MegaI18n megaI18n12, MegaI18n megaI18n13, MegaI18n megaI18n14, MegaI18n megaI18n15, MegaI18n megaI18n16, MegaI18n megaI18n17, MegaI18n megaI18n18, MegaI18n megaI18n19, MegaI18n megaI18n20, MegaI18n megaI18n21) {
        this(megaI18n, megaI18n2, megaI18n3, megaI18n4, megaI18n5, megaI18n6, megaI18n7, megaI18n8, megaI18n9, megaI18n10, megaI18n11, megaI18n12, megaI18n13, megaI18n14, megaI18n15, megaI18n16, megaI18n17, megaI18n18, megaI18n19, megaI18n20, megaI18n21, ByteString.EMPTY);
    }

    public VideoChatFetchLivePolicyResponse(MegaI18n megaI18n, MegaI18n megaI18n2, MegaI18n megaI18n3, MegaI18n megaI18n4, MegaI18n megaI18n5, MegaI18n megaI18n6, MegaI18n megaI18n7, MegaI18n megaI18n8, MegaI18n megaI18n9, MegaI18n megaI18n10, MegaI18n megaI18n11, MegaI18n megaI18n12, MegaI18n megaI18n13, MegaI18n megaI18n14, MegaI18n megaI18n15, MegaI18n megaI18n16, MegaI18n megaI18n17, MegaI18n megaI18n18, MegaI18n megaI18n19, MegaI18n megaI18n20, MegaI18n megaI18n21, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = megaI18n;
        this.PolicyWithSetting = megaI18n2;
        this.PolicyWithoutSetting = megaI18n3;
        this.PolicyOverseaWithSettingForCall = megaI18n4;
        this.PolicyOverseaWithoutSettingForCall = megaI18n5;
        this.PolicyOverseaWithSettingForMeeting = megaI18n6;
        this.PolicyOverseaWithoutSettingForMeeting = megaI18n7;
        this.PolicyOverseaForCallPC = megaI18n8;
        this.PolicyOverseaForMeetingPC = megaI18n9;
        this.PolicyOverseaForStartVoting = megaI18n10;
        this.PolicyOverseaForFollowAndStartVoting = megaI18n11;
        this.PolicyOverseaForVotingPopup = megaI18n12;
        this.PolicyOverseaForParticipantRequestPC = megaI18n13;
        this.PolicyOverseaForParticipantRequestMobile = megaI18n14;
        this.PolicyOverseaForFollowAndParticipantRequestPC = megaI18n15;
        this.PolicyOverseaForFollowAndParticipantRequestMobile = megaI18n16;
        this.PolicyOverseaForJoinLiveMeeting = megaI18n17;
        this.ThirdPlatformStreamGuide = megaI18n18;
        this.ThirdPlatformStreamLegalTips = megaI18n19;
        this.CertificationPopup = megaI18n20;
        this.CertificationCheckbox = megaI18n21;
    }
}
