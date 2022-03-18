package com.ss.android.vc.entity.follow;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VcDocType;
import java.io.Serializable;
import java.util.List;

public class FollowInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private String deviceId;
    private String docTitle;
    private InitSource initSource;
    private Options options;
    private String rawUrl;
    private String shareId;
    private ShareSubType shareSubType;
    private ShareType shareType;
    private List<FollowStrategy> strategies;
    private ThumbnailDetail thumbnailDetail;
    private String token;
    private VcDocType type;
    private String url;
    private String userId;
    private ParticipantType userType = ParticipantType.LARK_USER;
    private int version;

    public enum InitSource {
        UNKNOWN_INIT_SOURCE(0),
        INIT_DIRECTLY(1),
        INIT_FROM_LINK(2),
        INIT_REACTIVATED(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static InitSource valueOf(int i) {
            return forNumber(i);
        }

        public static InitSource forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_INIT_SOURCE;
            }
            if (i == 1) {
                return INIT_DIRECTLY;
            }
            if (i == 2) {
                return INIT_FROM_LINK;
            }
            if (i != 3) {
                return null;
            }
            return INIT_REACTIVATED;
        }

        private InitSource(int i) {
            this.value = i;
        }
    }

    public enum LifeTime {
        UNKNOWN(0),
        EPHEMERAL(1),
        PERMANENT(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static LifeTime fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return EPHEMERAL;
            }
            if (i != 2) {
                return null;
            }
            return PERMANENT;
        }

        private LifeTime(int i) {
            this.value = i;
        }
    }

    public static class Options implements Serializable {
        private static final long serialVersionUID = 1;
        private boolean defaultFollow;
        private boolean forceFollow;

        public boolean isDefaultFollow() {
            return this.defaultFollow;
        }

        public boolean isForceFollow() {
            return this.forceFollow;
        }

        public String toString() {
            return "Options{defaultFollow=" + this.defaultFollow + ", forceFollow=" + this.forceFollow + '}';
        }

        public void setDefaultFollow(boolean z) {
            this.defaultFollow = z;
        }

        public void setForceFollow(boolean z) {
            this.forceFollow = z;
        }
    }

    public enum ShareSubType {
        UNKNOWN_SHARE_SUBTYPE(0),
        CCM_DOC(1),
        CCM_SHEET(2),
        CCM_MINDNOTE(3),
        CCM_WORD(4),
        CCM_EXCEL(5),
        CCM_PPT(6),
        CCM_PDF(7),
        CCM_BITABLE(8),
        CCM_DEMONSTRATION(9),
        CCM_WIKI_DOC(10),
        CCM_WIKI_SHEET(11),
        CCM_WIKI_MINDNOTE(12),
        CCM_DOCX(22),
        GOOGLE_DOC(51),
        GOOGLE_SHEET(52),
        GOOGLE_SLIDE(53),
        GOOGLE_WORD(54),
        GOOGLE_EXCEL(55),
        GOOGLE_PPT(56),
        GOOGLE_PDF(57);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ShareSubType valueOf(int i) {
            return forNumber(i);
        }

        public static ShareSubType forNumber(int i) {
            if (i == 22) {
                return CCM_DOCX;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_SHARE_SUBTYPE;
                case 1:
                    return CCM_DOC;
                case 2:
                    return CCM_SHEET;
                case 3:
                    return CCM_MINDNOTE;
                case 4:
                    return CCM_WORD;
                case 5:
                    return CCM_EXCEL;
                case 6:
                    return CCM_PPT;
                case 7:
                    return CCM_PDF;
                case 8:
                    return CCM_BITABLE;
                case 9:
                    return CCM_DEMONSTRATION;
                case 10:
                    return CCM_WIKI_DOC;
                case 11:
                    return CCM_WIKI_SHEET;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CCM_WIKI_MINDNOTE;
                default:
                    switch (i) {
                        case 51:
                            return GOOGLE_DOC;
                        case 52:
                            return GOOGLE_SHEET;
                        case 53:
                            return GOOGLE_SLIDE;
                        case 54:
                            return GOOGLE_WORD;
                        case 55:
                            return GOOGLE_EXCEL;
                        case 56:
                            return GOOGLE_PPT;
                        case 57:
                            return GOOGLE_PDF;
                        default:
                            return UNKNOWN_SHARE_SUBTYPE;
                    }
            }
        }

        private ShareSubType(int i) {
            this.value = i;
        }
    }

    public enum ShareType {
        UNKNOWN_SHARE_TYPE(0),
        CCM(1),
        GOOGLE(2),
        UNIVERSAL(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ShareType valueOf(int i) {
            return forNumber(i);
        }

        public static ShareType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_SHARE_TYPE;
            }
            if (i == 1) {
                return CCM;
            }
            if (i == 2) {
                return GOOGLE;
            }
            if (i != 3) {
                return UNKNOWN_SHARE_TYPE;
            }
            return UNIVERSAL;
        }

        private ShareType(int i) {
            this.value = i;
        }
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDocTitle() {
        return this.docTitle;
    }

    public InitSource getInitSource() {
        return this.initSource;
    }

    public Options getOptions() {
        return this.options;
    }

    public String getRawUrl() {
        return this.rawUrl;
    }

    public String getShareId() {
        return this.shareId;
    }

    public ShareSubType getShareSubType() {
        return this.shareSubType;
    }

    public ShareType getShareType() {
        return this.shareType;
    }

    public List<FollowStrategy> getStrategies() {
        return this.strategies;
    }

    public ThumbnailDetail getThumbnailDetail() {
        return this.thumbnailDetail;
    }

    public String getToken() {
        return this.token;
    }

    public VcDocType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserId() {
        return this.userId;
    }

    public ParticipantType getUserType() {
        return this.userType;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isLandscapeFollow() {
        if (this.shareSubType == ShareSubType.CCM_SHEET || this.shareSubType == ShareSubType.CCM_BITABLE || this.shareSubType == ShareSubType.CCM_PPT || this.shareSubType == ShareSubType.CCM_EXCEL || this.shareSubType == ShareSubType.GOOGLE_EXCEL || this.shareSubType == ShareSubType.GOOGLE_SHEET || this.shareSubType == ShareSubType.GOOGLE_PPT) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "{shareId = " + this.shareId + ", shareType = " + this.shareType + ", shareSubType = " + this.shareSubType + ", initSource = " + this.initSource + ", userId = " + this.userId + ", deviceId = " + this.deviceId + ", userType = " + this.userType + ", options = " + this.options + ", strategies = " + this.strategies + "}";
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDocTitle(String str) {
        this.docTitle = str;
    }

    public void setInitSource(InitSource initSource2) {
        this.initSource = initSource2;
    }

    public void setOptions(Options options2) {
        this.options = options2;
    }

    public void setRawUrl(String str) {
        this.rawUrl = str;
    }

    public void setShareId(String str) {
        this.shareId = str;
    }

    public void setShareSubType(ShareSubType shareSubType2) {
        this.shareSubType = shareSubType2;
    }

    public void setShareType(ShareType shareType2) {
        this.shareType = shareType2;
    }

    public void setStrategies(List<FollowStrategy> list) {
        this.strategies = list;
    }

    public void setThumbnailDetail(ThumbnailDetail thumbnailDetail2) {
        this.thumbnailDetail = thumbnailDetail2;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(VcDocType vcDocType) {
        this.type = vcDocType;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserType(ParticipantType participantType) {
        this.userType = participantType;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
