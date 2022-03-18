package com.ss.android.lark.moments.impl.categorydetail;

import com.bytedance.lark.pb.moments.v1.Category;
import com.bytedance.lark.pb.moments.v1.CategoryStats;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÂ\u0003JC\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryDetail;", "", "id", "", "category", "Lcom/bytedance/lark/pb/moments/v1/Category;", "stats", "Lcom/bytedance/lark/pb/moments/v1/CategoryStats;", "users", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "(Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/Category;Lcom/bytedance/lark/pb/moments/v1/CategoryStats;Ljava/util/Map;)V", "admins", "", "getAdmins", "()Ljava/util/List;", "canCreatePost", "", "getCanCreatePost", "()Z", "description", "getDescription", "()Ljava/lang/String;", "iconKey", "getIconKey", "getId", "isSelfAdmin", "name", "getName", "participantCount", "", "getParticipantCount", "()J", "postCount", "getPostCount", "showAdminInfo", "getShowAdminInfo", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.g */
public final class CategoryDetail {

    /* renamed from: a */
    private final String f119125a;

    /* renamed from: b */
    private final String f119126b;

    /* renamed from: c */
    private final long f119127c;

    /* renamed from: d */
    private final long f119128d;

    /* renamed from: e */
    private final String f119129e;

    /* renamed from: f */
    private final boolean f119130f;

    /* renamed from: g */
    private final List<MomentUser> f119131g;

    /* renamed from: h */
    private final boolean f119132h;

    /* renamed from: i */
    private final boolean f119133i;

    /* renamed from: j */
    private final String f119134j;

    /* renamed from: k */
    private final Category f119135k;

    /* renamed from: l */
    private final CategoryStats f119136l;

    /* renamed from: m */
    private final Map<String, MomentUser> f119137m;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryDetail)) {
            return false;
        }
        CategoryDetail gVar = (CategoryDetail) obj;
        return Intrinsics.areEqual(this.f119134j, gVar.f119134j) && Intrinsics.areEqual(this.f119135k, gVar.f119135k) && Intrinsics.areEqual(this.f119136l, gVar.f119136l) && Intrinsics.areEqual(this.f119137m, gVar.f119137m);
    }

    public int hashCode() {
        String str = this.f119134j;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Category category = this.f119135k;
        int hashCode2 = (hashCode + (category != null ? category.hashCode() : 0)) * 31;
        CategoryStats categoryStats = this.f119136l;
        int hashCode3 = (hashCode2 + (categoryStats != null ? categoryStats.hashCode() : 0)) * 31;
        Map<String, MomentUser> map = this.f119137m;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CategoryDetail(id=" + this.f119134j + ", category=" + this.f119135k + ", stats=" + this.f119136l + ", users=" + this.f119137m + ")";
    }

    /* renamed from: a */
    public final String mo165997a() {
        return this.f119125a;
    }

    /* renamed from: b */
    public final String mo165998b() {
        return this.f119126b;
    }

    /* renamed from: c */
    public final long mo165999c() {
        return this.f119127c;
    }

    /* renamed from: d */
    public final long mo166000d() {
        return this.f119128d;
    }

    /* renamed from: e */
    public final String mo166001e() {
        return this.f119129e;
    }

    /* renamed from: f */
    public final boolean mo166003f() {
        return this.f119130f;
    }

    /* renamed from: g */
    public final List<MomentUser> mo166004g() {
        return this.f119131g;
    }

    /* renamed from: h */
    public final boolean mo166005h() {
        return this.f119132h;
    }

    public CategoryDetail(String str, Category category, CategoryStats categoryStats, Map<String, MomentUser> map) {
        String str2;
        String str3;
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        List<String> list;
        Boolean bool3;
        String str4;
        Long l;
        Long l2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f119134j = str;
        this.f119135k = category;
        this.f119136l = categoryStats;
        this.f119137m = map;
        String str5 = "";
        this.f119125a = (category == null || (str2 = category.icon_key) == null) ? str5 : str2;
        this.f119126b = (category == null || (str3 = category.name) == null) ? str5 : str3;
        long j = 0;
        this.f119127c = (categoryStats == null || (l2 = categoryStats.post_count) == null) ? 0 : l2.longValue();
        if (!(categoryStats == null || (l = categoryStats.participant_count) == null)) {
            j = l.longValue();
        }
        this.f119128d = j;
        if (!(category == null || (str4 = category.description) == null)) {
            str5 = str4;
        }
        this.f119129e = str5;
        boolean z3 = false;
        if (category == null || (bool3 = category.show_admin_info) == null) {
            z = false;
        } else {
            z = bool3.booleanValue();
        }
        this.f119130f = z;
        ArrayList arrayList = null;
        if (!(category == null || (list = category.admin_user_ids) == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                Map<String, MomentUser> map2 = this.f119137m;
                MomentUser momentUser = map2 != null ? map2.get(t) : null;
                if (momentUser != null) {
                    arrayList2.add(momentUser);
                }
            }
            arrayList = arrayList2;
        }
        this.f119131g = arrayList;
        Category category2 = this.f119135k;
        if (category2 == null || (bool2 = category2.can_create_post) == null) {
            z2 = false;
        } else {
            z2 = bool2.booleanValue();
        }
        this.f119132h = z2;
        Category category3 = this.f119135k;
        if (!(category3 == null || (bool = category3.is_self_admin) == null)) {
            z3 = bool.booleanValue();
        }
        this.f119133i = z3;
    }
}
