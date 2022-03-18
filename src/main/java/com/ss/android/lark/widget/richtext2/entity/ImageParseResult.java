package com.ss.android.lark.widget.richtext2.entity;

import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.Objects;

public class ImageParseResult extends ChildViewParseResult {
    private static final long serialVersionUID = 9049518288926550624L;
    private RichTextElement.ImageProperty mProperty;

    public RichTextElement.ImageProperty getProperty() {
        return this.mProperty;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public int getHashCode() {
        return Objects.hash(this.mProperty);
    }

    public ImageParseResult(RichTextElement.ImageProperty imageProperty) {
        this.mProperty = imageProperty;
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
        if (obj instanceof ImageParseResult) {
            return Objects.equals(this.mProperty, ((ImageParseResult) obj).getProperty());
        }
        return false;
    }
}
