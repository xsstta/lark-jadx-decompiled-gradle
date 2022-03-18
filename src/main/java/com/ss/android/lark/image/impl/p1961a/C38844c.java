package com.ss.android.lark.image.impl.p1961a;

import android.content.Context;
import android.text.TextUtils;
import com.bumptech.glide.util.C2564g;
import com.bumptech.glide.util.C2568k;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.utils.UIHelper;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.image.impl.a.c */
public class C38844c {

    /* renamed from: a */
    private static String f99809a = "default-avatar_";

    /* renamed from: b */
    private static String f99810b = "_th";

    /* renamed from: c */
    private static String f99811c = "_mid";

    /* renamed from: d */
    private static String f99812d = "_hd";

    /* renamed from: e */
    private int[][] f99813e;

    /* renamed from: f */
    private C2564g<String, String> f99814f;

    /* renamed from: g */
    private List<String> f99815g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.image.impl.a.c$a */
    public static final class C38846a {

        /* renamed from: a */
        public static final C38844c f99816a = new C38844c();
    }

    /* renamed from: a */
    private int m153338a(float f) {
        if (f <= 1.0f) {
            return 0;
        }
        return f <= 2.0f ? 1 : 2;
    }

    /* renamed from: a */
    public static final C38844c m153339a() {
        return C38846a.f99816a;
    }

    private C38844c() {
        this.f99813e = (int[][]) Array.newInstance(int.class, 3, 2);
        this.f99814f = new C2564g<>(100);
        ArrayList arrayList = new ArrayList();
        this.f99815g = arrayList;
        int[][] iArr = this.f99813e;
        iArr[0][0] = 32;
        iArr[0][1] = 79;
        iArr[1][0] = 32;
        iArr[1][1] = 79;
        iArr[2][0] = 32;
        iArr[2][1] = 79;
        arrayList.add("1");
        this.f99815g.add("2");
    }

    /* renamed from: a */
    private String m153340a(AvatarImage avatarImage) {
        boolean z;
        long entityId = avatarImage.getEntityId();
        String entityIdStr = avatarImage.getEntityIdStr();
        String key = avatarImage.getKey();
        if (entityId == 0 || this.f99815g.contains(entityIdStr) || (key != null && key.startsWith(f99809a))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return key;
        }
        return m153341a(avatarImage.getEntityIdStr());
    }

    /* renamed from: a */
    private String m153341a(String str) {
        if (TextUtils.isEmpty(str)) {
            return f99809a;
        }
        if (this.f99814f.mo11251b(str)) {
            return this.f99814f.mo11252c(str);
        }
        try {
            String b = C2568k.m10915b(MessageDigest.getInstance("MD5").digest(str.getBytes()));
            this.f99814f.mo11250b(str, b);
            return b;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return f99809a;
        }
    }

    /* renamed from: a */
    public int mo142339a(Context context) {
        return UIHelper.dp2px((float) this.f99813e[m153338a(context.getResources().getDisplayMetrics().density)][0]);
    }

    /* renamed from: b */
    private String m153342b(Context context, AvatarImage avatarImage) {
        float f = context.getResources().getDisplayMetrics().density;
        int px2dp = UIHelper.px2dp((float) Math.max(avatarImage.getWidth(), avatarImage.getHeight()));
        int a = m153338a(f);
        int[][] iArr = this.f99813e;
        if (px2dp <= iArr[a][0]) {
            return f99810b;
        }
        if (px2dp <= iArr[a][1]) {
            return f99811c;
        }
        return f99812d;
    }

    /* renamed from: a */
    public String mo142340a(Context context, AvatarImage avatarImage) {
        return m153340a(avatarImage) + m153342b(context, avatarImage);
    }
}
