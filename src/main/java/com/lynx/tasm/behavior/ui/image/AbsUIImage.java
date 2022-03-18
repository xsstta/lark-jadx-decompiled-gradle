package com.lynx.tasm.behavior.ui.image;

import android.view.View;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.LynxUI;

public abstract class AbsUIImage<T extends View> extends LynxUI<T> {
    @LynxProp(name = "blur-radius")
    public abstract void setBlurRadius(String str);

    @LynxProp(name = "capInsets")
    public abstract void setCapInsets(String str);

    @LynxProp(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
    }

    @LynxProp(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
    }

    @LynxProp(defaultBoolean = false, name = "cover-start")
    public abstract void setCoverStart(boolean z);

    @LynxProp(defaultBoolean = false, name = "disable-default-placeholder")
    public void setDisableDefaultPlaceholder(boolean z) {
    }

    @LynxProp(name = "loop-count")
    public abstract void setLoopCount(int i);

    @LynxProp(name = "mode")
    public abstract void setObjectFit(String str);

    @LynxProp(name = "placeholder")
    public abstract void setPlaceholder(String str);

    @LynxProp(name = "prefetch-height")
    public abstract void setPreFetchHeight(String str);

    @LynxProp(name = "prefetch-width")
    public abstract void setPreFetchWidth(String str);

    @LynxProp(defaultBoolean = false, name = "repeat")
    public abstract void setRepeat(boolean z);

    @LynxProp(name = "src")
    public abstract void setSource(String str);
}
