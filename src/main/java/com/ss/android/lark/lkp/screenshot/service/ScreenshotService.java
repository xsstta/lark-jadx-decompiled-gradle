package com.ss.android.lark.lkp.screenshot.service;

import android.content.Context;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.lkp.screenshot.dto.IScreenshotAPI;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/service/ScreenshotService;", "", "()V", "Companion", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.lkp.screenshot.c.a */
public final class ScreenshotService {

    /* renamed from: a */
    public static final Companion f105607a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/lkp/screenshot/service/ScreenshotService$Companion;", "", "()V", "create", "Lcom/ss/android/lark/lkp/screenshot/dto/IScreenshotAPI;", "ctx", "Landroid/content/Context;", "im_screenshot-lkp_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.lkp.screenshot.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final IScreenshotAPI mo149469a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "ctx");
            if (RomUtils.m94953h()) {
                return new TNTScreenshotService(context);
            }
            return null;
        }
    }
}
