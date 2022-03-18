package com.ss.android.lark.widget.photo_picker.p2951f;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.i */
public class C58660i {
    /* renamed from: a */
    private static Image m227524a(PhotoItem.PicInfo picInfo) {
        if (picInfo == null) {
            return null;
        }
        Image image = new Image();
        image.setUrls(picInfo.urls);
        image.setKey(picInfo.key);
        image.setWidth(picInfo.width);
        image.setHeight(picInfo.height);
        return image;
    }

    /* renamed from: a */
    public static ImagePagerFragment m227525a(FragmentActivity fragmentActivity) {
        ImagePagerFragment imagePagerFragment = new ImagePagerFragment();
        fragmentActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, imagePagerFragment).commitNowAllowingStateLoss();
        return imagePagerFragment;
    }

    /* renamed from: a */
    public static ImageContent m227523a(PhotoItem photoItem) {
        ImageContent imageContent = new ImageContent();
        ImageSet imageSet = new ImageSet();
        imageSet.setOrigin(m227524a(photoItem.getOriginPicInfo()));
        imageSet.setMiddle(m227524a(photoItem.getMiddlePicInfo()));
        imageSet.setThumbnail(m227524a(photoItem.getThumbnailPicInfo()));
        imageSet.setInlinePreview(photoItem.getInlinePreview());
        imageSet.setKey(photoItem.getImageKey());
        imageSet.setMessageIdentity(photoItem.getMessageIdentity());
        imageSet.setOriginSource(photoItem.isOriginSource());
        imageSet.setOriginSize(photoItem.getOriginSize());
        imageContent.setImageSet(imageSet);
        return imageContent;
    }

    /* renamed from: a */
    public static List<PhotoItem> m227526a(Bundle bundle, String str) {
        Object a = al.m95028a().mo93365a(bundle.getString(str));
        ArrayList arrayList = new ArrayList();
        if (a instanceof ArrayList) {
            arrayList.addAll((ArrayList) a);
        }
        return arrayList;
    }
}
