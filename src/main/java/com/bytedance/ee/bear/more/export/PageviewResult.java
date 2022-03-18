package com.bytedance.ee.bear.more.export;

import com.bytedance.ee.util.io.NonProguard;

public class PageviewResult implements NonProguard {
    private int characterCount;
    private int wordCount;

    public int getCharacterCount() {
        return this.characterCount;
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public void setCharacterCount(int i) {
        this.characterCount = i;
    }

    public void setWordCount(int i) {
        this.wordCount = i;
    }
}
