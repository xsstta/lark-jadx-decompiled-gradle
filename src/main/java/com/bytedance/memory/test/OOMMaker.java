package com.bytedance.memory.test;

import com.bytedance.memory.p846b.C20066d;
import java.util.ArrayList;

public class OOMMaker {
    private static ArrayList<byte[]> sArrayList = new ArrayList<>();

    public static void createOOM() {
        while (true) {
            encreaseMem(2097152);
        }
    }

    public static void encreaseMem() {
        encreaseMem(15728640);
    }

    private static void encreaseMem(int i) {
        sArrayList.add(new byte[i]);
    }

    public static void createReachTop(int i) {
        while (C20066d.m73226a() < ((float) i)) {
            encreaseMem();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
