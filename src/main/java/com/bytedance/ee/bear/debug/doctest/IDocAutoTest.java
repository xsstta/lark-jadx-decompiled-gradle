package com.bytedance.ee.bear.debug.doctest;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/IDocAutoTest;", "", "getWhiteList", "", "", "pause", "", "resume", "setWhiteList", "types", "start", "stop", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.doctest.d */
public interface IDocAutoTest {
    List<String> getWhiteList();

    void setWhiteList(List<String> list);

    void start();

    void stop();
}
