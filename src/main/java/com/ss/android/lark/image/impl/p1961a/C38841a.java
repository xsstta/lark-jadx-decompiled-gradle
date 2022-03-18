package com.ss.android.lark.image.impl.p1961a;

import android.content.Context;
import com.bumptech.glide.load.DataSource;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.impl.p1967g.AbstractC38898c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.a.a */
public class C38841a extends AbstractC38898c<AvatarImage> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.image.impl.p1967g.AbstractC38898c
    /* renamed from: e */
    public String mo142337e() {
        return "AvatarImageDataFetcher";
    }

    @Override // com.ss.android.lark.image.api.AbstractC38809a, com.ss.android.lark.image.impl.p1967g.AbstractC38898c
    /* renamed from: d */
    public DataSource mo142220d() {
        return DataSource.LOCAL;
    }

    public C38841a(AvatarImage avatarImage) {
        super(avatarImage);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo142336a(AvatarImage avatarImage) throws FileNotFoundException {
        String key = avatarImage.getKey();
        if (key.startsWith("lark.avatar/")) {
            key = key.substring(12);
        }
        if (avatarImage.isOnlyLocal()) {
            Context a = C38792a.m153106a().mo142254a();
            String str = C57881t.m224611J(a) + File.separator + C38844c.m153339a().mo142340a(a, avatarImage);
            boolean exists = new File(str).exists();
            Log.m165389i("AvatarImageDataFetcher", "try to load local file, path is:" + str + ", isExist:" + exists);
            if (exists) {
                Log.m165389i("AvatarImageDataFetcher", "file path " + str + " exists, avatarKey is " + avatarImage.getKey() + ", entityId is " + avatarImage.getEntityId());
                return new FileInputStream(str);
            }
            Log.m165389i("AvatarImageDataFetcher", "file path " + str + " does not exist, avatarKey is " + avatarImage.getKey() + ", entityId is " + avatarImage.getEntityId());
            return null;
        }
        byte[] a2 = C38792a.m153106a().mo142261a(avatarImage);
        if (a2 == null || a2.length == 0) {
            Log.m165383e("AvatarImageDataFetcher", "load avatar image, key is: " + key + ", data is empty");
            return null;
        }
        Log.m165389i("AvatarImageDataFetcher", "load avatar image, key is: " + key + ", data is non-empty");
        return new ByteArrayInputStream(a2);
    }
}
