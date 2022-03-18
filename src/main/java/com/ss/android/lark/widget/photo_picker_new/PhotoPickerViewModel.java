package com.ss.android.lark.widget.photo_picker_new;

import android.text.TextUtils;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0006J\u0016\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/PhotoPickerViewModel;", "", "pickerParams", "Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "(Lcom/ss/android/lark/widget/photo_picker/PickerParams;)V", "isCheckedOrigin", "", "()Z", "setCheckedOrigin", "(Z)V", "isSelectedVideo", "setSelectedVideo", "mEditPathMap", "", "", "getPickerParams", "()Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "selectablePhotoList", "", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "selectedIds", "", "getSelectablePhotoList", "", "process", "list", "putEditPath", "", "id", "editPath", "setIsSelectedVideo", "isSelectingVideo", "setSelected", "photo", "selected", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.e */
public final class PhotoPickerViewModel {

    /* renamed from: a */
    private final List<Integer> f143734a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final List<SelectablePhoto> f143735b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private volatile boolean f143736c;

    /* renamed from: d */
    private volatile boolean f143737d;

    /* renamed from: e */
    private final Map<String, String> f143738e;

    /* renamed from: f */
    private final PickerParams f143739f;

    /* renamed from: a */
    public final boolean mo197726a() {
        return this.f143736c;
    }

    /* renamed from: b */
    public final boolean mo197728b() {
        return this.f143737d;
    }

    /* renamed from: c */
    public final List<SelectablePhoto> mo197729c() {
        return mo197722a(new ArrayList(this.f143735b));
    }

    /* renamed from: a */
    public final void mo197725a(boolean z) {
        this.f143736c = z;
    }

    /* renamed from: b */
    public final void mo197727b(boolean z) {
        this.f143737d = z;
    }

    public PhotoPickerViewModel(PickerParams gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "pickerParams");
        this.f143739f = gVar;
        this.f143736c = gVar.mo198876m();
        this.f143738e = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public final List<SelectablePhoto> mo197722a(List<SelectablePhoto> list) {
        boolean z;
        String str;
        Intrinsics.checkParameterIsNotNull(list, "list");
        for (SelectablePhoto fVar : list) {
            boolean z2 = true;
            if (this.f143734a.contains(fVar.mo199589a()) != fVar.mo197737k()) {
                fVar.mo197730a(!fVar.mo197737k());
            }
            if (this.f143734a.size() != this.f143739f.mo198866c() || this.f143734a.contains(fVar.mo199589a())) {
                z = false;
            } else {
                z = true;
            }
            fVar.mo197732c(z);
            fVar.mo197734d(this.f143737d);
            if (fVar.mo197737k()) {
                str = String.valueOf(this.f143734a.indexOf(fVar.mo199589a()) + 1);
            } else {
                str = "";
            }
            if (!TextUtils.equals(fVar.mo197736j(), str)) {
                fVar.mo197733d(str);
            }
            if ((this.f143734a.isEmpty() && !this.f143739f.mo198868e()) || this.f143734a.contains(fVar.mo199589a()) || this.f143739f.mo198865b() != 3) {
                z2 = false;
            } else if (!this.f143737d) {
                z2 = fVar.mo199606h();
            }
            if (fVar.mo197738l() != z2) {
                fVar.mo197731b(z2);
            }
            String valueOf = String.valueOf(fVar.mo199589a());
            if (this.f143738e.containsKey(valueOf)) {
                if (TextUtils.isEmpty(fVar.mo197741o())) {
                    fVar.mo197735e(fVar.mo199595b());
                }
                fVar.mo199593a(this.f143738e.get(valueOf));
            }
        }
        return list;
    }

    /* renamed from: a */
    public final void mo197724a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "editPath");
        this.f143738e.put(str, str2);
    }

    /* renamed from: a */
    public final void mo197723a(SelectablePhoto fVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(fVar, "photo");
        if (!z) {
            this.f143734a.remove(fVar.mo199589a());
            int size = this.f143735b.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(this.f143735b.get(i).mo199589a(), fVar.mo199589a())) {
                    this.f143735b.remove(i);
                    return;
                }
            }
        } else if (!this.f143734a.contains(fVar.mo199589a())) {
            this.f143734a.add(fVar.mo199589a());
            this.f143735b.add(fVar);
        }
    }
}
