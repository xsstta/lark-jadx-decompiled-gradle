package com.ss.android.vesdk.model;

import com.ss.android.ttve.nativePort.C60270d;

public class BefTextLayout {
    long backColor;
    int charSize;
    String familyName;
    boolean isPlaceholder;
    int letterSpacing;
    int lineCount;
    float lineHeight;
    int lineWidth;
    int split;
    int textAlign;
    long textColor;
    int textIndent;

    public long getBackColor() {
        return this.backColor;
    }

    public int getCharSize() {
        return this.charSize;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public int getLetterSpacing() {
        return this.letterSpacing;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public float getLineHeight() {
        return this.lineHeight;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public int getSplit() {
        return this.split;
    }

    public int getTextAlign() {
        return this.textAlign;
    }

    public long getTextColor() {
        return this.textColor;
    }

    public int getTextIndent() {
        return this.textIndent;
    }

    public boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public String toString() {
        return "BefTextLayout{charSize=" + this.charSize + ", letterSpacing=" + this.letterSpacing + ", lineWidth=" + this.lineWidth + ", lineHeight=" + this.lineHeight + ", textAlign=" + this.textAlign + ", textIndent=" + this.textIndent + ", split=" + this.split + ", lineCount=" + this.lineCount + ", familyName='" + this.familyName + '\'' + ", textColor=" + this.textColor + ", backColor=" + this.backColor + ", isPlaceholder=" + this.isPlaceholder + '}';
    }

    public void setBackColor(long j) {
        this.backColor = j;
    }

    public void setCharSize(int i) {
        this.charSize = i;
    }

    public void setFamilyName(String str) {
        this.familyName = str;
    }

    public void setLetterSpacing(int i) {
        this.letterSpacing = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setLineHeight(float f) {
        this.lineHeight = f;
    }

    public void setLineWidth(int i) {
        this.lineWidth = i;
    }

    public void setPlaceholder(boolean z) {
        this.isPlaceholder = z;
    }

    public void setSplit(int i) {
        this.split = i;
    }

    public void setTextAlign(int i) {
        this.textAlign = i;
    }

    public void setTextColor(long j) {
        this.textColor = j;
    }

    public void setTextIndent(int i) {
        this.textIndent = i;
    }

    public static BefTextLayout readFromByteArray(byte[][] bArr) {
        C60270d dVar = new C60270d(bArr[0]);
        BefTextLayout befTextLayout = new BefTextLayout();
        befTextLayout.setBackColor(dVar.mo206317c().longValue());
        befTextLayout.setCharSize(dVar.mo206315a());
        befTextLayout.setFamilyName(dVar.mo206316b());
        befTextLayout.setLetterSpacing(dVar.mo206315a());
        befTextLayout.setLineCount(dVar.mo206315a());
        befTextLayout.setLineHeight((float) dVar.mo206315a());
        befTextLayout.setLineWidth(dVar.mo206315a());
        befTextLayout.setPlaceholder(dVar.mo206318d());
        befTextLayout.setSplit(dVar.mo206315a());
        befTextLayout.setTextAlign(dVar.mo206315a());
        befTextLayout.setTextColor(dVar.mo206317c().longValue());
        befTextLayout.setTextIndent(dVar.mo206315a());
        return befTextLayout;
    }
}
