package com.ss.android.lark.widget.richtext2.entity;

import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.Objects;

public class MediaParseResult extends ChildViewParseResult {
    private static final long serialVersionUID = -7522415695255100923L;
    private RichTextElement.MediaProperty mProperty;

    public RichTextElement.MediaProperty getProperty() {
        return this.mProperty;
    }

    @Override // com.ss.android.lark.widget.richtext2.entity.AbstractParseResult
    public int getHashCode() {
        return Objects.hash(this.mProperty);
    }

    public MediaParseResult(RichTextElement.MediaProperty mediaProperty) {
        this.mProperty = mediaProperty;
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
        if (obj instanceof MediaParseResult) {
            return Objects.equals(this.mProperty, ((MediaParseResult) obj).getProperty());
        }
        return false;
    }
}
