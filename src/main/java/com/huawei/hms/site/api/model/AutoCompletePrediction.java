package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AutoCompletePrediction implements Parcelable {
    public static final Parcelable.Creator<AutoCompletePrediction> CREATOR = new Parcelable.Creator<AutoCompletePrediction>() {
        /* class com.huawei.hms.site.api.model.AutoCompletePrediction.C237401 */

        @Override // android.os.Parcelable.Creator
        public AutoCompletePrediction createFromParcel(Parcel parcel) {
            return new AutoCompletePrediction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AutoCompletePrediction[] newArray(int i) {
            return new AutoCompletePrediction[i];
        }
    };
    public String description;
    public Word[] matchedKeywords;
    public Word[] matchedWords;

    public AutoCompletePrediction() {
    }

    public AutoCompletePrediction(Parcel parcel) {
        this.description = parcel.readString();
        this.matchedKeywords = (Word[]) parcel.createTypedArray(Word.CREATOR);
        this.matchedWords = (Word[]) parcel.createTypedArray(Word.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.description;
    }

    public Word[] getMatchedKeywords() {
        return this.matchedKeywords;
    }

    public Word[] getMatchedWords() {
        return this.matchedWords;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMatchedKeywords(Word[] wordArr) {
        this.matchedKeywords = wordArr;
    }

    public void setMatchedWords(Word[] wordArr) {
        this.matchedWords = wordArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeTypedArray(this.matchedKeywords, i);
        parcel.writeTypedArray(this.matchedWords, i);
    }
}
