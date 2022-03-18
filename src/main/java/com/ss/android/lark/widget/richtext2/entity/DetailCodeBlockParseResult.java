package com.ss.android.lark.widget.richtext2.entity;

import android.text.SpannableStringBuilder;
import java.util.Objects;

public class DetailCodeBlockParseResult extends AbstractParseResult {
    private static final long serialVersionUID = 8493577701247584362L;
    private SpannableStringBuilder mSpanBuilder;

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public boolean canPartialUpdate(AbstractParseResult abstractParseResult) {
        return false;
    }

    public SpannableStringBuilder getSpanBuilder() {
        return this.mSpanBuilder;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public int getHashCode() {
        return Objects.hash(this.mSpanBuilder);
    }

    public void setSpanBuilder(SpannableStringBuilder spannableStringBuilder) {
        this.mSpanBuilder = spannableStringBuilder;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public boolean isEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DetailCodeBlockParseResult) {
            return Objects.equals(this.mSpanBuilder, ((DetailCodeBlockParseResult) obj).getSpanBuilder());
        }
        return false;
    }
}
