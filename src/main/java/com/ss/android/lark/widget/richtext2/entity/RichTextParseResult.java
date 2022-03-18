package com.ss.android.lark.widget.richtext2.entity;

import android.text.SpannableStringBuilder;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.PhoneInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RichTextParseResult implements Serializable {
    private static final long serialVersionUID = 5710500171498119659L;
    private TextParseResult mAllTxtParseResult = new TextParseResult();
    private String mCopyTxt;
    private CharSequence mDigestTxt;
    private List<AbstractParseResult> mResultList = new ArrayList();

    public TextParseResult getAllTxtParseResult() {
        return this.mAllTxtParseResult;
    }

    public String getCopyTxt() {
        return this.mCopyTxt;
    }

    public CharSequence getDigestTxt() {
        return this.mDigestTxt;
    }

    public List<AbstractParseResult> getResultList() {
        return this.mResultList;
    }

    public int hashCode() {
        return Objects.hash(this.mResultList);
    }

    public void setCopyTxt(String str) {
        this.mCopyTxt = str;
    }

    public void setDigestTxt(CharSequence charSequence) {
        this.mDigestTxt = charSequence;
    }

    public void addItemViewResult(ChildViewParseResult childViewParseResult) {
        this.mResultList.add(childViewParseResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RichTextParseResult) {
            return Objects.equals(this.mResultList, ((RichTextParseResult) obj).getResultList());
        }
        return false;
    }

    public void addTextResult(SpannableStringBuilder spannableStringBuilder, List<AtInfo> list, List<UrlInfo> list2, List<PhoneInfo> list3) {
        TextParseResult textParseResult = new TextParseResult(spannableStringBuilder, list, list2, list3);
        this.mResultList.add(textParseResult);
        this.mAllTxtParseResult.append(textParseResult);
    }
}
