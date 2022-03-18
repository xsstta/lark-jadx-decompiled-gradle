package com.ss.android.lark.widget.photo_picker.adapter;

import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.photo_picker.C58612c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/adapter/PhotoPickerUIConstants;", "", "()V", "BOTTOM_TEXT_SIZE", "", "CHECKBOX_BOTTOM_SIZE_IN_DP", "CHECKBOX_BOTTOM_TEXT_SIZE", "CHECKBOX_PADDING_END", "CHECKBOX_PADDING_IN_DP", "CHECKBOX_PADDING_START", "CHECKBOX_RES_ID", "CHECKBOX_SIZE_IN_DP", "CHECKBOX_TEXT_SIZE", "TITLE_ACTION_SIZE", "TITLE_TEXT_SIZE", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.a.c */
public final class PhotoPickerUIConstants {

    /* renamed from: a */
    public static int f144602a;

    /* renamed from: b */
    public static int f144603b;

    /* renamed from: c */
    public static int f144604c;

    /* renamed from: d */
    public static int f144605d;

    /* renamed from: e */
    public static int f144606e;

    /* renamed from: f */
    public static int f144607f;

    /* renamed from: g */
    public static int f144608g;

    /* renamed from: h */
    public static int f144609h;

    /* renamed from: i */
    public static int f144610i;

    /* renamed from: j */
    public static int f144611j;

    /* renamed from: k */
    public static int f144612k;

    /* renamed from: l */
    public static final PhotoPickerUIConstants f144613l = new PhotoPickerUIConstants();

    private PhotoPickerUIConstants() {
    }

    static {
        C58612c.AbstractC58615c a = C58612c.m227290a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PhotoPickerModuleDependency.getDependency()");
        if (DesktopUtil.m144301a(a.mo102826a())) {
            f144602a = 5;
            f144603b = 16;
            f144604c = R.drawable.checkbox_bg_selelctor_desktop;
            f144605d = 10;
            f144606e = 16;
            f144607f = 14;
            f144608g = 14;
            f144609h = 16;
            f144610i = 15;
            f144611j = 20;
            f144612k = 12;
            return;
        }
        f144602a = 7;
        f144603b = 30;
        f144604c = R.drawable.checkbox_bg_selector;
        f144605d = 16;
        f144606e = 17;
        f144607f = 15;
        f144608g = 16;
        f144609h = 18;
        f144610i = 18;
        f144611j = 30;
        f144612k = 16;
    }
}
