package com.ss.android.lark.widget.richtext2.entity;

import android.text.SpannableStringBuilder;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.Objects;

public class SimpleCodeBlockParseResult extends ChildViewParseResult {
    private static final long serialVersionUID = 8493577701247584362L;
    private RichTextElement.CodeBlockProperty mProperty;
    private SpannableStringBuilder mSpanBuilder;

    public RichTextElement.CodeBlockProperty getProperty() {
        return this.mProperty;
    }

    public SpannableStringBuilder getSpanBuilder() {
        return this.mSpanBuilder;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public int getHashCode() {
        return Objects.hash(this.mProperty, this.mSpanBuilder);
    }

    public void setProperty(RichTextElement.CodeBlockProperty codeBlockProperty) {
        this.mProperty = codeBlockProperty;
    }

    public void setSpanBuilder(SpannableStringBuilder spannableStringBuilder) {
        this.mSpanBuilder = spannableStringBuilder;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public boolean canPartialUpdate(AbstractParseResult abstractParseResult) {
        return isEquals(abstractParseResult);
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public boolean isEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleCodeBlockParseResult)) {
            return false;
        }
        SimpleCodeBlockParseResult simpleCodeBlockParseResult = (SimpleCodeBlockParseResult) obj;
        if (!Objects.equals(this.mProperty, simpleCodeBlockParseResult.getProperty()) || !Objects.equals(this.mSpanBuilder, simpleCodeBlockParseResult.getSpanBuilder())) {
            return false;
        }
        return true;
    }
}
