package com.zhang.testlib;

import android.content.Context;
import android.widget.Toast;

/**
 * @author zhang
 */
public class TestUtil {
    public static void showToast(Context context,String msg) {
        Toast.makeText(context, "--" + msg, Toast.LENGTH_SHORT).show();
    }
}
