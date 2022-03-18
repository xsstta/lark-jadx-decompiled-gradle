package com.ss.android.lark.mail.impl.view.titlebar;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.suite.R;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public abstract class AbsButton {
    private final AbstractC43948a buttonListener;
    private AbstractC43949b controller;
    private final int mId;

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ButtonType {
        String action();

        Class clz() default AbsButton.class;
    }

    public enum ExtraAction {
        FastClick
    }

    public enum HintType {
        None,
        RedDot,
        GrayDotWithText,
        RedDotWithText
    }

    public enum ModuleType {
        NONE,
        SHARE
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.titlebar.AbsButton$a */
    public interface AbstractC43948a {
        void onButtonClick(View view);
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.titlebar.AbsButton$b */
    public static abstract class AbstractC43949b {
        /* renamed from: a */
        public View mo154560a() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo156412a(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo156413a(HintType hintType, String str) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo156414a(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo156415b(int i) {
        }
    }

    public abstract int getDrawableID();

    public int getId() {
        return 0;
    }

    public int getLargeDrawableID() {
        return 0;
    }

    public abstract String getText();

    public abstract int getTextIcon();

    public int getTintColorID() {
        return R.color.mail_icon_color_selector_n1_n650;
    }

    public boolean isExtraActionSupported(ExtraAction extraAction) {
        return false;
    }

    public ModuleType getButtonType() {
        return ModuleType.NONE;
    }

    public View getView() {
        AbstractC43949b bVar = this.controller;
        if (bVar == null) {
            return null;
        }
        return bVar.mo154560a();
    }

    public void setController(AbstractC43949b bVar) {
        this.controller = bVar;
    }

    public AbsButton(AbstractC43948a aVar) {
        this.buttonListener = aVar;
    }

    public void onClick(View view) {
        AbstractC43948a aVar = this.buttonListener;
        if (aVar != null) {
            aVar.onButtonClick(view);
        }
    }

    public void setEnable(boolean z) {
        AbstractC43949b bVar = this.controller;
        if (bVar != null) {
            bVar.mo156414a(z);
        }
    }

    public void updateIcon(int i) {
        AbstractC43949b bVar = this.controller;
        if (bVar != null) {
            bVar.mo156412a(i);
        }
    }

    public void updateTint(int i) {
        AbstractC43949b bVar = this.controller;
        if (bVar != null) {
            bVar.mo156415b(i);
        }
    }

    public void setHint(HintType hintType, String str) {
        AbstractC43949b bVar = this.controller;
        if (bVar != null) {
            bVar.mo156413a(hintType, str);
        }
    }

    public void setImageResourceWithTint(Context context, ImageView imageView) {
        if (imageView != null) {
            imageView.setImageResource(getDrawableID());
            if (context != null && getTintColorID() != 0) {
                imageView.setImageTintList(C0215a.m652a(context, getTintColorID()));
            }
        }
    }

    public void setLargeImageResourceWithTint(Context context, ImageView imageView) {
        if (imageView != null) {
            imageView.setImageResource(getLargeDrawableID());
            if (context != null && getTintColorID() != 0) {
                imageView.setImageTintList(C0215a.m652a(context, getTintColorID()));
            }
        }
    }
}
