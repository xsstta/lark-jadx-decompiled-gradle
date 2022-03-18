package com.ss.android.lark.eetroublepet;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.eetroublebase.p1826a.C36963a;
import com.ss.android.lark.eetroublepet.entity.PET;
import com.ss.android.lark.eetroublepet.entity.Target;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.eetroublepet.a */
public class C37000a {
    /* renamed from: a */
    public static PET m146029a(String str) {
        PET pet = new PET();
        pet.topic = "toast";
        pet.infos = new HashMap();
        pet.infos.put("text", str);
        return pet;
    }

    /* renamed from: a */
    public static PET m146027a(Activity activity) {
        if (activity == null) {
            return null;
        }
        PET pet = new PET();
        pet.topic = "appear";
        pet.domainKey = C36963a.m145940a(activity);
        pet.infos = new HashMap();
        Target target = new Target();
        target.name = activity.getClass().getCanonicalName();
        target.id = activity.hashCode();
        pet.infos.put("target", target);
        return pet;
    }

    /* renamed from: a */
    public static PET m146028a(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        PET pet = new PET();
        pet.topic = "appear";
        pet.domainKey = C36963a.m145942a(fragment);
        pet.infos = new HashMap();
        Target target = new Target();
        target.name = fragment.getClass().getCanonicalName();
        target.id = fragment.hashCode();
        pet.infos.put("target", target);
        return pet;
    }
}
