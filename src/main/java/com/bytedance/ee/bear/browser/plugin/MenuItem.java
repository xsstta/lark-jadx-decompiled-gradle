package com.bytedance.ee.bear.browser.plugin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.ee.bear.widgets.BadgeStyle;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Objects;

public class MenuItem implements NonProguard {
    private int badgeNum;
    private BadgeStyle badgeStyle;
    private AbstractC4937a clickListener;
    private List<String> customColor;
    private boolean enable;
    private Drawable icon;
    private String id;
    private CharSequence spannableText;
    private String text;

    /* renamed from: com.bytedance.ee.bear.browser.plugin.MenuItem$a */
    public interface AbstractC4937a {
        void onMenuItemClick(MenuItem menuItem, View view);
    }

    public int getBadgeNum() {
        return this.badgeNum;
    }

    public BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public List<String> getCustomColor() {
        return this.customColor;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public CharSequence getSpannableText() {
        return this.spannableText;
    }

    public CharSequence getText() {
        return this.text;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public MenuItem() {
        this(null, null);
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.format("Menu[%s,%s]", this.id, this.text);
    }

    public void setBadgeNum(int i) {
        this.badgeNum = i;
    }

    public void setBadgeStyle(BadgeStyle badgeStyle2) {
        this.badgeStyle = badgeStyle2;
    }

    public void setClickListener(AbstractC4937a aVar) {
        this.clickListener = aVar;
    }

    public void setCustomColor(List<String> list) {
        this.customColor = list;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setIcon(Drawable drawable) {
        this.icon = drawable;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSpannableText(CharSequence charSequence) {
        this.spannableText = charSequence;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void onClick(View view) {
        AbstractC4937a aVar = this.clickListener;
        if (aVar != null) {
            aVar.onMenuItemClick(this, view);
        }
    }

    public void setDisabled(boolean z) {
        setEnable(!z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.id, ((MenuItem) obj).id);
    }

    public MenuItem(String str, String str2) {
        this(str, null, str2);
    }

    public MenuItem(String str, Drawable drawable, String str2) {
        this.enable = true;
        this.id = str;
        this.icon = drawable;
        this.text = str2;
    }

    public static MenuItem fromColorText(Context context, int i, int i2) {
        Resources resources = context.getResources();
        String string = resources.getString(i);
        int color = resources.getColor(i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, string.length(), 17);
        MenuItem menuItem = new MenuItem();
        menuItem.spannableText = spannableStringBuilder;
        menuItem.text = null;
        return menuItem;
    }
}
