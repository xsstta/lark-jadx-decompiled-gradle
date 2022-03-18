package com.ss.android.vc.meeting.module.subtitle;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.entity.response.an;
import java.io.Serializable;

public class SubtitleModel2 implements AbstractC26248b<SubtitleModel2>, Serializable {
    public String mCurrentSelectItem;
    public boolean mIsHeader;
    public boolean mIsSeqFinal;
    public String mSearchContent;
    public an.C60964a mSearchMatch;
    public long mSeqId;
    public boolean mShowTime = true;
    public MeetingSubtitleData.SoundType mSoundType = MeetingSubtitleData.SoundType.NORMAL;
    public Subtitle mSubtitle;
    public MeetingSubtitleData.SubtitleEvent mSubtitleEvent;
    public long mTimeStamp;

    public static class Subtitle implements Serializable {
        public Bitmap mAvatar;
        public ByteviewUser mSpeaker;
        public String mTarget;
        public String mUid;
    }

    public boolean isSubtitleEvent() {
        if (this.mSubtitleEvent != null) {
            return true;
        }
        return false;
    }

    public SubtitleModel2() {
    }

    public int hashCode() {
        return String.valueOf(this.mSeqId).hashCode();
    }

    public boolean isSubtitleContent() {
        Subtitle subtitle = this.mSubtitle;
        if (subtitle == null || TextUtils.isEmpty(subtitle.mTarget)) {
            return false;
        }
        return true;
    }

    public String toString() {
        Subtitle subtitle = this.mSubtitle;
        if (subtitle != null) {
            return subtitle.mTarget;
        }
        MeetingSubtitleData.SubtitleEvent subtitleEvent = this.mSubtitleEvent;
        if (subtitleEvent != null) {
            return subtitleEvent.f152464a.toString();
        }
        return "";
    }

    public boolean equals(Object obj) {
        if ((obj instanceof SubtitleModel2) && this.mSeqId == ((SubtitleModel2) obj).mSeqId) {
            return true;
        }
        return false;
    }

    public boolean isItemSame(SubtitleModel2 subtitleModel2) {
        if (this == subtitleModel2) {
            return true;
        }
        if (subtitleModel2 != null && this.mSeqId == subtitleModel2.mSeqId) {
            return true;
        }
        return false;
    }

    public SubtitleModel2(SubtitleModel2 subtitleModel2) {
        this.mSeqId = subtitleModel2.mSeqId;
        this.mIsSeqFinal = subtitleModel2.mIsSeqFinal;
        this.mShowTime = subtitleModel2.mShowTime;
        this.mSubtitle = subtitleModel2.mSubtitle;
        this.mSubtitleEvent = subtitleModel2.mSubtitleEvent;
        this.mTimeStamp = subtitleModel2.mTimeStamp;
        this.mIsHeader = subtitleModel2.mIsHeader;
        this.mSearchMatch = subtitleModel2.mSearchMatch;
        this.mSearchContent = subtitleModel2.mSearchContent;
        this.mCurrentSelectItem = subtitleModel2.mCurrentSelectItem;
        this.mSoundType = subtitleModel2.mSoundType;
    }

    public boolean isContentSame(SubtitleModel2 subtitleModel2) {
        if (this.mIsHeader) {
            return subtitleModel2.mIsHeader;
        }
        if (this.mShowTime != subtitleModel2.mShowTime || this.mSoundType.getNumber() != subtitleModel2.mSoundType.getNumber()) {
            return false;
        }
        if (isSubtitleContent() && (!subtitleModel2.isSubtitleContent() || !TextUtils.equals(this.mSubtitle.mTarget, subtitleModel2.mSubtitle.mTarget) || !TextUtils.equals(this.mCurrentSelectItem, subtitleModel2.mCurrentSelectItem) || this.mSearchMatch != subtitleModel2.mSearchMatch)) {
            return false;
        }
        if (!isSubtitleEvent()) {
            return true;
        }
        if (subtitleModel2.isSubtitleEvent() && TextUtils.equals(this.mCurrentSelectItem, subtitleModel2.mCurrentSelectItem) && this.mSearchMatch == subtitleModel2.mSearchMatch) {
            return true;
        }
        return false;
    }
}
