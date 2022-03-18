package com.bytedance.ee.bear.route;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public interface PostCard {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlagInt {
    }

    /* renamed from: a */
    PostCard mo17305a(int i);

    /* renamed from: a */
    PostCard mo17306a(int i, int i2);

    /* renamed from: a */
    PostCard mo17307a(Bundle bundle);

    /* renamed from: a */
    PostCard mo17308a(String str, int i);

    /* renamed from: a */
    PostCard mo17309a(String str, long j);

    /* renamed from: a */
    PostCard mo17310a(String str, Bundle bundle);

    /* renamed from: a */
    PostCard mo17311a(String str, Parcelable parcelable);

    /* renamed from: a */
    PostCard mo17312a(String str, Serializable serializable);

    /* renamed from: a */
    PostCard mo17313a(String str, CharSequence charSequence);

    /* renamed from: a */
    PostCard mo17314a(String str, String str2);

    /* renamed from: a */
    PostCard mo17315a(String str, ArrayList<? extends Parcelable> arrayList);

    /* renamed from: a */
    PostCard mo17316a(String str, boolean z);

    /* renamed from: a */
    void mo17317a();

    /* renamed from: b */
    PostCard mo17318b(int i);
}
