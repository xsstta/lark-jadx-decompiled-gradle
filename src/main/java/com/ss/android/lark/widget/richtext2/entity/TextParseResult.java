package com.ss.android.lark.widget.richtext2.entity;

import android.text.SpannableStringBuilder;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.PhoneInfo;
import com.ss.android.lark.widget.span.SpanInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TextParseResult extends AbstractParseResult {
    private static final long serialVersionUID = 8872419055807600616L;
    private List<AtInfo> mAtInfoList = new ArrayList();
    private List<PhoneInfo> mPhoneInfoList = new ArrayList();
    private SpannableStringBuilder mSpanBuilder = new SpannableStringBuilder();
    private List<UrlInfo> mUrlInfoList = new ArrayList();

    public List<AtInfo> getAtInfoList() {
        return this.mAtInfoList;
    }

    public List<PhoneInfo> getPhoneInfoList() {
        return this.mPhoneInfoList;
    }

    public SpannableStringBuilder getSpanBuilder() {
        return this.mSpanBuilder;
    }

    public List<UrlInfo> getUrlInfoList() {
        return this.mUrlInfoList;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public int getHashCode() {
        return Objects.hash(this.mSpanBuilder);
    }

    TextParseResult() {
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public boolean canPartialUpdate(AbstractParseResult abstractParseResult) {
        return abstractParseResult instanceof TextParseResult;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public boolean isEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextParseResult) {
            return Objects.equals(this.mSpanBuilder, ((TextParseResult) obj).getSpanBuilder());
        }
        return false;
    }

    private void appendTextSpan(SpannableStringBuilder spannableStringBuilder) {
        int length = this.mSpanBuilder.length();
        this.mSpanBuilder.append((CharSequence) spannableStringBuilder.toString());
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        for (Object obj : spans) {
            this.mSpanBuilder.setSpan(obj, spannableStringBuilder.getSpanStart(obj) + length, spannableStringBuilder.getSpanEnd(obj) + length, spannableStringBuilder.getSpanFlags(obj));
        }
    }

    public void append(TextParseResult textParseResult) {
        appendTextSpan(textParseResult.getSpanBuilder());
        appendInfoList(this.mAtInfoList.size(), textParseResult.getAtInfoList());
        appendInfoList(this.mUrlInfoList.size(), textParseResult.getUrlInfoList());
        appendInfoList(this.mPhoneInfoList.size(), textParseResult.getPhoneInfoList());
    }

    private <T extends SpanInfo> void appendInfoList(int i, List<T> list) {
        if (!CollectionUtils.isEmpty(list)) {
            for (T t : list) {
                if (t != null) {
                    t.start += i;
                    t.end += i;
                }
            }
        }
    }

    TextParseResult(SpannableStringBuilder spannableStringBuilder, List<AtInfo> list, List<UrlInfo> list2, List<PhoneInfo> list3) {
        this.mSpanBuilder = spannableStringBuilder;
        CollectionUtils.resetToList(this.mAtInfoList, list);
        CollectionUtils.resetToList(this.mUrlInfoList, list2);
        CollectionUtils.resetToList(this.mPhoneInfoList, list3);
    }
}
