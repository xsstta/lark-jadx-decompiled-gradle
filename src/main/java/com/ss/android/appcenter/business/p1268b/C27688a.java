package com.ss.android.appcenter.business.p1268b;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.load.p085b.AbstractC2220h;
import com.bumptech.glide.load.p085b.C2219g;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.AppDetailInfo;
import com.ss.android.appcenter.business.net.dto.AvatarModel;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.entity.AvatarImage;
import java.io.File;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.b.a */
public class C27688a {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Map m101206a(Map map) {
        return map;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Map m101216b(Map map) {
        return map;
    }

    /* renamed from: a */
    public static void m101215a(String str, Map<String, String> map, ImageView imageView) {
        ImageLoader.with(imageView.getContext()).load(new C2219g(str, new AbstractC2220h(map) {
            /* class com.ss.android.appcenter.business.p1268b.$$Lambda$a$nN2SUNvQ2zKGa9IayndppqyUsSQ */
            public final /* synthetic */ Map f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bumptech.glide.load.p085b.AbstractC2220h
            public final Map getHeaders() {
                return C27688a.m101206a(this.f$0);
            }
        })).dontAnimate(false).asDrawable().placeholder(R.color.bg_filler).error(R.color.bg_filler).into(imageView);
    }

    /* renamed from: a */
    public static void m101212a(ImageView imageView, File file) {
        ImageLoader.with(imageView.getContext()).load(file).dontAnimate(false).into(imageView);
    }

    /* renamed from: a */
    public static void m101213a(String str, ImageView imageView) {
        ImageLoader.with(imageView.getContext()).load(str).dontAnimate(true).placeholder(R.color.bg_filler).error(R.color.bg_filler).into(imageView);
    }

    /* renamed from: a */
    public static void m101209a(Context context, String str, ImageView imageView) {
        m101210a(context, (String) null, str, imageView);
    }

    /* renamed from: a */
    public static void m101208a(Context context, AvatarModel avatarModel, ImageView imageView) {
        if (avatarModel == null) {
            C28184h.m103250d("Workplace_Image", "iconKey is null");
        }
        ImageLoader.with(context).load(AvatarImage.Builder.obtain(avatarModel.getKey(), "", 180, 180).fsUnit(avatarModel.getFsUnit()).build()).dontAnimate(true).placeholder(R.color.bg_filler).error(R.color.bg_filler).into(imageView);
    }

    /* renamed from: a */
    public static void m101207a(Context context, AppDetailInfo appDetailInfo, ImageView imageView) {
        ImageLoader.with(context).load(AvatarImage.Builder.obtain(appDetailInfo.getAvatarKey(), "", LocationRequest.PRIORITY_INDOOR, LocationRequest.PRIORITY_INDOOR).build()).placeholder(R.color.bg_filler).error(R.color.bg_filler).into(imageView);
        C28184h.m103250d("Workplace_Image", "appname:" + appDetailInfo.getAppName() + "image key:" + appDetailInfo.getAvatarKey());
    }

    /* renamed from: a */
    public static void m101211a(Context context, String str, Map<String, String> map, AbstractC38819j<?> jVar) {
        ImageLoader.with(context).load(new C2219g(str, new AbstractC2220h(map) {
            /* class com.ss.android.appcenter.business.p1268b.$$Lambda$a$W37JD9VAIPnqTl13dlHWS9ICCyI */
            public final /* synthetic */ Map f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bumptech.glide.load.p085b.AbstractC2220h
            public final Map getHeaders() {
                return C27688a.m101216b(this.f$0);
            }
        })).asFile().into(jVar);
    }

    /* renamed from: a */
    public static void m101210a(Context context, String str, String str2, ImageView imageView) {
        ImageLoader.with(context).load(AvatarImage.Builder.obtain(str2, "", 180, 180).build()).dontAnimate(true).placeholder(R.color.bg_filler).error(R.color.bg_filler).into(imageView);
    }

    /* renamed from: a */
    public static void m101214a(String str, ImageView imageView, int i, int i2) {
        ImageLoader.with(imageView.getContext()).load(str).dontAnimate(true).placeholder(R.color.bg_filler).error(R.color.bg_filler).override(i, i2).into(imageView);
    }
}
