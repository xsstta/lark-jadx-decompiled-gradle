package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/LoadTask;", "", "uri", "Landroid/net/Uri;", "progress", "", "updateListener", "Lcom/bytedance/ies/bullet/service/base/LoadTask$OnTaskProgressUpdateListener;", "(Landroid/net/Uri;ILcom/bytedance/ies/bullet/service/base/LoadTask$OnTaskProgressUpdateListener;)V", "getProgress", "()I", "setProgress", "(I)V", "getUpdateListener", "()Lcom/bytedance/ies/bullet/service/base/LoadTask$OnTaskProgressUpdateListener;", "setUpdateListener", "(Lcom/bytedance/ies/bullet/service/base/LoadTask$OnTaskProgressUpdateListener;)V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "OnTaskProgressUpdateListener", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.j */
public final class LoadTask {

    /* renamed from: a */
    private Uri f37872a;

    /* renamed from: b */
    private int f37873b;

    /* renamed from: c */
    private OnTaskProgressUpdateListener f37874c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/LoadTask$OnTaskProgressUpdateListener;", "", "onUpdate", "", "progress", "", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.j$a */
    public interface OnTaskProgressUpdateListener {
    }

    public LoadTask() {
        this(null, 0, null, 7, null);
    }

    public LoadTask(Uri uri, int i, OnTaskProgressUpdateListener aVar) {
        this.f37872a = uri;
        this.f37873b = i;
        this.f37874c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadTask(Uri uri, int i, OnTaskProgressUpdateListener aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uri, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : aVar);
    }
}
