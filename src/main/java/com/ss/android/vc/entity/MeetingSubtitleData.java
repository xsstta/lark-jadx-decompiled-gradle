package com.ss.android.vc.entity;

public class MeetingSubtitleData {
    public SubtitleEvent mEvent;
    public boolean mIsSeqFinal;
    public String mMeetingId;
    public long mSeqId;
    public long mSliceId;
    public SoundType mSoundType = SoundType.NORMAL;
    public SubtitleType mSubtitleType;
    public C60925a mTarget;
    public long mTimeStamp;
    public boolean mTrackReceived;

    public static class SubtitleEvent {

        /* renamed from: a */
        public Type f152464a;

        /* renamed from: b */
        public ByteviewUser f152465b;

        /* renamed from: c */
        public C60924a f152466c;

        public enum Type {
            UNKNOWN(0),
            TURN_SUBTITLE_ON(1),
            START_SHARE_SCREEN(2),
            STOP_SHARE_SCREEN(3),
            START_FOLLOW(4),
            STOP_FOLLOW(5);
            
            private int value;

            public int getNumber() {
                return this.value;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return TURN_SUBTITLE_ON;
                }
                if (i == 2) {
                    return START_SHARE_SCREEN;
                }
                if (i == 3) {
                    return STOP_SHARE_SCREEN;
                }
                if (i == 4) {
                    return START_FOLLOW;
                }
                if (i != 5) {
                    return UNKNOWN;
                }
                return STOP_FOLLOW;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.vc.entity.MeetingSubtitleData$SubtitleEvent$a */
        public static class C60924a {

            /* renamed from: a */
            public String f152467a;

            /* renamed from: b */
            public String f152468b;

            public C60924a(String str, String str2) {
                this.f152467a = str;
                this.f152468b = str2;
            }
        }
    }

    /* renamed from: com.ss.android.vc.entity.MeetingSubtitleData$a */
    public static class C60925a {

        /* renamed from: a */
        public String f152469a;

        /* renamed from: b */
        public String f152470b;

        /* renamed from: c */
        public String f152471c;

        /* renamed from: d */
        public String f152472d;

        /* renamed from: e */
        public ByteviewUser f152473e;
    }

    public enum SoundType {
        NORMAL(1),
        NOISE(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static SoundType forNumber(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return NORMAL;
            }
            return NOISE;
        }

        private SoundType(int i) {
            this.value = i;
        }
    }

    public enum SubtitleType {
        UNKNOWN(0),
        TRANSLATION(1),
        TRANSCRIPTION(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static SubtitleType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TRANSLATION;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return TRANSCRIPTION;
        }

        private SubtitleType(int i) {
            this.value = i;
        }
    }
}
