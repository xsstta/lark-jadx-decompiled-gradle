package com.bytedance.ee.bear.photopicker.photo;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.photopicker.photo.C10537d;
import com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity;
import com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d;
import com.bytedance.ee.bear.photopicker.photo.p520a.C10499a;
import com.bytedance.ee.bear.photopicker.photo.p520a.C10501b;
import com.bytedance.ee.bear.photopicker.photo.p520a.C10520e;
import com.bytedance.ee.bear.photopicker.photo.p521b.C10525a;
import com.bytedance.ee.bear.photopicker.photo.p521b.C10530d;
import com.bytedance.ee.util.p701d.C13619g;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MediaPickerView extends FrameLayout {

    /* renamed from: a */
    public C10501b f28194a;

    /* renamed from: b */
    public FragmentActivity f28195b;

    /* renamed from: c */
    public AbstractC10489a f28196c;

    /* renamed from: d */
    public boolean f28197d;

    /* renamed from: e */
    public FileSelectConfig f28198e;

    /* renamed from: f */
    AbstractC10513d.AbstractC10517b.AbstractC10519b f28199f;

    /* renamed from: g */
    Runnable f28200g;

    /* renamed from: h */
    public final C10537d.AbstractC10538a f28201h;

    /* renamed from: i */
    private AbstractC10490b f28202i;

    /* renamed from: j */
    private final ContentObserver f28203j;

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.MediaPickerView$a */
    public interface AbstractC10489a {
        /* renamed from: a */
        void mo30434a(List<Photo> list, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.MediaPickerView$b */
    public interface AbstractC10490b {
        /* renamed from: a */
        void mo30435a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.photopicker.photo.MediaPickerView$c */
    public interface AbstractC10491c<T> {
        /* renamed from: a */
        void mo39817a(T t);
    }

    public AbstractC10489a getMediaPickerListener() {
        return this.f28196c;
    }

    /* renamed from: e */
    private void m43478e() {
        AbstractC10490b bVar = this.f28202i;
        if (bVar != null) {
            bVar.mo30435a();
        }
    }

    /* renamed from: b */
    public void mo39806b() {
        C10501b bVar = this.f28194a;
        if (bVar != null) {
            bVar.mo39875c();
        }
    }

    public String[] getMediaPickerPermissions() {
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: c */
    private void m43476c() {
        this.f28195b = (FragmentActivity) getContext();
        LayoutInflater.from(getContext()).inflate(R.layout.photo_picker_view, (ViewGroup) this, true);
        setClickable(true);
    }

    /* renamed from: d */
    private void m43477d() {
        ((ImageView) findViewById(R.id.camera_btn)).setEnabled(this.f28198e.enableExternalSelect);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f28203j);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().getContentResolver().unregisterContentObserver(this.f28203j);
    }

    /* renamed from: a */
    public void mo39803a() {
        FragmentActivity fragmentActivity;
        Log.m165382e("onMediaChange() called");
        if (!this.f28197d) {
            Log.m165396w("update config before init");
        } else if (this.f28194a != null && (fragmentActivity = this.f28195b) != null && this.f28198e != null && m43475a(fragmentActivity, getMediaPickerPermissions())) {
            this.f28194a.mo39874b(this.f28195b);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        FileSelectConfig fileSelectConfig = this.f28198e;
        if (fileSelectConfig != null) {
            if (!(this.f28194a == null || fileSelectConfig.selectLocalMedias == null)) {
                this.f28198e.selectLocalMedias.clear();
                this.f28198e.selectLocalMedias.addAll(this.f28194a.mo39873b());
            }
            bundle.putSerializable("config", this.f28198e);
        }
        return bundle;
    }

    public void setBackToPickerViewCallBack(AbstractC10490b bVar) {
        this.f28202i = bVar;
    }

    public void setMediaPickerListener(AbstractC10489a aVar) {
        this.f28196c = aVar;
    }

    public MediaPickerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m43474a(final AbstractC10491c<C10537d> cVar) {
        post(new Runnable() {
            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.RunnableC104822 */

            public void run() {
                AbstractC10491c cVar = cVar;
                if (cVar != null) {
                    cVar.mo39817a(C10537d.m43634a(MediaPickerView.this.f28195b));
                }
            }
        });
    }

    /* renamed from: b */
    public void mo39807b(FileSelectConfig fileSelectConfig) {
        C10520e eVar = new C10520e();
        C10499a aVar = new C10499a();
        this.f28194a = new C10501b(eVar, aVar);
        eVar.mo39886a(getContext(), this.f28199f, fileSelectConfig);
        aVar.mo39864a(fileSelectConfig, fileSelectConfig.selectLocalMedias);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("super"));
            FileSelectConfig fileSelectConfig = (FileSelectConfig) bundle.getSerializable("config");
            if (fileSelectConfig != null) {
                mo39805a(fileSelectConfig);
            }
        }
    }

    /* renamed from: a */
    public void mo39805a(final FileSelectConfig fileSelectConfig) {
        this.f28198e = fileSelectConfig;
        m43477d();
        m43474a(new AbstractC10491c<C10537d>() {
            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.C104801 */

            /* renamed from: a */
            public void mo39817a(C10537d dVar) {
                new C13619g.C13621b(MediaPickerView.this.f28195b).mo50566b(MediaPickerView.this.getMediaPickerPermissions()).subscribe(new Consumer<Boolean>() {
                    /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.C104801.C104811 */

                    /* renamed from: a */
                    public void accept(Boolean bool) throws Exception {
                        MediaPickerView.this.mo39807b(fileSelectConfig);
                        MediaPickerView.this.f28197d = true;
                        if (bool.booleanValue()) {
                            MediaPickerView.this.f28194a.mo39871a(MediaPickerView.this.getContext());
                        } else {
                            MediaPickerView.this.f28194a.mo39876d();
                        }
                    }
                });
            }
        });
    }

    public MediaPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m43475a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (ActivityCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo39804a(int i, Intent intent) {
        boolean z;
        if (i != -1 || this.f28194a == null) {
            Log.m165388i("cancel activity result ");
            return;
        }
        if (intent.getBooleanExtra("KEY_FOR_SEND", false) || intent.getBooleanExtra("is_send_photo", false)) {
            z = true;
        } else {
            z = false;
        }
        this.f28194a.mo39872a(intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false), (ArrayList) intent.getSerializableExtra("KEY_SELECTED_MEDIA"));
        if (z) {
            this.f28194a.mo39870a();
        } else {
            m43478e();
        }
    }

    public MediaPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28199f = new AbstractC10513d.AbstractC10517b.AbstractC10519b() {
            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.C104833 */

            @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10519b
            /* renamed from: a */
            public View mo39820a() {
                return MediaPickerView.this;
            }

            @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10519b
            /* renamed from: c */
            public void mo39826c() {
                C26323w.m95322a(MediaPickerView.this.getContext());
            }

            @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10519b
            /* renamed from: b */
            public void mo39825b() {
                C10537d.m43634a(MediaPickerView.this.f28195b).mo39918a(233, MediaPickerView.this.f28201h);
                new TakePhotoActivity.C10495a().mo39850a(MediaPickerView.this.f28198e.showImage).mo39852b(MediaPickerView.this.f28198e.showVideo).mo39851a(MediaPickerView.this.f28195b, C10537d.m43634a(MediaPickerView.this.f28195b), 233);
            }

            /* renamed from: a */
            public List<Photo> mo39821a(List<Photo> list) {
                try {
                    for (Photo photo : list) {
                        if (!photo.isVideo() && (photo.getHeight() <= 0 || photo.getWidth() <= 0)) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(photo.getPath(), options);
                            photo.setWidth(options.outWidth);
                            photo.setHeight(options.outHeight);
                        }
                    }
                } catch (Exception unused) {
                    Log.m165396w("can not get image width and height");
                }
                return list;
            }

            @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10519b
            /* renamed from: a */
            public void mo39824a(List<Photo> list, final boolean z) {
                if (MediaPickerView.this.f28196c != null) {
                    if (CollectionUtils.isNotEmpty(list)) {
                        C10525a.m43607a(new ArrayList(list), new Function1<List<Photo>, List<Photo>>() {
                            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.C104833.C104841 */

                            /* renamed from: a */
                            public List<Photo> invoke(List<Photo> list) {
                                return C104833.this.mo39821a(list);
                            }
                        }, new Function1<List<Photo>, Unit>() {
                            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.C104833.C104852 */

                            /* renamed from: a */
                            public Unit invoke(List<Photo> list) {
                                MediaPickerView.this.f28196c.mo30434a(list, z);
                                return null;
                            }
                        });
                    } else {
                        Log.m165382e("selection Medias is empty");
                    }
                }
            }

            @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10519b
            /* renamed from: a */
            public void mo39822a(FileSelectConfig fileSelectConfig, List<Photo> list) {
                C10537d a = C10537d.m43634a(MediaPickerView.this.f28195b);
                a.mo39918a(233, MediaPickerView.this.f28201h);
                PickerParams.Builder aVar = new PickerParams.Builder();
                aVar.mo198893c(fileSelectConfig.maxSelectImageNum);
                int i = 2;
                aVar.mo198908h(2);
                aVar.mo198902f(fileSelectConfig.showOrigin);
                aVar.mo198905g(MediaPickerView.this.f28194a.mo39877e());
                aVar.mo198909h(true);
                aVar.mo198899e(!fileSelectConfig.showGif);
                aVar.mo198887a(new ArrayList<>(list));
                aVar.mo198904g(fileSelectConfig.columnCount);
                if (fileSelectConfig.showVideo && fileSelectConfig.showImage) {
                    if (!fileSelectConfig.mixSelect) {
                        i = 3;
                    }
                    aVar.mo198890b(i);
                } else if (fileSelectConfig.showVideo) {
                    aVar.mo198890b(1);
                } else {
                    aVar.mo198890b(0);
                }
                C58557a.m227128a(aVar.mo198925v()).mo198512a(MediaPickerView.this.f28195b, a, 233);
            }

            @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10519b
            /* renamed from: a */
            public void mo39823a(List<Photo> list, List<Photo> list2, int i, boolean z, FileSelectConfig fileSelectConfig, View view) {
                if (i < 0 || i > list.size() - 1 || list2.size() > list.size()) {
                    Log.m165382e("startPreview error position : " + i + " selectedMedias size :" + list2.size() + " localMediaList size :" + list.size());
                    return;
                }
                C10537d a = C10537d.m43634a(MediaPickerView.this.f28195b);
                a.mo39918a(233, MediaPickerView.this.f28201h);
                new C58633e.C58634a().mo198691a(new ArrayList<>(list)).mo198689a(i).mo198690a(view).mo198692a(false).mo198697b(z).mo198695b(fileSelectConfig.maxSelectImageNum).mo198696b(new ArrayList<>(list2)).mo198702e(false).mo198701d(true).mo198694a(MediaPickerView.this.f28195b, a, 233);
            }
        };
        this.f28200g = new Runnable() {
            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.RunnableC104864 */

            public void run() {
                MediaPickerView.this.mo39803a();
            }
        };
        this.f28203j = new ContentObserver(null) {
            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.C104875 */

            public void onChange(boolean z) {
                C10530d.m43611a(MediaPickerView.this.f28200g);
                C10530d.m43612a(MediaPickerView.this.f28200g, 3000);
            }
        };
        this.f28201h = new C10537d.AbstractC10538a() {
            /* class com.bytedance.ee.bear.photopicker.photo.MediaPickerView.C104886 */

            @Override // com.bytedance.ee.bear.photopicker.photo.C10537d.AbstractC10538a
            /* renamed from: a */
            public void mo39831a(int i, int i2, Intent intent) {
                if (i2 == -1 && MediaPickerView.this.f28194a != null) {
                    MediaPickerView.this.mo39804a(i2, intent);
                }
            }
        };
        m43476c();
    }
}
