package com.larksuite.component.ui.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J'\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH&J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&J%\u0010\u0015\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ \u0010\u0016\u001a\u00020\u0011\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH&¨\u0006\u0017"}, d2 = {"Lcom/larksuite/component/ui/layout/ILKUILayout;", "Lcom/larksuite/component/ui/layout/ILKUIDelegate;", "getAttrs", "Landroid/util/AttributeSet;", "getLKUIContext", "Landroid/content/Context;", "getLayout", "Landroid/view/ViewGroup;", "getPlus", "T", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "plusClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "hasPlus", "", "onConstructor", "", "layout", "context", "attrs", "registerPlus", "unRegisterPlus", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface ILKUILayout {
    AttributeSet getAttrs();

    Context getLKUIContext();

    ViewGroup getLayout();

    <T extends BaseLKUIPlus> T getPlus(Class<T> cls);

    boolean hasPlus();

    void onConstructor(ViewGroup viewGroup, Context context, AttributeSet attributeSet);

    <T extends BaseLKUIPlus> T registerPlus(Class<T> cls);

    <T extends BaseLKUIPlus> void unRegisterPlus(Class<T> cls);
}
