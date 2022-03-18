package com.bytedance.ee.bear.wikiv2.extension;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.ee.bear.facade.common.C7661a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/extension/WikiActivityExtension;", "Lcom/bytedance/ee/bear/facade/common/ActivityExtension;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "onNewIntent", "", "intent", "Landroid/content/Intent;", "onPostCreate", "savedInstanceState", "Landroid/os/Bundle;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.extension.f */
public class WikiActivityExtension extends C7661a {
    /* renamed from: a */
    public void mo46799a(Intent intent) {
    }

    /* renamed from: a */
    public void mo46808a(Bundle bundle) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiActivityExtension(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
    }
}
